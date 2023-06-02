/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stanibogat1;

import javax.swing.ImageIcon;

/**
 *
 * @author georgisa
 */
public class StartGamePanel extends javax.swing.JFrame {

    /**
     * Creates new form StartGamePanel
     */
    public StartGamePanel() {
        initComponents();
        setLocationRelativeTo(null);
     
 // MihsilBlbl.setIcon(new ImageIcon("\StaniBogat1\src\Images\MihailB.png"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mianpnl = new javax.swing.JPanel();
        MihsilBlbl = new javax.swing.JLabel();
        Коиискалбл = new javax.swing.JLabel();
        Logolbl = new javax.swing.JLabel();
        PLaybtn = new javax.swing.JButton();
        ranklistbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mianpnl.setBackground(new java.awt.Color(105, 131, 198));

        MihsilBlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MihailB.png"))); // NOI18N

        Коиискалбл.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        Коиискалбл.setText("\"КОЙ ИСКА ДА СТАНЕ БОГАТ\"");

        Logolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        PLaybtn.setBackground(new java.awt.Color(0, 0, 102));
        PLaybtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        PLaybtn.setForeground(new java.awt.Color(204, 204, 204));
        PLaybtn.setText("ИГРАЙ");

        ranklistbtn.setBackground(new java.awt.Color(0, 0, 102));
        ranklistbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ranklistbtn.setForeground(new java.awt.Color(204, 204, 204));
        ranklistbtn.setText("Класиране");
        ranklistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ranklistbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mianpnlLayout = new javax.swing.GroupLayout(mianpnl);
        mianpnl.setLayout(mianpnlLayout);
        mianpnlLayout.setHorizontalGroup(
            mianpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mianpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mianpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mianpnlLayout.createSequentialGroup()
                        .addComponent(Logolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(PLaybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mianpnlLayout.createSequentialGroup()
                        .addComponent(MihsilBlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(mianpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mianpnlLayout.createSequentialGroup()
                                .addComponent(Коиискалбл, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mianpnlLayout.createSequentialGroup()
                                .addComponent(ranklistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))))
        );
        mianpnlLayout.setVerticalGroup(
            mianpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mianpnlLayout.createSequentialGroup()
                .addGroup(mianpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mianpnlLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(MihsilBlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mianpnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ranklistbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Коиискалбл, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(PLaybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mianpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mianpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ranklistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ranklistbtnActionPerformed
        dispose();
        new Ranklist().setVisible(true);
    }//GEN-LAST:event_ranklistbtnActionPerformed

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
            java.util.logging.Logger.getLogger(StartGamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logolbl;
    private javax.swing.JLabel MihsilBlbl;
    private javax.swing.JButton PLaybtn;
    private javax.swing.JPanel mianpnl;
    private javax.swing.JButton ranklistbtn;
    private javax.swing.JLabel Коиискалбл;
    // End of variables declaration//GEN-END:variables
}
