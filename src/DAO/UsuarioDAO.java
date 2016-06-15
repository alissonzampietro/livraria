/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cliente.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alisson
 */
public class UsuarioDAO {

    public void adiciona(Cliente usuario) {
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        String sql = "INSERT INTO usuarios(login,senha,nome_usuario,sobrenome_usuario,cpf) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getSobrenome());
            stmt.setString(5, usuario.getCpf());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        conexao.fechaConexao();
    }

    public Cliente busca(Cliente cliente) {

        return cliente;
    }

}
