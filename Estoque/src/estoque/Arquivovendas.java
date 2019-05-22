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
public class Arquivovendas {
    ArrayList<Vendas> vend;
    public Arquivovendas() {
        try{
           FileOutputStream a = new FileOutputStream("Vendas.txt", true);
           a.close();
        }catch(Exception ex){
            
        }
    }
     public void salvar(ArrayList<Vendas> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Vendas.txt",false);
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
     public ArrayList<Vendas> ler() {
        
        FileInputStream fin;
        ObjectInputStream in;
        vend = new ArrayList<>();

        try {
            fin = new FileInputStream("Vendas.txt");
            in = new ObjectInputStream(fin);

            vend = (ArrayList<Vendas>) in.readObject();
            System.out.println(vend.size());
            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return vend;
    }
}

