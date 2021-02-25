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
public class ParOImpar2 {
    public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);      
    System.out.print("Ingrese un valor: ");
    int v=scanner.nextInt();      
    // obtenemos el resto de dividir v por 2int resto= v % 2;      
    // utilizando un if in-line      
    String mssg = (resto == 0 ) ? "es Par": "es Impar";       
    // muestro resultado      
    System.out.println(v+" "+mssg);   
}
    
}
