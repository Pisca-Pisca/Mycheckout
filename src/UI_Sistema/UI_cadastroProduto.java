/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Sistema;

import Dao.CategoriaDAO;
import Dao.ProdutoDAO;
import Dao.SubcategoriaDAO;
import Entity.Categoria;
import Entity.Produto;
import Entity.subcategoria;
import Utils.ManipularImagem;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author nicol
 */
public class UI_cadastroProduto extends javax.swing.JFrame {

    private BufferedImage imagem;
    private byte[] foto;

    Produto produtoRetorno = null;
    ProdutoDAO produtoDao = new ProdutoDAO();

    List<Categoria> listCategoria;
    List<subcategoria> listSubcategoria;

    CategoriaDAO categoriaDao = new CategoriaDAO();
    SubcategoriaDAO subcategoriaDao = new SubcategoriaDAO();

    public UI_cadastroProduto(Produto p) {
        initComponents();
        listarCategorias();
        listarSubcategorias(1);

        produtoRetorno = p;

        if (produtoRetorno.getId() != 0) {
            Input_Descricao.setText(produtoRetorno.getDescricao());
            Input_Nome.setText(produtoRetorno.getNome());
            Input_Preco.setText(String.valueOf(produtoRetorno.getPreco()));
            Input_TempoEspera.setText(String.valueOf(produtoRetorno.getTempoEspera()));

            Sc_Categoria.setSelectedItem(produtoRetorno.getCategoria_codigo());
            Sc_Subcategoria.setSelectedItem(produtoRetorno.getSubcategoria_codigo());

            if (produtoRetorno.isDisponivel()) {
                Btn_Disponivel.setSelected(false);
                Btn_Disponivel.setText("Disponível");
            } else {
                Btn_Disponivel.setSelected(true);
                Btn_Disponivel.setText("Indisponível");
            }
        }
    }

    public UI_cadastroProduto() {
        initComponents();
        listarCategorias();
        listarSubcategorias(1);
    }

