package taller7;

import javax.swing.JOptionPane;

public class Masculino extends Persona{
protected String Univesidad;

    public void Masculino(){
    }
    
    public void setUniversidad(String u){
        this.Univesidad=u;
    }
    
    public String getUniversidad(){
    return Univesidad;
    }
    public String getNombre(){
        return super.getNombrePERSONA();
    }
    public int getEdadMamifero(){
    return super.getEdad();
    }
    public String getReligion(){
    return super.getReligionPERSONA();
    }
}
