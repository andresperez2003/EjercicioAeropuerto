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
public class Hangar {
    private String id;
    private LinkedList<Herramienta> misHerramientas;
    private LinkedList<Aeronave> misAeronaves;

    public Hangar(String id) {
        this.id = id;
        this.misAeronaves = new LinkedList<>();
        this.misHerramientas = new LinkedList<>();
    }

   public void crearHerramientas(Herramienta nuevaHerramienta){
       this.getMisHerramientas().add(nuevaHerramienta);
   }
  public void crearAeronaves(Aeronave nuevaAeronave){
     this.getMisAeronaves().add(nuevaAeronave);
  }
  public Helicoptero masRevoluciones (){
  Helicoptero helicoptero = null;
  int mayor = Integer.MIN_VALUE;
      for (Aeronave aeronaveActual: this.getMisAeronaves()) {
          if (aeronaveActual instanceof Helicoptero && ((Helicoptero)aeronaveActual).getNumeroRevoluciones()>mayor) {
              mayor = ((Helicoptero) aeronaveActual).getNumeroRevoluciones();
              helicoptero = ((Helicoptero)aeronaveActual);
          }
      }
  
  return helicoptero;
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

    /**
     * @return the misHerramientas
     */
    public LinkedList<Herramienta> getMisHerramientas() {
        return misHerramientas;
    }

    /**
     * @param misHerramientas the misHerramientas to set
     */
    public void setMisHerramientas(LinkedList<Herramienta> misHerramientas) {
        this.misHerramientas = misHerramientas;
    }
}
