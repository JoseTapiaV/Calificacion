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
public class Materia {

   
    private int codigoM;
    private String nombreM;
    private int numCreditos;
    private int numHoras;
    private int nivelM;
    private Grupo grupos;
    private Profesor profesores;

    public Materia(int codigoM, String nombreM, int numCreditos, int numHoras, int nivelM) {
        this.codigoM = codigoM;
        this.nombreM = nombreM;
        this.numCreditos = numCreditos;
        this.numHoras = numHoras;
        this.nivelM = nivelM;
        this.grupos = grupos;
        this.profesores = profesores;
    }

    
    public void setCodigoM(int codigoM) {
        this.codigoM = codigoM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public void setNivelM(int nivelM) {
        this.nivelM = nivelM;
    }

    public void setGrupos(Grupo grupos) {
        this.grupos = grupos;
    }

    public void setProfesores(Profesor profesores) {
        this.profesores = profesores;
    }

    
    public int getCodigoM() {
        return codigoM;
    }

    public String getNombreM() {
        return nombreM;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public int getNivelM() {
        return nivelM;
    }

    public Grupo getGrupos() {
        return grupos;
    }

    public Profesor getProfesores() {
        return profesores;
    }
     @Override
    public String toString() {
        return "\nMateria:" + "\nCodigo Materia=" + codigoM + "\nNombre materia=" + nombreM + "\nNumero de Creditos=" + numCreditos + "\nNumero de horas=" + numHoras + "\nNivel de materia=" + nivelM + "\nGrupo=" + grupos + "\nProfesores=" + profesores + '.';
    }
}
