package ModuleFrames;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
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

public class HostelJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public HostelJFrame() {
        initComponents();
        con=userDao.getConnection();
        getHostelData();
    }
    
        
private void getHostelData()
{
    try
            {
                String sql = "select * from hostel";
                pst = con.prepareStatement(sql);               
                rs = pst.executeQuery();                
                tabelHostel.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
            catch (Exception e)
            {
                System.err.println("Error while fetching hostel data!!!!"+e.getMessage());
                System.out.println("Error while fetching hostel data!!!!"+e.getMessage());           
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

        label_hostel = new javax.swing.JLabel();
        label_StudentID = new javax.swing.JLabel();
        label_RoomType = new javax.swing.JLabel();
        label_Fee = new javax.swing.JLabel();
        label_Loundry = new javax.swing.JLabel();
        label_Electricity = new javax.swing.JLabel();
        label_Newspaper = new javax.swing.JLabel();
        label_Housekeeping = new javax.swing.JLabel();
        label_Fine = new javax.swing.JLabel();
        txt_Fee = new javax.swing.JTextField();
        txt_Laundry = new javax.swing.JTextField();
        txt_Electricity = new javax.swing.JTextField();
        txt_Newspaper = new javax.swing.JTextField();
        txt_houseKeeping = new javax.swing.JTextField();
        txt_Fine = new javax.swing.JTextField();
        txt_Roomtype = new javax.swing.JTextField();
        txt_StudentID = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_Enter = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelHostel = new javax.swing.JTable();
        label_MainFrameHostel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hostel Module Frame ");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        label_hostel.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_hostel.setForeground(new java.awt.Color(255, 255, 255));
        label_hostel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_hostel.setText("Hostel Module");
        getContentPane().add(label_hostel);
        label_hostel.setBounds(500, 50, 270, 40);

        label_StudentID.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_StudentID.setForeground(new java.awt.Color(255, 255, 255));
        label_StudentID.setText("Student ID");
        getContentPane().add(label_StudentID);
        label_StudentID.setBounds(20, 110, 110, 20);

        label_RoomType.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_RoomType.setForeground(new java.awt.Color(255, 255, 255));
        label_RoomType.setText("Room Type");
        getContentPane().add(label_RoomType);
        label_RoomType.setBounds(20, 150, 110, 20);

        label_Fee.setForeground(new java.awt.Color(255, 255, 255));
        label_Fee.setText("Fee");
        getContentPane().add(label_Fee);
        label_Fee.setBounds(20, 190, 110, 20);

        label_Loundry.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Loundry.setForeground(new java.awt.Color(255, 255, 255));
        label_Loundry.setText("Laundry");
        getContentPane().add(label_Loundry);
        label_Loundry.setBounds(20, 230, 110, 20);

        label_Electricity.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Electricity.setForeground(new java.awt.Color(255, 255, 255));
        label_Electricity.setText("Electricity");
        getContentPane().add(label_Electricity);
        label_Electricity.setBounds(20, 270, 110, 20);

        label_Newspaper.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Newspaper.setForeground(new java.awt.Color(255, 255, 255));
        label_Newspaper.setText("Newspaper / Magazine");
        getContentPane().add(label_Newspaper);
        label_Newspaper.setBounds(20, 310, 150, 20);

        label_Housekeeping.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Housekeeping.setForeground(new java.awt.Color(255, 255, 255));
        label_Housekeeping.setText("HouseKeeping");
        getContentPane().add(label_Housekeeping);
        label_Housekeeping.setBounds(20, 350, 110, 20);

        label_Fine.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_Fine.setForeground(new java.awt.Color(255, 255, 255));
        label_Fine.setText("Fine");
        getContentPane().add(label_Fine);
        label_Fine.setBounds(20, 390, 110, 20);

        txt_Fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FeeKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Fee);
        txt_Fee.setBounds(180, 190, 90, 20);

        txt_Laundry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_LaundryKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Laundry);
        txt_Laundry.setBounds(180, 230, 90, 20);

        txt_Electricity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ElectricityKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Electricity);
        txt_Electricity.setBounds(180, 270, 90, 20);
        getContentPane().add(txt_Newspaper);
        txt_Newspaper.setBounds(180, 310, 90, 20);

        txt_houseKeeping.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_houseKeepingKeyTyped(evt);
            }
        });
        getContentPane().add(txt_houseKeeping);
        txt_houseKeeping.setBounds(180, 350, 90, 20);

        txt_Fine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FineKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Fine);
        txt_Fine.setBounds(180, 390, 90, 20);
        getContentPane().add(txt_Roomtype);
        txt_Roomtype.setBounds(180, 150, 90, 20);
        getContentPane().add(txt_StudentID);
        txt_StudentID.setBounds(180, 110, 90, 20);

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(80, 470, 110, 30);

        btn_Enter.setText("Enter");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Enter);
        btn_Enter.setBounds(290, 110, 100, 23);

        btn_Refresh.setText("REFRESH");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh);
        btn_Refresh.setBounds(220, 470, 110, 30);

        tabelHostel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelHostel.setMaximumSize(new java.awt.Dimension(120, 64));
        tabelHostel.setPreferredSize(new java.awt.Dimension(120, 64));
        tabelHostel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelHostelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelHostel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 110, 840, 100);

        label_MainFrameHostel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        label_MainFrameHostel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                label_MainFrameHostelComponentResized(evt);
            }
        });
        getContentPane().add(label_MainFrameHostel);
        label_MainFrameHostel.setBounds(0, 0, 1250, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setSize(1260, 550);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void label_MainFrameHostelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_label_MainFrameHostelComponentResized
       
        setSize(1100, 400);
    }//GEN-LAST:event_label_MainFrameHostelComponentResized

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try
       {
                    
            String studentID = txt_StudentID.getText();             
            String roomType = txt_Roomtype.getText();
            String fee =  txt_Fee.getText();
            String laundry =  txt_Laundry.getText();
            String electricity  =  txt_Electricity.getText();
            String newsPaper  = txt_Newspaper.getText();
            String houseKeeping  =  txt_houseKeeping.getText();
            String fine  = txt_Fine.getText();
             
            String sql = "update hostel set RoomType = '"+roomType+"', Fee = '"+fee+"' , Laundry = '"+laundry+"', Electricity = '"+electricity+"', Newspaper_Magazine = '"+newsPaper+"' , HouseKeeping = '"+houseKeeping+"', Fine = '"+fine+"' where StudentID = '"+studentID+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            System.err.println( new Date().toString()+"::Update Query!!!!"+sql);
            
            JOptionPane.showMessageDialog(null,"Details Updaated");
                  
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
       getHostelData();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tabelHostelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelHostelMouseClicked
         try
       {
            int row = tabelHostel.getSelectedRow();
            String Table_Click = (tabelHostel.getModel().getValueAt(row, 0).toString());
            String sql = " select * from hostel where StudentID = '"+Table_Click+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String studID = rs.getString("StudentID");
               txt_StudentID.setText(studID); 
               
               String roomType = rs.getString("RoomType");
               txt_Roomtype.setText(roomType);
               
               String fee = rs.getDouble("Fee")+"";
               txt_Fee.setText(fee);  
               
               String laundry = rs.getDouble("Laundry")+"";
               txt_Laundry.setText(laundry); 
               
               String electricity = rs.getDouble("Electricity")+"";
               txt_Electricity.setText(electricity); 
                           
               String newspaper = rs.getString("Newspaper_Magazine");
               txt_Newspaper.setText(newspaper);
               
               String houseKeeping = rs.getDouble("HouseKeeping")+"";
               txt_houseKeeping.setText(houseKeeping); 
               
               String fine = rs.getDouble("Fine")+"";
               txt_Fine.setText(fine); 
           
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
    }//GEN-LAST:event_tabelHostelMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
         
               txt_StudentID.setText("");
               txt_Roomtype.setText("");
               txt_Fee.setText("");
               txt_Laundry.setText("");
               txt_Electricity.setText("");
               txt_Newspaper.setText("");
               txt_houseKeeping.setText("");
               txt_Fine.setText(""); 
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void txt_FeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FeeKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_FeeKeyTyped

    private void txt_LaundryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_LaundryKeyTyped
       char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_LaundryKeyTyped

    private void txt_ElectricityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ElectricityKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_ElectricityKeyTyped

    private void txt_houseKeepingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_houseKeepingKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_houseKeepingKeyTyped

    private void txt_FineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FineKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_FineKeyTyped

    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed
         try
       {
            String studID = txt_StudentID.getText();            
            String sql = " select * from hostel where StudentID = '"+studID+"'";
            pst = con.prepareStatement (sql);
	    rs=pst.executeQuery(sql);
            if(rs.next())
            {
               String roomType = rs.getString("RoomType");
               txt_Roomtype.setText(roomType);
               
               String fee = rs.getDouble("Fee")+"";
               txt_Fee.setText(fee);  
               
               String laundry = rs.getDouble("Laundry")+"";
               txt_Laundry.setText(laundry); 
               
               String electricity = rs.getDouble("Electricity")+"";
               txt_Electricity.setText(electricity); 
                           
               String newspaper = rs.getString("Newspaper_Magazine");
               txt_Newspaper.setText(newspaper);
               
               String houseKeeping = rs.getDouble("HouseKeeping")+"";
               txt_houseKeeping.setText(houseKeeping); 
               
               String fine = rs.getDouble("Fine")+"";
               txt_Fine.setText(fine); 
           
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
            java.util.logging.Logger.getLogger(HostelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HostelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HostelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HostelJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HostelJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Enter;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Electricity;
    private javax.swing.JLabel label_Fee;
    private javax.swing.JLabel label_Fine;
    private javax.swing.JLabel label_Housekeeping;
    private javax.swing.JLabel label_Loundry;
    private javax.swing.JLabel label_MainFrameHostel;
    private javax.swing.JLabel label_Newspaper;
    private javax.swing.JLabel label_RoomType;
    private javax.swing.JLabel label_StudentID;
    private javax.swing.JLabel label_hostel;
    private javax.swing.JTable tabelHostel;
    private javax.swing.JTextField txt_Electricity;
    private javax.swing.JTextField txt_Fee;
    private javax.swing.JTextField txt_Fine;
    private javax.swing.JTextField txt_Laundry;
    private javax.swing.JTextField txt_Newspaper;
    private javax.swing.JTextField txt_Roomtype;
    private javax.swing.JTextField txt_StudentID;
    private javax.swing.JTextField txt_houseKeeping;
    // End of variables declaration//GEN-END:variables
}
