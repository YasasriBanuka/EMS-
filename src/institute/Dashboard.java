
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


public class Dashboard extends javax.swing.JFrame {

   
    public Dashboard() {
        initComponents();
        update_table();
    }

   // CREATE VARIABLE FOR DB CONNECTION AND PREPAREDSTATMENT 
    Connection con;
    PreparedStatement pst;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ad_dep = new javax.swing.JLabel();
        ad_des = new javax.swing.JLabel();
        ad_emp = new javax.swing.JLabel();
        sea_dep = new javax.swing.JLabel();
        log_out = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dep_txt = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ad_dep.setBackground(new java.awt.Color(255, 255, 0));
        ad_dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_dep.setForeground(new java.awt.Color(255, 255, 255));
        ad_dep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_dep.setText("ADD DEPARTMENT");
        ad_dep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ad_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_depMouseClicked(evt);
            }
        });

        ad_des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_des.setForeground(new java.awt.Color(255, 255, 255));
        ad_des.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_des.setText("ADD DESIGNATION");
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

        sea_dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sea_dep.setForeground(new java.awt.Color(255, 255, 255));
        sea_dep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sea_dep.setText("SEARCH EMPLOYEE DETAILS  ");
        sea_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sea_depMouseClicked(evt);
            }
        });

        log_out.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        log_out.setForeground(new java.awt.Color(255, 255, 255));
        log_out.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log_out.setText("LOGOUT");
        log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_outMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sea_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(log_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ad_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ad_des, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ad_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(sea_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("COLOMBO INSTITUTE OF STUDIES DASHBOARD");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("ADD NEW DEPARTMENT ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Add New Department    : ");

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

        delete.setBackground(new java.awt.Color(0, 0, 51));
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
                "ID", "DEPARTMENT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(update)
                        .addGap(30, 30, 30)
                        .addComponent(delete))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//==================================================================================================================== 
    // ADD DATA IN THE TABLE  
    private void update_table()
    {
        try {
            int data;// data type should be interger
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
                pst= con.prepareStatement("SELECT * FROM dep");
                ResultSet rs =pst.executeQuery();
                ResultSetMetaData rsd = rs.getMetaData();
                data = rsd.getColumnCount();
                DefaultTableModel d = (  DefaultTableModel)dep_table.getModel();
                d.setRowCount(0);
                // WHILE LOOP
                while(rs.next()){
                    Vector department  = new Vector();
                    // CREATE A FOR LOOP [UPTO ALL  THE RECODE IN THE TABLE]
                    for(int i=1; i<=data; i++){
                        department.add(rs.getString("id"));
                        department.add(rs.getString("department"));
                    }
                    //  ALL DATA ADDED INTO DEP_TABLE
                    d.addRow(department);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //==================================================================================================================== 
    public void addData(){
           try {
            //CREATE VARIABLE ADD DEPARTMENT
            String Dep_name  =dep_txt.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst=con.prepareStatement("insert into dep(department)values(?)");
            pst.setString(1, Dep_name);
            pst.executeUpdate();
            JOptionPane.showMessageDialog( null, "SUCCESFULLY ADDED NEW DEPARTMENT");
            update_table();
            
            // CLEAR THE TEXT BOX DATA 
            dep_txt.setText("");
            dep_txt.requestFocus();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    // CREATE METHOD FOR UPDATA DATA 
   //==================================================================================================================== 
    public void updateData(){
        
         // UPDATE CODE
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// table object is d1
        int selectIndex = dep_table.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());// 0 means id value 
        int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO UPDATE THE FILL DEPARTMENT" ,"warning",JOptionPane.YES_NO_OPTION);
              String Dep_name  =dep_txt.getText();
 
         // IF CONDITION AND TRY -CATCH STATERMENT
        if(dialogResult == JOptionPane.YES_OPTION ){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst=con.prepareStatement("UPDATE dep SET department=? WHERE id=?");
            pst.setString(1, Dep_name);
            pst.setInt(2, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog( null, "SUCCESFULLY UPDATED NEW DEPARTMENT");
            update_table(); 
            
            // CLEAR THE TEXT BOX DATA 
            dep_txt.setText("");
            dep_txt.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    }
    //==================================================================================================================== 
    // CREATE METHOD FOR DELETE DATA 
    public void delete(){
         
         DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();//TABLE OBJECT IS d1
        int selectIndex = dep_table.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());// 0 MEANS ID VALUE 
        int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE THE FILL DEPARTMENT" ,"warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION ){
            
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
                 pst=con.prepareStatement("DELETE FROM dep WHERE id=?");
                 pst.setInt(1, id);
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog( null, "SUCCESFULLY DELETED DEPARTMENT");
                 update_table();
                 dep_txt.setText("");
                 dep_txt.requestFocus();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
             }  
        } 
    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // METHOD CALL
        addData();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     // METHOD CALL
        updateData();
    }//GEN-LAST:event_updateActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_updateMouseClicked

    private void dep_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dep_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// table object is d1
        int selectIndex = dep_table.getSelectedRow();
        
        dep_txt.setText(d1.getValueAt(selectIndex,1).toString());
    }//GEN-LAST:event_dep_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // METHOD CALL:
        delete();
  
    }//GEN-LAST:event_deleteActionPerformed

    private void ad_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_depMouseClicked
        // TODO add your handling code here:
        Dashboard c = new Dashboard();
        this.hide();
        c.setVisible(true);
    }//GEN-LAST:event_ad_depMouseClicked

    private void ad_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_empMouseClicked
        // TODO add your handling code here:
        AddEmployee adE = new  AddEmployee();
        adE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ad_empMouseClicked

    private void ad_desMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_desMouseClicked
        // TODO add your handling code here:
        AddDesignation  ads  = new  AddDesignation();
        ads.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ad_desMouseClicked

    private void sea_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sea_depMouseClicked
        // TODO add your handling code here:
        SearchEmployeeDetails sde = new SearchEmployeeDetails();
        sde.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sea_depMouseClicked

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
        // TODO add your handling code here:
         int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Logout", 
         JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
        // CLOSE THE CURRENT PAGE CLOSE
        this.dispose();

        //OPEN THE MAIN FRAME 
         Administration log = new Administration ();
         log.setVisible(true);
    }                                
    }//GEN-LAST:event_log_outMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_dep;
    private javax.swing.JLabel ad_des;
    private javax.swing.JLabel ad_emp;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTable dep_table;
    private javax.swing.JTextField dep_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel log_out;
    private javax.swing.JLabel sea_dep;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
