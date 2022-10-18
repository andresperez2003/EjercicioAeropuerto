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
public class ProgramacionVuelo {
    private String  id;
    private String fecha;
    private String hora;
    private Aeronave miAeronave;
    private Viajero miViajero;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the miAeronave
     */
    public Aeronave getMiAeronave() {
        return miAeronave;
    }

    /**
     * @param miAeronave the miAeronave to set
     */
    public void setMiAeronave(Aeronave miAeronave) {
        this.miAeronave = miAeronave;
    }

    /**
     * @return the miViajero
     */
    public Viajero getMiViajero() {
        return miViajero;
    }

    /**
     * @param miViajero the miViajero to set
     */
    public void setMiViajero(Viajero miViajero) {
        this.miViajero = miViajero;
    }
}
