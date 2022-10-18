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
public abstract class Viajero {
    private String cedula;
    private String  nombre;
    private String nacionalidad;
    private int edad;
    private LinkedList<ProgramacionVuelo> misVuelos;

    public Viajero(String cedula, String nombre, String nacionalidad, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.misVuelos = new LinkedList<>();
    }

    
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the misVuelos
     */
    public LinkedList<ProgramacionVuelo> getMisVuelos() {
        return misVuelos;
    }

    /**
     * @param misVuelos the misVuelos to set
     */
    public void setMisVuelos(LinkedList<ProgramacionVuelo> misVuelos) {
        this.misVuelos = misVuelos;
    }
}
