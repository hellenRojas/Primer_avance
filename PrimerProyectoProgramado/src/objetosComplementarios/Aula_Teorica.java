/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosComplementarios;

/**
 *
 * @author Hellen Rojas and Laurenth Chaves
 */

// Class name: "Aula_teorica" which extends from "Aula"
// bool air conditioner and multimedia equipment
public class Aula_Teorica extends Aula{
    private boolean aireAcondicionado;
    private boolean equipoMultimedia;

    public Aula_Teorica(boolean aireAcondicionado, boolean equipoMultimedia, 
            String nombreAula, int numeroAula, String ubicacion, int capacidad) {
        super(nombreAula, numeroAula, ubicacion, capacidad);
        this.aireAcondicionado = aireAcondicionado;
        this.equipoMultimedia = equipoMultimedia;
    }
    
    //Returns true/false is there's an air conditioner in the classroom
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    
    //Sets if there's an air conditioner in the classroom by a boolean true/false
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    
    //Returns true/false is there's a multimedia equipment in the classroom
    public boolean isMultimediaEquipment() {
        return equipoMultimedia;
    }
    
    //Sets if there's a multimedia equipment in the classroom by a boolean true/false
    public void setEquipoMultimedia(boolean equipoMultimedia) {
        this.equipoMultimedia = equipoMultimedia;
    }
    
    

   
}
