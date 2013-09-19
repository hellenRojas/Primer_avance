/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

import java.util.LinkedList;

/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */
// Class name: "Asignatura_teorica" which extends from "Asignatura"
//Every "Asignatura_teorica" has a web page
public class Asignatura_teorica extends Asignatura {
    private String paginaWeb;

    public Asignatura_teorica(String paginaWeb, String nombre_asig, int creditos) {
        super(nombre_asig, creditos);
        this.paginaWeb = paginaWeb;
    }
    //Sets the Asignatura_teorica's web page
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    //Returns the Asignatura_teorica's web page
    public String getPaginaWeb() {
        return paginaWeb;
    }
    
    
}
