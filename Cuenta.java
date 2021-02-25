/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeJava;

/**
 *
 * @author Bryant
 */
import java.util.Scanner;

public class Cuenta 
{
   static Scanner s = new Scanner(System.in);
   public static String titular;
   public static double cantidad;
   public static double banco = 300;
   public static double CantidadEnBanco=0;
   public static double CantidadFinal=0;
   
   public void setTitular(String Titular)
   {
       this.titular = titular;
   }
   
   public String getTitular()
   {
       return titular;
   }
   
   public void setCantidad(Double cantidad)
   {
       this.cantidad = cantidad;
   }
   
   public double getCantidad()
   {
       return cantidad;
   }
   
   public Cuenta(){
       
   }
   public Cuenta(String _titular)
        {
            titular = _titular;
        }
    public Cuenta(String _titular, double _cantidad)
        {
            _titular = titular;
            _cantidad = cantidad;
        }
    public String toString(){
        return "El nombre del titular es: "+ titular + "y la cantidad ingresada es: "+ cantidad;
    }
    
    public static void Ingresar(){
        System.out.println("Ingrese una cantidad para iniciar");
        cantidad = s.nextDouble();
        CantidadEnBanco = cantidad + banco;
        if (cantidad<=0) {
            System.out.println("Usted no ha ingresado nada, no se puede realizar ninguna operación");
        }
        else
            System.out.println("Cantidad introducida satisfactoriamente");
       
    }
    
    public static void Retirar(){
        System.out.println("Ingrese una cantidad para retirar");
        cantidad = s.nextDouble();
//        if(cantidad==0)
//            System.out.println("Lo sentimos el saldo en su cuenta es de $0.00");
//        cantidad = 0;
        System.out.println("Cantidad retirada satisfactoriamente");
        CantidadFinal = CantidadEnBanco - cantidad;
        System.out.println("El dinero que hay en la cuenta es de : " + CantidadFinal);
    }
}
