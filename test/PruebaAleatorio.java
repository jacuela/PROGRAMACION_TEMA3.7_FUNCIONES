/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class PruebaAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int max=1;
        int min=0;
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random()*(max-min+1))+min);
            
        }
        //num_aleatorio=(int)(Math.random()*(max-min+1)+min);
    }
    
}
