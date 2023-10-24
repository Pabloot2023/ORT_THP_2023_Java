package ej_parcial_3_1;

import java.util.ArrayList;

class Departamento {
    private int numeroUnidad;
    private String dniPropietario;
    private String nombrePropietario;
    private char voto;

    public Departamento(int numeroUnidad, String dniPropietario, String nombrePropietario) {
        this.numeroUnidad = numeroUnidad;
        this.dniPropietario = dniPropietario;
        this.nombrePropietario = nombrePropietario;
        this.voto = ' '; // Inicialmente, el voto está en blanco
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public char getVoto() {
        return voto;
    }

    public void actualizarVoto(char voto) {
        this.voto = voto;
    }
}
