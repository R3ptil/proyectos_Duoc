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
public class ListadeCompra {
    private ArrayList<String> listaCompra;

    public ListadeCompra() {
        listaCompra = new ArrayList<>();
    }
    
    public void insertar(String producto){
        listaCompra.add(producto);
    }
    
    public void mostrarCompra(){
        for(String temp : listaCompra){
            System.out.println(""+temp);}
    }
     
     
   
    
    
    
    
}
