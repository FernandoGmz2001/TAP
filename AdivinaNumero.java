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
public class AdivinaNumero 
{
    public static void main (String[]args)
    {
        double n1,n2;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Jugador 1 : Ingrese un número: ");
        n1 = scanner.nextDouble();
   
        do{
            System.out.println("Jugador 2 : Intente adivinar el número ingresado por el Jugador 1: ");
            n2 = scanner.nextDouble();
            
        if (n2==n1) 
        System.out.println("Wow, acertaste, el número adivinado es: " + n2);
        else if (n2>n1)
            System.out.println("Te pasaste de número, es menos");
        else if (n2<n1)
            System.out.println("Casi, pero no, es más");
        }
        
        while (!(n2==n1));

        
    }
   
}
