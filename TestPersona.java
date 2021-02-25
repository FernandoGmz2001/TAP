/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeJava;
import java.util.Scanner;
/**
 *
 * @author Bryant
 */
public class TestPersona extends Persona
{
    public static void main (String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = s.nextLine();
         System.out.println("Ingrese su edad: ");
        edad = s.nextInt();
         System.out.println("Ingrese su sexo: ");
        sexo = s.nextLine();
         System.out.println("Ingrese su altura: ");
        altura = s.nextInt();
        
        
    }
    
}
