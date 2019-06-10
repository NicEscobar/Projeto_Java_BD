/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

import DAO.InstitutoDAO;
import java.util.ArrayList;

/**
 *
 * @author Nicole Escobar
 */
public class Instituto {
    
    String nomeInst, cidade, cursoInst;
    
    InstitutoDAO daoI = new InstitutoDAO();

    public String getNomeInst() {
        return nomeInst;
    }

    public void setNomeInst(String nomeInst) {
        this.nomeInst = nomeInst;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCursoInst() {
        return cursoInst;
    }

    public void setCursoInst(String cursoInst) {
        this.cursoInst = cursoInst;
    }
    
    public void InserirInstituto(Instituto I){
        daoI.inserirInstituicao(I);
    }
    
    public ArrayList<Instituto> mostrarInstituto(){
        
        return daoI.mostrarInstituto();
    }
    
    
    
}
