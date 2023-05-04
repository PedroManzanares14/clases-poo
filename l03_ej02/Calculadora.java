/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uca.l03_ej02;

import javax.swing.JOptionPane;

/**
 *
 * @author majub
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        titleLbl = new javax.swing.JLabel();
        primerNumTxt = new javax.swing.JTextField();
        segundoNumTxt = new javax.swing.JTextField();
        sumarBtn = new javax.swing.JButton();
        restarBtn = new javax.swing.JButton();
        multiplicarBtn = new javax.swing.JButton();
        dividirBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLbl.setText("Calculadora");

        sumarBtn.setText("Sumar");
        sumarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarBtnActionPerformed(evt);
            }
        });

        restarBtn.setText("Restar");
        restarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarBtnActionPerformed(evt);
            }
        });

        multiplicarBtn.setText("Multiplicar");
        multiplicarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarBtnActionPerformed(evt);
            }
        });

        dividirBtn.setText("Dividir");
        dividirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirBtnActionPerformed(evt);
            }
        });

        salirBtn.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salirBtn)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(primerNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(segundoNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sumarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(restarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplicarBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dividirBtn)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLbl)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titleLbl)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumarBtn)
                    .addComponent(restarBtn)
                    .addComponent(multiplicarBtn)
                    .addComponent(dividirBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(salirBtn)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void sumarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarBtnActionPerformed
        try {
            int valor1 = Integer.parseInt(primerNumTxt.getText());
            int valor2 = Integer.parseInt(segundoNumTxt.getText());

            JOptionPane.showMessageDialog(null, "la suma es: " + (valor1 + valor2));

        } catch (Exception e) {
            System.out.println("ha ocurrido un error");
        }
    }//GEN-LAST:event_sumarBtnActionPerformed

    private void restarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarBtnActionPerformed
        try {
            int valor1 = Integer.parseInt(primerNumTxt.getText());
            int valor2 = Integer.parseInt(segundoNumTxt.getText());

            JOptionPane.showMessageDialog(null, "la resta es: " + (valor1 - valor2));

        } catch (Exception e) {
            System.out.println("ha ocurrido un error");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_restarBtnActionPerformed

    private void multiplicarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarBtnActionPerformed
        try {
            int valor1 = Integer.parseInt(primerNumTxt.getText());
            int valor2 = Integer.parseInt(segundoNumTxt.getText());

            JOptionPane.showMessageDialog(null, "la multiplicacion es: " + (valor1 * valor2));

        } catch (Exception e) {
            System.out.println("ha ocurrido un error");
        }
    }//GEN-LAST:event_multiplicarBtnActionPerformed

    class Excepcion_personalizada extends Exception {

        public Excepcion_personalizada(String message) {
            super(message);
        }
    
    
        }
        public void dividir() throws Excepcion_personalizada {
            int valor2 = Integer.parseInt(segundoNumTxt.getText());
            if (valor2 == 0) {
                throw new Excepcion_personalizada("la division no puede ser entre 0");
            } else {

                int valor1 = Integer.parseInt(primerNumTxt.getText());
                int valor3 = Integer.parseInt(segundoNumTxt.getText());

                JOptionPane.showMessageDialog(null, "la division es: " + (valor1 / valor3));

            }
            
            
        }
    private void dividirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirBtnActionPerformed

        try {
            dividir();
        } catch (Excepcion_personalizada e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_dividirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividirBtn;
    private javax.swing.JButton multiplicarBtn;
    private javax.swing.JTextField primerNumTxt;
    private javax.swing.JButton restarBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTextField segundoNumTxt;
    private javax.swing.JButton sumarBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}