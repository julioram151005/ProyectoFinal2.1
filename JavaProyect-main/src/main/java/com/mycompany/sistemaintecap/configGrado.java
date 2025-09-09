package com.mycompany.sistemaintecap;


import com.umg.proyect.model.Student;
import com.umg.proyect.service.StudentService;
import com.umg.proyect.model.Curso;
import com.umg.proyect.service.CursoService;
import com.umg.proyect.model.Grados;
import com.umg.proyect.service.GradoService;
import java.util.List; 
import javax.swing.JOptionPane; 
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener; 
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author josth
 */
public class configGrado extends javax.swing.JFrame {
    private final StudentService service = new StudentService();
    private final CursoService servicecurse = new CursoService();
    private final GradoService gradeservice = new GradoService();
    private final DefaultTableModel model;
        private Configuracion back;
    public void setBack(Configuracion back) {
        this.back = back;
    }        
    /**
     * Creates new form Musica
     */
    public configGrado() {
        initComponents();
        model = new DefaultTableModel(new String[]{"ID","Curso", "Estudiante", "Nota", "Tipo"}, 0);
        jTableGrade.setModel(model);
        jTableGrade.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
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
        int row = jTableGrade.getSelectedRow();
        if(row != -1) {
            Object val0 = model.getValueAt(row, 0);
            Object val1 = model.getValueAt(row, 1); 
            Object val2 = model.getValueAt(row, 2); 
            Object val3 = model.getValueAt(row, 3); 
            Object val4 = model.getValueAt(row, 4); 
            txtID.setText(val0 != null ? String.valueOf(val0) : "");
            txtCourseId.setText(val1 != null ? String.valueOf(val1) : "");
            txtStudentId.setText(val2 != null ? String.valueOf(val2) : "");
            txtNote.setText(val3 != null ? String.valueOf(val3) : "");
            txtType.setText(val4 != null ? String.valueOf(val4) : "");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGrade = new javax.swing.JTable();
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
        txtId2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtNote = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableGrade.setBackground(new java.awt.Color(255, 255, 204));
        jTableGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "id_curso", "id_student", "nota", "tipo"
            }
        ));
        jScrollPane1.setViewportView(jTableGrade);

        txtID.setBackground(new java.awt.Color(234, 233, 249));
        txtID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 255, 204));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtId.setText("ID");

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setText("ID curso");

        txtCourseId.setBackground(new java.awt.Color(234, 233, 249));
        txtCourseId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtId1.setText("Id Estudiante");

        txtStudentId.setBackground(new java.awt.Color(234, 233, 249));
        txtStudentId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIdActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 204, 204));
        btnExit.setText("Regresar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtId2.setText("Nota:");

        jLabel5.setText("Tipo:");

        txtType.setBackground(new java.awt.Color(234, 233, 249));
        txtType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNote.setBackground(new java.awt.Color(234, 233, 249));
        txtNote.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 24)); // NOI18N
        jLabel1.setText("Grado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId)
                            .addComponent(jLabel4)
                            .addComponent(txtId1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit)
                                .addGap(14, 14, 14)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCourseId)
                                    .addComponent(txtStudentId)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtId2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtType)
                                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnExit))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int row = jTableGrade.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Selecciona un grado de la tabla.");
                return;
            }
            if (txtID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "ID del grado vacío.");
                return;
            }
            
            if (txtStudentId.getText().trim().isEmpty() || 
                txtCourseId.getText().trim().isEmpty() ||
                txtNote.getText().trim().isEmpty() ||
                txtType.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }
            
            int gradeId = Integer.parseInt(txtID.getText().trim());
            int studentId = Integer.parseInt(txtStudentId.getText().trim());
            int cursoId = Integer.parseInt(txtCourseId.getText().trim());
            int nota = Integer.parseInt(txtNote.getText().trim());

            if (nota < 0 || nota > 100) {
                JOptionPane.showMessageDialog(this, "La nota debe estar entre 0 y 100.");
                return;
            }
            
            Grados grade = new Grados();
            grade.setId(gradeId);
            grade.setId_curso(cursoId);
            grade.setId_student(studentId);
            grade.setNota(nota);
            grade.setTipo(txtType.getText().trim());
            
            Grados resultado = gradeservice.updateGrado(gradeId, grade);
            
            if (resultado != null) {
                JOptionPane.showMessageDialog(this, "Grado actualizado correctamente.");
                cleanFields();
                cargarGrados();
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar el grado.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los campos ID/Nota deben contener números válidos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar grado: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
                cargarGrados();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // Validar campos
            if (txtCourseId.getText().trim().isEmpty() || 
                txtStudentId.getText().trim().isEmpty() ||
                txtNote.getText().trim().isEmpty() ||
                txtType.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
                return;
            }
            
            int cursoId = Integer.parseInt(txtCourseId.getText().trim());
            int studentId = Integer.parseInt(txtStudentId.getText().trim());
            int nota = Integer.parseInt(txtNote.getText().trim());
            
            if (nota < 0 || nota > 100) {
                JOptionPane.showMessageDialog(this, "La nota debe estar entre 0 y 100.");
                return;
            }
            
            Grados g = new Grados();
            g.setId_curso(cursoId);
            g.setId_student(studentId);
            g.setNota(nota);
            g.setTipo(txtType.getText().trim());
            
            Grados creado = gradeservice.createGrado(g);
            
            if (creado != null) {
                model.addRow(new Object[]{
                    creado.getId(),
                    creado.getId_curso(),
                    creado.getId_student(),
                    creado.getNota(),
                    creado.getTipo()
                });
                JOptionPane.showMessageDialog(this, "Grado agregado correctamente.");
                cleanFields();
            } else {
                JOptionPane.showMessageDialog(this, "Error al agregar el grado.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los campos deben contener números válidos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al agregar el grado: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private void cargarGrados() {
        try {
            model.setRowCount(0);
            List<Grados> list = gradeservice.getGrado();
            for (Grados g : list) {
                model.addRow(new Object[]{
                    g.getId(),
                    g.getId_curso(),
                    g.getId_student(),
                    g.getNota(),
                    g.getTipo()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar grados: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    private void cleanFields() {
        txtID.setText("");
        txtCourseId.setText("");
        txtStudentId.setText("");
        txtNote.setText("");
        txtType.setText("");
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIdActionPerformed

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
    java.util.logging.Logger.getLogger(configGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (InstantiationException ex) {
    java.util.logging.Logger.getLogger(configGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
    java.util.logging.Logger.getLogger(configGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(configGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configGrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGrade;
    private javax.swing.JTextField txtCourseId;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtId1;
    private javax.swing.JLabel txtId2;
    private javax.swing.JTextField txtNote;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
