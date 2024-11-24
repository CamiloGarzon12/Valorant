package Modelo;

public class Chaqueta extends Prenda {
    //Atributos
    private String LargoChaqueta;
    private String tipoDeChaqueta;
    private boolean esInvierno;
    private static int contadorChaqueta;
    
    //Constructor

    public Chaqueta(String LargoChaqueta, String tipoDeChaqueta, boolean esInvierno, int id, String talla, String material, String color, int cantidad, double precio) {
        super(id, talla, material, color, cantidad, precio);
        this.LargoChaqueta = LargoChaqueta;
        this.tipoDeChaqueta = tipoDeChaqueta;
        this.esInvierno = esInvierno;
    }

    
 
    
    //Metodos get y Set
    public String getLargoChaqueta() {
        return LargoChaqueta;
    }

    public void setLargoChaqueta(String LargoChaqueta) {
        this.LargoChaqueta = LargoChaqueta;
    }

    public String getTipoDeChaqueta() {
        return tipoDeChaqueta;
    }

    public void setTipoDeChaqueta(String tipoDeChaqueta) {
        this.tipoDeChaqueta = tipoDeChaqueta;
    }

    public static int getContadorChaqueta() {
        return contadorChaqueta;
    }

    public static void setContadorChaqueta() {
        Chaqueta.contadorChaqueta+=1;
    }
    
    
    
    
    //Metodo abstracto
    @Override
    public double aplicarDescuento(){
        
        double precio;
        double iva;
        double ivaInvierno;
        double descuentoCantidad;
        
            // si esInvierno es true
            if(this.esInvierno){
                
                // la cantidad supera o es igual a 4
                if(super.getCantidad()>=4){
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la chaqueta por la cantidad de chaquetas que compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las chaquetas compradas
                    ivaInvierno = precio * 0.06;                            //una adicion a pagar por si es ropa de invierno
                    descuentoCantidad = precio * 0.13;                      // un descuento por la cantidad de prendas compradas
                    precio = (precio + iva + ivaInvierno)-descuentoCantidad;
            
                }else{
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la chaqueta por la cantidad de chaquetas qeu compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las chaquetas compradas
                    ivaInvierno = precio * 0.06;                            //una adicion a pagar por si es ropa de invierno
                    precio = (precio + iva + ivaInvierno);
                }
            // si esInvierno es igual a false    
            } else{
                
                // la cantidad es igual o mayor a 6
                if(super.getCantidad()>=6){
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la chaqueta por la cantidad de chqueta qeu compra
                    descuentoCantidad = precio *0.1;                        //descuento por la cantidad de chaquetas compradas
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las chaquetas compradas
                    precio = (precio + iva)-descuentoCantidad;
                    
                }else{
                    precio = super.getPrecio() * super.getCantidad();       //precio de la chaqueta por la cantidad de chaquetas qeu compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las chaquetas compradas
                    precio = (precio + iva);
                }
            }
        return  precio;
    }

    @Override
    public String toString() {
        return "\nChaqueta{" + "Largo de Chaqueta= " + LargoChaqueta + ", tipo de Chaqueta = " + tipoDeChaqueta + ", id= "+ super.getId()+ ", Precio= "
                +super.getPrecio()+ ", Talla= "+super.getTalla()+ ", Material= "+super.getMaterial()+ ", Color= "+ super.getColor()+
                ", Cantidad= "+super.getCantidad()+'}';
    }
    
    
}
