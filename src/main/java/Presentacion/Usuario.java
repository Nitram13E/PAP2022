/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Controlador.Interfaces.ICActDeportiva;
import Controlador.Interfaces.ICClase;
import Controlador.Interfaces.ICInstDeportiva;
import Controlador.Interfaces.ICUsuario;
import Datatypes.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Shifter
 */
public class Usuario extends javax.swing.JFrame {

    ICUsuario controladorUsuario;
    ICInstDeportiva controladorInstitucion;
    ICClase controladorClase;
    ICActDeportiva controladorActividad;

    public Usuario(ICUsuario controladorUsuario, ICInstDeportiva controladorInstitucion, ICClase controladorClase, ICActDeportiva controladorActividad) {
        this.controladorUsuario = controladorUsuario;
        this.controladorInstitucion = controladorInstitucion;
        this.controladorClase = controladorClase;
        this.controladorActividad = controladorActividad;

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
        panelActividades = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JList<>();
        btnInfoActividad = new javax.swing.JButton();
        labelActividades = new javax.swing.JLabel();
        panelClases = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaClases = new javax.swing.JList<>();
        btnInfoClase = new javax.swing.JButton();
        labelClases = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListUsuarios = new javax.swing.JList<>();
        BtnModificarUsuario = new javax.swing.JButton();
        BtnAgregarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
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
                    .addComponent(jSeparator25)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane9)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre3)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(JLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(PanelInfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        listaActividades.setEnabled(false);
        listaActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaActividadesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaActividades);

        btnInfoActividad.setText("Ver info actividad");
        btnInfoActividad.setEnabled(false);
        btnInfoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActividadActionPerformed(evt);
            }
        });

        labelActividades.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelActividades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelActividades.setText("Actividades");
        labelActividades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelActividadesLayout = new javax.swing.GroupLayout(panelActividades);
        panelActividades.setLayout(panelActividadesLayout);
        panelActividadesLayout.setHorizontalGroup(
            panelActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActividadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(btnInfoActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelActividadesLayout.setVerticalGroup(
            panelActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActividadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelActividades)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInfoActividad))
        );

        listaClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClasesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listaClases);

        btnInfoClase.setText("Ver info clase");
        btnInfoClase.setEnabled(false);
        btnInfoClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoClaseActionPerformed(evt);
            }
        });

        labelClases.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClases.setText("Clases");
        labelClases.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelClasesLayout = new javax.swing.GroupLayout(panelClases);
        panelClases.setLayout(panelClasesLayout);
        panelClasesLayout.setHorizontalGroup(
            panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(btnInfoClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelClasesLayout.setVerticalGroup(
            panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClasesLayout.createSequentialGroup()
                .addComponent(labelClases)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnInfoClase)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de usuarios");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JListUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JListUsuarios);

        BtnModificarUsuario.setText("Modificar");
        BtnModificarUsuario.setEnabled(false);
        BtnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarUsuarioActionPerformed(evt);
            }
        });

        BtnAgregarUsuario.setText("Agregar");
        BtnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(BtnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelClases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelInfoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addComponent(panelActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JListUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListUsuariosMouseClicked
        DtUsuario usuarioSeleccionado = JListUsuarios.getSelectedValue();

        if (usuarioSeleccionado == null) return;
        
        BtnModificarUsuario.setEnabled(true);

        jLabel.setText(usuarioSeleccionado.getNickname());
        jLabel13.setText(usuarioSeleccionado.getNombre());
        jLabel14.setText(usuarioSeleccionado.getApellido());
        JLabelEmail.setText(usuarioSeleccionado.getMail());
        jLabel15.setText(usuarioSeleccionado.getFechaNac().toString());

        if (usuarioSeleccionado instanceof DtProfesor) {

            infoTipoUsuario(true);

            panelActividades.setVisible(true);
            jLabel16.setText(((DtProfesor) usuarioSeleccionado).getInstitucion().getNombre());
            TextDescripcion.setText(((DtProfesor) usuarioSeleccionado).getDescripcion());
            jLabel17.setText(((DtProfesor) usuarioSeleccionado).getSitioWeb());
            TextBiografia3.setText(((DtProfesor) usuarioSeleccionado).getBiografia());

            listaActividades.setEnabled(true);
            
            cargarListaActividades();
            
        } else if (usuarioSeleccionado instanceof DtSocio) {
            infoTipoUsuario(false);
            
            panelActividades.setVisible(false);
            cargarListaClases();
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

    private void BtnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarUsuarioActionPerformed
        ModificarUsuario modificarUsuarioFrame = new ModificarUsuario(JListUsuarios.getSelectedValue());
        modificarUsuarioFrame.setVisible(true);
        modificarUsuarioFrame.setLocationRelativeTo(null);
        modificarUsuarioFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnModificarUsuarioActionPerformed

    private void listaActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaActividadesMouseClicked
        cargarListaClases();
        btnInfoActividad.setEnabled(true);
        listaClases.setEnabled(true);
    }//GEN-LAST:event_listaActividadesMouseClicked

    private void listaClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClasesMouseClicked
        btnInfoClase.setEnabled(true);
    }//GEN-LAST:event_listaClasesMouseClicked

    private void btnInfoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActividadActionPerformed
        InformacionActividad informacionActividadFrame = new InformacionActividad(listaActividades.getSelectedValue());
        informacionActividadFrame.setVisible(true);
        informacionActividadFrame.setLocationRelativeTo(null);
        informacionActividadFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInfoActividadActionPerformed

    private void btnInfoClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoClaseActionPerformed
        InformacionClase informacionClaseFrame = new InformacionClase(listaClases.getSelectedValue());
        informacionClaseFrame.setVisible(true);
        informacionClaseFrame.setLocationRelativeTo(null);
        informacionClaseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInfoClaseActionPerformed

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

    public void cargarListaActividades() {
        DtInstitucionDeportiva institucionDeportiva = controladorUsuario.getInstitucionProfesor((DtProfesor) JListUsuarios.getSelectedValue());
        List<DtActividadDeportiva> actividades = controladorInstitucion.getActividadesDeInstitucion(institucionDeportiva.getNombre());

        DefaultListModel<DtActividadDeportiva> model = new DefaultListModel<>();
        model.addAll(actividades);
        listaActividades.setModel(model);
    }

    public void cargarListaClases() {
        DtUsuario usuario = JListUsuarios.getSelectedValue();
        List<DtClase> clases = new ArrayList<>();

        if(usuario instanceof DtProfesor) {
            clases = controladorUsuario.getClasesProfesor(controladorActividad.getClases(listaActividades.getSelectedValue()), (DtProfesor) usuario);
        } else if (usuario instanceof DtSocio) {
            List<String> nombresClases = controladorUsuario.getClasesSocio((DtSocio) usuario);

            for(String nombreClase : nombresClases) {
                clases.add(controladorClase.retornarClase(nombreClase));
            }
        }

        DefaultListModel<DtClase> model = new DefaultListModel<>();
        model.addAll(clases);
        listaClases.setModel(model);
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
    private javax.swing.JButton btnInfoActividad;
    private javax.swing.JButton btnInfoClase;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelActividades;
    private javax.swing.JLabel labelClases;
    private javax.swing.JList<DtActividadDeportiva> listaActividades;
    private javax.swing.JList<DtClase> listaClases;
    private javax.swing.JPanel panelActividades;
    private javax.swing.JPanel panelClases;
    // End of variables declaration//GEN-END:variables
}
