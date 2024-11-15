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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime un numero:");
        int num=Integer.parseInt(teclado.nextLine());
        
        if (esPar(num)){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
    }
    
    //Funcion esPar
    public static boolean esPar(int numero){
        boolean resultado;
        if (numero%2==0){
            resultado=true;
            //return true;
        }
        else{
            resultado=false;
            //return false;
        }
        
        return resultado;
    }
    
    
    
}
