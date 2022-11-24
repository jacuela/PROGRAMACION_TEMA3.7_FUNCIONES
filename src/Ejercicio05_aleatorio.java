
import java.util.Random;
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
public class Ejercicio05_aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Numeros aleatorios");
        System.out.println("==================");
        
        int min,max;
        
        
        System.out.print("Dime min y max valores: ");
        min=teclado.nextInt();
        max=teclado.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < 30; i++) {
             System.out.println(aleatorio(min,max));
        
        }
  
    }
    
    
    //Funcion: devuelve un numero aleatorio entre dos
    //valores dados
    public static int aleatorio(int min,int max){
       
        int num_aleatorio;
        
        num_aleatorio=(int)(Math.random()*(max-min+1)+min);
        
        return num_aleatorio;
        
        //
        //return (int)(Math.random()*(max-min+1)+min);
        //
    }
    
    
    
}
