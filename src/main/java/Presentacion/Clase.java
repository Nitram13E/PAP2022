/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Controlador.Interfaces.ICActDeportiva;
import Controlador.Interfaces.ICClase;
import Controlador.Interfaces.ICInstDeportiva;
import Controlador.Interfaces.ICUsuario;
import Datatypes.DtActividadDeportiva;
import Datatypes.DtClase;
import Datatypes.DtInstitucionDeportiva;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class Clase extends javax.swing.JFrame {

    ICClase controladorClase;
    ICInstDeportiva controladorInstitucion;
    ICUsuario controladorUsuario;
    ICActDeportiva controladorActividad;

    public Clase(ICClase controladorClase, ICInstDeportiva controladorInstitucion, ICUsuario controladorUsuario, ICActDeportiva controladorActividad) {
        this.controladorUsuario = controladorUsuario;
        this.controladorClase = controladorClase;
        this.controladorInstitucion = controladorInstitucion;
        this.controladorActividad = controladorActividad;
        initComponents();
        cargarComboActividades();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelClase2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        BtnAgregarClase2 = new javax.swing.JButton();
        PanelInfoUsuario5 = new javax.swing.JPanel();
        jLabelNickName4 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator34 = new javax.swing.JSeparator();
        jLabelEmail4 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jLabelFechaNac4 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jLabelSitioWeb4 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jLabelBiografia4 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        jScrollPane10 = new javax.swing.JScrollPane();
        TextBiografia4 = new javax.swing.JTextArea();
        nombreClase = new javax.swing.JLabel();
        fechaClase = new javax.swing.JLabel();
        horaClase = new javax.swing.JLabel();
        urlClase = new javax.swing.JLabel();
        LabelSitioWeb4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboInstitucion = new javax.swing.JComboBox<>();
        comboActividadDeportiva = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaClases = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Lista de Clases");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnAgregarClase2.setText("Agregar");
        BtnAgregarClase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarClase2ActionPerformed(evt);
            }
        });

        jLabelNickName4.setText("Nombre");

        jLabelNombre4.setText("Fecha");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Información de clase");

        jLabelEmail4.setText("Hora de inicio");

        jLabelFechaNac4.setText("URL");

        jLabelSitioWeb4.setText("Sitio Web");

        jLabelBiografia4.setText("Biografia");

        TextBiografia4.setColumns(20);
        TextBiografia4.setRows(5);
        jScrollPane10.setViewportView(TextBiografia4);

        nombreClase.setText("-");

        fechaClase.setText("-");

        horaClase.setText("-");

        urlClase.setText("-");

        LabelSitioWeb4.setText("-");

        javax.swing.GroupLayout PanelInfoUsuario5Layout = new javax.swing.GroupLayout(PanelInfoUsuario5);
        PanelInfoUsuario5.setLayout(PanelInfoUsuario5Layout);
        PanelInfoUsuario5Layout.setHorizontalGroup(
            PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoUsuario5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator32)
                    .addComponent(jSeparator33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator37, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator38, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                        .addComponent(jLabelSitioWeb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelSitioWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                        .addComponent(jLabelNickName4)
                        .addGap(285, 285, 285)
                        .addComponent(nombreClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                        .addComponent(jLabelNombre4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                        .addComponent(jLabelEmail4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(horaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                        .addComponent(jLabelBiografia4)
                        .addGap(0, 562, Short.MAX_VALUE))
                    .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                        .addComponent(jLabelFechaNac4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(urlClase, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelInfoUsuario5Layout.setVerticalGroup(
            PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoUsuario5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickName4)
                    .addComponent(nombreClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre4)
                    .addComponent(fechaClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail4)
                    .addComponent(horaClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac4)
                    .addComponent(urlClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInfoUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSitioWeb4)
                    .addComponent(LabelSitioWeb4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBiografia4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Institucion");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Actividad");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        comboInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInstitucionActionPerformed(evt);
            }
        });

        comboActividadDeportiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActividadDeportivaActionPerformed(evt);
            }
        });

        listaClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClasesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaClases);

        javax.swing.GroupLayout PanelClase2Layout = new javax.swing.GroupLayout(PanelClase2);
        PanelClase2.setLayout(PanelClase2Layout);
        PanelClase2Layout.setHorizontalGroup(
            PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClase2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelInfoUsuario5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelClase2Layout.createSequentialGroup()
                        .addGroup(PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(comboInstitucion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboActividadDeportiva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAgregarClase2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelClase2Layout.setVerticalGroup(
            PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClase2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelClase2Layout.createSequentialGroup()
                        .addComponent(comboInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboActividadDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAgregarClase2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelInfoUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelClase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelClase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarClase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarClase2ActionPerformed
        
        DtActividadDeportiva actividad = (DtActividadDeportiva)comboActividadDeportiva.getSelectedItem();
        DtInstitucionDeportiva institucion = (DtInstitucionDeportiva)comboInstitucion.getSelectedItem();
        
        if(actividad == null || institucion == null) return;
        
        AgregarClase agregarClaseFrame = new AgregarClase(actividad, institucion, controladorUsuario, controladorClase, controladorActividad);
        agregarClaseFrame.setVisible(true);
        agregarClaseFrame.setLocationRelativeTo(null);
        agregarClaseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
    }//GEN-LAST:event_BtnAgregarClase2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        cargarComboInstitucion();
        cargarListaClases();
    }//GEN-LAST:event_formWindowGainedFocus

    //Cargar actividades desde una determinada institucion
    private void comboInstitucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInstitucionActionPerformed
        DtInstitucionDeportiva dtInstitucion = (DtInstitucionDeportiva) comboInstitucion.getSelectedItem();

        List<DtActividadDeportiva> actividades = controladorInstitucion.getActividadesDeInstitucion(dtInstitucion.getNombre());

        DefaultComboBoxModel<DtActividadDeportiva> comboModel = new DefaultComboBoxModel<DtActividadDeportiva>();
        comboModel.addAll(actividades);
        comboActividadDeportiva.setModel(comboModel);
        comboActividadDeportiva.setEnabled(true);
    }//GEN-LAST:event_comboInstitucionActionPerformed

    private void comboActividadDeportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActividadDeportivaActionPerformed
        DefaultListModel<DtClase> listModel = new DefaultListModel<DtClase>();
        listModel.addAll(controladorActividad.getClases((DtActividadDeportiva) comboActividadDeportiva.getSelectedItem()));
        listaClases.setModel(listModel);
    }//GEN-LAST:event_comboActividadDeportivaActionPerformed

    private void listaClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClasesMouseClicked
       DtClase claseSeleccionada = listaClases.getSelectedValue();
        if(listaClases.getSelectedValue() == null) {
            return;
        }
        nombreClase.setText(claseSeleccionada.getNombre());
        fechaClase.setText(claseSeleccionada.getFecha().toString());
        horaClase.setText(claseSeleccionada.getHoraInicio().toString());
        urlClase.setText(claseSeleccionada.getUrl());
                
        listaClases.setEnabled(true);    
    }//GEN-LAST:event_listaClasesMouseClicked
    public void cargarComboInstitucion() {

        DefaultComboBoxModel<DtInstitucionDeportiva> comboModel = new DefaultComboBoxModel<DtInstitucionDeportiva>();
        comboModel.addAll(controladorInstitucion.getInstituciones());
        comboInstitucion.setModel(comboModel);
        comboInstitucion.setEnabled(true);

    }

    private void cargarComboActividades() {
        List<DtActividadDeportiva> actividades = new ArrayList<>();
        DefaultComboBoxModel<DtInstitucionDeportiva> comboModel = new DefaultComboBoxModel<DtInstitucionDeportiva>();

        comboModel.addAll(controladorInstitucion.getInstituciones());
        comboInstitucion.setModel(comboModel);
        comboInstitucion.setEnabled(true);
    }
    
    private void cargarListaClases() {
        if(comboActividadDeportiva.getSelectedItem() == null) return;
        
        DefaultListModel<DtClase> listModel = new DefaultListModel<DtClase>();
        listModel.addAll(controladorActividad.getClases((DtActividadDeportiva) comboActividadDeportiva.getSelectedItem()));
        listaClases.setModel(listModel);
    }
    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarClase2;
    private javax.swing.JLabel LabelSitioWeb4;
    private javax.swing.JPanel PanelClase2;
    private javax.swing.JPanel PanelInfoUsuario5;
    private javax.swing.JTextArea TextBiografia4;
    private javax.swing.JComboBox<DtActividadDeportiva> comboActividadDeportiva;
    private javax.swing.JComboBox<DtInstitucionDeportiva> comboInstitucion;
    private javax.swing.JLabel fechaClase;
    private javax.swing.JLabel horaClase;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBiografia4;
    private javax.swing.JLabel jLabelEmail4;
    private javax.swing.JLabel jLabelFechaNac4;
    private javax.swing.JLabel jLabelNickName4;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelSitioWeb4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JList<DtClase> listaClases;
    private javax.swing.JLabel nombreClase;
    private javax.swing.JLabel urlClase;
    // End of variables declaration//GEN-END:variables
}
