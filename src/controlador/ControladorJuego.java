/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
//import modelo.AgendaException;
import modelo.Jugador;
import modelo.JugadorException;
import modelo.Pregunta;
import modelo.Ronda;
import modelo.Sistema;
import modelo.Usuario;

/**
 *
 * @author alumnoFI
 */
public class ControladorJuego implements Observer {

    private Sistema modelo = Sistema.getInstancia();

    private Jugador jugador;
    private Usuario usuario;
    private Ronda ronda;
    private VistaJuego vista;

    public ControladorJuego(VistaJuego vista, Usuario usu) {
        this.jugador = usu.getJugador();
        this.vista = vista;
        this.ronda = modelo.rondaActiva();

        jugador.addObserver(this);
        vista.mostrarNumeroRonda(ronda.getNumero());
        vista.mostrarValorRonda(ronda.getValor());
        vista.mostrarPregunta(ronda.getPregunta().getNombre());
        vista.mostrarOpciones(ronda.getPregunta().getOpciones());
        vista.mostrarCantidadAcumulado(jugador.calcularAcumulado());

    }

    public void siguienteRonda() {

        jugador.guardarRonda(ronda);
    }

    public void opcionIncorrecta() {

        jugador.borrarRondas();
    }

    public void abandonar() {
        jugador.abandonaRondas();
    }

    @Override
    public void update(Observable o, Object evento) {
        if (evento.equals(Jugador.Eventos.guardoRonda)) {

            System.out.println("GUARDO RONDA EN JUGADOR");
            this.modelo.crearRonda(jugador);
            this.ronda = modelo.rondaActiva();

            vista.mostrarNumeroRonda(ronda.getNumero());
            vista.mostrarValorRonda(ronda.getValor());
            vista.mostrarPregunta(ronda.getPregunta().getNombre());
            vista.mostrarOpciones(ronda.getPregunta().getOpciones());
            vista.mostrarCantidadAcumulado(jugador.calcularAcumulado());

        }

        if (evento.equals(Jugador.Eventos.borrarRondas)) {
            this.modelo.borrarRondas();

        }
        if (evento.equals(Jugador.Eventos.abandono)) {
            this.modelo.borrarRondas();

        }
    }

}
