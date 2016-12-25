package utils;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.filechooser.FileSystemView;
/*import org.eclipse.birt.chart.model.attribute.VerticalAlignment;*/
import  java.sql.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import  org.apache.poi.hssf.usermodel.HSSFRow;
import  org.apache.poi.hssf.usermodel.HSSFCell; 
import utils.userDao;
import utils.DBUtils;

/**
@author Dilip Pc
 */

@Entity
public class DBUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    
    
      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DBUtils)) {
            return false;
        }
        DBUtils other = (DBUtils) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "utils.DBUtils[ id=" + id + " ]";
    }
    
    
  /*
     Method to generate Salary Payslip PDF
    */
   public void generatePaySlipPDF(ArrayList<String> salaryComponents)
   {
       
        System.out.println("Inside generatePayslip PDF "+salaryComponents.size());
                
        Document document = new Document();

        try {
            //
            // Get an instance of PdfWriter and create a HelloWorld.pdf file as an output.
            //
            
            
        for(int i=0;i<salaryComponents.size();i++)
        {
            System.out.println("Data in list is ::"+salaryComponents.get(i));
        }
            boolean dirFlag = false;
            FileSystemView fsv = FileSystemView.getFileSystemView();
            File dir_location =  new File(fsv.getHomeDirectory()+"\\PaySlipPDF");
            dirFlag = dir_location.mkdir();            
            
            PdfWriter.getInstance(document, new FileOutputStream(new File(fsv.getHomeDirectory().toString()+"\\PaySlipPDF\\SalarySlip.pdf")));
            document.open();

            //
            // Create our first paragraph for the pdf document to be created. We also set
            // the alignment and the font of the paragraph.
            //
            Image image = Image.getInstance ("src/img/payroll.png");
          //  image.setAlignment(VerticalAlignment.CENTER);
            image.scaleAbsolute(120f, 60f);//image width,height 
            
            //Inserting Table in PDF
                      PdfPTable table=new PdfPTable(2);
 
                      PdfPCell cell = new PdfPCell (new Paragraph ("PAY SLIP \t" + " \t  Staff ID : " + "'"+salaryComponents.get(11)+"'"+ " \t  Designation :" + "'"+salaryComponents.get(12)+"'"));
  
                      cell.setColspan (3);
                      cell.setHorizontalAlignment (Element.ALIGN_LEFT);                       
                      cell.setBackgroundColor (new BaseColor (140, 221, 8));                                  
 
                      table.addCell(cell);  
                      table.addCell("Basic Pay ");
                      table.addCell(salaryComponents.get(0));
                    
                      table.addCell("House Rent Allowance ");
                      table.addCell(salaryComponents.get(1));
                      
                      table.addCell("Dearness Allowance ");
                      table.addCell(salaryComponents.get(2));
                      
                      table.addCell("Transport Allowance ");
                      table.addCell(salaryComponents.get(3));                   
                      
                      
                      table.addCell("Medical Allowance ");
                      table.addCell(salaryComponents.get(4));
                    
                      table.addCell("Child Education Allowance ");
                      table.addCell(salaryComponents.get(5));
                      
                      table.addCell("Paid Leaves ");
                      table.addCell(salaryComponents.get(6));
                    
                      table.addCell("Working Days");
                      table.addCell(salaryComponents.get(7));
                      
                      table.addCell("Absent Days ");
                      table.addCell(salaryComponents.get(8));
                      
                      table.addCell("Profident Fund");
                      table.addCell(salaryComponents.get(9));
                    
                      table.addCell("NET SALARY");
                      table.addCell(salaryComponents.get(10));
                     
                     
                      table.setSpacingBefore(30.0f);       // Space Before table starts, like margin-top in CSS
                      table.setSpacingAfter(30.0f);        // Space After table starts, like margin-Bottom in CSS                                          
 
             
            document.add(image);
            document.add(table);
            System.out.println("Pdf created successfully..");
        } catch (DocumentException e) {System.out.println("Exception occured::"+e);
            e.printStackTrace();
             
        } catch (FileNotFoundException e) {
           System.out.println("Exception occured::"+e);
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Exception occured::"+e);
            e.printStackTrace();
        } finally {
            document.close();
        }
   }
          
   
  
   }
    

