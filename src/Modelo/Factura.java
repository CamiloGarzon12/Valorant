package Modelo;

import java.util.ArrayList;

public class Factura {
    //Atributos
    private String cliente;
    private String identificacion;
    private int idFactura;
    private String fecha;
    private ArrayList<Prenda> prendas;
    
    //Constructor

    public Factura(String cliente, String identificacion, int idFactura, String fecha, ArrayList<Prenda> prendas) {
        this.cliente = cliente;
        this.identificacion = identificacion;
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.prendas = prendas;
    }

    

    
    //Metodos Getter y Setter
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public ArrayList<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(ArrayList<Prenda> prendas) {
        this.prendas = prendas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", identificacion=" + identificacion + ", idFactura=" + idFactura + '}';
    }
    
    
    
    
}
