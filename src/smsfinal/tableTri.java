/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Font;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HiGHROLLER
 */
public class tableTri 
{
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
     public void createReport(String term, String year, String exam, String path, String name)
    {
        DbConnection connect = new DbConnection();
        conn = connect.Connectdb();
          
                try{
                      Document document = new Document(PageSize.A4.rotate());  
                      FileOutputStream file =  new FileOutputStream(path+"/Term "+term+" "+year+" "+exam+" class grade count.pdf");
                      PdfWriter.getInstance(document, file);

                      document.open();
                     
                      document.add(new Paragraph("CLASS GRADE COUNT FOR "+term+" "+year+" "+name+" EXAMS.", FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, BaseColor.BLACK)));
                      document.add(new Paragraph("\n"));
                      com.itextpdf.text.Font boldFont = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD);
                                                                            
                        PdfPTable table = new PdfPTable(16);
                        table.setWidthPercentage(100);
                        float[] columnWidths = new float[] {8f, 10f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 15f};
                      //table.setPaddingTop();
                        table.setWidths(columnWidths);
                       
                        PdfPCell cell;
                        PdfPCell cell1 = new PdfPCell(new Phrase("FORM", boldFont));
                        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        table.addCell(cell1);
                        
                        PdfPCell cell2 = new PdfPCell(new Phrase("ENTRY", boldFont));
                        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        table.addCell(cell2);
                        PdfPCell cell3 = new PdfPCell(new Phrase("A", boldFont));
                        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                        table.addCell(cell3);
//                        table.completeRow();
                        //table.c
                        cell = new PdfPCell(new Phrase("   A-", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B+", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B-", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C+", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C-", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D+", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D-", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   E", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   X", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("    MEAN MARK", boldFont));
                        table.addCell(cell);

                    
                      
                      table.completeRow();
                      document.add(table);
                      document.close();

    }catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
}
