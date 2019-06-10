package View;

 

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.InputStream;

import java.util.logging.Level;

import java.util.logging.Logger;

import sun.audio.AudioPlayer;

import sun.audio.AudioStream;

 

/**

*

* @author Renzo

* Esta Thread é responsável por tocar a música de Fundo

*/

public class MusicThread extends Thread{

   

    public void run()

    {

        // Inputstream para receber um arquivo externo

        InputStream in = null;

        // o Try Catch é responsável por tratar qualquer problema que ocorra ao tentar tocar ou baixar o audio

        try {

            // Pega o endereco do arquivo de Audio dentro do Projeto

            String gongFile = "src/D/music.wav";

            // Abre o arquivo de audio com um FileInputSream

            in = new FileInputStream(gongFile);

            // Cria um Stream de Audio

            AudioStream audioStream = new AudioStream(in);

            // Solta o Som DJ, e a musica nao para de tocar nessa balada eletrizante

            while(true)

            {

                // Toca a música

                AudioPlayer.player.start(audioStream);

            }

        } catch (FileNotFoundException ex) {

            Logger.getLogger(MusicThread.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {

            Logger.getLogger(MusicThread.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}