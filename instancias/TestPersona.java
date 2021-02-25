/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.instancias;
import libro.cap02.misClases.FechaDetallada;
/**
 *
 * @author Oscar
 */
public class TestPersona {
    
    public static void main(String[] args)
 {
 Personas p1 = new Personas("Juan"
 ,"21773823"
 ,new FechaDetallada(23,3,1971));
 Personas p2 = new Personas("Pablo"
 ,"19234452"
 ,new FechaDetallada(12,6,1968));
 System.out.println(p1);
 System.out.println(p1);
 System.out.println(p1);
 System.out.println("---");
 System.out.println(p2);
 System.out.println(p2);
 System.out.println("---");
 System.out.println(p1);
 System.out.println(p1);
 }
}
