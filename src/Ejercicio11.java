
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        int numerosPorValor[];
        numerosPorValor=rellenarArray(5);
        imprimirArray(numerosPorValor);
        
        int numerosPorRef[]=new int[5];
        rellenarArray(numerosPorRef);
        imprimirArray(numerosPorRef);
        
        
    }
    
    
    public static int[] rellenarArray(int tam) {
        Scanner entrada=new Scanner(System.in);
        
        int vector[]=new int[tam];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector["+i+"]:");
            vector[i]=Integer.parseInt(entrada.nextLine());
        }
        
        return vector;
    }
    
    public static void rellenarArray(int vector[]) {
        Scanner entrada=new Scanner(System.in);
        
       // int vector[]=new int[tam];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("vector["+i+"]:");
            vector[i]=Integer.parseInt(entrada.nextLine());
        }
        
        //return vector;
    }
    
    
    
    
    public static void imprimirArray (int vector[]){
        System.out.print("Array--> ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("   "+vector[i]);
        }
        System.out.println("");
    }
    
    
    
}
