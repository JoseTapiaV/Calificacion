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
public class Carrera {

    private int codigoC;
    private String nombreC;
    private List<Materia> materias=new ArrayList();
    private int numSemestre;
    private int numEst;
    private String Titulo;

    public Carrera(int codigoC, String nombreC, int numSemestre, int numEst, String Titulo) {
        this.codigoC = codigoC;
        this.nombreC = nombreC;
        this.numSemestre = numSemestre;
        this.numEst = numEst;
        this.Titulo = Titulo;
    }
    
    
    
    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public void setNumEst(int numEst) {
        this.numEst = numEst;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getCodigoC() {
        return codigoC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public int getNumSemestre() {
        return numSemestre;
    }

    public int getNumEst() {
        return numEst;
    }

    public String getTitulo() {
        return Titulo;
    }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
    @Override
    public String toString() {
        return "\nCarreras:" + "\nCodigo Carrera=" + codigoC + "\nNombre Carrera=" + nombreC + "\nMaterias=" + materias + "\nNumero de Semestres=" + numSemestre + "\nNumero de Estudiantes=" + numEst + "\nTitulo=" + Titulo + '.';
    }
}
