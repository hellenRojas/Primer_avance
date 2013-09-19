/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas
 */

//Class name: "Departamento".
// Useful for setting the name of every single department.
// Every teacher belongs to one of them.
public class Departamento {
    private String nombre_depa;

    public Departamento(String nombre_depa) {
        this.nombre_depa = nombre_depa;
    }
    // Sets the Department's name.
    public void setNombre_depa(String nombre_depa) { 
    this.nombre_depa = nombre_depa;
    }
    // Returns the department's name.
    public String getNombre_depa() { 
        return nombre_depa;
    }


}
