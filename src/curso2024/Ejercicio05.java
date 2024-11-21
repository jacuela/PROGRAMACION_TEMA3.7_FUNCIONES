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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int min, max;
        
        System.out.println("Dime el mínimo:");
        min=Integer.parseInt(teclado.nextLine());
        
        System.out.println("Dime el máximo:");
        max=Integer.parseInt(teclado.nextLine());
        
        System.out.println();
        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) {
           int num=aleatorio(min,max);
           if (num==-1){
               System.out.println("ERROR de uso en la función");
               break;
           }else{
               System.out.println(num);
           }
               
           
        }
        
        
    }
    
    //Mis funciones
    //Devuelve un numero aleatorio positivo entre min y max. Si metes negativos o 
    //min mayor que max, devolverá -1
    public static int aleatorio(int min, int max){
        //Algoritmo. Ambos extremos tienen que ser >=0
        int num;

        
        //Primero, trato errores
        if (min<0 || max<0){
            return -1;
        }
        
        if (min>max){
            return -1;
        }
        
        num=(int)(Math.random()*(max-min+1))+min; //max y min incluidos 
        
        return num;
        
        
        
    }
    
}
