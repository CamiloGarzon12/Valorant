package Modelo;


public class Pantalon extends Prenda {
    //Atributos
    private String largo;
    private String tipoDeCintura;
    private static int contadorPantalon;
    
    //constructores

    public Pantalon(String largo, String tipoDeCintura, int id, String talla, String material, String color, int cantidad, double precio) {
        super(id, talla, material, color, cantidad, precio);
        this.largo = largo;
        this.tipoDeCintura = tipoDeCintura;
    }

    
    
    //Metodos Setter y Getter
    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getTipoDeCintura() {
        return tipoDeCintura;
    }

    public void setTipoDeCintura(String tipoDeCintura) {
        this.tipoDeCintura = tipoDeCintura;
    }
        

    public static int getContadorPantalon() {
        return contadorPantalon;
    }

    public static void setContadorPantalon() {
        Pantalon.contadorPantalon +=1;
    }
    
    
    
    //Metodo abstracto
    @Override
    public double aplicarDescuento(){
        double precio;
        double iva;
        double descuentoPrecio;
        
        precio = super.getPrecio() * super.getCantidad();
        if(precio>=150000){
            iva = precio * 0.19;
            descuentoPrecio = precio * 0.15;
            precio = (precio+iva) - descuentoPrecio;
            
        }else{
            iva = precio * 0.19;
            precio = (precio+iva);
        }
            
       return precio; 
        
    }
    
    //ToString

    @Override
    public String toString() {
        return "\n Pantalon{" + " El largo del pantalon= " +this.largo  + ", Tipo de Cintura= " + this.tipoDeCintura +", id= "+ super.getId()+ ", Precio= "
                +super.getPrecio()+ ", Talla= "+super.getTalla()+ ", Material= "+super.getMaterial()+ ", Color= "+ super.getColor()+
                ", Cantidad= "+super.getCantidad()+'}';
    }
    
}
