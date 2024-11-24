package Modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Simulacion {
    public static void main (String[]args){
           
        
        Factura facturas = new Factura("","",2323,"",Prenda.getPrendas());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
            //convertir un objeto persona a json
            String jsonString = gson.toJson(facturas);
        
        try(FileWriter file= new FileWriter("Factura.json")){
            file.write(jsonString);
            JOptionPane.showMessageDialog(null,"Archivo JSON creado: persona.json");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
