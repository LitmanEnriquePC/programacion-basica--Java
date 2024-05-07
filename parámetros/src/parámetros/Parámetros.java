
package parámetros;

public class Parámetros {

  
    public static void main(String[] args) {
    
        String Persona;
        
        
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        p1.nombre = "Juan";
        p1.apellidos = "Gonzalez";
        p2.nombre = "Luis";
        p2.apellidos = "Gomez";
        p1.mostrarNombre();
        p2.mostrarNombre();
    }
}
