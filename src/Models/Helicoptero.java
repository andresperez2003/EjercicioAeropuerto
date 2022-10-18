/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author User
 */
public class Helicoptero extends Aeronave {
    private String id;
    private int numeroRevoluciones;

    public Helicoptero(String id, int numeroRevoluciones, String placa, String color, int capacidad, String lugarCreacion) {
        super(placa, color, capacidad, lugarCreacion);
        this.id = id;
        this.numeroRevoluciones = numeroRevoluciones;
    }

    
   
    
    

    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the numeroRevoluciones
     */
    public int getNumeroRevoluciones() {
        return numeroRevoluciones;
    }

    /**
     * @param numeroRevoluciones the numeroRevoluciones to set
     */
    public void setNumeroRevoluciones(int numeroRevoluciones) {
        this.numeroRevoluciones = numeroRevoluciones;
    }
}
