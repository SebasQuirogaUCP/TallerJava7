package taller7;

public class ProductoFresco extends Producto{
private String fechaProductoFRESCO;
private String paisPRODUCTOFRESCO;

    public void ProductoFresco(){
    }   
    public void setFechaPRODUCTOFRESCO(String a){
        this.fechaProductoFRESCO=a;
    }
    public String getFechaPRODUCTOFRESCO(){
    return fechaProductoFRESCO;
    }
    public void setPaisPRODUCTOFRESCO(String c){
    this.paisPRODUCTOFRESCO=c;
    }
    public String getPaisPRODUCTOFRESCO(){
    return paisPRODUCTOFRESCO;
    }
    
}
