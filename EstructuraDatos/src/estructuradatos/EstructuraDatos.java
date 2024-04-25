
package estructuradatos;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class EstructuraDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("|-------------------|");
            System.out.println("|Estructura de datos|");
            System.out.println("|-------------------|");
            System.out.println("|  1.- Array        |");
            System.out.println("|  2.- ArrayList    |");
            System.out.println("|  3.- HasMap       |");
            System.out.println("|  4.- Salir        |");
            System.out.println("|-------------------|");
            
            System.out.println("___________________");
            System.out.print( "|Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Bienvenido a la ED Array");
                    int[] edades = {12,40,30,50,7,5,60,70,100};
                    String[] nombres = {"Litman","Carlo","Daniel","Ariel"};
                    
                    //Longitud del array
                    System.out.println("Longitud edades: "+ edades.length);
                    System.out.println("Longitud nombres: "+ nombres.length);
                    
                    //Canbiar un valor
                    edades[1] = 38;
                    nombres[3] = "David";
                    System.out.println("Nuevo dato edad: " + edades[1]);
                    System.out.println("Nuevo dato nombre: " + edades[1]);
                    
                    //Convertir un Array a String
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                    
                    //Clonar
                    int[] edadesClon = edades.clone();
                    System.out.println("Array clonado: "+ Arrays.toString(edadesClon));
                    
                break;
                default:
                throw new AssertionError();
                
            case 2:
                System.out.println("Bienvenido a ArrayList");
                
                ArrayList<String> ListaNombres = new ArrayList<>();
                
                //Agregar datos a la ArrayList == ListaNombres
                ListaNombres.add("David");
                ListaNombres.add("Marco");
                ListaNombres.add("Julio");
                
                //Longitud de la lista
                System.out.println("Tamaño Lista: "+ ListaNombres.size());
                
                //Remover un elemento de la lista 
                ListaNombres.remove(2);
                
                //Obtener un elemento de la lista
                System.out.println("Elemento obtenid: "+ ListaNombres.get(1));
                
                //Comprobar si la lista esta vacia
                System.out.println("¿Lista vacia?: "+ ListaNombres.isEmpty());
                
                
               //Comprobar si un elemento existe
                System.out.println("Existe: "+ ListaNombres.contains("Marco"));
             break;
               
            }
        }
        scanner.close();
    }
    
}
