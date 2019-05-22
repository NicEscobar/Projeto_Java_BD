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


public class ConnectionFactory {
    
    //objeto responsável pela conexão com o Banco
    public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
    
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //Caminho da classe Driver, que esta na biblioteca com.mysql.jdbc
    private static final String URL = "jdbc:mysql://localhost:3306/nomedobanco"; //colocar o nome do banco
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public boolean sucess;
    
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
}
