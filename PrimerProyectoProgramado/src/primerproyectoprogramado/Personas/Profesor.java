/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primerproyectoprogramado.Personas;

import objetosComplementarios.Departamento;
import objetosComplementarios.Schedule;


/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */

//Class named: "Profesor"
//Every teacher has a name, an ID, a department to which it belongs and his schedule.
public class Profesor {
    private String nombre;
    private int ID;
    private Departamento nombre_departamento;

    public Profesor(String  nombre_depa,String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
        nombre_departamento = new Departamento( nombre_depa);
        
    }

    //Sets the teacher's name
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Returns the teacher's name
    public String getNombre() {
        return nombre;
    }
    
    //Sets the teacher's ID
    public void setID(int ID) {
        this.ID = ID;
    }
    
    //Returns the teacher's ID
    public int getID() {
        return ID;
    }

    //Returns the department to which it belongs
    public Departamento getNombreDepartamento() {
        return nombre_departamento;
    }
    
    //Sets the department to which it belongs
    public void setApartment_name(String nombre_depa) {
        this.nombre_departamento = nombre_departamento;
    }
}