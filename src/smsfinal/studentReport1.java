/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static java.awt.Component.TOP_ALIGNMENT;
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
public class studentReport1 
{
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
     getPtsJunior gpj = new getPtsJunior();
   
    public void generate(String admNum, String year, String term, String forrm, String path)
    {
        DbConnection connect = new DbConnection();
    conn = connect.Connectdb();
     String mat1 ="" ,eng1 ="", kis1 ="",bio1 ="", che1 ="", phy1 ="", his1="", geo1="", cre1 ="", agr1 ="", bst1 ="", total1 ="", mean1 ="", meangrd1="";
      String mat2 ="" ,eng2 ="", kis2 ="",bio2 ="", che2 ="", phy2 ="", his2="", geo2="", cre2 ="", agr2 ="", bst2 ="", total2 ="", mean2 ="", meangrd2="";
       String mat3 ="" ,eng3 ="", kis3 ="",bio3 ="", che3 ="", phy3 ="", his3="", geo3="", cre3 ="", agr3 ="", bst3 ="", total3 ="", mean3 ="", meangrd3="";
        String meangrdAv ="",meanAv="",totalAv="",bstAvcom="",bstAvgrd="",bstAv="",agrAvcom="",agrAvgrd="",agrAv="",creAvcom="",creAvgrd="",creAv="",geoAvcom="",geoAvgrd="",geoAv="",hisAvcom="",hisAvgrd="",hisAv="",matAv="",bioAv="",bioAvgrd="",phyAvgrd="",phyAvcom="",bioAvcom="",cheAv="",cheAvcom="", phyAv="",cheAvgrd="",matAvgrd="", matAvcom="", engAv="", engAvgrd="", engAvcom="", kisAv="", kisAvcom="", kisAvgrd=""; 
         String name ="", form ="", newyr = "", newTerm = "";      
         String prevmean = "", prevTotal="", prev_Rank ="", frm ="", exRank="", kcp ="", kcpeRank ="";
                                                                                                               
    
    try{
        ///get cat 1
         String sqlGetCAT1 ="SELECT * FROM `cat_one` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
         stm = conn.createStatement();
         rs = stm.executeQuery(sqlGetCAT1);

         while(rs.next())
         {
             name = rs.getString("name");
             form = rs.getString("form");
             mat1 = rs.getString("mat");
             eng1 = rs.getString("eng");
             kis1 = rs.getString("kis");
             bio1 = rs.getString("bio");
             che1 = rs.getString("che");
             phy1 = rs.getString("phy");
             his1 = rs.getString("his");
             geo1 = rs.getString("geo");
             cre1 = rs.getString("cre");
             agr1 = rs.getString("agr");
             bst1 = rs.getString("bst");
             total1 = rs.getString("total");
             mean1 = rs.getString("meanmark");
             meangrd1 = rs.getString("meangrd");
         }
          try{//cat 2
                String sqlGetCAT2 ="SELECT * FROM `cat_two` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                stm = conn.createStatement();
                rs = stm.executeQuery(sqlGetCAT2);
                while(rs.next())
                {

                     mat2 = rs.getString("mat");
                     eng2 = rs.getString("eng");
                     kis2 = rs.getString("kis");
                     bio2 = rs.getString("bio");
                     che2 = rs.getString("che");
                     phy2 = rs.getString("phy");
                     his2 = rs.getString("his");
                     geo2 = rs.getString("geo");
                     cre2 = rs.getString("cre");
                     agr2 = rs.getString("agr");
                     bst2 = rs.getString("bst");
                     total2 = rs.getString("total");
                     mean2 = rs.getString("meanmark");
                     meangrd2 = rs.getString("meangrd");

                }
            }catch(Exception e)
            {
             e.printStackTrace();
            }
          //
          try{//cat 2
                String sqlGetCAT3 ="SELECT * FROM `cat_three` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                stm = conn.createStatement();
                rs = stm.executeQuery(sqlGetCAT3);
                while(rs.next())
                {
                     mat3 = rs.getString("mat");
                     eng3 = rs.getString("eng");
                     kis3 = rs.getString("kis");
                     bio3 = rs.getString("bio");
                     che3 = rs.getString("che");
                     phy3 = rs.getString("phy");
                     his3 = rs.getString("his");
                     geo3 = rs.getString("geo");
                     cre3 = rs.getString("cre");
                     agr3 = rs.getString("agr");
                     bst3 = rs.getString("bst");
                     total3 = rs.getString("total");
                     mean3 = rs.getString("meanmark");
                     meangrd3 = rs.getString("meangrd");


                }
            }catch(Exception e)
            {
             e.printStackTrace();
            }
          //
          try{//cat 2
                String sqlGetAv ="SELECT * FROM `cat_avg` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                stm = conn.createStatement();
                rs = stm.executeQuery(sqlGetAv);
                while(rs.next())
                {
                     matAv = rs.getString("mat");
                     matAvgrd = rs.getString("matgrd");
                     matAvcom = rs.getString("matcomment");
                     engAv = rs.getString("eng");
                     engAvgrd = rs.getString("enggrd");
                     engAvcom = rs.getString("engcomment");
                     kisAv = rs.getString("kis");
                     kisAvcom = rs.getString("kiscomment");
                     kisAvgrd = rs.getString("kisgrd");
                     bioAv = rs.getString("bio");
                     bioAvgrd = rs.getString("biogrd");
                     bioAvcom = rs.getString("biocomment");
                     cheAv = rs.getString("che");
                     cheAvgrd = rs.getString("chegrd");
                     cheAvcom = rs.getString("checomment");
                     phyAv = rs.getString("phy");
                     phyAvgrd = rs.getString("phygrd");
                     phyAvcom = rs.getString("phycomment");

                     hisAv = rs.getString("his");
                     hisAvgrd = rs.getString("hisgrd");
                     hisAvcom = rs.getString("hiscomment");
                     geoAv = rs.getString("geo");
                     geoAvgrd = rs.getString("geogrd");
                     geoAvcom = rs.getString("geocomment");
                     creAv = rs.getString("cre");
                     creAvgrd = rs.getString("cregrd");
                     creAvcom = rs.getString("crecomment");
                     agrAv = rs.getString("agr");
                     agrAvgrd = rs.getString("agrgrd");
                     agrAvcom = rs.getString("agrcomment");
                     bstAv = rs.getString("bst");
                     bstAvgrd = rs.getString("bstgrd");
                     bstAvcom = rs.getString("bstcomment");
                     totalAv = rs.getString("total");
                     meanAv = rs.getString("meanmark");
                     meangrdAv = rs.getString("meangrd");
                   // String name = rs.getString("name");

                    //String ter = (String) term.getSelectedItem();
                   // String yr = (String) year.getSelectedItem();
                    //String adm = adm_No.getText();
                     kcp = rs.getString("kcpe");
                    ////////


                   //rank for current exam

                }
                try{
                    String getExamRank = "SELECT adm,meanmark,total,meangrd, FIND_IN_SET( meanmark, (SELECT GROUP_CONCAT( meanmark ORDER BY meanmark DESC ) FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+year+"' AND term = '"+term+"' )) AS rank FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+year+"' AND term = '"+term+"' AND adm = '"+admNum+"' ORDER BY meanmark DESC";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(getExamRank);
                    while(rs.next())
                    {
                      exRank = rs.getString("rank");
                     //get kcpe rank
                    }
                    //
                    try{
                        String getkcpeRank = "SELECT kcpe,adm,meanmark,total,meangrd, FIND_IN_SET( kcpe, (SELECT GROUP_CONCAT( kcpe ORDER BY kcpe DESC ) FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+year+"' AND term = '"+term+"' )) AS rank FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+year+"' AND term = '"+term+"' AND adm = '"+admNum+"' ORDER BY meanmark DESC";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(getkcpeRank);
                        while(rs.next())
                        {
                             kcpeRank = rs.getString("rank");

                            if(term.equals("3"))
                            {
                                newyr =  year;
                                newTerm =  String.valueOf(Integer.parseInt(term)-1);
                            }else if(term.equals("2"))
                            {
                                newyr = year;
                                newTerm = String.valueOf(Integer.parseInt(term)-1);
                            }else if(term.equals("1"))
                            {
                                newyr = String.valueOf(Integer.parseInt( year)-1);
                                newTerm ="3";
                            }

                         }
                        //
                        try{
                            String prevTerm = "SELECT adm, name, kcpe,total, meanmark, FIND_IN_SET( meanmark, (SELECT GROUP_CONCAT( meanmark ORDER BY meanmark DESC ) FROM cat_avg WHERE form = '"+forrm+"'  AND yearr = '"+newyr+"' AND term = '"+newTerm+"' )) AS rank FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+newyr+"' AND term = '"+newTerm+"' ORDER BY meanmark desc";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(prevTerm);
                            if(rs.next())
                            {

                                 prevmean = rs.getString("meanmark");
                                 prevTotal = rs.getString("total");
                                 prev_Rank = rs.getString("rank");
                                 frm = forrm;
                            }
                                ///////////////////////////////////////////////////////
                            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                Document document = new Document();  
                                FileOutputStream file =  new FileOutputStream(path);
                                PdfWriter.getInstance(document, file);

                                document.open();
                               //image
                                Image image = Image.getInstance("badge.jpg");
                                image.setAlignment(Image.MIDDLE);
                                image.scaleAbsolute(150f, 100f);
                                document.add(image);
                                Font boldFont = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD);
                                Font norm = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
                               // document.add(new Paragraph("                ", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD, BaseColor.BLACK)));
                                Paragraph titl = new Paragraph("UNYOLO MIXED SECONDARY SCHOOL", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, com.itextpdf.text.Font.BOLD, BaseColor.BLACK));
                                titl.setAlignment(Element.ALIGN_CENTER);
                                document.add(titl);
                              
                               // document.add(new Paragraph("                                                   ", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, Font.BOLD, BaseColor.BLACK)));
                                Paragraph tit2 = new Paragraph("P.O BOX 31-40620, BORO", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, com.itextpdf.text.Font.BOLD, BaseColor.BLACK));
                                tit2.setAlignment(Element.ALIGN_CENTER);
                                document.add(tit2);
                                
                                document.add(new Paragraph("\n"));
                                //document.add(new Paragraph("                                                                  ", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, Font.BOLD, BaseColor.BLACK)));
                                Paragraph tit3 = new Paragraph("TERMINAL REPORT", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, com.itextpdf.text.Font.BOLD, BaseColor.BLACK));
                                tit3.setAlignment(Element.ALIGN_CENTER);
                                document.add(tit3);
                                document.add(new Paragraph("\n"));
                                PdfPTable t_able = new PdfPTable(1);
                                t_able.getDefaultCell().setBorder(0);
                                PdfPCell cellOne = new PdfPCell(new Phrase("Name:  "+name+"                                     "+"Form:  "+form+"            "));
                                PdfPCell celltwo = new PdfPCell(new Phrase("Term:  "+term+"                                      "+"Year:   "+year+"                          "+"Adm No:  "+admNum+"             "));
                                t_able.addCell(cellOne);
                                t_able.addCell(celltwo);
                                document.add(t_able);
                                document.add(new Paragraph("\n"));

                                PdfPTable table = new PdfPTable(8);
                                table.setWidthPercentage(100);
                                //1///////////////////<<<<<<<<<<---------------------------------set header
                                PdfPCell cell;
                                cell = new PdfPCell(new Phrase("SUBJECT", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" CAT 1", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" CAT 2", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" E.TERM", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" AVERAGE", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" GRADE", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" REMARKS", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("INITIALS", boldFont));
                                cell.setPadding(3);
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////---------english
                                cell = new PdfPCell(new Phrase("ENGLISH", norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+eng1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+eng2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+eng3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+engAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+engAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+engAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("", norm));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("KISWAHILI"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+kis1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+kis2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+kis3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+kisAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+kisAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+kisAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ///////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("MATHEMATICS"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+mat1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+mat2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+mat3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+matAv, norm));
                                table.addCell(cell);
                                 cell = new PdfPCell(new Phrase("       "+matAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+matAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ///////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("BIOLOGY"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+bio1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+bio2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+bio3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+bioAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+bioAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+bioAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ///////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("PHYSICS"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+phy1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+phy2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+phy3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+phyAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+phyAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+phyAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("CHEMISTRY"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+che1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+che2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+che3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+cheAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+cheAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+cheAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("GEOGRAPHY"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+geo1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+geo2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+geo3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+geoAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+geoAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+geoAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ///////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("HISTORY"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+his1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+his2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+his3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+hisAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+hisAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+hisAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("C.R.E"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+cre1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+cre2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+cre3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+creAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+creAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+creAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("AGRICULTURE"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+agr1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+agr2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+agr3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+agrAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+agrAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+agrAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("BUSINESS STUDIES"));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+bst1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+bst2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+bst3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+bstAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+bstAvgrd, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(" "+bstAvcom, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                               ////////////////////////////////////////////////////////////////////EMPTYYYYYYYYYY
                                cell = new PdfPCell(new Phrase(" "));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////EMPTYYYYYYYYYY
                                cell = new PdfPCell(new Phrase("  "));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////EMPTYYYYYYYYYY
                                cell = new PdfPCell(new Phrase("  "));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////dISP TOTAL
                                cell = new PdfPCell(new Phrase("TOTAL MARKS", boldFont));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("  "+total1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("   "+total2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+total3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+totalAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                 ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("MEAN SCORE", boldFont));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+mean1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("    "+mean2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+mean3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("       "+meanAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                ////////////////////////////////////////////////////////////////////
                                cell = new PdfPCell(new Phrase("MEAN GRADE", boldFont));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+meangrd1, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("     "+meangrd2, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("      "+meangrd3, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase("        "+meangrdAv, norm));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                cell = new PdfPCell(new Phrase(""));
                                table.addCell(cell);
                                /////////////////////////////////////////////////////
                               /////SET WIDTHS
                                float[] columnWidths = new float[] {22f, 8f, 8f, 10f, 12f, 10f, 12f, 10f};
                                table.setPaddingTop(TOP_ALIGNMENT);

                                table.setWidths(columnWidths);

                               document.add(table);
                               document.add(new Paragraph("\n"));
                               //another table----------------------------------------------------------------------------------------------------
                               PdfPTable table1 = new PdfPTable(7);
                               table1.setWidthPercentage(100);
                              //1///////////////////<<<<<<<<<<---------------------------------set header
                               PdfPCell cell1;
                               cell1 = new PdfPCell(new Phrase(" "));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                                                                           ///
                               cell1 = new PdfPCell(new Phrase("  POSITION", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("    MARKS", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("    POINTS", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("      MEAN", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("MARKS", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               cell1 = new PdfPCell(new Phrase("       "+ kcp));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                                                                           
                                                                           /////==========================================================\
                               cell1 = new PdfPCell(new Phrase("LAST TERM", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               ///
                               cell1 = new PdfPCell(new Phrase("        "+prev_Rank));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("        "+prevTotal));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("        "+ gpj.juniorGetGrade(prevmean)));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("        "+prevmean));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("KCPE AV", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               cell1 = new PdfPCell(new Phrase("       "+String.valueOf(Integer.parseInt(kcp)/5)));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                                                                            /////==========================================================\
                               cell1 = new PdfPCell(new Phrase("THIS TERM", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               ///
                               cell1 = new PdfPCell(new Phrase("        "+ exRank));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("       "+totalAv));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("       "+gpj.juniorGetGrade(totalAv)));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("        "+meanAv));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               //
                               cell1 = new PdfPCell(new Phrase("POSITION", boldFont));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               cell1 = new PdfPCell(new Phrase("        "+kcpeRank));
                               cell1.setPadding(3);
                               table1.addCell(cell1);

                               //////
                               document.add(table1);
                               cell1 = new PdfPCell(new Phrase(" "));
                               cell1.setPadding(3);
                               table1.addCell(cell1);
                               ////end of table 2

                               document.add(new Paragraph("\n"));
                             //  document.add(new Paragraph("                                                                   ", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                               //document.add(new Paragraph("HOUSE TEACHER ............................................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                               Paragraph tit4 = new Paragraph("REMARKS", FontFactory.getFont(FontFactory.HELVETICA, 11, com.itextpdf.text.Font.BOLD, BaseColor.BLACK));
                                tit4.setAlignment(Element.ALIGN_CENTER);
                                document.add(tit4);
                               document.add(new Paragraph("CLASS TEACHER .............................................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                               document.add(new Paragraph("PRINCIPAL ........................................................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                               document.add(new Paragraph("Next term Commences on........................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                                document.add(new Paragraph("Next term Fees shs  ....................Balance B/F Shs...............Total shs..........................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                               document.add(new Paragraph("Report seen by ........................................... Parent/Guardian ............................................ Date", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK) ));
                             // document.add(new Paragraph("                                                                                                                                                                                                                              "));
                               document.add(new Paragraph("                                This report was issued without any erasure or alteration whatsoever.", FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD, BaseColor.BLACK)));

                            document.close();
                        }catch(Exception e)
                        {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog( null, "The student report cards have already been generated","Error", JOptionPane.ERROR_MESSAGE);

                        }
                    }catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }catch(Exception e)
            {
             e.printStackTrace();
            }
    }catch(Exception e)
    {
    e.printStackTrace();
    }
    
    }
}
