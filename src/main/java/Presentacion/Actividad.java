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
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabelNombre2 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jLabelEmail2 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabelFechaNac2 = new javax.swing.JLabel();
        jLabelDescripcion2 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabelSitioWeb2 = new javax.swing.JLabel();
        jLabelBiografia2 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        TextBiografia2 = new javax.swing.JTextArea();
        LabelNickname2 = new javax.swing.JLabel();
        LabelNombre2 = new javax.swing.JLabel();
        LabelEmail2 = new javax.swing.JLabel();
        LabelFechaNac2 = new javax.swing.JLabel();
        LabelDescripcion2 = new javax.swing.JLabel();
        LabelSitioWeb2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnAgregarActividad1 = new javax.swing.JButton();
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

        jLabelNombre2.setText("Fecha");

        jLabelEmail2.setText("Hora de inicio");

        jLabelFechaNac2.setText("URL");

        jLabelDescripcion2.setText("Descripcion");

        jLabelSitioWeb2.setText("Sitio Web");

        jLabelBiografia2.setText("Biografia");

        TextBiografia2.setColumns(20);
        TextBiografia2.setRows(5);
        jScrollPane8.setViewportView(TextBiografia2);

        LabelNickname2.setText("-");

        LabelNombre2.setText("-");

        LabelEmail2.setText("-");

        LabelFechaNac2.setText("-");

        LabelDescripcion2.setText("-");

        LabelSitioWeb2.setText("-");

        javax.swing.GroupLayout PanelInfoUsuario3Layout = new javax.swing.GroupLayout(PanelInfoUsuario3);
        PanelInfoUsuario3.setLayout(PanelInfoUsuario3Layout);
        PanelInfoUsuario3Layout.setHorizontalGroup(
            PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoUsuario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                        .addComponent(jLabelBiografia2)
                        .addGap(265, 265, 265))
                    .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                        .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator17)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSitioWeb2)
                                    .addComponent(jLabelDescripcion2)
                                    .addComponent(jLabelFechaNac2)
                                    .addComponent(jLabelEmail2)
                                    .addComponent(jLabelNombre2)
                                    .addComponent(jLabelNickName2))
                                .addGap(30, 30, 30)
                                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                                        .addComponent(LabelDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(LabelFechaNac2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelNickname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabelSitioWeb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        PanelInfoUsuario3Layout.setVerticalGroup(
            PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoUsuario3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickName2)
                    .addComponent(LabelNickname2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre2)
                    .addComponent(LabelNombre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail2)
                    .addComponent(LabelEmail2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac2)
                    .addComponent(LabelFechaNac2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion2)
                    .addComponent(LabelDescripcion2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSitioWeb2)
                    .addComponent(LabelSitioWeb2))
                .addGap(28, 28, 28)
                .addComponent(jLabelBiografia2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Información de actividad");

        BtnAgregarActividad1.setText("Agregar");
        BtnAgregarActividad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActividad1ActionPerformed(evt);
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
                        .addComponent(BtnAgregarActividad1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(BtnAgregarActividad1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if(listaActividades.getSelectedValue() == null) return;
        
        BtnModificarActividad.setEnabled(true);
    }//GEN-LAST:event_listaActividadesMouseClicked

    private void BtnAgregarActividad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActividad1ActionPerformed
        AgregarActividadDeportiva AgregarActividadFrame = new AgregarActividadDeportiva(controladorInstitucion, controladorActividad);
        AgregarActividadFrame.setResizable(false);
        AgregarActividadFrame.setVisible(true);
        AgregarActividadFrame.setLocationRelativeTo(null);
        AgregarActividadFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_BtnAgregarActividad1ActionPerformed

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
    private javax.swing.JButton BtnAgregarActividad1;
    private javax.swing.JButton BtnModificarActividad;
    private javax.swing.JLabel LabelDescripcion2;
    private javax.swing.JLabel LabelEmail2;
    private javax.swing.JLabel LabelFechaNac2;
    private javax.swing.JLabel LabelNickname2;
    private javax.swing.JLabel LabelNombre2;
    private javax.swing.JLabel LabelSitioWeb2;
    private javax.swing.JPanel PanelActividadDeportiva;
    private javax.swing.JPanel PanelInfoUsuario3;
    private javax.swing.JTextArea TextBiografia2;
    private javax.swing.JComboBox<DtInstitucionDeportiva> comboInstitucion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBiografia2;
    private javax.swing.JLabel jLabelDescripcion2;
    private javax.swing.JLabel jLabelEmail2;
    private javax.swing.JLabel jLabelFechaNac2;
    private javax.swing.JLabel jLabelNickName2;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelSitioWeb2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JList<DtActividadDeportiva> listaActividades;
    // End of variables declaration//GEN-END:variables
}
