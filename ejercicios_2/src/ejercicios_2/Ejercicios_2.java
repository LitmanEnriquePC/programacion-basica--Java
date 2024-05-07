
package ejercicios_2;

import java.util.Scanner;


public class Ejercicios_2 {
    /*
    *Pedir el dia mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28 30 y 31 dias.
    */
  /*  
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       System.out.print("Ingrese el dia: ");
       int dia = sc.nextInt();
       System.out.print("Ingrese el mes: ");
       int mes = sc.nextInt();
       System.out.print("Ingrese el año: ");
       int año = sc.nextInt();
       if(año>=1989 && año<= 2050) {
           if(mes >=1 && mes<=12){
               System.out.println("año y mes ");
           }
           System.out.println("el año es correcto");
       }else {
           System.out.println("año no valido");
           
       }
    }
    
}
*/
    
    public static void main(String[] args) {
        int dia, mes, año;
        
        System.out.println( "Ingrese el mes: ");
        dia=Entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        mes=Entrada.nextInt();
        System.out.println("Ingrese el año ");
        año=Entrada.nextInt();
        
        if(año==0){
            System.out.println("La fecha es incorrecta");
            
        else{
                if(mes==2 && (dia>=1 && dia<=28))
                    System.out.println(dia+"/"+mes+"/"+año+" fecha correcta");
                else{
                    if(mes==4 || mes==9 || mes==6 || mes==11 && (dia>=1 && dia<=30))
                    System.out.println(dia+"/"+mes+"/"+año+" fecha correcta");
                
                }
                }
        }
        
    }

