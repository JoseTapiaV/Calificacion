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
 * @author Domenica Cañizares
 */
public class Estudiante extends Persona 
{
    private Carrera carrera;
        
    public Estudiante()
    {
         
    }

    //set
    public void setCarrera(Carrera carrera)
    {
        this.carrera = carrera;
    }

    //get
    public Carrera getCarrera() 
    {
        return carrera;
    }   
}
