/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Jugador;
import modelo.Usuario;

/**
 *
 * @author alumnoFI
 */
public interface VistaLogin {
    
    public void mostrarError(String msg);

    public void mostrarVistaJugador(Usuario u);
}
