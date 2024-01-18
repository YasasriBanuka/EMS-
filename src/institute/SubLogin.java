
package institute;


public class SubLogin extends javax.swing.JFrame {

  
    public SubLogin() {
        initComponents();
    }
//
// CONNECT WITH HR MANAGER REGISTRATION 
    public void create_ManagerRegistration(){
        Hregister ag = new Hregister();
        this.hide();
        ag.setVisible(true);
    }
  // CONNECT WITH ASSISTANT  MANAGER REGISTRATION   
     public void create_HAMRegistration(){
        AdminCreateAccount ag = new AdminCreateAccount();
        this.hide();
        ag.setVisible(true);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HRManager = new javax.swing.JButton();
        AhrManager = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HUMAN RESOURCE MANAGER  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ASSITANT HR  MANAGER        ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COLOMBO INSTITUTE OF STUDIES ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 310, 30));

        HRManager.setBackground(new java.awt.Color(0, 102, 102));
        HRManager.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HRManager.setForeground(new java.awt.Color(255, 255, 255));
        HRManager.setText("CREATE NEW ACCOUNT ");
        HRManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HRManagerActionPerformed(evt);
            }
        });
        getContentPane().add(HRManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 30));

        AhrManager.setBackground(new java.awt.Color(0, 102, 102));
        AhrManager.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AhrManager.setForeground(new java.awt.Color(255, 255, 255));
        AhrManager.setText("CREATE NEW ACCOUNT ");
        AhrManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AhrManagerActionPerformed(evt);
            }
        });
        getContentPane().add(AhrManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/Admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HRManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HRManagerActionPerformed
        // TODO add your handling code here:
        create_ManagerRegistration();  
    }//GEN-LAST:event_HRManagerActionPerformed

    private void AhrManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AhrManagerActionPerformed

        create_HAMRegistration();
    }//GEN-LAST:event_AhrManagerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           Administration  a = new Administration();
           this.hide();
           a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
        java.awt.EventQueue.invokeLater(() -> {
            new SubLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AhrManager;
    private javax.swing.JButton HRManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
