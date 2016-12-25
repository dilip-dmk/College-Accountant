package mainscreen;

import ModuleFrames.ExaminationJFrame;
import login.LoginScreen;
import java.net.*;
import javax.swing.JOptionPane;

/**
@author Dilip Pc
 */

public class FrameMainMenu extends javax.swing.JFrame { 
    
    public FrameMainMenu() {
        initComponents();
       // checkInternetConnection();
    }

    public void checkInternetConnection()
    {
         Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
              JOptionPane.showMessageDialog(null,"Method Called !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLibraryModule = new javax.swing.JLabel();
        btnLibrary = new javax.swing.JButton();
        btnHostel = new javax.swing.JButton();
        btn_Mess = new javax.swing.JButton();
        btn_Maintenance = new javax.swing.JButton();
        btnBus = new javax.swing.JButton();
        btn_ExaminationFee = new javax.swing.JButton();
        btn_Bill = new javax.swing.JButton();
        btn_Reports = new javax.swing.JButton();
        btn_StudentFee = new javax.swing.JButton();
        btn_Donation = new javax.swing.JButton();
        btnStore = new javax.swing.JButton();
        btnPayroll = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        labelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Module Menu - College Accountant");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        labelLibraryModule.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        labelLibraryModule.setForeground(new java.awt.Color(255, 255, 255));
        labelLibraryModule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLibraryModule.setText("Modules Menu");
        getContentPane().add(labelLibraryModule);
        labelLibraryModule.setBounds(270, 20, 300, 40);

        btnLibrary.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btnLibrary.setText("Library");
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibrary);
        btnLibrary.setBounds(180, 100, 210, 20);

        btnHostel.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btnHostel.setText("Hostel");
        btnHostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostelActionPerformed(evt);
            }
        });
        getContentPane().add(btnHostel);
        btnHostel.setBounds(180, 130, 210, 20);

        btn_Mess.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_Mess.setText("Mess Cafetaria");
        btn_Mess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MessActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Mess);
        btn_Mess.setBounds(420, 190, 210, 20);

        btn_Maintenance.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_Maintenance.setText("Maintenance & Development");
        btn_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MaintenanceActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Maintenance);
        btn_Maintenance.setBounds(180, 190, 210, 20);

        btnBus.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btnBus.setText("Bus");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        getContentPane().add(btnBus);
        btnBus.setBounds(420, 100, 210, 20);

        btn_ExaminationFee.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_ExaminationFee.setText("Examination Fee");
        btn_ExaminationFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExaminationFeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ExaminationFee);
        btn_ExaminationFee.setBounds(180, 220, 210, 20);

        btn_Bill.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_Bill.setText("Bill Payments");
        btn_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BillActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Bill);
        btn_Bill.setBounds(420, 250, 210, 20);

        btn_Reports.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_Reports.setText("Reports");
        btn_Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Reports);
        btn_Reports.setBounds(420, 220, 210, 20);

        btn_StudentFee.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_StudentFee.setText("Student Fee");
        btn_StudentFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StudentFeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StudentFee);
        btn_StudentFee.setBounds(180, 250, 210, 20);

        btn_Donation.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_Donation.setText("Donation");
        btn_Donation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DonationActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Donation);
        btn_Donation.setBounds(420, 160, 210, 20);

        btnStore.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btnStore.setText("Store");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnStore);
        btnStore.setBounds(420, 130, 210, 20);

        btnPayroll.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btnPayroll.setText("Payroll Management");
        btnPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayrollActionPerformed(evt);
            }
        });
        getContentPane().add(btnPayroll);
        btnPayroll.setBounds(180, 160, 210, 20);

        buttonLogout.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogout);
        buttonLogout.setBounds(510, 290, 120, 20);

        labelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        getContentPane().add(labelBG);
        labelBG.setBounds(0, 0, 1920, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
        ModuleFrames.LibrarayJFrame libraryScreen = new ModuleFrames.LibrarayJFrame();
        libraryScreen.setExtendedState(libraryScreen.MAXIMIZED_BOTH);
        libraryScreen.setVisible(true);
        
        
        // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
        
       
    }//GEN-LAST:event_btnLibraryActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed

        LoginScreen logScreen = new LoginScreen();
        logScreen.setSize(800, 550);
        logScreen.setLocationRelativeTo(null);
        logScreen.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void btnHostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostelActionPerformed
         
        ModuleFrames.HostelJFrame hostelScreen = new ModuleFrames.HostelJFrame();
        hostelScreen.setExtendedState(hostelScreen.MAXIMIZED_BOTH);
        hostelScreen.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
  
    }//GEN-LAST:event_btnHostelActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        ModuleFrames.BusJFrame busFrame = new ModuleFrames.BusJFrame();
        busFrame.setExtendedState(busFrame.MAXIMIZED_BOTH);
        busFrame.setVisible(true);
        
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed
         
        ModuleFrames.StoreJFrame storeFrame = new ModuleFrames.StoreJFrame();
        storeFrame.setExtendedState(storeFrame.MAXIMIZED_BOTH);
        storeFrame.setVisible(true); 
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btnStoreActionPerformed

    private void btnPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayrollActionPerformed
        ModuleFrames.PayrollJFrame payrollFrame = new ModuleFrames.PayrollJFrame();
        payrollFrame.setExtendedState(payrollFrame.MAXIMIZED_BOTH);
        payrollFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btnPayrollActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setSize(800, 400);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void btn_DonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DonationActionPerformed
        ModuleFrames.DonationJFrame donationFrame = new ModuleFrames.DonationJFrame();
        donationFrame.setExtendedState(donationFrame.MAXIMIZED_BOTH);
        donationFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_DonationActionPerformed

    private void btn_MessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MessActionPerformed
        ModuleFrames.MessJFrame messFrame = new ModuleFrames.MessJFrame();
        messFrame.setExtendedState(messFrame.MAXIMIZED_BOTH);
        messFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_MessActionPerformed

    private void btn_ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportsActionPerformed
        Reports.ReportsMainMenu reportsMainFrame = new Reports.ReportsMainMenu();
        reportsMainFrame.setExtendedState(reportsMainFrame.MAXIMIZED_BOTH);
        reportsMainFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_ReportsActionPerformed

    private void btn_ExaminationFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExaminationFeeActionPerformed
        ModuleFrames.ExaminationJFrame examJFrame = new ModuleFrames.ExaminationJFrame();
        examJFrame.setExtendedState(examJFrame.MAXIMIZED_BOTH);
        examJFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_ExaminationFeeActionPerformed

    private void btn_StudentFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StudentFeeActionPerformed
        ModuleFrames.StudentJFrame studentJFrame = new ModuleFrames.StudentJFrame();
        studentJFrame.setExtendedState(studentJFrame.MAXIMIZED_BOTH);
        studentJFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_StudentFeeActionPerformed

    private void btn_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MaintenanceActionPerformed
        ModuleFrames.MaintenanceJFrame maintenanceJFrame = new ModuleFrames.MaintenanceJFrame();
        maintenanceJFrame.setExtendedState(maintenanceJFrame.MAXIMIZED_BOTH);
        maintenanceJFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_MaintenanceActionPerformed

    private void btn_BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BillActionPerformed
        ModuleFrames.BillPaymentJFrame billJFrame = new ModuleFrames.BillPaymentJFrame();
        billJFrame.setExtendedState(billJFrame.MAXIMIZED_BOTH);
        billJFrame.setVisible(true);
         // Code to check for Internet Connection
        Socket sock = new Socket();
         InetSocketAddress addr = new InetSocketAddress("www.google.com",80);
         try
         {
             sock.connect(addr,3000);
             //JOptionPane.showMessageDialog(null,"Internet is working !");
         }
         
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Internet Connection not working . Please check !");
         }
         
         finally
         {
             try
             {
                 sock.close();
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btn_BillActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameMainMenu frameMainMenu=  new FrameMainMenu();
                frameMainMenu.setSize(600, 400);
                frameMainMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnHostel;
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btnPayroll;
    private javax.swing.JButton btnStore;
    private javax.swing.JButton btn_Bill;
    private javax.swing.JButton btn_Donation;
    private javax.swing.JButton btn_ExaminationFee;
    private javax.swing.JButton btn_Maintenance;
    private javax.swing.JButton btn_Mess;
    private javax.swing.JButton btn_Reports;
    private javax.swing.JButton btn_StudentFee;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JLabel labelBG;
    private javax.swing.JLabel labelLibraryModule;
    // End of variables declaration//GEN-END:variables
}
