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
public class Herramienta {
    private String id;
    private int numPiezas;

    public Herramienta(String id, int numPiezas) {
        this.id = id;
        this.numPiezas = numPiezas;
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
     * @return the numPiezas
     */
    public int getNumPiezas() {
        return numPiezas;
    }

    /**
     * @param numPiezas the numPiezas to set
     */
    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }
}
