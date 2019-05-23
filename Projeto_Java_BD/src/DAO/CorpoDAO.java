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
    
    ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean inserirCorpo() {

        //Inserindo usuario no banco, usando a linguagem sql na string. 
        //A ? varia
        String sql = "INSERT INTO corpo(cor, sexo) values (?, ?);";
        //String sql1 = "INSERT INTO Usuario(senha) values (?)";
        
        //Chamo o método que faz a conexão
        con = daoC.connectionToDb();

        try {
            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
            //vou substituir o ?. 1 significa que é a 1° ? e o novoUsuario é o que vai ser substituido por ela
            pst.setString(1, "vermelho");
            pst.setBoolean(2, false);
   
            pst.execute();

            sucess = true;

        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
            sucess = false;
        }
        finally {         
            try{                 
                fecharBanco(); 
            }  
            catch (SQLException ex) {           
                System.out.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }
      
        return sucess;
    }
     
     public boolean deletarUsuario() {

        //Inserindo usuario no banco, usando a linguagem sql na string. 
        //A ? varia com o valor desejado
        String sql = "DELETE from corpo where idCorpo = ?";
        //Chamo o método que faz a conexão
        con = daoC.connectionToDb();

        try {
            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
            //vou substituir o ?. 1 significa que é a 1° ? e o novoUsuario é o que vai ser substituido por ela
            pst.setInt(1, 2);
            pst.execute();

            sucess = true;

        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
            sucess = false;
        } 
        
        finally {         
            try{                 
                fecharBanco(); 
            }  
            catch (SQLException ex) {           
                System.out.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }

        return sucess;
    }
     
     public ArrayList<Corpo> buscarUsuariosSemFiltro() {
        
        ArrayList<Corpo> listaDeUsuarios = new ArrayList<>();

        daoC.connectionToDb();

        String sql = "SELECT * FROM usuario";

        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de usuarios: ");
            while(rs.next())
            {
                Corpo usuarioTemp = new Corpo(rs.getString("cor"),rs.getBoolean("true"));
                
                System.out.println("Nome = "+usuarioTemp.getCor());
                System.out.println("Senha = "+usuarioTemp.isSexo());
                
                
                System.out.println("---------------------------------");
                
                listaDeUsuarios.add(usuarioTemp);
                
            }
            sucess = true;

        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            sucess = false;
            
        } finally {
            try {
                fecharBanco();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }

        }

        return listaDeUsuarios;
    }
     
     public void fecharBanco() throws SQLException{
        
         if (con != null) {
                    con.close();
                }
                if (pst != null)    
                    pst.close();
     }
}
