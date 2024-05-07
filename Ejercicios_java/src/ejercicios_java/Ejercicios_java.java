
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @Jose Luis
 */
public class Ejercicios_java {

    /**
     * @param args the command line arguments
     */
    
    // ingresar por teclado los numeros y guardarlas en distintas variables y luego imprimirlas.
    
    
    public static void main(String[] args) {
        System.out.println( "Hello world! " );
        
        Scanner teclado = new Scanner ( System.in);
        
        System.out.println( "Ingrese un numero: ");
        int a = teclado.nextInt();
        
        System.out.println( "Ingrese un numero: ");
        int b = teclado.nextInt();
        
        System.out.println(a +"los numeros a mostrar son" );
    }
    
}
