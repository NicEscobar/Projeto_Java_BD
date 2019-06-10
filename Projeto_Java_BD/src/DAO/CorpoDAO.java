/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
     
     public void inserirCorpo(int numOrdem) {
       

       sql = "INSERT INTO corpo (numeroOrdem) VALUES (?) ";

        
       con = daoC.connectionToDb();
        try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
            
        pst.setInt(1, numOrdem);
        
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
    
    public int buscarCorpo(int idOrdem) {
        
       //ArrayList<Corpo> listaTemp = new ArrayList<>();
         
        con = daoC.connectionToDb();
    
        sql = "SELECT * FROM corpo";
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {                        
                int idBanco = rs.getInt("idCorpo");
             if(idBanco == idOrdem){
                 return rs.getInt("numeroOrdem");
                }   
            }

        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            daoC.fecharConexao(con,pst);

        }
        return 0;
    }
      
}
