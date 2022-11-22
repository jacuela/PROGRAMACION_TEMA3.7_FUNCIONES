
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class AA_EjerciciosIniciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        
        //Funcion con 1 parametro de entrada
        System.out.println("Raiz cuadrada de 9: "+Math.sqrt(9));
        
        String cadena="ABCD";
        
        //Funcion con 0 parametro de entrada
        System.out.println("Longitud de la cadena ABCD: "+cadena.length());
        
        
        //Funcion con 2 parámetros
        Math.pow(2, 3);  //OJO, esto no hace nada
                         //La función solo devuelve un valor. Hay que asignarlo
                         //a variable o usarlo en otra función para poder
                         //hacer algo con dicho valor
        
        
                         
        double potencia=Math.pow(2, 3);                 
        System.out.println("2 elevado a 3 es: "+potencia);                 
        //Directamente uso el valor devuelto en el print
        System.out.println("2 elevado a 3 es: "+Math.pow(2, 3));
        
        
        System.out.println("El area de un cuadrado de lado=2 es: "+areaCuadrado(2));
        
        
        System.out.print("Dime el radio: ");
        int radio=Integer.parseInt(teclado.nextLine());
        
        double area=areaCirculo(radio);
        System.out.printf("El area del ciculo de radio %d es %.2f\n",radio,area);
        
        
    } //fin main
    
    
    //Area del cuadradado
    public static int areaCuadrado(int lado){
        int area;
        area=lado*lado;
        return area;
    }
    
    
    //Area del circulo PI*r*r
    // Math.PI
    public static double areaCirculo(int radio){
        double area=Math.PI*radio*radio;
        
        return area;
    }
    
    
} //fin programa
