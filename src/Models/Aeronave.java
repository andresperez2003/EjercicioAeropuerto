/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public abstract class Aeronave {
    private String placa;
    private String color;
    private int capacidad;
    private String lugarCreacion;
    private LinkedList<ProgramacionVuelo> misVuelosAvion;
    public Aeronave(String placa, String color, int capacidad, String lugarCreacion) {
        this.placa = placa;
        this.color = color;
        this.capacidad = capacidad;
        this.lugarCreacion = lugarCreacion;
        this.misVuelosAvion = new LinkedList<>();
    }
 
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the lugarCreacion
     */
    public String getLugarCreacion() {
        return lugarCreacion;
    }

    /**
     * @param lugarCreacion the lugarCreacion to set
     */
    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }

    /**
     * @return the misVuelosAvion
     */
    public LinkedList<ProgramacionVuelo> getMisVuelosAvion() {
        return misVuelosAvion;
    }

    /**
     * @param misVuelosAvion the misVuelosAvion to set
     */
    public void setMisVuelosAvion(LinkedList<ProgramacionVuelo> misVuelosAvion) {
        this.misVuelosAvion = misVuelosAvion;
    }

 
}
