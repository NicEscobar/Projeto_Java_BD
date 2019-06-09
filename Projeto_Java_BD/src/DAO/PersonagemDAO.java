/*
 Configuração para conectar ao banco de dados.
 */
package DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projeto_java_bd.Personagem;
import projeto_java_bd.Usuario;

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
       
       
       sql = "INSERT INTO personagem (nomePersonagem,idadePersonagem,usuario_idUsuario,corpo_idCorpo) VALUES (?,?,?,(SELECT MAX(idCorpo) FROM corpo));";
        
       con = daoP.connectionToDb();
       
       try {
            
        //referenciando o objeto pst
        pst = con.prepareStatement(sql);
            
        pst.setString(1, p.getNomeP());
        pst.setString(2, p.getIdade());
        pst.setInt(3, p.getIdUsuario_Per());
        
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
    
    public int buscarPersonagem(Personagem p) {
         //ArrayList<Usuario> listaTemp = new ArrayList<>();
         BigDecimal bdValue = null;
         int valueOf = 0;
         
        sql = "SELECT c.numeroOrdem FROM personagem as p, corpo as c, usuario as u WHERE ? = c.idCorpo AND u.idUsuario = ?;"; 
        con = daoP.connectionToDb();
       
        try {
            
            //referenciando o objeto pst
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, p.getIdPers_corpo());
            pst.setInt(2, p.getIdUsuario_Per());
            pst.execute();
        
            sucesso = true;
            
            st = con.prepareStatement(sql);
            rs = pst.executeQuery();
            //rs = st.executeQuery(sql);
            boolean prax = rs.next();  
     
            if(prax){
                bdValue = rs.getBigDecimal("numeroOrdem");
                valueOf = Integer.valueOf(bdValue.intValue());
           }
             /*
             while(rs.next())
             {
             String emailBanco = rs.getString("email");
             String senhaBanco = rs.getString("senha");
             if((emailBanco.equals(u.getEmail()))&&(senhaBanco.equals(u.getSenha()))){
             //    return true;
             }
             }    */
            
        } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            daoP.fecharConexao(con,pst);

        }
        
        return valueOf;
        }  
    
    public ArrayList<Personagem> mostrarPersonagem(){
        
        ArrayList<Personagem> lista = new ArrayList<>();
        
        con = daoP.connectionToDb();
        
        String sql = "select * from personagem;";
        String sql1 = "select * from personagem;";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
     
            while(rs.next()){
                Personagem pTemp = new Personagem();
                pTemp.setNomeP(rs.getString("nomePersonagem"));
                pTemp.setIdade(rs.getString("idadePersonagem"));
                pTemp.setIdUsuario_Per(rs.getInt("usuario_idUsuario"));
                pTemp.setIdPers_corpo(rs.getInt("corpo_idCorpo"));
                int s = rs.getInt("corpo_idCorpo");
                pTemp.corpo.setNumeroO(pTemp.corpo.buscarCorpo(s));
               
                lista.add(pTemp);
           }
           } catch (SQLException ex) {
            
            System.out.println("Erro = " + ex.getMessage());
            
            
        } finally {
            
            daoP.fecharConexao(con,pst);

        }
        
        return lista;
        }
    }

