/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList_pack;
import java.util.ArrayList;
/**
 *
 * @author D_Medina
 */
public class Datos {
    private ArrayList<String> Datos;

    public Datos() {
        Datos = new ArrayList<>();
    }
    
    public void insertar(String nombre){
        Datos.add(nombre);
    
    }
    
    public void listar(){
    for(String temp : Datos){
        System.out.println(""+temp);}
    }
    
}
