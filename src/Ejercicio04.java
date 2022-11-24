
import java.time.Year;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juan.antonio
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce una fecha (dd/mm/aaaa): ");
        String fecha=teclado.nextLine();
        int dia=getDia(fecha);
        int mes=getMes(fecha);
        int year=getYear(fecha);
        
        switch(fechaCorrecta(dia,mes,year)){
            case 0:   
                System.out.println("Fecha introducida: "+imprimirFechaExt(dia,mes,year));
                break;
            case 1:
                System.out.printf("La fecha %d/%d/%d es \033[31mINCORRECTA (día incorrecto)\n",dia,mes,year);
                break;
            case 2:
                System.out.printf("La fecha %d/%d/%d es \033[31mINCORRECTA (mes incorrecto)\n",dia,mes,year);
                break;
            case 3:
                System.out.printf("La fecha %d/%d/%d es \033[31mINCORRECTA (año incorrecto)\n",dia,mes,year);
                break;
        }
        
    }
    
    public static String imprimirFechaExt(int d, int m, int y){
        String fechaExtendida="";
        
        String []nombreMes={
            "","enero","febrero","marzo","abril","mayo","junio",
            "julio","agosto","septiembre","octubre","noviembre","diciembre"
        };
        
        fechaExtendida=d+" de "+nombreMes[m]+" del "+y;
        
        //OPCION:Usando String.format para formar la cadena
        fechaExtendida=String.format("%d de %s del %d",d,nombreMes[m],y);
        
        
        return fechaExtendida;
        
    }
    
    public static int fechaCorrecta(int dia, int mes, int year){
        boolean yearCorrecto=false;
        boolean mesCorrecto=false;
        boolean diaCorrecto=false;
        
       
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
                mesCorrecto=false;  //esto no seria necesario
                diaCorrecto=false;  //esto no seria necesario
               
       }
        
        //Llegado a este punto, tengo tres variables booleanas
        //que me indican si son o no correctos el año, mes u dia
        if (mesCorrecto==false){
            return 2;
        }else if (diaCorrecto==false){
            return 1;
        }else if (yearCorrecto==false){
            return 3;
        }else{
            return 0;
        }
               
        
    }//fin funcion fechaCorrecta()
    
    public static int getDia(String fecha){
        String[]campos=fecha.split("/");
        String dia=campos[0];
        return Integer.parseInt(dia);
    }
    public static int getMes(String fecha){
        String[]campos=fecha.split("/");
        String mes=campos[1];
        return Integer.parseInt(mes);
    }
    public static int getYear(String fecha){
        String[]campos=fecha.split("/");
        String year=campos[2];
        return Integer.parseInt(year);
    }
    
}
