/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Controlador.Interfaces.ICActDeportiva;
import Datatypes.DtActividadDeportiva;

import javax.swing.*;
import java.util.List;

public class RankingActividadDeportiva extends javax.swing.JFrame {

    ICActDeportiva controladorActividad;
    
    public RankingActividadDeportiva(ICActDeportiva controladorActividad) {
        this.controladorActividad = controladorActividad;
        
        initComponents();
        
        cargarActividades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        panelInfoActividad = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabelFechaNac3 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        labelCosto = new javax.swing.JLabel();
        jLabelNickName3 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabelBiografia3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Información de actividad");

        jLabelFechaNac3.setText("Costo");

        labelCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCosto.setText("-");

        jLabelNickName3.setText("Nombre");

        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("-");

        jLabelBiografia3.setText("Descripción");

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        textDescripcion.setEnabled(false);
        jScrollPane9.setViewportView(textDescripcion);

        javax.swing.GroupLayout panelInfoActividadLayout = new javax.swing.GroupLayout(panelInfoActividad);
        panelInfoActividad.setLayout(panelInfoActividadLayout);
        panelInfoActividadLayout.setHorizontalGroup(
            panelInfoActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoActividadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator21)
                    .addGroup(panelInfoActividadLayout.createSequentialGroup()
                        .addComponent(jLabelNickName3)
                        .addGap(60, 60, 60)
                        .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInfoActividadLayout.createSequentialGroup()
                        .addComponent(jLabelFechaNac3)
                        .addGap(73, 73, 73)
                        .addComponent(labelCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInfoActividadLayout.createSequentialGroup()
                        .addComponent(jLabelBiografia3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInfoActividadLayout.setVerticalGroup(
            panelInfoActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoActividadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addGroup(panelInfoActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNickName3)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac3)
                    .addComponent(labelCosto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBiografia3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfoActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelInfoActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaActividadesMouseClicked
        if(listaActividades.getSelectedValue() == null) return;
        
        DtActividadDeportiva actividad = listaActividades.getSelectedValue();

        labelNombre.setText(actividad.getNombre());
        labelCosto.setText(actividad.getCosto().toString());
        textDescripcion.setText(actividad.getDesc());
    }//GEN-LAST:event_listaActividadesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    public void cargarActividades() {
        List<DtActividadDeportiva> actividades = controladorActividad.getActividadesRanking();
        DefaultListModel<DtActividadDeportiva> listModel = new DefaultListModel<DtActividadDeportiva>();
        listModel.addAll(actividades);
        listaActividades.setModel(listModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabelBiografia3;
    private javax.swing.JLabel jLabelFechaNac3;
    private javax.swing.JLabel jLabelNickName3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList<DtActividadDeportiva> listaActividades;
    private javax.swing.JPanel panelInfoActividad;
    private javax.swing.JTextArea textDescripcion;
    // End of variables declaration//GEN-END:variables
}
