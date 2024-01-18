
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

public class AssistantManagerLogin extends javax.swing.JFrame {

    Connection con =null;
    ResultSet re = null;
    PreparedStatement pst = null;
 
    public AssistantManagerLogin() {
        initComponents();
    }
 //====================================================================================================================   
// CREATE METHOD FOR LOGIN FUNCTION 
    public void Login(){
       String name = user_txt.getText();
       String pass = pass_txt.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/  human_resource","root","");
            String sql = "SELECT *FROM `assistant` WHERE name=? And password=?";
           pst=con.prepareCall(sql);
           pst.setString(1,name);
           pst.setString(2, pass);
           
           ResultSet rs = pst.executeQuery();
            if(rs.next()){
           JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY LOGIN"); 
             Dashboard log1 = new Dashboard ();
             this.hide();
             log1.setVisible(true);
                 
            }else{
                JOptionPane.showMessageDialog(rootPane,"UNSUCCESSFULLY LOGIN");
            }  
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AssistantManagerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
 //==================================================================================================================== 
// CREATE  METHOD FOR USERNAME FIELD AND PASSWORD 
    public void user(){
        
         //WHEN CLICK USERNAME TEXTFIELD IT BECOME TO REMOVE DEFAULT TEXT 
       user_txt.setText(null);
       user_txt.setForeground(Color.BLACK);   
    }
//==================================================================================================================== 
    public void password(){
       pass_txt.setText(null);
       pass_txt.setForeground(Color.BLACK);
    }
//==================================================================================================================== 
    //CREATE SHOW PASSWORD METHOD 
    public void showpassword(){
        if (check_pass.isSelected()) {
           pass_txt.setEchoChar((char) 0);
        } else {
            pass_txt.setEchoChar('*');
        }
    } 
 ////==================================================================================================================== 
    // CREATE METHOD FOR CANCLE BUTTON 
    public void cancle(){
        
         JFrame can = new JFrame("Cancle");
        if (JOptionPane.showConfirmDialog(can, "Confirm if you Want Cancle login", "Cancle",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
          Administration add = new Administration ();
          this.hide();
          add.setVisible(true);
        }
    }
 //========================================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass_txt = new javax.swing.JPasswordField();
        check_pass = new javax.swing.JCheckBox();
        log = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ASSISTANT HR MANAGER LOGIN ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/user.png"))); // NOI18N
        jLabel3.setText("USERNAME ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 40));

        user_txt.setForeground(new java.awt.Color(153, 153, 153));
        user_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_txt.setText("Enter username Here!");
        user_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_txtMouseClicked(evt);
            }
        });
        getContentPane().add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/padlock.png"))); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 30));

        pass_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pass_txt.setForeground(new java.awt.Color(204, 204, 204));
        pass_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_txt.setText("1111111111111");
        pass_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_txtMouseClicked(evt);
            }
        });
        pass_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_txtActionPerformed(evt);
            }
        });
        getContentPane().add(pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 230, 30));

        check_pass.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        check_pass.setText("Check Password");
        check_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_passActionPerformed(evt);
            }
        });
        getContentPane().add(check_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 120, -1));

        log.setBackground(new java.awt.Color(204, 0, 0));
        log.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("LOGIN");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 90, -1));

        back.setBackground(new java.awt.Color(0, 204, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("CANCLE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 90, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/login.png"))); // NOI18N
        jLabel1.setText("n ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
       // METHOD CALL
                     Login();
    }//GEN-LAST:event_logActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         // METHOD CALL
          cancle();       
    }//GEN-LAST:event_backActionPerformed

    private void check_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_passActionPerformed
          showpassword();
    }//GEN-LAST:event_check_passActionPerformed

    private void pass_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_txtActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_pass_txtActionPerformed

    private void user_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_txtMouseClicked
       // METHOD CALL
        user();
    }//GEN-LAST:event_user_txtMouseClicked

    private void pass_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_txtMouseClicked
      // METHOD CALL            
        password();
    }//GEN-LAST:event_pass_txtMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new AssistantManagerLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JCheckBox check_pass;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField pass_txt;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
