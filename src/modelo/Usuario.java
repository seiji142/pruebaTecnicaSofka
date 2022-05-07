/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumnoFI
 */
public class Usuario {

    private String nombre;
    private String nombreCompleto;
    private String password;

    private Jugador jugador;

    public Usuario(String nombre, String nombreCompleto, String password) {
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }

    public Usuario(String nombre, String nombreCompleto, String password, Jugador j) {
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.jugador = j;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
