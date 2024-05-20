package Programa;

import java.io.Serializable;

public class InfoInmuebles implements Serializable {

    public InfoInmuebles(int maxResidentes, int numHabitaciones, int numCamas, int numToilet) {
        this.maxResidentes = maxResidentes;
        this.numHabitaciones = numHabitaciones;
        this.numCamas = numCamas;
        this.numToilet = numToilet;
    }
    
    private int maxResidentes;

    /**
     * Get the value of MaximoResidentes
     *
     * @return the value of MaximoResidentes
     */
    public int getMaximoResidentes() {
        return maxResidentes;
    }

    /**
     * Set the value of MaximoResidentes
     *
     * @param MaximoResidentes new value of MaximoResidentes
     */
    public void setMaximoResidentes(int MaximoResidentes) {
        this.maxResidentes = MaximoResidentes;
    }

    private int numHabitaciones;

    /**
     * Get the value of numHabitaciones
     *
     * @return the value of numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Set the value of numHabitaciones
     *
     * @param numHabitaciones new value of numHabitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    private int numCamas;

    /**
     * Get the value of numCamas
     *
     * @return the value of numCamas
     */
    public int getNumCamas() {
        return numCamas;
    }

    /**
     * Set the value of numCamas
     *
     * @param numCamas new value of numCamas
     */
    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    private int numToilet;

    /**
     * Get the value of numToilet
     *
     * @return the value of numToilet
     */
    public int getNumToilet() {
        return numToilet;
    }

    /**
     * Set the value of numToilet
     *
     * @param numToilet new value of numToilet
     */
    public void setNumToilet(int numToilet) {
        this.numToilet = numToilet;
    }

    @Override
    public String toString() {
        return "En este inmueble" + "pueden estar hasta" + maxResidentes + " residentes, tiene " + numHabitaciones + "habitaciones con " + numCamas + "camas. Incluye " + numToilet + "baños";
    }


}
