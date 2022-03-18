package com.jdg.taller_2_gomezdelgado_josedavid;

import java.io.Serializable;

public class Jugadores implements Serializable {

    String nombre;

    public Jugadores(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
