/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */
//Class name: "OS" os=operating system
//Every single OS has a name
public class OS {
    private String nombreOS;

    public OS(String nombreOS) {
        this.nombreOS = nombreOS;
    }
    
    //Returns the OS's name
    public String getNombreOS() {
        return nombreOS;
    }
    //Sets the OS's name
    public void setNombreOS(String nombreOS) {
        this.nombreOS = nombreOS;
    }
}
