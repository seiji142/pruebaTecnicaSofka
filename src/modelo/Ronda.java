/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author seiji
 */
public class Ronda {
    
    private int numero;
    private Pregunta pregunta;
    private Jugador jugador;
    private static int valor = 50;

    public Ronda() {
    }

      public Ronda(int numero, Pregunta pregunta, Jugador jugador) {
        this.numero = numero;
        this.pregunta = pregunta;
        this.jugador = jugador;
     
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
    
            
    
}
