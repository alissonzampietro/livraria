/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_cadastro;

import DAO.EnderecoDAO;
import DAO.Persistence;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Masds
 */
public class Cad_categoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cad_categoria
     */
    public Cad_categoria() {
        initComponents();
    }

    private static Cad_categoria form=null;
    public static Cad_categoria getInstance(){
        if(form == null){
            form = new Cad_categoria();
        }
        return form;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_cadcat = new javax.swing.JLabel();
        lb_categoria = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("CADASTRAR CATEGORIA");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        lb_cadcat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_cadcat.setText("CADASTRAR CATEGORIA");

        lb_categoria.setText("CATEGORIA:");

        bt_cadastrar.setText("CADASTRAR");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(lb_cadcat)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lb_categoria)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_cadastrar)
                        .addGap(71, 71, 71)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_cadcat)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_categoria))
                .addGap(18, 18, 18)
                .addComponent(bt_cadastrar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        //ResultSet result = conexao.executaSQL("select * from livros");
        //while(result.next()){
        //    if(result.getString("nome") == txt_categoria.getText()){            
        //        JOptionPane.showMessageDialog(null, "Categoria já existe!");
        //     }
        //}
        
        String sql = "INSERT INTO categoria(nome) VALUES(?)";
        try (PreparedStatement stmt = conexao.getConexao().prepareStatement(sql)) {
            stmt.setString(1, txt_categoria.getText());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "A categoria "+txt_categoria.getText()+ "Foi adicionada!");
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        conexao.fechaConexao();
    }//GEN-LAST:event_bt_cadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cadcat;
    private javax.swing.JLabel lb_categoria;
    private javax.swing.JTextField txt_categoria;
    // End of variables declaration//GEN-END:variables
}
