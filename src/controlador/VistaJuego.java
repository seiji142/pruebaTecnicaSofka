/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Opcion;
import modelo.Pregunta;

/**
 *
 * @author alumnoFI
 */
public interface VistaJuego {

    public void mostrarOpciones(ArrayList<Opcion> opciones);

    public void opcionSeleccionada(String nombre);

    public void error(String msg);

    public void mostrarCantidadAcumulado(int cantidad);

    public void mostrarNumeroRonda(int numero);
    
    public void mostrarValorRonda(int valor);
    
    public void mostrarPregunta(String nombre);

}
