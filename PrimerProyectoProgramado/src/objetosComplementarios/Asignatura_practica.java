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
// Class name: "Asignatura_practica" which extends from "Asignatura"
public class Asignatura_practica extends Asignatura{
         LinkedList<Material_Apoyo> listA;//support material list
          LinkedList<OS> listOS;//operating system list

    public Asignatura_practica(String nombre_asig, int creditos) {
        super(nombre_asig, creditos);
        listA = new LinkedList<Material_Apoyo>();
        listOS = new LinkedList<OS>(); //OS operating system
    }
    
    //Sets the support material's list
    public void setListA(LinkedList<Material_Apoyo> listA) {
        this.listA = listA;
    }
    
    //Returns the support material's list
    public LinkedList<Material_Apoyo> getListA() {
        return listA;
    }
    
    //Sets the operating system's list
    public void setListOS(LinkedList<OS> listOS) {
        this.listOS = listOS;
    }
    
    //Returns the operating system's list
    public LinkedList<OS> getListOS() {
        return listOS;
    }
}


//*******NOT FINISHED************
