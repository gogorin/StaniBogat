/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stanibogat1;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;





/**
 *
 * @author mac
 */
public class Register extends javax.swing.JFrame{

    /**
     * Creates new form REGISTER
     */
    
    public Register() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        notlbl.setVisible(false);
        setTitle("REGISTRATION");
        expressionlbl.setVisible(false);
        expressionlbl1.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpnl = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtfldusername = new javax.swing.JTextField();
        btnregisternow = new javax.swing.JButton();
        notlbl = new javax.swing.JLabel();
        pswrdfldregister = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        lblminimise = new javax.swing.JLabel();
        lblregister1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblgoback = new javax.swing.JLabel();
        expressionlbl = new javax.swing.JLabel();
        expressionlbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainpnl.setBackground(new java.awt.Color(51, 51, 255));

        lblusername.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Потребителско име :");

        lblpassword.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Парола :");

        txtfldusername.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        btnregisternow.setBackground(new java.awt.Color(0, 153, 255));
        btnregisternow.setFont(new java.awt.Font("Al Nile", 1, 14)); // NOI18N
        btnregisternow.setForeground(new java.awt.Color(255, 255, 255));
        btnregisternow.setText("Регистрирай се сега");
        btnregisternow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregisternow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisternowActionPerformed(evt);
            }
        });

        notlbl.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        notlbl.setForeground(new java.awt.Color(255, 255, 255));
        notlbl.setText("Потребителското име вече е заето");

        pswrdfldregister.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        lblminimise.setFont(new java.awt.Font("Apple Braille", 2, 24)); // NOI18N
        lblminimise.setForeground(new java.awt.Color(255, 255, 255));
        lblminimise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblminimise.setText("-");
        lblminimise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimiseMouseClicked(evt);
            }
        });

        lblregister1.setFont(new java.awt.Font("Apple Braille", 2, 24)); // NOI18N
        lblregister1.setForeground(new java.awt.Color(255, 255, 255));
        lblregister1.setText("Регистрация");

        lblclose.setFont(new java.awt.Font("Apple Braille", 2, 24)); // NOI18N
        lblclose.setForeground(new java.awt.Color(255, 255, 255));
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("X");
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        lblgoback.setFont(new java.awt.Font("Apple Braille", 2, 24)); // NOI18N
        lblgoback.setForeground(new java.awt.Color(255, 255, 255));
        lblgoback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblgoback.setText("<-");
        lblgoback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblgobackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgoback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblminimise, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblregister1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblminimise, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgoback, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        expressionlbl.setFont(new java.awt.Font("Al Nile", 1, 14)); // NOI18N
        expressionlbl.setForeground(new java.awt.Color(255, 255, 255));
        expressionlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expressionlbl.setText("Потребителското име трябва да съдържа само букви и цифри и трябва да е максимум 10 символа.");

        expressionlbl1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        expressionlbl1.setForeground(new java.awt.Color(255, 255, 255));
        expressionlbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expressionlbl1.setText("Паролата трябва да е максимум 10 символа");

        javax.swing.GroupLayout mainpnlLayout = new javax.swing.GroupLayout(mainpnl);
        mainpnl.setLayout(mainpnlLayout);
        mainpnlLayout.setHorizontalGroup(
            mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainpnlLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(notlbl)
                    .addGroup(mainpnlLayout.createSequentialGroup()
                        .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpassword)
                            .addComponent(lblusername))
                        .addGap(18, 18, 18)
                        .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfldusername, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(pswrdfldregister)))
                    .addComponent(btnregisternow, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(expressionlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mainpnlLayout.createSequentialGroup()
                .addComponent(expressionlbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainpnlLayout.setVerticalGroup(
            mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpnlLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(notlbl)
                .addGap(39, 39, 39)
                .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfldusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername))
                .addGap(33, 33, 33)
                .addGroup(mainpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpassword)
                    .addComponent(pswrdfldregister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnregisternow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expressionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expressionlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisternowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisternowActionPerformed
        // TODO add your handling code here:
        int delay=3000;
        User obj;
        Ranklistuser object;
        try
        {
            obj=new User(txtfldusername.getText(),pswrdfldregister.getText());
            object=new Ranklistuser(txtfldusername.getText(), 0);
        }
        catch (RuntimeException Empty)
        {
        
            expressionlbl.setVisible(true);
            expressionlbl1.setVisible(true);
            return;
        }
        
        FileWorker obj1=new FileWorker();
       
        try {
            if(obj1.checkIfMatchRegister(obj)==false){
                notlbl.setVisible(true);
                ActionListener taskperformer=new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        notlbl.setVisible(false);
                        
                    }
                };
                new javax.swing.Timer(delay, taskperformer).start();
                
            }
            else{
                try {
                    obj1.setinfotoFiles(obj,object);
                    dispose();
                    new Login().setVisible(true);
                    
                    
                    
                }
                catch (IOException | RuntimeException e) {
                    
                }
                
            } 
        } catch (IOException ex) {
            
        }
                
    }//GEN-LAST:event_btnregisternowActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminimiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimiseMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminimiseMouseClicked

    private void lblgobackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgobackMouseClicked

        dispose();
      new Login().setVisible(true);
      
    }//GEN-LAST:event_lblgobackMouseClicked

    public static void Run() {
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregisternow;
    private javax.swing.JLabel expressionlbl;
    private javax.swing.JLabel expressionlbl1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblgoback;
    private javax.swing.JLabel lblminimise;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblregister1;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel mainpnl;
    private javax.swing.JLabel notlbl;
    private javax.swing.JPasswordField pswrdfldregister;
    private javax.swing.JTextField txtfldusername;
    // End of variables declaration//GEN-END:variables
}
