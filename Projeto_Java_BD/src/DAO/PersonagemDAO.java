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
import projeto_java_bd.Personagem;



public class PersonagemDAO {
    
    //objeto responsável pela conexão com o Banco
    public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
    
    //private static final String DRIVER = "com.mysql.jdbc.Driver"; //Caminho da classe Driver, que esta na biblioteca com.mysql.jdbc
    private static final String URL = "jdbc:mysql://localhost:3306/mydb"+ "?useTimezone=true&serverTimezone=UTC&useSSL=false"; //colocar o nome do banco
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public boolean sucess;
    
    ConexaoDAO daoC = new ConexaoDAO();
     
     //Função para inserir um usuário no banco de dados
     public boolean insertPersonagem() {

        
        String sql = "INSERT INTO personagem (nomePersonagem, personagem_idUsuario, personagem_idCorpo) values (?,?,?);";
        
        //Chamo o método que faz a conexão
        con = daoC.connectionToDb();

        try {
            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
 
            pst.setString(1, "Maria"); //nome do personagem
            pst.setInt(2, 1);//id do usuario
            pst.setInt(3, 1);//id do corpo
            
            
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
     
     public boolean deletarPersonagem() {

        //Inserindo usuario no banco, usando a linguagem sql na string. 
        //A ? varia com o valor desejado
        String sql = "DELETE from personagem where idPersonagem = ?";
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
     
     public ArrayList<Personagem> buscarPersonagemo() {
        
        ArrayList<Personagem> listaDeUsuarios = new ArrayList<>();

        //Chamo o método que faz a conexão
        con = daoC.connectionToDb();

        String sql = "SELECT * FROM personagem";

        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de personagens: ");
            while(rs.next())
            {
                Personagem personagemTemp = new Personagem(rs.getString("nomePersonagem"),rs.getInt("idPersonagem"));
                
                System.out.println("Nome = "+personagemTemp.getNomeP());
                
                System.out.println("---------------------------------");
                
                listaDeUsuarios.add(personagemTemp);
                
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
