/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projeto_java_bd.Usuario;

/**
 *
 * @author Nicole Escobar
 */
public class Instituto_Has_Personagem_DAO {
    
   public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    public PreparedStatement pstC1;
    public PreparedStatement pstC2;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
     String sql;
     String chaveCI, chaveCP;
     int chaveI, chaveP;
    ConexaoDAO conexao = new ConexaoDAO();
    //Função para inserir um usuário no banco de dados
    
    public void inserirIHasP() {
       
       sql = "INSERT INTO instituto_has_personagem (instituto_idInstituto, personagem_idPersonagem) VALUES (?, ?);";
       chaveCI = "select MAX(idInstituto) FROM instituto;";
       chaveCP = "select MAX(idPersonagem) FROM personagem;";
       
       con = conexao.connectionToDb();
       
       try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
        
        st = con.createStatement();
        rs = st.executeQuery(chaveCI);
        
        chaveI = rs.getInt("idInstituto");
        chaveP =  rs.getInt("idPersonagem");
        
        pst.setInt(1, chaveI);
        pst.setInt(2, chaveP);
        
        pst.execute();
         
        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
           
        }finally { 
            
           conexao.fecharConexao(con, pst);
        }
    }
    
}
