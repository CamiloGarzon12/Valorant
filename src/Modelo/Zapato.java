package Modelo;
public class Zapato extends Prenda{
    //Atributos
    private String tipoZapato;
    private boolean esInvierno;
    private static int contadorZapato;
    
    //Constructor

    public Zapato(String tipoZapato, boolean esInvierno, int id, String talla, String material, String color, int cantidad, double precio) {
        super(id, talla, material, color, cantidad, precio); 
        this.tipoZapato = tipoZapato;
        this.esInvierno = esInvierno;
    }
    
    
    //Metodos Getter y Setter

    public String getTipoZapato() {
        return tipoZapato;
    }

    public void setTipoZapato(String tipoZapato) {
        this.tipoZapato = tipoZapato;
    }

    public boolean isEsInvierno() {
        return esInvierno;
    }

    public void setEsInvierno(boolean esInvierno) {
        this.esInvierno = esInvierno;
    }
    

    public static int getContadorZapato() {
        return contadorZapato;
    }

    public static void setContadorZapato() {
        Zapato.contadorZapato += 1;
    }
    
    
    
    
    
    //Metodos abstractos
    @Override
    public double aplicarDescuento(){
        double precio;
        double iva;
        double ivaInvierno;
        double descuentoCantidad;
            
            //si esInvierno es true
            if(this.esInvierno){
                
                //la cantidad es igual o mayor a 2
                if(super.getCantidad()>=2){
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la zapato por la cantidad de zapatos que compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las zapatos compradas
                    ivaInvierno = precio * 0.06;                            //una adicion a pagar por si es ropa de invierno
                    descuentoCantidad = precio * 0.15;                      // un descuento por la cantidad de prendas compradas
                    precio = (precio + iva + ivaInvierno)-descuentoCantidad;
                    
                }else{
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la zapatos por la cantidad de zapatos qeu compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las zapatos compradas
                    ivaInvierno = precio * 0.06;                            //una adicion a pagar por si es ropa de invierno
                    precio = (precio + iva + ivaInvierno);
                }
            // si EsInviero es false    
            } else{
                
                //la cantidad es mayor o igual a 5
                if(super.getCantidad()>=4){
                    
                    precio = super.getPrecio() * super.getCantidad();       //precio de la zapato por la cantidad de zapato qeu compra
                    descuentoCantidad = precio *0.1;                        //descuento por la cantidad de zapatos compradas
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las zapatos compradas
                    precio = (precio + iva)-descuentoCantidad;
                    
                }else{
                    precio = super.getPrecio() * super.getCantidad();       //precio de la zapato por la cantidad de zapatos qeu compra
                    iva = precio * 0.19;                                    //el iva que se debe pagar por las zapatos compradas
                    precio = (precio + iva);
                }
            }
        return  precio;
    }
    
    //

    @Override
    public String toString() {
        return "\n Zapato{" + "tipo de Zapato=" + tipoZapato+ ", id= "+ super.getId()+ ", Precio= "
                +super.getPrecio()+ ", Talla= "+super.getTalla()+ ", Material= "+super.getMaterial()+ ", Color= "+ super.getColor()+
                ", Cantidad= "+super.getCantidad()+'}';
    }
    
    
    
}
