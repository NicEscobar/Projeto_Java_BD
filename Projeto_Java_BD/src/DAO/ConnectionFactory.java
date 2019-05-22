/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;

/**
 *
 * @author Nicole Escobar
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //Caminho da classe Driver, que esta na biblioteca com.mysql.jdbc
    private static final String URL = "jdbc:mysql://localhost:3306/nomedobanco"; //colcar o nome do banco
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Conection getConection(){}
}
