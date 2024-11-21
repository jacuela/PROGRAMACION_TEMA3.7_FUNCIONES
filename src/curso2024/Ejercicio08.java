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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int opcion;        
        int []lista = new int[5];     //{100,2,3,4,-5};
         
        //======== depuracion ==================
//        for (int i = 0; i < lista.length; i++) {
//            lista[i]=aleatorio(-10,10);
//        }
//        
//        imprimirArray(lista);
//        
//        System.out.println(mayorArray(lista));
//        System.out.println(menorArray(lista));
//        System.out.println(sumaArray(lista));
        //==========================================
        
        do {
            System.out.println("");
            System.out.println("Manejador de arrays");
            System.out.println("===============================");
            imprimirArray(lista);
            System.out.println("===============================");
            System.out.println("1. Generar nuevos valores");
            System.out.println("2. Mostrar el máximo y el mínimo");
            System.out.println("3. Mostrar la suma");
            System.out.println("4. Salir");

            do{
                System.out.print("Dime una opcion>");
                opcion = Integer.parseInt(teclado.nextLine());
            }while(opcion<1 || opcion>4);
            
            switch (opcion){
                case 1: 
                    //Generar nuevos valores
                    for (int i = 0; i < lista.length; i++) {
                        lista[i]=aleatorio(-10,10);
                    }
                    break;

                case 2:
                    //Max y min
                    System.out.println("\033[34mEl valor máximo es: "+mayorArray(lista)+"\033[30m");
                    System.out.println("\033[34mEl valor mínimo es: "+menorArray(lista)+"\033[30m");
                    break;    

                case 3: 
                    //Suma
                    System.out.println("\033[34mLa suma es: "+sumaArray(lista)+"\033[30m");
                    break;

                case 4:
                    System.out.println("Saliendo....");
                    break;    
            }    
           
        }while(opcion!=4);    
        
        
    }
   
    //--------------------------------------------
    //Generar numeros aleatorios
    public static int aleatorio(int min, int max){
        //Algoritmo. Ambos extremos tienen que ser >=0
        int num;
  
//        //Primero, trato errores
//        if (min<0 || max<0){
//            return -1;
//        }
        
        if (min>max){
            return -1;
        }
        num=(int)(Math.random()*(max-min+1))+min; //max y min incluidos 
        return num;
    }
    
    
    //---------------------------------------------
    public static int sumaArray(int [] lista){
        
        int suma=0;
        
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];
        }
        
        return suma;
    }
    
    //---------------------------------------------
    public static int mayorArray(int [] lista){
        int mayor=lista[0];
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]>mayor){
                mayor=lista[i];
            }
        }
        return mayor;
        
    }

    //---------------------------------------------
    public static int menorArray(int [] lista){
        int menor=lista[0];
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]<menor){
                menor=lista[i];
            }
        }
        return menor;
    }
    
    //---------------------------------------------
    public static void imprimirArray(int [] lista){
        
        System.out.print("Array-->| ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print("\033[34m"+lista[i]+"\033[30m"+" | ");
        }
        System.out.println("");
       
    }
    
}
