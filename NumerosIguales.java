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
public class NumerosIguales {
    public static void main (String []args)
    {
        double num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Ingrese un segundo número: ");
        num2 = scanner.nextDouble();
        
        if (num1 == num2) 
        {
            System.out.println("Los números son iguales");
        }
        else
        {
            System.out.println("Los números son diferentes");
        }
        
        
              
    }
}
