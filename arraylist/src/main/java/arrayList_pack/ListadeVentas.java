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
public class ListadeVentas {
    private ArrayList<String> listaVenta ;

    public ListadeVentas() {
        listaVenta = new ArrayList<>();
    }
    
    public void insertar(String producto){
        listaVenta.add(producto);
    }
    
    public void mostraVenta(){
    for(String temp : listaVenta){
        System.out.println(""+temp);}
    }
    





}
