package Programa;

import Visual.App;

public class Login {

    public static Cliente user;
    public static boolean esAnfitrion;

    public static void nuevaSesion(Cliente cliente) {
       user = cliente;
       esAnfitrion = user instanceof Anfitrion;
    }
   

    public static void updatenombre(String data) {
        if (!Validacion.validarNombre(data)) {
            return;
        }
        for (Cliente cliente : BnbMain.getClientes()) {
            if (cliente.getDni().equals(user.getDni())) {
                cliente.setNombre(data);
                return;
            }
        }
    }

    /**
     *
     * @param correo
     * @param clave
     * @return int referente a qué tipo de "persona" es.
     */
    public static int iniciarSesion(String correo, String clave) {
        boolean isHost = false;
        if (correo.equals("admin@java.bnb") && clave.equals("admin")) {
            System.out.println("Sesión iniciada como administrador");
            return 1;
        }
        for (Cliente cliente : BnbMain.getClientes()) {
            System.out.println(cliente.toString());
            isHost = (cliente instanceof Anfitrion);
            if (cliente.getCorreo().equals(correo.toLowerCase()) && cliente.getClave().equals(clave)) {
                App.sesion.nuevaSesion(cliente);
                System.out.println("Sesión iniciada por "+ App.sesion.user);
                return isHost ? 3 : 2;
            }
        }
        return 0;
    }
    
    public static void cerrarSesion(){
        user=null;
        esAnfitrion=false;
    
    }
    
        public static void registrarCliente(Cliente cliente) {
        if (Validacion.comprobarExistenciaCliente(cliente.getCorreo(), cliente.getDni(), cliente.getTelefono())) {
            return;
        }
        BnbMain.getClientes().add(cliente);
        App.sesion.nuevaSesion(cliente);
        System.out.println(cliente.toString());
    }
    

}