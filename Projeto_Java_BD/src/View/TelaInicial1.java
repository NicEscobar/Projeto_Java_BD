/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import projeto_java_bd.Corpo;
import projeto_java_bd.Personagem;

/**
 *
 * @author Aguinaldo
 */
public class TelaInicial1 extends javax.swing.JFrame {
    ClickThread m1 = new ClickThread();
    int i = 1;
    int chaveUsuario;
    ActionListener cmd1_clk;
    ArrayList<Personagem> lista = new ArrayList<>();
    Personagem p = new Personagem();
    
    private CardLayout cardLayout;
    private int contador = 0;
    
        
    public TelaInicial1(int l) {
       
        this.chaveUsuario = l;
        initComponents();
        
        this.lista = this.p.mostrarPersonagem();
        if(lista.size()!=0){
            p.setNomeP(lista.get(0).getNomeP());
            MostrarNome.setText(p.getNomeP());
            p.setIdade(lista.get(0).getIdade());
            MostrarIdade.setText(p.getIdade());
            initImage();
        }
       
    }

    
     void initImage(){    
         for(int j = 0; j < lista.size(); j++){
            int s = lista.get(j).corpo.getNumeroO();
            Icon icon = new ImageIcon("src/img/#"+s+".png");
            JLabel label = new JLabel(icon);
 
            
            painelPersonagem.add(label);
        }
            

        //create layout
        cardLayout=new CardLayout();
        painelPersonagem.setLayout(cardLayout);
        
        for (int i = 0; i < lista.size(); i++) {
            cardLayout.next(painelPersonagem);
            
        } 
        
        
        cardLayout.show(painelPersonagem, "src/img/"+p.corpo.getNumeroO()+".png");
       
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        prox = new javax.swing.JButton();
        ant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        painelPersonagem = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        MostrarIdade = new javax.swing.JLabel();
        MostrarNome = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(82, 82, 171));
        jLabel7.setFont(new java.awt.Font("Minecrafter Alt", 3, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 82, 171));
        jLabel7.setText("INATEL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(550, 40, 220, 60);

        jButton1.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(82, 82, 171));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-trash-can-50.png"))); // NOI18N
        jButton1.setText("DELETAR PERSONAGEM");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 260, 270, 50);

        jButton4.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(82, 82, 171));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-purposeful-man-50.png"))); // NOI18N
        jButton4.setText("CRIAR PERSONAGEM");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(470, 140, 260, 60);

        jButton5.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(82, 82, 171));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-female-user-50.png"))); // NOI18N
        jButton5.setText("ALTERAR PERSONAGEM");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(480, 200, 270, 50);

        sair.setBackground(new java.awt.Color(234, 234, 234));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-exit-50.png"))); // NOI18N
        sair.setBorder(null);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair);
        sair.setBounds(730, 0, 40, 40);

        prox.setBackground(new java.awt.Color(234, 234, 234));
        prox.setFont(new java.awt.Font("Minecraft", 1, 16)); // NOI18N
        prox.setForeground(new java.awt.Color(25, 24, 28));
        prox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-move-right-male-50.png"))); // NOI18N
        prox.setText("PROX.");
        prox.setBorder(null);
        prox.setBorderPainted(false);
        prox.setContentAreaFilled(false);
        prox.setFocusPainted(false);
        prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxActionPerformed(evt);
            }
        });
        jPanel1.add(prox);
        prox.setBounds(650, 310, 110, 50);

        ant.setBackground(new java.awt.Color(234, 234, 234));
        ant.setFont(new java.awt.Font("Minecraft", 1, 16)); // NOI18N
        ant.setForeground(new java.awt.Color(25, 24, 28));
        ant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-move-left-female-50.png"))); // NOI18N
        ant.setText("ANT.");
        ant.setBorder(null);
        ant.setBorderPainted(false);
        ant.setContentAreaFilled(false);
        ant.setFocusPainted(false);
        ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antActionPerformed(evt);
            }
        });
        jPanel1.add(ant);
        ant.setBounds(540, 310, 100, 50);

        jLabel1.setFont(new java.awt.Font("Minecraft", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 24, 28));
        jLabel1.setText("Projeto de Java e MySQL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 90, 180, 20);

        jPanel3.setBackground(new java.awt.Color(234, 255, 91));
        jPanel3.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(234, 234, 234));
        jPanel5.setLayout(null);

        painelPersonagem.setOpaque(false);

        javax.swing.GroupLayout painelPersonagemLayout = new javax.swing.GroupLayout(painelPersonagem);
        painelPersonagem.setLayout(painelPersonagemLayout);
        painelPersonagemLayout.setHorizontalGroup(
            painelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        painelPersonagemLayout.setVerticalGroup(
            painelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel5.add(painelPersonagem);
        painelPersonagem.setBounds(0, 40, 180, 290);

        jLabel10.setFont(new java.awt.Font("Minecraft", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 63, 65));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-people-50.png"))); // NOI18N
        jLabel10.setText("Aparencia");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(0, 0, 170, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/19e30add-7434-40f0-a0e0-5bbff8db1a82.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(-50, -10, 300, 360);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(20, 40, 180, 330);

        jPanel6.setBackground(new java.awt.Color(234, 234, 234));
        jPanel6.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Minecraft", 1, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(200, 87, 87));
        jLabel21.setText("Instituicao:");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(0, 160, 120, 20);

        MostrarIdade.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        jPanel6.add(MostrarIdade);
        MostrarIdade.setBounds(0, 130, 170, 30);

        MostrarNome.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        jPanel6.add(MostrarNome);
        MostrarNome.setBounds(0, 90, 160, 20);

        jLabel20.setBackground(new java.awt.Color(200, 87, 87));
        jLabel20.setFont(new java.awt.Font("Minecraft", 1, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(200, 87, 87));
        jLabel20.setText("Personagem:");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(0, 40, 130, 30);

        jLabel17.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(82, 82, 171));
        jLabel17.setText("Curso :");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(0, 270, 60, 20);

        jLabel15.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(82, 82, 171));
        jLabel15.setText("Nome:");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(0, 180, 86, 20);

        jLabel16.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(82, 82, 171));
        jLabel16.setText("Cidade:");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(0, 220, 100, 30);

        jLabel14.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 82, 171));
        jLabel14.setText("Idade:");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(0, 110, 70, 20);

        jLabel13.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(82, 82, 171));
        jLabel13.setText("Nome:");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(0, 70, 60, 20);

        jLabel12.setFont(new java.awt.Font("Minecraft", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 63, 65));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-compose-50.png"))); // NOI18N
        jLabel12.setText("Informacoes");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(10, 0, 200, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/19e30add-7434-40f0-a0e0-5bbff8db1a82.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(-50, 0, 270, 330);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(230, 40, 220, 330);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wpppp.png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 600, 400);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(3, 3, 480, 399);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(488, 403, 599, 262);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c418ea50-7706-4849-b8e8-d3e52e43755c.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, -130, 501, 530);

        jLabel19.setText("jLabel19");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 50, 48, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antActionPerformed
        ClickThread m1 = new ClickThread();
        m1.start();
        for (int i = 0; i < lista.size(); i++) {
            cardLayout.next(painelPersonagem);
            
        } 
        if (i >= lista.size())
            i = 0;
        p = lista.get(i);
        MostrarNome.setText(p.getNomeP());
        MostrarIdade.setText(p.getIdade());
        
        cardLayout.previous(painelPersonagem);
        
        i++;
        
    }//GEN-LAST:event_antActionPerformed

    private void proxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxActionPerformed
        ClickThread m2 = new ClickThread();
        m2.start();
        for (int i = 0; i < lista.size(); i++) {
            cardLayout.next(painelPersonagem);
            
        } 
        if (i >= lista.size())
            i = 0;
        p = lista.get(i);
        MostrarNome.setText(p.getNomeP());
        MostrarIdade.setText(p.getIdade());
        
        cardLayout.next(painelPersonagem);
        
        i++;
    }//GEN-LAST:event_proxActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClickThread m3 = new ClickThread();
        m3.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ClickThread m4 = new ClickThread();
        m4.start();
        TelaPersonagem t5 = new TelaPersonagem(chaveUsuario);
        t5.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ClickThread m5 = new ClickThread();
        m5.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial1(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarIdade;
    private javax.swing.JLabel MostrarNome;
    private javax.swing.JButton ant;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel painelPersonagem;
    private javax.swing.JButton prox;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
