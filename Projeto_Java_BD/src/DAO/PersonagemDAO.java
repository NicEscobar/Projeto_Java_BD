/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projeto_java_bd.Personagem;

public class PersonagemDAO {
    
    public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
    public boolean sucesso = false;
    String sql;
    
    ConexaoDAO daoP = new ConexaoDAO();
     
    public boolean inserirPersonagem(Personagem p) {
       
       
       sql = "INSERT INTO personagem (nomePersonagem, idadePersonagem, usuario_idUsuario ) values (?,?,?);";
        
       con = daoP.connectionToDb();
       
       try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
            
        pst.setString(1, p.getNomeP());
        pst.setString(2, p.getIdade());
        pst.setInt(3, p.getIdUsuario_Per());
        //pst.setInt(4, 1);
        
        pst.execute();
        
        sucesso = true;
         
        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
           
        }finally { 
            
           daoP.fecharConexao(con,pst);
        }
       return sucesso;
    }
       
       
       public void deletarPersonagem (int id) {
       
        
        sql = "DELETE from personagem where idUsuario = ?";
       
       
        daoP.connectionToDb();

        try {
            //referenciando o objeto pst
           pst = con.prepareStatement(sql);
            
           //pst.setInt(1, u.get);
           
            pst.execute();
            

        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
          
        } 
        
        finally {
            
          daoP.fecharConexao(con, pst);
        }  
    }
    
        public boolean buscarPersonagem(String usuario, String senhaUsuario) {
         //ArrayList<Usuario> listaTemp = new ArrayList<>();
         
        con = daoP.connectionToDb();
 
           
        sql = "SELECT * FROM personagem";
        
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
            
            daoP.fecharConexao(con,pst);

        }
        return false;
        }   
}