    private void listarCategorias() {
        try {
            listCategoria = categoriaDao.selecionarTodos();

            Sc_Categoria.removeAllItems();

            for (int i = 0; i < listCategoria.size(); i++) {
                Sc_Categoria.addItem(listCategoria.get(i).getNome());
                
                Sc_Categoria.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        listarSubcategorias(Sc_Categoria.getSelectedIndex()+1);
                    }
                }
            });
            }
        } catch (Exception ex) {
            Logger.getLogger(UI_cadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarSubcategorias(int idcat) {
        try {
            listSubcategoria = subcategoriaDao.selecionarPorCat(idcat);
                        
            Sc_Subcategoria.removeAllItems();
            
            for (int i = 0; i < listSubcategoria.size(); i++) {
                Sc_Subcategoria.addItem(listSubcategoria.get(i).getNome());
            }
        } catch (Exception ex) {
            Logger.getLogger(UI_cadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limparCampos() {
        Input_Descricao.setText("");
        Input_Nome.setText("");
        Input_TempoEspera.setText("");
        Input_Preco.setText("");
    }

    private Categoria categoriaProduto() {

        int categoria = Sc_Categoria.getSelectedIndex() + 1;

        CategoriaDAO catDao = new CategoriaDAO();
        Categoria catProduto = catDao.selecionarPorCodigo(categoria);

        return catProduto;
    }

    private subcategoria subcategoriaProduto() {

        int subcategoria = Sc_Subcategoria.getSelectedIndex() + 1;

        SubcategoriaDAO subDao = new SubcategoriaDAO();
        subcategoria subProduto = subDao.selecionarPorCodigo(subcategoria);

        return subProduto;
    }

    private void preencheProduto() {
        boolean disponivel = !Btn_Disponivel.isSelected();

        produtoRetorno.setDescricao(Input_Descricao.getText());
        produtoRetorno.setNome(Input_Nome.getText());
        produtoRetorno.setDisponivel(disponivel);
        produtoRetorno.setPreco(Double.parseDouble(Input_Preco.getText()));
        produtoRetorno.setTempoEspera(Input_TempoEspera.getText());
        produtoRetorno.setCategoria_codigo(categoriaProduto());
        produtoRetorno.setFoto(foto);
        
        if(Sc_Subcategoria.getSelectedItem() == null){
            produtoRetorno.setSubcategoria_codigo(null);
        }else{
            produtoRetorno.setSubcategoria_codigo(subcategoriaProduto());
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

        Btn_Visualizar = new javax.swing.JButton();
        Btn_Enviar = new javax.swing.JButton();
        Btn_Arquivos = new javax.swing.JButton();
        Btn_Sair = new javax.swing.JButton();
        Btn_Voltar = new javax.swing.JButton();
        Sc_Categoria = new javax.swing.JComboBox<>();
        Sc_Subcategoria = new javax.swing.JComboBox<>();
        Input_Descricao = new javax.swing.JTextField();
        Input_Nome = new javax.swing.JTextField();
        Input_TempoEspera = new javax.swing.JTextField();
        Input_Preco = new javax.swing.JTextField();
        Btn_Disponivel = new javax.swing.JToggleButton();
        Feedback_ArquivoImagem = new javax.swing.JLabel();
        Img_BaseTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Visualizar.setBorderPainted(false);
        Btn_Visualizar.setContentAreaFilled(false);
        Btn_Visualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VisualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 40, 40));

        Btn_Enviar.setBorderPainted(false);
        Btn_Enviar.setContentAreaFilled(false);
        Btn_Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, 270, 30));

        Btn_Arquivos.setBorderPainted(false);
        Btn_Arquivos.setContentAreaFilled(false);
        Btn_Arquivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Arquivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ArquivosActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Arquivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 220, 40));

        Btn_Sair.setBorderPainted(false);
        Btn_Sair.setContentAreaFilled(false);
        Btn_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SairActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 720, 120, 30));

        Btn_Voltar.setBorderPainted(false);
        Btn_Voltar.setContentAreaFilled(false);
        Btn_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 120, 30));

        Sc_Categoria.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Sc_Categoria.setMaximumSize(new java.awt.Dimension(419, 42));
        Sc_Categoria.setMinimumSize(new java.awt.Dimension(419, 42));
        Sc_Categoria.setPreferredSize(new java.awt.Dimension(419, 42));
        getContentPane().add(Sc_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 430, 50));

        Sc_Subcategoria.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Sc_Subcategoria.setMaximumSize(new java.awt.Dimension(419, 42));
        Sc_Subcategoria.setMinimumSize(new java.awt.Dimension(419, 42));
        Sc_Subcategoria.setPreferredSize(new java.awt.Dimension(419, 42));
        getContentPane().add(Sc_Subcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 430, 50));

        Input_Descricao.setBackground(new java.awt.Color(196, 196, 196));
        Input_Descricao.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Input_Descricao.setBorder(null);
        getContentPane().add(Input_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 890, 30));

        Input_Nome.setBackground(new java.awt.Color(196, 196, 196));
        Input_Nome.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Input_Nome.setBorder(null);
        Input_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(Input_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 600, 30));

        Input_TempoEspera.setBackground(new java.awt.Color(196, 196, 196));
        Input_TempoEspera.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Input_TempoEspera.setBorder(null);
        getContentPane().add(Input_TempoEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 370, 40));

        Input_Preco.setBackground(new java.awt.Color(196, 196, 196));
        Input_Preco.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Input_Preco.setBorder(null);
        getContentPane().add(Input_Preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 400, 30));

        Btn_Disponivel.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        Btn_Disponivel.setText("Disponível");
        Btn_Disponivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Disponivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_DisponivelMouseClicked(evt);
            }
        });
        getContentPane().add(Btn_Disponivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 170, 40));

        Feedback_ArquivoImagem.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        getContentPane().add(Feedback_ArquivoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 586, 650, 30));

        Img_BaseTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Img_CadastroProduto.png"))); // NOI18N
        getContentPane().add(Img_BaseTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_SairActionPerformed

    private void Btn_ArquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ArquivosActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 200, 130);

                Feedback_ArquivoImagem.setText("Imagem enviada com sucesso.");

                foto = ManipularImagem.getImgBytes(imagem);

            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            Feedback_ArquivoImagem.setText("Você não selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_Btn_ArquivosActionPerformed

    private void Btn_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EnviarActionPerformed
        if (produtoRetorno == null) {
            produtoRetorno = new Produto();
            preencheProduto();
            new ProdutoDAO().inserir(produtoRetorno);
        } else {
            preencheProduto();
            new ProdutoDAO().editar(produtoRetorno);
        }

        limparCampos();
    }//GEN-LAST:event_Btn_EnviarActionPerformed

    private void Btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VoltarActionPerformed
        UI_adminTelaPrincipal admintela = new UI_adminTelaPrincipal();
        admintela.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_VoltarActionPerformed

    private void Btn_VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VisualizarActionPerformed
        UI_visualizacaoProduto uiVisualizar = new UI_visualizacaoProduto();
        uiVisualizar.setVisible(true);

        dispose();
    }//GEN-LAST:event_Btn_VisualizarActionPerformed

    private void Input_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_NomeActionPerformed

    private void Btn_DisponivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_DisponivelMouseClicked
        if (Btn_Disponivel.isSelected()) {
            Btn_Disponivel.setText("Indisponível");
        } else {
            Btn_Disponivel.setText("Disponível");
        }
    }//GEN-LAST:event_Btn_DisponivelMouseClicked

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
            java.util.logging.Logger.getLogger(UI_cadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_cadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_cadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_cadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_cadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Arquivos;
    private javax.swing.JToggleButton Btn_Disponivel;
    private javax.swing.JButton Btn_Enviar;
    private javax.swing.JButton Btn_Sair;
    private javax.swing.JButton Btn_Visualizar;
    private javax.swing.JButton Btn_Voltar;
    private javax.swing.JLabel Feedback_ArquivoImagem;
    private javax.swing.JLabel Img_BaseTela;
    private javax.swing.JTextField Input_Descricao;
    private javax.swing.JTextField Input_Nome;
    private javax.swing.JTextField Input_Preco;
    private javax.swing.JTextField Input_TempoEspera;
    private javax.swing.JComboBox<String> Sc_Categoria;
    private javax.swing.JComboBox<String> Sc_Subcategoria;
    // End of variables declaration//GEN-END:variables
}
