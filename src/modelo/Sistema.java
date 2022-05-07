/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author alumnoFI
 */
public class Sistema extends Observable {

    private SistemaUsuarios su = new SistemaUsuarios();
    private SistemaPreguntas sp = new SistemaPreguntas();

    public enum Eventos {
        listaAgendas;
    }
    ////SINGLETON
    private static Sistema instancia = new Sistema();

    public static Sistema getInstancia() {
        return instancia;
    }

    private Sistema() {
    }

    ////
    protected void avisar(Object evento) {
        setChanged();
        notifyObservers(evento);
    }

    /* protected Jugador buscarJugador(Usuario u) {
        return su.buscarJugador(u);
    }*/
    public ArrayList<Jugador> getActivas() {
        return su.getActivas();
    }

    public Usuario login(String u, String p) {
        return su.login(u, p);
    }

    //<editor-fold defaultstate="collapsed" desc="--- AGREGAR --">
    public void agregar(Usuario u) {
        su.agregar(u);
    }

    public void agregar(Opcion o) {
        sp.agregar(o);
    }

    public void agregar(Pregunta p) {
        sp.agregar(p);
    }

    public void agregar(Categoria c) {
        sp.agregar(c);
    }

    public void agregar(Respuesta o) {
        sp.agregar(o);
    }

    //</editor-fold>
    public void crearRonda(Jugador j) {
        sp.crearRonda(j);
    }

    public void borrarRondas() {
        sp.borrarRondas();
    }

    public Ronda rondaActiva() {
        return sp.obtenerRonda();
    }
}
