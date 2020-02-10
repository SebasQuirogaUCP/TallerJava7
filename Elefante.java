package taller7;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.xml.transform.Source;

public class Elefante extends Mamifero{
    
Scanner tx = new Scanner(System.in);    
protected String especie;

    public void Elefante(){
    }
    
    public void setEspecie(String es){    
    this.especie=es;
    }
    
    public String getEspecieElefante(){
    return especie;
    }
    
    public int getEdadMamifero(){
    return super.getEdad();
    
    }
    
}
