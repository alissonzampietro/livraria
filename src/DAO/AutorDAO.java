/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alisson
 */
public class AutorDAO {
    
    public Integer retornaId(String nome) throws SQLException{
        Integer retorno = null;
        Persistence conexao = new Persistence();
        conexao.criaConexao();
        ResultSet retornoQuery = conexao.executaSQL("select * from autor where nome like '" + nome + "%'");
        if(retornoQuery.next()){
            retorno = retornoQuery.getInt("id_autor");
        }
        return retorno;
    }
    
}
