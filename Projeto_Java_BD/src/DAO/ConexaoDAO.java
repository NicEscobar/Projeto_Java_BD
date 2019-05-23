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
    
     public void fecharBanco() throws SQLException{
        
         if (con != null) {
                    con.close();
                }
                if (pst != null)    
                    pst.close();
     }  
}
