/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas
 */
//Class name: "Equipos"
//Every single equipment has a name
public class Equipos {
   private String nombreEquipo;

    public Equipos(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    //Sets the equipment's name
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    //Returns the equipment's name
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
}
