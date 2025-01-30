package es.albarregas.beans;

import java.io.Serializable;
import java.util.Objects;

public class Profesor implements Serializable {
    private int id;
    private String nombre;
    private String ape1;
    private String ape2;

    public Profesor(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(nombre, profesor.nombre) && Objects.equals(ape1, profesor.ape1) && Objects.equals(ape2, profesor.ape2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ape1, ape2);
    }
}
