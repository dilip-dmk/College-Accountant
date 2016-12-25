 package ModuleFrames;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.*;
import utils.userDao;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;

/**
@author Dilip Pc
 */
 
public class StudentJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public StudentJFrame() {
        initComponents();
        con=userDao.getConnection();
        getStudentData();
    }
/*
    Method to fetch data from library table
    
    */
private void getStudentData()
{
            try
            {
                String sql = "select * from student";
                pst = con.prepareStatement(sql);               
                rs = pst.executeQuery();
                table_Student.setModel(DbUtils.resultSetToTableModel(rs));
                System.err.println( new Date().toString()+"::INSIDE Student MODULE:::");
                System.err.println( new Date().toString()+"::Student table Query:::"+sql);
            }
            catch (Exception e)
            {
                System.err.println( new Date().toString()+"::Not Connected getLibrary!!!!"+e.getMessage());                         
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        librarayJFrame1 = new ModuleFrames.LibrarayJFrame();
        label_Heading = new javax.swing.JLabel();
        label_StudentID = new javax.swing.JLabel();
        label_StudentName = new javax.swing.JLabel();
        label_mobile = new javax.swing.JLabel();
        label_Email = new javax.swing.JLabel();
        label_Dues = new javax.swing.JLabel();
        txt_StudentID = new javax.swing.JTextField();
        txt_StudentName = new javax.swing.JTextField();
        txt_Mobile = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Dues = new javax.swing.JTextField();
        btn_Sms = new javax.swing.JButton();
        btn_Enter = new javax.swing.JButton();
        btn_Email = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Student = new javax.swing.JTable();
        label_LibraryMainFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Module Frame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(400, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        label_Heading.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_Heading.setForeground(new java.awt.Color(255, 255, 255));
        label_Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Heading.setText("Student Module");
        getContentPane().add(label_Heading);
        label_Heading.setBounds(510, 30, 240, 50);

        label_StudentID.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        label_StudentID.setForeground(new java.awt.Color(255, 255, 255));
        label_StudentID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_StudentID.setText("Student ID    :");
        getContentPane().add(label_StudentID);
        label_StudentID.setBounds(0, 110, 140, 30);

        label_StudentName.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        label_StudentName.setForeground(new java.awt.Color(255, 255, 255));
        label_StudentName.setText("Name          :");
        getContentPane().add(label_StudentName);
        label_StudentName.setBounds(10, 160, 130, 30);

        label_mobile.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        label_mobile.setForeground(new java.awt.Color(255, 255, 255));
        label_mobile.setText("Mobile        :");
        getContentPane().add(label_mobile);
        label_mobile.setBounds(10, 220, 130, 20);

        label_Email.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        label_Email.setForeground(new java.awt.Color(255, 255, 255));
        label_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Email.setText("Email         :");
        getContentPane().add(label_Email);
        label_Email.setBounds(10, 270, 130, 20);

        label_Dues.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        label_Dues.setForeground(new java.awt.Color(255, 255, 255));
        label_Dues.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_Dues.setText("Total Dues");
        getContentPane().add(label_Dues);
        label_Dues.setBounds(10, 320, 120, 20);

        txt_StudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StudentIDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_StudentID);
        txt_StudentID.setBounds(150, 120, 130, 20);
        getContentPane().add(txt_StudentName);
        txt_StudentName.setBounds(150, 170, 130, 20);

        txt_Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MobileActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Mobile);
        txt_Mobile.setBounds(150, 220, 130, 20);
        getContentPane().add(txt_Email);
        txt_Email.setBounds(150, 270, 130, 20);

        txt_Dues.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DuesKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Dues);
        txt_Dues.setBounds(150, 320, 130, 20);

        btn_Sms.setText("SEND SMS");
        btn_Sms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SmsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Sms);
        btn_Sms.setBounds(150, 370, 130, 30);

        btn_Enter.setText("Enter");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Enter);
        btn_Enter.setBounds(300, 120, 90, 23);

        btn_Email.setText("SEND EMAIL");
        btn_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Email);
        btn_Email.setBounds(290, 370, 130, 30);

        btn_Refresh.setText("REFRESH");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh);
        btn_Refresh.setBounds(430, 370, 130, 30);

        btn_Update.setText("UPDATE");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update);
        btn_Update.setBounds(10, 370, 130, 30);

        table_Student.setModel(new javax.swing.table.DefaultTableModel(
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
        table_Student.setMaximumSize(new java.awt.Dimension(200, 64));
        table_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_StudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Student);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 120, 770, 120);

        label_LibraryMainFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        label_LibraryMainFrame.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                label_LibraryMainFrameComponentAdded(evt);
            }
        });
        getContentPane().add(label_LibraryMainFrame);
        label_LibraryMainFrame.setBounds(0, 0, 1350, 510);
        label_LibraryMainFrame.getAccessibleContext().setAccessibleName("Library Main Frame");

        getAccessibleContext().setAccessibleParent(label_LibraryMainFrame);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_StudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StudentIDActionPerformed

    private void txt_MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MobileActionPerformed

    private void table_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_StudentMouseClicked
        
         try
       {
            int row = table_Student.getSelectedRow();
            String Table_Click = (table_Student.getModel().getValueAt(row, 0).toString());
            String sql = " select * from student where StudentID = '"+Table_Click+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String studID = rs.getString("StudentID");
               txt_StudentID.setText(studID);            
           
               
               String name = rs.getString("StudentName");
               txt_StudentName.setText(name);
               
               String mobile = rs.getString("Mobile");
               txt_Mobile.setText(mobile);  
               
               String email = rs.getString("Email");
               txt_Email.setText(email); 
               
               String totaldues = rs.getDouble("TotalDues")+"";
               txt_Dues.setText(totaldues); 
           
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
    }//GEN-LAST:event_table_StudentMouseClicked
