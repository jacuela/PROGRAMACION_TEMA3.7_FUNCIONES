
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Par o impar");
        System.out.println("===========");
        
        System.out.print("Dime un numero: ");
        int num=Integer.parseInt(teclado.nextLine());
        
        if (esPar(num)){
            System.out.println("El numero "+num+" es par.");
        }
        else{
            System.out.println("El numero "+num+" es impar.");
      
        }
        
        
        
        
    }
    
    //Aquí van las funciones
    public static boolean esPar(int num){
        boolean resultado;
        
        if (num%2==0){
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
