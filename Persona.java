package taller7;

import javax.swing.JOptionPane;

public class Persona extends Mamifero{
protected String nombre;
protected String religion;
protected String amiga;

    public void Persona(){
    }
    public void setNombrePERSONA(String n){
    this.nombre=n;
    }
    public void setReligionPERSONA(String r){
    this.religion=r;
    }
    
    public String getReligionPERSONA(){
    return religion;
    }
    public String getNombrePERSONA(){
    return nombre;
    }
    
    public int getEdadMamifero(){
    return super.getEdad();
    }
    public String getAmiga(){
    return amiga;
    }
}
