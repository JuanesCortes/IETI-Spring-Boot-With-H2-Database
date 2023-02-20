package edu.eci.ieti.repository;

public abstract class Componente {

    private String nombre;

    private double precio;

    private int valoracion;

    public Componente(String nombre){
        this.nombre=nombre;
    }
}
