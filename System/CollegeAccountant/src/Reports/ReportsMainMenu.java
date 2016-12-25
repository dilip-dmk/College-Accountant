/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reports;

import mainscreen.*;
import ModuleFrames.ExaminationJFrame;
import login.LoginScreen;
/**
 *
 * @author TECHNOLOGIES
 */
public class ReportsMainMenu extends javax.swing.JFrame { 
    
    public ReportsMainMenu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLibraryModule = new javax.swing.JLabel();
        btnLibrary = new javax.swing.JButton();
        btn_defaulterList = new javax.swing.JButton();
        btn_FinancialReport = new javax.swing.JButton();
        btn_StoreReport = new javax.swing.JButton();
        labelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        labelLibraryModule.setText("Reports Menu");
        getContentPane().add(labelLibraryModule);
        labelLibraryModule.setBounds(130, 10, 300, 40);

        btnLibrary.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnLibrary.setText("Library");
        btnLibrary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibraryActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibrary);
        btnLibrary.setBounds(20, 90, 200, 30);

        btn_defaulterList.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btn_defaulterList.setText("Defaulter List");
        btn_defaulterList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_defaulterListActionPerformed(evt);
            }
        });
        getContentPane().add(btn_defaulterList);
        btn_defaulterList.setBounds(20, 190, 200, 30);

        btn_FinancialReport.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btn_FinancialReport.setText("Financial Report");
        btn_FinancialReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinancialReportActionPerformed(evt);
            }
        });
        getContentPane().add(btn_FinancialReport);
        btn_FinancialReport.setBounds(270, 90, 200, 30);

        btn_StoreReport.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btn_StoreReport.setText("Store ");
        btn_StoreReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StoreReportActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StoreReport);
        btn_StoreReport.setBounds(270, 190, 200, 30);

        labelBG.setBackground(new java.awt.Color(255, 255, 255));
        labelBG.setForeground(new java.awt.Color(255, 255, 255));
        labelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        labelBG.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                labelBGComponentResized(evt);
            }
        });
        getContentPane().add(labelBG);
        labelBG.setBounds(0, 0, 1920, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLibraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibraryActionPerformed
        // TODO add your handling code here:
        Reports.LibrarayReportsJFrame reportsLibrary = new Reports.LibrarayReportsJFrame();
        reportsLibrary.setExtendedState(reportsLibrary.MAXIMIZED_BOTH);
        reportsLibrary.setVisible(true);
    }//GEN-LAST:event_btnLibraryActionPerformed

    private void btn_FinancialReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinancialReportActionPerformed
         
        Reports.FinancialReportJFrame financialReportsJFrame = new Reports.FinancialReportJFrame();
        financialReportsJFrame.setExtendedState(financialReportsJFrame.MAXIMIZED_BOTH);
        financialReportsJFrame.setVisible(true); 
    }//GEN-LAST:event_btn_FinancialReportActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setSize(600,400);
        setLocation(50, 50);
    }//GEN-LAST:event_formComponentResized

    private void labelBGComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_labelBGComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_labelBGComponentResized

    private void btn_defaulterListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_defaulterListActionPerformed
        Reports.DefaulterJFrame defaulterJFrame = new Reports.DefaulterJFrame();
        defaulterJFrame.setExtendedState(defaulterJFrame.MAXIMIZED_BOTH);
        defaulterJFrame.setVisible(true); 
    }//GEN-LAST:event_btn_defaulterListActionPerformed

    private void btn_StoreReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StoreReportActionPerformed
        Reports.StoreJFrame storeJFrame = new Reports.StoreJFrame();
        storeJFrame.setExtendedState(storeJFrame.MAXIMIZED_BOTH);
        storeJFrame.setVisible(true); 
    }//GEN-LAST:event_btn_StoreReportActionPerformed

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
                ReportsMainMenu reportsMainMenu=  new ReportsMainMenu();
                reportsMainMenu.setSize(600, 400);
                reportsMainMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibrary;
    private javax.swing.JButton btn_FinancialReport;
    private javax.swing.JButton btn_StoreReport;
    private javax.swing.JButton btn_defaulterList;
    private javax.swing.JLabel labelBG;
    private javax.swing.JLabel labelLibraryModule;
    // End of variables declaration//GEN-END:variables
}
