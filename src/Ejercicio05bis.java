
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio05bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int num;
         
         
         
        System.out.println("Numeros aleatorios");
        System.out.println("===========================================");
        System.out.println("NOTA: en caso de extremos negativos, solo");
        System.out.println("se permiten extremos iguales");
        System.out.println("(-2,2) --> válido");
        System.out.println("(-2,5) --> no válido");
        System.out.println("===========================================");
        System.out.println("");
        
        int min,max;
        
        System.out.print("Dime min y max valores: ");
        min=teclado.nextInt();
        max=teclado.nextInt();
        System.out.println("");
        
        if (min<0 && max!=(min*-1)){
            
            System.out.println("ERROR: estremos no validos (deben ser iguales");
        }
        else if (max<0){
            System.out.println("ERROR: estremos no validos");
        }
        else if (max < min){
             System.out.println("ERROR: estremos no validos");
        }
        else {
            for (int i = 0; i < 10; i++) {
                 
                num=aleatorio(min,max);
                System.out.println(num);
                 
            }
        }
        
        
        
    }
    
     //Funcion: devuelve un numero aleatorio entre dos
    //valores dados
    public static int aleatorio(int min,int max){
       
        
        //num_aleatorio=(int)(Math.random()*(max-min+1)+min);
        
        int num_aleatorio;
        int cara_o_cruz;
        
        //Caso con estremos positivos
        if (min>=0 && max>=0){
            num_aleatorio=(int)(Math.random()*(max-min+1)+min);
            return num_aleatorio;
            
        }
        
        //Caso con el mínimo negativo
        //Genero aleatorio entre 0 y MAX
        //if (min<0){
        else{
            num_aleatorio=(int)(Math.random()*(max-0+1)+0);
          
            //Ahora decidimos si va a ser positivo o negativo
            //Esto genera un aleatorio entre 0 y 1
            //0 será positivo
            //1 será negativo
            cara_o_cruz=(int)(Math.random()*(1-0+1)+0);
        
            if (cara_o_cruz==0){
                return num_aleatorio;
            }
            else{
                return num_aleatorio*-1;
            }
            
        }
        
        
    }
    
    
    
    
}
