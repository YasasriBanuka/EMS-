
package institute;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AdminCreateAccount extends javax.swing.JFrame {


    public AdminCreateAccount() {
        initComponents();
    }
    
    Connection con;
    PreparedStatement pst;
     
 //====================================================================================================================   
// CREATE METHOD FOR CREATE ACCOUNT BUTTTON 
    public void Crate_Account(){
    
    // CREATE VARIABLE FOR TEXT FEILD AND PASSWORD FEILD
        String name= A_Name.getText();
        String num= A_Num.getText();
        String mail= A_Mail.getText();
        String password = A_Pass.getText();
        
        if(name.equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Name ","ERORR",JOptionPane.ERROR_MESSAGE);
    }
    if(mail.equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Contact Number " ,"ERORR",JOptionPane.ERROR_MESSAGE);
    }   
    if(num .equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Email Address" ,"ERORR",JOptionPane.ERROR_MESSAGE);
    }
    if(password.equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours NIC Number  " ,"ERORR",JOptionPane.ERROR_MESSAGE);
    }
        // Unsuccessful  registrarion code 
    if(name.isEmpty() || mail.isEmpty() || num .isEmpty() ||password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Unsuccessful Registertion" ,"ERORR",JOptionPane.ERROR_MESSAGE);
        }
    else{
        A_Name.setText("");
        A_Mail.setText(null);
        A_Num.setText(null);
        A_Pass.setText(null);
        
    }
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst = con.prepareStatement("INSERT INTO assistant(name,email,number,password)"
                    + "VALUES (?,?,?,?)");
            
            pst.setString(1, name);
            pst.setString(2, mail);
            pst.setString(3, num);
            pst.setString(4, password);
            pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Successfully Create New Assistant HRM Account" , 
            "SUCCESS", JOptionPane.INFORMATION_MESSAGE );
           
           SubLogin a = new SubLogin();
           this.hide();
           a.setVisible(true);
           
            
            A_Name.setText("");
            A_Num.setText("");
            A_Mail.setText("");
            A_Pass.setText("");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminCreateAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
}


//==================================================================================================================== 

public void show_Password(){
      if (AC_pass.isSelected()) {
          A_Pass.setEchoChar((char) 0);
        } else {
           A_Pass.setEchoChar('*');
        } 
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        A_Name = new javax.swing.JTextField();
        A_Num = new javax.swing.JTextField();
        A_Mail = new javax.swing.JTextField();
        A_Pass = new javax.swing.JPasswordField();
        AC_pass = new javax.swing.JCheckBox();
        ACN_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ASSISTANT MANAGER REGISTRATION ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Employee Name ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Employee Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Employee Email ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("New Password ");

        A_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                A_NameKeyReleased(evt);
            }
        });

        A_Num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_NumActionPerformed(evt);
            }
        });
        A_Num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                A_NumKeyPressed(evt);
            }
        });

        A_Mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_Mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                A_MailKeyReleased(evt);
            }
        });

        A_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AC_pass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AC_pass.setText("show Password");
        AC_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC_passActionPerformed(evt);
            }
        });

        ACN_Button.setBackground(new java.awt.Color(204, 0, 0));
        ACN_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ACN_Button.setForeground(new java.awt.Color(255, 255, 255));
        ACN_Button.setText("CREATE A NEW ACCOUNT");
        ACN_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACN_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(AC_pass)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(A_Name)
                                    .addComponent(A_Num)
                                    .addComponent(A_Mail)
                                    .addComponent(A_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(ACN_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AC_pass)
                .addGap(32, 32, 32)
                .addComponent(ACN_Button)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ACN_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACN_ButtonActionPerformed
        // TODO add your handling code here:
        Crate_Account();
    }//GEN-LAST:event_ACN_ButtonActionPerformed

    private void AC_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC_passActionPerformed
        // TODO add your handling code here:
        show_Password();

    }//GEN-LAST:event_AC_passActionPerformed

    
    private void A_MailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_A_MailKeyReleased
        // TODO add your handling code here:
        char mail   = evt. getKeyChar();
        if(Character.isLetter(mail ) |Character.isDigit(mail) | evt.getKeyCode()==KeyEvent.VK_ENTER |evt.getKeyCode() == KeyEvent.VK_PERIOD
            |evt.getKeyCode() == KeyEvent.VK_2 |evt.getKeyCode() == KeyEvent.VK_SHIFT |
            evt.getKeyCode()==KeyEvent.VK_BACK_SPACE| Character.isLowerCase(mail) ){
            A_Mail. setEditable(true);
        }else{
            A_Mail.setEditable(false);
            JOptionPane.showMessageDialog(this, "please Fill Out Correct E-mail Address ", "ERROR",
                JOptionPane. ERROR_MESSAGE);
            A_Mail.grabFocus();
        }
    }//GEN-LAST:event_A_MailKeyReleased

    private void A_NumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_A_NumKeyPressed
    
        // EMPLOREE NUMBER VALIDATION
        String phoneNumber =  A_Num.getText();
        int length = phoneNumber.length();

        char c = evt.getKeyChar();
// NUMBER LENGTH AUTHETICATION
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<13){
                A_Num.setEditable(true);
            }else{
                A_Num.setEditable(false);
            }
        }else
        {
            if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == java.awt.event.
                KeyEvent.VK_MINUS  | evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE |
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_EQUALS |evt.getKeyCode() == java.awt.event.KeyEvent.
                VK_SHIFT | evt.getKeyCode() == java.awt.event.KeyEvent.VK_NUM_LOCK | evt.getKeyCode()
                == java.awt.event.KeyEvent.VK_PLUS |evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            {
                A_Num.setEditable(true);
            }else {
                A_Num.setEditable(false);
                JOptionPane.showMessageDialog(this, " Fill out Correct Contact Number", "ERROR", JOptionPane.
                    ERROR_MESSAGE);
            }}   
    }//GEN-LAST:event_A_NumKeyPressed

    private void A_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_NumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_NumActionPerformed

    private void A_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_A_NameKeyReleased
        // USERNAME VALIDATIONS 
        char letter = evt. getKeyChar();
        if(Character.isLetter(letter)| evt.getKeyCode()==KeyEvent.VK_ENTER
            |evt.getKeyCode() == KeyEvent.VK_SPACE |
            evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK
            |evt.getKeyCode() == KeyEvent.VK_SHIFT){
            A_Name. setEditable(true);
        }else{
            JOptionPane.showMessageDialog(this, "Please  Fill Out  yours Name ", "ERROR", JOptionPane. ERROR_MESSAGE);
            A_Name.setEditable(false);
            A_Name.grabFocus();
            A_Name.setText(null);
        }
    }//GEN-LAST:event_A_NameKeyReleased

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACN_Button;
    private javax.swing.JCheckBox AC_pass;
    private javax.swing.JTextField A_Mail;
    private javax.swing.JTextField A_Name;
    private javax.swing.JTextField A_Num;
    private javax.swing.JPasswordField A_Pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
