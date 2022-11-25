
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan.antonio
 */
public class Ejercicio07_ArrayParametro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector1={1,2,3};
        int[] vector2={1,2,4};
        
        int[] resultado=fusionar_vectores(vector1,vector2);
        
        System.out.print("Vector fusion--> | ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]+" | ");
        }
        System.out.println("");
        
        
        if (comparar_vectores(vector1,vector2)){
             System.out.println("Los arrays son iguales");
        }
        else{
            System.out.println("Los arrays son distintos");
        }
        
        
        System.out.println("ADIOSSSSSSSS");
       
    }
    
    public static boolean comparar_vectores(int[] lista1, int[] lista2){
       // boolean resultado=true;
        
        if (lista1.length != lista2.length )
            return false;
        else{
            //Los arrays tienen el mismo tamaño. Comparo posición a posición
            for (int i = 0; i < lista1.length; i++) {
                if (lista1[i]!=lista2[i]){
                    return false;
                }
               
            }
        }
        return true;
        
    }
    
    
    public static int[] fusionar_vectores(int[] lista1, int[] lista2){
        
        int[]resultado=new int[lista1.length+lista2.length];
        int indice_resultado=0;
        
        for (int i = 0; i < lista1.length; i++) {
              resultado[indice_resultado]=lista1[i];
              indice_resultado++;
        }
        
        for (int i = 0; i < lista2.length; i++) {
              resultado[indice_resultado]=lista2[i];
              indice_resultado++;
        }

        return resultado;
        
    }
    
    
    
    
    
    
}
