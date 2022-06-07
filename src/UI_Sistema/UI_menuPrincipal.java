/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

import UI_Sistema.Modal.UI_modalSenhaAdmin;
import UI_Sistema.Modal.UI_modalSenhaGarcom;

/**
 *
 * @author lnaga
 */
public class UI_menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form UI_menuPrincipal
     */
    public UI_menuPrincipal() {
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

        btn_admin = new javax.swing.JButton();
        btn_garcom = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        img_baseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_admin.setBorderPainted(false);
        btn_admin.setContentAreaFilled(false);
        btn_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminActionPerformed(evt);
            }
        });
        getContentPane().add(btn_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 250, 370));

        btn_garcom.setBorderPainted(false);
        btn_garcom.setContentAreaFilled(false);
        btn_garcom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_garcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_garcomActionPerformed(evt);
            }
        });
        getContentPane().add(btn_garcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 260, 370));

        btn_cliente.setBorderPainted(false);
        btn_cliente.setContentAreaFilled(false);
        btn_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 260, 370));

        btn_sair.setBorderPainted(false);
        btn_sair.setContentAreaFilled(false);
        btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, 130, 30));

        img_baseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_MenuPrincipal.png"))); // NOI18N
        getContentPane().add(img_baseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        UI_modalSenhaGarcom senhaGarcom = new UI_modalSenhaGarcom(null, true);
        senhaGarcom.setVisible(true);

        if (UI_modalSenhaGarcom.senhaOk == true) {
            dispose();
        }
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminActionPerformed
        UI_modalSenhaAdmin senhaAdmin = new UI_modalSenhaAdmin(null, true);
        senhaAdmin.setVisible(true);

        if (UI_modalSenhaAdmin.senhaOk == true) {
            dispose();
        }
    }//GEN-LAST:event_btn_adminActionPerformed

    private void btn_garcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_garcomActionPerformed
        UI_modalSenhaGarcom senhaGarcom = new UI_modalSenhaGarcom(null, true);
        senhaGarcom.setVisible(true);

        if (UI_modalSenhaGarcom.senhaOk == true) {
            dispose();
        }
    }//GEN-LAST:event_btn_garcomActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        UI_modalSenhaGarcom senhaGarcom = new UI_modalSenhaGarcom(null, true);
        senhaGarcom.setVisible(true);

        if (UI_modalSenhaGarcom.senhaOk == true) {
            dispose();
        }
    }//GEN-LAST:event_btn_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(UI_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_garcom;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel img_baseTela;
    // End of variables declaration//GEN-END:variables
}
