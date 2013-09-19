/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */

//Abstract class name: "Asignatura"
// Every subject has a name and a number of credits
public  abstract class Asignatura {
    private String nombre_asig;
    private int creditos;

    public Asignatura(String nombre_asig, int creditos) {
        this.nombre_asig = nombre_asig;
        this.creditos = creditos;
    }
    
    //Sets the subject's name
    public void setNombreAsig(String nombre_asig) {
        this.nombre_asig = nombre_asig;
    }
    //Returns the subject's name
    public String getNombreAsig() {
        return nombre_asig;
    }

    //Sets the subject's credits
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    //Returns the subject's credits
    public int getCreditos() {
        return creditos;
    }
    
}
