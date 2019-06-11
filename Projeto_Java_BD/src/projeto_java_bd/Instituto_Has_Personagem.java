/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_java_bd;

import DAO.Instituto_Has_Personagem_DAO;

/**
 *
 * @author Nicole Escobar
 */
public class Instituto_Has_Personagem {
    
    private int instituto_idInstituto, personagem_idPersonagem;
    Instituto_Has_Personagem_DAO ipDAO = new Instituto_Has_Personagem_DAO();
    
    public int getInstituto_idInstituto() {
        return instituto_idInstituto;
    }

    public void setInstituto_idInstituto(int instituto_idInstituto) {
        this.instituto_idInstituto = instituto_idInstituto;
    }

    public int getPersonagem_idPersonagem() {
        return personagem_idPersonagem;
    }

    public void setPersonagem_idPersonagem(int personagem_idPersonagem) {
        this.personagem_idPersonagem = personagem_idPersonagem;
    }
    
    public void inserirIHasP(){
        ipDAO.inserirIHasP();
    }
}
