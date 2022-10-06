/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Controlador.Interfaces.*;
import Publicadores.*;
import com.formdev.flatlaf.FlatDarculaLaf;

public class GymAdmin extends javax.swing.JFrame {
    ICInstDeportiva controladorInstitucion;
    ICActDeportiva controladorActividad;
    ICUsuario controladorUsuario;
    ICClase controladorClase;
    ICRegistro controladorRegistro;

    ControladorPublishInstitucionDeportiva publishInstitucionDeportiva;
    ControladorPublishActividadDeportiva publishActividadDeportiva;
    ControladorPublishUsuario publishUsuario;
    ControladorPublishClase publishClase;
    ControladorPublishRegistro publishRegistro;

    public GymAdmin() {
        Fabrica fabrica = Fabrica.getInstancia();
        this.controladorInstitucion = fabrica.getICInstDeportiva();
        this.controladorActividad = fabrica.getICActDeportiva();
        this.controladorUsuario = fabrica.getICUsuario();
        this.controladorClase = fabrica.getICClase();
        this.controladorRegistro = fabrica.getICRegistro();

        this.publishInstitucionDeportiva = new ControladorPublishInstitucionDeportiva();
        this.publishInstitucionDeportiva.publicar();

        this.publishActividadDeportiva = new ControladorPublishActividadDeportiva();
        this.publishActividadDeportiva.publicar();

        this.publishUsuario = new ControladorPublishUsuario();
        this.publishUsuario.publicar();

        this.publishClase = new ControladorPublishClase();
        this.publishClase.publicar();

        this.publishRegistro = new ControladorPublishRegistro();
        this.publishRegistro.publicar();

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

        jLabel1 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnActividadDeportiva = new javax.swing.JButton();
        btnRegistrarSocio = new javax.swing.JButton();
        btnClases = new javax.swing.JButton();
        btnInstitucionDeportiva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRankingClases = new javax.swing.JButton();
        btnRankingActividades = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gym Admin");

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnActividadDeportiva.setText("Actividad Deportiva");
        btnActividadDeportiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadDeportivaActionPerformed(evt);
            }
        });

        btnRegistrarSocio.setText("Registrar Socio");
        btnRegistrarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarSocioActionPerformed(evt);
            }
        });

        btnClases.setText("Clases");
        btnClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasesActionPerformed(evt);
            }
        });

        btnInstitucionDeportiva.setText("Institución Deportiva");
        btnInstitucionDeportiva.setToolTipText("");
        btnInstitucionDeportiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstitucionDeportivaActionPerformed(evt);
            }
        });

        jLabel2.setText("ABM de usuarios");

        jLabel3.setText("ABM de instituciones deportivas");

        jLabel4.setText("ABM de actividades deportivas");

        jLabel5.setText("ABM de registrar socio");

        jLabel6.setText("ABM de clases");

        btnRankingClases.setText("Ranking de dictados de clases ");
        btnRankingClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingClasesActionPerformed(evt);
            }
        });

        btnRankingActividades.setText("Ranking de Actividades Deportivas ");
        btnRankingActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActividadesActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegistrarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClases, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActividadDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInstitucionDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRankingActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRankingClases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInstitucionDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActividadDeportiva, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnRankingActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClases, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnRankingClases, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //CASO DE USO INSTITUCION DEPORTIVA
    
    private void btnInstitucionDeportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstitucionDeportivaActionPerformed
        InstitucionDeportiva institucionDeportivaFrame = new InstitucionDeportiva(controladorInstitucion);
        institucionDeportivaFrame.setVisible(true);
        institucionDeportivaFrame.setLocationRelativeTo(null);
        institucionDeportivaFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnInstitucionDeportivaActionPerformed
    
    //CASO DE USO REGISTRAR SOCIO
    private void btnRegistrarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSocioActionPerformed
        Registro actividadDeportivaFrame = new Registro(controladorInstitucion, controladorActividad, controladorClase, controladorUsuario, controladorRegistro);
        actividadDeportivaFrame.setVisible(true);
        actividadDeportivaFrame.setLocationRelativeTo(null);
        actividadDeportivaFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnRegistrarSocioActionPerformed
    
    
    //CASO DE USO USUARIOS
    
    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        Usuario usuariosFrame = new Usuario(controladorUsuario, controladorInstitucion, controladorClase, controladorActividad);
        usuariosFrame.setVisible(true);
        usuariosFrame.setLocationRelativeTo(null);
        usuariosFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnActividadDeportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadDeportivaActionPerformed

        ActividadDeportiva actividadDeportivaFrame = new ActividadDeportiva(controladorInstitucion, controladorActividad);
        actividadDeportivaFrame.setResizable(false);
        actividadDeportivaFrame.setVisible(true);
        actividadDeportivaFrame.setLocationRelativeTo(null);
        actividadDeportivaFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnActividadDeportivaActionPerformed
    
    private void btnClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasesActionPerformed
        Clase claseFrame = new Clase(controladorClase, controladorInstitucion, controladorUsuario, controladorActividad);
        claseFrame.setVisible(true);
        claseFrame.setLocationRelativeTo(null);
        claseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnClasesActionPerformed

    private void btnRankingClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingClasesActionPerformed
        RankingDictadosClase RankingDictadosClaseFrame = new RankingDictadosClase(controladorClase);
        RankingDictadosClaseFrame.setVisible(true);
        RankingDictadosClaseFrame.setLocationRelativeTo(null);
        RankingDictadosClaseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnRankingClasesActionPerformed

    private void btnRankingActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActividadesActionPerformed
        RankingActividadDeportiva RankingDictadosClaseFrame = new RankingActividadDeportiva(controladorActividad);
        RankingDictadosClaseFrame.setVisible(true);
        RankingDictadosClaseFrame.setLocationRelativeTo(null);
        RankingDictadosClaseFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnRankingActividadesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GymAdmin gymAdminFrame = new GymAdmin();
                gymAdminFrame.setVisible(true);
                gymAdminFrame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividadDeportiva;
    private javax.swing.JButton btnClases;
    private javax.swing.JButton btnInstitucionDeportiva;
    private javax.swing.JButton btnRankingActividades;
    private javax.swing.JButton btnRankingClases;
    private javax.swing.JButton btnRegistrarSocio;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
