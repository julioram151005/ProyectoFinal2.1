/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaintecap;

import com.umg.proyect.model.Admin;
import com.umg.proyect.service.AdminService;

import java.util.List; 
import javax.swing.Box; 
import javax.swing.JOptionPane; 
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener; 
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author josth
 */
public class configAdmin extends javax.swing.JFrame {
private final AdminService service = new AdminService();
    private final DefaultTableModel model;

    /**
     * Creates new form Musica
     */
    public configAdmin() {
        initComponents();
        model = new DefaultTableModel(new String[]{"ID","Nombre", "Correo", "Constraseña", "Estado"},0);
        jTableAdmin.setModel(model);
        
        jTableAdmin.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        @Override 
        public void valueChanged(ListSelectionEvent e){
            fillFieldsFromSelectedRow();
        }
        });
        txtID.enable(false);
    }
    
    private void fillFieldsFromSelectedRow(){ 
        int row = jTableAdmin.getSelectedRow(); 
        if(row != -1) { 
            int codigo = (int) model.getValueAt(row, 0); 
            txtID.setText(String.valueOf(codigo)); 
            txtNombre.setText((String) model.getValueAt(row, 1)); 
            txtEmail.setText((String) model.getValueAt(row, 2));
            txtPassword.setText((String) model.getValueAt(row, 3));
            txtStatus.setText((String) model.getValueAt(row, 4)); 
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTableAdmin.setBackground(new java.awt.Color(255, 204, 204));
        jTableAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "email", "password", "estado"
            }
        ));
        jScrollPane1.setViewportView(jTableAdmin);

        txtID.setBackground(new java.awt.Color(235, 255, 241));
        txtID.setFont(new java.awt.Font("Pristina", 0, 12)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(243, 221, 235));
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(204, 255, 204));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtId.setText("ID");

        jLabel2.setText("Nombre");

        btnAdd.setBackground(new java.awt.Color(255, 255, 204));
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo:");

        txtNombre.setBackground(new java.awt.Color(235, 255, 241));
        txtNombre.setFont(new java.awt.Font("Pristina", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraseña:");

        txtPassword.setBackground(new java.awt.Color(235, 255, 241));
        txtPassword.setFont(new java.awt.Font("Pristina", 0, 12)); // NOI18N

        jLabel5.setText("Estado:");

        txtEmail.setBackground(new java.awt.Color(235, 255, 241));
        txtEmail.setFont(new java.awt.Font("Pristina", 0, 12)); // NOI18N

        txtStatus.setBackground(new java.awt.Color(235, 255, 241));
        txtStatus.setFont(new java.awt.Font("Pristina", 0, 12)); // NOI18N

        btnExit.setBackground(new java.awt.Color(255, 102, 153));
        btnExit.setText("Regresar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 24)); // NOI18N
        jLabel1.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStatus)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate))
                        .addGap(18, 18, 18)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnExit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
        int row = jTableAdmin.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un administrador de la tabla.");
            return;
        }

        Admin admin = new Admin();
        admin.setId(Integer.parseInt(txtID.getText()));
        admin.setNombre(txtNombre.getText());
        admin.setPassword(txtPassword.getText());
        admin.setEmail(txtEmail.getText());
        admin.setEstado(Boolean.parseBoolean(txtStatus.getText()));

        service.updateAdmin(admin.getId(), admin);

        JOptionPane.showMessageDialog(this, "Administrador actualizado correctamente.");
        loadAdmins();
        cleanFields();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al actualizar administrador: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        loadAdmins();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Admin m = new Admin();
            m.setNombre(txtNombre.getText());
            m.setEmail(txtEmail.getText());
            m.setPassword(txtPassword.getText());
            m.setEstado(Boolean.parseBoolean(txtStatus.getText()));

            Admin created = service.createAdmin(m);
            model.addRow(new Object[]{
                created.getId(), created.getNombre(), created.getEmail(),
                created.getPassword(), created.getEstado()
            });

            JOptionPane.showMessageDialog(this, "Administrador agregada correctamente.");
            cleanFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar el Administrador: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private void loadAdmins() {
        try {
            model.setRowCount(0);
            List<Admin> lista = service.getAdmin();

            for (Admin m : lista) {
                model.addRow(new Object[]{
                    m.getId(), m.getNombre(), m.getEmail(),
                    m.getPassword(), m.getEstado()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar Administradores: " + ex.getMessage());
        }
    }
        private void cleanFields() {
        txtID.setText("");
        txtNombre.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtStatus.setText("");
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
