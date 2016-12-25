
package ModuleFrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import utils.userDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


/**
@author Dilip Pc
 */

public class ReportsJFrame extends javax.swing.JFrame {

    ResultSet rs = null;       
    PreparedStatement pst=null;
    private Connection con;
    private static final long serialVersionUID = 1L;
    public ReportsJFrame() {
        initComponents();
        con=userDao.getConnection(); 
               
    }
    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Reports = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reports Module Frame");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        btn_Reports.setText("Reports");
        btn_Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btn_Reports)
                .addContainerGap(616, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btn_Reports)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportsActionPerformed
         
       
        ReportsJFrame demo = new ReportsJFrame();
        demo.createWork();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
       
       
    }//GEN-LAST:event_btn_ReportsActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setSize(900, 600);
        setLocation(100, 100);
    }//GEN-LAST:event_formComponentResized

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
            java.util.logging.Logger.getLogger(ReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsJFrame().setVisible(true);
            }
        });
    }
    
    private void createWork(){

		 System.out.println("Inside Create work Method::");
		ArrayList<String[]> completeDetail = new ArrayList<String[]>();
                ArrayList<String[]> finalDetail = new ArrayList<String[]>();
		try {
			 String sql = "select Fine,DateOfIssue from library";
	         pst = con.prepareStatement(sql);               
	         rs = pst.executeQuery(); 
	         String dateOfIssue;
	         int fine ;
	         String [] strArray = new String[3];  

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
	         
	         /*for (String [] string : completeDetail) {
	        	 for (String string2 : string) {
	        		 System.out.println(string2);
					
				}
				
			}*/
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
	        /* for (String [] string : finalDetail) {
	        	 for (String string2 : string) {
	        		 System.out.println(string2);
					
				}
				
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}	
		creatBarChart(finalDetail);

	}
    
    void creatBarChart(ArrayList<String[]> finalDetail){		
		
                System.out.println("Inside creatBarChart Method::");
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (String [] string : finalDetail) {
				int i =  Integer.parseInt(string[1]);
       			dataset.setValue(i, "Fine", string[0]);
		}
		JFreeChart chart = ChartFactory.createBarChart
		  ("Yearly Wise Fine","Student", "Fine", dataset, 
		   PlotOrientation.VERTICAL, false,true, false);
		  chart.setBackgroundPaint(Color.yellow);
		  chart.getTitle().setPaint(Color.blue); 
		  CategoryPlot p = chart.getCategoryPlot(); 
		  p.setRangeGridlinePaint(Color.red); 
		  ChartFrame frame1=new ChartFrame("Bar Chart",chart);
		  frame1.setVisible(true);
		  /**
		   * change the frame size 
		   */
		  frame1.setSize(600,350);
                   
		  }
    
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reports;
    // End of variables declaration//GEN-END:variables
}
