/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import java.io.Serializable;

/**
 *
 * @author Tulio
 */
public class Estoque implements Serializable{
    private Produtos produtos;
    private int quantidade;
    
    public Produtos getProduto() {
        return produtos;
    }

    public void setProduto(Produtos produtos) {
        this.produtos = produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
