/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema.Modal;

import Dao.UsuarioDAO;
import Entity.Usuario;
import UI_Sistema.UI_adminTelaPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class UI_modalSenhaGarcom extends javax.swing.JDialog {

    Usuario usuarioLogado;
    public static boolean senhaOk = false;

    /**
     * Creates new form UI_modalSenhaAdmin
     */
    public UI_modalSenhaGarcom(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        Btn_Cancelar = new javax.swing.JButton();
        Btn_Confirmar = new javax.swing.JButton();
        Input_Senha = new javax.swing.JPasswordField();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(484, 307));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Cancelar.setBorderPainted(false);
        Btn_Cancelar.setContentAreaFilled(false);
        Btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 130, 20));

        Btn_Confirmar.setBorderPainted(false);
        Btn_Confirmar.setContentAreaFilled(false);
        Btn_Confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 20));

        Input_Senha.setBackground(new java.awt.Color(196, 196, 196));
        Input_Senha.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Input_Senha.setBorder(null);
        getContentPane().add(Input_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 270, 60));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_ModalSenhaFuncionario.png"))); // NOI18N
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConfirmarActionPerformed
        String txtSenha = Input_Senha.getText();

        UsuarioDAO usuarioDao = new UsuarioDAO();

        usuarioLogado = usuarioDao.verificaUsuário(txtSenha);
        if (usuarioLogado != null) {
            UI_adminTelaPrincipal telaPrincipal = new UI_adminTelaPrincipal();
            telaPrincipal.setVisible(true);
            dispose();
            senhaOk = true;

        } else {
            JOptionPane.showMessageDialog(this, "Usuário inválido!");
            senhaOk = false;
        }
    }//GEN-LAST:event_Btn_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(UI_modalSenhaGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_modalSenhaGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_modalSenhaGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_modalSenhaGarcom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI_modalSenhaGarcom dialog = new UI_modalSenhaGarcom(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Confirmar;
    private javax.swing.JLabel Img_BaseTela;
    private javax.swing.JPasswordField Input_Senha;
    // End of variables declaration//GEN-END:variables
}
