/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidad1;

/**
 *
 * @author Bryant
 */
import java.util.Scanner;
public class Radio 
{
    public static void main (String[]args)
    {
    double radio,area;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Capture el radio del círculo");
    radio = scanner.nextDouble();
    
    area = Math.PI*(radio*radio);
    System.out.println("El área del círculo es: " + area);
    
    }
}
