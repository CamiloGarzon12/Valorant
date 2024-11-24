package Modelo;
public class Camisa extends Prenda {
    //Atributos
    private String manga;
    private String tipoDeCuello;
    private static int contadorCamisa;
    
    //Constructor

    public Camisa(String manga, String tipoDeCuello, int id, String talla, String material, String color, int cantidad, double precio) {
        super(id, talla, material, color, cantidad, precio);
        this.manga = manga;
        this.tipoDeCuello = tipoDeCuello;
    }

   //Metodos get y set
    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getTipoDeCuello() {
        return tipoDeCuello;
    }

    public void setTipoDeCuello(String tipoDeCuello) {
        this.tipoDeCuello = tipoDeCuello;
    }
    
    
    //Metodos gett y set para contador Camisas
    public static int getContadorCamisa() {
        return contadorCamisa;
    }

    public static void setContadorCamisa() {
        Camisa.contadorCamisa +=1;
    }
    
    // metodo abstracto
    @Override
    public double aplicarDescuento(){
        double precio;
        double iva;
        double descuentoManga;
        double descuentoCantidad;
        
            if(super.getCantidad() >= 8){    
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la camisa por la cantidad de camisa qeu compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las camisas compradas
                    descuentoCantidad = precio * 0.15;                      // un descuento por la cantidad de prendas compradas
                    precio = (precio + iva)-descuentoCantidad;
            
                    }else{
                
                        if(this.manga.equalsIgnoreCase("Corta")){
                            precio = super.getPrecio() * super.getCantidad();       //precio de la camisa por la cantidad de camisa qeu compra
                            descuentoManga = precio * 0.1;                          //descuento por si la manga de la camisa es corta
                            iva = precio * 0.19;                                    //el iva que se debe pagar por las camisas compradas
                            precio = (precio + iva)-descuentoManga;
                            
                    }else{
                            precio = super.getPrecio() * super.getCantidad();       //precio de la camisa por la cantidad de camisa qeu compra
                            iva = precio * 0.19;                                    //el iva que se debe pagar por las camisas compradas
                            precio = (precio + iva); 
                        }
            } 
           
        return  precio;       
    }

    @Override
    public String toString() {
        return "\n Camisa{"+ "manga=" + manga + ", tipoDeCuello=" + tipoDeCuello +", id= "+ super.getId()+ ", Talla= "+super.getTalla()+ ", Material= "+super.getMaterial()+ ", Color= "+ super.getColor()+
                ", Precio= "+super.getPrecio()+ ", Cantidad= "+super.getCantidad()+", Total a pagar= "+this.aplicarDescuento()+'}';
    }
    
    
    
    
    
    

  
    
}
