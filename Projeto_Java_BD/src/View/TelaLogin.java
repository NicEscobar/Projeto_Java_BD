/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import projeto_java_bd.Usuario;

/**
 *
 * @author Aguinaldo
 */
public class TelaLogin extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        txtLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(82, 82, 171));
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setBorder(null);
        txtLogin.setCaretColor(new java.awt.Color(69, 73, 74));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanel1.add(txtLogin);
        txtLogin.setBounds(500, 165, 260, 30);

        txtSenha.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(82, 82, 171));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSenha.setBorder(null);
        jPanel1.add(txtSenha);
        txtSenha.setBounds(500, 222, 260, 30);

        entrar.setBackground(new java.awt.Color(0, 51, 153));
        entrar.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        entrar.setForeground(new java.awt.Color(51, 51, 51));
        entrar.setText("ENTRAR");
        entrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        entrar.setContentAreaFilled(false);
        entrar.setFocusPainted(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar);
        entrar.setBounds(560, 262, 150, 40);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 82, 171));
        jLabel3.setText("SENHA:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 202, 60, 17);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 82, 171));
        jLabel4.setText("EMAIL:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 141, 61, 24);

        cadastro.setBackground(new java.awt.Color(234, 234, 234));
        cadastro.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        cadastro.setForeground(new java.awt.Color(153, 0, 0));
        cadastro.setText("Ou clique aqui para cadastrar !");
        cadastro.setBorder(null);
        cadastro.setBorderPainted(false);
        cadastro.setContentAreaFilled(false);
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });
        jPanel1.add(cadastro);
        cadastro.setBounds(510, 290, 250, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wpppp.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(3, 3, 479, 398);

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fonte (1)1.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(530, 40, 220, 41);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 24, 28));
        jLabel1.setText("Projeto de Java e MySQL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(550, 90, 170, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c418ea50-7706-4849-b8e8-d3e52e43755c.jpg"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(431, -130, 550, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        TelaCadastro1 t2 = new TelaCadastro1();
        t2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastroActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed

        Usuario usuario = new Usuario();
        boolean acheiUsuario = false;
        String loginTela = txtLogin.getText();
        String senhaTela = txtSenha.getText();
        
        acheiUsuario = usuario.verificacaoUsuario(loginTela,senhaTela);
        
        int chaveUsuario = usuario.buscarUsuario(loginTela);

        if(acheiUsuario){
            TelaInicial1 t3 = new TelaInicial1(chaveUsuario);
            t3.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Acesso Negado");
            txtLogin.setText("");
            txtSenha.setText("");
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed

    }//GEN-LAST:event_txtLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastro;
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
