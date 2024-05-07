
package ejercicios;

import java.util.Scanner;


public class Ejercicios {

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
        else if (IMC > 30 || IMC > 35) {
            if (IMC >= 40)
                return "obecidad morbida";
        } else return "obecidad moderada";
        return null;
           
    }
    public static void Ejercicios (String[] args){
    
    Scanner lector = new Scanner(System.in);
    
    double peso, estatura;
    
     System.out.println( "Ingrese su peso: ");
     peso = lector.nextDouble();
     System.out.println( "Ingrese su altura: ");
     estatura = lector.nextDouble();
     
     System.out.println("Su nivel de peso es:"+nivelDePeso(calcularIMC(peso, estatura)));
    
    }
}

