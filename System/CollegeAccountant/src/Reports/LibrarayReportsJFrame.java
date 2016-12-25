 

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
public class LibrarayReportsJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    public LibrarayReportsJFrame() {
        initComponents();
        con=userDao.getConnection();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Heading = new javax.swing.JLabel();
        btn_libraryFee = new javax.swing.JButton();
        btn_LibraryCosts = new javax.swing.JButton();
        btn_libraryFine = new javax.swing.JButton();
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

        label_Heading.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        label_Heading.setForeground(new java.awt.Color(255, 255, 255));
        label_Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Heading.setText("Library Reports");
        getContentPane().add(label_Heading);
        label_Heading.setBounds(260, 30, 240, 50);

        btn_libraryFee.setText("Library Fee Report");
        btn_libraryFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_libraryFeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_libraryFee);
        btn_libraryFee.setBounds(50, 110, 160, 20);

        btn_LibraryCosts.setText("Library Books Costs");
        btn_LibraryCosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LibraryCostsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_LibraryCosts);
        btn_LibraryCosts.setBounds(50, 210, 160, 20);

        btn_libraryFine.setText("Library Fine Report");
        btn_libraryFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_libraryFineActionPerformed(evt);
            }
        });
        getContentPane().add(btn_libraryFine);
        btn_libraryFine.setBounds(50, 160, 160, 20);

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

    private void btn_libraryFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_libraryFeeActionPerformed
        LibrarayReportsJFrame libReports = new LibrarayReportsJFrame();
        libReports.getFeeDetails();
        RefineryUtilities.centerFrameOnScreen(libReports);
       //  demo.setVisible(true);
       // panel_Library.setVisible(true);
        
    }//GEN-LAST:event_btn_libraryFeeActionPerformed
      /*
    Method to fetch Fee Details for Library
    */
     private void getFeeDetails(){

		System.err.println("Inside Create work Method::");
		ArrayList<String[]> completeDetail = new ArrayList<String[]>();
                ArrayList<String[]> finalDetail = new ArrayList<String[]>();
		try {
		 
                 String sql = "select RegistrationFee,DateOfIssue from library";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String dateOfIssue;
	         int fine ;
	          

	         String [] fineYear = null;
	         HashSet<String> yearColl = new HashSet<String>();
	         while(rs.next()){
	            dateOfIssue = rs.getString("DateOfIssue"); 
	            fine = rs.getInt("RegistrationFee");
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
			System.err.println("Exception while fetching fine for library Reports ::"+e);
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
		  ("Libray Fee Details","Years", "FEE", dataset, 
		  PlotOrientation.VERTICAL, false,true, false);
		  chart.setBackgroundPaint(Color.WHITE);
		  chart.getTitle().setPaint(Color.red); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setRangeGridlinePaint(Color.yellow); 
		  ChartFrame frame1=new ChartFrame("Library Fee",chart);
		  frame1.setVisible(true); 
		  frame1.setSize(600,350);
                   
		  }

	
     
    private void label_LibraryMainFrameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_label_LibraryMainFrameComponentAdded
       
    }//GEN-LAST:event_label_LibraryMainFrameComponentAdded

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        setSize(600, 500);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

    private void btn_libraryFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_libraryFineActionPerformed
        LibrarayReportsJFrame libReports = new LibrarayReportsJFrame();
        libReports.getFineDetails();
        RefineryUtilities.centerFrameOnScreen(libReports);
    }//GEN-LAST:event_btn_libraryFineActionPerformed

    private void btn_LibraryCostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LibraryCostsActionPerformed
        
        
                ArrayList<String> libIDList = new ArrayList<String>();
                ArrayList<Double> booksCostList = new ArrayList<Double>();
		try {
		 
                 String sql = "select LibrarianID,BookMagazineCost from library";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String libId=null;
	         double booksCosts = 0.0 ; 
	        
	         while(rs.next()){
	            libId = rs.getString("LibrarianID"); 
	            booksCosts = rs.getDouble("BookMagazineCost");
	            libIDList.add(libId);
                    booksCostList.add(booksCosts);
                 }
                 System.out.println("LibrarianID list size "+libIDList.size());
                 System.out.println("booksCostList size "+booksCostList.size());
	         } catch (Exception e) {
			System.out.println("Exception while fetching fine for library Reports ::"+e);
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
             
    
    }//GEN-LAST:event_btn_LibraryCostsActionPerformed
     
    /*
    Method to fetch Fine Details for Library
    */
     private void getFineDetails(){

		System.err.println("Inside Create work Method::");
		ArrayList<String[]> completeDetail = new ArrayList<String[]>();
                ArrayList<String[]> finalDetail = new ArrayList<String[]>();
		try {
		 
                 String sql = "select Fine,DateOfIssue from library";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String dateOfIssue;
	         int fine ;
	          

	         String [] fineYear = null;
	         HashSet<String> yearColl = new HashSet<String>();
	         while(rs.next()){
	            dateOfIssue = rs.getString("DateOfIssue"); 
	            fine = rs.getInt("Fine");
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
			System.err.println("Exception while fetching fine for library Reports ::"+e);
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
       			dataset.setValue(i, "Fine", string[0]);
		}
		JFreeChart chart = ChartFactory.createBarChart
		  ("Libray Fine Details","Years", "Fine", dataset, 
		  PlotOrientation.VERTICAL, false,true, false);
		  chart.setBackgroundPaint(Color.WHITE);
		  chart.getTitle().setPaint(Color.red); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setRangeGridlinePaint(Color.yellow); 
		  ChartFrame frame1=new ChartFrame("Library Fine",chart);
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
            java.util.logging.Logger.getLogger(LibrarayReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarayReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarayReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarayReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarayReportsJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LibraryCosts;
    private javax.swing.JButton btn_libraryFee;
    private javax.swing.JButton btn_libraryFine;
    private javax.swing.JLabel label_Heading;
    private javax.swing.JLabel label_LibraryMainFrame;
    // End of variables declaration//GEN-END:variables
}
