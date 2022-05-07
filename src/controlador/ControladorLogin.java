/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Jugador;
import modelo.Sistema;
import modelo.Usuario;

/**
 *
 * @author alumnoFI
 */
public class ControladorLogin {
    
    private Sistema modelo = Sistema.getInstancia();
    private VistaLogin vista;
    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }

    public void login(String n,String p){
        Usuario u = modelo.login(n, p);
        if(u==null) vista.mostrarError("Login incorrecto");
        else vista.mostrarVistaJugador(u);

    }
    
}
