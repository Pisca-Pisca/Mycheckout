/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

/**
 *
 * @author nicol
 */
public class UI_adminTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form UI_adminTelaPrincipal
     */
    public UI_adminTelaPrincipal() {
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

        Btn_Sair = new javax.swing.JButton();
        Btn_Mesas = new javax.swing.JButton();
        Btn_Garçom = new javax.swing.JButton();
        Btn_Produtos = new javax.swing.JButton();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Sair.setBorderPainted(false);
        Btn_Sair.setContentAreaFilled(false);
        Btn_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 720, 120, 30));

        Btn_Mesas.setBorderPainted(false);
        Btn_Mesas.setContentAreaFilled(false);
        Btn_Mesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Mesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MesasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Mesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 260, 370));

        Btn_Garçom.setBorderPainted(false);
        Btn_Garçom.setContentAreaFilled(false);
        Btn_Garçom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Garçom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GarçomActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Garçom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 260, 370));

        Btn_Produtos.setBorderPainted(false);
        Btn_Produtos.setContentAreaFilled(false);
        Btn_Produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 260, 370));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_MenuAdmin.png"))); // NOI18N
        Img_BaseTela.setMaximumSize(new java.awt.Dimension(1024, 768));
        Img_BaseTela.setMinimumSize(new java.awt.Dimension(1024, 768));
        Img_BaseTela.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SairActionPerformed

    private void Btn_MesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_MesasActionPerformed

    private void Btn_GarçomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GarçomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GarçomActionPerformed

    private void Btn_ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(UI_adminTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_adminTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_adminTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_adminTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_adminTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Garçom;
    private javax.swing.JButton Btn_Mesas;
    private javax.swing.JButton Btn_Produtos;
    private javax.swing.JButton Btn_Sair;
    private javax.swing.JLabel Img_BaseTela;
    // End of variables declaration//GEN-END:variables
}
