/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

/**
 *
 * @author jessi
 */
public class UI_clienteFormaPagamentoDinheiro extends javax.swing.JFrame {

    /**
     * Creates new form UI_clienteMinhaConta
     */
    public UI_clienteFormaPagamentoDinheiro() {
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

        Btn_chamaGarcom = new javax.swing.JButton();
        Btn_sair = new javax.swing.JButton();
        Btn_voltar = new javax.swing.JButton();
        Btn_chamarGarcomPagamento = new javax.swing.JButton();
        Img_baseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Btn_chamaGarcom.setBorderPainted(false);
        Btn_chamaGarcom.setContentAreaFilled(false);
        Btn_chamaGarcom.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_chamaGarcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_chamaGarcomActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_chamaGarcom);
        Btn_chamaGarcom.setBounds(961, 86, 50, 40);

        Btn_sair.setBorderPainted(false);
        Btn_sair.setContentAreaFilled(false);
        Btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sair);
        Btn_sair.setBounds(880, 720, 120, 30);

        Btn_voltar.setBorderPainted(false);
        Btn_voltar.setContentAreaFilled(false);
        Btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_voltar);
        Btn_voltar.setBounds(40, 720, 110, 30);

        Btn_chamarGarcomPagamento.setBorderPainted(false);
        Btn_chamarGarcomPagamento.setContentAreaFilled(false);
        getContentPane().add(Btn_chamarGarcomPagamento);
        Btn_chamarGarcomPagamento.setBounds(390, 270, 250, 360);

        Img_baseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_formaPagamentoDinheiro.png"))); // NOI18N
        getContentPane().add(Img_baseTela);
        Img_baseTela.setBounds(0, 0, 1020, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_chamaGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_chamaGarcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_chamaGarcomActionPerformed

    private void Btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_sairActionPerformed

    private void Btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_voltarActionPerformed
        UI_clienteFormaPagamento formaPagamento = new UI_clienteFormaPagamento();
        formaPagamento.setVisible(true);
    }//GEN-LAST:event_Btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(UI_clienteFormaPagamentoDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_clienteFormaPagamentoDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_clienteFormaPagamentoDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_clienteFormaPagamentoDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_clienteFormaPagamentoDinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_chamaGarcom;
    private javax.swing.JButton Btn_chamarGarcomPagamento;
    private javax.swing.JButton Btn_sair;
    private javax.swing.JButton Btn_voltar;
    private javax.swing.JLabel Img_baseTela;
    // End of variables declaration//GEN-END:variables
}
