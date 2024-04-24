
package operacionesconcadenas;

public class OperacionesConCadenas {

    public static void main(String[] args) {
        String Nombres = "Litman Enrique";
        String Apellidos = "Portillo Colque";
        
        //Concatenar
        String NombreCompleto = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto1.toUpperCase());
        
        //Minusculas
        String NombreCompleto2 = Nombres +" "+ Apellidos;
        System.out.println("Nombre Completo: "+ NombreCompleto2.toLowerCase());
        
        //Contar Cadena
        String NombreCompleto3 = Nombres +" "+ Apellidos;
        System.out.println("Cantidad de caracteres: "+ NombreCompleto3.length());
        
        //Cortar una Cadena
        String NombreCompleto4 = Nombres +" "+ Apellidos;
        // ["Litman","Enrique"]
        String[] NombreCortado = NombreCompleto4.split(" ");
        //System.out.println("");  
        for(int i = 0 ; i<NombreCortado.length ; i++){
            System.out.println(NombreCortado[i]);
        }
        //for(String nombre: NombreCortado) { 
            //System.out.println(nombre);
        //}
        
        
        //Equals
       boolean comparacion = Nombres.equals(Nombres);
        System.out.println("Comparacion: "+ comparacion);
    
        //Imterpolacion de variables
        String n = "Litman";
        String a = "Portillo";
        int e = 18;
        
        String mensaje = String.format("Mi nombre es %s y mi apellido es %s tengo %d años", n, a, e );
        System.out.println(mensaje);
        
    }
        
       
}
   

