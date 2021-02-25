/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.misClases;
import libro.cap02.fechas.Fecha;
/**
 *
 * @author Oscar
 */
public class FechaDetallada extends Fecha
{
    private static String meses[]={
  "Enero"
 ,"Febrero"
 ,"Marzo"
 ,"Abril"
 ,"Mayo"
 ,"Junio"
 ,"Julio"
 ,"Agosto"
 ,"Septiembre"
 ,"Octubre"
 ,"Noviembre"
 ,"Diciembre"};
    
    public FechaDetallada(int dia, int mes, int anio)
 {
 // invocamos al constructor del padre
 super(dia,mes,anio);
 }
 public FechaDetallada(String s)
 {
 // invocamos al constructor del padre
 super(s);
 }
 public FechaDetallada()
 {
 // invocamos al constructor del padre
 super();
 }
    
    
    
    
    
    
    public String toString()
    {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
    }
    
    
    
    
    
    public class FechaHora extends FechaDetallada
{
 private int hora; private int minuto; private int segundo;
 public FechaHora(String sFecha,int hora,int min, int seg)
 {
 super(sFecha); this.hora = hora; this.minuto = min; this.segundo = seg; 
 }
 public String toString()
 {
 // invocamos al metodo toString de nuestro padre 
 return super.toString()+" ("+hora+":"+minuto+":"+segundo+")";
 }
   
}
    public FechaDetallada(int dia, int mes, int anio)
 {
 super(dia,mes,anio);
 }
 public FechaDetallada()
 {
 // invocamos al constructor de tres int pasando ceros
 this(0,0,0);
 } 
}
