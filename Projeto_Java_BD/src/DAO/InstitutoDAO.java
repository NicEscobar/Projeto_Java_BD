/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projeto_java_bd.Instituto;

/**
 *
 * @author Nicole Escobar
 */
public class InstitutoDAO {
    
    public Connection con;
   //objeto para manipular comandos SQL Dinamicos
    public PreparedStatement pst;
    //objeto para manipular comandos SQL Estáticos
    public Statement st;
    //objeto que referencia a tabela gerada em uma busca
    public ResultSet rs;
    
     String sql;

    
    ConexaoDAO daoI = new ConexaoDAO();
    //Função para inserir um usuário no banco de dados
    
    public void inserirInstituicao(Instituto i) {
       
       sql = "INSERT INTO instituto (nomeInstituto, cidade, cursoInstituto) VALUES (?, ?, ?);";
       
               
       con = daoI.connectionToDb();
       
       try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
            
        pst.setString(1, i.getNomeInst());
        pst.setString(2, i.getCidade());
        pst.setString(3, i.getCursoInst());
        
        pst.execute();
         
        } catch (SQLException ex) {
            
            System.out.println("Error = " + ex.getMessage());
           
        }finally { 
            
           daoI.fecharConexao(con, pst);
        }
    }
    
        public ArrayList<Instituto> mostrarInstituto(){
        
        ArrayList<Instituto> lista = new ArrayList<>();
        
        con = daoI.connectionToDb();
        
        String sql = "select * from instituto;";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
     
            while(rs.next()){
                Instituto iTemp = new Instituto();
                
                iTemp.setNomeInst(rs.getString("nomeInstituto"));
                iTemp.setCidade(rs.getString("cidade"));
                iTemp.setCursoInst(rs.getString("cursoInstituto"));
                             
                lista.add(iTemp);
            }
           } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            daoI.fecharConexao(con,pst);

        }
        
        return lista;
        }
    
    
}
