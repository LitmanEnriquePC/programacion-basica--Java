package functionprueba;
import java.util.Scanner;
public class FunctionPrueba {
    public static void main(String[] args) {
        // Defino un ususario y una contraseña 
        String Usuario = "System";
        String Contraseña = "admin123";
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese su usuario:");
            Usuario = scanner.nextLine();
        System.out.println("Ingrese su usuario: ");
            Contraseña = scanner.nextLine();
            
        if (Usuario.equals("System") && (Contraseña.equals("admin123"))) {
            System.out.println("Inicio de sesion Exitoso");
        } else {
            System.out.println("Incorrect Password");
        
        
        
        }

     
    }
    
}
