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
public class UI_ModalAddItemCarrinho extends javax.swing.JDialog {

    Produto produtoModal;
    Double preco;
    int qtdItem = 1;

    /**
     * Creates new form UI_ModalAddItemCarrinho
     */
    public UI_ModalAddItemCarrinho(java.awt.Frame parent, boolean modal, Produto produto) {
        super(parent, modal);
        initComponents();

        this.produtoModal = produto;
        this.preco = produtoModal.getPreco();
        populaModal();
    }

    private void populaModal() {
        Txt_NomeProduto.setText(produtoModal.getNome());
        ManipularImagem.exibiImagemLabel(produtoModal.getFoto(), Img_Produto);
        Txt_QtdItem.setText("1");
        Txt_ValorItem.setText(String.valueOf(produtoModal.getPreco()));
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
        Btn_RetirarItem = new javax.swing.JButton();
        Btn_AdicionarItem = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Txt_QtdItem = new javax.swing.JLabel();
        Txt_NomeProduto = new javax.swing.JLabel();
        Txt_ValorItem = new javax.swing.JLabel();
        Txt_R$ = new javax.swing.JLabel();
        Img_Produto = new javax.swing.JLabel();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(484, 307));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Adicionar.setBorderPainted(false);
        Btn_Adicionar.setContentAreaFilled(false);
        Btn_Adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 140, 30));

        Btn_RetirarItem.setBorderPainted(false);
        Btn_RetirarItem.setContentAreaFilled(false);
        Btn_RetirarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_RetirarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RetirarItemActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_RetirarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 30, 20));

        Btn_AdicionarItem.setBorderPainted(false);
        Btn_AdicionarItem.setContentAreaFilled(false);
        Btn_AdicionarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_AdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AdicionarItemActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_AdicionarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 30, 20));

        Btn_Cancelar.setBorderPainted(false);
        Btn_Cancelar.setContentAreaFilled(false);
        Btn_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, 30));

        Txt_QtdItem.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        Txt_QtdItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Txt_QtdItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 146, 40, 30));

        Txt_NomeProduto.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        getContentPane().add(Txt_NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 250, 20));

        Txt_ValorItem.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Txt_ValorItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt_ValorItem.setToolTipText("");
        getContentPane().add(Txt_ValorItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, 20));

        Txt_R$.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Txt_R$.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Txt_R$.setText("R$");
        getContentPane().add(Txt_R$, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 100, 20));
        getContentPane().add(Img_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 90));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_ModalAddItemCarrinho.png"))); // NOI18N
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_AdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AdicionarItemActionPerformed
        this.qtdItem = Integer.parseInt(Txt_QtdItem.getText());
        this.preco= Double.parseDouble(Txt_ValorItem.getText());
        
        this.qtdItem++;
        this.preco *= this.qtdItem;

        Txt_QtdItem.setText(String.valueOf(this.qtdItem));
        Txt_ValorItem.setText(String.valueOf(this.preco));
    }//GEN-LAST:event_Btn_AdicionarItemActionPerformed

    private void Btn_RetirarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RetirarItemActionPerformed
        this.qtdItem = Integer.parseInt(Txt_QtdItem.getText());
        this.preco = Double.parseDouble(Txt_ValorItem.getText());
       
        this.qtdItem--;
        this.preco /= this.qtdItem;

        if (this.qtdItem <= 1) {
            Txt_ValorItem.setText(String.valueOf(produtoModal.getPreco()));
            Txt_QtdItem.setText("1");
        } else {
            Txt_QtdItem.setText(String.valueOf(this.qtdItem));
            Txt_ValorItem.setText(String.valueOf(this.preco));
        }

    }//GEN-LAST:event_Btn_RetirarItemActionPerformed

    private void Btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AdicionarActionPerformed
        UI_ModalDividirPessoas modalDividir = new UI_ModalDividirPessoas(null, true, produtoModal, preco, qtdItem);
        modalDividir.setVisible(true);
        
        dispose();
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
            java.util.logging.Logger.getLogger(UI_ModalAddItemCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_ModalAddItemCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_ModalAddItemCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_ModalAddItemCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI_ModalAddItemCarrinho dialog = new UI_ModalAddItemCarrinho(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton Btn_AdicionarItem;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_RetirarItem;
    private javax.swing.JLabel Img_BaseTela;
    private javax.swing.JLabel Img_Produto;
    private javax.swing.JLabel Txt_NomeProduto;
    private javax.swing.JLabel Txt_QtdItem;
    private javax.swing.JLabel Txt_R$;
    private javax.swing.JLabel Txt_ValorItem;
    // End of variables declaration//GEN-END:variables
}
