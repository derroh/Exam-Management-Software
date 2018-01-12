/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
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
public class classGradeCountReport 
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

                        PdfPCell cell;
                        
                         cell = new PdfPCell(new Phrase("FORM", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("ENTRY", boldFont));
                        table.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A", boldFont));
                        table.addCell(cell);
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

                      float[] columnWidths = new float[] {8f, 10f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 15f};
                      table.setPaddingTop(TOP_ALIGNMENT);
                      table.setWidths(columnWidths);
                      
                      ///DO YOUR MATH SON
                      try{
                          String getEng = "SELECT * FROM `exammg` WHERE `yearr` = '"+year+"' AND term = '"+term+"'";
                          stm = conn.createStatement();
                          rs = stm.executeQuery(getEng);
                         // table.addCell("ENGLISH", boldFont);
                          
                            while(rs.next())
                            {
                                
                               // String subject = rs.getString("subject");
                                String form = rs.getString("form");
                                String entry = rs.getString("entry");
                                String A = rs.getString("A");
                                String Am = rs.getString("Am");
                                String Bp = rs.getString("Bp");
                                String B = rs.getString("B");
                                String Bm = rs.getString("Bm");
                                String Cp = rs.getString("Cp");
                                String C = rs.getString("C");
                                String Cm = rs.getString("Cm");
                                String Dp = rs.getString("Dp");
                                String D = rs.getString("D");
                                String Dm = rs.getString("Dm");
                                String E = rs.getString("E");
                                String X = rs.getString("X");
                                String MM = rs.getString("mean");
                                //set to pdf
                                table.addCell(form);
                                table.addCell(entry);
                                table.addCell(A);
                                table.addCell(Am);
                                table.addCell(Bp);
                                table.addCell(B);
                                table.addCell(Bm);
                                table.addCell(Cp);
                                table.addCell(C);
                                table.addCell(Cm);
                                table.addCell(Dp);
                                table.addCell(D);
                                table.addCell(Dm);
                                table.addCell(E);
                                table.addCell(X);
                                table.addCell(MM);
                            }
                      }catch(Exception e)
                      {
                      e.printStackTrace();
                      }
                      document.add(table);
                      document.close();

    }catch(Exception e)
    {
        e.printStackTrace();
    }finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { pst.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }
    }
}
