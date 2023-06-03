/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stanibogat1;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class MainScreen extends javax.swing.JFrame {

    public MainScreen() {
        initComponents();
        setLocationRelativeTo(null);
        Stack<Questions> stack=fillStack();
        obj=stack.pop();
        lblA.setText(obj.getWrong1());
        lblB.setText(obj.getWrong2());
        lblC.setText(obj.getAnswer());
        lblD.setText(obj.getWrong3());
        questionlbl.setText(obj.getQuestion());
        arr = new JLabel[4];
        arr[0] = lblA;
        arr[1] = lblB;
        arr[2] = lblC;
        arr[3] = lblD;
    }
    
    private Stack<Questions> stack;
    private Questions obj;
    private JLabel[] arr;  
    private int points;
    private int questionnumber;
    private LinkedList<Questions> list1;
    private LinkedList<Questions> list2;
    private LinkedList<Questions> list3;
     
     
     
     
     protected Questions randQuestion(int difficulty) 
    {
        list1=new LinkedList<>();
        Random rand = new Random();
        if (difficulty == 1) 
        {
            int k = rand.nextInt(list1.size());
            Questions qu;
            qu = list1.get(k);
            list1.remove(k);
            return qu;
        } 
        else if (difficulty == 2) 
        {
            int k = rand.nextInt(list2.size());
            Questions qu;
            qu = list2.get(k);
            list2.remove(k);
            return qu;
        } 
        else 
        {   
            int k = rand.nextInt(list3.size());
            Questions qu;
            qu = list3.get(k);
            list3.remove(k);
            return qu;
        }
    }
    
    

    protected Stack fillStack()
    {
        if(stack.size()==15)
        {
            return stack;
        }
        else if(stack.size()<5)
        {
            stack.push(randQuestion(1));
            return fillStack();
        }
        else if(stack.size()>5 && stack.size()<10)
        {
            stack.push(randQuestion(2));
            return fillStack();
        }
        else 
        {
            stack.push(randQuestion(3));
             return fillStack();
        }
       
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getQuestionnumber() {
        return questionnumber;
    }

    public void setQuestionnumber(int questionnumber) {
        this.questionnumber = questionnumber;
    }
    
    

    public void SetnewQuestion(LinkedList<String> listrandom,int i){
      if(listrandom.size()==0){
          return;
      }
      else{
          Random ran=new Random();
          int ind=ran.nextInt(listrandom.size());
          arr[i].setText(listrandom.get(ind));
          listrandom.remove(ind);
          SetnewQuestion(listrandom, i+1);
      }
        
        
        
    }
    
    public LinkedList<String> generateEachQuestioon(){
        LinkedList<String> list=new LinkedList<>();
            list.add(obj.getAnswer());
            list.add(obj.getWrong1());
            list.add(obj.getWrong2());
            list.add(obj.getWrong3());
            return list;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnpnl = new javax.swing.JPanel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        questionlbl = new javax.swing.JLabel();
        lblPoints = new javax.swing.JLabel();
        lbl5050 = new javax.swing.JLabel();
        lblphoneafriend = new javax.swing.JLabel();
        lblstopgame = new javax.swing.JLabel();
        lblaudience = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAMouseClicked(evt);
            }
        });
        mnpnl.add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, 20));

        lblB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBMouseClicked(evt);
            }
        });
        mnpnl.add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 140, 20));

        lblC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCMouseClicked(evt);
            }
        });
        mnpnl.add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, 20));

        lblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDMouseClicked(evt);
            }
        });
        mnpnl.add(lblD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 140, 20));

        questionlbl.setForeground(new java.awt.Color(255, 255, 255));
        mnpnl.add(questionlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 340, 40));
        mnpnl.add(lblPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 160, 40));

        lbl5050.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5050MouseClicked(evt);
            }
        });
        mnpnl.add(lbl5050, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 50, 20));

        lblphoneafriend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblphoneafriendMouseClicked(evt);
            }
        });
        mnpnl.add(lblphoneafriend, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 20));
        mnpnl.add(lblstopgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 20));

        lblaudience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblaudienceMouseClicked(evt);
            }
        });
        mnpnl.add(lblaudience, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MicrosoftTeams-image.png"))); // NOI18N
        mnpnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAMouseClicked
        // TODO add your handling code here:
        
         
        if (stack.size()==0){
            try {
                new Goodgamescreen().setVisible(true);
            } catch (IOException ex) {
                
            }
        }
       if(lblA.getText().equals(obj.getAnswer())){
            obj=stack.pop();
            LinkedList<String> list=generateEachQuestioon();
            lblPoints.setText(getQuestionnumber()+" : "+getPoints());
            questionlbl.setText(obj.getQuestion());
            SetnewQuestion(list,0);
            
            
       }
       else{
           dispose();
           new Gameoverscreen().setVisible(true);
       }
    }//GEN-LAST:event_lblAMouseClicked

    private void lblBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBMouseClicked
        // TODO add your handling code here:
        if (stack.size()==0){
            try {
                new Goodgamescreen().setVisible(true);
            } catch (IOException ex) {
                
            }
        }
       if(lblB.getText().equals(obj.getAnswer())){
            obj=stack.pop();
            LinkedList<String> list=generateEachQuestioon();
            lblPoints.setText(getQuestionnumber()+" : "+getPoints());
            questionlbl.setText(obj.getQuestion());
            SetnewQuestion(list,0);
            
            
       }
       else{
           dispose();
           new Gameoverscreen().setVisible(true);
       }
    }//GEN-LAST:event_lblBMouseClicked

    private void lblCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCMouseClicked
        // TODO add your handling code here:
        if (stack.size()==0){
            try {
                new Goodgamescreen().setVisible(true);
            } catch (IOException ex) {
                
            }
        }
       if(lblC.getText().equals(obj.getAnswer())){
            obj=stack.pop();
            LinkedList<String> list=generateEachQuestioon();
            lblPoints.setText(getQuestionnumber()+" : "+getPoints());
            questionlbl.setText(obj.getQuestion());
            SetnewQuestion(list,0);
            
            
       }
       else{
           dispose();
           new Gameoverscreen().setVisible(true);
       }
    }//GEN-LAST:event_lblCMouseClicked

    private void lblDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDMouseClicked
        // TODO add your handling code here:
        if (stack.size()==0){
            try {
                new Goodgamescreen().setVisible(true);
            } catch (IOException ex) {
                
            }
        }
       if(lblD.getText().equals(obj.getAnswer())){
            obj=stack.pop();
            LinkedList<String> list=generateEachQuestioon();
            lblPoints.setText(getQuestionnumber()+" : "+getPoints());
            questionlbl.setText(obj.getQuestion());
            SetnewQuestion(list,0);
            
            
       }
       else{
           dispose();
           new Gameoverscreen().setVisible(true);
       }
    }//GEN-LAST:event_lblDMouseClicked

    private void lbl5050MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5050MouseClicked
        // TODO add your handling code here:
        Questionsgeneratorclass q=new Questionsgeneratorclass();
        int i=0;
        q.Joker5050(arr,i,0);
    }//GEN-LAST:event_lbl5050MouseClicked

    private void lblphoneafriendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblphoneafriendMouseClicked
        // TODO add your handling code here:
        Questionsgeneratorclass q=new Questionsgeneratorclass();
        q.JokerPhoneAFriend(obj);
    }//GEN-LAST:event_lblphoneafriendMouseClicked

    private void lblaudienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaudienceMouseClicked
        // TODO add your handling code here:
       Questionsgeneratorclass q=new Questionsgeneratorclass();
       q.JokerAudience(obj);
    }//GEN-LAST:event_lblaudienceMouseClicked

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl5050;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblaudience;
    private javax.swing.JLabel lblphoneafriend;
    private javax.swing.JLabel lblstopgame;
    private javax.swing.JPanel mnpnl;
    private javax.swing.JLabel questionlbl;
    // End of variables declaration//GEN-END:variables
}
