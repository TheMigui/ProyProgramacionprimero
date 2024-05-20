package Programa;

import java.io.Serializable;

public class Factura implements Serializable {

    public Factura(int facturaID, double importe, String tema, String fecha, String hora, String reservaID, InfoInmuebles infoinmueble, String dniAnfitrion, String dniCLiente) {
        this.facturaID = facturaID;
        this.importe = importe;
        this.tema = tema;
        this.fecha = fecha;
        this.hora = hora;
        this.reservaID = reservaID;
        this.infoinmuebles = infoinmueble;
        this.dniAnfitrion = dniAnfitrion;
        this.dniCLiente = dniCLiente;
    }
    
    private int facturaID;

    /**
     * Get the value of facturaID
     *
     * @return the value of facturaID
     */
    public int getFacturaID() {
        return facturaID;
    }

    /**
     * Set the value of facturaID
     *
     * @param facturaID new value of facturaID
     */
    public void setFacturaID(int facturaID) {
        this.facturaID = facturaID;
    }

    private double importe;

    /**
     * Get the value of importe
     *
     * @return the value of importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Set the value of importe
     *
     * @param importe new value of importe
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    private String tema;

    /**
     * Get the value of tema
     *
     * @return the value of tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * Set the value of tema
     *
     * @param tema new value of tema
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    private String fecha;

    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Set the value of fecha
     *
     * @param fecha new value of fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String hora;

    /**
     * Get the value of hora
     *
     * @return the value of hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Set the value of hora
     *
     * @param hora new value of hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    private String reservaID;

    /**
     * Get the value of reservaID
     *
     * @return the value of reservaID
     */
    public String getReservaID() {
        return reservaID;
    }

    /**
     * Set the value of reservaID
     *
     * @param reservaID new value of reservaID
     */
    public void setReservaID(String reservaID) {
        this.reservaID = reservaID;
    }

    private InfoInmuebles infoinmuebles;

  

    private String dniAnfitrion;

    /**
     * Get the value of dniAnfitrion
     *
     * @return the value of dniAnfitrion
     */
    public String getDniAnfitrion() {
        return dniAnfitrion;
    }

    /**
     * Set the value of dniAnfitrion
     *
     * @param dniAnfitrion new value of dniAnfitrion
     */
    public void setDniAnfitrion(String dniAnfitrion) {
        this.dniAnfitrion = dniAnfitrion;
    }

    private String dniCLiente;

    /**
     * Get the value of dniCLiente
     *
     * @return the value of dniCLiente
     */
    public String getDniCLiente() {
        return dniCLiente;
    }

    /**
     * Set the value of dniCLiente
     *
     * @param dniCLiente new value of dniCLiente
     */
    public void setDniCLiente(String dniCLiente) {
        this.dniCLiente = dniCLiente;
    }

}
