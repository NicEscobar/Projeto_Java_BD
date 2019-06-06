/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

import DAO.UsuarioDAO;

/**
 *
 * @author aluno
 */
public class Usuario {
    
    private String nome;
    private String senha;
    private String email;
    private int id;
    
    UsuarioDAO daoU = new UsuarioDAO();
    
    public Usuario(){
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void inserirUsuario(Usuario u){
        
        daoU.inserirUsuario(u);
        
    };
    
    public void deletarUsuario(int id){
        
        daoU.deletarUsuario(id);
        
    };
    
    public boolean buscarUsuario(String usuario, String senha){
        
        return daoU.buscarUsuario(usuario,senha);
        
    };
        
}
