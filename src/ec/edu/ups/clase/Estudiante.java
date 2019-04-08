/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Tapia
 */
public class Estudiante extends Persona 
{
    private Carrera carrera;
        
    public Estudiante()
    {
                 
    }
    
    public Estudiante(int codigo)
    {
        super(codigo);                
    }
        
    public Estudiante(int codigo, String nombre, String cedula)
    {
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String dereccion, String correo) {
        super(codigo, nombre, cedula, telefono, dereccion, correo);
    }

    public void setCarrera(Carrera carrera)
    {
        this.carrera = carrera;
    }

    public Carrera getCarrera() 
    {
        return carrera;
    } 
    @Override
    public String toString() {
        return "\nEstudiante:" + "\nCarrera=" + carrera + '.';
    }
}
