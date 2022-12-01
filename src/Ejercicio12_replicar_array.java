/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio12_replicar_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PARTE A
        System.out.println("PARTEA");
        System.out.println("=================");
        int[] lista1={1,2,3};
        int[] lista2;
        
        //Creo una replica real de lista1
        
        //   lista2=lista1;    //<--- ESTO NO ES UNA REPLICA
        //                         lista2 apunta al mismo array
        
        lista2=new int[lista1.length];
        for (int i = 0; i < lista1.length; i++) {
            lista2[i]=lista1[i];
        }
        lista2[0]=10;
        lista2[1]=20;
        lista2[2]=30;
        
        imprimirArray(lista1);
        imprimirArray(lista2);
     
        
        System.out.println("PARTEB - opcion1");
        System.out.println("=================");
        
        //OPCION1
        replicarArray(lista1,lista2);
        imprimirArray(lista1);
        imprimirArray(lista2);
        
        System.out.println("PARTEB - opcion2");
        System.out.println("=================");
        //OPCION2
        lista2=replicarArray(lista1);
        imprimirArray(lista1);
        imprimirArray(lista2);
        
        
    }
    
    
    public static void imprimirArray(int[] lista){
        System.out.print("Array--> | ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" | ");
        }
        System.out.println("");
        System.out.println("");
    }
    
    //OPCION 1 de función para replicar un array
    //usando el paso por referencia
    public static void replicarArray(int[]lista, int[]lista_copia){
        
        //lista_copia=new int[lista.length];
        
        for (int i = 0; i < lista.length; i++) {
            lista_copia[i]=lista[i];
        }
    }
   
    //OPCION 2 de función para replicar un array
    //usando el paso por valor
    public static int[] replicarArray(int[]lista){
        
        int[]lista_copia=new int[lista.length];
        
        for (int i = 0; i < lista.length; i++) {
            lista_copia[i]=lista[i];
        }
        
        return lista_copia;
    }

    
    
    
    
}
