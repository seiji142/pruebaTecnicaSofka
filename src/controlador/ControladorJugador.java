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
import modelo.Sistema;
import modelo.Usuario;

/**
 *
 * @author alumnoFI
 */
public class ControladorJugador implements Observer {

    private Sistema modelo = Sistema.getInstancia();

    private Jugador jugador;
    private Usuario usuario;
    private VistaJugador vista;

    public ControladorJugador(Usuario usu, VistaJugador vista) {
        this.usuario = usu;
        this.jugador = usu.getJugador();
        this.vista = vista;

        jugador.addObserver(this);
        vista.mostrarNombreCompleto(usu.getNombreCompleto());
        vista.mostrarCantidadAcumulado(jugador.calcularAcumulado());

    }

    public void jugar() {
        try {
            //jugador.crear(1, 0);
            //todo ok
            this.modelo.crearRonda(jugador);
            vista.mostrarVistaJuego(this.usuario);
        } catch (Exception ex) {
            vista.error("Error desconocido, llame AL SERVICE");
            //GUARDAR LOG, ETC
            ex.printStackTrace();
        }

    }

    @Override
    public void update(Observable o, Object evento) {
        if (evento.equals(Jugador.Eventos.guardoRonda)) {
            vista.mostrarCantidadAcumulado(jugador.calcularAcumulado());
        }
        
         if (evento.equals(Jugador.Eventos.borrarRondas)) {
            vista.mostrarCantidadAcumulado(jugador.calcularAcumulado());
        }
    }

}
