/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Livro;
import Cliente.Atualiza;
import javax.swing.*;
import Form_cadastro.*;

/**
 *
 * @author Masds
 */
public class MainLivro extends javax.swing.JFrame {

    public MainLivro() {
        initComponents();
        setLocationRelativeTo(getRootPane());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dt_princ = new javax.swing.JDesktopPane();
        Bar_menu = new javax.swing.JMenuBar();
        menu_principal = new javax.swing.JMenu();
        sb_itempesquisar = new javax.swing.JMenuItem();
        sb_sair = new javax.swing.JMenuItem();
        menu_atualizar = new javax.swing.JMenu();
        sb_alterar = new javax.swing.JMenuItem();
        menu_admin = new javax.swing.JMenu();
        sb_cadautor = new javax.swing.JMenuItem();
        sb_cadlivro = new javax.swing.JMenuItem();
        sb_cadeditora = new javax.swing.JMenuItem();
        sv_geruser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout dt_princLayout = new javax.swing.GroupLayout(dt_princ);
        dt_princ.setLayout(dt_princLayout);
        dt_princLayout.setHorizontalGroup(
            dt_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
        );
        dt_princLayout.setVerticalGroup(
            dt_princLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        menu_principal.setText("Menu");
        menu_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_principalActionPerformed(evt);
            }
        });

        sb_itempesquisar.setText("Pesquisar");
        sb_itempesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sb_itempesquisarActionPerformed(evt);
            }
        });
        menu_principal.add(sb_itempesquisar);

        sb_sair.setText("Sair");
        sb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sb_sairActionPerformed(evt);
            }
        });
        menu_principal.add(sb_sair);

        Bar_menu.add(menu_principal);

        menu_atualizar.setText("Atualizar dados");
        menu_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_atualizarActionPerformed(evt);
            }
        });

        sb_alterar.setText("Alterar Cadastro");
        sb_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sb_alterarActionPerformed(evt);
            }
        });
        menu_atualizar.add(sb_alterar);

        Bar_menu.add(menu_atualizar);

        menu_admin.setText("ADMIN");

        sb_cadautor.setText("Cadastrar Autor");
        sb_cadautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sb_cadautorActionPerformed(evt);
            }
        });
        menu_admin.add(sb_cadautor);

        sb_cadlivro.setText("Cadastrar Livro");
        menu_admin.add(sb_cadlivro);

        sb_cadeditora.setText("Cadastrar Editora");
        menu_admin.add(sb_cadeditora);

        sv_geruser.setText("Gerenciar usuário");
        menu_admin.add(sv_geruser);

        Bar_menu.add(menu_admin);

        setJMenuBar(Bar_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dt_princ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dt_princ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_principalActionPerformed

    }//GEN-LAST:event_menu_principalActionPerformed

    private void sb_itempesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sb_itempesquisarActionPerformed
        JintPesquisar internal_1 = JintPesquisar.getInstance();
        for(JInternalFrame a : dt_princ.getAllFrames()){
            if (a.equals(internal_1)){
                internal_1.setVisible(true);
                return;
            }
        }
        dt_princ.add(internal_1);
        internal_1.setVisible(true);
    }//GEN-LAST:event_sb_itempesquisarActionPerformed

    private void menu_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_atualizarActionPerformed

    }//GEN-LAST:event_menu_atualizarActionPerformed

    private void sb_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sb_alterarActionPerformed
        Atualiza internal_2 = Atualiza.getInstance();
        for(JInternalFrame b : dt_princ.getAllFrames()){
            if (b.equals(internal_2)){
                internal_2.setVisible(true);
                return;
            }
        }
        dt_princ.add(internal_2);
        internal_2.setVisible(true);
    }//GEN-LAST:event_sb_alterarActionPerformed

    private void sb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sb_sairActionPerformed
        new main.Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sb_sairActionPerformed

    private void sb_cadautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sb_cadautorActionPerformed
        Cad_autor internal_3 = Cad_autor.getInstance();
        for(JInternalFrame c : dt_princ.getAllFrames()){
            if (c.equals(internal_3)){
                internal_3.setVisible(true);
                return;
            }
        }
        dt_princ.add(internal_3);
        internal_3.setVisible(true);
    }//GEN-LAST:event_sb_cadautorActionPerformed

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
            java.util.logging.Logger.getLogger(MainLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Bar_menu;
    private javax.swing.JDesktopPane dt_princ;
    private javax.swing.JMenu menu_admin;
    private javax.swing.JMenu menu_atualizar;
    private javax.swing.JMenu menu_principal;
    private javax.swing.JMenuItem sb_alterar;
    private javax.swing.JMenuItem sb_cadautor;
    private javax.swing.JMenuItem sb_cadeditora;
    private javax.swing.JMenuItem sb_cadlivro;
    private javax.swing.JMenuItem sb_itempesquisar;
    private javax.swing.JMenuItem sb_sair;
    private javax.swing.JMenuItem sv_geruser;
    // End of variables declaration//GEN-END:variables
}
