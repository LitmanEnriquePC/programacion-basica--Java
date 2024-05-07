
package ejercicios_java;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
/**
*Crear un programa que calcule el indice de masa corporal de una persona: datos a ingresar
* peso de la persona
*estatura de la persona
*dividir el peso por la estatura y elevarlo al cuadrado
*IMC < 16 delgadez severa  [25-30] sobrepeso
*16,17 delgadez moderada [30 -35] obecidad leve
*17,18.5 delgadez leve [35-40] obecidad moderada
*18.5 - 25 peso normal  >40 obecidad morbida
* IMC= peso/estatura ele vado al cuadrado
*/

public class masa_corporal {
    
    public static double calcularIMC(double peso, double estatura){
        return peso / Math.pow(estatura,2);
    }
    
    public static String nivelDePeso(double IMC) {
        if (IMC <= 16)
            return "Delgadez severa";
        else if (IMC <= 16 && IMC <= 17)
            return "delgadez moderada";
        else if (IMC <= 17 && IMC <= 18.5)
            return "delgadez leve";
        else if (IMC <= 18.5 && IMC <= 25)
            return "Peso normal";
        else if (IMC <= 18.5 && IMC <= 25)
            return "sobrepeso";
        else if (IMC <= 25 && IMC <= 30)
            return "obecidad leve";
        else if (IMC <= 30 && IMC <= 35)
            return "obecidad moderada";
        else if (IMC >= 40)
            return "obecidad morbida";
        return null;
            
                    
    }
    
    public static void main(String[] args) {
    
    Scanner lector = new Scanner(System.in);
    
    double peso, estatura;
    
     System.out.println( "Ingrese su peso: ");
     peso = lector.nextDouble();
     System.out.println( "Ingrese su altura: ");
     estatura = lector.nextDouble();
     
     System.out.println("Su nivel de peso es:"+nivelDePeso(calcularIMC(peso, estatura)));
    
    
    }
}
