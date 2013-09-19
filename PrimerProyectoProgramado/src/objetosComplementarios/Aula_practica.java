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

// Class name: "Aula_practica" which extends from "Aula"
public class Aula_practica {
    private int cantidadEquipo;//equipment amount
    LinkedList<Equipos> listE;//Equipment's list available 

    public Aula_practica(int cantidadEquipo,String nombreEquipo) {
        this.cantidadEquipo = cantidadEquipo;
        listE = new LinkedList<Equipos>(nombreEquipo);
    }

}
/// ***************NOT FINISHED****************