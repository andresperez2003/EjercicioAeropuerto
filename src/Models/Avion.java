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
public class Avion extends Aeronave{
    private String id;
    private String tipoMotor;
    private double capacidadBodega;

    public Avion(String id, String tipoMotor, double capacidadBodega, String placa, String color, int capacidad, String lugarCreacion) {
        super(placa, color, capacidad, lugarCreacion);
        this.id = id;
        this.tipoMotor = tipoMotor;
        this.capacidadBodega = capacidadBodega;
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
     * @return the tipoMotor
     */
    public String getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the capacidadBodega
     */
    public double getCapacidadBodega() {
        return capacidadBodega;
    }

    /**
     * @param capacidadBodega the capacidadBodega to set
     */
    public void setCapacidadBodega(double capacidadBodega) {
        this.capacidadBodega = capacidadBodega;
    }
    
}
