package taller7;
//CLASE PADRE CON ATRIBUTOS Y METODOS QUE HEREDARAN CD - DVD - LP
public class Discos {
protected int co;
protected String se;
protected String au;

        public void Discos(){
        }
    
    public void setCo(int co) {
        this.co = co;
    }

    public void setSe(String se) {
        this.se = se;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public int getCo() {
        return co;
    }

    public String getSe() {
        return se;
    }

    public String getAu() {
        return au;
    }

        
}
