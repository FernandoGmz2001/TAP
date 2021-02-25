/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

/**
 *
 * @author Bryant
 */
import java.util.Scanner;
public class Cadenas8 {
    public static void main(String[] args)   
{      
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese una cadena: ");      
String s1 = scanner.next();      
System.out.print("Ingrese otra cadena: ");      
String s2 = scanner.next();      
// muestro las cadenas para verifi car lo que contienen      
System.out.println("s1 = [" + s1 + "]");      
System.out.println("s2 = [" + s2 + "]");      
// esto esta mal !!! 
if( s1 == s2 )      
{         
    System.out.println("Son iguales");      
}
else      
{         
    System.out.println("Son distintas");      
}   
}
}
