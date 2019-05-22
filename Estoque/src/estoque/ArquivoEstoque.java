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
public class ArquivoEstoque {
    ArrayList<Estoque> est;
    public ArquivoEstoque() {
        try{
           FileOutputStream a = new FileOutputStream("Estoque.txt", true);
           a.close();
        }catch(Exception ex){
            
        }
    }
     public void salvar(ArrayList<Estoque> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Estoque.txt",false);
            out = new ObjectOutputStream(fout);

            out.writeObject(array);

            out.close();
            fout.close();
            System.out.println("deu certo");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }
    }
     public ArrayList<Estoque> ler() {
        
        FileInputStream fin;
        ObjectInputStream in;
        est = new ArrayList<>();

        try {
            fin = new FileInputStream("Estoque.txt");
            in = new ObjectInputStream(fin);

            est = (ArrayList<Estoque>) in.readObject();
            System.out.println(est.size());
            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return est;
    }
}
  

