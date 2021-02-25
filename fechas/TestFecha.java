/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;

/**
 *
 * @author Oscar
 */
public class TestFecha {
    public static void main (String[]args)
    {
        Fecha f = new Fecha();
        f.dia = 2;
        f.mes = 10;
        f.anio = 1970;
        
        System.out.println("Dia = "+f.getDia());
        System.out.println("Mes = "+f.getMes());
        System.out.println("Anio = "+f.getAnio());
        
        System.out.println(f);
        
    }
}
