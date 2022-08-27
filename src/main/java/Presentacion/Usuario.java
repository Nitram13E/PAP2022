/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Controlador.Interfaces.ICUsuario;
import Datatypes.DtProfesor;
import Datatypes.DtSocio;
import Datatypes.DtUsuario;
import Manejadores.ManejadorUsuario;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Shifter
 */
public class Usuario extends javax.swing.JFrame {

    ICUsuario controladorUsuario;

    public Usuario(ICUsuario controladorUsuario) {

        this.controladorUsuario = controladorUsuario;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListUsuarios = new javax.swing.JList<>();
        BtnModificarUsuario = new javax.swing.JButton();
        BtnAgregarUsuario = new javax.swing.JButton();
        PanelInfoUsuario = new javax.swing.JPanel();
        jLabelNickName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelEmail = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelFechaNac = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelSitioWeb = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelBiografia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextDescripcion = new javax.swing.JTextArea();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jLabelInstitucion = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TextBiografia3 = new javax.swing.JTextArea();
        jLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JLabelEmail = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        JListUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JListUsuarios);

        BtnModificarUsuario.setText("Modificar");

        BtnAgregarUsuario.setText("Agregar");
        BtnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarUsuarioActionPerformed(evt);
            }
        });

        jLabelNickName.setText("Nickname");

        jLabelNombre.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Información del usuario");

        jLabelEmail.setText("Email");

        jLabelFechaNac.setText("Fecha de nacimiento");

        jLabelDescripcion.setText("Descripcion");

        jLabelSitioWeb.setText("Sitio Web");

        jLabelBiografia.setText("Biografia");

        TextDescripcion.setEditable(false);
        TextDescripcion.setColumns(20);
        TextDescripcion.setRows(5);
        jScrollPane2.setViewportView(TextDescripcion);

        jLabelInstitucion.setText("Institucion");

        TextBiografia3.setEditable(false);
        TextBiografia3.setColumns(20);
        TextBiografia3.setRows(5);
        jScrollPane9.setViewportView(TextBiografia3);

        jLabel.setText("-");
        jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel13.setText("-");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        JLabelEmail.setText("-");
        JLabelEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel15.setText("-");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel16.setText("-");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel17.setText("-");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelNombre3.setText("Apellido");

        jLabel14.setText("-");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout PanelInfoUsuarioLayout = new javax.swing.GroupLayout(PanelInfoUsuario);
        PanelInfoUsuario.setLayout(PanelInfoUsuarioLayout);
        PanelInfoUsuarioLayout.setHorizontalGroup(
            PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane9)
                        .addComponent(jSeparator25)
                        .addComponent(jScrollPane2)
                        .addComponent(jSeparator6)
                        .addComponent(jSeparator5)
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator3)
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelSitioWeb)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelDescripcion)
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelFechaNac)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelBiografia)
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelNickName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelInstitucion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator26)
                        .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabelNombre3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator27)))
                .addContainerGap())
        );
        PanelInfoUsuarioLayout.setVerticalGroup(
            PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickName)
                    .addComponent(jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre3)
                    .addComponent(jLabel14))
                .addGap(12, 12, 12)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(JLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstitucion)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSitioWeb)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBiografia)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de usuarios");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addComponent(BtnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(BtnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(PanelInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(PanelInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 685, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JListUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListUsuariosMouseClicked

        DtUsuario usuarioSeleccionado = JListUsuarios.getSelectedValue();

        if (usuarioSeleccionado == null) {
            System.out.println("Usuario no existente");
        }

        jLabel.setText(usuarioSeleccionado.getNickname());
        jLabel13.setText(usuarioSeleccionado.getNombre());
        jLabel14.setText(usuarioSeleccionado.getApellido());
        JLabelEmail.setText(usuarioSeleccionado.getMail());
        jLabel15.setText(usuarioSeleccionado.getFechaNac().toString());

        if (usuarioSeleccionado instanceof DtProfesor) {

            infoTipoUsuario(true);

            jLabel16.setText(((DtProfesor) usuarioSeleccionado).getInstitucion().getNombre());
            TextDescripcion.setText(((DtProfesor) usuarioSeleccionado).getDescripcion());
            jLabel17.setText(((DtProfesor) usuarioSeleccionado).getSitioWeb());
            TextBiografia3.setText(((DtProfesor) usuarioSeleccionado).getBiografia());
        } else if (usuarioSeleccionado instanceof DtSocio) {
            infoTipoUsuario(false);
        }
    }//GEN-LAST:event_JListUsuariosMouseClicked

    private void BtnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarUsuarioActionPerformed
        AgregarUsuario agregarUsuarioFrame = new AgregarUsuario();
        //Mostrar panel de usuario y centrarlo
        agregarUsuarioFrame.setVisible(true);
        agregarUsuarioFrame.setLocationRelativeTo(null);
        agregarUsuarioFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnAgregarUsuarioActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        agregarListaUsuarios();
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    //--------FUNCIONES AUXILIARES----------------------------------------------
    //Llena la lista de usuarios con los usuarios del sistema
    public void agregarListaUsuarios() {

        List<DtUsuario> usuarios = controladorUsuario.retornarUsuarios();
        DefaultListModel<DtUsuario> model = new DefaultListModel<>();
        model.addAll(usuarios);
        JListUsuarios.setModel(model);
    }

    public void infoTipoUsuario(boolean esProfesor) {
        jLabelInstitucion.setVisible(esProfesor);
        jSeparator26.setVisible(esProfesor);
        jLabelDescripcion.setVisible(esProfesor);
        TextDescripcion.setVisible(esProfesor);
        jScrollPane2.setVisible(esProfesor);
        jSeparator5.setVisible(esProfesor);
        jLabelSitioWeb.setVisible(esProfesor);
        jLabel16.setVisible(esProfesor);
        jSeparator6.setVisible(esProfesor);
        jLabelBiografia.setVisible(esProfesor);
        TextBiografia3.setVisible(esProfesor);
        jLabel17.setVisible(esProfesor);
        jScrollPane9.setVisible(esProfesor);
    }

    //--------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarUsuario;
    private javax.swing.JButton BtnModificarUsuario;
    private javax.swing.JLabel JLabelEmail;
    private javax.swing.JList<DtUsuario> JListUsuarios;
    private javax.swing.JPanel PanelInfoUsuario;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JTextArea TextBiografia3;
    private javax.swing.JTextArea TextDescripcion;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBiografia;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFechaNac;
    private javax.swing.JLabel jLabelInstitucion;
    private javax.swing.JLabel jLabelNickName;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelSitioWeb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}