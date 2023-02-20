package edu.eci.ieti.repository;

public class CPU extends Componente{

    private int nucleos;
    private double rendimiento_core_clock;
    private double rendimiento_boost_clock;
    private String TDP;
    private String SMT;

    public CPU(String nombre) {
        super(nombre);
    }
}
