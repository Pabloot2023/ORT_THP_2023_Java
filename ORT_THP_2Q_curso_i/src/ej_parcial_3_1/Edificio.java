package ej_parcial_3_1;

import java.util.ArrayList;

class Edificio {
    private String direccion;
    private int cantidadDepartamentos;
    private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

    public Edificio(String direccion, int cantidadDepartamentos) {
        this.direccion = direccion;
        this.cantidadDepartamentos = cantidadDepartamentos;
    }

    public void agregarUnidad(int numeroUnidad, String dniPropietario, String nombrePropietario) {
        // Validar que el número de unidad no haya sido ingresado previamente
        for (Departamento departamento : departamentos) {
            if (departamento.getNumeroUnidad() == numeroUnidad) {
                System.out.println("Error: El número de unidad ya existe.");
                return;
            }
        }

        Departamento nuevoDepartamento = new Departamento(numeroUnidad, dniPropietario, nombrePropietario);
        departamentos.add(nuevoDepartamento);
        System.out.println("Departamento agregado con éxito.");
    }

    public void actualizarVoto(int numeroUnidad, char voto) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNumeroUnidad() == numeroUnidad) {
                departamento.actualizarVoto(voto);
                System.out.println("Voto actualizado con éxito.");
                return;
            }
        }
        System.out.println("Error: La unidad especificada no existe.");
    }

    public void listarVotosPositivos() {
        int votosPositivos = 0;
        for (Departamento departamento : departamentos) {
            if (departamento.getVoto() == 'S') {
                System.out.println("Unidad " + departamento.getNumeroUnidad() + " votó por despedir al encargado.");
                votosPositivos++;
            }
        }

        double porcentaje = (votosPositivos * 100.0) / departamentos.size();
        System.out.println("Porcentaje de unidades que votaron positivamente: " + porcentaje + "%");
    }
}