/**/
    
    
    
    // End no of days method
    private void label_LibraryMainFrameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_label_LibraryMainFrameComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_label_LibraryMainFrameComponentAdded

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        setSize(1200, 500);
        setLocation(60, 100);
    }//GEN-LAST:event_formComponentResized

    private void txt_DuesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DuesKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_DuesKeyTyped

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
         try
       {
                    
            String studentID = txt_StudentID.getText();
            String totalDues =  txt_Dues.getText();
            
            String sql = "update student set TotalDues = '"+totalDues+"' where StudentID = '"+studentID+"'";
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
       getStudentData();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_SmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SmsActionPerformed
        String studentID = txt_StudentID.getText();
        String totaldues =  txt_Dues.getText();
        String mobile = txt_Mobile.getText();
        String name =  txt_StudentName.getText();  
        
        boolean result=sendSms(mobile,name,totaldues);
        
        System.out.println("result value"+result);
        
        if(result)
        {
            JOptionPane.showMessageDialog(null,"Message Sent Successfully.");
        }
        else
        {
            System.err.println( new Date().toString()+"::Error Sending Message !");
            JOptionPane.showMessageDialog(null,"Error Sending SMS.");
        }
            
            
    }//GEN-LAST:event_btn_SmsActionPerformed

    private void btn_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EmailActionPerformed
        
        String name = txt_StudentName.getText();
        String email = txt_Email.getText();
        String dues = txt_Dues.getText();
        
        final String username = "collegeacct9@gmail.com";
        final String password = "dilip1234";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        try
        {
            Message message = new MimeMessage (session);
            message.setFrom(new InternetAddress ("collegeacct9@gmail.com")); // To email id
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email)); // to email id
            message.setSubject("Alert regarding due amount !");
            message.setContent("<h:body style = background-color:white; font-family:verdana; color:#0066CC;>"
            +"Dear "+name+",<br><br>"
            +"This is to inform you that due of Rs "+dues+" is pending against you.<br>"
            +"You are requested to pay the due amount as soon as possible. <br><br>"
            +"Regards,<br><br>"
            +"College Accountant"
            +"</body>","text/html; charset=utf-8");
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Email sent successfully");
            System.err.println ("Email sent successfully");
        }   
        
        catch (MessagingException e)
        {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btn_EmailActionPerformed

    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed
       try
       {
             
            String studID = txt_StudentID.getText();
            String sql = " select * from student where StudentID = '"+studID+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String name = rs.getString("Student Name");
               txt_StudentName.setText(name);
               
               String mobile = rs.getString("Mobile");
               txt_Mobile.setText(mobile);  
               
               String email = rs.getString("Email");
               txt_Email.setText(email); 
               
               String dues = rs.getDouble("Dues")+"";
               txt_Dues.setText(dues); 
                System.out.println("1");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Student ID Incorrect !");
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

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
               txt_StudentID.setText("");
               txt_StudentName.setText("");
               txt_Mobile.setText("");
               txt_Email.setText(""); 
               txt_Dues.setText("");  
    }//GEN-LAST:event_btn_RefreshActionPerformed

//         public static boolean sendSms(String mobile,String name,String dues)
//	{
//            String data = "";
//	    StringBuffer messageContent = new StringBuffer("");
//            messageContent.append("Dear '"+name+"',");
//            messageContent.append("You have amount '"+dues+"' left to pay towards your fee.");
//            messageContent.append("Kindly pay your dues as soon as possible !");
//            
//          
//            try
//            {
//            data += "method=sendMessage";        
//	    data += "&userid="+"9999434520"; // your loginId
//	    data += "&password=" + URLEncoder.encode("test1234", "UTF-8"); // your password
//	    data += "&msg=" + URLEncoder.encode(messageContent.toString(),"UTF-8");
//	    data += "&send_to=" + URLEncoder.encode(mobile, "UTF-8"); // a valid 10 digit phone no.
//	    data += "&v=1.0";
//                
//               
//            
//            URL url = new URL("http://smsworld.way2webworld.com/sendsms.php?username=apiit&password=letmein&sender=Default&mobile='"+mobile+"'&message='"+messageContent+"'&route=P");
//            System.out.println("URL::11::"+url);
// 	    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//	    conn.setRequestMethod("GET");
//            conn.setDoOutput(true);
//	    conn.setDoInput(true);
//	    conn.setUseCaches(false);
//	    conn.connect();
//			
//	    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//	    String line;
//	    StringBuffer buffer = new StringBuffer();
//	    while ((line = rd.readLine()) != null)
//	    {
//		buffer.append(line).append("\n");
//	    }
//			
//	    rd.close();
//	    conn.disconnect();
//            System.out.println("URL::22::"+url);
//                                
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//                return false;
//            }
//            
//           
//            return true;
//        }
public static boolean sendSms(String mobile,String name,String dues)
	{
            String data = "";
	    StringBuffer messageContent = new StringBuffer("");
            messageContent.append("Dear +"+name+"");
            messageContent.append("+ Rs.+"+dues+" +left+to+be+paid.+");
            messageContent.append("+Kindly+pay+your+dues.+");
            messageContent.append("+-+College+Accountant");
            
          
            try
            {
                String url = "http://smsworld.way2webworld.com/sendsms.php?username=apiit&password=letmein&sender=Default&mobile="+mobile+"&message="+messageContent+"&route=P";
		String smsApiResponse = sendMySMS(url);
		System.out.println(smsApiResponse);                           
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
            
           
            return true;
        }
         
         public static String sendMySMS(String url){
	    StringBuilder output = new StringBuilder();
	    try{
	      URL hp = new URL(url);
	      System.out.println(url);
	      URLConnection hpCon = hp.openConnection(); 
	      BufferedReader in = new BufferedReader(new InputStreamReader(hpCon.getInputStream()));
	      String inputLine;
	      while ((inputLine = in.readLine()) != null)
	        output.append(inputLine);
	      in.close();
	    }catch (Exception e) {
	      e.printStackTrace();
	    }
	    return output.toString();
	  }

    
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
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Email;
    private javax.swing.JButton btn_Enter;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Sms;
    private javax.swing.JButton btn_Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Dues;
    private javax.swing.JLabel label_Email;
    private javax.swing.JLabel label_Heading;
    private javax.swing.JLabel label_LibraryMainFrame;
    private javax.swing.JLabel label_StudentID;
    private javax.swing.JLabel label_StudentName;
    private javax.swing.JLabel label_mobile;
    private ModuleFrames.LibrarayJFrame librarayJFrame1;
    private javax.swing.JTable table_Student;
    private javax.swing.JTextField txt_Dues;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Mobile;
    private javax.swing.JTextField txt_StudentID;
    private javax.swing.JTextField txt_StudentName;
    // End of variables declaration//GEN-END:variables
}