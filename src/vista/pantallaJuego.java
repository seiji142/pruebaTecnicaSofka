/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJuego;
import controlador.VistaJuego;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Opcion;
import modelo.Usuario;

/**
 *
 * @author seiji
 */
public class pantallaJuego extends javax.swing.JDialog implements VistaJuego {

    ControladorJuego controlador;

    /**
     * Creates new form ConfirmacionDerivacion
     */
    public pantallaJuego(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        controlador = new ControladorJuego(this, usuario);
        setTitle("JUEGO DE PREGUNTAS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnAbandonar = new javax.swing.JButton();
        txtNivel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLtituloValor = new javax.swing.JLabel();
        jLvalor = new javax.swing.JLabel();
        jLtituloAcumulado = new javax.swing.JLabel();
        jLacumulado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListOpciones = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pregunta:");

        jLabel5.setText("Opciones:");

        txtPregunta.setEditable(false);
        txtPregunta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPregunta.setForeground(new java.awt.Color(51, 102, 0));
        txtPregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAbandonar.setText("Abandonar");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        txtNivel.setEditable(false);
        txtNivel.setBackground(new java.awt.Color(255, 255, 102));
        txtNivel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNivel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nivel");

        jLtituloValor.setText("valor:");
        jLtituloValor.setToolTipText("");

        jLvalor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLvalor.setForeground(new java.awt.Color(255, 255, 0));
        jLvalor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLvalor.setText("0");

        jLtituloAcumulado.setText("acumulado:");
        jLtituloAcumulado.setToolTipText("");

        jLacumulado.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLacumulado.setForeground(new java.awt.Color(51, 153, 0));
        jLacumulado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLacumulado.setText("0");

        jListOpciones.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jListOpciones.setForeground(new java.awt.Color(0, 255, 204));
        jListOpciones.setToolTipText("");
        jScrollPane1.setViewportView(jListOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnAceptar)
                .addGap(79, 79, 79)
                .addComponent(btnAbandonar)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPregunta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLtituloValor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLvalor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLtituloAcumulado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLacumulado))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtituloValor)
                            .addComponent(jLvalor))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLtituloAcumulado)
                                .addComponent(jLacumulado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnAbandonar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here
        String valor = jListOpciones.getSelectedValue().toString();
        Opcion o = (Opcion) jListOpciones.getSelectedValue();
        //controlador.seleccionarArea(valor);
        System.out.println("Valor: " + valor);
        System.out.println("Valor : " + o.isEstado());
        if (o.isEstado()) {
            controlador.siguienteRonda();
        } else {
            controlador.opcionIncorrecta();
            JOptionPane.showMessageDialog(this, "Opcion incorrecta!!!");
            dispose();
        }

        // controlador.aceptar();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        // TODO add your handling code here:
        controlador.abandonar();
        dispose();
    }//GEN-LAST:event_btnAbandonarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLacumulado;
    private javax.swing.JList jListOpciones;
    private javax.swing.JLabel jLtituloAcumulado;
    private javax.swing.JLabel jLtituloValor;
    private javax.swing.JLabel jLvalor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNivel;
    private javax.swing.JTextField txtPregunta;
    // End of variables declaration//GEN-END:variables

    /* @Override
    public void mostrarTrabajadorOrigen(String trabajador) {
        txtTrabajador.setText(trabajador);
    }

    @Override
    public void mostrarCliente(String cliente) {
        txtCliente.setText(cliente);
    }

    @Override
    public void descripcionAtencion(String descripcion) {
        txtDescripcion.setText(descripcion);
    }

    @Override
    public void mostrarArea(String area) {

    }

    @Override
    public void mostrarSector(String sector) {
        txtSector.setText(sector);
    }

    @Override
    public void mostrarCuentaRegresiva(int numeroActual) {
        txtNivel.setText(Integer.toString(numeroActual));
    }

    @Override
    public void salir() {
        dispose();
    }*/
    @Override
    public void error(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarCantidadAcumulado(int cantidad) {
        jLacumulado.setText(Integer.toString(cantidad));
    }

    @Override
    public void mostrarOpciones(ArrayList<Opcion> opciones) {
        jListOpciones.setListData(opciones.toArray());
    }

    @Override
    public void opcionSeleccionada(String nombre) {
        //new SolicitudNumero(null,false,nombre).setVisible(true);
        //dispose();
    }

    @Override
    public void mostrarNumeroRonda(int numero) {
        txtNivel.setText(Integer.toString(numero));
    }

    @Override
    public void mostrarPregunta(String nombre) {
        txtPregunta.setText(nombre);
    }

    @Override
    public void mostrarValorRonda(int valor) {
        jLvalor.setText(Integer.toString(valor));
    }

}