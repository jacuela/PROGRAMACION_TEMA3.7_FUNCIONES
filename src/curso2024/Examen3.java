/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int maxEdad;
        int contadorMaxEdad=0;
        
        String []nombres={"Pepe","Juan","Marta","Alicia","Leo"};
        int[] edades={23,35,35,40,18};
        
        System.out.println("Ejercicio3 - Mayores");
        System.out.println("========================");
        System.out.println("");
        imprimirDatos(nombres,edades);
        
        //Primer bucle: busco la edad maxima
        maxEdad=edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i]>maxEdad){
                //nuevo maximo encontrado
                maxEdad=edades[i];
            }
        }
        
        //Segundo bucle: buscar cuantos hay con la maxima edad
        for (int i = 0; i < edades.length; i++) {
            if (edades[i]==maxEdad){
                contadorMaxEdad++;
            }
        }
            
        System.out.printf("Hay %d personas con la edad de %d\n",contadorMaxEdad,maxEdad);
        
        //Tercer bucle: mostrar los nombres de las personas de mayor edad
        System.out.print("Nombres:");
        for (int i = 0; i < edades.length; i++) {
            if (edades[i]==maxEdad){
                System.out.print(" "+nombres[i]);
            }
        }
        
        System.out.println("");
        
        
        
        
        
        
        
        
    }
    
    public static void imprimirDatos(String[]nombres, int[]edades){
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%10s --> %3d años\n",nombres[i],edades[i]);
        }
        System.out.println("");
        
    }
    
    
}
