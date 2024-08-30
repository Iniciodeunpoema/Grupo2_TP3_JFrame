/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.JOptionPane;

/**
 *
 * @author Hernandez Fernando
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Calculator() {
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

        jPanelNorth = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jTextFieldFirtsNum = new javax.swing.JTextField();
        jTextFieldSecondNum = new javax.swing.JTextField();
        jComboBoxOperacionesMate = new javax.swing.JComboBox<>();
        jButtonOperacionesMate = new javax.swing.JButton();
        jPanelSouth = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTitulo.setText("Aplicacion de suma");
        jPanelNorth.add(jLabelTitulo);

        getContentPane().add(jPanelNorth, java.awt.BorderLayout.NORTH);

        jPanelCenter.setLayout(new java.awt.GridBagLayout());

        jTextFieldFirtsNum.setText("jTextField1");
        jPanelCenter.add(jTextFieldFirtsNum, new java.awt.GridBagConstraints());

        jTextFieldSecondNum.setText("jTextField2");
        jPanelCenter.add(jTextFieldSecondNum, new java.awt.GridBagConstraints());

        jComboBoxOperacionesMate.setEditable(true);
        jComboBoxOperacionesMate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Division", "Multiplicacion" }));
        jComboBoxOperacionesMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacionesMateActionPerformed(evt);
            }
        });
        jPanelCenter.add(jComboBoxOperacionesMate, new java.awt.GridBagConstraints());

        jButtonOperacionesMate.setText("JButton");
        jButtonOperacionesMate.setText((String) jComboBoxOperacionesMate.getSelectedItem());
        jButtonOperacionesMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperacionesMateActionPerformed(evt);
            }
        });
        jPanelCenter.add(jButtonOperacionesMate, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        jLabelResultado.setText("Resultado");
        jPanelSouth.add(jLabelResultado);

        getContentPane().add(jPanelSouth, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOperacionesMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesMateActionPerformed
        String operacionSeleccionada = (String) jComboBoxOperacionesMate.getSelectedItem();
        jButtonOperacionesMate.setText(operacionSeleccionada);
    }//GEN-LAST:event_jComboBoxOperacionesMateActionPerformed

    private void jButtonOperacionesMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperacionesMateActionPerformed
        // TODO add your handling code here:
        try {
        double num1 = Double.parseDouble(jTextFieldFirtsNum.getText());
        double num2 = Double.parseDouble(jTextFieldFirtsNum.getText());
        String operacion = (String) jComboBoxOperacionesMate.getSelectedItem();
        double resultado = 0;
        
        switch (operacion) {
            case "Sumar":
                resultado = (num1 + num2);
                break;
            case "Restar":
                resultado = (num1 - num2);
                break;
            case "Division":
                if (num1 == 0 || num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por 0 !");
                    return;
                }else {
                    resultado = (num1 / num2);
                }
                break;
            case "Multiplicar":
                resultado = (num1 * num2);
                break;
        }
        jLabelResultado.setText("Resultado: " + resultado);
        }catch(NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Ingrese numeros validos!");
        }
    }//GEN-LAST:event_jButtonOperacionesMateActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOperacionesMate;
    private javax.swing.JComboBox<String> jComboBoxOperacionesMate;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JTextField jTextFieldFirtsNum;
    private javax.swing.JTextField jTextFieldSecondNum;
    // End of variables declaration//GEN-END:variables
}
