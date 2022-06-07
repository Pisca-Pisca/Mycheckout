/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

import Dao.Chamados_filaDAO;
import Dao.ProdutoDAO;
import Entity.Chamados_fila;
import Entity.Produto;
import UI_Sistema.Modal.UI_ModalAddItemCarrinho;
import UI_Sistema.Modal.UI_modalChamarGarcom;
import Utils.ModeloTabela;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author jessi
 */
public class UI_clienteEntradas extends javax.swing.JFrame {

    private final int idcategoria = 2;

    /**
     * Creates new form UI_clienteEntradas
     */
    public UI_clienteEntradas() {
        initComponents();
        atualizarTabela();
    }

    private void atualizarTabela() {
        try {
            ProdutoDAO produtoDao = new ProdutoDAO();
            List<Produto> listProduto = produtoDao.selecionarPorCat(idcategoria);

            String[] columnName = {"Foto", "Nome", "Descrição", "Tempo Preparo", "Preço R$"};
            Object[][] rows = new Object[listProduto.size()][5];

            for (int i = 0; i < listProduto.size(); i++) {

                if (listProduto.get(i).getFoto() != null) {
                    ImageIcon image = new ImageIcon(new ImageIcon(listProduto.get(i).getFoto()).getImage().getScaledInstance(163, 88, 0));

                    rows[i][0] = image;
                } else {
                    rows[i][0] = null;
                }

                rows[i][1] = listProduto.get(i).getNome();
                rows[i][2] = listProduto.get(i).getDescricao();
                rows[i][3] = listProduto.get(i).getTempoEspera();
                rows[i][4] = listProduto.get(i).getPreco();

                ModeloTabela model = new ModeloTabela(rows, columnName);
                Tabela.setModel(model);
                Tabela.setRowHeight(88);
            }

        } catch (Exception ex) {
            Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        Scroll_Tabela = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Btn_adicionar = new javax.swing.JButton();
        Img_baseTela = new javax.swing.JLabel();
        Btn_add_carrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
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
        Btn_entradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_entradasActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_entradas);
        Btn_entradas.setBounds(20, 290, 160, 60);

        Btn_pratosIndividuais.setBorderPainted(false);
        Btn_pratosIndividuais.setContentAreaFilled(false);
        Btn_pratosIndividuais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_pratosIndividuais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pratosIndividuaisActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_pratosIndividuais);
        Btn_pratosIndividuais.setBounds(20, 380, 160, 60);

        Btn_pratosCompartilhar.setBorderPainted(false);
        Btn_pratosCompartilhar.setContentAreaFilled(false);
        Btn_pratosCompartilhar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_pratosCompartilhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_pratosCompartilharActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_pratosCompartilhar);
        Btn_pratosCompartilhar.setBounds(20, 470, 160, 60);

        Btn_sobremesa.setBorderPainted(false);
        Btn_sobremesa.setContentAreaFilled(false);
        Btn_sobremesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sobremesaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sobremesa);
        Btn_sobremesa.setBounds(20, 570, 160, 50);

        Btn_minhaConta.setBorderPainted(false);
        Btn_minhaConta.setContentAreaFilled(false);
        Btn_minhaConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_minhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_minhaContaActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_minhaConta);
        Btn_minhaConta.setBounds(20, 650, 160, 50);

        Btn_sair.setBorderPainted(false);
        Btn_sair.setContentAreaFilled(false);
        Btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_sair);
        Btn_sair.setBounds(890, 720, 120, 30);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabela.getTableHeader().setReorderingAllowed(false);
        Scroll_Tabela.setViewportView(Tabela);

        getContentPane().add(Scroll_Tabela);
        Scroll_Tabela.setBounds(210, 220, 790, 470);

        Btn_adicionar.setBorderPainted(false);
        Btn_adicionar.setContentAreaFilled(false);
        Btn_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_adicionar);
        Btn_adicionar.setBounds(870, 186, 130, 20);

        Img_baseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_CardapioEntradasVisualizar.png"))); // NOI18N
        Img_baseTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Img_baseTela);
        Img_baseTela.setBounds(0, 0, 1025, 770);

        Btn_add_carrinho.setBorder(null);
        Btn_add_carrinho.setContentAreaFilled(false);
        Btn_add_carrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_add_carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_add_carrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_add_carrinho);
        Btn_add_carrinho.setBounds(860, 180, 140, 30);

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

    private void Btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_sairActionPerformed

    private void Btn_bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_bebidasActionPerformed
        UI_clienteBebidas bebidasMenu = new UI_clienteBebidas();
        bebidasMenu.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_bebidasActionPerformed

    private void Btn_entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_entradasActionPerformed
        UI_clienteEntradas entradas = new UI_clienteEntradas();
        entradas.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_entradasActionPerformed

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

    private void Btn_add_carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_add_carrinhoActionPerformed
        if (Tabela.getSelectedRow() != -1) {
            String nomeProduto = Tabela.getValueAt(Tabela.getSelectedRow(), 1).toString();
            Produto produto;
            produto = new ProdutoDAO().selecionarProdPorNome(nomeProduto);

            UI_ModalAddItemCarrinho modalAddItem = new UI_ModalAddItemCarrinho(this, true, produto);
            modalAddItem.setVisible(true);
        }
    }//GEN-LAST:event_Btn_add_carrinhoActionPerformed

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
            java.util.logging.Logger.getLogger(UI_clienteEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_clienteEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_clienteEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_clienteEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_clienteEntradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_add_carrinho;
    private javax.swing.JButton Btn_adicionar;
    private javax.swing.JButton Btn_bebidas;
    private javax.swing.JButton Btn_chamaGarcom;
    private javax.swing.JButton Btn_entradas;
    private javax.swing.JButton Btn_minhaConta;
    private javax.swing.JButton Btn_pratosCompartilhar;
    private javax.swing.JButton Btn_pratosIndividuais;
    private javax.swing.JButton Btn_sair;
    private javax.swing.JButton Btn_sobremesa;
    private javax.swing.JLabel Img_baseTela;
    private javax.swing.JScrollPane Scroll_Tabela;
    private javax.swing.JTable Tabela;
    // End of variables declaration//GEN-END:variables
}
