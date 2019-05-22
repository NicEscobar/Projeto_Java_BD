/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Tulio
 */
public class ArquivoProdutos {
    ArrayList<Produtos> pro;
    public ArquivoProdutos() {
        try{
           FileOutputStream a = new FileOutputStream("Produtos.txt", true);
           a.close();
        }catch(Exception ex){
            
        }
    }
     public void salvar(ArrayList<Produtos> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Produtos.txt",false);
            out = new ObjectOutputStream(fout);
            System.out.println(array.size());
            out.writeObject(array);

            out.close();
            fout.close();
            System.out.println("deu certo");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }
     public ArrayList<Produtos> ler() {
        
        FileInputStream fin;
        ObjectInputStream in;
        pro = new ArrayList<>();

        try {
            fin = new FileInputStream("Produtos.txt");
            in = new ObjectInputStream(fin);

            pro = (ArrayList<Produtos>) in.readObject();
            System.out.println(pro.size());
            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return pro;
    }
}
