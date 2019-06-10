/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.InputStream;

import java.util.logging.Level;

import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioData;

import sun.audio.AudioPlayer;

import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
/**
 *
 * @author Aguinaldo
 */
public class ClickThread extends Thread {
    @Override
    public void run()
    {
        AudioInputStream inputStream;
        try {
        inputStream = AudioSystem.getAudioInputStream(new File("E:\\\\Projeto_Java_BD\\\\Projeto_Java_BD\\\\src\\\\D\\\\click.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(inputStream);
        clip.start();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MusicThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MusicThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
