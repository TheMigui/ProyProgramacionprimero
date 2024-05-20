package Programa;
import java.io.Serializable;
import java.util.Objects;
public class Direccion implements Serializable {

    public Direccion(String calle, String numero, String codPostal, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
    }
    
    private String calle;

    /**
     * Get the value of calle
     *
     * @return the value of calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Set the value of calle
     *
     * @param calle new value of calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    private String numero;

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    private String codPostal;

    /**
     * Get the value of codPostal
     *
     * @return the value of codPostal
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Set the value of codPostal
     *
     * @param codPostal new value of codPostal
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    private String ciudad;

    /**
     * Get the value of ciudad
     *
     * @return the value of ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Set the value of ciudad
     *
     * @param ciudad new value of ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Direccion otraDireccion = (Direccion) obj;
        return Objects.equals(calle, otraDireccion.calle)
                && Objects.equals(numero, otraDireccion.numero)
                && Objects.equals(codPostal, otraDireccion.codPostal)
                && Objects.equals(ciudad, otraDireccion.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, numero, codPostal, ciudad);
    }

    @Override
    public String toString() {
        return "Direccion" + "calle: " + calle + ", numero: " + numero + ", codPostal: " + codPostal + ", ciudad: " + ciudad + '}';
    }
    
}
