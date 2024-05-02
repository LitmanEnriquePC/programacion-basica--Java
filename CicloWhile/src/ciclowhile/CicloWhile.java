//LITMAN ENRIQUE PORTILLO COLQUE
package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner (System.in);
        
        while(!salir){
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("-/   Bienvenido a      -/");
            System.out.println("-/   1.- Saludar       -/");
            System.out.println("-/   2.- Despedirse    -/");
            System.out.println("-/   3.- Cobrar        -/");
            System.out.println("-/   4.- Escapar       -/");
            System.out.println("-/   5.- Salir         -/");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-");
        
        
        
            int Opcion = scanner.nextInt();

            switch(Opcion) {
                case 1:
                    System.out.println("Buenos dias");
                    break;
                case 2:
                    int[] numeros = {1,2,3,4,5};
                    //Object[] NumerosLetras = {12, "Litman", 123.21, true, "Enrique"};
                    //for(Object NL:NumerosLetras){
                        //System.out.println(NL);
                    
                    
                    for(int n=0;n<numeros.length;n++) {
                        if(numeros[n] == 2){
                            System.out.print("Numero encontrado: ");
                        }else{
                            System.out.print("No encontrado: ");
                        
                        }
                        System.out.println(numeros[n]);
                    }
                        
                        System.out.println("Bueno ya me voy");
                    break;
                case 3:
                    System.out.println("Quiero que me pagues");
                    break;
                case 4:
                    System.out.println("Y se fue (se escapo)");
                    break;
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar nuestro menu.");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
                    //throw new AssertionError();
                
                
            }
        
        }
        scanner.close();
       
    }
    
}
