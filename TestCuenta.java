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
public class TestCuenta extends Cuenta
{
    Cuenta miCuenta = new Cuenta("Campo obligatorio", 300);
    
    public static void main(String[]args)
    {
        int menú;
        Scanner s = new Scanner(System.in);     
        System.out.println("Ingrese el nombre del titular de la cuenta");
        titular = s.nextLine();
        if (titular == "") 
        {
            do
            {
                System.out.println("Usted no puede dejar el nombre de la cuenta vacío");
                System.out.println("Ingrese el nombre del titular de la cuenta");
                titular = s.nextLine();
            }
            while(titular=="");
        }
        System.out.println("Bienvenido " + titular );
        System.out.println("Elija la opción a la que quiera acceder: ");
        System.out.println("1.-Ingresar una cantidad \n2.-Retirar una cantidad \n3.-Salir");
        menú = s.nextInt();
         while(!(menú==1 || menú==2 || menú==3)){
         System.out.println("Tiene que ingresar un número válido");
    }
        
        if (menú == 1) 
        {
            Ingresar();
        }
        if (menú == 2) 
        {
            
            Retirar(); 
        }
        if (menú == 3)
        {
            System.out.println("Usted ha decidido salir del programa");
        }
        
        
    }    
  @Override
    public String toString() {
        return ("El saldo de su cuenta es de : " + cantidad); //To change body of generated methods, choose Tools | Templates.
    }
  
}
