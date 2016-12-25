package ModuleFrames;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.proteanit.sql.DbUtils;
import utils.userDao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import utils.DBUtils;

/**
@author Dilip Pc
 */

public class PayrollJFrame extends javax.swing.JFrame {

    
    ResultSet rs = null; 
    PreparedStatement pst= null;
    private Connection con;
    double basicPay = 0.0;
    double hra = 0.0;
    double da = 0.0;
    int paidLeaves = 0;
    int workingDays = 0;
    int absentDays = 0;
    double netSalary =0.0;
    double ta = 0.0;
    double medicalAllowance = 0.0;
    double childEduAllowance = 0.0;
    public PayrollJFrame() {
        initComponents();
        con=userDao.getConnection();      
        getPayrollData();
    }
    
    /*
    Method to fetch data from Payroll table
    
    */
        private void getPayrollData()
        {
            try
            {
                String sql = "select * from payroll";
                pst = con.prepareStatement(sql);               
                rs = pst.executeQuery();
                table_Payroll.setModel(DbUtils.resultSetToTableModel(rs));
                System.err.println( new Date().toString()+"::INSIDE Payroll MODULE:::");
                System.err.println( new Date().toString()+"::Payroll table Query:::"+sql);
            }
            catch (Exception e)
            {
                System.err.println( new Date().toString()+"::Not Connected UPDATION!!!!"+e.getMessage());                         
            }
            finally
            {
                try {
                    rs.close();
                    pst.close();
                } 
                catch (SQLException ex) {
                    
                     System.err.println( new Date().toString()+"::SQL EXCEPTION"+ex.getMessage());
                    
                }
            }
    
        }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_HeadingPayroll = new javax.swing.JLabel();
        label_StaffID = new javax.swing.JLabel();
        label_Designation = new javax.swing.JLabel();
        label_BasicPay = new javax.swing.JLabel();
        label_DA = new javax.swing.JLabel();
        label_PaidLeaves = new javax.swing.JLabel();
        label_WorkingDays = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_StaffID = new javax.swing.JTextField();
        txt_Designation = new javax.swing.JTextField();
        txt_BasicPay = new javax.swing.JTextField();
        txt_DA = new javax.swing.JTextField();
        txt_PaidLeaves = new javax.swing.JTextField();
        txt_WorkingDays = new javax.swing.JTextField();
        txt_Salary = new javax.swing.JTextField();
        txt_HRA = new javax.swing.JTextField();
        label_PayrollImage = new javax.swing.JLabel();
        label_MedicalAllowance = new javax.swing.JLabel();
        txt_MedicalAllowance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Update = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        btn_Calculate = new javax.swing.JButton();
        btn_generatePaySlip = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_CA = new javax.swing.JTextField();
        btn_Enter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Payroll = new javax.swing.JTable();
        label_HRA = new javax.swing.JLabel();
        label_AbsentDays = new javax.swing.JLabel();
        txt_TA = new javax.swing.JTextField();
        txt_Absent = new javax.swing.JTextField();
        label_PayrollJFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payroll Module Frame");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        label_HeadingPayroll.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_HeadingPayroll.setForeground(new java.awt.Color(255, 255, 255));
        label_HeadingPayroll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_HeadingPayroll.setText("Payroll Management");
        getContentPane().add(label_HeadingPayroll);
        label_HeadingPayroll.setBounds(470, 30, 329, 48);

        label_StaffID.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_StaffID.setForeground(new java.awt.Color(255, 255, 255));
        label_StaffID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_StaffID.setText("Staff ID *      ");
        getContentPane().add(label_StaffID);
        label_StaffID.setBounds(30, 100, 120, 20);

        label_Designation.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Designation.setForeground(new java.awt.Color(255, 255, 255));
        label_Designation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Designation.setText("Designation *   ");
        getContentPane().add(label_Designation);
        label_Designation.setBounds(30, 140, 120, 20);

        label_BasicPay.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_BasicPay.setForeground(new java.awt.Color(255, 255, 255));
        label_BasicPay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_BasicPay.setText("Basic Pay *     ");
        label_BasicPay.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(label_BasicPay);
        label_BasicPay.setBounds(30, 180, 120, 20);

