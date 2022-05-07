/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Jugador;
import modelo.Opcion;
import modelo.Respuesta;
import modelo.Pregunta;
import modelo.Sistema;
import modelo.Usuario;

/**
 *
 * @author seiji
 */
public class DatosPrueba {

    public static void cargar() {

        Sistema logica = Sistema.getInstancia();
        Jugador ju1 = new Jugador(1, 0);
        Jugador ju2 = new Jugador(2, 0);
        Jugador ju3 = new Jugador(3, 0);

        logica.agregar(new Usuario("a", "Ana", "a", ju1));
        logica.agregar(new Usuario("b", "Beatriz", "b", ju2));
        logica.agregar(new Usuario("c", "Carlos", "c", ju3));

        Categoria cat1 = new Categoria(1, "MUY BAJA");
        Categoria cat2 = new Categoria(2, "BAJA");
        Categoria cat3 = new Categoria(3, "MEDIA");
        Categoria cat4 = new Categoria(4, "ALTA");
        Categoria cat5 = new Categoria(5, "DIFICIL");

        logica.agregar(cat1);
        logica.agregar(cat2);
        logica.agregar(cat3);
        logica.agregar(cat4);
        logica.agregar(cat5);

        Pregunta p1 = new Pregunta(1, "Capital de Uruguay?", cat1);
        Pregunta p2 = new Pregunta(2, "Capital de Colombia?", cat2);
        Pregunta p3 = new Pregunta(3, "Capital de Chile?", cat3);
        Pregunta p4 = new Pregunta(4, "Capital de Argentina?", cat4);
        Pregunta p5 = new Pregunta(5, "Capital donde se disputo el primer Mundial de Futbol?", cat5);

        Pregunta p6 = new Pregunta(6, "Equipo de Futbol de Uruguay?", cat1);
        Pregunta p7 = new Pregunta(7, "Equipo de Futbol de Colombia?", cat2);
        Pregunta p8 = new Pregunta(8, "Equipo de Futbol de Chile?", cat3);
        Pregunta p9 = new Pregunta(9, "Equipo de Futbol de Argentina?", cat4);
        Pregunta p10 = new Pregunta(10, "Equipo de Futbol que gano la copa libertadores en 1988?", cat5);

        Pregunta p11 = new Pregunta(11, "Fundador de la red social Facebook?", cat1);
        Pregunta p12 = new Pregunta(12, "Fundador de Apple?", cat2);
        Pregunta p13 = new Pregunta(13, "Fundador de Microsoft?", cat3);
        Pregunta p14 = new Pregunta(14, "Principal encargado en Desarrollar Sistemas Operativos UNIX?", cat4);
        Pregunta p15 = new Pregunta(15, "Maximo accionista individual de The Walt Disney?", cat5);

        Pregunta p16 = new Pregunta(16, "Protagonista de la pelicula EL RESPLANDOR", cat1);
        Pregunta p17 = new Pregunta(17, "Protagonista de la pelicula EL PADRINO", cat2);
        Pregunta p18 = new Pregunta(18, "Protagonista de la pelicula NAUFRAGO", cat3);
        Pregunta p19 = new Pregunta(19, "Protagonista de la pelicula TITANIC", cat4);
        Pregunta p20 = new Pregunta(20, "Actor nacido el 22 de Abril de 1937.", cat5);

        Pregunta p21 = new Pregunta(21, "Construccion arquitectonica destacada en Singapur", cat1);
        Pregunta p22 = new Pregunta(22, "Construccion arquitectonica destacada en CHINA", cat2);
        Pregunta p23 = new Pregunta(23, "Construccion arquitectonica destacada en RUSIA", cat3);
        Pregunta p24 = new Pregunta(24, "Construccion arquitectonica destacada en EGIPTO", cat4);
        Pregunta p25 = new Pregunta(25, "Obra arquitectonica inaugurada en Junio del 2012", cat5);

        logica.agregar(p1);
        logica.agregar(p2);
        logica.agregar(p3);
        logica.agregar(p4);
        logica.agregar(p5);
        logica.agregar(p6);
        logica.agregar(p7);
        logica.agregar(p8);
        logica.agregar(p9);
        logica.agregar(p10);
        logica.agregar(p11);
        logica.agregar(p12);
        logica.agregar(p13);
        logica.agregar(p14);
        logica.agregar(p15);
        logica.agregar(p16);
        logica.agregar(p17);
        logica.agregar(p18);
        logica.agregar(p19);
        logica.agregar(p20);
        logica.agregar(p21);
        logica.agregar(p22);
        logica.agregar(p23);
        logica.agregar(p24);
        logica.agregar(p25);

        Respuesta r1 = new Respuesta(1, "MONTEVIDEO");
        Respuesta r2 = new Respuesta(2, "MEDELLIN");
        Respuesta r3 = new Respuesta(3, "SANTIAGO DE CHILE");
        Respuesta r4 = new Respuesta(4, "BUENOS AIRES");

        Respuesta r5 = new Respuesta(5, "CLUB NACIONAL DE FUTBOL");
        Respuesta r6 = new Respuesta(6, "JUNIOR DE BARRANQUILLA");
        Respuesta r7 = new Respuesta(7, "UNIVERSIDAD DE CHILE");
        Respuesta r8 = new Respuesta(8, "BOCA JR");

        Respuesta r9 = new Respuesta(9, "MARK ZUCKERBERG");
        Respuesta r10 = new Respuesta(10, "STEVE JOBS");
        Respuesta r11 = new Respuesta(11, "BILL GATES");
        Respuesta r12 = new Respuesta(12, "DENNIS RITCHIE");

        Respuesta r13 = new Respuesta(13, "JACK NICHOLSON");
        Respuesta r14 = new Respuesta(14, "AL PACIONO");
        Respuesta r15 = new Respuesta(15, "TOM HANKS");
        Respuesta r16 = new Respuesta(16, "LEONARDO DICAPRIO");

        Respuesta r17 = new Respuesta(17, "GARDENS BY THE BAY");
        Respuesta r18 = new Respuesta(18, "LA GRAN MURALLA CHINA");
        Respuesta r19 = new Respuesta(19, "CATEDRAL DE SAN BASILIO");
        Respuesta r20 = new Respuesta(20, "PIRAMIDES");

        Opcion o1 = new Opcion(1, p1, r1, true);
        Opcion o2 = new Opcion(2, p1, r2, false);
        Opcion o3 = new Opcion(3, p1, r3, false);
        Opcion o4 = new Opcion(4, p1, r4, false);

        Opcion o5 = new Opcion(5, p2, r1, false);
        Opcion o6 = new Opcion(6, p2, r2, true);
        Opcion o7 = new Opcion(7, p2, r3, false);
        Opcion o8 = new Opcion(8, p2, r4, false);

        Opcion o9 = new Opcion(9, p3, r1, false);
        Opcion o10 = new Opcion(10, p3, r2, false);
        Opcion o11 = new Opcion(11, p3, r3, true);
        Opcion o12 = new Opcion(12, p3, r4, false);

        Opcion o13 = new Opcion(13, p4, r1, false);
        Opcion o14 = new Opcion(14, p4, r2, false);
        Opcion o15 = new Opcion(15, p4, r3, false);
        Opcion o16 = new Opcion(16, p4, r4, true);

        Opcion o17 = new Opcion(17, p5, r1, true);
        Opcion o18 = new Opcion(18, p5, r2, false);
        Opcion o19 = new Opcion(19, p5, r3, false);
        Opcion o20 = new Opcion(20, p5, r4, false);

        /**
         * *** FIN CICLO DE OPCIONES (PREGUNTAS Y RESPUESTAS) *****
         */
        Opcion o21 = new Opcion(21, p6, r5, true);
        Opcion o22 = new Opcion(22, p6, r6, false);
        Opcion o23 = new Opcion(23, p6, r7, false);
        Opcion o24 = new Opcion(24, p6, r8, false);

        Opcion o25 = new Opcion(25, p7, r5, false);
        Opcion o26 = new Opcion(26, p7, r6, true);
        Opcion o27 = new Opcion(27, p7, r7, false);
        Opcion o28 = new Opcion(28, p7, r8, false);

        Opcion o29 = new Opcion(29, p8, r5, false);
        Opcion o30 = new Opcion(30, p8, r6, false);
        Opcion o31 = new Opcion(31, p8, r7, true);
        Opcion o32 = new Opcion(32, p8, r8, false);

        Opcion o33 = new Opcion(33, p9, r5, false);
        Opcion o34 = new Opcion(34, p9, r6, false);
        Opcion o35 = new Opcion(35, p9, r7, false);
        Opcion o36 = new Opcion(36, p9, r8, true);

        Opcion o37 = new Opcion(37, p10, r5, true);
        Opcion o38 = new Opcion(38, p10, r6, false);
        Opcion o39 = new Opcion(39, p10, r7, false);
        Opcion o40 = new Opcion(40, p10, r8, false);

        /**
         * ***********************************************************
         */
        Opcion o41 = new Opcion(41, p11, r9, true);
        Opcion o42 = new Opcion(42, p11, r10, false);
        Opcion o43 = new Opcion(43, p11, r11, false);
        Opcion o44 = new Opcion(44, p11, r12, false);

        Opcion o45 = new Opcion(45, p12, r9, false);
        Opcion o46 = new Opcion(46, p12, r10, true);
        Opcion o47 = new Opcion(47, p12, r11, false);
        Opcion o48 = new Opcion(48, p12, r12, false);

        Opcion o49 = new Opcion(49, p13, r9, false);
        Opcion o50 = new Opcion(50, p13, r10, false);
        Opcion o51 = new Opcion(51, p13, r11, true);
        Opcion o52 = new Opcion(52, p13, r12, false);

        Opcion o53 = new Opcion(53, p14, r9, false);
        Opcion o54 = new Opcion(54, p14, r10, false);
        Opcion o55 = new Opcion(55, p14, r11, false);
        Opcion o56 = new Opcion(56, p14, r12, true);

        Opcion o57 = new Opcion(57, p15, r9, false);
        Opcion o58 = new Opcion(58, p15, r10, true);
        Opcion o59 = new Opcion(59, p15, r11, false);
        Opcion o60 = new Opcion(60, p15, r12, false);

        /**
         * *********************************************
         */
        Opcion o61 = new Opcion(61, p16, r13, true);
        Opcion o62 = new Opcion(62, p16, r14, false);
        Opcion o63 = new Opcion(63, p16, r15, false);
        Opcion o64 = new Opcion(64, p16, r16, false);

        Opcion o65 = new Opcion(65, p17, r13, false);
        Opcion o66 = new Opcion(66, p17, r14, true);
        Opcion o67 = new Opcion(67, p17, r15, false);
        Opcion o68 = new Opcion(68, p17, r16, false);

        Opcion o69 = new Opcion(69, p18, r13, false);
        Opcion o70 = new Opcion(70, p18, r14, false);
        Opcion o71 = new Opcion(71, p18, r15, true);
        Opcion o72 = new Opcion(72, p18, r16, false);

        Opcion o73 = new Opcion(73, p19, r13, false);
        Opcion o74 = new Opcion(74, p19, r14, false);
        Opcion o75 = new Opcion(75, p19, r15, false);
        Opcion o76 = new Opcion(76, p19, r16, true);

        Opcion o77 = new Opcion(77, p20, r13, true);
        Opcion o78 = new Opcion(78, p20, r14, false);
        Opcion o79 = new Opcion(79, p20, r15, false);
        Opcion o80 = new Opcion(80, p20, r16, false);

        /**
         * *******************************************
         */
        Opcion o81 = new Opcion(81, p21, r17, true);
        Opcion o82 = new Opcion(82, p21, r18, false);
        Opcion o83 = new Opcion(83, p21, r19, false);
        Opcion o84 = new Opcion(84, p21, r20, false);

        Opcion o85 = new Opcion(85, p22, r17, false);
        Opcion o86 = new Opcion(86, p22, r18, true);
        Opcion o87 = new Opcion(87, p22, r19, false);
        Opcion o88 = new Opcion(88, p22, r20, false);

        Opcion o89 = new Opcion(89, p23, r17, false);
        Opcion o90 = new Opcion(90, p23, r18, false);
        Opcion o91 = new Opcion(91, p23, r19, true);
        Opcion o92 = new Opcion(92, p23, r20, false);

        Opcion o93 = new Opcion(93, p24, r17, false);
        Opcion o94 = new Opcion(94, p24, r18, false);
        Opcion o95 = new Opcion(95, p24, r19, false);
        Opcion o96 = new Opcion(96, p24, r20, true);

        Opcion o97 = new Opcion(97, p25, r17, true);
        Opcion o98 = new Opcion(98, p25, r18, false);
        Opcion o99 = new Opcion(99, p25, r19, false);
        Opcion o100 = new Opcion(100, p25, r20, false);

        /**
         * *****************************************
         */
        logica.agregar(o1);
        logica.agregar(o2);
        logica.agregar(o3);
        logica.agregar(o4);
        logica.agregar(o5);
        logica.agregar(o6);
        logica.agregar(o7);
        logica.agregar(o8);
        logica.agregar(o9);
        logica.agregar(o10);
        logica.agregar(o11);
        logica.agregar(o12);
        logica.agregar(o13);
        logica.agregar(o14);
        logica.agregar(o15);
        logica.agregar(o16);
        logica.agregar(o17);
        logica.agregar(o18);
        logica.agregar(o19);
        logica.agregar(o20);
        logica.agregar(o21);
        logica.agregar(o22);
        logica.agregar(o23);
        logica.agregar(o24);
        logica.agregar(o25);
        logica.agregar(o26);
        logica.agregar(o27);
        logica.agregar(o28);
        logica.agregar(o29);
        logica.agregar(o30);
        logica.agregar(o31);
        logica.agregar(o32);
        logica.agregar(o33);
        logica.agregar(o34);
        logica.agregar(o35);
        logica.agregar(o36);
        logica.agregar(o37);
        logica.agregar(o38);
        logica.agregar(o39);
        logica.agregar(o40);
        logica.agregar(o41);
        logica.agregar(o42);
        logica.agregar(o43);
        logica.agregar(o44);
        logica.agregar(o45);
        logica.agregar(o46);
        logica.agregar(o47);
        logica.agregar(o48);
        logica.agregar(o49);
        logica.agregar(o50);
        logica.agregar(o51);
        logica.agregar(o52);
        logica.agregar(o53);
        logica.agregar(o54);
        logica.agregar(o55);
        logica.agregar(o56);
        logica.agregar(o57);
        logica.agregar(o58);
        logica.agregar(o59);
        logica.agregar(o60);
        logica.agregar(o61);
        logica.agregar(o62);
        logica.agregar(o63);
        logica.agregar(o64);
        logica.agregar(o65);
        logica.agregar(o66);
        logica.agregar(o67);
        logica.agregar(o68);
        logica.agregar(o69);
        logica.agregar(o70);
        logica.agregar(o71);
        logica.agregar(o72);
        logica.agregar(o73);
        logica.agregar(o74);
        logica.agregar(o75);
        logica.agregar(o76);
        logica.agregar(o77);
        logica.agregar(o78);
        logica.agregar(o79);
        logica.agregar(o80);
        logica.agregar(o81);
        logica.agregar(o82);
        logica.agregar(o83);
        logica.agregar(o84);
        logica.agregar(o85);
        logica.agregar(o86);
        logica.agregar(o87);
        logica.agregar(o88);
        logica.agregar(o89);
        logica.agregar(o90);
        logica.agregar(o91);
        logica.agregar(o92);
        logica.agregar(o93);
        logica.agregar(o94);
        logica.agregar(o95);
        logica.agregar(o96);
        logica.agregar(o97);
        logica.agregar(o98);
        logica.agregar(o99);
        logica.agregar(o100);
//
//        Compania compania1 = new Compania("Air France", "AF");
//        Compania compania2 = new Compania("Centurion Air Cargo", "CAC");
//        Compania compania3 = new Compania("Lan Cargo", "LC");
//
//        Aeropuerto aeropuerto1 = new Aeropuerto("Aeropuerto Internacional de Carrasco", nacionales);
//        Aeropuerto aeropuerto2 = new Aeropuerto("Adolfo Suarez Madrid-Barajas", regional);
//        Aeropuerto aeropuerto3 = new Aeropuerto("Aeropuerto de Roma-Fiumicino", internacionales);
//
//        Usuario usuario1 = new UsuCompania("seiji", "Seiji Tsumura", "123", compania1);
//        Usuario usuario2 = new UsuCompania("pablo", "Pablo Gomez", "123", compania2);
//        Usuario usuario3 = new UsuCompania("ana", "Ana Rodriguez", "123", compania1);
//        Usuario usuario4 = new UsuAeropuerto("paco", "Paco Lopez", "123", aeropuerto1);
//        Usuario usuario5 = new UsuAeropuerto("luis", "Luis Rodriguez", "123", aeropuerto2);
//        Usuario usuario6 = new UsuAeropuerto("Daniela", "Daniela Lopez", "123", aeropuerto2);
//
//        logica.agregar(aeropuerto1);
//        logica.agregar(aeropuerto2);
//        logica.agregar(aeropuerto3);
//
//        logica.agregar(compania1);
//        logica.agregar(compania2);
//        logica.agregar(compania3);
//
//        logica.agregar(usuario1);
//        logica.agregar(usuario2);
//        logica.agregar(usuario3);
//        logica.agregar(usuario4);
//        logica.agregar(usuario5);
//        logica.agregar(usuario6);
        /**
         * *********************** MAPEO A BASE DE DATOS
         * *************************
         */
//        MapeadorTipoAeropuerto map12 = new MapeadorTipoAeropuerto(nacionales);
//        Persistencia.getInstancia().guardar(map12);
//        MapeadorTipoAeropuerto map13 = new MapeadorTipoAeropuerto(internacionales);
//        Persistencia.getInstancia().guardar(map13);
//        MapeadorTipoAeropuerto map14 = new MapeadorTipoAeropuerto(regional);
//        Persistencia.getInstancia().guardar(map14);
//
//        MapeadorAeropuerto map = new MapeadorAeropuerto(aeropuerto1);
//        Persistencia.getInstancia().guardar(map);
//        MapeadorAeropuerto map2 = new MapeadorAeropuerto(aeropuerto2);
//        Persistencia.getInstancia().guardar(map2);
//        MapeadorAeropuerto map3 = new MapeadorAeropuerto(aeropuerto3);
//        Persistencia.getInstancia().guardar(map3);
//
//        MapeadorCompania map4 = new MapeadorCompania(compania1);
//        Persistencia.getInstancia().guardar(map4);
//        MapeadorCompania map5 = new MapeadorCompania(compania2);
//        Persistencia.getInstancia().guardar(map5);
//        MapeadorCompania map6 = new MapeadorCompania(compania3);
//        Persistencia.getInstancia().guardar(map6);
//
//        MapeadorUsuAeropuerto map7 = new MapeadorUsuAeropuerto(usuario4);
//        Persistencia.getInstancia().guardar(map7);
//        MapeadorUsuAeropuerto map8 = new MapeadorUsuAeropuerto(usuario5);
//        Persistencia.getInstancia().guardar(map8);
//        MapeadorUsuAeropuerto map9 = new MapeadorUsuAeropuerto(usuario6);
//        Persistencia.getInstancia().guardar(map9);
//        MapeadorUsuCompania map10 = new MapeadorUsuCompania(usuario1);
//        Persistencia.getInstancia().guardar(map10);
//        MapeadorUsuCompania map11 = new MapeadorUsuCompania(usuario2);
//        Persistencia.getInstancia().guardar(map11);
        /**
         * *********************** CARGAR DATOS DE BASE DE DATOS
         * *************************
         */
        //  Cargo todos los Tipos aeropuertos 
//        MapeadorTipoAeropuerto mapTipo = new MapeadorTipoAeropuerto();
//        Object tiposAeropuertos = Persistencia.getInstancia().todos(mapTipo);
//        ArrayList<Object> obsTipo = (ArrayList) tiposAeropuertos;
//        for (Object o : obsTipo) {
//            logica.agregar((TipoAeropuerto) o);
//        }
//        // Cargo todos los aeropuertos 
//        MapeadorAeropuerto ma = new MapeadorAeropuerto();
//        Object aeropuertos = Persistencia.getInstancia().todos(ma);
//        ArrayList<Object> obs = (ArrayList) aeropuertos;
//        for (Object o : obs) {
//            logica.agregar((Aeropuerto) o);
//        }
//
//        // Cargo todas las companias 
//        MapeadorCompania mc = new MapeadorCompania();
//        Object companias = Persistencia.getInstancia().todos(mc);
//        ArrayList<Object> obs2 = (ArrayList) companias;
//        for (Object o : obs2) {
//            logica.agregar((Compania) o);
//        }
//
//        // Cargo todos los usuarios 
//        MapeadorUsuCompania msc = new MapeadorUsuCompania();
//        Object usuariosCompania = Persistencia.getInstancia().todos(msc);
//        ArrayList<Object> obs3 = (ArrayList) usuariosCompania;
//        for (Object o : obs3) {
//            logica.agregar((UsuCompania) o);
//        }
//
//        // Cargo todos los usuarios Aeropuerto
//        MapeadorUsuAeropuerto msa = new MapeadorUsuAeropuerto();
//        Object usuariosAeropuerto = Persistencia.getInstancia().todos(msa);
//        ArrayList<Object> obs4 = (ArrayList) usuariosAeropuerto;
//        for (Object o : obs4) {
//            logica.agregar((UsuAeropuerto) o);
//        }
//
//        // Cargo todas las FRECUENCIAS
//        MapeadorFrecuencia map = new MapeadorFrecuencia();
//        Object frecuencias = Persistencia.getInstancia().todos(map);
//        ArrayList<Object> obs5 = (ArrayList) frecuencias;
//        for (Compania c : Sistema.getInstancia().listaCompanias()) {
//            for (Object o : obs5) {
//                Frecuencia f = (Frecuencia) o;
//                if (f.getCompania().getOid() == c.getOid()) {
//                    c.getListaFrecuencias().add(f);
//                }
//            }
//        }
//
//        if (frecuencias instanceof ArrayList) {
//            imprimirLista((ArrayList) frecuencias);
//        }
//
//    }
//
//    private static void imprimirLista(ArrayList<Object> obs) {
//        System.out.println("Frecuencias");
//        for (Object o : obs) {
//            //logica.agregar((Aeropuerto) o);
//            System.out.println(o.toString());
//        }
//        System.out.println("------------------------");
    }
}
