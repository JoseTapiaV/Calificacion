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
public class Persona {
    private int codigo;
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private String correo;
    private Sede sede;

    public Persona() {
    }

    public Persona(int codigo) {
        this.codigo = codigo;
    }

    public Persona(int codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona(int codigo, String nombre, String cedula, String telefono, String dereccion, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = dereccion;
        this.correo = correo;
    }

    
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDereccion(String dereccion) {
        this.direccion = dereccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDereccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public Sede getSede() {
        return sede;
    }

    @Override
    public String toString() {
        return "\nPersona:" + "\nCodigo=" + codigo + "\nNombre=" + nombre + "\nCedula=" + cedula + "\nTelefono=" + telefono + "\nDireccion=" + direccion + "\nCorreo=" + correo + "\nSede=" + sede + '.';
    }
}
