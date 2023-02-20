package edu.eci.ieti.repository;

public class Fuente_de_poder extends Componente{

    private String tipo;
    private int indice_de_eficiencia;
    private int potencia_en_watts;
    private String modular;

    public Fuente_de_poder(String nombre) {
        super(nombre);
    }
}
