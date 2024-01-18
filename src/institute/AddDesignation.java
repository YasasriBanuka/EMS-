
package institute;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// INHERITENCE 
public class AddDesignation extends javax.swing.JFrame {

 
    public AddDesignation() {
        initComponents();
        update_table();
    }

   // create connection 
    Connection con;
    PreparedStatement pst;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dashboardLable = new javax.swing.JLabel();
        ad_dep = new javax.swing.JLabel();
        ad_des = new javax.swing.JLabel();
        ad_emp = new javax.swing.JLabel();
        se_Depart = new javax.swing.JLabel();
        log_Out = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cisLable = new javax.swing.JLabel();
        departmentLable = new javax.swing.JLabel();
        addDepartmentLable = new javax.swing.JLabel();
        des_txt = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dep_table = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1097, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 44, 85));

        dashboardLable.setBackground(new java.awt.Color(0, 204, 204));
        dashboardLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dashboardLable.setForeground(new java.awt.Color(255, 255, 255));
        dashboardLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardLable.setText("DASHBOARD");
        dashboardLable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ad_dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_dep.setForeground(new java.awt.Color(255, 255, 255));
        ad_dep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_dep.setText("ADD DEPARTMENT");
        ad_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_depMouseClicked(evt);
            }
        });

        ad_des.setBackground(new java.awt.Color(204, 204, 0));
        ad_des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_des.setForeground(new java.awt.Color(255, 255, 255));
        ad_des.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_des.setText("ADD DESIGNATION");
        ad_des.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ad_des.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_desMouseClicked(evt);
            }
        });

        ad_emp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_emp.setForeground(new java.awt.Color(255, 255, 255));
        ad_emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_emp.setText("ADD EMPLOYEE");
        ad_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_empMouseClicked(evt);
            }
        });

        se_Depart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        se_Depart.setForeground(new java.awt.Color(255, 255, 255));
        se_Depart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        se_Depart.setText("SEARCH EMPLOYEE DETAILS");
        se_Depart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                se_DepartMouseClicked(evt);
            }
        });

        log_Out.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        log_Out.setForeground(new java.awt.Color(255, 255, 255));
        log_Out.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log_Out.setText("LOGOUT");
        log_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_OutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(se_Depart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(log_Out, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dashboardLable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ad_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ad_des, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ad_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(se_Depart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(log_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        cisLable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cisLable.setForeground(new java.awt.Color(0, 51, 51));
        cisLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cisLable.setText("COLOMBO INSTITUTE OF STUDIES DASHBOARD");

        departmentLable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        departmentLable.setForeground(new java.awt.Color(0, 51, 51));
        departmentLable.setText("ADD NEW DEPARTMENT'S DESIGNATIONS ");

        addDepartmentLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addDepartmentLable.setForeground(new java.awt.Color(0, 0, 51));
        addDepartmentLable.setText("Add New Designation    : ");

        des_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        add.setBackground(new java.awt.Color(255, 0, 0));
        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 153, 51));
        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 102));
        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        dep_table.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dep_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESIGNATION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        dep_table.setOpaque(false);
        dep_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dep_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dep_table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addDepartmentLable)
                        .addGap(18, 18, 18)
                        .addComponent(des_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(delete))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(cisLable, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(departmentLable, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cisLable, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departmentLable, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addDepartmentLable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(des_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(update)
                            .addComponent(delete))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//==============================================================================================================================================
    // ADD DATA IN THE TABLE
    
    private void update_table()
    {
        try {
            int data;// DATA TYPE SHOULD BE INTERGER 
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
                pst= con.prepareStatement("SELECT *FROM des");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData rsd = rs.getMetaData();
                data = rsd.getColumnCount();
               
                DefaultTableModel d = (  DefaultTableModel)dep_table.getModel();
                d.setRowCount(0);
                
                // while loop
                
                while(rs.next()){
                    Vector designation  = new Vector();
                    // CREATE A FOR LOOP [UPTO ALL THE RECODE INTHE TABLE ] 
                    for(int i=1; i<=data; i++){
                        designation.add(rs.getString("id"));
                        designation.add(rs.getString("designation"));
                        
                    }
                    // ADD ALL DATA INTO THE TABLE 
                    d.addRow(designation);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddDesignation.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(AddDesignation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//================================================================================================================================================
    public void addData(){
         try {
            //CREATE THE VARIABLE ADD DEPARTMENT
            String Des_name  =des_txt.getText();
         
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst=con.prepareStatement("insert into des(designation)values(?)");
            pst.setString(1, Des_name);
          
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog( null, "SUCCESFULLY ADDED NEW DESIGNATION");
            update_table();
            
            //CLEAR THE TEXT BOX DATA
            des_txt.setText("");
            des_txt.requestFocus();   
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddDesignation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
//=========================================================================================================================
    public void update(){
             // UPDATE BUTTON CODE 
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// table object is d1
        int selectIndex = dep_table.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());// 0 means id value 
        int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO UPDATE THE FILL DESIGNATION " ,
                "warning",JOptionPane.YES_NO_OPTION);
              String Des_name  =des_txt.getText();
              
        if(dialogResult == JOptionPane.YES_OPTION ){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst=con.prepareStatement("UPDATE des SET designation=? WHERE id=?");
            pst.setString(1, Des_name);
            pst.setInt(2, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog( null, "SUCCESFULLY UPDATED NEW DESIGNATION");
            update_table(); 
            
            // CLEAR THE TEXT BOX DATA
            des_txt.setText("");
            des_txt.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddDesignation.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    }
 //======================================================================================================================
    // CREATE METOD FOR MOUSE CLICK ACTION 
    public void action(){
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// TABLE OBJECT IS d1
        int selectIndex = dep_table.getSelectedRow();
        des_txt.setText(d1.getValueAt(selectIndex,1).toString());
    }
    
//=========================================================================================================================
    public void delete(){
          
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// TABLE OBJECT IS d1
        int selectIndex = dep_table.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());// 0 MEANS ID VALUE 
        int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE THE FILL DESIGNATION" ,"warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION ){
            
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
                 pst=con.prepareStatement("DELETE FROM des WHERE id=?");
                 pst.setInt(1, id);
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog( null, "SUCCESFULLY DELETED DESIGNATION");
                  update_table();
                 des_txt.setText("");
                 des_txt.requestFocus();
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(AddDesignation.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        }
    }
 //=======================================================================================================================================
   // CREATE LOGOUT METHOD 
    public void logout(){
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout",
                 JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
  
        // CLOSE THE CURRENT PAGE
        this.dispose();

        // OPEN THE ADMINISTRATION PAGE 
        Administration log = new Administration  ();
        log.setVisible(true);
    
    }                  
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
     // METHOD CALL
         addData();      
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     //METHOD CALL
     update();
    }//GEN-LAST:event_updateActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
  
    }//GEN-LAST:event_updateMouseClicked

    private void dep_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dep_tableMouseClicked
      //METHOD CALL 
        action();
    }//GEN-LAST:event_dep_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // METHOD CALL
        delete();   
    }//GEN-LAST:event_deleteActionPerformed

    private void ad_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_depMouseClicked
        // TODO add your handling code here:
        Dashboard c = new Dashboard();
        this.hide();
        c.setVisible(true);
    }//GEN-LAST:event_ad_depMouseClicked

    private void ad_desMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_desMouseClicked
        // TODO add your handling code here:
       
        AddDesignation  ads  = new  AddDesignation();
        ads.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ad_desMouseClicked

    private void ad_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_empMouseClicked
        // TODO add your handling code here:
        AddEmployee adE = new  AddEmployee();
        adE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ad_empMouseClicked

    private void se_DepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_se_DepartMouseClicked
        // TODO add your handling code here:
       SearchEmployeeDetails sde = new SearchEmployeeDetails();
       sde.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_se_DepartMouseClicked

    private void log_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_OutMouseClicked
        // METHOD CALL
          logout();          
    }//GEN-LAST:event_log_OutMouseClicked

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddDesignation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_dep;
    private javax.swing.JLabel ad_des;
    private javax.swing.JLabel ad_emp;
    private javax.swing.JButton add;
    private javax.swing.JLabel addDepartmentLable;
    private javax.swing.JLabel cisLable;
    private javax.swing.JLabel dashboardLable;
    private javax.swing.JButton delete;
    private javax.swing.JTable dep_table;
    private javax.swing.JLabel departmentLable;
    private javax.swing.JTextField des_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel log_Out;
    private javax.swing.JLabel se_Depart;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
