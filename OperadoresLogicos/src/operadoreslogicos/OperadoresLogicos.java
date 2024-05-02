//LITMAN ENRIQUE PORTILLO COLQUE
package operadoreslogicos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //Operador AND (&&)
        boolean resultadoAnd = esVerdadero && esFalso;    
        System.out.println("AND: "+ resultadoAnd);
        
        //Operador OR (||)
        boolean resultadoOR = esVerdadero || esFalso;
        System.out.println("OR: "+ resultadoOR);
        
        //Operador NOT (!)
        boolean resultadoNOT = !esVerdadero;
        System.out.println("NOT "+ resultadoNOT);     
    }
    
}

