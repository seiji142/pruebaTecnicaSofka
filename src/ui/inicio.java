/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import modelo.Jugador;
import modelo.Sistema;
import modelo.Usuario;
import vista.Login;

/**
 *
 * @author seiji
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        BaseDatos bd = BaseDatos.getInstancia();
//        bd.conectarse("com.mysql.jdbc.Driver",
//                "jdbc:mysql://localhost:3306/palabras",
//                "root", "root");

        DatosPrueba.cargar();

        new Login(null, false).setVisible(true);
       
    }

  
}
