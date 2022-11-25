/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio06_color_cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        imprimirCadenaColor("hola","rojo",true);
        imprimirCadenaColor("hola","verde",true);
        imprimirCadenaColor("hola","azul",false);
        imprimirCadenaColor("hola","amarillo",true);
        
        System.out.println("------------------------------");
        
        System.out.println(devolverCadenaColor("adios","rojo"));
        System.out.println(devolverCadenaColor("adios","verde"));
        System.out.print(devolverCadenaColor("adios","azul"));
        System.out.println(devolverCadenaColor("adios","amarillo"));
        
        System.out.println(devolverCadenaColor("otroa","amalillo"));
        
        
    }
    
    
      //Funcion: funcion que devuelve una cadena dada coloreada
    //Parametros:
    //String: cadena a colorear.
    //String: color. Valores posibles: "rojo","azul","negro","amarillo","verde".
    public static String devolverCadenaColor(String texto, String color){
        
        String cadena="ERROR. Color no encontrado";
        
        switch(color){
            case "negro": cadena=String.format("\033[30m%s\033[30m",texto);
                          break;
            
                          //0tra opcion de crear una cadena
            case "rojo":  cadena="\033[31m"+texto+"\033[30m"; 
                          break;                                       
            
            case "verde": cadena=String.format("\033[32m%s\033[30m",texto);
                          break;
            
            case "amarillo": cadena=String.format("\033[33m%s\033[30m",texto);
                          break;
            
            case "azul": cadena=String.format("\033[34m%s\033[30m",texto);
                          break;
        }
        
        return cadena;
        
    }
    
    
    //Funcion: funcion que imprime en color una cadena dada
    //Parametros:
    //String: cadena a colorear.
    //String: color. Valores posibles: "rojo","azul","negro","amarillo","verde".
    //Srting: booleano. True para aplicar un salto de linea.
    //no devuelve nada
    public static void imprimirCadenaColor(String texto, String color,boolean saltar){
        
        switch(color){
            case "negro": System.out.printf("\033[30m%s\033[30m",texto);
                          break;
            case "rojo": System.out.printf("\033[31m%s\033[30m",texto);
                         break;
            case "verde": System.out.printf("\033[32m%s\033[30m",texto);
                          break;
            case "amarillo": System.out.printf("\033[33m%s\033[30m",texto);
                          break;
            case "azul": System.out.printf("\033[34m%s\033[30m",texto);
                          break;
        }
        
        if (saltar==true) System.out.println();
        
    }
    
    
    
  
    
    
    
    
    
}
