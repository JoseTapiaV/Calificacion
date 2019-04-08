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
public class Sede {
    
    private int codigoS;
    private String nomS;
    private String direcS;
    private String telfS;
    private List<Carrera> carreras=new ArrayList();
    
    public Sede(int codigoS, String nomS, String direcS, String telfS) {
        this.codigoS = codigoS;
        this.nomS = nomS;
        this.direcS = direcS;
        this.telfS = telfS;
    }
    
    public Sede(){
        
     }


    public void setCodigoS(int codigoS) {
        this.codigoS = codigoS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public void setDirecS(String direcS) {
        this.direcS = direcS;
    }

    public void setTelfS(String telfS) {
        this.telfS = telfS;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
    
   
    public int getCodigoS() {
        return codigoS;
    }

    public String getNomS() {
        return nomS;
    }

    public String getDirecS() {
        return direcS;
    }

    public String getTelfS() {
        return telfS;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }
    
    public void agregarCarrera(Carrera carrera){
       carreras.add(carrera);
    }  
    @Override
    public String toString() {
        return "\nSede: \n" + "Codigo Sede=" + codigoS + "\nNombre Sede=" + nomS + "\nDireccion Sede=" + direcS + "\nTelefono Sede=" + telfS + "\nCarreras=" + carreras + '.';
    }
}
