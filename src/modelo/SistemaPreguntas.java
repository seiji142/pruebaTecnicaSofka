/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alumnoFI
 */
public class SistemaPreguntas {

    private int numero = 1;

    private ArrayList<Opcion> opciones = new ArrayList();

    private ArrayList<Categoria> categorias = new ArrayList();
    private ArrayList<Pregunta> preguntas = new ArrayList();
    private ArrayList<Respuesta> respuestas = new ArrayList();

    private Ronda activa = new Ronda();

    //<editor-fold defaultstate="collapsed" desc="--- AGREGAR --">
    public void agregar(Opcion o) {
        opciones.add(o);
    }

    public void agregar(Categoria c) {
        categorias.add(c);
    }

    public void agregar(Pregunta p) {
        preguntas.add(p);
    }

    public void agregar(Respuesta o) {
        respuestas.add(o);
    }

    /* public void agregar(Jugador j) {
        jugadores.add(j);
    }*/
    //</editor-fold>
    public void crearRonda(Jugador j) {

        Pregunta p = buscarPreguntaAleatoriamente(numero);

        Ronda r = new Ronda(numero, p, j);

        this.activa = r;

        numero++;
    }

    public void borrarRondas() {
        this.activa = new Ronda();
        numero = 1;
    }

    public Ronda obtenerRonda() {

        return this.activa;

    }

    public Pregunta buscarPreguntaAleatoriamente(int idCategoria) {

        Categoria cat = new Categoria();

        for (int i = 0; i < categorias.size(); i++) {

            if (categorias.get(i).getId() == idCategoria) {
                cat = categorias.get(i);
            }

        }
        return cat.buscarPreguntaAleatoria();
    }

}
