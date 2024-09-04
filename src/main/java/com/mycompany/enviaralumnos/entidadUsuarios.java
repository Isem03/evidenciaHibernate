package com.mycompany.enviaralumnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


/**
 *
 * @author isadev
 */
@Entity
@Table(name = "ingreso")

public class entidadUsuarios {

    public entidadUsuarios(String princesa, int par) {
    }
    
    @Column(name="nombre")
    private String nombre;
    @Column(name="pass")
    private int pass;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "entidadUsuarios{" + "nombre=" + nombre + ", pass=" + pass + '}';
    }
    
    
    
}
