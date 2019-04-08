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
    Profesor pro1=new Profesor("Ingeniero", 852, "Profesor", 12, "Jose", "0106620255", "4058115", "Altiplano", "profe164ups.edu.ec");
    Profesor pro2=new Profesor("Ingeniero", 984, "Director de carrera", 11, "Andres", "012345679", "48520", "Huaynacapac", "pro2ups.edu.ec");
    Grupo g1=new Grupo(1, "Grupo 1", 12);
    Grupo g2=new Grupo(2, "Grupo 2", 13);
    Estudiante e1=new Estudiante(1, "Jose", "01066620255", "4051185", "Gonzales Suares", "jtapiav2@est.ups.edu.ec");
    Estudiante e2=new Estudiante(2, "Dennis", "010623487", "402698", "Americas", "dennis@est.ups.edu.ec");
    Estudiante e3=new Estudiante(3, "Byron", "0123456789", "402587", "Ricaurte", "byron@est.ups.edu.ec");
    Estudiante e4=new Estudiante(4, "Vinicio", "0987456321", "4032156", "Miraflores", "vinicio@est.ups.edu.ec");
}
