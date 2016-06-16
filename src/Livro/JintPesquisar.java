/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livro;
import java.sql.ResultSet;
import DAO.Persistence;
import java.sql.SQLException;
import DAO.AutorDAO;
import DAO.CategoriaDAO;
import DAO.EditoraDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Masds
 */
public class JintPesquisar extends javax.swing.JInternalFrame {

    /**
     * Creates new form JintPesquisar
     */
    public JintPesquisar() throws SQLException {
        initComponents();
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        ResultSet retornoQuery;
        retornoQuery = conexao.executaSQL("select * from categoria");
            while(retornoQuery.next()){
                cb_categorias.addItem(retornoQuery.getString(1) + " - " + retornoQuery.getString(2));
            }
    }
    
    private static JintPesquisar form=null;
    public static JintPesquisar getInstance() throws SQLException{
        if(form == null){
            form = new JintPesquisar();
        }
        return form;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grouptipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb_tipopesquisa = new javax.swing.JLabel();
        rad_livro = new javax.swing.JRadioButton();
        rad_editora = new javax.swing.JRadioButton();
        lb_infoprinc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_categorias = new javax.swing.JComboBox<>();
        bt_pesquisar = new javax.swing.JButton();
        lb_categoria = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rad_autor = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("PESQUISAR");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        lb_tipopesquisa.setText("Selecione o que deseja pesquisar:");

        rad_livro.setBackground(new java.awt.Color(255, 255, 102));
        grouptipo.add(rad_livro);
        rad_livro.setText("TÍTULO");

        rad_editora.setBackground(new java.awt.Color(255, 255, 102));
        grouptipo.add(rad_editora);
        rad_editora.setText("EDITORA");

        lb_infoprinc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_infoprinc.setText("Pesquisar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("após isto, selecione a categoria, digite o Titulo/Nome da Editora e clique em pesquisar");

        cb_categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS" }));
        cb_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoriasActionPerformed(evt);
            }
        });

        bt_pesquisar.setText("PESQUISAR");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        lb_categoria.setText("Categoria:");

        txt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Para pesquisar, primeiro selecione se quer pesquisar por EDITORA ou TÍTULO,");

        rad_autor.setBackground(new java.awt.Color(255, 255, 102));
        grouptipo.add(rad_autor);
        rad_autor.setText("AUTOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lb_infoprinc)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_tipopesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rad_autor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rad_editora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rad_livro)
                                .addGap(146, 146, 146))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_categoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_infoprinc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tipopesquisa)
                    .addComponent(rad_editora)
                    .addComponent(rad_livro)
                    .addComponent(rad_autor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_categoria)
                    .addComponent(cb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_pesquisar)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_categoriasActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        Integer idAutor = null;
        Integer idCategoria = null;
        Integer idEditora = null;
        String campo = "";
        String categoria = (String) cb_categorias.getSelectedItem();
        System.out.println(cb_categorias.getSelectedItem());
        String consultaBase = "select * from livros l";
        String condicional = "where ";
        String join = "";
        if (!"TODOS".equals(categoria)){
            CategoriaDAO cat = new CategoriaDAO();
            try {
                idCategoria = cat.retornaId(categoria);
            } catch (SQLException ex) {
                Logger.getLogger(JintPesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }
            join += " inner join livros_x_categoria lc on l.idLivro = lc.fk_livro";
        }
        
        if(rad_editora.isSelected()){
            EditoraDAO editora = new EditoraDAO();
            try {
                idEditora = editora.retornaId(rad_editora.getText());
            } catch (SQLException ex) {
                Logger.getLogger(JintPesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }
            join += " inner join livros_x_editora le on l.idLivro = le.fk_livro";
        }
        if(rad_autor.isSelected()){
            AutorDAO autor = new AutorDAO();
            try {
                idAutor = autor.retornaId(rad_autor.getText());
            } catch (SQLException ex) {
                Logger.getLogger(JintPesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }
            join += " inner join livros_x_autor la on l.idLivro = la.fk_livro";
        }
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        ResultSet retornoQuery = conexao.executaSQL("select * from livros where " + campo + " = '" +txt_pesquisar.getText()+"' and categoria='"+cb_categorias.getSelectedItem()+"'");
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void txt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JComboBox<String> cb_categorias;
    private javax.swing.ButtonGroup grouptipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_categoria;
    private javax.swing.JLabel lb_infoprinc;
    private javax.swing.JLabel lb_tipopesquisa;
    private javax.swing.JRadioButton rad_autor;
    private javax.swing.JRadioButton rad_editora;
    private javax.swing.JRadioButton rad_livro;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
