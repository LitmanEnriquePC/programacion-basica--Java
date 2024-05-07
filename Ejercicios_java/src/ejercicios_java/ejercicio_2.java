/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_java;

//Crear un programa que te permita ingresar 3 numeros y que el primer numero tienda a mostrar el doble de su valor, el segundo numero el triple de su valor y el tercer numero el cuadruple

import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class ejercicio_2 {
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner ( System.in);
         
         int n1, n2, n3;
         
         
         System.out.println( "Ingrese el primero numero: ");
         
         n1 = teclado.nextInt();
         
         System.out.println( "Ingrese el segundo numero: ");
         
         n2 = teclado.nextInt();
         
         System.out.println( "Ingrese el tercer numero: ");
         
         n3 = teclado.nextInt();
         
         
         
         
         System.out.println( "El numero aumentado del primero numero es  : "+n1*2);
         System.out.println( "El numero aumentado del segundo numero es  : "+n1*3);
         System.out.println( "El numero aumentado del tercer numero es  : "+n1*4);
    }
}
