
package operacionesdecomparacion;

public class OperacionesDeComparacion {

    public static void main(String[] args) {
        int Uno = 20;
        int Dos = 32;
        
        
        //Igualdad
        boolean Op = Uno == Dos;
        System.out.println("Son Iguales: "+ Op);
        
        
        //Desigualdad
        boolean Op1 = Uno != Dos;
        System.out.println("Son Desiguales: "+ Op1);
        
        
        //Mayor que
        boolean Op2 = Uno > Dos;
        System.out.println("Es mayor: "+ Op2);
        
        
        //Menor que
        boolean Op3 = Uno < Dos;
        System.out.println("Es menor: "+ Op3);
        
        
        //Mayor o igual que
        boolean Op4 = Uno >= Dos;
        System.out.println("Mayor o igual: "+ Op4);
        
        
        //Menor o igual que
        boolean Op5 = Uno <= Dos;
        System.out.println("Menor o igual: "+ Op5);
        
       
    }
    
    
}
