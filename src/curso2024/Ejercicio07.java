/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2024;

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []lista1={1,3,5,99,88};
        int []lista2={2,4,6};
        
        int []resultado; 
        
        if (comparar_vectores(lista1,lista2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son distintos");
        }
        
        
        resultado=fusionar_vectores(lista1,lista2);
        //Imprikmo el resultado
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
        
        
    }
    
    
    public static boolean comparar_vectores(int[] lista1, int[] lista2){
        
        if (lista1.length!=lista2.length){
            //Son distintos en tamaño
            return false;
        }
        else{
            //Son iguales en tamaño. Comprebo casilla a casilla
            for (int i = 0; i < lista1.length; i++) {
                if (lista1[i]!=lista2[i]){
                    //Entro si encuentro distintos
                    return false;
                    //break;
                }
                
            }
            return true;
        }
    }//fin funcion
   
    public static int[] fusionar_vectores(int[] lista1, int[] lista2){
        
        int tamañoTotal = lista1.length+lista2.length;
        int []resultado=new int[tamañoTotal];
        
        //Primero recorro y copio el primer array
        for (int i = 0; i < lista1.length; i++) {
            resultado[i]=lista1[i];
        }
        
        //Ahora, copio el segundo array
        int tamañoArray1=lista1.length;
        
        for (int i = 0; i < lista2.length; i++) {
            resultado[tamañoArray1]=lista2[i];
            tamañoArray1++;
            //resultado[lista1.length+i]=lista2[i];
        }
        
        return resultado;
         
        
    } 
    
    
    
    
}
