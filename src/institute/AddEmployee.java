 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

// abstraction method 
public class AddEmployee extends javax.swing.JFrame {

    
    public AddEmployee() {
        initComponents();
        update_table();
        department();
        designation();   
    }
   // create connection 
    Connection con;
    PreparedStatement pst;
 
  // DEPARTMENT LOAD INTO THE COMBO BOX 
    public class Department{
        int id;
        String department;  
    public Department() {
    
        //  DEFAULT CONSTRUCTOR WITH NO PARAMETERS
    }  
      // CONSTRUCTOR OVERLOADING 
    public  Department(int id){  
        
         this.id =id; 
    }
     public Department(String department){ 
         
         this.department= department;  
    }
    public Department(int id,String department){  
        
         this.id =id; 
         this.department= department;  
    }

        @Override
    public String toString(){ // METHOD OVERRIDE
        
        return department;
    } }
  //========================================================================================
    public class Designation{
        int id;
        String designation;
    public Designation() {
        
        //  DEFAULT CONSTRUCTOR WITH NO PARAMETERS
    }  
     public Designation(int id) {
         
       this.id =id;
    }  
    
    public Designation (String designation){
        
        this.designation= designation;  
    }
    public Designation (int id,String designation){
        
        this.id =id;
        this.designation= designation;  
    }
    //  CONVERT THEM
        @Override
    public String toString(){// METHOD OVERRIDE
        
        
        return designation;
    }}
    
    
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
        log_out = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emp_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dep_txt = new javax.swing.JComboBox();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dep_table = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        desig_txt = new javax.swing.JComboBox();
        EN_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        EPF_txt = new javax.swing.JTextField();

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

