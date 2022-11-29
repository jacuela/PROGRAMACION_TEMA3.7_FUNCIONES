
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan.antonio
 */
public class Ejercicio09_manejador_cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opcion;
        String cadena="";
        
        //******** probando las funciones
        //System.out.println(sustituir_blancos("hola cara cola"));
        //********************************
        
        
        
        do{
            System.out.println("***************************");
            System.out.printf("cadena:\033[34m%s\033[30m\n",cadena);
            System.out.println("***************************");
            System.out.println("1. Introducir nueva cadena");
            System.out.println("2. Capitalizar cadena");
            System.out.println("3. Sustituir blancos");
            System.out.println("4. Salir");
            System.out.print("Dime una opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            switch (opcion){
                case 1: 
                    System.out.println("");
                    cadena=devolver_cadena();
                    break;
                case 2: 
                    System.out.println("");
                    cadena=capitalizarCadena(cadena);
                    break;
                case 3: 
                    System.out.println("");
                    cadena=sustituir_blancos(cadena);
                    break;
                case 4:
                    System.out.println("bye bye");
            }
            
        }while(opcion!=4);
      
    }
    
    public static String devolver_cadena(){
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce una cadena:");
        String cadena=teclado.nextLine();

        //String cadena=JOptionPane.showInputDialog("Introduce cadena");
        return cadena;
        
    }
    
    public static void pulsa_para_continuar(){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Pulsa INTRO para continuar...");
        String cadena=teclado.nextLine();
    }
    
    public static String sustituir_blancos(String cadena){
        String nuevaCadena="";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==' '){
                nuevaCadena=nuevaCadena+"_";
            }
            else{
                nuevaCadena=nuevaCadena+cadena.charAt(i); 
            }
        }
        return nuevaCadena;
    } 
    
    public static String capitalizarCadena(String cadena) {
        
        String nuevaCad="";
        char c;
        
        cadena=cadena.trim(); //Primero quito espacios en blanco
        char primerCaracter=cadena.charAt(0);
        
        nuevaCad=nuevaCad+Character.toUpperCase(primerCaracter);
        
        for (int i = 1; i < cadena.length(); i++) {
            //Caracter anterior es un espacio en blanco
            //Pongo el actual en mayusculas
            if (cadena.charAt(i-1)==' '){
                c=cadena.charAt(i);
                nuevaCad=nuevaCad+Character.toUpperCase(c);
            }
            //El caracter anterior NO es blanco
            //concateno el caracter actual tal cual
            else{
                c=cadena.charAt(i);
                nuevaCad=nuevaCad+c;
                
            }
        }
       return nuevaCad;
    }
    
}
