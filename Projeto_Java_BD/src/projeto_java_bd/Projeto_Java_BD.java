package projeto_java_bd;

import View.MusicThread;
import View.TelaLogin;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


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
