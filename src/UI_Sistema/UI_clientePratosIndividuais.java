/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

import Dao.Chamados_filaDAO;
import Entity.Chamados_fila;
import UI_Sistema.Modal.UI_modalChamarGarcom;

/**
 *
 * @author jessi
 */
public class UI_clientePratosIndividuais extends javax.swing.JFrame {

    /**
     * Creates new form UI_pratosIndividuais
     */
    public UI_clientePratosIndividuais() {
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
        Btn_bebidas = new javax.swing.JButton();
        Btn_entradas = new javax.swing.JButton();
        Btn_pratosIndividuais = new javax.swing.JButton();
        Btn_pratosCompartilhar = new javax.swing.JButton();
        Btn_sobremesa = new javax.swing.JButton();
        Btn_minhaConta = new javax.swing.JButton();
        Btn_sair = new javax.swing.JButton();
        Btn_files = new javax.swing.JButton();
        Btn_combos = new javax.swing.JButton();
        Btn_parmegianas = new javax.swing.JButton();
        Btn_acompanhamentos = new javax.swing.JButton();
        Img_baseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        Btn_chamaGarcom.setBorderPainted(false);
        Btn_chamaGarcom.setContentAreaFilled(false);
        Btn_chamaGarcom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_chamaGarcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_chamaGarcomActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_chamaGarcom);
        Btn_chamaGarcom.setBounds(960, 60, 50, 50);

