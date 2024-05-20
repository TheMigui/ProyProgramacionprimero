package Programa;
import java.io.Serializable;
import java.time.LocalDate;
public class Tarjeta implements Serializable {
    
    private String numTarjeta;

    /**
     * Get the value of numTarjeta
     *
     * @return the value of numTarjeta
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Set the value of numTarjeta
     *
     * @param numTarjeta new value of numTarjeta
     */
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    private int mes;

    /**
     * Get the value of mes
     *
     * @return the value of mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * Set the value of mes
     *
     * @param mes new value of mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    private int dia;

    /**
     * Get the value of dia
     *
     * @return the value of dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Set the value of dia
     *
     * @param dia new value of dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    private int anno;

    /**
     * Get the value of anno
     *
     * @return the value of anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * Set the value of anno
     *
     * @param anno new value of anno
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    private String titular;

    /**
     * Get the value of titular
     *
     * @return the value of titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set the value of titular
     *
     * @param titular new value of titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    private double saldo;

    /**
     * Get the value of saldo
     *
     * @return the value of saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Set the value of saldo
     *
     * @param saldo new value of saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String cvv;

    /**
     * Get the value of cvv
     *
     * @return the value of cvv
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Set the value of cvv
     *
     * @param cvv new value of cvv
     */
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    private LocalDate fechaCaducidad;

    /**
     * Get the value of fechaCaducidad
     *
     * @return the value of fechaCaducidad
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Set the value of fechaCaducidad
     *
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = LocalDate.of(anno, mes, dia);
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numTarjeta=" + numTarjeta + ", mes=" + mes + ", dia=" + dia + ", anno=" + anno + ", titular=" + titular + ", saldo=" + saldo + ", cvv=" + cvv + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

}
