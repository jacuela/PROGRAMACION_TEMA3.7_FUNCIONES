package examenJOSEPLANES;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio1_buscar_num_en_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] lista = {8,23,12,4,12};
        
        int numero=12;
        
        int posicion = busqueda_array_unidimensional(numero, lista);
        
        if (posicion==-1){
            System.out.println("El numero "+numero+" no está en al array");
        }
        else{
            System.out.println("El numero "+numero+" está en la posición "+posicion);
        }
    }
  
    
    
    public static int busqueda_array_unidimensional(int num, int[]lista){
        
        for (int i = 0; i < lista.length ; i++) {
            if (lista[i]==num){
                return i;
            }
       
        }
        //Si no lo encontramos, devolvemos -1
        return -1;
    }
    
}
