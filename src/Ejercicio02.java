
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int num;
        String cadena;
        
        
        System.out.println("Afortunados");
        System.out.println("===========");
        do{
            System.out.print("Dime un numero (INTRO para salir): ");
            cadena=teclado.nextLine();
            //Si la candea NO ESTA VACIA (es decir, NO ES UN INTRO)
            if (!cadena.equals("")){
               num=Integer.parseInt(cadena);     
               if (esAfortunado(num)){ 
                    System.out.printf("El numero %d es \033[32m AFORTUNADO \033[30m\n",num);
               }     
               else{ 
                    System.out.printf("El numero %d es \033[31m NO AFORTUNADO \033[30m\n",num);
               }         
               System.out.println("");
            }
            //La cadena ES VACIA (es decir, le me metido un INTRO)
            else{
                System.out.println("bye bye julai"); 
                
            }
        
        }while(!cadena.equals(""));
        
        
    }
    
    
    //Funcion
    /**
     * 
     * 
     * @param num 
     * @return 
     */
    public static boolean esAfortunado(int num){
        int afortunados=0;
        int noAfortunados=0;
        
        while (num > 0) {
            int digito = (int) (num % 10);

            if ((digito == 2) || (digito == 5) || (digito == 8)) {
                afortunados++;
            } else {
                noAfortunados++;
            }
            num /= 10;  //num=num/10
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
