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
 * @author seiji
 */
public class Jugador extends Observable {

    private int id;
    private int acumulado;
    private int saldo;
    private ArrayList<Ronda> rondasGanadas = new ArrayList();

    public Jugador(int id, int acumulado, int saldo) {
        this.id = id;
        this.acumulado = acumulado;
        this.saldo = saldo;
    }

    public Jugador(int id, int acumulado) {
        this.id = id;
        this.acumulado = acumulado;
    }

    public enum Eventos {

        guardoRonda, borrarRondas, abandono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int calcularAcumulado() {
        int acumulado = 0;
        //Categoria cat = new Categoria();
        if (rondasGanadas.size() > 0) {
            for (int i = 0; i < rondasGanadas.size(); i++) {

                acumulado += rondasGanadas.get(i).getValor();

            }
        }

        return acumulado;

    }

    public void guardarRonda(Ronda r) {
        rondasGanadas.add(r);
        avisar(Eventos.guardoRonda);
        //ACTUALIZAR

    }

    

    public void borrarRondas() {
        rondasGanadas.removeAll(rondasGanadas);
        avisar(Eventos.borrarRondas);
        //ACTUALIZAR

    }
    
     public void abandonaRondas() {
        
        avisar(Eventos.abandono);
        //ACTUALIZAR

    }

    protected void avisar(Object evt) {
        setChanged();
        notifyObservers(evt);
    }
}
