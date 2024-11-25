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
public class Ampliacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int min=0;
        int max=4;
        int num;
        String pregunta="";
        
        
        String[]respuestas = {"SI", "NO", "PUEDE", "NI EN SUEÑOS!!", "SEGURO!!!"}; 
        
        do{
            System.out.print("Hazme una pregunta [INTRO para fin]: ");
            pregunta=teclado.nextLine();
            if (pregunta.equals("")){
                break;
            }
            //Generar aleatorio entre 0 y 4
            num=(int)(Math.random()*(max-min+1))+min; //max y min incluidos 
            System.out.println(respuestas[num]);
            
        }while (!pregunta.equals(""));      
        
        
        
        
    }
    
}
