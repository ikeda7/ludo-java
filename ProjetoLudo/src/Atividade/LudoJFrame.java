/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Atividade;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lukin
 */
public class LudoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LudoJFrame
     */
    public LudoJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonRolarDado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaJogadas = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuConectar = new javax.swing.JMenu();
        jMenuItemHost = new javax.swing.JMenuItem();
        jMenuItemConectar = new javax.swing.JMenuItem();
        jMenuItemRegras = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRolarDado.setText("Rolar Dado");
        jButtonRolarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRolarDadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRolarDado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRolarDado)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextAreaJogadas.setEditable(false);
        jTextAreaJogadas.setColumns(20);
        jTextAreaJogadas.setRows(5);
        jTextAreaJogadas.setText("Jogadas:\n");
        jTextAreaJogadas.setFocusable(false);
        jScrollPane1.setViewportView(jTextAreaJogadas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuConectar.setText("Jogar");

        jMenuItemHost.setText("Ser Host");
        jMenuItemHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHostActionPerformed(evt);
            }
        });
        jMenuConectar.add(jMenuItemHost);

        jMenuItemConectar.setText("Conectar");
        jMenuItemConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConectarActionPerformed(evt);
            }
        });
        jMenuConectar.add(jMenuItemConectar);

        jMenuBar1.add(jMenuConectar);

        jMenuItemRegras.setText("Regras");
        jMenuItemRegras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegrasActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Ver Regras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItemRegras.add(jMenuItem1);

        jMenuBar1.add(jMenuItemRegras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegrasActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemRegrasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Objetivo do jogo\n" +
"Percorrer o trajeto do tabuleiro com todas as peças e ser o primeiro jogador a chegar a casa central.\n" +
"Regras\n" +
"Para se iniciar a partida, joga-se o dado e o participante que fizer o maior número de pontos inicia o\n" +
"jogo, continuando as jogadas em sentido horário.\n" +
"Joga-se com um dado e os avanços são feitos de acordo com os pontos obtidos com o lançamento\n" +
"dos dados.\n" +
"Cada jogador lança o dado e se tirar “ 1” ou “6” poderá sair da casa de partida, sendo que, ao tirar\n" +
"“6” você tem o direito de jogar o dado novamente.\n" +
"Pode ser jogado por 2, 3 ou 4 jogadores (no caso de 4, é possível formar 2 duplas). O tabuleiro\n" +
"quadrado tem um percurso em forma de cruz e cada jogador tem quatro peões. Um dado define os\n" +
"movimentos.\n" +
"Os peões de cada jogador começam na base de mesma cor. O objetivo do jogo é ser o primeiro a\n" +
"levar seus 4 peões a dar uma volta no tabuleiro e a chegar no ponto final marcado com sua cor. Os\n" +
"peões movem-se pelo percurso no sentido horário.\n" +
"Para transportar um peão de sua base para seu ponto de partida é necessário tirar 6. Quando o\n" +
"jogador já tem pelo menos um peão no percurso, ele pode mover o peão do número de casas tirado\n" +
"no dado. Se tirar 6, além de usar esse resultado ele pode jogar novamente o dado.\n" +
"Se um jogador chegar a uma casa já ocupada por um peão adversário, o peão adversário deve\n" +
"voltar para sua base. Mas se 2 peões da mesma cor ocuparem uma mesma casa, eles não podem\n" +
"ser capturados e nenhum adversário pode passar por essa casa, tendo seus peões bloqueados.\n" +
"Após dar a volta no tabuleiro o peão avança pela reta final, de sua própria cor. A chegada ao ponto\n" +
"final só pode ser obtida por um número exato nos dados. Se o jogador tirar mais do que o\n" +
"necessário, ele vai até o fim e volta, tendo que aguardar sua próxima jogada. O vencedor é o\n" +
"primeiro a levar seus quatro peões ao ponto de chegada da sua cor.\n", "Regras Ludo", -1);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHostActionPerformed
        // TODO add your handling code here:
        InetAddress localHost;
        try {
            localHost = InetAddress. getLocalHost();
            String ip = localHost.getHostAddress();
            JOptionPane.showMessageDialog(rootPane, "Seu endereço IP: " + ip, "Endereço IP", -1);
        } catch (UnknownHostException ex) {
            Logger.getLogger(LudoJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao obter o endereço IP", "Erro - IP", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenuItemHostActionPerformed

    private void jMenuItemConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConectarActionPerformed
        // TODO add your handling code here:
        String ip = JOptionPane.showInputDialog(rootPane, "Digite um endereço IP para se conectar");
        try {
            InetAddress ipConectar = InetAddress.getByName(ip);
        } catch (UnknownHostException ex) {
            Logger.getLogger(LudoJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemConectarActionPerformed

    private void jButtonRolarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRolarDadoActionPerformed
        // TODO add your handling code here:
        Jogo jogo = new Jogo();
        jTextAreaJogadas.setText(jTextAreaJogadas.getText() + "Rolagem do dado: " + jogo.jogar() + "\n");
    }//GEN-LAST:event_jButtonRolarDadoActionPerformed

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
            java.util.logging.Logger.getLogger(LudoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LudoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LudoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LudoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LudoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRolarDado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConectar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemConectar;
    private javax.swing.JMenuItem jMenuItemHost;
    private javax.swing.JMenu jMenuItemRegras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaJogadas;
    // End of variables declaration//GEN-END:variables
}
