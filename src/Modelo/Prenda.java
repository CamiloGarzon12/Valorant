package Modelo;

import java.util.ArrayList;

public abstract class Prenda {
    //Atributos
    
    private int id;
    private String talla;
    private String material;
    private String color;
    private int cantidad;
    private double precio;
    private static int contadorPrenda;
    private static ArrayList<Prenda> prendas = new ArrayList();
    
    //Constructor

    public Prenda(int id, String talla, String material, String color, int cantidad, double precio) {
        this.id = id;
        this.talla = talla;
        this.material = material;
        this.color = color;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }

    //Metodos Getter y Setter
    public void setPrecio(double precio) {    
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Metodo get y set para arrayList
    //static sirve para ser llamado desde cualquier clase
    //y a cualquier parte del programa
    public static ArrayList<Prenda> getPrendas() {
        return prendas;
    }
    public static void agregarPrendas(Prenda prenda) {
        prendas.add(prenda);
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   
    
    //Metodo get y set para Contador
    public static int getContadorPrenda(){
        return contadorPrenda;
    }
    public static void setContadorPrenda(){
       Prenda.contadorPrenda+=1;
    }
    //Metodo Abstracto
    public abstract double aplicarDescuento();
    

    //toString
    @Override
    public String toString() {
        return "Prenda{" + "id=" + id + ", talla=" + talla + ", material=" + material + ", color=" + color + '}';
    }
    
    
}
    