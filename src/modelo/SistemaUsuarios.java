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
public class SistemaUsuarios {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Jugador> activos = new ArrayList();

    public ArrayList<Jugador> getActivas() {
        return activos;
    }

    //<editor-fold defaultstate="collapsed" desc="--- AGREGAR --">
    public void agregar(Usuario u) {
        usuarios.add(u);
    }

    //</editor-fold>
    
    public Usuario login(String u, String p) {
        for (Usuario usr : usuarios) {
            if (usr.getNombre().equalsIgnoreCase(u)
                    && usr.getPassword().equals(p)) {
                //LO ENCONTRE, RETORNO A EL JUGADOR
                //Jugador j = Sistema.getInstancia().buscarJugador(usr);
                Jugador j = usr.getJugador();
                activos.add(j);
                // Sistema.getInstancia().avisar(Sistema.Eventos.listaAgendas);
                return usr;
            }
        }
        return null;
    }

}
