/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Masds
 */
public class Persistence {    
    private String usuario, senha, bdDados, servidor;
    private int porta;
    private Connection conexao; 
    private Statement statement;
    private ResultSet resultset;
    

    public Persistence() {
    }

    public void ConexaoDB(String usuario, String senha, String bdDados, String servidor) {
        this.usuario = usuario;
        this.senha = senha;
        this.bdDados = bdDados;
        this.servidor = servidor;
        this.porta = 3306; //fixa par mysql
    }

    public Connection getConexao() {
        return conexao;
    }
    
    public void criaConexao() {
        ConexaoDB("root", "", "db_livraria", "127.0.0.1");
        try {
            //carrega o driver
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://"
                    + getServidor() + ":"
                    + getPorta() + "/"
                    + getBdDados(), getUsuario(), getSenha());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Abertura: " + 
                    ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver: " +
                    ex.getMessage());
        }
    }

    public void fechaConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fechar: " +
                    ex.getMessage());
        }
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBdDados() {
        return bdDados;
    }

    public void setBdDados(String bdDados) {
        this.bdDados = bdDados;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
    
    public Statement retornarStatement() throws SQLException{
        return this.conexao.createStatement();
    }
    
    public ResultSet retornarResultSet() throws SQLException{
        return this.resultset;
    }
    
    public ResultSet executaSQL(String sql){
        
        try {
            statement = conexao.createStatement();
            resultset = statement.executeQuery(sql);
        } catch (SQLException ex) {
            resultset = null;
            JOptionPane.showMessageDialog(null, "Não foi possivel executar o comando SQL: "+ex.getMessage()+" Comando: "+sql);
        }
        return resultset;
    }      
}
