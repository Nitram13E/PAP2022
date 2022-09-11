package Presentacion;

import Controlador.Interfaces.ICActDeportiva;
import Controlador.Interfaces.ICInstDeportiva;
import Datatypes.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class ActividadDeportiva extends javax.swing.JFrame {
    ICActDeportiva controladorActividad;
    ICInstDeportiva controladorInstitucion;

    public ActividadDeportiva(ICInstDeportiva controladorInstitucion, ICActDeportiva controladorActividad) {
        this.controladorActividad = controladorActividad;
        this.controladorInstitucion = controladorInstitucion;

        initComponents();
        cargarComboInstitucionesDeportivas();
        panelClases.setVisible(false);
    }

    public void cargarComboInstitucionesDeportivas() {
        if (controladorInstitucion.getInstituciones().isEmpty()) return;


        DefaultComboBoxModel<DtInstitucionDeportiva> comboModel = new DefaultComboBoxModel<DtInstitucionDeportiva>();
        comboModel.addAll(controladorInstitucion.getInstituciones());
        comboInstitucion.setModel(comboModel);
        comboInstitucion.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelActividadDeportiva = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comboInstitucion = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelFechaNac3 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jLabelDescripcion3 = new javax.swing.JLabel();
        labelCosto = new javax.swing.JLabel();
        labelFechaRegistro = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        jLabelEmail3 = new javax.swing.JLabel();
        jLabelNickName3 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jLabelBiografia3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        BtnAgregarActividad = new javax.swing.JButton();
        BtnModificarActividad = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        panelClases = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaClases = new javax.swing.JList<>();
        btnInfoClase = new javax.swing.JButton();
        labelClases = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Institucion");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        comboInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInstitucionActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Información de actividad");

        jLabelFechaNac3.setText("Costo");

        jLabelDescripcion3.setText("Fecha registro");

        labelCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCosto.setText("-");

        labelFechaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFechaRegistro.setText("-");

        labelDuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDuracion.setText("-");

        jLabelEmail3.setText("Duración");

        jLabelNickName3.setText("Nombre");

        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("-");

        jLabelBiografia3.setText("Descripción");

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        textDescripcion.setEnabled(false);
        jScrollPane9.setViewportView(textDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNickName3)
                        .addGap(60, 60, 60)
                        .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescripcion3)
                            .addComponent(jLabelFechaNac3)
                            .addComponent(jLabelEmail3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator28)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelBiografia3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickName3)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail3)
                    .addComponent(labelDuracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac3)
                    .addComponent(labelCosto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion3)
                    .addComponent(labelFechaRegistro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBiografia3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboInstitucion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnAgregarActividad.setText("Agregar");
        BtnAgregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActividadActionPerformed(evt);
            }
        });

        BtnModificarActividad.setText("Modificar");
        BtnModificarActividad.setEnabled(false);
        BtnModificarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActividadActionPerformed(evt);
            }
        });

        listaActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaActividadesMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(listaActividades);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lista de Actividades");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnAgregarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModificarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnModificarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClasesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(listaClases);

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
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnInfoClase, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(labelClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelClasesLayout.setVerticalGroup(
            panelClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClases, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfoClase, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelActividadDeportivaLayout = new javax.swing.GroupLayout(PanelActividadDeportiva);
        PanelActividadDeportiva.setLayout(PanelActividadDeportivaLayout);
        PanelActividadDeportivaLayout.setHorizontalGroup(
            PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelActividadDeportivaLayout.setVerticalGroup(
            PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelActividadDeportiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelActividadDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Modificar Actividad
    private void BtnModificarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActividadActionPerformed
        ModificarActividadDeportiva modificarActividadFrame = new ModificarActividadDeportiva(listaActividades.getSelectedValue());
        modificarActividadFrame.setVisible(true);
        modificarActividadFrame.setLocationRelativeTo(null);
        modificarActividadFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnModificarActividadActionPerformed

    private void comboInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInstitucionActionPerformed
        //Cargar lista de actividades deportivas (según institución)
        cargarActividades();
    }//GEN-LAST:event_comboInstitucionActionPerformed

    public void cargarActividades() {
        DtInstitucionDeportiva DtInstitucion = (DtInstitucionDeportiva) comboInstitucion.getSelectedItem();

        if (DtInstitucion == null) return;

        List<DtActividadDeportiva> actividades = controladorInstitucion.getActividadesDeInstitucion(DtInstitucion.getNombre());
        DefaultListModel<DtActividadDeportiva> listModel = new DefaultListModel<DtActividadDeportiva>();
        listModel.addAll(actividades);
        listaActividades.setModel(listModel);

        if(actividades.isEmpty())
        {
            BtnModificarActividad.setEnabled(false);
            panelClases.setVisible(false);
        }
    }

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        cargarActividades();
    }//GEN-LAST:event_formWindowGainedFocus

    //Muestra las caracteristicas de actividad
    private void listaActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaActividadesMouseClicked
        if(listaActividades.getSelectedValue() == null) return;
        
        BtnModificarActividad.setEnabled(true);
        cargarInfoActividades();

        cargarListaClases();
    }//GEN-LAST:event_listaActividadesMouseClicked

    private void BtnAgregarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActividadActionPerformed
        AgregarActividadDeportiva AgregarActividadFrame = new AgregarActividadDeportiva(controladorInstitucion, controladorActividad);
        AgregarActividadFrame.setResizable(false);
        AgregarActividadFrame.setVisible(true);
        AgregarActividadFrame.setLocationRelativeTo(null);
        AgregarActividadFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnAgregarActividadActionPerformed

    private void listaClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClasesMouseClicked
        if(listaClases.getSelectedValue() == null) return;

        btnInfoClase.setEnabled(true);
    }//GEN-LAST:event_listaClasesMouseClicked

    private void btnInfoClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoClaseActionPerformed
        InformacionClase informacionClaseFrame = new InformacionClase(listaClases.getSelectedValue());
        informacionClaseFrame.setVisible(true);
        informacionClaseFrame.setLocationRelativeTo(null);
        informacionClaseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInfoClaseActionPerformed

    
    private void cargarInfoActividades() {
        DtActividadDeportiva actividad = listaActividades.getSelectedValue();

        labelNombre.setText(actividad.getNombre());
        labelDuracion.setText(actividad.getDuracion().toString());
        labelCosto.setText(actividad.getCosto().toString());
        labelFechaRegistro.setText(actividad.getFechaReg().toString());
        textDescripcion.setText(actividad.getDesc());
    }

    public void cargarListaClases() {
        List<DtClase> clases = controladorActividad.getClases(listaActividades.getSelectedValue());

        if(clases.isEmpty()) {
            btnInfoClase.setEnabled(false);
            return;
        }

        DefaultListModel<DtClase> model = new DefaultListModel<>();
        model.addAll(clases);
        listaClases.setModel(model);

        panelClases.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActividadDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActividadDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActividadDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActividadDeportiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarActividad;
    private javax.swing.JButton BtnModificarActividad;
    private javax.swing.JPanel PanelActividadDeportiva;
    private javax.swing.JButton btnInfoClase;
    private javax.swing.JComboBox<DtInstitucionDeportiva> comboInstitucion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBiografia3;
    private javax.swing.JLabel jLabelDescripcion3;
    private javax.swing.JLabel jLabelEmail3;
    private javax.swing.JLabel jLabelFechaNac3;
    private javax.swing.JLabel jLabelNickName3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JLabel labelClases;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelFechaRegistro;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList<DtActividadDeportiva> listaActividades;
    private javax.swing.JList<DtClase> listaClases;
    private javax.swing.JPanel panelClases;
    private javax.swing.JTextArea textDescripcion;
    // End of variables declaration//GEN-END:variables
}
