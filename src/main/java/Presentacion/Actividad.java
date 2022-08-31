package Presentacion;

import Controlador.Interfaces.ICActDeportiva;
import Controlador.Interfaces.ICInstDeportiva;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtInstitucionDeportiva;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Actividad extends javax.swing.JFrame {

    ICActDeportiva controladorActividad;
    ICInstDeportiva controladorInstitucion;

    public Actividad(ICInstDeportiva controladorInstitucion, ICActDeportiva controladorActividad) {
        this.controladorActividad = controladorActividad;
        this.controladorInstitucion = controladorInstitucion;
        initComponents();
        cargarComboInstitucionesDeportivas();
    }

    public void cargarComboInstitucionesDeportivas() {
        if (controladorInstitucion.getInstituciones().isEmpty()) {
            return;
        }

        DefaultComboBoxModel<DtInstitucionDeportiva> comboModel = new DefaultComboBoxModel<DtInstitucionDeportiva>();
        comboModel.addAll(controladorInstitucion.getInstituciones());
        comboInstitucion.setModel(comboModel);
        comboInstitucion.setEnabled(true);
        botonAgregar.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelActividadDeportiva = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comboInstitucion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JList<>();
        PanelInfoUsuario3 = new javax.swing.JPanel();
        jLabelNickName2 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabelEmail2 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabelFechaNac2 = new javax.swing.JLabel();
        jLabelDescripcion2 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        TextBiografia2 = new javax.swing.JTextArea();
        nombreActividad = new javax.swing.JLabel();
        duracionActividad = new javax.swing.JLabel();
        costoActividad = new javax.swing.JLabel();
        descActividad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        BtnModificarActividad = new javax.swing.JButton();

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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lista de Actividades");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        listaActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaActividadesMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(listaActividades);

        jLabelNickName2.setText("Nombre");

        jLabelEmail2.setText("Duración");

        jLabelFechaNac2.setText("Costo");

        jLabelDescripcion2.setText("Descripcion");

        TextBiografia2.setColumns(20);
        TextBiografia2.setRows(5);
        jScrollPane8.setViewportView(TextBiografia2);

        nombreActividad.setText("-");

        duracionActividad.setText("-");

        costoActividad.setText("-");

        descActividad.setText("-");

        javax.swing.GroupLayout PanelInfoUsuario3Layout = new javax.swing.GroupLayout(PanelInfoUsuario3);
        PanelInfoUsuario3.setLayout(PanelInfoUsuario3Layout);
        PanelInfoUsuario3Layout.setHorizontalGroup(
            PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoUsuario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                        .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescripcion2)
                            .addComponent(jLabelFechaNac2)
                            .addComponent(jLabelEmail2)
                            .addComponent(jLabelNickName2))
                        .addGap(30, 30, 30)
                        .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                                .addComponent(descActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addComponent(costoActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(duracionActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelInfoUsuario3Layout.setVerticalGroup(
            PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickName2)
                    .addComponent(nombreActividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEmail2)
                    .addComponent(duracionActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac2)
                    .addComponent(costoActividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion2)
                    .addComponent(descActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Información de actividad");

        botonAgregar.setText("Agregar");
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar(evt);
            }
        });

        BtnModificarActividad.setText("Modificar");
        BtnModificarActividad.setEnabled(false);
        BtnModificarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelActividadDeportivaLayout = new javax.swing.GroupLayout(PanelActividadDeportiva);
        PanelActividadDeportiva.setLayout(PanelActividadDeportivaLayout);
        PanelActividadDeportivaLayout.setHorizontalGroup(
            PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11))
                    .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanelInfoUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboInstitucion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelActividadDeportivaLayout.createSequentialGroup()
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnModificarActividad))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        PanelActividadDeportivaLayout.setVerticalGroup(
            PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                        .addComponent(comboInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(12, 12, 12)
                        .addComponent(PanelInfoUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(PanelActividadDeportivaLayout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelActividadDeportivaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnModificarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelActividadDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelActividadDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        if (DtInstitucion == null) {
            return;
        }
        List<DtActividadDeportiva> actividades = controladorInstitucion.getActividadesDeInstitucion(DtInstitucion.getNombre());
        DefaultListModel<DtActividadDeportiva> listModel = new DefaultListModel<DtActividadDeportiva>();
        listModel.addAll(actividades);
        listaActividades.setModel(listModel);
    }

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        cargarActividades();
    }//GEN-LAST:event_formWindowGainedFocus

    //Muestra las caracteristicas de actividad
    private void listaActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaActividadesMouseClicked
        DtActividadDeportiva ActividadSeleccionada = listaActividades.getSelectedValue();

        if(listaActividades.getSelectedValue() == null) {
            return;
        }
        nombreActividad.setText(ActividadSeleccionada.getNombre());
        duracionActividad.setText(ActividadSeleccionada.getDuracion().toString());
        costoActividad.setText(ActividadSeleccionada.getCosto().toString());
        descActividad.setText(ActividadSeleccionada.getDesc());
                
        BtnModificarActividad.setEnabled(true);
        
    }//GEN-LAST:event_listaActividadesMouseClicked

    private void botonAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar
        AgregarActividadDeportiva AgregarActividadFrame = new AgregarActividadDeportiva(controladorInstitucion, controladorActividad);
        AgregarActividadFrame.setResizable(false);
        AgregarActividadFrame.setVisible(true);
        AgregarActividadFrame.setLocationRelativeTo(null);
        AgregarActividadFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botonAgregar

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
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificarActividad;
    private javax.swing.JPanel PanelActividadDeportiva;
    private javax.swing.JPanel PanelInfoUsuario3;
    private javax.swing.JTextArea TextBiografia2;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JComboBox<DtInstitucionDeportiva> comboInstitucion;
    private javax.swing.JLabel costoActividad;
    private javax.swing.JLabel descActividad;
    private javax.swing.JLabel duracionActividad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelEmail2;
    private javax.swing.JLabel jLabelFechaNac2;
    private javax.swing.JLabel jLabelNickName2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JList<DtActividadDeportiva> listaActividades;
    private javax.swing.JLabel nombreActividad;
    // End of variables declaration//GEN-END:variables
}
