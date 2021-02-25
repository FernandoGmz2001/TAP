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
public class Alreves {
    public static void main (String[] args)
    {
       int n1, ninvertido=0,resto;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Introduzca un número para invertirlo");
       n1 = scanner.nextInt();
       
       while(n1>0)
       {
           resto=n1%10;
           n1 = n1/10;
           ninvertido = ninvertido*10 + resto;
       }
       System.out.println("El número ya invertido es : " + ninvertido);
       
    }
}
