/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int dia, mes, año;
        
        
        System.out.print("Dime el dia:");
        dia=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Dime el mes:");
        mes=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Dime el año:");
        año=Integer.parseInt(teclado.nextLine());
        
        
        if (fechaCorrecta(dia,mes,año)){
            System.out.println("La fecha es correcta");
        }
        else{
            System.out.println("La fecha es incorrecta");
        }
        
        
        
        
        
        
    }
    
    
    public static boolean fechaCorrecta(int dia, int mes, int year){
        boolean yearCorrecto;
        boolean mesCorrecto;
        boolean diaCorrecto;
        
       
        //Analizo el año
        if (year >=1900 && year <=2500){
            yearCorrecto=true;
        }
        else{
            yearCorrecto=false;
        }
                
        //Analizo el mes
        if (mes >=1 && mes <=12){
            mesCorrecto=true;
        }
        else{
            mesCorrecto=false;
        }
      
        //Analizo el dia
        switch(mes){
            case 1,3,5,7,8,10,12:
                //Meses de 31 dias
                if (dia >=1 && dia<=31){
                    diaCorrecto=true;
                }
                else{
                    diaCorrecto=false;
                }
                                 
                break;
            case 4,6,9,11:
                //Meses de 30 dias
                if (dia >=1 && dia<=30){
                    diaCorrecto=true;
                }
                else{
                    diaCorrecto=false;
                }
                
                break;
            case 2:
                //Analizo febrero
                //Si el año es bisiesto
                if (Year.of(year).isLeap()){
                    if (dia>=1 && dia<=29){ 
                        diaCorrecto=true;
                    }
                    else{
                        diaCorrecto=false;
                    }
                }
                
                //Si no es bisiesto
                else{
                    if (dia>=1 && dia<=28){ 
                        diaCorrecto=true;
                    }
                    else{
                        diaCorrecto=false;
                    }
                }    
                break;
            default:
                diaCorrecto=false;
       }
        
        //Llegado a este punto, tengo tres variables booleanas
        //que me indican si son o no correctos el año, mes u dia
        if (diaCorrecto && mesCorrecto && yearCorrecto)
            return true;
        else
            return false;
        
        
    }
    
    
}
