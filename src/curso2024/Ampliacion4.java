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
public class Ampliacion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        String[] palabras={"casa","arbol","coche","perro","libro"};
                
        
        //Imprimo datos
        System.out.print("Datos: ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i]+"   ");
        }
        System.out.println("");
        
        
        System.out.print("Dime una letra:");
        char letra=teclado.nextLine().charAt(0);
        
        
        
        
        String []resultado = palabrasContienenLetra(palabras,letra);
        
        //Imprimo el resultado:
        System.out.println("");
        System.out.println("Para la letra ["+letra+"], he encontrado "+resultado.length+" coincidencias");
        System.out.print("   -->");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]+"  ");
        }
        System.out.println("");

        
    }
    
    //Función que te dice si una palabra/cadena contiene o no una letra dada
    public static boolean contieneLetra(String palabra, char letra){
        boolean contiene=false;
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i)==letra){
                contiene=true;
            }
        }
        
        return contiene;
    }
    
    
    
    //Función que le pasamos una lista de palabras, una letra, y te devuevle
    //una lista con las palabras que contienen dicha letra
    public static String[] palabrasContienenLetra(String[] lista, char letra){
    
        int totalCoincidencias=0;
        String[] resultado;
        
        //Primero, necesito saber cuantas palabras coinciden
        //para saber el tamaño del array resultado
        for (int i = 0; i < lista.length; i++) {
            if (contieneLetra(lista[i],letra)){
                totalCoincidencias++;
            }
        }
        
        resultado = new String[totalCoincidencias];
        
        //Ahora, voy metiendo las palabras que coinciden en la lista resultado
        int posiResultado=0;
        for (int i = 0; i < lista.length; i++) {
            if (contieneLetra(lista[i],letra)){
                resultado[posiResultado]=lista[i];
                posiResultado++;
            }
        }
        
        
        return resultado;
        
    }
    
    
    
    
    
}
