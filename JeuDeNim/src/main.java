/*///////////////////////////////////////////////////////////////////////////*/
/*                                                                           */
/*  Cirill Ferrier                   /\       | |            /\        | |   */
/*                                  /  \   ___| |__   ___   /  \   _ __| |_  */
/*  07/12/2017                     / /\ \ / __| '_ \ / _ \ / /\ \ | '__| __| */
/*  Cirill@asheart.fr             / ____ \\__ \ | | |  __// ____ \| |  | |_  */
/*  www.AsheArt.fr               /_/    \_\___/_| |_|\___/_/    \_\_|   \__| */
/*                                                                           */
/*///////////////////////////////////////////////////////////////////////////*/
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    
    public main() {
        this.setTitle("Jeu de Nim"); 
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btn2jma = new javax.swing.JButton();
        btn2jms = new javax.swing.JButton();
        btn1jms = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btn_rs = new javax.swing.JMenuItem();
        btn_ra = new javax.swing.JMenuItem();
        btn_astuce = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        btn_histoire = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Jeu de Nim");

        btn2jma.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btn2jma.setText("2 Joueur : Mode Avancé");
        btn2jma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2jmaMouseClicked(evt);
            }
        });

        btn2jms.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btn2jms.setText("2 Joueur : Mode Simple");
        btn2jms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2jmsMouseClicked(evt);
            }
        });

        btn1jms.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btn1jms.setText("1 Joueur : Mode Simple");
        btn1jms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1jmsMouseClicked(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/open-book.png"))); // NOI18N
        jMenu3.setText("Règle du jeu     ");
        jMenu3.add(jSeparator1);

        btn_rs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_rs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/open-book.png"))); // NOI18N
        btn_rs.setText("Mode Simple");
        btn_rs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rsActionPerformed(evt);
            }
        });
        jMenu3.add(btn_rs);

        btn_ra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_ra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/open-book.png"))); // NOI18N
        btn_ra.setText("Mode Avancer");
        jMenu3.add(btn_ra);

        jMenuBar1.add(jMenu3);

        btn_astuce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/elemental-tip.png"))); // NOI18N
        btn_astuce.setText("Astuce     ");
        btn_astuce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_astuceMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_astuce);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/question-mark.png"))); // NOI18N
        jMenu7.setText("À propos");

        btn_histoire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_histoire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/wikipedia-logo.png"))); // NOI18N
        btn_histoire.setText("Page Wiki");
        btn_histoire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_histoireActionPerformed(evt);
            }
        });
        jMenu7.add(btn_histoire);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/user.png"))); // NOI18N
        jMenuItem8.setText("Ferrier Cirill");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/gamepad-console.png"))); // NOI18N
        jMenuItem7.setText("Autre Jeu");
        jMenu7.add(jMenuItem7);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/code.png"))); // NOI18N
        jMenu4.setText("Code Source");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/github-sign.png"))); // NOI18N
        jMenuItem4.setText("GitHub");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/code.png"))); // NOI18N
        jMenuItem5.setText("AsheArt Code");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenu7.add(jMenu4);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2jms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2jma, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(btn1jms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btn2jms, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn2jma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn1jms, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2jmsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2jmsMouseClicked
        F2Jms f = new F2Jms();
        f.setVisible(true);
    }//GEN-LAST:event_btn2jmsMouseClicked

    private void btn_histoireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_histoireActionPerformed
        URI uri = URI.create("https://fr.wikipedia.org/wiki/Jeux_de_Nim");
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_histoireActionPerformed

    private void btn2jmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2jmaMouseClicked
        F2Jma f = new F2Jma();
        f.setVisible(true);
    }//GEN-LAST:event_btn2jmaMouseClicked

    private void btn1jmsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1jmsMouseClicked
        F1Jms f = new F1Jms();
        f.setVisible(true);
    }//GEN-LAST:event_btn1jmsMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        URI uri = URI.create("https://github.com/FerrierCirill/Jeu-De-Nim");
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_astuceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_astuceMouseClicked
        astuce f = new astuce();
        f.setVisible(true);
    }//GEN-LAST:event_btn_astuceMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        cirill f = new cirill();
        f.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btn_rsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rsActionPerformed
        regleSimple f = new regleSimple();
        f.setVisible(true);

    }//GEN-LAST:event_btn_rsActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        URI uri = URI.create("https://asheart.fr/code");
        try {
            Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1jms;
    private javax.swing.JButton btn2jma;
    private javax.swing.JButton btn2jms;
    private javax.swing.JMenu btn_astuce;
    private javax.swing.JMenuItem btn_histoire;
    private javax.swing.JMenuItem btn_ra;
    private javax.swing.JMenuItem btn_rs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
