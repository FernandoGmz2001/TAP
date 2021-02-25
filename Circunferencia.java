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
public class Circunferencia {
    public static void main (String[]args)
    {
        double radio,circunferencia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        radio = scanner.nextDouble();
        
        circunferencia = 2 * Math.PI * radio;
        System.out.println("El perímetro de la circunferencia es: " + circunferencia);
        
        
               
    }
}
