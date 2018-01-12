/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
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
public class studentReport2 
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
    try{
        ///get cat 1
        String sqlGetCAT1 ="SELECT * FROM `cat_one` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                     stm = conn.createStatement();
                     rs = stm.executeQuery(sqlGetCAT1);

                     while(rs.next())
                     {
                        String name = rs.getString("name");
                        String mat1 = rs.getString("mat");
                        String eng1 = rs.getString("eng");
                        String kis1 = rs.getString("kis");
                        String bio1 = rs.getString("bio");
                        String che1 = rs.getString("che");
                        String phy1 = rs.getString("phy");
                        String his1 = rs.getString("his");
                        String geo1 = rs.getString("geo");
                        String cre1 = rs.getString("cre");
                        String agr1 = rs.getString("agr");
                        String bst1 = rs.getString("bst");
                        String total1 = rs.getString("total");
                        String mean1 = rs.getString("meanmark");
                        String meangrd1 = rs.getString("meangrd");
                        try{//cat 2
                            String sqlGetCAT2 ="SELECT * FROM `cat_two` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(sqlGetCAT2);
                            while(rs.next())
                            {
                                String mat2 = rs.getString("mat");
                                String eng2 = rs.getString("eng");
                                String kis2 = rs.getString("kis");
                                String bio2 = rs.getString("bio");
                                String che2 = rs.getString("che");
                                String phy2 = rs.getString("phy");
                                String his2 = rs.getString("his");
                                String geo2 = rs.getString("geo");
                                String cre2 = rs.getString("cre");
                                String agr2 = rs.getString("agr");
                                String bst2 = rs.getString("bst");
                                String total2 = rs.getString("total");
                                String mean2 = rs.getString("meanmark");
                                String meangrd2 = rs.getString("meangrd");
                                try{//cat 2
                                    String sqlGetCAT3 ="SELECT * FROM `cat_three` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                                    stm = conn.createStatement();
                                    rs = stm.executeQuery(sqlGetCAT3);
                                    while(rs.next())
                                    {
                                        String mat3 = rs.getString("mat");
                                        String eng3 = rs.getString("eng");
                                        String kis3 = rs.getString("kis");
                                        String bio3 = rs.getString("bio");
                                        String che3 = rs.getString("che");
                                        String phy3 = rs.getString("phy");
                                        String his3 = rs.getString("his");
                                        String geo3 = rs.getString("geo");
                                        String cre3 = rs.getString("cre");
                                        String agr3 = rs.getString("agr");
                                        String bst3 = rs.getString("bst");
                                        String total3 = rs.getString("total");
                                        String mean3 = rs.getString("meanmark");
                                        String meangrd3 = rs.getString("meangrd");
                                        try{//cat 2
                                            String sqlGetAv ="SELECT * FROM `cat_avg` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                                            stm = conn.createStatement();
                                            rs = stm.executeQuery(sqlGetAv);
                                            while(rs.next())
                                            {
                                                String matAv = rs.getString("mat");
                                                String matAvgrd = rs.getString("matgrd");
                                                String matAvcom = rs.getString("matcomment");
                                                String engAv = rs.getString("eng");
                                                String engAvgrd = rs.getString("enggrd");
                                                String engAvcom = rs.getString("engcomment");
                                                String kisAv = rs.getString("kis");
                                                String kisAvcom = rs.getString("kiscomment");
                                                String kisAvgrd = rs.getString("kisgrd");
                                                String bioAv = rs.getString("bio");
                                                String bioAvgrd = rs.getString("biogrd");
                                                String bioAvcom = rs.getString("biocomment");
                                                String cheAv = rs.getString("che");
                                                String cheAvgrd = rs.getString("chegrd");
                                                String cheAvcom = rs.getString("checomment");
                                                String phyAv = rs.getString("phy");
                                                String phyAvgrd = rs.getString("phygrd");
                                                String phyAvcom = rs.getString("phycomment");
                                                String hisAv = rs.getString("his");
                                                String hisAvgrd = rs.getString("hisgrd");
                                                String hisAvcom = rs.getString("hiscomment");
                                                String geoAv = rs.getString("geo");
                                                String geoAvgrd = rs.getString("geogrd");
                                                String geoAvcom = rs.getString("geocomment");
                                                String creAv = rs.getString("cre");
                                                String creAvgrd = rs.getString("cregrd");
                                                String creAvcom = rs.getString("crecomment");
                                                String agrAv = rs.getString("agr");
                                                String agrAvgrd = rs.getString("agrgrd");
                                                String agrAvcom = rs.getString("agrcomment");
                                                String bstAv = rs.getString("bst");
                                                String bstAvgrd = rs.getString("bstgrd");
                                                String bstAvcom = rs.getString("bstcomment");
                                                String totalAv = rs.getString("total");
                                                String meanAv = rs.getString("meanmark");
                                                String meangrdAv = rs.getString("meangrd");
                                               // String name = rs.getString("name");
                                                String form = rs.getString("form");
                                                //String ter = (String) term.getSelectedItem();
                                               // String yr = (String) year.getSelectedItem();
                                                //String adm = adm_No.getText();
                                                String kcp = rs.getString("kcpe");
                                                ////////
                                               //rank for current exam
                                                try{
                                                    String getExamRank = "SELECT adm, name, kcpe, meanmark, FIND_IN_SET( meanmark, (SELECT GROUP_CONCAT( meanmark ORDER BY meanmark DESC ) FROM cat_avg WHERE form = '"+forrm+"'  AND yearr = '"+year+"' AND term = '"+term+"' )) AS rank FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+year+"' AND term = '"+term+"' ORDER BY meanmark desc";
                                                    stm = conn.createStatement();
                                                    rs = stm.executeQuery(getExamRank);
                                                    while(rs.next())
                                                    {
                                                     String exRank = rs.getString("rank");
                                                     //get kcpe rank
                                                        try{
                                                            String getkcpeRank = "SELECT adm, name, kcpe, FIND_IN_SET( kcpe, (SELECT GROUP_CONCAT( kcpe ORDER BY kcpe DESC ) FROM cat_avg WHERE form = '"+forrm+"' )) AS rank FROM cat_avg WHERE adm = '"+admNum+"' ORDER BY kcpe desc";
                                                            stm = conn.createStatement();
                                                            rs = stm.executeQuery(getkcpeRank);
                                                            while(rs.next())
                                                            {
                                                             String kcpeRank = rs.getString("rank");
                                                                       
                                                             String newyr = "", newTerm = "";
                                                             if(term.equals("3")|| term.equals("2"))
                                                             {
                                                                 newyr =  year;
                                                                 newTerm =  term;
                                                             }else if(term.equals("1"))
                                                             {
                                                                 newyr = String.valueOf(Integer.parseInt( year)-1);
                                                                 newTerm ="3";
                                                             }
                                                                try{
                                                                    String prevTerm = "SELECT adm, name, kcpe, meanmark, FIND_IN_SET( meanmark, (SELECT GROUP_CONCAT( meanmark ORDER BY meanmark DESC ) FROM cat_avg WHERE form = '"+forrm+"'  AND yearr = '"+year+"' AND term = '"+term+"' )) AS rank FROM cat_avg WHERE form = '"+forrm+"' AND yearr = '"+newyr+"' AND term = '"+newTerm+"' ORDER BY meanmark desc";
                                                                    stm = conn.createStatement();
                                                                    rs = stm.executeQuery(prevTerm);
                                                                    if(rs.next())
                                                                    {
                                                                         
                                                                    }else{
                                                                       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
                                                                            document.add(new Paragraph("                UNYOLO MIXED SECONDARY SCHOOL", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD, BaseColor.BLACK)));
                                                                            document.add(new Paragraph("                                                   P.O BOX 31-40620, BORO", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, Font.BOLD, BaseColor.BLACK)));
                                                                            document.add(new Paragraph("\n"));
                                                                            document.add(new Paragraph("                                                                  TERMINAL REPORT", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, Font.BOLD, BaseColor.BLACK)));
                                                                            document.add(new Paragraph("\n"));
                                                                            PdfPTable t_able = new PdfPTable(1);
                                                                            t_able.getDefaultCell().setBorder(0);
                                                                            PdfPCell cellOne = new PdfPCell(new Phrase("Name:  "+name+"                                                   "+"Form:  "+form+"            "));
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
                                                                           cell1 = new PdfPCell(new Phrase("KCPE AV", boldFont));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           cell1 = new PdfPCell(new Phrase("       "+String.valueOf(Integer.parseInt(kcp)/5)));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           /////==========================================================\
                                                                           cell1 = new PdfPCell(new Phrase("LAST TERM", boldFont));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           ///
                                                                           cell1 = new PdfPCell(new Phrase("  "));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           //
                                                                           cell1 = new PdfPCell(new Phrase(" "));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           //
                                                                           cell1 = new PdfPCell(new Phrase("   "));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           //
                                                                           cell1 = new PdfPCell(new Phrase("    "));
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
                                                                           cell1 = new PdfPCell(new Phrase("THIS TERM", boldFont));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           ///
                                                                           cell1 = new PdfPCell(new Phrase("        "+exRank));
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
                                                                           cell1 = new PdfPCell(new Phrase("        "+ kcpeRank));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);

                                                                           //////
                                                                           document.add(table1);
                                                                           cell1 = new PdfPCell(new Phrase(" "));
                                                                           cell1.setPadding(3);
                                                                           table1.addCell(cell1);
                                                                           ////end of table 2

                                                                           document.add(new Paragraph("\n"));
                                                                           document.add(new Paragraph("                                                                   REMARKS", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                                                                          // document.add(new Paragraph("HOUSE TEACHER ............................................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                                                                           document.add(new Paragraph("CLASS TEACHER .............................................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                                                                           document.add(new Paragraph("PRINCIPAL ........................................................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));

                                                                           document.add(new Paragraph("Next term Commences on........................................................................................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                                                                            document.add(new Paragraph("Next term Fees shs  ....................Balance B/F Shs...............Total shs..........................................", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK)));
                                                                           document.add(new Paragraph("Report seen by ........................................... Parent/Guardian ............................................ Date", FontFactory.getFont(FontFactory.HELVETICA, 11, Font.BOLD, BaseColor.BLACK) ));
                                                                         // document.add(new Paragraph("                                                                                                                                                                                                                              "));
                                                                           document.add(new Paragraph("                                This report was issued without any erasure or alteration whatsoever.", FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD, BaseColor.BLACK)));

                                                                        document.close();
                                                                        
                                                                    }
                                                                }catch(Exception e)
                                                                {
                                                                    e.printStackTrace();
                                                                    JOptionPane.showMessageDialog( null, "The report cards have already been generated","Error", JOptionPane.ERROR_MESSAGE);
           
                                                                }
                                                             }
                                                        }catch(Exception e)
                                                        {
                                                            e.printStackTrace();
                                                        }

                                                    }
                                                }catch(Exception e)
                                                {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }catch(Exception e)
                                        {
                                         e.printStackTrace();
                                        }
                                    }
                                }catch(Exception e)
                                {
                                 e.printStackTrace();
                                }
                            }
                        }catch(Exception e)
                        {
                         e.printStackTrace();
                        }
                     }
    }catch(Exception e)
    {
    e.printStackTrace();
    }
    
    }
}
