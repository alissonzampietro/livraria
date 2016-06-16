/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cliente.Cliente;
import Cliente.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisson
 */
public class UsuarioDAO {

    public Boolean inserir(Cliente usuario, Endereco endereco) {
        Boolean retorno;
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        String sql = "INSERT INTO usuarios(login,senha,nome_usuario,sobrenome_usuario,cpf) VALUES(?,?,?,?,?)";
        try (PreparedStatement stmt = conexao.getConexao().prepareStatement(sql)) {
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getSobrenome());
            stmt.setString(5, usuario.getCpf());
            retorno = stmt.execute();
            this.retornaUltimaInsercao(conexao);
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        conexao.fechaConexao();
        return retorno;
    }
    
    private Integer retornaUltimaInsercao(Persistence conexao) throws SQLException{
        Integer retorno = null;
        ResultSet retornoQuery = conexao.executaSQL("select * from usuarios order by id_usuario desc");
        if(retornoQuery.next()) {
            retorno = retornoQuery.getInt(1);
        }
        return retorno;
    }

}
