/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaintecap;

import com.umg.proyect.model.Teacher;
import com.umg.proyect.service.TeacherService;
import com.umg.proyect.model.Curso;
import com.umg.proyect.service.CursoService;
import java.util.List; 
import javax.swing.JOptionPane; 
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener; 
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author josth
 */
public class configCursos extends javax.swing.JFrame {
    private final TeacherService service = new TeacherService();
    private final CursoService servicecurse = new CursoService();
    private final DefaultTableModel model;

    /**
     * Creates new form Musica
     */
    public configCursos() {
        initComponents();
        model = new DefaultTableModel(new String[]{"ID","ID Maestro", "Nombre", "Descripción", "Código", "Semestre"}, 0);
        jTableCurse.setModel(model);
        
        jTableCurse.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
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
        int row = jTableCurse.getSelectedRow(); 
        if(row != -1) { 
            txtID.setText(model.getValueAt(row, 0).toString());
            txtTeacherId.setText(model.getValueAt(row, 1).toString());
            txtNombre.setText(model.getValueAt(row, 2).toString());
            txtDescription.setText(model.getValueAt(row, 3).toString());
            txtCode.setText(model.getValueAt(row, 4).toString());
            txtSemester.setText(model.getValueAt(row, 5).toString());
        } 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurse = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        txtId1 = new javax.swing.JLabel();
        txtTeacherId = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCurse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "id_teacher", "nombre", "descripcion", "codigo", "semestre"
            }
        ));
        jScrollPane1.setViewportView(jTableCurse);

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtId.setText("ID");

        jLabel2.setText("Nombre");

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo:");

        jLabel5.setText("Semestre:");

        txtId1.setText("ID Maestro:");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExit)
                                    .addComponent(btnUpdate)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(txtSemester)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtId1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId)
                    .addComponent(txtTeacherId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int row = jTableCurse.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Selecciona un curso de la tabla.");
                return;
            }
            
            if (txtTeacherId.getText().trim().isEmpty() || 
                txtNombre.getText().trim().isEmpty() ||
                txtCode.getText().trim().isEmpty() ||
                txtSemester.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID Maestro, Nombre, Código y Semestre son campos obligatorios.");
                return;
            }
            
            int teacherId = Integer.parseInt(txtTeacherId.getText().trim());
            Teacher t = service.getTeacherById(teacherId);
            if(t == null){
                JOptionPane.showMessageDialog(this, "El maestro ID " + teacherId + " no existe.");
                return;
            }
            
            Curso curso = new Curso();
            curso.setId(Integer.parseInt(txtID.getText().trim()));
            curso.setId_teacher(teacherId); // Usar setId_teacher en lugar de setTeacher_id
            curso.setNombre(txtNombre.getText().trim());
            curso.setDescripcion(txtDescription.getText().trim());
            curso.setCodigo(Integer.parseInt(txtCode.getText().trim()));
            curso.setSemestre(txtSemester.getText().trim());
            
            Curso resultado = servicecurse.updateCurso(curso.getId(), curso);
            
            if (resultado != null) {
                JOptionPane.showMessageDialog(this, "Curso actualizado correctamente.");
                cleanFields();
                cargarCursos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el curso.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID Maestro y Código deben ser números válidos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar curso: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        cargarCursos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // Validar campos obligatorios
            if (txtTeacherId.getText().trim().isEmpty() || 
                txtNombre.getText().trim().isEmpty() ||
                txtCode.getText().trim().isEmpty() ||
                txtSemester.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID Maestro, Nombre, Código y Semestre son campos obligatorios.");
                return;
            }
            
            int teacherId = Integer.parseInt(txtTeacherId.getText().trim());
            Teacher t = service.getTeacherById(teacherId);
            if(t == null){
                JOptionPane.showMessageDialog(this, "El maestro ID " + teacherId + " no existe.");
                return;
            }
            
            Curso curso = new Curso();
            curso.setId_teacher(teacherId); // Usar setId_teacher
            curso.setNombre(txtNombre.getText().trim());
            curso.setDescripcion(txtDescription.getText().trim());
            curso.setCodigo(Integer.parseInt(txtCode.getText().trim()));
            curso.setSemestre(txtSemester.getText().trim());
            
            Curso created = servicecurse.createCurso(curso);
            
            if (created != null) {
                model.addRow(new Object[]{
                    created.getId(),
                    created.getId_teacher(),
                    created.getNombre(),
                    created.getDescripcion(),
                    created.getCodigo(),
                    created.getSemestre()
                });
                JOptionPane.showMessageDialog(this, "Curso agregado correctamente.");
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el curso.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID del maestro y código deben ser números.");
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Error al agregar el curso: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private void cargarCursos() {
        try {
            model.setRowCount(0);
            List<Curso> list = servicecurse.getCursos();
            for (Curso c : list) {
                model.addRow(new Object[]{
                    c.getId(),
                    c.getId_teacher(), 
                    c.getNombre(),
                    c.getDescripcion(),
                    c.getCodigo(),
                    c.getSemestre()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar cursos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    private void cleanFields() {
        txtID.setText("");
        txtNombre.setText("");
        txtDescription.setText("");
        txtCode.setText("");
        txtTeacherId.setText("");
        txtSemester.setText("");
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
            java.util.logging.Logger.getLogger(configCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCurse;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtTeacherId;
    // End of variables declaration//GEN-END:variables
}
