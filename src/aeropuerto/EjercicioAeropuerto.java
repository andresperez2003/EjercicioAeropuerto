/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aeropuerto;

import Models.Aeropuerto;
import Models.Avion;
import Models.Hangar;
import Models.Helicoptero;
import Models.Herramienta;
import Models.Multimillonario;
import Models.ProgramacionVuelo;
import Models.Ultraligero;
import Models.Viajero;

/**
 *
 * @author User
 */
public class EjercicioAeropuerto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creacion de Objetos
        
        Aeropuerto laDorada = new Aeropuerto("01");
        
        laDorada.crearHangar("01a");
        laDorada.crearHangar("02b");
        laDorada.crearHangar("03c");
        laDorada.crearHangar("04d");
        laDorada.crearHangar("05e");
        
        
        Herramienta herramienta1 = new Herramienta("01", 5);
        Herramienta herramienta2 = new Herramienta("02", 8);
        Herramienta herramienta3 = new Herramienta("03", 12);
        Herramienta herramienta4 = new Herramienta("04", 16);
        Herramienta herramienta5 = new Herramienta("05", 4);
        
        Helicoptero helicopter01 = new Helicoptero("01", 20, "001", "Rojo", 50, "Belgica");
        Helicoptero helicopter02 = new Helicoptero("02", 40, "002", "Azul", 20, "Portugal");
        Helicoptero helicopter03 = new Helicoptero("03", 25, "003", "Rojo", 80, "Brasil");
        
        Ultraligero ultraligero1 = new Ultraligero("04", 60, "004", "Blanco", 40, "EEUU");
        Ultraligero ultraligero2 = new Ultraligero("05", 68, "005", "Negro", 44, "Canada");
        
        Avion avion1 = new Avion("06", "En linea", 50.2, "006", "Rosado", 40, "Irlanda");
        Avion avion2 = new Avion("07", "Rotativo", 65.3, "007", "Verde", 40, "Inglaterra");
        Avion avion3 = new Avion("08", "Radial", 71.4, "008", "Azul", 40, "Grecia");
        Avion avion4 = new Avion("09", "En linea", 64.2, "009", "Negro", 40, "Colombia");
        
        laDorada.crearViajero("001", "Andres", "Colombia", 19);
        laDorada.crearViajero("002", "Juan", "Brasil", 30);
        laDorada.crearViajero("003", "Salome", "Canada", 54);
        laDorada.crearViajero("004", "Maria", "Marruecos", 32);
        laDorada.crearViajero("005", "Carlos", "Albania", 65);
        laDorada.crearViajero("006", "Julia", "Groenlandia", 50);
        
        laDorada.crearMultimillonario("007", "AB01", "007", "Marco", "Argentina", 25);
        laDorada.crearMultimillonario("008", "AB02", "008", "Mario", "Portugal", 40);
        laDorada.crearMultimillonario("009", "AB03", "009", "Alex", "Arabia Saudita", 62);
        
        ProgramacionVuelo programacion1 = new ProgramacionVuelo("01", "05/12/2022", "02:00");
        ProgramacionVuelo programacion2 = new ProgramacionVuelo("02", "06/10/2022", "03:00");
        ProgramacionVuelo programacion3 = new ProgramacionVuelo("03", "20/11/2022", "04:00");
        ProgramacionVuelo programacion4 = new ProgramacionVuelo("04", "08/08/2022", "02:30");
        ProgramacionVuelo programacion5 = new ProgramacionVuelo("05", "30/12/2022", "02:00");
        ProgramacionVuelo programacion6 = new ProgramacionVuelo("06", "04/09/2022", "05:00");
        ProgramacionVuelo programacion7 = new ProgramacionVuelo("07", "07/08/2022", "02:00");
        ProgramacionVuelo programacion8 = new ProgramacionVuelo("08", "05/12/2022", "09:00");
        ProgramacionVuelo programacion9 = new ProgramacionVuelo("09", "01/07/2022", "02:00");
        
        
     
        }
          
      }
    

