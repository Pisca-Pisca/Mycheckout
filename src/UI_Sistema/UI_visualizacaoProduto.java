/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

import Dao.ProdutoDAO;
import Entity.Produto;
import Utils.ModeloTabela;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class UI_visualizacaoProduto extends javax.swing.JFrame {

    /**
     * Creates new form UI_visualizacaoProduto
     */
    public UI_visualizacaoProduto() {
        initComponents();
        montarTabela();
    }

    private void montarTabela() {
        try {
            ProdutoDAO produtoDao = new ProdutoDAO();
            List<Produto> list = produtoDao.selecionarTodos();
            
            String[] columnName = {"Código", "Nome", "Preço R$", "Preço 2 R$", "Preço 3 R$"};
            Object[][] rows = new Object[list.size()][5];
            
            for (int i = 0; i < list.size(); i++) {
                
                rows[i][0] = list.get(i).getId();
                rows[i][1] = list.get(i).getNome();
                rows[i][2] = list.get(i).getPreco1();
                rows[i][3] = list.get(i).getPreco2();
                rows[i][4] = list.get(i).getPreco3();
            }
            
            ModeloTabela model = new ModeloTabela(rows, columnName);
            Tabela.setModel(model);
            Tabela.setRowHeight(60);
        } catch (Exception ex) {
            Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void deletarproduto(){ 
        Produto produtoRetorno = new Produto();
        ProdutoDAO pdao = new ProdutoDAO();
        int id;

        id = Integer.parseInt(Tabela.getValueAt(Tabela.getSelectedRow(), 0).toString());

        produtoRetorno = pdao.selecionarPorCodigo(id);

        pdao.excluir(produtoRetorno);
    }
        
    private void editarproduto(){
        Produto produtoRetorno = new Produto();
        ProdutoDAO pdao = new ProdutoDAO();
        int id;

        id = Integer.parseInt(Tabela.getValueAt(Tabela.getSelectedRow(), 0).toString());

        produtoRetorno = pdao.selecionarPorCodigo(id);
        
        UI_cadastroProduto cadastroProd = new UI_cadastroProduto(produtoRetorno);
        cadastroProd.setVisible(true);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn_Voltar = new javax.swing.JButton();
        Btn_Add = new javax.swing.JButton();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Sair = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        Scroll_Tabela = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Voltar.setBorderPainted(false);
        Btn_Voltar.setContentAreaFilled(false);
        Btn_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 120, 30));

        Btn_Add.setBorderPainted(false);
        Btn_Add.setContentAreaFilled(false);
        Btn_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 40, 40));

        Btn_Excluir.setBorderPainted(false);
        Btn_Excluir.setContentAreaFilled(false);
        Btn_Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 40, 40));

        Btn_Sair.setBorderPainted(false);
        Btn_Sair.setContentAreaFilled(false);
        Btn_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, 120, 30));

        Btn_Editar.setBorderPainted(false);
        Btn_Editar.setContentAreaFilled(false);
        Btn_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 40, 40));

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabela.setName(""); // NOI18N
        Tabela.setSelectionBackground(new java.awt.Color(196, 196, 196));
        Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Scroll_Tabela.setViewportView(Tabela);

        getContentPane().add(Scroll_Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 268, 940, 330));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_ProdutoVizualização.png"))); // NOI18N
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_VoltarActionPerformed

    private void Btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_SairActionPerformed

    private void Btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddActionPerformed
        UI_cadastroProduto uiCadastroProd = new UI_cadastroProduto();
        uiCadastroProd.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_AddActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        if (Tabela.getSelectedRow() != - 1) {
            editarproduto();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExcluirActionPerformed
         if (Tabela.getSelectedRow() != - 1) {
            deletarproduto();
            montarTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_Btn_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UI_visualizacaoProduto().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(UI_visualizacaoProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Add;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Excluir;
    private javax.swing.JButton Btn_Sair;
    private javax.swing.JButton Btn_Voltar;
    private javax.swing.JLabel Img_BaseTela;
    private javax.swing.JScrollPane Scroll_Tabela;
    private javax.swing.JTable Tabela;
    // End of variables declaration//GEN-END:variables
}
