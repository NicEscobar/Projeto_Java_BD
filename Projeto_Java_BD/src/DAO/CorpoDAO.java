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
import projeto_java_bd.Corpo;

public class CorpoDAO {
    
    //objeto responsável pela conexão com o Banco
    public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
    public boolean sucess;
    String sql;
    
    ConexaoDAO daoC = new ConexaoDAO();
     
     public void inserirCorpo(Corpo c) {
       
       sql = "INSERT INTO usuario(nomeUsuario, senha, email ) values (?, ?, ?);";
        
       con = daoC.connectionToDb();
        try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
            
        
         pst.execute();
         
        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
           
        }finally { 
            
           daoC.fecharConexao(con, pst);
        }
    }
     
     public void deletarPersonagem (Corpo c) {
       
        
        sql = "DELETE from usuario where idUsuario = ?";
       
       
        daoC.connectionToDb();

        try {
            //referenciando o objeto pst
           pst = con.prepareStatement(sql);
            
           //pst.setInt(1, u.get);
           
            pst.execute();
            

        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
          
        } 
        
        finally {
            
          daoC.fecharConexao(con, pst);
        }  
    }
    
    public void buscarCorpo() {
        
         ArrayList<Corpo> listaTemp = new ArrayList<>();
         
        con = daoC.connectionToDb();
 
           
        sql = "SELECT * FROM usuario";
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {             
                

                    //Usuario usuarioTemp = new Usuario(rs.getString("nomeUsuario"),rs.getInt("senha"),rs.getString("email"));

                   // System.out.println("Nome = "+usuarioTemp.getNome());
                   // System.out.println("Senha = "+usuarioTemp.getSenha());
                   // System.out.println("Email = "+usuarioTemp.getEmail());

                   // listaTemp.add(usuarioTemp);
               
               
            }   
         

        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            daoC.fecharConexao(con,pst);

        }

    }
      
}
