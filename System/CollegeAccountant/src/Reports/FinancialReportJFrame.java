 

package Reports;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import utils.userDao;

/**
 *
 * @author Dilip Library Module Class
 */
public class FinancialReportJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public FinancialReportJFrame() {
        initComponents();
        con=userDao.getConnection();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_FinancialReport = new javax.swing.JLabel();
        btn_Total_Amount_Earned = new javax.swing.JButton();
        btn_Total_Expenses = new javax.swing.JButton();
        label_LibraryMainFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LibraryMainFrame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(400, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        label_FinancialReport.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_FinancialReport.setForeground(new java.awt.Color(255, 255, 255));
        label_FinancialReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_FinancialReport.setText("Financial Reports");
        getContentPane().add(label_FinancialReport);
        label_FinancialReport.setBounds(180, 30, 280, 50);

        btn_Total_Amount_Earned.setText("Total Amount Earned");
        btn_Total_Amount_Earned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Total_Amount_EarnedActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Total_Amount_Earned);
        btn_Total_Amount_Earned.setBounds(20, 110, 180, 40);

        btn_Total_Expenses.setText("Total Expenses");
        btn_Total_Expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Total_ExpensesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Total_Expenses);
        btn_Total_Expenses.setBounds(20, 170, 180, 40);

        label_LibraryMainFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginbg.jpg"))); // NOI18N
        label_LibraryMainFrame.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                label_LibraryMainFrameComponentAdded(evt);
            }
        });
        getContentPane().add(label_LibraryMainFrame);
        label_LibraryMainFrame.setBounds(0, 0, 1290, 480);
        label_LibraryMainFrame.getAccessibleContext().setAccessibleName("Library Main Frame");

        getAccessibleContext().setAccessibleParent(label_LibraryMainFrame);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Total_Amount_EarnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Total_Amount_EarnedActionPerformed
        FinancialReportJFrame finReports = new FinancialReportJFrame();
        finReports.getAmountEarned();
        RefineryUtilities.centerFrameOnScreen(finReports);
        //demo.setVisible(true);
    }//GEN-LAST:event_btn_Total_Amount_EarnedActionPerformed
    /*
    Method to fetch Total Amount Earned Through All Modules
    */
     private void getAmountEarned(){

		ArrayList<String> module = new ArrayList<String>();
                ArrayList<Double> amountEarned = new ArrayList<Double>();
		try {
		 
                 String sqlbus = "select sum(busfee) from bus";
	         pst = con.prepareStatement(sqlbus);               
	         rs = pst.executeQuery(); 
	         double sumBusFee=0.0;
	           
	        
	         while(rs.next()){
	            sumBusFee = rs.getDouble("sum(busfee)"); 
	            module.add("BUS");
	            amountEarned.add(sumBusFee);
                     
                 }
                 
                 String sqlDonation = "select sum(Amount) from donation";
	         pst = con.prepareStatement(sqlDonation);               
	         rs = pst.executeQuery(); 
	         double sumDonation=0.0;
	           
	        
	         while(rs.next()){
	            sumDonation = rs.getDouble("sum(Amount)"); 
	            module.add("DONATION");
	            amountEarned.add(sumBusFee);
                     
                 }
                 
                 String sqlHostel = "select sum(Fee),sum(Fine) from hostel";
	         pst = con.prepareStatement(sqlHostel);               
	         rs = pst.executeQuery(); 
	         double sumFeeHostel=0.0;
                 double sumFineHostel=0.0;
                 double totalAmount=0.0;
                 
                 while(rs.next()){
	            sumFeeHostel = rs.getDouble("sum(Fee)"); 
                    sumFineHostel = rs.getDouble("sum(Fine)");
                    totalAmount = sumFeeHostel + sumFineHostel;
	            module.add("HOSTEL");
	            amountEarned.add(totalAmount);
                     
                 }
                 
                 String sqlexamination = "select sum(ExaminationFee) from examination";
	         pst = con.prepareStatement(sqlexamination);               
	         rs = pst.executeQuery(); 
	         double examFee=0.0;
                  
                 
                 while(rs.next()){
	            examFee = rs.getDouble("sum(ExaminationFee)"); 
                    module.add("EXAMINATION");
	            amountEarned.add(examFee);
                     
                 }
                 
                 String sqlLibrary = "select sum(RegistrationFee),sum(Fine) from library";
	         pst = con.prepareStatement(sqlLibrary);               
	         rs = pst.executeQuery(); 
	         double sumRegistrationFee=0.0;
                 double sumFineLibrary=0.0;
                 double totalLibraryAmount=0.0;
                 
                 while(rs.next()){
	            sumRegistrationFee = rs.getDouble("sum(RegistrationFee)"); 
                    sumFineLibrary = rs.getDouble("sum(Fine)");
                    totalLibraryAmount = sumRegistrationFee + sumFineLibrary;
	            module.add("LIBRARY");
	            amountEarned.add(totalLibraryAmount);
                     
                 }
                 
                 System.out.println("module list size "+module.size());
                 System.out.println("amountEarned size "+amountEarned.size());
                 System.out.println("Amount earned is   "+amountEarned.get(2));
	         } catch (Exception e) {
			System.out.println("Exception while fetching fine for library Reports ::"+e);
                        e.printStackTrace();
		}	
	        
        
        DefaultPieDataset pieDataSet =  new DefaultPieDataset();
        
        for(int i=0;i<amountEarned.size();i++)
        {
            pieDataSet.setValue(module.get(i), amountEarned.get(i));
        }
      
        JFreeChart chart = ChartFactory.createPieChart("Total Amount Earned (Financial Report)", pieDataSet, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot(); 
        ChartFrame chFrame = new ChartFrame("Pie Chart", chart);
        chFrame.setVisible(true);
        chFrame.setSize(450,500);
        

	}
    
		  

	
     
    private void label_LibraryMainFrameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_label_LibraryMainFrameComponentAdded
       
    }//GEN-LAST:event_label_LibraryMainFrameComponentAdded

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        setSize(600, 500);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void btn_Total_ExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Total_ExpensesActionPerformed
        
        FinancialReportJFrame finReports = new FinancialReportJFrame();
        finReports.getTotalExpenses();
        RefineryUtilities.centerFrameOnScreen(finReports);
                
    
    }//GEN-LAST:event_btn_Total_ExpensesActionPerformed
     
    /*
    Method to fetch Total Expenses Through All Modules
    */
     private void getTotalExpenses(){

		ArrayList<String> modules = new ArrayList<String>();
                ArrayList<Double> expenses = new ArrayList<Double>();
		try {
		 
                 String sqlbus = "select sum(ServiceCost),sum(AccidentCost) from bus";
	         pst = con.prepareStatement(sqlbus);               
	         rs = pst.executeQuery();
                 double serviceCost = 0.0;
                 double accidentCost = 0.0;
	         double totalBusFeeExpense=0.0;
	           
	        
	         while(rs.next()){
	            serviceCost = rs.getDouble("sum(ServiceCost)"); 
                    accidentCost = rs.getDouble("sum(AccidentCost)"); 
                    totalBusFeeExpense = serviceCost + accidentCost ;
	            modules.add("BUS");
	            expenses.add(totalBusFeeExpense);
                     
                 }
                 
                 System.out.println("totalBusFeeExpense:"+totalBusFeeExpense);
                 
                 String sqlHostel = "select sum(Laundry),sum(Electricity),sum(HouseKeeping) from hostel";
	         pst = con.prepareStatement(sqlHostel);               
	         rs = pst.executeQuery(); 
	         double sumLaundry  = 0.0;
                 double sumElectricity = 0.0;
                 double sumHouseKeeping = 0.0;
                 double totalAmountHostel=0.0;
                 
                 while(rs.next()){
	            sumLaundry = rs.getDouble("sum(Laundry)"); 
                    sumElectricity = rs.getDouble("sum(Electricity)");
                    sumHouseKeeping = rs.getDouble("sum(HouseKeeping)");
                    totalAmountHostel = sumLaundry + sumElectricity + sumHouseKeeping ;
	            modules.add("HOSTEL");
	            expenses.add(totalAmountHostel);
                     
                 }   
                 
                 System.out.println("totalAmountHostel:"+totalAmountHostel);
                                   
                 String sqlLibrary = "select sum(BookMagazineCost) from library";
	         pst = con.prepareStatement(sqlLibrary);               
	         rs = pst.executeQuery(); 
	         double sumBookMagazineCost=0.0;
                  
                 
                 while(rs.next()){
	            sumBookMagazineCost = rs.getDouble("sum(BookMagazineCost)"); 
                    modules.add("LIBRARY");
	            expenses.add(sumBookMagazineCost);
                     
                 }
                 System.out.println("sumBookMagazineCost:"+sumBookMagazineCost);
                 
                 String sqlMaintenence = "select sum(PC_Cost),sum(ExtraCost) from maintenance";
	         pst = con.prepareStatement(sqlMaintenence);               
	         rs = pst.executeQuery();
                 double sumPcCost = 0.0;
                 double sumExtraCost = 0.0;
	         double totalMaintenceCosts=0.0;
	           
	        
	         while(rs.next()){
	            sumPcCost = rs.getDouble("sum(PC_Cost)"); 
                    sumExtraCost = rs.getDouble("sum(ExtraCost)"); 
                    totalMaintenceCosts = sumPcCost + sumExtraCost ;
	            modules.add("MAINTENANCE");
	            expenses.add(totalMaintenceCosts);                     
                 }
                 
                  System.out.println("totalMaintenceCosts:"+totalMaintenceCosts);
                 
                 String sqlmess = "select sum(MessFeeDue),sum(StaffedMessFeeDue),sum(MessRent),sum(UtensilsCost),sum(MonthlyCost),sum(MessElectricityPayable),sum(MessWaterPayable),sum(CafeRent),sum(CafeElectricityPayable),sum(CafeWaterPayable) from mess";
	         pst = con.prepareStatement(sqlmess);               
	         rs = pst.executeQuery(); 
	         double MessFeeDue  = 0.0;
                 double StaffedMessFeeDue = 0.0;
                 double MessRent = 0.0;
                 double UtensilsCost  = 0.0;
                 double MonthlyCost = 0.0;
                 double MessElectricityPayable = 0.0;
                 double MessWaterPayable  = 0.0;
                 double CafeRent = 0.0;
                 double CafeElectricityPayable = 0.0;
                 double CafeWaterPayable = 0.0;
                 
                 double totalAmountMess=0.0;
                 
                 while(rs.next()){
	            MessFeeDue = rs.getDouble("sum(MessFeeDue)"); 
                    StaffedMessFeeDue = rs.getDouble("sum(StaffedMessFeeDue)");
                    MessRent = rs.getDouble("sum(MessRent)");
                    UtensilsCost = rs.getDouble("sum(UtensilsCost)"); 
                    MonthlyCost = rs.getDouble("sum(MonthlyCost)");
                    MessElectricityPayable = rs.getDouble("sum(MessElectricityPayable)");                    
                    MessWaterPayable = rs.getDouble("sum(MessWaterPayable)");
                    CafeRent = rs.getDouble("sum(CafeRent)"); 
                    CafeElectricityPayable = rs.getDouble("sum(CafeElectricityPayable)");
                    CafeWaterPayable = rs.getDouble("sum(CafeWaterPayable)");
                    totalAmountMess = MessFeeDue + StaffedMessFeeDue + MessRent + UtensilsCost + MonthlyCost + MessElectricityPayable + MessWaterPayable + CafeRent + CafeElectricityPayable + CafeWaterPayable;
	            modules.add("MESS");
	            expenses.add(totalAmountMess);
                     
                 }      
                 
                 System.out.println("totalAmountMess:"+totalAmountMess);
                 
                 String sqlPayroll = "select sum(NetSalary) from payroll";
	         pst = con.prepareStatement(sqlPayroll);               
	         rs = pst.executeQuery(); 
	         double sumNetSalary=0.0;
                  
                 
                 while(rs.next()){
	            sumNetSalary = rs.getDouble("sum(NetSalary)"); 
                    modules.add("PAYROLL");
	            expenses.add(sumNetSalary);                     
                 }
                 
                 System.out.println("sumNetSalary:"+sumNetSalary);
                 
                 String sqlStore = "select sum(Amount) from store";
	         pst = con.prepareStatement(sqlStore);               
	         rs = pst.executeQuery(); 
	         double sumTotalStore=0.0;
                  
                 
                 while(rs.next()){
	            sumTotalStore = rs.getDouble("sum(Amount)"); 
                    modules.add("STORE");
	            expenses.add(sumTotalStore);                     
                 }
                 
                 System.out.println("sumTotalStore:"+sumTotalStore);
                 
                 System.out.println("modules list size "+modules.size());
                 System.out.println("amountEarned size "+expenses.size());
                 System.out.println("Amount earned is   "+expenses.get(2));
	         } catch (Exception e) {
			System.out.println("Exception while fetching fine for library Reports ::"+e);
                        e.printStackTrace();
		}	
	        
        
        DefaultPieDataset pieDataSet =  new DefaultPieDataset();
        
        for(int i=0;i<expenses.size();i++)
        {
            pieDataSet.setValue(modules.get(i), expenses.get(i));
        }
      
        JFreeChart chart = ChartFactory.createPieChart("Total Expenses (Financial Report)", pieDataSet, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot(); 
        ChartFrame chFrame = new ChartFrame("Pie Chart", chart);
        chFrame.setVisible(true);
        chFrame.setSize(500,500);
        

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
            java.util.logging.Logger.getLogger(FinancialReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinancialReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinancialReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinancialReportJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinancialReportJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Total_Amount_Earned;
    private javax.swing.JButton btn_Total_Expenses;
    private javax.swing.JLabel label_FinancialReport;
    private javax.swing.JLabel label_LibraryMainFrame;
    // End of variables declaration//GEN-END:variables
}
