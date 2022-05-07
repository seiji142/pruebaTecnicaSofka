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
public class Opcion {

    private int id;
    private Pregunta pregunta;
    private Respuesta respuesta;
    private boolean estado;

    public Opcion(int id, Pregunta pregunta, Respuesta respuesta, boolean estado) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.estado = estado;

        //this.respuesta.getOpciones().add(this);
        this.pregunta.getOpciones().add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return respuesta.getNombre();
    }
}