        ad_employ.setBackground(new java.awt.Color(204, 204, 0));
        ad_employ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ad_employ.setForeground(new java.awt.Color(255, 255, 255));
        ad_employ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ad_employ.setText("ADD EMPLOYEE");
        ad_employ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ad_employ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ad_employMouseClicked(evt);
            }
        });

        sea_dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sea_dep.setForeground(new java.awt.Color(255, 255, 255));
        sea_dep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sea_dep.setText("SEARCH EMPLOYEE DETAILS ");
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
            .addComponent(add_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_desi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ad_employ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sea_dep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(log_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(add_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(add_desi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ad_employ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sea_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("COLOMBO INSTITUTE OF STUDIES DASHBOARD");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("ADD NEW EMPLOREES FOR AVAILABLE DEPARTMENTS AND  DESIGNATIONS ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Add New Employee   : ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("                  Department  : ");

        dep_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dep_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_txtActionPerformed(evt);
            }
        });

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

        dep_table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dep_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "EMPLOYEE NAME ", "DEPARTMENT", "DESIGNATION", "EMPLOYEE NUMBER", "EPF NUMBER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText(" Employee Number    : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("              Designation  : ");

        desig_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("        EPF  Number  : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EPF_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desig_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13))
                                .addGap(26, 26, 26)
                                .addComponent(dep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(emp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EPF_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desig_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(add))
                .addContainerGap(44, Short.MAX_VALUE))
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
//===================================================================================================================================
  // CREATE METHOD FOR DEPARMENT DATA ADD TO THE COMBO BOX
    private void department()
    {
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst= con.prepareStatement("SELECT *FROM dep");
            ResultSet rs =pst.executeQuery();
            // ADD DATA INTO COMBO BOX
            dep_txt.removeAllItems();
            
            while(rs.next()){
                
              dep_txt.addItem(new Department(rs.getInt(1),rs.getString(2)));    
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }}
    
 //==================================================================================================================
  
    // // CREATE METHOD FOR DESIGNATION DATA ADD TO THE COMBO BOX
    private void designation()
    {
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst= con.prepareStatement("SELECT *FROM des");
            ResultSet rs =pst.executeQuery();
            // ADD DATA INTO COMBO BOX
            desig_txt.removeAllItems();
            
            while(rs.next()){
                
           desig_txt.addItem(new Designation(rs.getInt(1),rs.getString(2)));    
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }} 
//========================================================================================================================
    // ADD DATA INTO TABLE 
    private void update_table(){ 
        try {
            int data;// data type should be interger
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
                pst= con.prepareStatement("SELECT *FROM employee");
                ResultSet rs =pst.executeQuery();
                
                ResultSetMetaData rsd = rs.getMetaData();
                data = rsd.getColumnCount();
               
                DefaultTableModel d = (  DefaultTableModel)dep_table.getModel();
                d.setRowCount(0);
                
                // wWILE LOOP
                while(rs.next()){
                    
                    // CREATE OBJECT BY USIN VECTOR 
                    Vector designation  = new Vector();
                    //CREATE A FOR LOOP [UPTO ALL THE  RECODE IN THE TABLE] 
                    for(int i=1; i<=data; i++){
                        designation.add(rs.getString("id"));
                        designation.add(rs.getString("emp_name"));
                        designation.add(rs.getString("department"));
                        designation.add(rs.getString("designation"));
                        designation.add(rs.getString("emp_num"));
                        designation.add(rs.getString("epf"));
                    }
                    // ALL DATA INTHE TABLE 
                    d.addRow(designation);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 //===================================================================================================================
 // ADD DATA 
    public void addData(){
         //CREATE VARIABLES FOR EMPLOYEE PAGE TESTFILEDS 
            String em_name    =emp_txt.getText();
            Department dep     =(Department)dep_txt.getSelectedItem();
            Designation desig  =(Designation)desig_txt.getSelectedItem();
            String emp_num     = EN_txt.getText();
            String epf_num     = EPF_txt.getText();
            
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst=con.prepareStatement("insert into employee(emp_name,department,designation,emp_num,epf)"
            + "values(?,?,?,?,?)");
            pst.setString(1, em_name);
            pst.setString(2, dep.department);
            pst.setString(3, desig.designation);
            pst.setString(4,emp_num);
            pst.setString(5,epf_num);
            pst.executeUpdate();
            JOptionPane.showMessageDialog( null, "SUCCESFULLY ADDED NEW EMPLOYEE DETAILS");
            update_table();
            
            // CLEAR THE TEXT BOX DATA
            emp_txt.setText("");
            dep_txt.setSelectedIndex(-1);
            desig_txt.setSelectedIndex(-1);
            EN_txt.setText("");
            EPF_txt.setText("");
            emp_txt.requestFocus(); 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
 //===============================================================================================================================   
      
    // UPADATE EMPLOYEE DFETAILS 
    public void updateEmployee(){
           // update button code 
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// table object is d1
        int selectIndex = dep_table.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());// 0 means id value 
        int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO UPDATE THE EMPLOYEE DETAILS " ,
               "warning",JOptionPane.YES_NO_OPTION);
              String Des_name  =emp_txt.getText();
              String dep       = dep_txt.getSelectedItem().toString();
              String des       = desig_txt.getSelectedItem().toString(); 
              String emp_num     = EN_txt.getText();
              String epf_num     = EPF_txt.getText();
              
        // IF FUNCTION AND TRY-CATCH      
        if(dialogResult == JOptionPane.YES_OPTION ){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
            pst=con.prepareStatement("UPDATE employee SET emp_name=?,department=?,designation=?,emp_num=?,"
             + "epf=? WHERE id=?");
            pst.setString(1, Des_name);
            pst.setString(2, dep);
            pst.setString(3, des);
            pst.setString(4, emp_num);
            pst.setString(5, epf_num);
            pst.setInt(6, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog( null, "SUCCESFULLY UPDATED NEW EMPLOYEE");
            update_table(); 
            
            // clear the text box data 
            emp_txt.setText("");
            dep_txt.setSelectedIndex(-1);
            desig_txt.setSelectedIndex(-1);
            EN_txt.setText("");
            EPF_txt.setText("");
            emp_txt.requestFocus();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
       
    }
 //===========================================================================================================================
   // DELETE DATA METHOD  
    public void deleteEmployee(){
        
         DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// table object is d1
        int selectIndex = dep_table.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex,0).toString());// 0 means id value 
        int dialogResult = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE EMPLOYEE DETAILS " 
                ,"warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION ){
            
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost/human_resource","root","");
                 pst=con.prepareStatement("DELETE FROM employee WHERE id=?");
                 pst.setInt(1, id);
                 pst.executeUpdate();
                 JOptionPane.showMessageDialog( null, "SUCCESFULLY DELETED DESIGNATION");
                  update_table();
                 emp_txt.setText("");
                 dep_txt.setSelectedIndex(-1);
                 desig_txt.setSelectedIndex(-1);
                 EN_txt.setText("");
                 EPF_txt.setText("");
                 emp_txt.requestFocus();
             } catch (ClassNotFoundException | SQLException ex) {
                 Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // METHOD CALL
         addData();  
        
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       //METHOD CALL
        updateEmployee();   
    }//GEN-LAST:event_updateActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_updateMouseClicked

    private void dep_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dep_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)dep_table.getModel();// table object is d1
        int selectIndex = dep_table.getSelectedRow();
        
        emp_txt.setText(d1.getValueAt(selectIndex,1).toString());
        dep_txt.setSelectedItem(d1.getValueAt(selectIndex,2).toString());
        desig_txt.setSelectedItem(d1.getValueAt(selectIndex,3).toString());
        EN_txt.setText(d1.getValueAt(selectIndex,4).toString());
        EPF_txt.setText(d1.getValueAt(selectIndex,5).toString());
        
    }//GEN-LAST:event_dep_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         // METHOD CALL   
        deleteEmployee();
    }//GEN-LAST:event_deleteActionPerformed

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
        AddEmployee adE = new  AddEmployee();
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

    private void log_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_outMouseClicked
        // TODO add your handling code here:
         int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?",
                 "Logout", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
        // Close the current page
        this.dispose();

        // Open the add min login 
        Log log = new Log ();
        log.setVisible(true);
    }                                
    }//GEN-LAST:event_log_outMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new AddEmployee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EN_txt;
    private javax.swing.JTextField EPF_txt;
    private javax.swing.JLabel ad_employ;
    private javax.swing.JButton add;
    private javax.swing.JLabel add_dep;
    private javax.swing.JLabel add_desi;
    private javax.swing.JButton delete;
    private javax.swing.JTable dep_table;
    private javax.swing.JComboBox dep_txt;
    private javax.swing.JComboBox desig_txt;
    private javax.swing.JTextField emp_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel log_out;
    private javax.swing.JLabel sea_dep;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
