/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projeto_java_bd.Usuario;

/**
 *
 * @author Nicole Escobar
 */
public class ConexaoDAO {
    
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
    String sql;
    
    //Função para fazer a conexão com o banco de dados
    public Connection connectionToDb(){
        
        try {
            //DriveManager.getConnection retorna uma variavel do tipo connection
            con = DriverManager.getConnection(URL, USER, PASS); 
            
        } catch (SQLException ex) {
            System.out.println("Error = "+ex.getMessage());
            
        }
        
        return con;
    }
    
    public void fecharConexao(){
         
        try {
                if (con != null) {
                    con.close();
                }
                if (pst != null)    
                    pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
         
     }  
    
    public boolean inserir(String tabela) {  
        
        if(tabela.equals("Usuario")){
            sql = "INSERT INTO usuario(nomeUsuario, senha, sexo, email ) values (?, ?, ?, ?);";
        }
        else if(tabela.equals("Personagem"))
            sql = "INSERT INTO personagem (nomePersonagem, personagem_idUsuario, personagem_idCorpo) values (?,?,?);";
        
        else if(tabela.equals("Corpo"))
            sql = "INSERT INTO corpo(cor, sexo) values (?, ?);";
        
        else
            sql = "";
        //Chamo o método que faz a conexão
        
        connectionToDb();

        try {

            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
            
           if(tabela.equals("Usuario")){
                pst.setString(1, "Teste2");
                pst.setString(2, "1233");
                pst.setBoolean(3, true);
                pst.setString(4, "tes2@");
           }
           else if(tabela.equals("Personagem")){
                pst.setString(1, "Maria"); //nome do personagem
                pst.setInt(2, 1);//id do usuario
                pst.setInt(3, 1);//id do corpo
           }
           else if(tabela.equals("Corpo")){
                pst.setString(1, "verde");
                pst.setBoolean(2, false);
           }
           
            pst.execute();
            sucess = true;

        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
            sucess = false;
        }
        finally { 
            
            fecharConexao();
        }
      
        return sucess;
    }
    
    public boolean deletar (String tabela, int id) {
       
        if(tabela.equals("Usuario")){
            sql = "DELETE from usuario where idUsuario = ?";
        }
        else if(tabela.equals("Personagem"))
            sql = "DELETE from personagem where idUsuario = ?";
        
        else if(tabela.equals("Corpo"))
            sql = "DELETE from corpo where idUsuario = ?";
        
        else
            sql = "";
        
        connectionToDb();

        try {
            //referenciando o objeto pst
           pst = con.prepareStatement(sql);
            
           pst.setInt(1, id);
           
            pst.execute();
            sucess = true;

        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
            sucess = false;
        } 
        
        finally {
            
          fecharConexao();
        }

        return sucess;
    }
    
   public void buscarBD(String tabela) {
        
         ArrayList<Usuario> listaTemp = new ArrayList<>();
         
        connectionToDb();
 
        if(tabela.equals("Usuario")){
           
            sql = "SELECT * FROM usuario";
        }
        
        else if(tabela.equals("Personagem"))
            sql = "SELECT * FROM personagem";
        
        else if(tabela.equals("Corpo"))
            sql = "SELECT * FROM corpo";
        
        else
            sql = "";
        
        try {
            
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next())
            {             
                if(tabela.equals("Usuario")){

                    Usuario usuarioTemp = new Usuario(rs.getString("nomeUsuario"),rs.getString("senha"),rs.getString("email"));

                    System.out.println("Nome = "+usuarioTemp.getNome());
                    System.out.println("Senha = "+usuarioTemp.getSenha());
                    System.out.println("Email = "+usuarioTemp.getEmail());

                    listaTemp.add(usuarioTemp);
               }
               else if(tabela.equals("Personagem")){
                    pst.setString(1, "Maria"); //nome do personagem
                    pst.setInt(2, 1);//id do usuario
                    pst.setInt(3, 1);//id do corpo
               }
               else if(tabela.equals("Corpo")){
                    pst.setString(1, "verde");
                    pst.setBoolean(2, false);
               } 
            }
            
            sucess = true;

        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            sucess = false;
            
        } finally {
            
            fecharConexao();

        }

    }
}
