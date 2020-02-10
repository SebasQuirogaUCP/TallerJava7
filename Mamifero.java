package taller7;

import javax.swing.JOptionPane;

public class Mamifero {
    
protected int edad;

    public void Manifero(){
    }
    //OVERLOADING
    public void setEdad(int e){
        System.out.println("DESDE CLASE PADRE MAMIFERO");
        this.edad=e;
    }
    
    public int getEdad(){
        System.out.println("DESDE CLASE PADRE MAMIFERO");
        System.out.println("DESDE CLASE MAMIFERO HERENDANDO EDAD");
        return edad;
    }
    
    
    
}
