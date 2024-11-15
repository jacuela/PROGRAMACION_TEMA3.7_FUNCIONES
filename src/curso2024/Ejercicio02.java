/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

import static curso2024.Ejercicio01.esPar;
import java.util.Scanner;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int num;
        String dato;
        do{
                        
                System.out.println("Dime un numero:");
                dato=teclado.nextLine();
                
                //Compruebo si es un INTRO
                if (dato.equals("")){
                    break;
                }
                
                num=Integer.parseInt(dato);

                if (esAfortunado(num)){
                    System.out.println("Sí es afortunado");
                }else{
                    System.out.println("NO es afortunado");
                }
        }while(!dato.equals(""));
        
        

    }

    //Funcion esAfortunado
    public static boolean esAfortunado(int num) {

        int afortunados=0;
        int noAfortunados=0;
        
        while (num > 0) {
            int digito = (int) (num % 10);
            if ((digito == 2) || (digito == 5) || (digito == 8)) {
                afortunados++;
            } else {
                noAfortunados++;
            }
            num /= 10;
        }
        
        if (afortunados > noAfortunados) {
            //System.out.println("es afortunado");
            return true;
        } else {
            //System.out.println("no es afortunado");
            return false;
        }
        
    }//fin funcion
    
    
    
}
