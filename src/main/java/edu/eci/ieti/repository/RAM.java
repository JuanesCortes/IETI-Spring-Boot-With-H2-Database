package edu.eci.ieti.repository;

public class RAM extends Componente{

    private int velocidad;
    private int modulos;
    private String color;
    private int latencia;
    private int CAS_latencia;

    public RAM(String nombre) {
        super(nombre);
    }
}
