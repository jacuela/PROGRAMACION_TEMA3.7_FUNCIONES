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
public class Ampliacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int[] mis_numeros=new int[6];
        int [] lista_bonoloto;
        int num;
        
        System.out.println("BONOLOTO");
        System.out.println("================");
        
        for (int i = 0; i < 6; i++) {
            
            do{ //Para comprobar que escojo un num estre 1 y 49
                System.out.print("Dime tu numero "+(i+1)+": ");
                num = Integer.parseInt(teclado.nextLine());
                if (num<1 || num>49) System.out.println("    ERROR, entre 1 y 49");
            }while(num<1 || num>49);
            
            mis_numeros[i]=num;
        }

        System.out.println("");
        System.out.println("---- generando sorteo ----");
        lista_bonoloto = generarNumerosBonoloto();
        imprimirArray(lista_bonoloto);
        
        System.out.println("Total aciertos: "+checkAciertos(lista_bonoloto, mis_numeros));
        
    }
    
    public static int[] generarNumerosBonoloto(){
        int totalNumerosEnlaBonoloto=6;
        int []lista = new int[totalNumerosEnlaBonoloto];
        int min=1;
        int max=49;
        int num;
        
        for (int i = 0; i < lista.length; i++) {
            
            //Debo comoprobar si ha salido ya o no
            do {
                num=(int)(Math.random()*(max-min+1))+min;
            } while (numDuplicado(lista,num));
            
            //Si paso el while, es porque el num no esta duplicado. Lo meto
            lista[i]=num;
        }
        return lista;
        
    }
    
    public static boolean numDuplicado(int[] lista_premiados, int num){
        //Esta función en realidad hace lo mismo que la de esAcierto.
        //lo que hace es comprobar si un numero NUM esta o no en una lista
        
        boolean duplicado=false;
        
        for (int i = 0; i < lista_premiados.length; i++) {
            
            if (lista_premiados[i]==num){
                duplicado=true;
            }
        }
        
        return duplicado;
    }
    
    public static boolean esAcierto(int[] lista_premiados, int num){
        boolean acierto=false;
        
        for (int i = 0; i < lista_premiados.length; i++) {
            
            if (lista_premiados[i]==num){
                acierto=true;
            }
        }
        
        return acierto;
    }
    
    public static int checkAciertos(int[] lista_premiados,int[] mis_numeros){
        int num;
        int totalAciertos=0;
        
        for (int i = 0; i < lista_premiados.length; i++) {
            num=mis_numeros[i];
            //***** uso la función esAcierto() *****
            if (esAcierto(lista_premiados,num)){
                totalAciertos++;
            }
        }
        return totalAciertos;
    }
     
    public static int checkAciertos2(int[] lista_premiados,int[] mis_numeros){
        int num;
        int totalAciertos=0;
        
        for (int i = 0; i < lista_premiados.length; i++) {
            num=mis_numeros[i];
            for (int j = 0; j < lista_premiados.length; j++) {
                if (num==lista_premiados[j]){
                    totalAciertos++;
                }
            }
        }
        return totalAciertos;
    }
    
    public static void imprimirArray (int[] vector){
        System.out.print("Array--> ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("   "+vector[i]);
        }
        System.out.println("");
    }
    
    
    
}
