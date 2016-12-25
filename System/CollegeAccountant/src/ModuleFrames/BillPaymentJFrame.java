 package ModuleFrames;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import utils.userDao;

/**
@author Dilip Pc
 */

public class BillPaymentJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public BillPaymentJFrame() {
        initComponents();
        con=userDao.getConnection();
        getBillData();
    }
    
           
private void getBillData()
{
            try
            {
                String sql = "select BillNo,BillDate,DueDate,PaidDate,PaymentType,Amount from billpayment";
                pst = con.prepareStatement(sql);               
                rs = pst.executeQuery();                
                tableBillPayment.setModel(DbUtils.resultSetToTableModel(rs));                
            }
            catch (Exception e)
            {
                System.err.println("Error while fetching Bill Payment data!!!!"+e.getMessage());
                System.out.println("Error while fetching Bill Payment data!!!!"+e.getMessage());           
            }
            finally
            {
                try {
                    rs.close();
                    pst.close();
                } 
                catch (SQLException ex) 
                {
                    
                     System.err.println("SQL EXCEPTION"+ex.getMessage());
                    
                }
            }
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_BillPaymentHeading = new javax.swing.JLabel();
        label_BillNumber = new javax.swing.JLabel();
        label_Bill_Date = new javax.swing.JLabel();
        label_DueDate = new javax.swing.JLabel();
        label_Paid_Date = new javax.swing.JLabel();
        label_Payment_Type = new javax.swing.JLabel();
        label_Amount = new javax.swing.JLabel();
        txt_BillNumber = new javax.swing.JTextField();
        txt_PaymentType = new javax.swing.JTextField();
        txt_Amount = new javax.swing.JTextField();
        btn_Enter = new javax.swing.JButton();
        jDate_BillDate = new com.toedter.calendar.JDateChooser();
        jDate_PaidDate = new com.toedter.calendar.JDateChooser();
        jDate_DueDate = new com.toedter.calendar.JDateChooser();
        btn_Update = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBillPayment = new javax.swing.JTable();
        label_MainFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bill Payments Module Frame");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        label_BillPaymentHeading.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_BillPaymentHeading.setForeground(new java.awt.Color(255, 255, 255));
        label_BillPaymentHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_BillPaymentHeading.setText("Bill Payment Module");
        getContentPane().add(label_BillPaymentHeading);
        label_BillPaymentHeading.setBounds(440, 20, 310, 60);

        label_BillNumber.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_BillNumber.setForeground(new java.awt.Color(255, 255, 255));
        label_BillNumber.setText("Bill Number");
        getContentPane().add(label_BillNumber);
        label_BillNumber.setBounds(10, 100, 110, 20);

        label_Bill_Date.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Bill_Date.setForeground(new java.awt.Color(255, 255, 255));
        label_Bill_Date.setText("Bill Date");
        getContentPane().add(label_Bill_Date);
        label_Bill_Date.setBounds(10, 140, 110, 20);

        label_DueDate.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_DueDate.setForeground(new java.awt.Color(255, 255, 255));
        label_DueDate.setText("Due Date ");
        getContentPane().add(label_DueDate);
        label_DueDate.setBounds(10, 180, 110, 20);

        label_Paid_Date.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Paid_Date.setForeground(new java.awt.Color(255, 255, 255));
        label_Paid_Date.setText("Paid Date");
        getContentPane().add(label_Paid_Date);
        label_Paid_Date.setBounds(10, 220, 110, 20);

        label_Payment_Type.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Payment_Type.setForeground(new java.awt.Color(255, 255, 255));
        label_Payment_Type.setText("Amount");
        getContentPane().add(label_Payment_Type);
        label_Payment_Type.setBounds(10, 260, 110, 20);

        label_Amount.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Amount.setForeground(new java.awt.Color(255, 255, 255));
        label_Amount.setText("Payment Type");
        getContentPane().add(label_Amount);
        label_Amount.setBounds(10, 300, 110, 20);
        label_Amount.getAccessibleContext().setAccessibleName("label_Quantitiy");

        getContentPane().add(txt_BillNumber);
        txt_BillNumber.setBounds(150, 100, 110, 20);

        txt_PaymentType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PaymentTypeKeyTyped(evt);
            }
        });
        getContentPane().add(txt_PaymentType);
        txt_PaymentType.setBounds(150, 260, 110, 20);

        txt_Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_AmountKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Amount);
        txt_Amount.setBounds(150, 300, 110, 20);

        btn_Enter.setText("Enter");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Enter);
        btn_Enter.setBounds(270, 100, 90, 20);
        getContentPane().add(jDate_BillDate);
        jDate_BillDate.setBounds(150, 140, 110, 20);
        getContentPane().add(jDate_PaidDate);
        jDate_PaidDate.setBounds(150, 220, 110, 20);
        getContentPane().add(jDate_DueDate);
        jDate_DueDate.setBounds(150, 180, 110, 20);

        btn_Update.setText("UPDATE");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update);
        btn_Update.setBounds(20, 370, 110, 30);

        btn_Refresh.setText("REFRESH");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh);
        btn_Refresh.setBounds(150, 370, 110, 30);

        tableBillPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBillPayment.setMaximumSize(new java.awt.Dimension(120, 64));
        tableBillPayment.setPreferredSize(new java.awt.Dimension(120, 64));
        tableBillPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBillPaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBillPayment);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 100, 820, 100);

        label_MainFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        getContentPane().add(label_MainFrame);
        label_MainFrame.setBounds(0, 0, 1210, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
       
         setSize(1220, 600);
         setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void tableBillPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBillPaymentMouseClicked
          try
       {
            int row = tableBillPayment.getSelectedRow();
            String Table_Click = (tableBillPayment.getModel().getValueAt(row, 0).toString());
            String sql = " select * from billpayment where BillNo = '"+Table_Click+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String invoiceNo = rs.getString("BillNo");
               txt_BillNumber.setText(invoiceNo);  
               
               java.util.Date billDate = rs.getDate("BillDate") ;
               jDate_BillDate.setDate(billDate); 
               
               java.util.Date dueDate = rs.getDate("DueDate") ;
               jDate_DueDate.setDate(dueDate); 
               
               java.util.Date paidDate = rs.getDate("PaidDate") ;
               jDate_PaidDate.setDate(paidDate); 
               
               String paymentType = rs.getString("PaymentType");
               txt_Amount.setText(paymentType); 
               
               String amount = rs.getDouble("Amount")+"";
               txt_PaymentType.setText(amount); 
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
    }//GEN-LAST:event_tableBillPaymentMouseClicked

    private void txt_PaymentTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PaymentTypeKeyTyped
        
    }//GEN-LAST:event_txt_PaymentTypeKeyTyped

    private void txt_AmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AmountKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_AmountKeyTyped

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
            try
            {                    
            String billNo      =  txt_BillNumber.getText();  
            Date billDate      =  jDate_BillDate.getDate();
            Date dueDate       =  jDate_DueDate.getDate();
            Date paidDate      =  jDate_PaidDate.getDate();             
            String paymentType =  txt_PaymentType.getText();            
            String amount      =  txt_Amount.getText();            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String billDateFinal = dateFormat.format(billDate).toString();
            String dueDateFinal = dateFormat.format(dueDate).toString();
            String paidDateFinal = dateFormat.format(paidDate).toString();
            
            String sql = "update billpayment set billDate = '"+billDateFinal+"', DueDate = '"+dueDateFinal+"' , PaidDate = '"+paidDateFinal+"', PaymentType = '"+paymentType+"', Amount = '"+amount+"' where BillNo = '"+billNo+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            System.err.println( new Date().toString()+"::Update Query!!!!"+sql);            
            JOptionPane.showMessageDialog(null,"Details Updated");                  
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
       getBillData();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        txt_BillNumber.setText("");  
        txt_Amount.setText("");
        txt_PaymentType.setText("");
        txt_Amount.setText("");
        
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed
        try
       {
            String billNo = txt_BillNumber.getText();
            String sql = " select * from billpayment where BillNo = '"+billNo+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               java.util.Date billDate = rs.getDate("BillDate") ;
               jDate_BillDate.setDate(billDate); 
                              
               java.util.Date dueDate = rs.getDate("DueDate") ;
               jDate_DueDate.setDate(dueDate);
                                
               java.util.Date paidDate = rs.getDate("PaidDate") ;
               jDate_PaidDate.setDate(paidDate);
               
               String paymentType = rs.getString("PaymentType");
               txt_PaymentType.setText(paymentType);  
               
               String amount = rs.getDouble("Amount")+"";
               txt_Amount.setText(amount); 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry, invoice number is incorrect !");
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
            java.util.logging.Logger.getLogger(BillPaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillPaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillPaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillPaymentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillPaymentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Enter;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Update;
    private com.toedter.calendar.JDateChooser jDate_BillDate;
    private com.toedter.calendar.JDateChooser jDate_DueDate;
    private com.toedter.calendar.JDateChooser jDate_PaidDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Amount;
    private javax.swing.JLabel label_BillNumber;
    private javax.swing.JLabel label_BillPaymentHeading;
    private javax.swing.JLabel label_Bill_Date;
    private javax.swing.JLabel label_DueDate;
    private javax.swing.JLabel label_MainFrame;
    private javax.swing.JLabel label_Paid_Date;
    private javax.swing.JLabel label_Payment_Type;
    private javax.swing.JTable tableBillPayment;
    private javax.swing.JTextField txt_Amount;
    private javax.swing.JTextField txt_BillNumber;
    private javax.swing.JTextField txt_PaymentType;
    // End of variables declaration//GEN-END:variables
}
