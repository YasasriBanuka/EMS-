
package institute;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

   
    public Admin() {
        initComponents();
    }
 //==============================================================================================================
 //CREATE METHOD 
 public void Login(){
        
        String user = userName.getText();
        String Pw = passWord.getText();
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Username Here!", 
            "ERORR", JOptionPane.ERROR_MESSAGE);
            userName.grabFocus();
        } else {
            if (Pw.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Passowrd  Here!",
                 "ERORR", JOptionPane.ERROR_MESSAGE);
                passWord.grabFocus();
            } else {
                String UName = "admin";
                String PWord = "ad123";
                if (user.equals(UName)) {
                if (Pw.equals(PWord)) {
                     JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFULLY ",
                       "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    SubLogin  v = new SubLogin(); 
                    this.hide();
                    v.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "LOGIN UNSUCCESSFULLY !",
                       "ERORR", JOptionPane.ERROR_MESSAGE);
                        passWord.setText(null);   
                    }
                   } else {
                    JOptionPane.showMessageDialog(this, "LOGIN UNSUCCESSFULLY !",       
                    "ERORR", JOptionPane.ERROR_MESSAGE);
                    userName.setText(null);
                } 
                }
            }
    }
 //=======================================================================================================================================
 // CREATE  METHOD FOR USERNAME FIELD AND PASSWORD 
    
    public void user(){
         //WHEN YOU CLICK USERNAME TEXTFIELS IT BECOME TO REMOVE DFAULT TEXT 
       userName.setText(null);
       userName.setForeground(Color.BLACK);   
    }
    public void password(){
        passWord.setText(null);
        passWord.setForeground(Color.BLACK);
    }
    //CREATE SHOW PASSWORD METHOD 
    public void showpassword(){
        if (shoPassword_txt.isSelected()) {
            passWord.setEchoChar((char) 0);
        } else {
            passWord.setEchoChar('*');
        }
    }
 //======================================================================================================================
    // CREATE METHOD CANLE BUTTON 
    public void cancle(){
        
         JFrame can = new JFrame("Cancle");
        if (JOptionPane.showConfirmDialog(can, "Confirm if you Want Cancle login", "Cancle",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
         Administration add = new Administration ();
          this.hide();
          add.setVisible(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passWord = new javax.swing.JPasswordField();
        shoPassword_txt = new javax.swing.JCheckBox();
        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/padlock.png"))); // NOI18N
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/user.png"))); // NOI18N
        jLabel4.setText("USERNAME ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMIN LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, 30));

        userName.setForeground(new java.awt.Color(153, 153, 153));
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setText("Enter Username Here!");
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, 30));

        passWord.setForeground(new java.awt.Color(204, 204, 204));
        passWord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passWord.setText("jPasswordField1");
        passWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passWordMouseClicked(evt);
            }
        });
        getContentPane().add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 190, 30));

        shoPassword_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        shoPassword_txt.setForeground(new java.awt.Color(0, 0, 51));
        shoPassword_txt.setText("show Password");
        shoPassword_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoPassword_txtActionPerformed(evt);
            }
        });
        getContentPane().add(shoPassword_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 150, -1));

        Back.setBackground(new java.awt.Color(0, 204, 0));
        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("CANCLE");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        Exit.setBackground(new java.awt.Color(0, 204, 204));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 70, -1));

        log.setBackground(new java.awt.Color(204, 0, 0));
        log.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("LOGIN ");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/a_login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // METHOD CALL
        Login(); 
    }//GEN-LAST:event_logActionPerformed

    private void shoPassword_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoPassword_txtActionPerformed
        //METHOD CALL
        showpassword();
    }//GEN-LAST:event_shoPassword_txtActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // METHOD CALL
        cancle();
    }//GEN-LAST:event_BackActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // TODO add your handling code here:
        user();
    }//GEN-LAST:event_userNameMouseClicked

    private void passWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passWordMouseClicked
        // TODO add your handling code here:
       password();
    }//GEN-LAST:event_passWordMouseClicked

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JCheckBox shoPassword_txt;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
