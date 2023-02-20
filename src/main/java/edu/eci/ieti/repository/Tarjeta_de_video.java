package edu.eci.ieti.repository;

public class Tarjeta_de_video extends Componente{

    private String procesador;
    private int memoria;
    private double core_clock;
    private double boost_clock;
    private int largo;

    public Tarjeta_de_video(String nombre) {
        super(nombre);
    }
}