        label_DA.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_DA.setForeground(new java.awt.Color(255, 255, 255));
        label_DA.setText(" DA *");
        getContentPane().add(label_DA);
        label_DA.setBounds(20, 260, 90, 20);

        label_PaidLeaves.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_PaidLeaves.setForeground(new java.awt.Color(255, 255, 255));
        label_PaidLeaves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_PaidLeaves.setText("Paid Leaves *");
        getContentPane().add(label_PaidLeaves);
        label_PaidLeaves.setBounds(10, 420, 120, 20);

        label_WorkingDays.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_WorkingDays.setForeground(new java.awt.Color(255, 255, 255));
        label_WorkingDays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_WorkingDays.setText("Working Days *");
        getContentPane().add(label_WorkingDays);
        label_WorkingDays.setBounds(20, 460, 110, 20);

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Net Salary");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 540, 110, 20);
        getContentPane().add(txt_StaffID);
        txt_StaffID.setBounds(191, 98, 80, 20);

        txt_Designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DesignationKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Designation);
        txt_Designation.setBounds(191, 135, 80, 20);

        txt_BasicPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_BasicPayKeyTyped(evt);
            }
        });
        getContentPane().add(txt_BasicPay);
        txt_BasicPay.setBounds(190, 180, 80, 20);

        txt_DA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DAKeyTyped(evt);
            }
        });
        getContentPane().add(txt_DA);
        txt_DA.setBounds(190, 260, 80, 20);

        txt_PaidLeaves.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PaidLeavesKeyTyped(evt);
            }
        });
        getContentPane().add(txt_PaidLeaves);
        txt_PaidLeaves.setBounds(190, 420, 80, 20);

        txt_WorkingDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_WorkingDaysKeyTyped(evt);
            }
        });
        getContentPane().add(txt_WorkingDays);
        txt_WorkingDays.setBounds(190, 460, 80, 20);
        getContentPane().add(txt_Salary);
        txt_Salary.setBounds(190, 540, 80, 20);

        txt_HRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_HRAKeyTyped(evt);
            }
        });
        getContentPane().add(txt_HRA);
        txt_HRA.setBounds(190, 220, 80, 20);

        label_PayrollImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-payroll.png"))); // NOI18N
        getContentPane().add(label_PayrollImage);
        label_PayrollImage.setBounds(890, 370, 260, 270);

        label_MedicalAllowance.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_MedicalAllowance.setForeground(new java.awt.Color(255, 255, 255));
        label_MedicalAllowance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_MedicalAllowance.setText("Medical Allowance*");
        getContentPane().add(label_MedicalAllowance);
        label_MedicalAllowance.setBounds(30, 380, 140, 20);

        txt_MedicalAllowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_MedicalAllowanceKeyPressed(evt);
            }
        });
        getContentPane().add(txt_MedicalAllowance);
        txt_MedicalAllowance.setBounds(190, 380, 80, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TA*");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 300, 120, 20);

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update);
        btn_Update.setBounds(200, 590, 150, 30);

        btn_Refresh.setText("Refresh");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh);
        btn_Refresh.setBounds(370, 590, 150, 30);

        btn_Calculate.setText("Calculate Net Salary");
        btn_Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Calculate);
        btn_Calculate.setBounds(20, 590, 150, 30);

        btn_generatePaySlip.setText("Generate Pay Slip");
        btn_generatePaySlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generatePaySlipActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generatePaySlip);
        btn_generatePaySlip.setBounds(540, 590, 150, 30);

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Child Edu. Allowance*");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 340, 160, 20);

        txt_CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CAActionPerformed(evt);
            }
        });
        txt_CA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CAKeyPressed(evt);
            }
        });
        getContentPane().add(txt_CA);
        txt_CA.setBounds(190, 340, 80, 20);

        btn_Enter.setText("Enter");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Enter);
        btn_Enter.setBounds(280, 100, 90, 23);

        table_Payroll.setAutoCreateRowSorter(true);
        table_Payroll.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Payroll.setCellSelectionEnabled(true);
        table_Payroll.setMaximumSize(new java.awt.Dimension(200, 64));
        table_Payroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PayrollMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Payroll);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 100, 880, 260);

        label_HRA.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_HRA.setForeground(new java.awt.Color(255, 255, 255));
        label_HRA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_HRA.setText("HRA *");
        getContentPane().add(label_HRA);
        label_HRA.setBounds(30, 220, 80, 20);

        label_AbsentDays.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_AbsentDays.setForeground(new java.awt.Color(255, 255, 255));
        label_AbsentDays.setText("Absent Days *");
        getContentPane().add(label_AbsentDays);
        label_AbsentDays.setBounds(30, 500, 110, 20);

        txt_TA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TAKeyTyped(evt);
            }
        });
        getContentPane().add(txt_TA);
        txt_TA.setBounds(190, 300, 80, 20);

        txt_Absent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AbsentKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Absent);
        txt_Absent.setBounds(190, 500, 80, 20);

        label_PayrollJFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        label_PayrollJFrame.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                label_PayrollJFrameComponentResized(evt);
            }
        });
        getContentPane().add(label_PayrollJFrame);
        label_PayrollJFrame.setBounds(0, 0, 1290, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
         setSize(1300, 680);
         setLocation(50, 50);         
    }//GEN-LAST:event_formComponentResized

    private void btn_CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalculateActionPerformed
       
        ArrayList<Double> salaryList= new ArrayList<Double>();
        System.err.println( new Date().toString()+"::Inside  Calculation net salary");
        String staffId = txt_StaffID.getText();
        String designation = txt_Designation.getText();       
        basicPay = Double.parseDouble(txt_BasicPay.getText());       
        hra = Double.parseDouble(txt_HRA.getText());        
        da = Double.parseDouble(txt_DA.getText()); 
        
        ta = Double.parseDouble(txt_TA.getText());       
        medicalAllowance = Double.parseDouble(txt_MedicalAllowance.getText());        
        childEduAllowance = Double.parseDouble(txt_CA.getText());        
        
        paidLeaves = Integer.parseInt(txt_PaidLeaves.getText());       
        workingDays = Integer.parseInt(txt_WorkingDays.getText());        
        absentDays = Integer.parseInt(txt_Absent.getText()); 
        salaryList = calculateTax(basicPay,hra,da,ta,medicalAllowance,childEduAllowance,paidLeaves,workingDays,absentDays);
        System.out.println( new Date().toString()+"::Net Salary in btnCalculateMethod"+salaryList.get(0));
        System.out.println( new Date().toString()+"::PF in btnCalculateMethod"+salaryList.get(1));
        netSalary = salaryList.get(0);
        System.out.println( new Date().toString()+"::Net Salary in btnCalculateMethod"+netSalary);
        
    }//GEN-LAST:event_btn_CalculateActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        
        ArrayList<Double> salaryList= new ArrayList<Double>();
        String staffId = txt_StaffID.getText();
        String designation = txt_Designation.getText();
        basicPay = Double.parseDouble(txt_BasicPay.getText());
        hra = Double.parseDouble(txt_HRA.getText());
        da = Double.parseDouble(txt_DA.getText());
        ta = Double.parseDouble(txt_TA.getText());       
        medicalAllowance = Double.parseDouble(txt_MedicalAllowance.getText());        
        childEduAllowance = Double.parseDouble(txt_CA.getText()); 
        paidLeaves = Integer.parseInt(txt_PaidLeaves.getText());
        workingDays = Integer.parseInt(txt_WorkingDays.getText());
        absentDays = Integer.parseInt(txt_Absent.getText()); 
        salaryList = calculateTax(basicPay,hra,da,ta,medicalAllowance,childEduAllowance,paidLeaves,workingDays,absentDays);
        netSalary = salaryList.get(0);
       
        try
        {
            String sql = "update payroll set Designation = '"+designation+"', BasicPay = '"+basicPay+"' , HRA = '"+hra+"', TA = '"+ta+"',MedicalAllowance='"+medicalAllowance+"',ChildEducationAllowance= '"+childEduAllowance+"',DA = '"+da+"',"
                    + " PaidLeaves = '"+paidLeaves+"' , NetSalary = '"+netSalary+"', WorkingDays = '"+workingDays+"', "+ "AbsentDays = '"+absentDays+"'  "
                    + "where StaffID = '"+staffId+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            System.err.println( new Date().toString()+"::Update Query!!!!"+sql);
            
            JOptionPane.showMessageDialog(null,"Details Updated");   
            getPayrollData();
       }
       catch (Exception e)
       {
           System.out.println( new Date().toString()+"::Not Connected!!!!"+e.getMessage());
           
       }
         finally
            {
                try {
                    rs.close();
                    pst.close();
                } 
                catch (SQLException ex) {
                    System.out.println( new Date().toString()+"::SQL EXCEPTION"+ex.getMessage());
                   
                }
            }
        System.err.println( new Date().toString()+"::Net Salary in btnCalculateMethod"+netSalary);
    }//GEN-LAST:event_btn_UpdateActionPerformed

    //insertPayrollData(staffId,designation,basicPay,hra,da,paidLeaves,workingDays,absentDays,netSalary);
    public void insertPayrollData(String staffID,String designation,double basicPay,double hra,double da,int paidLeaves,int workingDays,int absentDays,double netSalary)
    {
                    System.err.println( new Date().toString()+"::Insert Query Executed ");
                    try
                    { 
                            String sql = "insert into payroll values (?,?,?,?,?,?,?,?,?)";
                            pst = con.prepareStatement(sql);
                            pst.setString(1, staffID);
                            pst.setString(2, designation);

                            pst.setDouble(3, basicPay);
                            pst.setDouble(4, hra);
                            pst.setDouble(5, da);

                            pst.setInt(6, paidLeaves);
                            pst.setInt(7, workingDays);
                            pst.setInt(8, absentDays);
                            pst.setDouble(9, netSalary);
                            pst.executeUpdate();
                            System.err.println( new Date().toString()+"::Insert Query  executed"+sql);             
                            getPayrollData();
                            JOptionPane.showMessageDialog(null,"Details Inserted");
                    }
                     catch (Exception e)
                     {
                             System.out.println( new Date().toString()+"::Not Connected!!!!"+e.getMessage());
           
                     }
                     finally
                       {
                           try {
                           rs.close();
                           pst.close();
                       } 
                     catch (SQLException ex) {
                            System.out.println( new Date().toString()+"::SQL EXCEPTION"+ex.getMessage());
                            }
                      }
       
    }
    private void label_PayrollJFrameComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_label_PayrollJFrameComponentResized
         setSize(1400, 800);
         
    }//GEN-LAST:event_label_PayrollJFrameComponentResized

    private void txt_BasicPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BasicPayKeyTyped
           char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_BasicPayKeyTyped

    private void txt_HRAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HRAKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_HRAKeyTyped

    private void txt_DAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DAKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_DAKeyTyped

    private void txt_PaidLeavesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PaidLeavesKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_PaidLeavesKeyTyped

    private void txt_WorkingDaysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_WorkingDaysKeyTyped
          char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_WorkingDaysKeyTyped

    private void txt_AbsentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AbsentKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_AbsentKeyTyped

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
       txt_StaffID.setText("");
       txt_Designation.setText("");
       txt_BasicPay.setText("");       
       txt_HRA.setText("");
       txt_DA.setText("");
       txt_PaidLeaves.setText("");       
       txt_WorkingDays.setText("");
       txt_Absent.setText("");
       txt_Salary.setText("");
       txt_TA.setText("");
       txt_MedicalAllowance.setText("");
       txt_CA.setText("");
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void txt_DesignationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DesignationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DesignationKeyTyped

    private void table_PayrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PayrollMouseClicked
       try
       {
            int row = table_Payroll.getSelectedRow();
            String Table_Click = (table_Payroll.getModel().getValueAt(row, 0).toString());
            String sql = " select * from payroll where StaffID = '"+Table_Click+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String staffID = rs.getString("StaffID");
               txt_StaffID.setText(staffID); 
               
               String designation = rs.getString("Designation");
               txt_Designation.setText(designation);
               
               String basicPay = rs.getDouble("BasicPay")+"";
               txt_BasicPay.setText(basicPay);  
               
               String hra = rs.getDouble("HRA")+"";
               txt_HRA.setText(hra); 
               
               String da = rs.getDouble("DA")+"";
               txt_DA.setText(da); 
               
               String ta = rs.getDouble("TA")+"";
               txt_TA.setText(ta);  
               
               String medicalAllowance = rs.getDouble("MedicalAllowance")+"";
               txt_MedicalAllowance.setText(medicalAllowance); 
               
               String childEduAllowance = rs.getDouble("ChildEducationAllowance")+"";
               txt_CA.setText(childEduAllowance);
                           
               String paidLeaves = rs.getInt("PaidLeaves")+"";
               txt_PaidLeaves.setText(paidLeaves);
               
               String workingDays = rs.getInt("WorkingDays")+"";
               txt_WorkingDays.setText(workingDays); 
               
               String absentDays = rs.getInt("AbsentDays")+"";
               txt_Absent.setText(absentDays); 
               
               String netSalary = rs.getDouble("NetSalary")+"";
               txt_Salary.setText(absentDays);
           
         }
       }
       catch (Exception e)
       {
           System.err.println( new Date().toString()+"::Not Connected!!!!"+e.getMessage());
           
       }
         finally
            {
                try {
                    rs.close();
                    pst.close();
                } 
                catch (SQLException ex) {
                    System.err.println( new Date().toString()+"::SQL EXCEPTION"+ex.getMessage());
                   
                }
            }
    }//GEN-LAST:event_table_PayrollMouseClicked

    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed
         try
       {
            String staffID = txt_StaffID.getText();
            String sql = " select * from payroll where StaffID = '"+staffID+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String designation = rs.getString("Designation");
               txt_Designation.setText(designation);
               
               String basicPay = rs.getDouble("BasicPay")+"";
               txt_BasicPay.setText(basicPay);  
               
               String hra = rs.getDouble("HRA")+"";
               txt_HRA.setText(hra); 
               
               String da = rs.getDouble("DA")+"";
               txt_DA.setText(da); 
               
               String ta = rs.getDouble("TA")+"";
               txt_TA.setText(ta);  
               
               String medicalAllowance = rs.getDouble("MedicalAllowance")+"";
               txt_MedicalAllowance.setText(medicalAllowance); 
               
               String childEduAllowance = rs.getDouble("ChildEducationAllowance")+"";
               txt_CA.setText(childEduAllowance);
                           
               String paidLeaves = rs.getInt("PaidLeaves")+"";
               txt_PaidLeaves.setText(paidLeaves);
               
               String workingDays = rs.getInt("WorkingDays")+"";
               txt_WorkingDays.setText(workingDays); 
               
               String absentDays = rs.getInt("AbsentDays")+"";
               txt_Absent.setText(absentDays); 
               
               String netSalary = rs.getDouble("NetSalary")+"";
               txt_Salary.setText(absentDays);
           
         }
            
            else
            {
                JOptionPane.showMessageDialog(null,"Staff ID Incorrect !");
            }
       }
       catch (Exception e)
       {
           System.err.println( new Date().toString()+"::Not Connected!!!!"+e.getMessage());
           
       }
         finally
            {
                try {
                    rs.close();
                    pst.close();
                } 
                catch (SQLException ex) {
                    System.err.println( new Date().toString()+"::SQL EXCEPTION"+ex.getMessage());
                   
                }
            }
    }//GEN-LAST:event_btn_EnterActionPerformed

    private void btn_generatePaySlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generatePaySlipActionPerformed
        
        ArrayList<Double> salaryList= new ArrayList<Double>();
        ArrayList<String> salaryComponentsForPDF= new ArrayList<String>();
        String staffId = txt_StaffID.getText();
        String designation = txt_Designation.getText();       
        basicPay = Double.parseDouble(txt_BasicPay.getText());       
        hra = Double.parseDouble(txt_HRA.getText());        
        da = Double.parseDouble(txt_DA.getText()); 
        System.out.println( new Date().toString()+":Payroll Jframe da ::"+da);
        
        ta = Double.parseDouble(txt_TA.getText());   
        System.out.println( new Date().toString()+":Payroll Jframe ta ::"+ta);
        medicalAllowance = Double.parseDouble(txt_MedicalAllowance.getText()); 
        System.out.println( new Date().toString()+":Payroll Jframe da ::"+medicalAllowance);
        childEduAllowance = Double.parseDouble(txt_CA.getText());        
        System.out.println( new Date().toString()+":Payroll Jframe da ::"+childEduAllowance);
        paidLeaves = Integer.parseInt(txt_PaidLeaves.getText());   
        System.out.println( new Date().toString()+":Payroll Jframe da ::"+paidLeaves);
        workingDays = Integer.parseInt(txt_WorkingDays.getText()); 
        System.out.println( new Date().toString()+":Payroll Jframe da ::"+workingDays);
        absentDays = Integer.parseInt(txt_Absent.getText()); 
        System.out.println( new Date().toString()+":Payroll Jframe da ::"+absentDays);
        salaryList = calculateTax(basicPay,hra,da,ta,medicalAllowance,childEduAllowance,paidLeaves,workingDays,absentDays);
        
        String finalSalary = salaryList.get(0)+"";
        String providentFund = salaryList.get(1)+"";
        
        
        salaryComponentsForPDF.add(basicPay+"");
        salaryComponentsForPDF.add(hra+"");
        salaryComponentsForPDF.add(da+"");
        salaryComponentsForPDF.add(ta+"");
        salaryComponentsForPDF.add(medicalAllowance+"");
        salaryComponentsForPDF.add(childEduAllowance+"");
        salaryComponentsForPDF.add(paidLeaves+"");
        salaryComponentsForPDF.add(workingDays+"");
        salaryComponentsForPDF.add(absentDays+"");
        salaryComponentsForPDF.add(providentFund);
        salaryComponentsForPDF.add(finalSalary);
        
        salaryComponentsForPDF.add(staffId);
        salaryComponentsForPDF.add(designation);
        
        DBUtils  dbutil = new DBUtils();
        dbutil.generatePaySlipPDF(salaryComponentsForPDF);
        
    }//GEN-LAST:event_btn_generatePaySlipActionPerformed

    private void txt_TAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TAKeyTyped
         char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_TAKeyTyped

    private void txt_CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CAActionPerformed

    private void txt_CAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CAKeyPressed
         char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_CAKeyPressed

    private void txt_MedicalAllowanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MedicalAllowanceKeyPressed
         char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_MedicalAllowanceKeyPressed

      /*
    Method to calculate Net Salary
    */    
     public ArrayList<Double> calculateTax(double basicPay,double hra,double da,double ta,double medAllowance,double ca,int paidLeaves,int workingDays,int absentDays)
    {
        System.err.println( new Date().toString()+"::Calculate Net Salary Method ::");
        ArrayList<Double> salaryComponents = new ArrayList<Double>();
        
        double netSalary = 0.0;       
        double grossPay = 0.0;
        double oneDaysalary = 0.0;
        double absentDaysSalary = 0.0;
        double paidLeavesSalary = 0.0;
        double taxDeduction = 0.0;
        double pf = 0.0;
        double yearlyIncome = 0.0;
        oneDaysalary = basicPay /31;
        pf = basicPay *15 /100;
         
        System.err.println( new Date().toString()+"::oneDaysalary ::"+oneDaysalary);        
        grossPay =  (oneDaysalary * workingDays) ;
        
        if(absentDays >0)
        {
            absentDaysSalary = oneDaysalary * absentDays;
            grossPay = grossPay - absentDaysSalary;
            System.err.println( new Date().toString()+"::grossPay for absentDays ::"+grossPay);
        }
        
        if(paidLeaves > 0)
        {
            paidLeavesSalary = oneDaysalary * paidLeaves;
            grossPay = grossPay + paidLeavesSalary;
            System.err.println( new Date().toString()+"::grossPay paid Leaves ::"+grossPay);
        }
        System.err.println( new Date().toString()+"::workingDays ::"+workingDays); 
        System.err.println( new Date().toString()+"::hra ::"+hra);
        System.err.println( new Date().toString()+"::da ::"+da);
        grossPay = grossPay + hra + da + ta + medicalAllowance+childEduAllowance;
        System.err.println( new Date().toString()+"::oneDaysalary ::"+oneDaysalary);
        System.out.println( new Date().toString()+"::grossPay ::"+grossPay);        
        
        grossPay = Math.round(grossPay*100)/100;
        System.out.println( grossPay+"::Gross Pay:1111:");          
        
        taxDeduction = grossPay * .10;
        System.err.println( new Date().toString()+"::taxDeduction ::"+taxDeduction);       
        netSalary = grossPay - taxDeduction - pf;
        
        System.out.println( grossPay+"::Gross Pay 808::");
        
        System.out.println( new Date().toString()+"::Calculate Net Salary Method ::");
        
        System.out.println( new Date().toString()+"::taxDeduction  ::"+taxDeduction);
        System.out.println( new Date().toString()+"::netSalary 814 ::"+netSalary+"::PF IS "+pf);
        netSalary = Math.round(netSalary*100)/100;
        String textFieldSalary = netSalary + "";
        txt_Salary.setText(textFieldSalary);

        JOptionPane.showMessageDialog(null,"Total Salary..:"+netSalary);
        yearlyIncome = netSalary *12 ;
        
        
        System.out.println( new Date().toString()+"::yearlyIncome 818 ::"+yearlyIncome);
        yearlyIncome =Math.round(yearlyIncome*100)/100;
        
        double incometax = 0.0;
        
        if(yearlyIncome <= 200000 )
        {
            incometax = 0;
            System.out.println("Salary arnd 2 lac");
        }
        
        else if (yearlyIncome > 200000 && yearlyIncome <= 250000 )
        {
            incometax = (netSalary * 10)/100;
            yearlyIncome = yearlyIncome - incometax;
            
            System.out.println("Salary above 2 lac"+incometax+ ":: yearlyIncome"+yearlyIncome);
        }
        
        else if (netSalary > 250000 && netSalary <= 500000 )
        {
            incometax = (yearlyIncome * 15)/100;
            yearlyIncome = yearlyIncome - incometax;
            System.out.println("Salary 250000 to 5 lac"+incometax+ ":: yearlyIncome"+yearlyIncome);
        }
        
         else if (yearlyIncome > 500000 && yearlyIncome <= 1000000 )
        {
            incometax = (netSalary * 20)/100;
            yearlyIncome = yearlyIncome - incometax;
            System.out.println("Salary above 5 lac and 10 lac"+incometax+ ":: yearlyIncome"+yearlyIncome);
        }
        
         else if (yearlyIncome > 1000000 )
        {
            incometax = (yearlyIncome * 30)/100;
            yearlyIncome = yearlyIncome - incometax;
            System.out.println("Salary above 10 lac"+incometax+ ":: yearlyIncome"+yearlyIncome);
        }
        
         else if (yearlyIncome > 10000000 )
        {
            double surcharge = 0.0;
            incometax = (yearlyIncome * 30)/100;
            surcharge = (yearlyIncome *30)/100;
            yearlyIncome = yearlyIncome - incometax - surcharge;
            System.out.println("Salary above 1 crore lac"+incometax+ ":: yearlyIncome"+yearlyIncome+"::surcharge"+surcharge);
        }
   
        salaryComponents.add(netSalary);
        salaryComponents.add(pf);
        return salaryComponents;
    }      
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayrollJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calculate;
    private javax.swing.JButton btn_Enter;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_generatePaySlip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_AbsentDays;
    private javax.swing.JLabel label_BasicPay;
    private javax.swing.JLabel label_DA;
    private javax.swing.JLabel label_Designation;
    private javax.swing.JLabel label_HRA;
    private javax.swing.JLabel label_HeadingPayroll;
    private javax.swing.JLabel label_MedicalAllowance;
    private javax.swing.JLabel label_PaidLeaves;
    private javax.swing.JLabel label_PayrollImage;
    private javax.swing.JLabel label_PayrollJFrame;
    private javax.swing.JLabel label_StaffID;
    private javax.swing.JLabel label_WorkingDays;
    private javax.swing.JTable table_Payroll;
    private javax.swing.JTextField txt_Absent;
    private javax.swing.JTextField txt_BasicPay;
    private javax.swing.JTextField txt_CA;
    private javax.swing.JTextField txt_DA;
    private javax.swing.JTextField txt_Designation;
    private javax.swing.JTextField txt_HRA;
    private javax.swing.JTextField txt_MedicalAllowance;
    private javax.swing.JTextField txt_PaidLeaves;
    private javax.swing.JTextField txt_Salary;
    private javax.swing.JTextField txt_StaffID;
    private javax.swing.JTextField txt_TA;
    private javax.swing.JTextField txt_WorkingDays;
    // End of variables declaration//GEN-END:variables
}
