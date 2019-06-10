package projeto_java_bd;

import View.MusicThread;
import View.TelaLogin;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

/*Criar um Usuario primeiro.
  Criar um Corpo antes de criar o personagem.
*/

public class Projeto_Java_BD {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
        
        MusicThread m1 = new MusicThread();
        m1.start();
        
        //Interface
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(true);
        
        boolean deuCerto = false;
        }
    }   
