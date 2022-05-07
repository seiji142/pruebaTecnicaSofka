/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Pregunta;
import modelo.Usuario;


/**
 *
 * @author alumnoFI
 */
public interface VistaJugador {

    public void mostrarVistaJuego(Usuario u);

    public void error(String msg);

    public void mostrarCantidadAcumulado(int cantidad);

    public void mostrarNombreCompleto(String nombreCompleto);

  
    
}
