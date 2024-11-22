/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lista1[]=new int[5];

        System.out.println("---- relleno el array lista1 ---");
        rellenarArray(lista1);
        imprimirArray(lista1);

        System.out.println("---- replica de lista1 OPCION1 --");
        int[] lista2; //ojo, no necesito saber tamaño
        lista2=replicarArray(lista1);
        imprimirArray(lista1);
        imprimirArray(lista2);

        System.out.println("---- incremento lista1 en 10 --");
        incrementarArray(lista1,10);
        imprimirArray(lista1);
        imprimirArray(lista2);

        
        System.out.println("----- hago alias, no copia -----");
        int[] lista_copia_mal;
        //ESTO NO ES UNA COPIA
        //Es el mismo array con 2 nombres
        lista_copia_mal = lista1;
        incrementarArray(lista_copia_mal,50);
        imprimirArray(lista1);
        imprimirArray(lista2);
        imprimirArray(lista_copia_mal);
        
    }
    
    public static void rellenarArray(int[] vector){
        Scanner teclado = new Scanner (System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Dime el elemento "+(i)+":");
            vector[i]=Integer.parseInt(teclado.nextLine());
        }
        System.out.println("");
        
    }
    
    public static void imprimirArray (int[] vector){
        System.out.print("Array--> ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("   "+vector[i]);
        }
        System.out.println("");
    }
    
    public static int[] replicarArray(int[] vector){
        int[] replica = new int[vector.length];
        
        for (int i = 0; i < vector.length; i++) {
            replica[i]=vector[i];
        }
        
        return replica;
    }
    
    public static void incrementarArray(int[] vector,int cantidad){
      
        for (int i = 0; i < vector.length; i++) {
            vector[i]=vector[i]+cantidad;
        }
    }
    
    
    
    
}
