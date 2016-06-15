/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;
import main.Login;
import utilitarios.Persistence;
import utilitarios.data;

/**
 *
 * @author Masds
 */
public class Cadastro extends javax.swing.JFrame {
    String Hora;
    public Cadastro() {
        initComponents();
        carrega_hora();
        timer2.start();
    }
    
    public void carrega_hora(){
        data mostra_data = new data();
        mostra_data.getDataHora();
        lb_data.setText(""+mostra_data.dia+" de "+mostra_data.mes+" de "+mostra_data.ano+" - "+mostra_data.dia_semana+" "+mostra_data.hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer2 = new org.netbeans.examples.lib.timerbean.Timer();
        painel_princ = new javax.swing.JPanel();
        bt_cadastrar = new javax.swing.JButton();
        lb_msg = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        lb_senha = new javax.swing.JLabel();
        lb_endereco = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        lb_cadastro = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        lb_data = new javax.swing.JLabel();
        txt_cep = new javax.swing.JTextField();
        lb_nome = new javax.swing.JLabel();
        lb_sobrenome = new javax.swing.JLabel();
        txt_sobrenome = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        lb_cep1 = new javax.swing.JLabel();

        timer2.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer2OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Novo Usuário");

        painel_princ.setBackground(new java.awt.Color(0, 204, 204));

        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastrarActionPerformed(evt);
            }
        });

        lb_msg.setText("Preencha os campos abaixo para cadastrar um novo usuário");

        lb_usuario.setText("Usuário:");

        lb_senha.setText("Senha:");

        lb_endereco.setText("Endereço:");

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        txt_endereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lb_cadastro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_cadastro.setText("CADASTRO DE NOVO USUÁRIO");

        bt_voltar.setText("Voltar");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        lb_data.setText("Data");

        lb_nome.setText("Nome:");

        lb_sobrenome.setText("Sobrenome:");

        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });

        lb_cep1.setText("CEP:");

        javax.swing.GroupLayout painel_princLayout = new javax.swing.GroupLayout(painel_princ);
        painel_princ.setLayout(painel_princLayout);
        painel_princLayout.setHorizontalGroup(
            painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_princLayout.createSequentialGroup()
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_princLayout.createSequentialGroup()
                        .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_princLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_endereco)
                                    .addComponent(lb_senha)
                                    .addComponent(lb_usuario)
                                    .addComponent(lb_sobrenome)
                                    .addComponent(lb_cep1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_princLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lb_nome)))
                        .addGap(18, 18, 18)
                        .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painel_princLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_voltar)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_princLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_princLayout.createSequentialGroup()
                        .addComponent(lb_cadastro)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_princLayout.createSequentialGroup()
                        .addComponent(lb_data)
                        .addGap(110, 110, 110))))
            .addGroup(painel_princLayout.createSequentialGroup()
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_princLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lb_msg))
                    .addGroup(painel_princLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(bt_cadastrar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painel_princLayout.setVerticalGroup(
            painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_princLayout.createSequentialGroup()
                .addComponent(lb_data)
                .addGap(28, 28, 28)
                .addComponent(lb_cadastro)
                .addGap(18, 18, 18)
                .addComponent(lb_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_sobrenome)
                    .addComponent(txt_sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_endereco)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cep1)
                    .addComponent(txt_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_voltar)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painel_princ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_princ, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timer2OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer2OnTime
        carrega_hora();
    }//GEN-LAST:event_timer2OnTime

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        new main.Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void bt_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastrarActionPerformed
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        conexao.fechaConexao();
        
        
    }//GEN-LAST:event_bt_cadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel lb_cadastro;
    private javax.swing.JLabel lb_cep1;
    private javax.swing.JLabel lb_data;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_msg;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_sobrenome;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPanel painel_princ;
    private org.netbeans.examples.lib.timerbean.Timer timer2;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextField txt_sobrenome;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
