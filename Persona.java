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
public class Persona 
{
    String nombre,sexo;
    int edad,rfc,resto;
    double peso,altura;
    static final int num = 1;
    static final int num2 = 0;
    static final int num3 = -1;
    
    public Persona()
    {
        
    }
    public Persona(String _nombre,int _edad,String _sexo)
    {
        _nombre = nombre;
        _edad = edad;
        _sexo = sexo;
    }
    public Persona(String _nombre,int _edad,String _sexo,int _resto)
    {
        _nombre = nombre;
        _edad = edad;
        _sexo = sexo;
        _resto = resto;
        
    }
    public void CalcularIMC()
    {
        if (peso/altura*2*2<=20) 
        {
            return num3;
        }
        if ((peso/altura* 2 * 2) >=20 && <=25) 
        {
            return num2;
        }
        if ((peso/altura * 2 *2) >=25)
        {
            return num;
        }
        
    }
    public void esMayorDeEdad()
    {
        if (edad>=18)
        {
            return(true)
        }
        else
        {
            return(false)
        }
        }
    public void ComprobarSexo()
    {
        if (!(sexo=="M" || sexo=="H")) 
        {
            return("H")
        }  
    }
    public String toString()
     {
         System.out.println("El nombre es: "+ nombre + "Su edad es: " + edad + "Su sexo es: "+ sexo + "El resto es: "+ resto);
     }
}
