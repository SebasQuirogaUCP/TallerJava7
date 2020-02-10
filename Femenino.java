package taller7;

import javax.swing.JOptionPane;

public class Femenino extends Persona{
protected String amiga;

    public void Femenino(){
    }
    
    public void setAmiga(String a){
    this.amiga=a;
    }
    public String getAmiga(){
    return amiga;
    }
    public int getEdad(){
    return super.getEdad();
    }
    
    public String getReligion(){
    return super.getReligionPERSONA();
    }
    public String getNombre(){
    return super.getNombrePERSONA();
    }
}
