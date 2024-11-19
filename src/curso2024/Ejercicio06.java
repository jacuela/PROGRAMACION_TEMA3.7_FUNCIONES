/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("---------- devolverCadenaColor(...)------------");
        devolverCadenaColor("1.hola a todos","rojo");
        System.out.println(devolverCadenaColor("2.hola","rojo"));
        System.out.println(devolverCadenaColor("3.hola","verde"));
        System.out.println(devolverCadenaColor("4.hola","papaya"));
        
        
        System.out.println("----------- imprimirCadenaColor(...)----------------");
        imprimirCadenaColor("1.hola a todos","rojo");
        imprimirCadenaColor("2.hola","rojo");
        imprimirCadenaColor("3.hola","verde");
        imprimirCadenaColor("4.hola","papaya");
        
        
    }
    
    //FUNCIONES
    public static String devolverCadenaColor(String cadena,String color){
        
        String cadenaColor;
        
        switch (color){
            case "rojo": 
                    cadenaColor="\033[31m"+cadena+"\033[30m";
                    break;
            case "verde":
                    cadenaColor=String.format("\033[32m%s\033[30m", cadena);
                    break;
            default:    
                    cadenaColor="ERROR";        
        }
        
        //System.out.println("NO IMPRIMAS NADA, ASSHOLE!!!");
        return cadenaColor;
    }
    
    
    public static void imprimirCadenaColor(String cadena,String color){
        
        String cadenaColor;
        
        switch (color){
            case "rojo": 
                    cadenaColor="\033[31m"+cadena+"\033[30m";
                    break;
            case "verde":
                    cadenaColor=String.format("\033[32m%s\033[30m", cadena);
                    break;
            default:    
                    cadenaColor="ERROR";        
        }
        
        System.out.println(cadenaColor);
        
    }
    
    
    
    
    
    
}
