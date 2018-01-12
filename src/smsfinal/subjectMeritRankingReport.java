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
import javax.swing.JOptionPane;

/**
 *
 * @author HiGHROLLER
 */
public class subjectMeritRankingReport 
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
                      FileOutputStream file =  new FileOutputStream(path+"/Term "+term+" "+year+" "+exam+" subject merit.pdf");
                      PdfWriter.getInstance(document, file);

                      document.open();
                     
                      document.add(new Paragraph("SUBJECT MERIT FOR FORM 1 TERM "+term+" "+year+" "+name+" EXAMS.", FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, BaseColor.BLACK)));
                      document.add(new Paragraph("\n"));
                      com.itextpdf.text.Font boldFont = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD);
                         /////table 1                                                   
                        PdfPTable table = new PdfPTable(17);
                        table.setWidthPercentage(100);

                        PdfPCell cell;
                        cell = new PdfPCell(new Phrase("POSITION", boldFont));
                        table.addCell(cell);
                         cell = new PdfPCell(new Phrase("SUBJECT", boldFont));
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

                      float[] columnWidths = new float[] {10f, 20f, 10f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 15f};
                      table.setPaddingTop(TOP_ALIGNMENT);
                      table.setWidths(columnWidths);
                      
                      ///DO YOUR MATH SON
                      try{
                          String getfm1 = "SELECT subject, entry, A, Am, Bp, B,Bm, Cp, C,Cm,Dp, D, Dm, E, X, MM,  FIND_IN_SET( MM, (SELECT GROUP_CONCAT( MM ORDER BY MM DESC ) FROM analysis WHERE form = '1' AND term = '"+term+"' AND yearr = '"+year+"')) AS rank FROM analysis WHERE form = '1' AND term = '"+term+"' AND yearr = '"+year+"' ORDER BY MM desc";
                          stm = conn.createStatement();
                          rs = stm.executeQuery(getfm1);
                         // table.addCell("ENGLISH", boldFont);
                          
                            while(rs.next())
                            {
                                String rank = rs.getString("rank");
                                String subject = rs.getString("subject");
                              //  String form = rs.getString("form");
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
                                String MM = rs.getString("MM");
                                //set to pdf
                                table.addCell(rank);
                                table.addCell(subject);
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
                      document.add(new Paragraph("\n"));
                      ///table  end
                       document.add(new Paragraph("SUBJECT MERIT FOR FORM 2 TERM "+term+" "+year+" "+name+" EXAMS.", FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, BaseColor.BLACK)));
                      document.add(new Paragraph("\n"));
                      
                       /////table 2                                                   
                        PdfPTable table2 = new PdfPTable(17);
                        table2.setWidthPercentage(100);

                        //PdfPCell cell;
                        cell = new PdfPCell(new Phrase("POSITION", boldFont));
                        table2.addCell(cell);
                         cell = new PdfPCell(new Phrase("SUBJECT", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("ENTRY", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A-", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B+", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B-", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C+", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C-", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D+", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D-", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   E", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("   X", boldFont));
                        table2.addCell(cell);
                        cell = new PdfPCell(new Phrase("    MEAN MARK", boldFont));
                        table2.addCell(cell);

                     // float[] columnWidths = new float[] {10f, 20f, 10f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 15f};
                      table2.setPaddingTop(TOP_ALIGNMENT);
                      table2.setWidths(columnWidths);
                      
                      ///DO YOUR MATH SON
                      try{
                          String getfm2 = "SELECT subject, entry, A, Am, Bp, B,Bm, Cp, C,Cm,Dp, D, Dm, E, X, MM,  FIND_IN_SET( MM, (SELECT GROUP_CONCAT( MM ORDER BY MM DESC ) FROM analysis WHERE form = '2' AND term = '"+term+"' AND yearr = '"+year+"')) AS rank FROM analysis WHERE form = '2' AND term = '"+term+"' AND yearr = '"+year+"' ORDER BY MM desc";
                          stm = conn.createStatement();
                          rs = stm.executeQuery(getfm2);
                         // table.addCell("ENGLISH", boldFont);
                          
                            while(rs.next())
                            {
                                String rank = rs.getString("rank");
                                String subject = rs.getString("subject");
                               // String form = rs.getString("form");
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
                                String MM = rs.getString("MM");
                                //set to pdf
                                table2.addCell(rank);
                                table2.addCell(subject);
                                table2.addCell(entry);
                                table2.addCell(A);
                                table2.addCell(Am);
                                table2.addCell(Bp);
                                table2.addCell(B);
                                table2.addCell(Bm);
                                table2.addCell(Cp);
                                table2.addCell(C);
                                table2.addCell(Cm);
                                table2.addCell(Dp);
                                table2.addCell(D);
                                table2.addCell(Dm);
                                table2.addCell(E);
                                table2.addCell(X);
                                table2.addCell(MM);
                            }
                      }catch(Exception e)
                      {
                      e.printStackTrace();
                      }
                       
                      document.add(table2);
                      document.add(new Paragraph("\n"));
                     ///////////////////
                      //skip to new page
                      document.add(new Paragraph("\n"));
                      document.add(new Paragraph("\n"));
                      document.add(new Paragraph("\n"));
                      
                      document.add(new Paragraph("SUBJECT MERIT FOR FORM 3 TERM "+term+" "+year+" "+name+" EXAMS.", FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, BaseColor.BLACK)));
                      document.add(new Paragraph("\n"));
                      
                       /////table 2                                                   
                        PdfPTable table3 = new PdfPTable(17);
                        table3.setWidthPercentage(100);

                        //PdfPCell cell;
                        cell = new PdfPCell(new Phrase("POSITION", boldFont));
                        table3.addCell(cell);
                         cell = new PdfPCell(new Phrase("SUBJECT", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("ENTRY", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A-", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B+", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B-", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C+", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C-", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D+", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D-", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   E", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("   X", boldFont));
                        table3.addCell(cell);
                        cell = new PdfPCell(new Phrase("    MEAN MARK", boldFont));
                        table3.addCell(cell);

                     // float[] columnWidths = new float[] {10f, 20f, 10f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 15f};
                      table3.setPaddingTop(TOP_ALIGNMENT);
                      table3.setWidths(columnWidths);
                      
                      ///DO YOUR MATH SON
                      try{
                          String getfm3 = "SELECT subject, entry, A, Am, Bp, B,Bm, Cp, C,Cm,Dp, D, Dm, E, X, MM,  FIND_IN_SET( MM, (SELECT GROUP_CONCAT( MM ORDER BY MM DESC ) FROM analysis WHERE form = '3' AND term = '"+term+"' AND yearr = '"+year+"')) AS rank FROM analysis WHERE form = '3' AND term = '"+term+"' AND yearr = '"+year+"' ORDER BY MM desc";
                          stm = conn.createStatement();
                          rs = stm.executeQuery(getfm3);
                         // table.addCell("ENGLISH", boldFont);
                          
                            while(rs.next())
                            {
                                String rank = rs.getString("rank");
                                String subject = rs.getString("subject");
                                //String form = rs.getString("form");
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
                                String MM = rs.getString("MM");
                                //set to pdf
                                table3.addCell(rank);
                                table3.addCell(subject);
                                table3.addCell(entry);
                                table3.addCell(A);
                                table3.addCell(Am);
                                table3.addCell(Bp);
                                table3.addCell(B);
                                table3.addCell(Bm);
                                table3.addCell(Cp);
                                table3.addCell(C);
                                table3.addCell(Cm);
                                table3.addCell(Dp);
                                table3.addCell(D);
                                table3.addCell(Dm);
                                table3.addCell(E);
                                table3.addCell(X);
                                table3.addCell(MM);
                            }
                      }catch(Exception e)
                      {
                      e.printStackTrace();
                      }
                       
                      document.add(table3);
                      document.add(new Paragraph("\n"));
                     ///////////////////
                      document.add(new Paragraph("SUBJECT MERIT FOR FORM 4 TERM"+term+" "+year+" "+name+" EXAMS.", FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, BaseColor.BLACK)));
                      document.add(new Paragraph("\n"));
                      
                       /////table 2                                                   
                        PdfPTable table4 = new PdfPTable(17);
                        table4.setWidthPercentage(100);

                        //PdfPCell cell;
                        cell = new PdfPCell(new Phrase("POSITION", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("SUBJECT", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("ENTRY", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   A-", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B+", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   B-", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C+", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   C-", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D+", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   D-", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   E", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("   X", boldFont));
                        table4.addCell(cell);
                        cell = new PdfPCell(new Phrase("    MEAN MARK", boldFont));
                        table4.addCell(cell);

                     // float[] columnWidths = new float[] {10f, 20f, 10f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 5f, 15f};
                      table4.setPaddingTop(TOP_ALIGNMENT);
                      table4.setWidths(columnWidths);
                      
                      ///DO YOUR MATH SON
                      try{
                          String getfm4 = "SELECT subject, entry, A, Am, Bp, B,Bm, Cp, C,Cm,Dp, D, Dm, E, X, MM,  FIND_IN_SET( MM, (SELECT GROUP_CONCAT( MM ORDER BY MM DESC ) FROM analysis WHERE form = '4' AND term = '"+term+"' AND yearr = '"+year+"')) AS rank FROM analysis WHERE form = '4' AND term = '"+term+"' AND yearr = '"+year+"' ORDER BY MM desc";
                          stm = conn.createStatement();
                          rs = stm.executeQuery(getfm4);
                         // table.addCell("ENGLISH", boldFont);
                          
                            while(rs.next())
                            {
                                String rank = rs.getString("rank");
                                String subject = rs.getString("subject");
                              //  String form = rs.getString("form");
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
                                String MM = rs.getString("MM");
                                //set to pdf
                                table4.addCell(rank);
                                table4.addCell(subject);
                                table4.addCell(entry);
                                table4.addCell(A);
                                table4.addCell(Am);
                                table4.addCell(Bp);
                                table4.addCell(B);
                                table4.addCell(Bm);
                                table4.addCell(Cp);
                                table4.addCell(C);
                                table4.addCell(Cm);
                                table4.addCell(Dp);
                                table4.addCell(D);
                                table4.addCell(Dm);
                                table4.addCell(E);
                                table4.addCell(X);
                                table4.addCell(MM);
                            }
                      }catch(Exception e)
                      {
                      e.printStackTrace();
                      }
                       
                      document.add(table4);
                     ///////////////////
                      document.close();
   
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog( null, "The subject merit has already been generated","Error", JOptionPane.ERROR_MESSAGE);
           
                    }
    
    }
}
