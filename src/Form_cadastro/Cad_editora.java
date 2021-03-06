/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_cadastro;

import DAO.Persistence;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Login;

/**
 *
 * @author Masds
 */
public class Cad_editora extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cad_editora
     */
    public Cad_editora() {
        initComponents();
    }

    private static Cad_editora form=null;
    public static Cad_editora getInstance(){
        if(form == null){
            form = new Cad_editora();
        }
        return form;
    }
    
    private void limpaform(){
        txt_nome.setText("");
        txt_cnpj.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_cadeditora = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        lb_cnpj = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_cnpj = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("CADASTRAR EDITORA");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        lb_cadeditora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_cadeditora.setText("CADASTRAR EDITORA");

        lb_nome.setText("Nome:");

        lb_cnpj.setText("CNPJ:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lb_cadeditora))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_cnpj)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cnpj))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb_nome)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(bt_cadastrar)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_cadeditora)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cnpj)
                    .addComponent(txt_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(bt_cadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ResultSet result = conexao.executaSQL("select * from editora where cnpj='"+txt_cnpj.getText()+"'");
        try {
        Boolean teste = result.first();
            if(!teste){
                String sql = "INSERT INTO editora(nome,cnpj) VALUES(?,?)";
                try (PreparedStatement stmt = conexao.getConexao().prepareStatement(sql)) {
                stmt.setString(1, txt_nome.getText());
                stmt.setString(2, txt_cnpj.getText());
                stmt.execute();
                JOptionPane.showMessageDialog(null, "A Editora "+txt_nome.getText()+ " Foi adicionada!");
        } catch (SQLException u) {
            throw new RuntimeException(u);
        } limpaform();
        }else{
            if(!"".equals(txt_cnpj.getText())){
            JOptionPane.showMessageDialog(null, "Esta Editora ja foi cadastrada");
            limpaform();
        }}} catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.fechaConexao();
    }//GEN-LAST:event_bt_cadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cadeditora;
    private javax.swing.JLabel lb_cnpj;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JTextField txt_cnpj;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
