package co.edu.uniquindio.preparcialp1.model;

import java.util.ArrayList;

public class Clase {
    private ArrayList<Estudiante> listaEstudiante = new ArrayList<>();

    public Clase(){}

    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(ArrayList<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }
}
