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
public class Ampliacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        int contadorAnimales=0;
        boolean primero=true;
        
        String[] animales={"perro","gato","rata","pajaro","raton"};
        
        System.out.print("Dime una letra:");
        char letra=teclado.nextLine().charAt(0);
        
//        String aux=teclado.nextLine();
//        char letra=aux.charAt(0);
        

        //====================== PARTE1 ==============================    
        System.out.println("=================== parte1 .  =========");
        
        //Primer recorrido para ver si hay o no animales
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].charAt(0)==letra){
                contadorAnimales++;
            }
        }
        
        if (contadorAnimales==0){
            System.out.println("No hay animales que empiecen por "+letra);
        }
        else{
            System.out.print("Animales que empiezan por "+letra+": ");
            for (int i = 0; i < animales.length; i++) {
                if (animales[i].charAt(0)==letra){
                    
                    //Trato la priemera coincidencia
                    if (primero){
                        //Primera coincidencia
                        System.out.print(animales[i]);
                        primero=false;
                    }
                    else{
                        //Resto de coincidencias
                        System.out.print(", "+animales[i]);
                    }
                }
            }
        }
        System.out.println("");
        
        
        //=================== parte2 . Usando la funcion =========
        System.out.println("");
        System.out.println("=================== parte2 . Usando la funcion =========");
        //Llamo a la funcion
        String []resultado;
        
        resultado=listaCoincidencia(animales,letra);
        if (resultado.length==0){
             System.out.println("No hay animales que empiecen por "+letra);
        }
        else{
           //Imprimo la lista resultado
           //El primer elemento es especial, va sin coma
           System.out.print("Animales que empiezan por "+letra+": "+resultado[0]);
           
           //Resto de elementos
           for (int i = 1; i < resultado.length; i++) {
                System.out.print(", "+resultado[i]);  

            }
            System.out.println("");
        }
        
        
        
        
        
    }
    
    //Parte 2. Funcion que me devuevla la lista de animales
    public static String[] listaCoincidencia(String[] animales, char letra){
        String[]resultado; // = new String[?????????????];
        int contadorAnimales=0;
        
        
        //Primero, necesito conocer cuantos van a coincidir
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].charAt(0)==letra){
                contadorAnimales++;
            }
        }
        
        resultado = new String[contadorAnimales];
        
        //Busco animales que empiezan por letra
        int indiceResultado=0;
        
        for (int i = 0; i < animales.length; i++) {
                if (animales[i].charAt(0)==letra){
                    resultado[indiceResultado]=animales[i];
                    indiceResultado++;
                }
        }
        
        return resultado; 
        
        
    } 
    
    
    
}
