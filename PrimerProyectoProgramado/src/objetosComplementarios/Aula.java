/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */

//Class name: "Aula"
//Every single classroom has a name, a number, a ubicacion and a capacidad.
public class Aula {
    private String nombreAula;
    private int numeroClase;
    private String ubicacion;
    private int capacidad;

    public Aula(String nombreAula, int numeroClase, String ubicacion, int capacidad) {
        this.nombreAula = nombreAula;
        this.numeroClase = numeroClase;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }
    
    //Sets the clasroom's name
    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }
    
    //Returns the clasroom's name
    public String getNombreAula() {
        return nombreAula;
    }
    
    
    //Sets the clasroom's number
    public void setNumeroClase(int numeroClase) {
        this.numeroClase = numeroClase;
    }
    
    //Returns the clasroom's number
    public int getNumeroClase() {
        return numeroClase;
    }
    
    //Returns the clasroom's location
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    //Returns the clasroom's location
    public String getUbicacion() {
        return ubicacion;
    }
    
    //Returns the clasroom's capacity
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    //Returns the clasroom's capacity
    public int getCapacidad() {
        return capacidad;
    }
  
}
