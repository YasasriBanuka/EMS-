
package institute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SearchEmployeeDetails extends javax.swing.JFrame {

    
    public SearchEmployeeDetails() {
        initComponents();
    }

   // create connection 
    Connection con;
    PreparedStatement pst;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        add_dep = new javax.swing.JLabel();
        add_desi = new javax.swing.JLabel();
        ad_employ = new javax.swing.JLabel();
        sea_dep = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dep_table = new javax.swing.JTable();
        dep_txt = new javax.swing.JTextField();

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

        add_dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_dep.setForeground(new java.awt.Color(255, 255, 255));
        add_dep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_dep.setText("ADD DEPARTMENT");
        add_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_depMouseClicked(evt);
            }
        });

        add_desi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_desi.setForeground(new java.awt.Color(255, 255, 255));
        add_desi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_desi.setText("ADD DESIGNATION");
        add_desi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_desiMouseClicked(evt);
            }
        });

        ad_employ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_employ.setForeground(new java.awt.Color(255, 255, 255));
        ad_employ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_employ.setText("ADD EMPLOYEE");
        ad_employ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_employMouseClicked(evt);
            }
        });

        sea_dep.setBackground(new java.awt.Color(0, 255, 255));
        sea_dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sea_dep.setForeground(new java.awt.Color(255, 255, 255));
        sea_dep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sea_dep.setText("SEARCH EMPLOYEE DETAILS ");
        sea_dep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sea_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sea_depMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_desi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_employ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sea_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(add_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(add_desi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ad_employ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(sea_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("COLOMBO INSTITUTE OF STUDIES DASHBOARD");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("SEARCH BY EMPLOYEE DETAILS ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("SEARCH BY EMPLOYEE DETAILS ");

        search.setBackground(new java.awt.Color(0, 204, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        dep_table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dep_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE NAME ", "DEPARTMENT", "DESIGNATION", "EMPLOYEE NUMBER", "EPF NUMBER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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

        dep_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dep_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dep_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(dep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(dep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 //===================================================================================================================   
    // SEARCH CODE
    private void searchLog()
    {
     String Re_search = dep_txt.getText();
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/human_resource", "root", "");
        
  
        String sql = "SELECT * FROM employee WHERE emp_name=? || department=? || "
                + "designation =? || emp_num=? || epf=? ";
       
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,  Re_search);
        pst.setString(2,  Re_search);
        pst.setString(3,  Re_search);
        pst.setString(4,  Re_search);
        pst.setString(5,  Re_search);
        
        ResultSet rs = pst.executeQuery();
        
        // Clear existing data from the table
        DefaultTableModel tblModel = (DefaultTableModel) dep_table.getModel();
        tblModel.setRowCount(0);
        
        while (rs.next()) {
            String emp_Name = rs.getString("emp_Name");
            String department =rs.getString("department");
            String designation = rs.getString("designation");
            String employeeNumber = rs.getString("emp_num");
            String epf = rs.getString("epf");
            
            dep_txt.setText(null);
            // Add data to jTable
            String[] tbData = {emp_Name, department, designation, employeeNumber, epf};
            tblModel.addRow(tbData);
        }
        
        // Close ResultSet, PreparedStatement, and Connection
        rs.close();
        pst.close();
        con.close();
        
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(SearchEmployeeDetails.class.getName()).log(Level.SEVERE, null, ex);
    }   
    }
    
 //==============================================================================================================================
    // CREATE LOGOUT METHOD
    
    public void logout(){
        
    int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?",
                 "Logout", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
        // Close the current page
        this.dispose();

        // OPEN THE ADMINISTRATION LOGIN
        Administration log = new Administration  ();
        log.setVisible(true);
    } 
    }
   
  //=====================================================================================================================================
    /*
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

    }//GEN-LAST:event_searchActionPerformed
*/
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {  
        //METHOD CALL
           searchLog();
}
    private void dep_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dep_tableMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dep_tableMouseClicked

    private void add_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_depMouseClicked
        // TODO add your handling code here:
        Dashboard c = new Dashboard();
        this.hide();
        c.setVisible(true);
    }//GEN-LAST:event_add_depMouseClicked

    private void add_desiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_desiMouseClicked
        // TODO add your handling code here:
        AddDesignation  ads  = new  AddDesignation();
        ads.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_add_desiMouseClicked

    private void ad_employMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ad_employMouseClicked
        // TODO add your handling code here:
        AddEmployee  adE = new  AddEmployee ();
        adE.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ad_employMouseClicked

    private void sea_depMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sea_depMouseClicked
        // TODO add your handling code here:
        SearchEmployeeDetails sde = new SearchEmployeeDetails();
        sde.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_sea_depMouseClicked

    private void dep_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dep_txtActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_logoutMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchEmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_employ;
    private javax.swing.JLabel add_dep;
    private javax.swing.JLabel add_desi;
    private javax.swing.JTable dep_table;
    private javax.swing.JTextField dep_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel sea_dep;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
