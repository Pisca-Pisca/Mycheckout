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
public class UI_cadastroGarcom extends javax.swing.JFrame {

    /**
     * Creates new form UI_cadastroGarçom
     */
    public UI_cadastroGarcom() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaGarcomInativo = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaGarcomAtivo = new javax.swing.JTable();
        Btn_Editar = new javax.swing.JButton();
        Btn_Add = new javax.swing.JButton();
        Btn_Desativar = new javax.swing.JButton();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Ativar = new javax.swing.JButton();
        Btn_Voltar = new javax.swing.JButton();
        Btn_Sair = new javax.swing.JButton();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaGarcomInativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Garçom Inativo"
            }
        ));
        jScrollPane2.setViewportView(TabelaGarcomInativo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 390, 340));

        TabelaGarcomAtivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Garçom Ativo"
            }
        ));
        jScrollPane1.setViewportView(TabelaGarcomAtivo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 390, 340));

        Btn_Editar.setBorderPainted(false);
        Btn_Editar.setContentAreaFilled(false);
        Btn_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 60, 40));

        Btn_Add.setBorderPainted(false);
        Btn_Add.setContentAreaFilled(false);
        Btn_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 60, 40));

        Btn_Desativar.setBorderPainted(false);
        Btn_Desativar.setContentAreaFilled(false);
        Btn_Desativar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Desativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 80, 70));

        Btn_Excluir.setBorderPainted(false);
        Btn_Excluir.setContentAreaFilled(false);
        Btn_Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 60, 40));

        Btn_Ativar.setBorderPainted(false);
        Btn_Ativar.setContentAreaFilled(false);
        Btn_Ativar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Ativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AtivarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Ativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 80, 80));

        Btn_Voltar.setBorderPainted(false);
        Btn_Voltar.setContentAreaFilled(false);
        Btn_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 120, 30));

        Btn_Sair.setBorderPainted(false);
        Btn_Sair.setContentAreaFilled(false);
        Btn_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, 120, 30));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_CadastroGarcom.png"))); // NOI18N
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AtivarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AtivarActionPerformed

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
            java.util.logging.Logger.getLogger(UI_cadastroGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_cadastroGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_cadastroGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_cadastroGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_cadastroGarcom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Add;
    private javax.swing.JButton Btn_Ativar;
    private javax.swing.JButton Btn_Desativar;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Excluir;
    private javax.swing.JButton Btn_Sair;
    private javax.swing.JButton Btn_Voltar;
    private javax.swing.JLabel Img_BaseTela;
    private javax.swing.JTable TabelaGarcomAtivo;
    private javax.swing.JTable TabelaGarcomInativo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
