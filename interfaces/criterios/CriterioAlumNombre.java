/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.Interfaces.criterios;
import libro.cap02.interfaces.Alumno;
/**
 *
 * @author Bryant
 */
// heredo de Criterio especializando en Alumno
public class CriterioAlumNombre extends Criterio<Alumno>
{
    public int comparar(Alumno a, Alumno b)   
    {
        return a.getNombre().compareTo(b.getNombre());   
    }
}
