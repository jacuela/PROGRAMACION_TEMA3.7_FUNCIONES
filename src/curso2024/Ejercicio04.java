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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        String fecha;
        int dia,mes,año;
        
        //*********************************
        //pruebas de depuracion
        //System.out.println(fechaBonita(12,1,3000));
        //*********************************
        
        
        System.out.println("Dime una fecha [dd/mm/aa | dd-mm-aa]:");
        fecha=teclado.nextLine();
        
        dia = getDia(fecha);
        mes = getMes(fecha);
        año = getYear(fecha);
        
        if (fechaCorrecta(dia,mes,año)){
            //System.out.println("La fecha es correcta");
            System.out.println(fechaBonita(dia,mes,año));
        }
        else{
            System.out.println("La fecha es incorrecta");
        }
        
        
        
    }
    
    //**************************************************************
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
    
    
    //Le paso una fecha en formato dd/mm/aaaa y devuelve el dia
    //Tambien, admite la fecha en formato dd-mm-aaaa
    public static int getDia(String fecha){
        
        String []campos;
        int dia;
        
        //Pregunto para saber el formato de la fecha
        if (fecha.contains("/")){
            campos = fecha.split("/");
            dia = Integer.parseInt(campos[0]);
        }
        
        else{
            campos = fecha.split("-");
            dia = Integer.parseInt(campos[0]);
        }
        
        return dia;
    }
    
    public static int getMes(String fecha){
        
        String []campos;
        int mes;
        
        //Pregunto para saber el formato de la fecha
        if (fecha.contains("/")){
            campos = fecha.split("/");
            mes = Integer.parseInt(campos[1]);
        }
        
        else{
            campos = fecha.split("-");
            mes = Integer.parseInt(campos[1]);
        }
        
        return mes;
    }
    
    public static int getYear(String fecha){
        
        String []campos;
        int year;
        
        //Pregunto para saber el formato de la fecha
        if (fecha.contains("/")){
            campos = fecha.split("/");
            year = Integer.parseInt(campos[2]);
        }
        
        else{
            campos = fecha.split("-");
            year = Integer.parseInt(campos[2]);
        }
        
        return year;
    }
    
    
    public static String fechaBonita(int d,int m,int y){
        
        
        String fechaBonita="";
        
        String []nombreMeses={"","enero","febero","marzo","abril","mayo","junio",
                              "julio","agosto","septiembre","octubre","noviembre","diciembre"};
        
        //fechaBonita = d+" de "+nombreMeses[m]+" de "+y;
        fechaBonita= String.format("<%d de %s de %d>",d,nombreMeses[m],y);
        
        
        return fechaBonita;
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
