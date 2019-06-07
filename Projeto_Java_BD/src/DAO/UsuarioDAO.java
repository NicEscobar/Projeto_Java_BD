/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projeto_java_bd.Usuario;



public class UsuarioDAO {
    
    public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
     String sql;
    
    ConexaoDAO conexao = new ConexaoDAO();
    //Função para inserir um usuário no banco de dados
    
    public void inserirUsuario(Usuario u) {
       
       sql = "INSERT INTO usuario (nomeUsuario, senha, email) VALUES (?, ?, ?);";
        
       con = conexao.connectionToDb();
       
       try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
            
        pst.setString(1, u.getNome());
        pst.setString(2, u.getSenha());
        pst.setString(3, u.getEmail());
        
        pst.execute();
         
        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
           
        }finally { 
            
           conexao.fecharConexao(con, pst);
        }
    }
    
    public void deletarUsuario (int idUsuario) {
       
        
        sql = "DELETE FROM `mydb`.`usuario` WHERE (`idUsuario` = '?');";
       
       
        conexao.connectionToDb();

        try {
            //referenciando o objeto pst
           pst = con.prepareStatement(sql);
            
           pst.setInt(1, idUsuario);
           
            pst.execute();
            

        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
          
        } 
        
        finally {
            
          conexao.fecharConexao(con, pst);
        }  
    }
    
    public int buscarUsuario(String loginUsuario) {
        
         //ArrayList<Usuario> listaTemp = new ArrayList<>();
         
        con = conexao.connectionToDb();
 
           
        sql = "SELECT * FROM usuario";
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            
           
            while(rs.next())
            {     
                String emailBanco = rs.getString("email");
                
                if((emailBanco.equals(loginUsuario))){
                    
                    return rs.getInt(1);
                }
                  
            }       

        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            conexao.fecharConexao(con,pst);

        }
        return -1;
    }
    
    
    public boolean verificacaoUsuario(String usuario, String senhaUsuario) {
        
         //ArrayList<Usuario> listaTemp = new ArrayList<>();
         
        con = conexao.connectionToDb();
 
           
        sql = "SELECT * FROM usuario";
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            
           
            while(rs.next())
            {     
                String emailBanco = rs.getString("email");
                String senhaBanco = rs.getString("senha");
                
                if((emailBanco.equals(usuario))&&(senhaBanco.equals(senhaUsuario))){
                    
                    return true;
                }
                  
            }       

        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            conexao.fecharConexao(con,pst);

        }
        return false;
    }
    
}
