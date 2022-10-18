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
public class Multimillonario extends Viajero {
    private String id;
    private String numCuenta;
    private LinkedList<Aeronave> misAeronaves;

    public Multimillonario(String id, String numCuenta, String cedula, String nombre, String nacionalidad, int edad) {
        super(cedula, nombre, nacionalidad, edad);
        this.id = id;
        this.numCuenta = numCuenta; 
        this.misAeronaves = new LinkedList<>();
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
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the misAeronaves
     */
    public LinkedList<Aeronave> getMisAeronaves() {
        return misAeronaves;
    }

    /**
     * @param misAeronaves the misAeronaves to set
     */
    public void setMisAeronaves(LinkedList<Aeronave> misAeronaves) {
        this.misAeronaves = misAeronaves;
    }
    
}
