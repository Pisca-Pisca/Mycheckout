/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema.Modal;

import Entity.Produto;
import Utils.ManipularImagem;

/**
 *
 * @author nicol
 */
public class UI_ModalConfirmarPedidoCompartilhado extends javax.swing.JDialog {

    Produto produtoModal;
    Double precoModal, precoPorPessoaModal;
    int qtdItemModal, qtdPessoaModal;
    

    /**
     * Creates new form UI_ModalAddItemCarrinho
     */
    public UI_ModalConfirmarPedidoCompartilhado(java.awt.Frame parent, boolean modal, Produto produto, Double preco, int qtdItem, Double precoPessoa, int qtdPessoa) {
        super(parent, modal);
        initComponents();
        
        this.produtoModal = produto;
        this.precoModal = preco;
        this.precoPorPessoaModal = precoPessoa;
        this.qtdItemModal = qtdItem;
        this.qtdPessoaModal = qtdPessoa;
        
        populaModal();
    }
    
    private void populaModal() {
        Txt_QtdPessoa.setText(String.valueOf(this.qtdPessoaModal));
        Txt_QtdItem1.setText(String.valueOf(this.qtdItemModal));
        Txt_ValorItem.setText(String.valueOf(this.precoModal));
        Txt_ValorItemPorPessoa.setText(String.valueOf(this.precoPorPessoaModal));
        Txt_NomeProduto.setText(String.valueOf(this.produtoModal.getNome()));
        ManipularImagem.exibiImagemLabel(produtoModal.getFoto(), Img_Produto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Adicionar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Txt_QtdPessoa = new javax.swing.JLabel();
        Txt_NomeProduto = new javax.swing.JLabel();
        Txt_ValorItemPorPessoa = new javax.swing.JLabel();
        Txt_ValorItem = new javax.swing.JLabel();
        Img_Produto = new javax.swing.JLabel();
        Txt_R$ = new javax.swing.JLabel();
        Txt_R$1 = new javax.swing.JLabel();
        Txt_QtdItem1 = new javax.swing.JLabel();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Adicionar.setBorderPainted(false);
        Btn_Adicionar.setContentAreaFilled(false);
        Btn_Adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 140, 30));

        Btn_Cancelar.setBorderPainted(false);
        Btn_Cancelar.setContentAreaFilled(false);
        Btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, 30));

        Txt_QtdPessoa.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        Txt_QtdPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Txt_QtdPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 40, 30));

        Txt_NomeProduto.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        getContentPane().add(Txt_NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 250, 20));

        Txt_ValorItemPorPessoa.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Txt_ValorItemPorPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Txt_ValorItemPorPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, 20));

        Txt_ValorItem.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Txt_ValorItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Txt_ValorItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, 20));
        getContentPane().add(Img_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 90));

        Txt_R$.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Txt_R$.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Txt_R$.setText("R$");
        getContentPane().add(Txt_R$, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 100, 20));

        Txt_R$1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Txt_R$1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Txt_R$1.setText("R$");
        getContentPane().add(Txt_R$1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 20));

        Txt_QtdItem1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        Txt_QtdItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Txt_QtdItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 30));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_ModalConfirmarPedidoCompartilhado.png"))); // NOI18N
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_AdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(UI_ModalConfirmarPedidoCompartilhado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_ModalConfirmarPedidoCompartilhado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_ModalConfirmarPedidoCompartilhado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_ModalConfirmarPedidoCompartilhado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI_ModalConfirmarPedidoCompartilhado dialog = new UI_ModalConfirmarPedidoCompartilhado(new javax.swing.JFrame(), true, null, 0.0, 0, 0.0, 0);
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
    private javax.swing.JButton Btn_Adicionar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JLabel Img_BaseTela;
    private javax.swing.JLabel Img_Produto;
    private javax.swing.JLabel Txt_NomeProduto;
    private javax.swing.JLabel Txt_QtdItem1;
    private javax.swing.JLabel Txt_QtdPessoa;
    private javax.swing.JLabel Txt_R$;
    private javax.swing.JLabel Txt_R$1;
    private javax.swing.JLabel Txt_ValorItem;
    private javax.swing.JLabel Txt_ValorItemPorPessoa;
    // End of variables declaration//GEN-END:variables
}
