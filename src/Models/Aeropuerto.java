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

    public Aeropuerto(String id) {
        this.id = id;
        this.misHangares = new LinkedList<>();
        this.misViajeros = new LinkedList<>();
    }

  
    

    public void crearHangar(String id){
        Hangar nuevoHangar = new Hangar(id);
        this.getMisHangares().add(nuevoHangar);
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
    
    public Avion avionMenosCapacidadBodega(){
    Avion avion = null;
    double mayor = Double.MAX_VALUE;
        for (Hangar hangarActual : this.getMisHangares()) {
            double masCapacidad = hangarActual.avionMenosCapacidad().getCapacidadBodega();
            if (masCapacidad< mayor) {
                mayor= hangarActual.avionMenosCapacidad().getCapacidadBodega();
                avion= hangarActual.avionMenosCapacidad();
            }
        }
    
    return avion;
    }
    
    public double promedioPesoUltraligero (){
        double suma = 0.0;
        double promedio = 0.0;
        int contador = this.getMisHangares().size();
        for (Hangar hangarActual : this.getMisHangares()) {
            suma+= hangarActual.promedioPeso();
        }
        promedio= suma/ contador;
    return promedio;
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
    
}
