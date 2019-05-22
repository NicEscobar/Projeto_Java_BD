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
import java.util.List;

/**
 *
 * @author Tulio
 */
public class ArquivoFuncionarios {
    ArrayList<Funcionario> fun;
    public ArquivoFuncionarios() {
        try{
           FileOutputStream a = new FileOutputStream("Funcionarios.txt", true);
           a.close();
        }catch(Exception ex){
            
        }
    }
     public void salvar(ArrayList<Funcionario> array) {
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Funcionarios.txt",false);
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
     public ArrayList<Funcionario> ler() {
        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Funcionario> fun = new ArrayList<>();

        try {
            fin = new FileInputStream("Funcionarios.txt");
            in = new ObjectInputStream(fin);

            fun = (ArrayList<Funcionario>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return fun;
    }
    
}
