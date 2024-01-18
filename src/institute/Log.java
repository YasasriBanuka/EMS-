
package institute;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Log extends javax.swing.JFrame {

    Connection con =null;
    ResultSet re = null;
    PreparedStatement pst = null;
    
    public Log() {
        initComponents();
    }
 //========================================================================================================================
 //CREATE METHOD 
    public void hrManagerLog(){
        String name = userName.getText();
       String pass = passWord.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/  human_resource","root","");
            String sql = "SELECT *FROM `manager` WHERE name=? And password=?";
           pst=con.prepareCall(sql);
           pst.setString(1,name);
           pst.setString(2, pass);
           
           ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane,"SUCCESSFULL LOGIN"); 
                Dashboard log1 = new Dashboard();
                this.hide();
                log1.setVisible(true);
                 
            }else{
                JOptionPane.showMessageDialog(rootPane,"UNSUCCESSFULL LOGIN");
            }  
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//============================================================================================================================================
     // CREATE  METHOD FOR USERNAME FIELD AND PASSWORD 
    public void user(){
         // when you click userName textfeild it become to remvoe default text 
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
//==============================================================================================================================
    public void cancle(){
        
         JFrame can = new JFrame("Cancle");
        if (JOptionPane.showConfirmDialog(can, "Confirm if you Want Cancle login", "Cancle",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
          Administration add = new Administration ();
          this.hide();
          add.setVisible(true);
        }
    }
//===================================================================================================================================
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        shoPassword_txt = new javax.swing.JCheckBox();
        log = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        exit_txt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HUMAN RESOURCE MANAGER LOGIN ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/user.png"))); // NOI18N
        jLabel3.setText("USERNAME ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, 40));

        userName.setForeground(new java.awt.Color(153, 153, 153));
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setText("Enter Username Here!");
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 180, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/padlock.png"))); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, 30));

        passWord.setForeground(new java.awt.Color(204, 204, 204));
        passWord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passWord.setText("asbwuhwhuwhdyglg");
        passWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passWordMouseClicked(evt);
            }
        });
        getContentPane().add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 230, 30));

        shoPassword_txt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        shoPassword_txt.setText("show Password");
        shoPassword_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shoPassword_txtMouseClicked(evt);
            }
        });
        shoPassword_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoPassword_txtActionPerformed(evt);
            }
        });
        getContentPane().add(shoPassword_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 120, -1));

        log.setBackground(new java.awt.Color(204, 0, 0));
        log.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("LOGIN");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        Back.setBackground(new java.awt.Color(0, 204, 0));
        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("CANCLE");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        exit_txt.setBackground(new java.awt.Color(0, 102, 102));
        exit_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit_txt.setForeground(new java.awt.Color(255, 255, 255));
        exit_txt.setText("EXIT");
        exit_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_txtActionPerformed(evt);
            }
        });
        getContentPane().add(exit_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
      // METHOD CALL
           hrManagerLog();
    }//GEN-LAST:event_logActionPerformed

    private void shoPassword_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoPassword_txtActionPerformed
        // METHOD CALL
         showpassword();
    }//GEN-LAST:event_shoPassword_txtActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // METHOD CALL
           cancle();
    }//GEN-LAST:event_BackActionPerformed

    private void exit_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_txtActionPerformed
        // METHOD CALL
        System.exit(0);
    }//GEN-LAST:event_exit_txtActionPerformed

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // METHOD CALL
        user();
    }//GEN-LAST:event_userNameMouseClicked

    private void passWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passWordMouseClicked
        // METHOD CALL
        password();
    }//GEN-LAST:event_passWordMouseClicked

    private void shoPassword_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shoPassword_txtMouseClicked
         // METHOD CALL
     
    }//GEN-LAST:event_shoPassword_txtMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton exit_txt;
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
