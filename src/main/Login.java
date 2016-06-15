/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import utilitarios.data;
import javax.swing.*;
import cadastro.Cadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitarios.Persistence;
/**
 *
 * @author Masds
 */
public class Login extends javax.swing.JFrame {
    data mostra_data;
    int count = 0;

    public Login() {
        initComponents();
        carrega_hora();
        timer1.start();
    }

    public void carrega_hora(){
        data mostra_data = new data();
        mostra_data.getDataHora();
        lb_data.setText(""+mostra_data.dia+" de "+mostra_data.mes+" de "+mostra_data.ano+" - "+mostra_data.dia_semana+" "+mostra_data.hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        Painel_principal = new javax.swing.JPanel();
        Painel_sec = new javax.swing.JPanel();
        bt_entrar = new javax.swing.JButton();
        lb_usuario = new javax.swing.JLabel();
        lb_senha = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lb_livraria = new javax.swing.JLabel();
        lb_msg = new javax.swing.JLabel();
        bt_registro = new javax.swing.JButton();
        lb_data = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        Painel_principal.setName("Login"); // NOI18N

        Painel_sec.setBackground(new java.awt.Color(153, 255, 153));

        bt_entrar.setText("ENTRAR");
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });

        lb_usuario.setText("Usuário:");

        lb_senha.setText("Senha:");

        txt_usuario.setToolTipText("Insira o nome do usuário");

        lb_livraria.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lb_livraria.setText("SISTEMA LIVRARIA");

        lb_msg.setText("Entre com usuário e Senha para utilizar o sistema");

        bt_registro.setText("Registrar");
        bt_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registroActionPerformed(evt);
            }
        });

        lb_data.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lb_data.setText("DATA");

        bt_sair.setText("Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_secLayout = new javax.swing.GroupLayout(Painel_sec);
        Painel_sec.setLayout(Painel_secLayout);
        Painel_secLayout.setHorizontalGroup(
            Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_secLayout.createSequentialGroup()
                .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_secLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lb_msg))
                    .addGroup(Painel_secLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_usuario)
                            .addComponent(lb_senha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_secLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bt_entrar)
                                .addGap(18, 18, 18)
                                .addComponent(bt_registro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(bt_sair))
                            .addGroup(Painel_secLayout.createSequentialGroup()
                                .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txt_senha))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Painel_secLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lb_livraria))
                    .addGroup(Painel_secLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_data)))
                .addContainerGap())
        );
        Painel_secLayout.setVerticalGroup(
            Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_secLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lb_livraria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_secLayout.createSequentialGroup()
                        .addComponent(lb_msg)
                        .addGap(18, 18, 18)
                        .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_senha)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(Painel_secLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_entrar)
                            .addComponent(bt_registro))
                        .addGap(14, 14, 14)
                        .addComponent(lb_data))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_secLayout.createSequentialGroup()
                        .addComponent(bt_sair)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout Painel_principalLayout = new javax.swing.GroupLayout(Painel_principal);
        Painel_principal.setLayout(Painel_principalLayout);
        Painel_principalLayout.setHorizontalGroup(
            Painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Painel_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel_principalLayout.setVerticalGroup(
            Painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Painel_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed

    private void bt_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registroActionPerformed
        new cadastro.Cadastro().show();
        this.dispose();
    }//GEN-LAST:event_bt_registroActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        carrega_hora();
    }//GEN-LAST:event_timer1OnTime

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        ResultSet retornoQuery = conexao.executaSQL("select * from usuarios where login = '" + txt_usuario.getText() + "' and senha = '" + txt_senha.getText() + "' and ativo = 1 and fk_tipo_usuario = 1");
        try {
            Boolean teste = retornoQuery.first();
            if(teste){
                if(!"".equals(txt_usuario.getText()) || !"".equals(txt_senha.getText())){
                    new Livraria.MainLivraria().setVisible(true);
                    JOptionPane.showMessageDialog(null, "Bem vindo "+txt_usuario.getText());
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Por favor, verifique se há algum campo em branco!");
                    txt_usuario.setText("");
                    txt_senha.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                txt_usuario.setText("");
                txt_senha.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.fechaConexao();
    }//GEN-LAST:event_bt_entrarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_principal;
    private javax.swing.JPanel Painel_sec;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JButton bt_registro;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel lb_data;
    private javax.swing.JLabel lb_livraria;
    private javax.swing.JLabel lb_msg;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_usuario;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
