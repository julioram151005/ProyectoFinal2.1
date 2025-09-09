/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaintecap;

import com.umg.proyect.model.Asignacion;
import com.umg.proyect.service.AsignacionService;
import java.util.List; 
import javax.swing.JOptionPane; 
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener; 
import javax.swing.table.DefaultTableModel;

public class configAsignacion extends javax.swing.JFrame {
    private final AsignacionService asignservice = new AsignacionService();
    private final DefaultTableModel model;

    public configAsignacion() {
        initComponents();
        model = new DefaultTableModel(new String[]{"ID","ID Estudiante", "ID Curso", "Especialidad", "Modalidad", "Horario"}, 0);
        jTableAsign.setModel(model);
        
        jTableAsign.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override 
            public void valueChanged(ListSelectionEvent e){
                if (!e.getValueIsAdjusting()) {
                    fillFieldsFromSelectedRow();
                }
            }
        });
        txtID.setEnabled(false);
    }
    
    private void fillFieldsFromSelectedRow(){ 
        int row = jTableAsign.getSelectedRow(); 
        if(row != -1) { 
            txtID.setText(model.getValueAt(row, 0).toString());
            txtStudentId.setText(model.getValueAt(row, 1).toString());
            txtCourseId.setText(model.getValueAt(row, 2).toString());
            txtEspecialidad.setText(model.getValueAt(row, 3).toString());
            txtModalidad.setText(model.getValueAt(row, 4).toString());
            txtHorario.setText(model.getValueAt(row, 5).toString());
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAsign = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCourseId = new javax.swing.JTextField();
        txtId1 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModalidad = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAsign.setBackground(new java.awt.Color(204, 255, 204));
        jTableAsign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "id_student", "id_curse", "especialidad", "modalidad", "horario"
            }
        ));
        jScrollPane1.setViewportView(jTableAsign);

        txtID.setBackground(new java.awt.Color(218, 254, 255));
        txtID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(254, 255, 217));
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

        btnAdd.setBackground(new java.awt.Color(255, 255, 204));
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso:");

        txtCourseId.setBackground(new java.awt.Color(218, 254, 255));
        txtCourseId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtId1.setText("Estudiante:");

        txtStudentId.setBackground(new java.awt.Color(218, 254, 255));
        txtStudentId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnExit.setBackground(new java.awt.Color(222, 253, 255));
        btnExit.setText("Regresar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Especialidad");

        txtEspecialidad.setBackground(new java.awt.Color(218, 254, 255));
        txtEspecialidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setText("Modalidad");

        txtModalidad.setBackground(new java.awt.Color(218, 254, 255));
        txtModalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtHorario.setBackground(new java.awt.Color(218, 254, 255));
        txtHorario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setText("Horario");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 24)); // NOI18N
        jLabel3.setText("Asignación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId)
                                    .addGap(15, 15, 15)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtID)
                            .addComponent(txtCourseId)
                            .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId1)
                                .addGap(18, 18, 18)
                                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit)
                                .addGap(14, 14, 14)
                                .addComponent(btnUpdate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId1)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnExit))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    try {
        int row = jTableAsign.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una asignación de la tabla.");
            return;
        }
        
        if (txtStudentId.getText().trim().isEmpty() || 
            txtCourseId.getText().trim().isEmpty() ||
            txtEspecialidad.getText().trim().isEmpty() ||
            txtModalidad.getText().trim().isEmpty() ||
            txtHorario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }
        
        Asignacion asign = new Asignacion();
        asign.setId(Integer.parseInt(txtID.getText().trim()));
        asign.setId_student(Integer.parseInt(txtStudentId.getText().trim()));
        asign.setId_curse(Integer.parseInt(txtCourseId.getText().trim()));
        asign.setEspecialidad(txtEspecialidad.getText().trim()); // ← CORRECTO
        asign.setModalidad(txtModalidad.getText().trim());
        asign.setHorario(txtHorario.getText().trim());
        

        Asignacion resultado = asignservice.updateAsigancio(asign.getId(), asign);
        
        if (resultado != null) {
            JOptionPane.showMessageDialog(this, "Asignación actualizada correctamente.");
            cleanFields();
            cargarAsignaciones();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar la asignación.");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Los campos ID deben contener números válidos.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al actualizar asignación: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cargarAsignaciones();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // Validar campos obligatorios
            if (txtStudentId.getText().trim().isEmpty() || 
                txtCourseId.getText().trim().isEmpty() ||
                txtEspecialidad.getText().trim().isEmpty() ||
                txtModalidad.getText().trim().isEmpty() ||
                txtHorario.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }
            
            Asignacion asign = new Asignacion();
            asign.setId_student(Integer.parseInt(txtStudentId.getText().trim()));
            asign.setId_curse(Integer.parseInt(txtCourseId.getText().trim()));
            asign.setEspecialidad(txtEspecialidad.getText().trim());
            asign.setModalidad(txtModalidad.getText().trim());
            asign.setHorario(txtHorario.getText().trim());
            
            Asignacion created = asignservice.createAsignacion(asign);
            
            if (created != null) {
                model.addRow(new Object[]{
                    created.getId(),
                    created.getId_student(),
                    created.getId_curse(),
                    created.getEspecialidad(),
                    created.getModalidad(),
                    created.getHorario()
                });
                JOptionPane.showMessageDialog(this, "Asignación agregada correctamente.");
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar la asignación.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID del estudiante y curso deben ser números.");
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Error al agregar la asignación: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cleanFields() {
        txtID.setText("");
        txtStudentId.setText("");
        txtCourseId.setText("");
        txtEspecialidad.setText("");
        txtModalidad.setText("");
        txtHorario.setText("");
    }
    private void cargarAsignaciones() {
        try {
            model.setRowCount(0);
            List<Asignacion> list = asignservice.getAsignacion();
            for (Asignacion a : list) {
                model.addRow(new Object[]{
                    a.getId(),
                    a.getId_student(),
                    a.getId_curse(),
                    a.getEspecialidad(),
                    a.getModalidad(),
                    a.getHorario()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar asignaciones: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(configAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configAsignacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configAsignacion().setVisible(true);
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
    private javax.swing.JTable jTableAsign;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
