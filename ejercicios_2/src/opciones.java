
import java.util.Scanner;

public class opciones {
    
    public static void main(String[] args){
        
        Scanner teclado =  new Scanner( System.in);
        int numero, n1, n2, suma, Resta, multiplicacion, division;
        
        System.out.println( "Menu de operaciones");
        System.out.println( "1. suma");
        System.out.println( "2. Resta");
        System.out.println( "Selecione una de las opciones");
        numero=teclado.nextInt();
        
        switch(numero){
            
            case 1:
                System.out.println( "OPERACION DE LA SUMA");
                System.out.println( "Numero 1: ");
                n1=teclado.nextInt();
                System.out.println( "Numero 2: ");
                n2=teclado.nextInt();
                
                suma = n1+n2;
                
                
                System.out.println( "El resultado de la suma es: "+suma);
                break;
                
                
            case 2:
                System.out.println( "OPERACION DE LA RESTA");
                System.out.println( "Numero 1: ");
                n1=teclado.nextInt();
                System.out.println( "Numero 2: ");
                n2=teclado.nextInt();
                
                Resta = n1+n2;
                
                
                System.out.println( "El resultado de la resta es: "+Resta);
                break;
                
            case 3:
                
                System.out.println( "OPERACION DE LA MULTIPLICACION");
                System.out.println( "Numero 1: ");
                n1=teclado.nextInt();
                System.out.println( "Numero 2: ");
                n2=teclado.nextInt();
                
                multiplicacion = n1*n2;
                
                
                System.out.println( "El resultado de la multiplicacion es: "+multiplicacion);
                break;
                
            case 4:
                
                System.out.println( "OPERACION DE LA DIVISION");
                System.out.println( "Numero 1: ");
                n1=teclado.nextInt();
                System.out.println( "Numero 2: ");
                n2=teclado.nextInt();
                
                division = n1/n2;
                
                
                System.out.println( "El resultado de la division es: "+division);
                break;
                
            default :
                System.out.println( "Numero no acpetado");
        }
    }
}


/*
Pedir un numero del 10 al 90 y mostrarlo por escrito: Ejemplo 12 -> DOCE
*/