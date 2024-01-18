
package institute;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Administration extends javax.swing.JFrame {

    public Administration() {
        initComponents();
        CurrentDate();
        date();
    }
 //==================================================================================================================== 
// CREATE METHOD FOR DATA AND TIME 
    
     public void CurrentDate(){
        
     DateTimeFormatter times =  DateTimeFormatter.ofPattern("hh : mm a");
     LocalDateTime now =   LocalDateTime .now();
     time.setText(times.format(now));
    }
 
//==================================================================================================================== 
    public void date(){
     DateTimeFormatter day =  DateTimeFormatter.ofPattern("yyyy: MM: dd");
     LocalDateTime now =   LocalDateTime.now();
     date.setText(day.format(now));   
        
    } 
    
//==================================================================================================================== 
 // CREATE OBJECTS FOR CONNECT OTHER FRAMES   
public void sub_menu(){
        Log sublog = new  Log ();
        sublog.setVisible(true);
        this.setVisible(false);   
 }

//==================================================================================================================== 
public void AssistantHR_log(){
        AssistantManagerLogin assistant = new  AssistantManagerLogin ();
        assistant.setVisible(true);
        this.setVisible(false);    
}  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Ad_log = new javax.swing.JLabel();
        HR_Manager = new javax.swing.JLabel();
        AHR_Manager = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COLOMBO INSTITUTE OF STUDIES ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 320, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/ad.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, 120));

        Ad_log.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ad_log.setForeground(new java.awt.Color(0, 102, 102));
        Ad_log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ad_log.setText("ADMINISTRATION ");
        Ad_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ad_logMouseClicked(evt);
            }
        });
        getContentPane().add(Ad_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 150, 30));

        HR_Manager.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HR_Manager.setForeground(new java.awt.Color(0, 102, 102));
        HR_Manager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HR_Manager.setText("HR MANAGER ");
        HR_Manager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HR_ManagerMouseClicked(evt);
            }
        });
        getContentPane().add(HR_Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 130, 30));

        AHR_Manager.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AHR_Manager.setForeground(new java.awt.Color(0, 102, 102));
        AHR_Manager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AHR_Manager.setText("ASSISTANT HR MANAGER");
        AHR_Manager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AHR_ManagerMouseClicked(evt);
            }
        });
        getContentPane().add(AHR_Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 200, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("00 : 00 :00");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, 20));

        date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("0000-00-00");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/institute/Image/Admin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ad_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ad_logMouseClicked
        // TODO add your handling code here:
      Admin a = new Admin ();
      this.hide();
      a.setVisible(true);    
    }//GEN-LAST:event_Ad_logMouseClicked

    private void HR_ManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HR_ManagerMouseClicked
        // TODO add your handling code here:
         sub_menu();
    }//GEN-LAST:event_HR_ManagerMouseClicked

    private void AHR_ManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AHR_ManagerMouseClicked
        // TODO add your handling code here:
          AssistantHR_log();
    }//GEN-LAST:event_AHR_ManagerMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Administration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AHR_Manager;
    private javax.swing.JLabel Ad_log;
    private javax.swing.JLabel HR_Manager;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
