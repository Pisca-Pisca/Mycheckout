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
public class UI_clienteMinhaConta extends javax.swing.JFrame {

    /**
     * Creates new form UI_clienteMinhaConta
     */
    public UI_clienteMinhaConta() {
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

        Txt_valorTotalMesa = new javax.swing.JLabel();
        Txt_numeroMesa1 = new javax.swing.JLabel();
        Tabela_itensMinhaConta = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Btn_chamaGarcom = new javax.swing.JButton();
        Btn_bebidas = new javax.swing.JButton();
        Btn_entradas = new javax.swing.JButton();
        Btn_pratosIndividuais = new javax.swing.JButton();
        Btn_pratosCompartilhar = new javax.swing.JButton();
        Btn_sobremesa = new javax.swing.JButton();
        Btn_minhaConta = new javax.swing.JButton();
        Btn_sair = new javax.swing.JButton();
        Btn_fechamentoConta = new javax.swing.JButton();
        Img_baseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Txt_valorTotalMesa.setText("valorTotalMesa");
        getContentPane().add(Txt_valorTotalMesa);
        Txt_valorTotalMesa.setBounds(910, 610, 90, 30);

        Txt_numeroMesa1.setText("numeroMesa");
        getContentPane().add(Txt_numeroMesa1);
        Txt_numeroMesa1.setBounds(360, 190, 80, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Produto", "Valor"
            }
        ));
        Tabela_itensMinhaConta.setViewportView(jTable1);

        getContentPane().add(Tabela_itensMinhaConta);
        Tabela_itensMinhaConta.setBounds(220, 230, 770, 360);

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

        Btn_bebidas.setBorderPainted(false);
        Btn_bebidas.setContentAreaFilled(false);
        Btn_bebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_bebidasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_bebidas);
        Btn_bebidas.setBounds(20, 200, 160, 60);

        Btn_entradas.setBorderPainted(false);
        Btn_entradas.setContentAreaFilled(false);
        Btn_entradas.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entradasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_entradas);
        Btn_entradas.setBounds(20, 290, 160, 60);

        Btn_pratosIndividuais.setBorderPainted(false);
        Btn_pratosIndividuais.setContentAreaFilled(false);
        Btn_pratosIndividuais.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_pratosIndividuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pratosIndividuaisActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_pratosIndividuais);
        Btn_pratosIndividuais.setBounds(20, 380, 160, 60);

        Btn_pratosCompartilhar.setBorderPainted(false);
        Btn_pratosCompartilhar.setContentAreaFilled(false);
        Btn_pratosCompartilhar.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_pratosCompartilhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pratosCompartilharActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_pratosCompartilhar);
        Btn_pratosCompartilhar.setBounds(20, 470, 160, 60);

        Btn_sobremesa.setBorderPainted(false);
        Btn_sobremesa.setContentAreaFilled(false);
        Btn_sobremesa.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sobremesaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sobremesa);
        Btn_sobremesa.setBounds(20, 560, 160, 60);

        Btn_minhaConta.setBorderPainted(false);
        Btn_minhaConta.setContentAreaFilled(false);
        Btn_minhaConta.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_minhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_minhaContaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_minhaConta);
        Btn_minhaConta.setBounds(20, 650, 160, 50);

        Btn_sair.setBorderPainted(false);
        Btn_sair.setContentAreaFilled(false);
        Btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sair);
        Btn_sair.setBounds(890, 720, 120, 30);

        Btn_fechamentoConta.setBorderPainted(false);
        Btn_fechamentoConta.setContentAreaFilled(false);
        Btn_fechamentoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_fechamentoContaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_fechamentoConta);
        Btn_fechamentoConta.setBounds(760, 650, 240, 40);

        Img_baseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_minhaContaBaseTela.png"))); // NOI18N
        getContentPane().add(Img_baseTela);
        Img_baseTela.setBounds(0, 0, 1020, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_chamaGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_chamaGarcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_chamaGarcomActionPerformed

    private void Btn_bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_bebidasActionPerformed
        UI_clienteBebidas bebidasMenu = new UI_clienteBebidas();
        bebidasMenu.setVisible(true);
    }//GEN-LAST:event_Btn_bebidasActionPerformed

    private void Btn_entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entradasActionPerformed
        UI_clienteEntradas entradas = new UI_clienteEntradas();
        entradas.setVisible(true);
    }//GEN-LAST:event_Btn_entradasActionPerformed

    private void Btn_pratosIndividuaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_pratosIndividuaisActionPerformed
        UI_clientePratosIndividuais pratosIndividuais = new UI_clientePratosIndividuais();
        pratosIndividuais.setVisible(true);
    }//GEN-LAST:event_Btn_pratosIndividuaisActionPerformed

    private void Btn_pratosCompartilharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_pratosCompartilharActionPerformed
        UI_clientePratosCompartilhar pratosCompartilhar = new UI_clientePratosCompartilhar();
        pratosCompartilhar.setVisible(true);
    }//GEN-LAST:event_Btn_pratosCompartilharActionPerformed

    private void Btn_sobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sobremesaActionPerformed
        UI_clienteSobremesas sobremesas = new UI_clienteSobremesas();
        sobremesas.setVisible(true);
    }//GEN-LAST:event_Btn_sobremesaActionPerformed

    private void Btn_minhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_minhaContaActionPerformed
        UI_clienteMinhaConta minhaConta = new UI_clienteMinhaConta();
        minhaConta.setVisible(true);
    }//GEN-LAST:event_Btn_minhaContaActionPerformed

    private void Btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_sairActionPerformed

    private void Btn_fechamentoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_fechamentoContaActionPerformed
        UI_clienteMonteSuaConta monteSuaConta = new UI_clienteMonteSuaConta();
        monteSuaConta.setVisible(true);
    }//GEN-LAST:event_Btn_fechamentoContaActionPerformed

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
            java.util.logging.Logger.getLogger(UI_clienteMinhaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_clienteMinhaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_clienteMinhaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_clienteMinhaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_clienteMinhaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_bebidas;
    private javax.swing.JButton Btn_chamaGarcom;
    private javax.swing.JButton Btn_entradas;
    private javax.swing.JButton Btn_fechamentoConta;
    private javax.swing.JButton Btn_minhaConta;
    private javax.swing.JButton Btn_pratosCompartilhar;
    private javax.swing.JButton Btn_pratosIndividuais;
    private javax.swing.JButton Btn_sair;
    private javax.swing.JButton Btn_sobremesa;
    private javax.swing.JLabel Img_baseTela;
    private javax.swing.JScrollPane Tabela_itensMinhaConta;
    private javax.swing.JLabel Txt_numeroMesa1;
    private javax.swing.JLabel Txt_valorTotalMesa;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
