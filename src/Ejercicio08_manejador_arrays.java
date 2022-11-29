
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
public class Ejercicio08_manejador_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int[] lista= new int[5];
        int opcion = 0;

        do {
            System.out.println("\n\n\n  Manejador array");
            System.out.println("======================================");
            System.out.print("Array --> "); imprimirArray(lista);
            System.out.println("======================================");
            
            System.out.println("1. Generar nuevo array");
            System.out.println("2. Obtener el máximo y el mínimo");
            System.out.println("3. Obtener la suma");
            System.out.println("4. Salir");
   
            do{
                System.out.print("Elige opcion:");
                opcion = Integer.parseInt(teclado.nextLine());
            }while(opcion<1 || opcion>4);    
                
            switch (opcion) {
                case 1:
                    //Rellenar el array
                    for (int i = 0; i < lista.length; i++) {
                        lista[i]=aleatorio(-10,10);
                    }
                    break;
                case 2:
                    //Maximo y mínimo
                    System.out.println("\033[34mMáximo valor del array:"+maxArray(lista));
                    System.out.println("\033[34mMínimo valor del array:"+minArray(lista));
                    break;
                case 3:
                    //Obtener la suma
                    System.out.println("\033[34mLos valores suman: "+sumaArray(lista));
                    break;
                
            }
        } while (opcion != 4);
        
        System.out.println("\nPROGRAMA CERRADO.");

    }
    
    
    //Funcion: sumarArray(...)
    //Devuelve la suma los valores de un array
    public static int sumaArray(int[] lista){
        int suma=0;
        
        for (int i = 0; i < lista.length; i++) {
            suma=suma+lista[i];
        }
        return suma;
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
    
    
    //Funcion: pintar array
    public static void imprimirArray(int[] lista){
        
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("| \033[34m%2d\033[30m ",lista[i]);
        }
        System.out.println("|");
        
    }
    
    //Funcion: maxArray(...)
    public static int maxArray(int[] vector) {
        int numMayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (numMayor < vector[i]) {
                numMayor = vector[i];
            }
        }

        return numMayor;

    }

    //Funcion: minArray(...)
    public static int minArray(int[] vector) {
        int numMenor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (numMenor > vector[i]) {
                numMenor = vector[i];
            }
        }

        return numMenor;

    }

    
    
}
