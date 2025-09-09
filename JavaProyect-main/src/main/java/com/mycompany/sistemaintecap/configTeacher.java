/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaintecap;

import com.umg.proyect.model.Teacher;
import com.umg.proyect.service.TeacherService;

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
public class configTeacher extends javax.swing.JFrame {
private final TeacherService service = new TeacherService();
    private final DefaultTableModel model;

    /**
     * Creates new form Musica
     */
    public configTeacher() {
        initComponents();
        model = new DefaultTableModel(new String[]{"ID","Nombre", "Correo", "Contraseña", "Especialidad", "Estado"},0);
        jTableTeacher.setModel(model);
        
        jTableTeacher.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        @Override 
        public void valueChanged(ListSelectionEvent e){
            fillFieldsFromSelectedRow();
        }
        });
        txtID.enable(false);
    }
    
    private void fillFieldsFromSelectedRow(){ 
        int row = jTableTeacher.getSelectedRow(); 
        if(row != -1) { 
            int codigo = (int) model.getValueAt(row, 0); 
            txtID.setText(String.valueOf(codigo)); 
            txtNombre.setText((String) model.getValueAt(row, 1)); 
            txtEmail.setText((String) model.getValueAt(row, 2));
            txtPassword.setText((String) model.getValueAt(row, 3));
            txtSpeciality.setText((String) model.getValueAt(row, 4));
            txtStatus.setText((String) model.getValueAt(row, 5)); 
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeacher = new javax.swing.JTable();
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
        txtId1 = new javax.swing.JLabel();
        txtSpeciality = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableTeacher.setBackground(new java.awt.Color(255, 204, 255));
        jTableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "email", "password", "especialidad", "estado"
            }
        ));
        jScrollPane1.setViewportView(jTableTeacher);

        txtID.setBackground(new java.awt.Color(230, 255, 204));

        btnUpdate.setBackground(new java.awt.Color(189, 223, 255));
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 204, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtId.setText("ID");

        jLabel2.setText("Nombre");

        btnAdd.setBackground(new java.awt.Color(218, 255, 234));
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo:");

        txtNombre.setBackground(new java.awt.Color(230, 255, 204));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraseña:");

        txtPassword.setBackground(new java.awt.Color(230, 255, 204));

        jLabel5.setText("Estado:");

        txtEmail.setBackground(new java.awt.Color(230, 255, 204));

        txtStatus.setBackground(new java.awt.Color(230, 255, 204));

        txtId1.setText("Especialidad:");

        txtSpeciality.setBackground(new java.awt.Color(230, 255, 204));

        btnExit.setBackground(new java.awt.Color(206, 255, 214));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 24)); // NOI18N
        jLabel1.setText("Docente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnUpdate))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(txtId1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId)
                    .addComponent(txtSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnExit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try {
        int row = jTableTeacher.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un maestro de la tabla.");
            return;
        }
        
        int teacherId = Integer.parseInt(jTableTeacher.getValueAt(row, 0).toString());
        
        Teacher maestro = new Teacher();
        maestro.setId(teacherId);
        maestro.setNombre(txtNombre.getText());
        maestro.setPassword(txtPassword.getText()); 
        maestro.setEmail(txtEmail.getText());
        maestro.setEspecialidad(txtSpeciality.getText());
        
        String estadoStr = txtStatus.getText();
        Boolean estado = "true".equalsIgnoreCase(estadoStr) || "activo".equalsIgnoreCase(estadoStr);
        maestro.setEstado(estado);
        
        service.updateTeacher(teacherId, maestro); 
        
        JOptionPane.showMessageDialog(this, "Maestro actualizado correctamente.");
        loadTeachers();
        cleanFields();
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al actualizar maestro: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        loadTeachers();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Teacher m = new Teacher();
            m.setNombre(txtNombre.getText());
            m.setEmail(txtEmail.getText());
            m.setPassword(txtPassword.getText());
            m.setEspecialidad(txtSpeciality.getText());
            m.setEstado(Boolean.valueOf(txtStatus.getText()));

            Teacher created = service.createTeacher(m);
            model.addRow(new Object[]{
                created.getId(), created.getNombre(), created.getEmail(),
                created.getPassword(), created.getEspecialidad(), created.getEstado()
            });

            JOptionPane.showMessageDialog(this, "Maestro agregado correctamente.");
            cleanFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar el maestro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private void loadTeachers() {
        try {
            model.setRowCount(0);
            List<Teacher> lista = service.getTeacher();

            for (Teacher m : lista) {
                model.addRow(new Object[]{
                    m.getId(), m.getNombre(), m.getEmail(),
                    m.getPassword(), m.getEspecialidad(), m.getEstado()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar maestro: " + ex.getMessage());
        }
    }
        private void cleanFields() {
        txtID.setText("");
        txtNombre.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtSpeciality.setText("");
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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configTeacher().setVisible(true);
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
    private javax.swing.JTable jTableTeacher;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSpeciality;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
