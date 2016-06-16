/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Cliente.Endereco;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alisson
 */
public class EnderecoDAO {
    
    public void inserir(Endereco endereco, Integer idUsuario){
        Boolean retorno;
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        String sql = "INSERT INTO endereco_usuario(fk_usuario,endereco,cep) VALUES(?,?,?)";
        try (PreparedStatement stmt = conexao.getConexao().prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            stmt.setString(2, endereco.getEndereco());
            stmt.setString(3, endereco.getCep());
            stmt.execute();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        conexao.fechaConexao();
    }
    
}
