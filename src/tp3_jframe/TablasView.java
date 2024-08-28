/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_jframe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hernandez Fernando
 */
public class TablasView extends javax.swing.JFrame {
   private DefaultTableModel defaultTableModel = new DefaultTableModel();
    /**
     * Creates new form TablasView
     */
    public TablasView() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCargaAlumnos = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCargaAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCargaAlumnos.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabelCargaAlumnos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCargaAlumnos.setText("Carga Alumnos");

        jLabelMatricula.setText("Matricula:");

        jLabelApellido.setText("Apellido:");

        jLabelNombre.setText("Nombre:");

        jButtonCargar.setText("Cargar");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableAlumnos);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMatricula))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCargaAlumnos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCargar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCargaAlumnos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatricula)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        // TODO add your handling code here:
        try {
            int matricula = Integer.parseInt(jTextFieldMatricula.getText());
            if (jTextFieldApellido.getText().isEmpty() || jTextFieldNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios.");
                return;
            }
            String apellido = jTextFieldApellido.getText();
            String nombre = jTextFieldNombre.getText();
            Alumno alumno = new Alumno(matricula, apellido, nombre);
            cargarDatos(alumno);
            jTextFieldMatricula.setText("");
            jTextFieldApellido.setText("");
            jTextFieldNombre.setText("");
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "La matricula tiene que ser un entero.");
        }
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTableAlumnos.getSelectedRow();
        if (filaSeleccionada != -1) {
            defaultTableModel.removeRow(filaSeleccionada);
        }else {
            JOptionPane.showMessageDialog(this, "Usted debe seleccionar una fila para eliminar.");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(TablasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCargaAlumnos;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
        defaultTableModel.addColumn("Matricula");
        defaultTableModel.addColumn("Apellido");
        defaultTableModel.addColumn("Nombre");
        jTableAlumnos.setModel(defaultTableModel);
    }

    private void cargarDatos(Alumno alumno) {
        defaultTableModel.addRow(new Object[] {alumno.getMatricula(), alumno.getApellido(), alumno.getNombre()});
    }
}
