/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList_pack;
import java.util.Scanner;

/**
 *
 * @author D_Medina
 */
public class arrayMain {

    private static String pattern;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        ListadeVentas venta = new ListadeVentas();
        ListadeCompra compra = new ListadeCompra();
        
        
        do{
            System.out.println("    Menu");
            System.out.println("1. ingresar productos vendidos ");
            System.out.println("2. ingresar productos comprados");
            System.out.println("3. total vendido ");
            System.out.println("4. total comprado ");
            System.out.println("5. lista de productos para vender ");
            System.out.println("6. lista de productos comprados");
            System.out.println("7. salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:System.out.println("ingrese alimento vendido");
                       
                       venta.insertar(teclado.next());break;//crear array para costo y agregarlo
                case 5:System.out.println("lista de productos a la venta ");
                       System.out.println("1v. saco para perro = $20000");
                       System.out.println("2v. saco para gato = $19000");
                       System.out.println("3v. alimento para pez = $5000");break;
                case 6:System.out.println("Lista de productos comprado");
                       System.out.println("1c. saco para perro = $15000");
                       System.out.println("2c. saco para gato = $14000");
                       System.out.println("3c. alimento para pez = $1000");break;
                case 2:System.out.println("ingrese productos a comprar");
                       compra.insertar(teclado.next());break;//crear array para costo y agregarlo
                case 3:System.out.println("mostrando el total de ventas ");
                       venta.mostraVenta();break;
                case 4:System.out.println("mostrando el total de compra ");
                       compra.mostrarCompra();break;
                case 7:System.out.println("saliendo");
                
                default:System.out.println("opcion invalida");
                //modificar case 3 y 4 para mostrar el costo total de la venta o compra
                //crear mismatch para que no se salga del menu 
                //arreglar el problema con los espacios con el insertar atraves del scan 
            
            }        
        
        
        }while (opcion != 7);
            
        // TODO code application logic here
    }
    
}
