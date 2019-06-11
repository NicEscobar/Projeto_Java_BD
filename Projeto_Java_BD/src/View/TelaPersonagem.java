/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import projeto_java_bd.Personagem;
import projeto_java_bd.Corpo;
import projeto_java_bd.Instituto;
import projeto_java_bd.Instituto_Has_Personagem;
import projeto_java_bd.Objeto;


/**
 *
 * @author Aguinaldo
 */
public class TelaPersonagem extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private CardLayout cardLayout1;
    private int contador = 0;
    private List<Corpo> listaCorpos = new ArrayList<>();
    private List<Objeto> listaComp = new ArrayList<>();
    Personagem personagem = new Personagem();

    Instituto_Has_Personagem ip = new Instituto_Has_Personagem();
    
    int chaveUsuario;
    
    public TelaPersonagem(int l) {
       
        this.chaveUsuario = l;
        initComponents();
        initImage();
        initComponent();
    }

    void initImage(){    
            
        String[] filesName = {"#1.png","#2.png","#3.png","#4.png","#5.png","#6.png",
        "#7.png","#8.png","#9.png","#10.png","#11.png","#12.png","#13.png",
        "#14.png","#15.png","#16.png","#17.png","#18.png","#19.png","#20.png",
        "#21.png","#22.png","#23.png","#24.png","#25.png",
        "#26.png","#27.png","#28.png","#29.png","#30.png","#31.png",
        "#32.png"};
        
        for(String s : filesName){
            
            Icon icon = new ImageIcon("src/img/"+s);
            JLabel label = new JLabel(icon);
            
            Corpo corpo = new Corpo();
            // adicionar informações ao corpo
            
            listaCorpos.add(corpo);
            
            mainPanel.add(label);
        }
        //create layout
        cardLayout=new CardLayout();
        mainPanel.setLayout(cardLayout);
        
        for (int i = 0; i < listaCorpos.size(); i++) {
            cardLayout.next(mainPanel);
            
        }        
    }
    void initComponent(){
        //Componentes
        String[] filesName1 = {"C1.png","C2.png","C3.png","C4.png"};
        
        for(String s : filesName1){
            
            Icon icon1 = new ImageIcon("src/Componentes/"+s);
            JLabel label1 = new JLabel(icon1);
            Objeto comp = new Objeto();
            listaComp.add(comp);
            PainelComponente.add(label1);
        }
        //create layout
        cardLayout1=new CardLayout();
        PainelComponente.setLayout(cardLayout1);
        for (int i = 0; i < listaComp.size(); i++) {
            cardLayout1.next(PainelComponente);
            
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        sair = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious1 = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PainelComponente = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        nomeInstituto = new javax.swing.JTextField();
        nomePer = new javax.swing.JTextField();
        cidadeInstituto = new javax.swing.JTextField();
        cursoInstituto = new javax.swing.JTextField();
        idadePer = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        criar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criação de Personagem");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

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

        btnNext.setBackground(new java.awt.Color(234, 234, 234));
        btnNext.setFont(new java.awt.Font("Minecraft", 1, 16)); // NOI18N
        btnNext.setForeground(new java.awt.Color(25, 24, 28));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-move-right-male-50.png"))); // NOI18N
        btnNext.setText("PROX.");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setContentAreaFilled(false);
        btnNext.setFocusPainted(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext);
        btnNext.setBounds(650, 150, 110, 50);

        btnPrevious1.setBackground(new java.awt.Color(234, 234, 234));
        btnPrevious1.setFont(new java.awt.Font("Minecraft", 1, 16)); // NOI18N
        btnPrevious1.setForeground(new java.awt.Color(25, 24, 28));
        btnPrevious1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-move-left-female-50.png"))); // NOI18N
        btnPrevious1.setText("ANT.");
        btnPrevious1.setBorder(null);
        btnPrevious1.setBorderPainted(false);
        btnPrevious1.setContentAreaFilled(false);
        btnPrevious1.setFocusPainted(false);
        btnPrevious1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious1);
        btnPrevious1.setBounds(540, 260, 100, 50);

        btnPrevious.setBackground(new java.awt.Color(234, 234, 234));
        btnPrevious.setFont(new java.awt.Font("Minecraft", 1, 16)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(25, 24, 28));
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-move-left-female-50.png"))); // NOI18N
        btnPrevious.setText("ANT.");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setContentAreaFilled(false);
        btnPrevious.setFocusPainted(false);
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious);
        btnPrevious.setBounds(540, 150, 100, 50);

        btnNext1.setBackground(new java.awt.Color(234, 234, 234));
        btnNext1.setFont(new java.awt.Font("Minecraft", 1, 16)); // NOI18N
        btnNext1.setForeground(new java.awt.Color(25, 24, 28));
        btnNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-move-right-male-50.png"))); // NOI18N
        btnNext1.setText("PROX.");
        btnNext1.setBorder(null);
        btnNext1.setBorderPainted(false);
        btnNext1.setContentAreaFilled(false);
        btnNext1.setFocusPainted(false);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext1);
        btnNext1.setBounds(650, 260, 110, 50);

        jLabel1.setFont(new java.awt.Font("Minecraft", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 24, 28));
        jLabel1.setText("Projeto de Java e MySQL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(550, 90, 180, 20);

        jPanel3.setBackground(new java.awt.Color(234, 255, 91));
        jPanel3.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(234, 234, 234));
        jPanel5.setLayout(null);

        PainelComponente.setOpaque(false);

        javax.swing.GroupLayout PainelComponenteLayout = new javax.swing.GroupLayout(PainelComponente);
        PainelComponente.setLayout(PainelComponenteLayout);
        PainelComponenteLayout.setHorizontalGroup(
            PainelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PainelComponenteLayout.setVerticalGroup(
            PainelComponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel5.add(PainelComponente);
        PainelComponente.setBounds(100, 250, 80, 80);

        mainPanel.setOpaque(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel5.add(mainPanel);
        mainPanel.setBounds(0, 50, 180, 280);

        jLabel10.setFont(new java.awt.Font("Minecraft", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 63, 65));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-people-50.png"))); // NOI18N
        jLabel10.setText("Aparencia");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(0, 0, 180, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/19e30add-7434-40f0-a0e0-5bbff8db1a82.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(-40, -10, 300, 360);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(20, 40, 180, 330);

        jPanel6.setBackground(new java.awt.Color(234, 234, 234));
        jPanel6.setLayout(null);

        nomeInstituto.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        nomeInstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInstitutoActionPerformed(evt);
            }
        });
        jPanel6.add(nomeInstituto);
        nomeInstituto.setBounds(0, 200, 220, 22);

        nomePer.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        nomePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomePerActionPerformed(evt);
            }
        });
        jPanel6.add(nomePer);
        nomePer.setBounds(0, 90, 220, 20);

        cidadeInstituto.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        cidadeInstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeInstitutoActionPerformed(evt);
            }
        });
        jPanel6.add(cidadeInstituto);
        cidadeInstituto.setBounds(0, 242, 220, 30);

        cursoInstituto.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        cursoInstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursoInstitutoActionPerformed(evt);
            }
        });
        jPanel6.add(cursoInstituto);
        cursoInstituto.setBounds(0, 292, 220, 30);

        idadePer.setFont(new java.awt.Font("Minecraft", 1, 12)); // NOI18N
        idadePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadePerActionPerformed(evt);
            }
        });
        jPanel6.add(idadePer);
        idadePer.setBounds(0, 130, 220, 30);

        jLabel21.setFont(new java.awt.Font("Minecraft", 1, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(200, 87, 87));
        jLabel21.setText("Instituicao:");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(0, 160, 120, 20);

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
        jLabel17.setBounds(0, 270, 60, 30);

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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(3, 3, 480, 398);

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

        jLabel5.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 24, 28));
        jLabel5.setText("Aparencia:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(550, 120, 180, 20);

        jLabel4.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 24, 28));
        jLabel4.setText("Componente Favorito:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 234, 180, 20);

        jLabel7.setBackground(new java.awt.Color(82, 82, 171));
        jLabel7.setFont(new java.awt.Font("Minecrafter Alt", 3, 53)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 82, 171));
        jLabel7.setText("INATEL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(542, 40, 218, 60);

        criar.setFont(new java.awt.Font("Minecraft", 1, 14)); // NOI18N
        criar.setForeground(new java.awt.Color(82, 82, 171));
        criar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-purposeful-man-50.png"))); // NOI18N
        criar.setText("CRIAR PERSONAGEM");
        criar.setBorder(null);
        criar.setBorderPainted(false);
        criar.setContentAreaFilled(false);
        criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarActionPerformed(evt);
            }
        });
        jPanel1.add(criar);
        criar.setBounds(530, 310, 250, 60);

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

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed

         ClickThread m1 = new ClickThread();
         m1.start();    
         cardLayout.previous(mainPanel);
         contador--;
        if(contador < 0)
           contador = 31;

    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        AudioInputStream inputStream;
        ClickThread m2 = new ClickThread();
        m2.start();
        cardLayout.next(mainPanel);
        contador++;
        if(contador > listaCorpos.size())
           contador = 0;
       
    }//GEN-LAST:event_btnNextActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        ClickThread m3 = new ClickThread();
        m3.start();
        TelaLogin t1 = new TelaLogin();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void nomePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomePerActionPerformed
        
        
        
    }//GEN-LAST:event_nomePerActionPerformed

    private void idadePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadePerActionPerformed
        
    }//GEN-LAST:event_idadePerActionPerformed

    private void nomeInstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInstitutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInstitutoActionPerformed

    private void cidadeInstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeInstitutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeInstitutoActionPerformed

    private void cursoInstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursoInstitutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cursoInstitutoActionPerformed

    private void criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarActionPerformed
        ClickThread m4 = new ClickThread();
        m4.start();     
        //Objeto para guardar o corpo escolhido
        Corpo corpoEscolhido = listaCorpos.get(contador);
        
        boolean sucesso = false;
        
        Personagem personagem = new Personagem();
        Instituto instituto = new Instituto();

            
            personagem.corpo.setNumeroO(contador);
            personagem.corpo.inserirCorpo(contador);
            
            personagem.setNomeP(nomePer.getText());
            personagem.setIdade(idadePer.getText());

            personagem.setIdUsuario_Per(chaveUsuario);
            
            instituto.setNomeInst(nomeInstituto.getText());
            instituto.setCidade(cidadeInstituto.getText());
            instituto.setCursoInst(cursoInstituto.getText());
            
            personagem.inserirPersonagem(personagem);
            instituto.InserirInstituto(instituto);
            ip.inserirIHasP();
            
            
            TelaInicial1 t3 = new TelaInicial1(chaveUsuario);
            t3.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_criarActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
        cardLayout1.next(PainelComponente);
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnPrevious1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious1ActionPerformed
        // TODO add your handling code here:
        cardLayout1.previous(PainelComponente);
    }//GEN-LAST:event_btnPrevious1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaPersonagem(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelComponente;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPrevious1;
    private javax.swing.JTextField cidadeInstituto;
    private javax.swing.JButton criar;
    private javax.swing.JTextField cursoInstituto;
    private javax.swing.JTextField idadePer;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nomeInstituto;
    private javax.swing.JTextField nomePer;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
