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
public class UI_clienteMonteSuaConta extends javax.swing.JFrame {

    /**
     * Creates new form UI_clienteMinhaConta
     */
    public UI_clienteMonteSuaConta() {
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

        Txt_valorTotalSubcontaAtualizavel = new javax.swing.JLabel();
        Btn_chamaGarcom = new javax.swing.JButton();
        Btn_sair = new javax.swing.JButton();
        Btn_inclui = new javax.swing.JButton();
        Btn_retira = new javax.swing.JButton();
        Btn_efetuarPagamento = new javax.swing.JButton();
        Select_selecionarTodosItens = new javax.swing.JCheckBox();
        Txt_valorTotalMesaAtualizavel = new javax.swing.JLabel();
        Txt_numeroMesa = new javax.swing.JLabel();
        Txt_nomeCliente = new javax.swing.JLabel();
        Btn_voltar = new javax.swing.JButton();
        Tabela_todosItens = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Tabela_itensSelecionados = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Img_baseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Txt_valorTotalSubcontaAtualizavel.setText("valorTotalSubconta");
        getContentPane().add(Txt_valorTotalSubcontaAtualizavel);
        Txt_valorTotalSubcontaAtualizavel.setBounds(870, 600, 90, 30);

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

        Btn_inclui.setBorderPainted(false);
        Btn_inclui.setContentAreaFilled(false);
        getContentPane().add(Btn_inclui);
        Btn_inclui.setBounds(470, 320, 80, 70);

        Btn_retira.setBorderPainted(false);
        Btn_retira.setContentAreaFilled(false);
        getContentPane().add(Btn_retira);
        Btn_retira.setBounds(470, 430, 80, 80);

        Btn_efetuarPagamento.setBorderPainted(false);
        Btn_efetuarPagamento.setContentAreaFilled(false);
        Btn_efetuarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_efetuarPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_efetuarPagamento);
        Btn_efetuarPagamento.setBounds(730, 646, 230, 30);

        Select_selecionarTodosItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_selecionarTodosItensActionPerformed(evt);
            }
        });
        getContentPane().add(Select_selecionarTodosItens);
        Select_selecionarTodosItens.setBounds(59, 560, 21, 30);

        Txt_valorTotalMesaAtualizavel.setText("totalMesa");
        getContentPane().add(Txt_valorTotalMesaAtualizavel);
        Txt_valorTotalMesaAtualizavel.setBounds(210, 600, 110, 30);

        Txt_numeroMesa.setText("nomeCliente");
        getContentPane().add(Txt_numeroMesa);
        Txt_numeroMesa.setBounds(580, 240, 230, 30);

        Txt_nomeCliente.setText("numeroMesa");
        getContentPane().add(Txt_nomeCliente);
        Txt_nomeCliente.setBounds(190, 240, 80, 30);

        Btn_voltar.setBorderPainted(false);
        Btn_voltar.setContentAreaFilled(false);
        Btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_voltar);
        Btn_voltar.setBounds(60, 650, 110, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Produto", "Valor"
            }
        ));
        Tabela_todosItens.setViewportView(jTable1);

        getContentPane().add(Tabela_todosItens);
        Tabela_todosItens.setBounds(570, 280, 410, 280);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Produto", "Valor"
            }
        ));
        Tabela_itensSelecionados.setViewportView(jTable2);

        getContentPane().add(Tabela_itensSelecionados);
        Tabela_itensSelecionados.setBounds(40, 280, 410, 280);

        Img_baseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_minhaContaSubconta.png"))); // NOI18N
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

    private void Select_selecionarTodosItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_selecionarTodosItensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_selecionarTodosItensActionPerformed

    private void Btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_voltarActionPerformed
        UI_clienteMinhaConta minhaConta = new UI_clienteMinhaConta();
        minhaConta.setVisible(true);
    }//GEN-LAST:event_Btn_voltarActionPerformed

    private void Btn_efetuarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_efetuarPagamentoActionPerformed
        UI_clienteFormaPagamento formaPagamento = new UI_clienteFormaPagamento();
        formaPagamento.setVisible(true);
    }//GEN-LAST:event_Btn_efetuarPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(UI_clienteMonteSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_clienteMonteSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_clienteMonteSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_clienteMonteSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_clienteMonteSuaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_chamaGarcom;
    private javax.swing.JButton Btn_efetuarPagamento;
    private javax.swing.JButton Btn_inclui;
    private javax.swing.JButton Btn_retira;
    private javax.swing.JButton Btn_sair;
    private javax.swing.JButton Btn_voltar;
    private javax.swing.JLabel Img_baseTela;
    private javax.swing.JCheckBox Select_selecionarTodosItens;
    private javax.swing.JScrollPane Tabela_itensSelecionados;
    private javax.swing.JScrollPane Tabela_todosItens;
    private javax.swing.JLabel Txt_nomeCliente;
    private javax.swing.JLabel Txt_numeroMesa;
    private javax.swing.JLabel Txt_valorTotalMesaAtualizavel;
    private javax.swing.JLabel Txt_valorTotalSubcontaAtualizavel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
