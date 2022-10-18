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
public class Aeropuerto {
    private String id;
    private LinkedList<Hangar> misHangares = new LinkedList<>();
    private LinkedList<Viajero> misViajeros = new LinkedList<>();
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    public Aeropuerto(String id) {
        this.id = id;
        this.misHangares = new LinkedList<>();
        this.misViajeros = new LinkedList<>();
    }

    public void crearHangar(String id){
        Hangar nuevoHangar = new Hangar(id);
        this.getMisHangares().add(nuevoHangar);
    }
    public void crearViajero (String id, String numCuenta, String cedula, String nombre, String nacionalidad, int edad){
     Viajero nuevoViajero = new  Multimillonario(id, numCuenta, cedula, nombre, nacionalidad, edad);
     this.getMisViajeros().add(nuevoViajero);
    }
    
    public int  cantidadMillonarios(){
    int respuesta =0;
        for (Viajero viajeroActual: this.getMisViajeros()) {
            if (viajeroActual  instanceof Multimillonario) {
                respuesta+=1;
            }
        }        
    return respuesta;
    }
    public Multimillonario buscarMultimillonario (String cedula){
        Multimillonario multimillonario = null;
        for (Viajero multimillonarioActual: this.getMisViajeros()) {
            if (multimillonarioActual instanceof Multimillonario && multimillonarioActual.getCedula() == cedula) {
                multimillonario = ((Multimillonario)multimillonarioActual);
            }
        }       
        return multimillonario;
    }
    public Viajero viajeroMasVuelos(){
    Viajero viajero = null;
    int mayor =Integer.MIN_VALUE;
        for (Viajero viajeroActual: this.getMisViajeros()) {
            if (viajeroActual.getMisVuelos().size() > mayor) {
                mayor= viajeroActual.getMisVuelos().size();
                viajero = viajeroActual;
            }
        }
    
    return viajero;
    }
    public Helicoptero helicopterMenosRevoluciones(){
    Helicoptero helicoptero= null;
    int mayor = Integer.MIN_VALUE;
        for (Hangar hangarActual: this.getMisHangares() ) {
            int revoluciones = hangarActual.masRevoluciones().getNumeroRevoluciones();
            if (revoluciones > mayor) {
                mayor= revoluciones;
                helicoptero = hangarActual.masRevoluciones();
            }
        }
    
    
    return helicoptero;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the misHangares
     */
    public LinkedList<Hangar> getMisHangares() {
        return misHangares;
    }

    /**
     * @param misHangares the misHangares to set
     */
    public void setMisHangares(LinkedList<Hangar> misHangares) {
        this.misHangares = misHangares;
    }

    /**
     * @return the misViajeros
     */
    public LinkedList<Viajero> getMisViajeros() {
        return misViajeros;
    }

    /**
     * @param misViajeros the misViajeros to set
     */
    public void setMisViajeros(LinkedList<Viajero> misViajeros) {
        this.misViajeros = misViajeros;
    }
    
}
