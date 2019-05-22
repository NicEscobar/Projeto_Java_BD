/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    
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
    
    //Função para fazer a conexão com o banco de dados
     public boolean connectionToDb(){
        
        try {
            //DriveManager.getConnection retorna uma variavel do tipo connection
            con = DriverManager.getConnection(URL, USER, PASS); 
            sucess = true;
        } catch (SQLException ex) {
            System.out.println("Error = "+ex.getMessage());
            sucess = false;
        }
        
        return sucess;
    }
     
     //Função para inserir um usuário no banco de dados
     public boolean insert() {

        //Inserindo usuario no banco, usando a linguagem sql na string. 
        //A ? varia
        String sql = "INSERT INTO Usuario(nomeUsuario, senha, sexo, email ) values (?, ?, ?, ?);";
        //String sql1 = "INSERT INTO Usuario(senha) values (?)";
        //Chamo o método que faz a conexão
        connectionToDb();

        try {
            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
            //vou substituir o ?. 1 significa que é a 1° ? e o novoUsuario é o que vai ser substituido por ela
            pst.setString(1, "Tha");
            pst.setString(2, "321");
            pst.setBoolean(3, true);
            pst.setString(4, "tata@");
            pst.execute();

            sucess = true;

        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
            sucess = false;
        }
        return sucess;
    }
     
     public boolean deletarUsuario() {

        //Inserindo usuario no banco, usando a linguagem sql na string. 
        //A ? varia com o valor desejado
        String sql = "DELETE from usuario where id = ?";
        //Chamo o método que faz a conexão
        connectionToDb();

        try {
            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
            //vou substituir o ?. 1 significa que é a 1° ? e o novoUsuario é o que vai ser substituido por ela
            //pst.setInt(1, id);
            pst.execute();

            sucess = true;

        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
            sucess = false;
        } 
        
        finally {
            
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null)    
                    pst.close();
                
                
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }

        return sucess;
    }
}
