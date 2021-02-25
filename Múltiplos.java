/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1;
import java.util.Scanner;
/**
 *
 * @author Bryant
 */
public class Múltiplos {
    public static void main (String[]args)
    {
        //dos numeros y saber si son multiplo del otro
        double n1,n2,resultado;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        n1 = scanner.nextDouble();
        System.out.println("Ingrese un segundo número: ");
        n2 = scanner.nextDouble();
        
        if (n1 % n2 == 0)
            System.out.println("Los números son múltiplos del otro");
        
        else
            System.out.println("Los números no son múltiplos del otro");   
    }
}
