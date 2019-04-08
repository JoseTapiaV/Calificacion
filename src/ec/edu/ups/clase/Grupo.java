/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Jose Tapia
 */
public class Grupo {

  
    private int codigoG;
    private String nomG;
    private int cupo;

    
    
    public Grupo(int codigoG, String nomG, int cupo) {
        this.codigoG = codigoG;
        this.nomG = nomG;
        this.cupo = cupo;
    }

    
    
    public void setCodigoG(int codigoG) {
        this.codigoG = codigoG;
    }

    public void setNomG(String nomG) {
        this.nomG = nomG;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    
    public int getCodigoG() {
        return codigoG;
    }

    public String getNomG() {
        return nomG;
    }

    public int getCupo() {
        return cupo;
    }
      @Override
    public String toString() {
        return "\nGrupo:" + "\nCodigo Grupo=" + codigoG + "\nNombre Grupo=" + nomG + "\nCupo=" + cupo + '.';
    }
}
