/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author seiji
 */
public class Categoria {

    private int id;
    private String nombre;

    private ArrayList<Pregunta> listaPreguntas = new ArrayList();

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

   public Categoria() {
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

    public ArrayList<Pregunta> getListaPreguntas() {
        return listaPreguntas;
    }

    public void setListaPreguntas(ArrayList<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    public Pregunta buscarPreguntaAleatoria() {

        int index = (int) (Math.random() * listaPreguntas.size());
        return listaPreguntas.get(index);
    }
    
    

}
