/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_stream;

/**
 *
 * @author hp
 */
public class Persona {
    private String Nombre;
    private String Apellido1;
    private String Apellido2;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido1, String Apellido2) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }
    
    public void mostrarnombre () {
        String nombre = Nombre + " " + Apellido1 + " " + Apellido2;
    }
    
}
