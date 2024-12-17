/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenJOSEPLANES;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio2_competicion_atletismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Numero de atletas:");
        int atletas = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Numero de lanzamientos:");
        int lanzamientos = Integer.parseInt(teclado.nextLine());
        
        competicion(atletas,lanzamientos);
        
    }
    
    // n será el numero de atletas
    // m serán las tiradas o lanzamientos
    public static void competicion(int n, int m){
        
        double min = 10.0;
        double max = 60.0;
        
        double aleatorio;
        
        Random random = new Random();

        double [][] lanzamientos = new double[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                // Generar un número aleatorio entre 10 y 60
                aleatorio = min + (random.nextDouble() * (max - min));
                lanzamientos[i][j]=aleatorio;
            }
        }
        
        //Imprimir la tabla de lanzamientos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(lanzamientos[i][j]+"  ");  
            }
            System.out.println("");
        }
        
        //Obtener el mayor, menor, media lanzamienti
        double mayor=lanzamientos[0][0];
        double menor=lanzamientos[0][0];
        double sumaLanzamientos=0;
        
        
        int atletaMayor=1;
        int atletaMenor=1;
        double lanzamientoPromedio=-1;
        
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                //Calculo del mejor lanzamiento
                if (lanzamientos[i][j]>mayor){
                    mayor=lanzamientos[i][j];
                    atletaMayor = i+1;
                }
                
                //Calculo del peor lanzamiento
                if (lanzamientos[i][j]< menor){
                    menor=lanzamientos[i][j];
                    atletaMenor = i+1;
                }
                
                //Sumo todos los lanzamientos
                sumaLanzamientos = sumaLanzamientos + lanzamientos[i][j];
                
            }
        }
        //Calculo la media
        lanzamientoPromedio = sumaLanzamientos / (n*m);
        System.out.println("");
        System.out.println("El mayor lanzamiento es de "+mayor);
        System.out.println("Obtenido por el atleta "+atletaMayor);
        System.out.println("");
        System.out.println("El menor lanzamiento es de "+menor);
        System.out.println("Obtenido por el atleta "+atletaMenor);
        System.out.println("");
        System.out.println("La media de lanzamientos es: "+lanzamientoPromedio);
        
        
        
        
        
        
        
        
        
    }
    
}

