package ModuleFrames;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import net.proteanit.sql.DbUtils;
import utils.userDao;
import javax.swing.JOptionPane;

/**
@author Dilip Pc
 */

public class MaintenanceJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public MaintenanceJFrame() {
        initComponents();
        con=userDao.getConnection();
        getMaintenanceData();
    }
    
    private void getMaintenanceData()
{
    try
            {
                String sql = "select * from maintenance";
                pst = con.prepareStatement(sql);               
                rs = pst.executeQuery();                
                table_Maintenance.setModel(DbUtils.resultSetToTableModel(rs));
                
            }
            catch (Exception e)
            {
                System.err.println( new Date().toString()+"::Error while fetching Maintenance data!!!!"+e.getMessage());
                
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

        label_MaintenanceHeading = new javax.swing.JLabel();
        label_building = new javax.swing.JLabel();
        laberl_pcCost = new javax.swing.JLabel();
        label_etcCost = new javax.swing.JLabel();
        txt_Building = new javax.swing.JTextField();
        txt_pc = new javax.swing.JTextField();
        txt_etcCost = new javax.swing.JTextField();
        btn_Insert = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Maintenance = new javax.swing.JTable();
        label_MaintenanceMainFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Maintenance Module Frame");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        label_MaintenanceHeading.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_MaintenanceHeading.setForeground(new java.awt.Color(255, 255, 255));
        label_MaintenanceHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_MaintenanceHeading.setText("MAINTENANCE & DEVELOPMENT MODULE");
        getContentPane().add(label_MaintenanceHeading);
        label_MaintenanceHeading.setBounds(170, 30, 490, 40);

        label_building.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_building.setForeground(new java.awt.Color(255, 255, 255));
        label_building.setText("Building ");
        getContentPane().add(label_building);
        label_building.setBounds(40, 110, 110, 20);

        laberl_pcCost.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        laberl_pcCost.setForeground(new java.awt.Color(255, 255, 255));
        laberl_pcCost.setText("PC Cost");
        getContentPane().add(laberl_pcCost);
        laberl_pcCost.setBounds(40, 160, 110, 20);

        label_etcCost.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        label_etcCost.setForeground(new java.awt.Color(255, 255, 255));
        label_etcCost.setText("Etc. Cost");
        getContentPane().add(label_etcCost);
        label_etcCost.setBounds(40, 200, 110, 20);

        txt_Building.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuildingActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Building);
        txt_Building.setBounds(160, 110, 90, 20);

        txt_pc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pcKeyTyped(evt);
            }
        });
        getContentPane().add(txt_pc);
        txt_pc.setBounds(160, 160, 90, 20);

        txt_etcCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_etcCostKeyTyped(evt);
            }
        });
        getContentPane().add(txt_etcCost);
        txt_etcCost.setBounds(160, 200, 90, 20);

        btn_Insert.setText("INSERT");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert);
        btn_Insert.setBounds(70, 270, 110, 30);

        btn_Refresh.setText("REFRESH");
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh);
        btn_Refresh.setBounds(200, 270, 110, 30);

        table_Maintenance.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_Maintenance);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 100, 452, 102);

        label_MaintenanceMainFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        label_MaintenanceMainFrame.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                label_MaintenanceMainFrameComponentResized(evt);
            }
        });
        getContentPane().add(label_MaintenanceMainFrame);
        label_MaintenanceMainFrame.setBounds(0, 0, 800, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setSize(820, 400);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void label_MaintenanceMainFrameComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_label_MaintenanceMainFrameComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_label_MaintenanceMainFrameComponentResized

    private void txt_BuildingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuildingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuildingActionPerformed

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        
        String building  = txt_Building.getText();
        double pcCost = Double.parseDouble(txt_pc.getText());
        double etcCost = Double.parseDouble(txt_etcCost.getText());
          try
                    { 
                            String sql = "insert into maintenance values (?,?,?)";
                            pst = con.prepareStatement(sql);
                            pst.setString(1, building);
                            pst.setDouble(2, pcCost);
                            pst.setDouble(3, etcCost);
                            
                            pst.executeUpdate();
                            System.err.println( new Date().toString()+"::Insert Query  executed"+sql);             
                            getMaintenanceData();
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
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        txt_Building.setText("");
        txt_pc.setText("");
        txt_etcCost.setText("");
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void txt_pcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pcKeyTyped
        char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_pcKeyTyped

    private void txt_etcCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_etcCostKeyTyped
       char c = evt.getKeyChar();
          if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
              evt.consume();
          }
    }//GEN-LAST:event_txt_etcCostKeyTyped

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
            java.util.logging.Logger.getLogger(MaintenanceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintenanceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintenanceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintenanceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintenanceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_MaintenanceHeading;
    private javax.swing.JLabel label_MaintenanceMainFrame;
    private javax.swing.JLabel label_building;
    private javax.swing.JLabel label_etcCost;
    private javax.swing.JLabel laberl_pcCost;
    private javax.swing.JTable table_Maintenance;
    private javax.swing.JTextField txt_Building;
    private javax.swing.JTextField txt_etcCost;
    private javax.swing.JTextField txt_pc;
    // End of variables declaration//GEN-END:variables
}
