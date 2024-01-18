
package institute;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Hregister extends javax.swing.JFrame {

  
    public Hregister() {
        initComponents();
    }
    
Connection con;
PreparedStatement pst;

//==================================================================================================================== 
// CREATE MENTOD FOR HR_REGISTRATION 

   public void HR_Register(){
        String name = name_txt.getText();
        String mail = mail_txt.getText();
        String num  = A_num.getText();
        String pass = pass_txt.getText();
        
        if(name.equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Name ","ERORR",JOptionPane.ERROR_MESSAGE);
    }
    if(mail.equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Contact Number " ,"ERORR",JOptionPane.ERROR_MESSAGE);
    }   
    if(num .equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Email Address" ,"ERORR",JOptionPane.ERROR_MESSAGE);
    }
    if(pass.equals("")){
        JOptionPane.showMessageDialog(null," Enter Yours Contact Number  " ,"ERORR",JOptionPane.ERROR_MESSAGE);
    }
        // Unsuccessful  registrarion code 
        
        try {
            // db connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst = con.prepareStatement("INSERT INTO manager(name,email,number,password)"
                    + "VALUES (?,?,?,?)");
            
          
            pst.setString(1, name);
            pst.setString(2, mail);
            pst.setString(3, num);
            pst.setString(4, pass);
            pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Successfully Create New User Account ", "SUCCESS", 
           JOptionPane.INFORMATION_MESSAGE );
           if(name.isEmpty() || mail.isEmpty() || num .isEmpty() ||pass.isEmpty()){
            JOptionPane.showMessageDialog(null,"Unsuccessful Registertion" ,"ERORR",JOptionPane.ERROR_MESSAGE);
        }
     else{
        name_txt.setText("");
        mail_txt.setText(null);
        A_num.setText(null);
        pass_txt.setText(null);
        
    }
           
           SubLogin a = new SubLogin();
           this.hide();
           a.setVisible(true);
        
           name_txt.setText("");
           mail_txt.setText("");
           A_num.setText("");
           pass_txt.setText("");
      
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hregister.class.getName()).log(Level.SEVERE, null, ex);
        }  }
   
   //==================================================================================================================== 
   // CREATE SHOW PASSWORD METHOD 
   public void showpassword(){
    if (ch_txt.isSelected()) {
          pass_txt.setEchoChar((char) 0);
        } else {
           pass_txt.setEchoChar('*');
        }
   }
   
   // CTEATE USER NAME AUTHETICATION
   
   public void user(){
        char letter = 100;
                  if(Evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | 
                          Character.isLetter(letter)| Evt.getKeyCode()==KeyEvent.VK_ENTER
                          |Evt.getKeyCode() == KeyEvent.VK_SPACE | Evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK
                          |Evt.getKeyCode() == KeyEvent.VK_SHIFT){
                      name_txt. setEditable(true);
                  }else{
                      JOptionPane.showMessageDialog(this, "Please  Fill Out  yours Name ", "ERROR", 
                      JOptionPane. ERROR_MESSAGE);
                      name_txt.setEditable(false);
                      name_txt.grabFocus();
                      name_txt.setText(null);
                  }}
   
   // CREATE METHOD FOR EMAIL AUTHETICATION 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        A_num = new javax.swing.JTextField();
        mail_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JPasswordField();
        ch_txt = new javax.swing.JCheckBox();
        CNC_txt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HUMAN RESOURCE MANAGER REGISTRATION ");

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

        name_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                name_txtKeyReleased(evt);
            }
        });

        A_num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                A_numKeyPressed(evt);
            }
        });

        mail_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_txtActionPerformed(evt);
            }
        });
        mail_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mail_txtKeyReleased(evt);
            }
        });

        pass_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ch_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ch_txt.setText("Check Password");
        ch_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_txtActionPerformed(evt);
            }
        });

        CNC_txt.setBackground(new java.awt.Color(204, 0, 0));
        CNC_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CNC_txt.setForeground(new java.awt.Color(255, 255, 255));
        CNC_txt.setText("CREATE A NEW ACCOUNT");
        CNC_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNC_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name_txt)
                    .addComponent(A_num)
                    .addComponent(mail_txt)
                    .addComponent(pass_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ch_txt)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CNC_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ch_txt)
                .addGap(27, 27, 27)
                .addComponent(CNC_txt)
                .addContainerGap(35, Short.MAX_VALUE))
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
 
    private void CNC_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNC_txtActionPerformed
        // TODO add your handling code here:
           HR_Register();
    }//GEN-LAST:event_CNC_txtActionPerformed

    private void mail_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_txtActionPerformed

    private void ch_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_txtActionPerformed
        // TODO add your handling code here:
        showpassword();
    }//GEN-LAST:event_ch_txtActionPerformed

    private void name_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyReleased
        // METHOD CALL
        user();
    }//GEN-LAST:event_name_txtKeyReleased

    
    private void mail_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mail_txtKeyReleased
       // METRHOD CALL 
       char mail   = evt. getKeyChar();
        if(Character.isLetter(mail ) |Character.isDigit(mail) | evt.getKeyCode()==KeyEvent.VK_ENTER |evt.getKeyCode() == KeyEvent.VK_PERIOD
                |evt.getKeyCode() == KeyEvent.VK_2 |evt.getKeyCode() == KeyEvent.VK_SHIFT | 
                evt.getKeyCode()==KeyEvent.VK_BACK_SPACE| Character.isLowerCase(mail) ){
                mail_txt. setEditable(true);
         }else{
             mail_txt.setEditable(false);
            JOptionPane.showMessageDialog(this, "please Fill Out Correct E-mail Address ", "ERROR",
            JOptionPane. ERROR_MESSAGE);
             mail_txt.grabFocus(); 
        }
    }//GEN-LAST:event_mail_txtKeyReleased

    private void A_numKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_A_numKeyPressed
        // employee number 
              // employee number validation
        String phoneNumber =  A_num.getText();
        int length = phoneNumber.length();

        char c = evt.getKeyChar();
// NUMBER LENGTH AUTHETICATION
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<13){
                A_num.setEditable(true);
            }else{
                A_num.setEditable(false);
            }
        }else
        {
            if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == java.awt.event.
                KeyEvent.VK_MINUS  | evt.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE |
                evt.getKeyCode() == java.awt.event.KeyEvent.VK_EQUALS |evt.getKeyCode() == java.awt.event.KeyEvent.
                VK_SHIFT | evt.getKeyCode() == java.awt.event.KeyEvent.VK_NUM_LOCK | evt.getKeyCode()
                == java.awt.event.KeyEvent.VK_PLUS |evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            {
                A_num.setEditable(true);
            }else {
                JOptionPane.showMessageDialog(this, " Enter number Here !", "ERROR", JOptionPane.
                    ERROR_MESSAGE);

                A_num.setEditable(false);
                
            }
        }
    }//GEN-LAST:event_A_numKeyPressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A_num;
    private javax.swing.JButton CNC_txt;
    private javax.swing.JCheckBox ch_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JPasswordField pass_txt;
    // End of variables declaration//GEN-END:variables
}