        Btn_bebidas.setBorderPainted(false);
        Btn_bebidas.setContentAreaFilled(false);
        Btn_bebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_bebidasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_bebidas);
        Btn_bebidas.setBounds(20, 180, 160, 60);

        Btn_entradas.setBorderPainted(false);
        Btn_entradas.setContentAreaFilled(false);
        Btn_entradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entradasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_entradas);
        Btn_entradas.setBounds(20, 270, 160, 60);

        Btn_pratosIndividuais.setBorderPainted(false);
        Btn_pratosIndividuais.setContentAreaFilled(false);
        Btn_pratosIndividuais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_pratosIndividuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pratosIndividuaisActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_pratosIndividuais);
        Btn_pratosIndividuais.setBounds(20, 360, 160, 60);

        Btn_pratosCompartilhar.setBorderPainted(false);
        Btn_pratosCompartilhar.setContentAreaFilled(false);
        Btn_pratosCompartilhar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_pratosCompartilhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pratosCompartilharActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_pratosCompartilhar);
        Btn_pratosCompartilhar.setBounds(20, 450, 160, 60);

        Btn_sobremesa.setBorderPainted(false);
        Btn_sobremesa.setContentAreaFilled(false);
        Btn_sobremesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sobremesaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sobremesa);
        Btn_sobremesa.setBounds(20, 550, 160, 50);

        Btn_minhaConta.setBorderPainted(false);
        Btn_minhaConta.setContentAreaFilled(false);
        Btn_minhaConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_minhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_minhaContaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_minhaConta);
        Btn_minhaConta.setBounds(20, 630, 160, 50);

        Btn_sair.setBorderPainted(false);
        Btn_sair.setContentAreaFilled(false);
        Btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sair);
        Btn_sair.setBounds(890, 700, 120, 30);

        Btn_files.setBorderPainted(false);
        Btn_files.setContentAreaFilled(false);
        Btn_files.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_filesActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_files);
        Btn_files.setBounds(210, 160, 800, 100);

        Btn_combos.setBorderPainted(false);
        Btn_combos.setContentAreaFilled(false);
        Btn_combos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_combos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_combosActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_combos);
        Btn_combos.setBounds(210, 310, 790, 90);

        Btn_parmegianas.setBorderPainted(false);
        Btn_parmegianas.setContentAreaFilled(false);
        Btn_parmegianas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_parmegianas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_parmegianasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_parmegianas);
        Btn_parmegianas.setBounds(210, 450, 800, 90);

        Btn_acompanhamentos.setBorderPainted(false);
        Btn_acompanhamentos.setContentAreaFilled(false);
        Btn_acompanhamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_acompanhamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_acompanhamentosActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_acompanhamentos);
        Btn_acompanhamentos.setBounds(210, 590, 800, 90);

        Img_baseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_CardapioPratos_Individuais.png"))); // NOI18N
        getContentPane().add(Img_baseTela);
        Img_baseTela.setBounds(0, -10, 1025, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_chamaGarcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_chamaGarcomActionPerformed
        Chamados_fila chamado = new Chamados_fila(0, false, 1);

        new Chamados_filaDAO().inserir(chamado);

        UI_modalChamarGarcom modal = new UI_modalChamarGarcom(this, true);
        modal.setVisible(true);
    }//GEN-LAST:event_Btn_chamaGarcomActionPerformed

    private void Btn_sobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sobremesaActionPerformed
        UI_clienteSobremesas sobremesas = new UI_clienteSobremesas();
        sobremesas.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_sobremesaActionPerformed

    private void Btn_entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entradasActionPerformed
        UI_clienteEntradas entradas = new UI_clienteEntradas();
        entradas.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_entradasActionPerformed

    private void Btn_acompanhamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_acompanhamentosActionPerformed
        UI_clientePratosIndividuaisVisualizar pratosIndividuais = new UI_clientePratosIndividuaisVisualizar(9);
        pratosIndividuais.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_acompanhamentosActionPerformed

    private void Btn_parmegianasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_parmegianasActionPerformed
        UI_clientePratosIndividuaisVisualizar pratosIndividuais = new UI_clientePratosIndividuaisVisualizar(8);
        pratosIndividuais.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_parmegianasActionPerformed

    private void Btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_sairActionPerformed

    private void Btn_bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_bebidasActionPerformed
        UI_clienteBebidas bebidasMenu = new UI_clienteBebidas();
        bebidasMenu.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_bebidasActionPerformed

    private void Btn_pratosIndividuaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_pratosIndividuaisActionPerformed
        UI_clientePratosIndividuais pratosIndividuais = new UI_clientePratosIndividuais();
        pratosIndividuais.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_pratosIndividuaisActionPerformed

    private void Btn_pratosCompartilharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_pratosCompartilharActionPerformed
        UI_clientePratosCompartilhar pratosCompartilhar = new UI_clientePratosCompartilhar();
        pratosCompartilhar.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_pratosCompartilharActionPerformed

    private void Btn_minhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_minhaContaActionPerformed
        UI_clienteMinhaConta minhaConta = new UI_clienteMinhaConta();
        minhaConta.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_minhaContaActionPerformed

    private void Btn_filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_filesActionPerformed
        UI_clientePratosIndividuaisVisualizar pratosIndividuais = new UI_clientePratosIndividuaisVisualizar(6);
        pratosIndividuais.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_filesActionPerformed

    private void Btn_combosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_combosActionPerformed
        UI_clientePratosIndividuaisVisualizar pratosIndividuais = new UI_clientePratosIndividuaisVisualizar(7);
        pratosIndividuais.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_combosActionPerformed

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
            java.util.logging.Logger.getLogger(UI_clientePratosIndividuais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_clientePratosIndividuais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_clientePratosIndividuais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_clientePratosIndividuais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_clientePratosIndividuais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_acompanhamentos;
    private javax.swing.JButton Btn_bebidas;
    private javax.swing.JButton Btn_chamaGarcom;
    private javax.swing.JButton Btn_combos;
    private javax.swing.JButton Btn_entradas;
    private javax.swing.JButton Btn_files;
    private javax.swing.JButton Btn_minhaConta;
    private javax.swing.JButton Btn_parmegianas;
    private javax.swing.JButton Btn_pratosCompartilhar;
    private javax.swing.JButton Btn_pratosIndividuais;
    private javax.swing.JButton Btn_sair;
    private javax.swing.JButton Btn_sobremesa;
    private javax.swing.JLabel Img_baseTela;
    // End of variables declaration//GEN-END:variables
}
