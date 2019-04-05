/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;
import ec.edu.ups.clase.Carrera;
import ec.edu.ups.clase.Estudiante;
import ec.edu.ups.clase.Grupo;
import ec.edu.ups.clase.HistorialCalificacionEstudiante;
import ec.edu.ups.clase.Materia;
import ec.edu.ups.clase.Persona;
import ec.edu.ups.clase.Profesor;
import ec.edu.ups.clase.Sede;

/**
 *
 * @author Jose Tapia
 */
public class prueba 
{
    Sede sedeCuenca=new Sede(1, "Sede Cuenca","Calle Vieja 12-30", "4051185");
    Carrera carreraComputacion= new Carrera(1, "Computacion", 10, 30,"Ciencias de la Computacion");
    Carrera carreraTelematica=new Carrera(2, "Telematica", 10, 40, "Telematica");
    Carrera carreraMecatronica=new Carrera(3, "Mecatronica", 10, 50, "Mecatronica");
    Materia Uno=new Materia(11,"Programacion", 23, 200, 2);
    Materia Dos=new Materia(22,"Ecuaciones Diferecnailes",24,150,3);
    Materia Tres=new Materia(33,"Estructura de Datos",25,151,4);
    Materia Cuatro=new Materia(44,"Calculo de una variable",26,152,5);
    Materia Cinco=new Materia(55,"Programacion Aplicada", 27, 153,6);
    Materia Seis=new Materia(66, "Introduccion a la programacion", 28, 154, 7);
    //2profe
    //2 grupo
    //4 estudiantes
}
