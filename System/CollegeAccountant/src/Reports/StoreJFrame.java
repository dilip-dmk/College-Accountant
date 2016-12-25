 

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
public class StoreJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public StoreJFrame() {
        initComponents();
        con=userDao.getConnection();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Heading_Store = new javax.swing.JLabel();
        btn_StoreFee = new javax.swing.JButton();
        btn_StoreItems = new javax.swing.JButton();
        btn_StoreAmountDue = new javax.swing.JButton();
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

        label_Heading_Store.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_Heading_Store.setForeground(new java.awt.Color(255, 255, 255));
        label_Heading_Store.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Heading_Store.setText("Store Reports");
        getContentPane().add(label_Heading_Store);
        label_Heading_Store.setBounds(270, 30, 240, 50);

        btn_StoreFee.setText("Store Fee Report");
        btn_StoreFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StoreFeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StoreFee);
        btn_StoreFee.setBounds(30, 120, 170, 20);

        btn_StoreItems.setText("Store Items Report");
        btn_StoreItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StoreItemsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StoreItems);
        btn_StoreItems.setBounds(30, 220, 170, 20);

        btn_StoreAmountDue.setText("Store Amount Due Report");
        btn_StoreAmountDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StoreAmountDueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_StoreAmountDue);
        btn_StoreAmountDue.setBounds(30, 170, 170, 20);

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

    private void btn_StoreFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StoreFeeActionPerformed
        StoreJFrame libReports = new StoreJFrame();
        libReports.getFeeDetails();
        RefineryUtilities.centerFrameOnScreen(libReports);
       //  demo.setVisible(true);
       // panel_Library.setVisible(true);
        
    }//GEN-LAST:event_btn_StoreFeeActionPerformed
      /*
    Method to fetch Fee Details for Library
    */
     private void getFeeDetails(){

		System.err.println("Inside Create work Method::");
		ArrayList<String[]> completeDetail = new ArrayList<String[]>();
                ArrayList<String[]> finalDetail = new ArrayList<String[]>();
		try {
		 
                 String sql = "select Amount,Date_Of_Order from store";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String dateOfIssue;
	         int fine ;
                 double amount =0.0;
	          

	         String [] fineYear = null;
	         HashSet<String> yearColl = new HashSet<String>();
	         while(rs.next()){
	            dateOfIssue = rs.getDate("Date_Of_Order")+"";  
	            fine = rs.getInt("Amount");
	            String tempDate = dateOfIssue.substring(0, 4);	            
	            yearColl.add(tempDate);	            
	            fineYear =  new String[4];
	            fineYear[0]=tempDate;
	            fineYear[1]=fine+"";	            
	            completeDetail.add(fineYear);
	         }
	         
	        
	         int tempFine;
	         for (String yeara : yearColl) {
	        	 tempFine =0;
	        	 for (String [] actualData : completeDetail) {
		        	 
	        		 if(actualData[0].equals(yeara)){
	        			tempFine += Integer.parseInt(actualData[1]);
	        		 }	
	        	 }
	        	
	        	 String [] finalArray = new String[3];	
	        	 finalArray[0]=yeara;
	        	 finalArray[1]=tempFine+"";
	        	 finalDetail.add(finalArray);
	         
                }
	        
		} catch (Exception e) {
			System.err.println("Exception while fetching Amount from Store ::"+e);
                        e.printStackTrace();
		}	
		createLibrarayFeeChart(finalDetail);

	}
    /*
     Method to create Bar chart for Library Fine
     */
    void createLibrarayFeeChart(ArrayList<String[]> finalDetail){		
		
                System.err.println("Inside creatBarChart Method::");
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (String [] string : finalDetail) {
				int i =  Integer.parseInt(string[1]);
       			dataset.setValue(i, "Registration", string[0]);
		}
		JFreeChart chart = ChartFactory.createBarChart
		  ("Store Amount Details","Years", "AMOUNT", dataset, 
		  PlotOrientation.VERTICAL, false,true, false);
		  chart.setBackgroundPaint(Color.WHITE);
		  chart.getTitle().setPaint(Color.red); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setRangeGridlinePaint(Color.yellow); 
		  ChartFrame frame1=new ChartFrame("Store Amount",chart);
		  frame1.setVisible(true); 
		  frame1.setSize(600,350);
                   
		  }

	
     
    private void label_LibraryMainFrameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_label_LibraryMainFrameComponentAdded
       
    }//GEN-LAST:event_label_LibraryMainFrameComponentAdded

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        setSize(600, 500);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void btn_StoreAmountDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StoreAmountDueActionPerformed
        StoreJFrame libReports = new StoreJFrame();
        libReports.getFineDetails();
        RefineryUtilities.centerFrameOnScreen(libReports);
    }//GEN-LAST:event_btn_StoreAmountDueActionPerformed

    private void btn_StoreItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StoreItemsActionPerformed
        
        
                ArrayList<String> libIDList = new ArrayList<String>();
                ArrayList<Double> booksCostList = new ArrayList<Double>();
		try {
		 
                 String sql = "select ProductName,Quantity from store";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String libId=null;
	         double booksCosts = 0.0 ; 
	        
	         while(rs.next()){
	            libId = rs.getString("ProductName"); 
	            booksCosts = rs.getDouble("Quantity");
	            libIDList.add(libId);
                    booksCostList.add(booksCosts);
                 }
                 System.out.println("ProductName list size "+libIDList.size());
                 System.out.println("Quantity size "+booksCostList.size());
	         } catch (Exception e) {
			System.out.println("Exception while fetching Quantity from Store ::"+e);
                        e.printStackTrace();
		}	
	        
        
        DefaultPieDataset pieDataSet =  new DefaultPieDataset();
        
        for(int i=0;i<libIDList.size();i++)
        {
            pieDataSet.setValue(libIDList.get(i), booksCostList.get(i));
        }
      
        JFreeChart chart = ChartFactory.createPieChart("Pie chart", pieDataSet, true, true, true);
        PiePlot p = (PiePlot)chart.getPlot(); 
        ChartFrame chFrame = new ChartFrame("Pie Chart", chart);
        chFrame.setVisible(true);
        chFrame.setSize(450,500);
             
    
    }//GEN-LAST:event_btn_StoreItemsActionPerformed
     
    /*
    Method to fetch Fine Details for Store
    */
     private void getFineDetails(){

		System.err.println("Inside Create work Method::");
		ArrayList<String[]> completeDetail = new ArrayList<String[]>();
                ArrayList<String[]> finalDetail = new ArrayList<String[]>();
		try {
		 
                 String sql = "select Due,Date_Of_Delivery from store";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String dateOfIssue;
	         int fine ;
	          

	         String [] fineYear = null;
	         HashSet<String> yearColl = new HashSet<String>();
	         while(rs.next()){
	            dateOfIssue = rs.getString("Date_Of_Delivery"); 
	            fine = rs.getInt("Due");
	            String tempDate = dateOfIssue.substring(0, 4);	            
	            yearColl.add(tempDate);	            
	            fineYear =  new String[4];
	            fineYear[0]=tempDate;
	            fineYear[1]=fine+"";	            
	            completeDetail.add(fineYear);
	         }
	         
	        
	         int tempFine;
	         for (String yeara : yearColl) {
	        	 tempFine =0;
	        	 for (String [] actualData : completeDetail) {
		        	 
	        		 if(actualData[0].equals(yeara)){
	        			tempFine += Integer.parseInt(actualData[1]);
	        		 }	
	        	 }
	        	
	        	 String [] finalArray = new String[3];	
	        	 finalArray[0]=yeara;
	        	 finalArray[1]=tempFine+"";
	        	 finalDetail.add(finalArray);
	         
                }
	        
		} catch (Exception e) {
			System.err.println("Exception while fetching Dues  for Store Reports ::"+e);
                        e.printStackTrace();
		}	
		createLibrarayFineChart(finalDetail);

	}
    /*
     Method to create Bar chart for Library Fine
     */
    void createLibrarayFineChart(ArrayList<String[]> finalDetail){		
		
                System.err.println("Inside creatBarChart Method::");
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (String [] string : finalDetail) {
				int i =  Integer.parseInt(string[1]);
       			dataset.setValue(i, "Due", string[0]);
		}
		JFreeChart chart = ChartFactory.createBarChart
		  ("Store Amount Due Reports","Years", "Due", dataset, 
		  PlotOrientation.VERTICAL, false,true, false);
		  chart.setBackgroundPaint(Color.WHITE);
		  chart.getTitle().setPaint(Color.red); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setRangeGridlinePaint(Color.yellow); 
		  ChartFrame frame1=new ChartFrame("Store Due Report",chart);
		  frame1.setVisible(true); 
		  frame1.setSize(600,350);
                   
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
            java.util.logging.Logger.getLogger(StoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_StoreAmountDue;
    private javax.swing.JButton btn_StoreFee;
    private javax.swing.JButton btn_StoreItems;
    private javax.swing.JLabel label_Heading_Store;
    private javax.swing.JLabel label_LibraryMainFrame;
    // End of variables declaration//GEN-END:variables
}
