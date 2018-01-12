/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
//import javax.swing.JOptionPane;

/**
 *
 * @author HiGHROLLER
 */
public class getmeanmark
{
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void findmean(String form, String year, String term, String exam)
    {
        DbConnection connect = new DbConnection();
        conn = connect.Connectdb();
        String ex = "";
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        switch (exam) 
        {
            case "CAT 1":
                ex = "1";
                //get sum of cat_one_pts columns 
                try{
                    
                    String getSum = "SELECT SUM(`mat`) , SUM(`eng`), SUM(`kis`), SUM(`che`), SUM(`bio`), SUM(`phy`), SUM(`geo`), SUM(`his`), SUM(`cre`), SUM(`bst`),SUM(`agr`) FROM cat_one_pts WHERE `yearr` = '"+year+"' AND `term` = '"+term+"' AND `form` = '"+form+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(getSum);
 
                    while(rs.next())
                    {
                        String mat = rs.getString("SUM(`mat`)");
                        String eng = rs.getString("SUM(`eng`)");
                        String kis = rs.getString("SUM(`kis`)");
                        String bio = rs.getString("SUM(`bio`)");
                        String che = rs.getString("SUM(`che`)");
                        String phy = rs.getString("SUM(`phy`)");
                        String geo = rs.getString("SUM(`geo`)");
                        String his = rs.getString("SUM(`his`)");
                        String cre = rs.getString("SUM(`cre`)");
                        String agr = rs.getString("SUM(`agr`)");
                        String bst = rs.getString("SUM(`bst`)");
                       //  JOptionPane.showMessageDialog(null, "tot pts"+eng);
                         try{
                                String getEntry = "SELECT * FROM `subject_entry` WHERE  adm = '"+form+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND name ='"+ex+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(getEntry);
                                while(rs.next())
                                {
                                    
                                  String engEntry = rs.getString("eng");
                                  
                                  String matEntry = rs.getString("mat");
                                  String kisEntry = rs.getString("kis");
                                  String bioEntry = rs.getString("bio");
                                  String cheEntry = rs.getString("che");
                                  String phyEntry = rs.getString("phy");
                                  String geoEntry = rs.getString("geo");
                                  String hisEntry = rs.getString("his");
                                  String creEntry = rs.getString("cre");
                                  String bstEntry = rs.getString("bst");
                                  String agrEntry = rs.getString("agr");
                                  String adm = rs.getString("adm");
                               //    JOptionPane.showMessageDialog(null, "ent"+engEntry);
                                  String eng_mm = solve(eng, engEntry);
                                  String mat_mm = solve(mat, matEntry);
                                  String kis_mm = solve(kis, kisEntry);
                                  String che_mm = solve(che, cheEntry);//
                                  String bio_mm = solve(bio, bioEntry);
                                  String phy_mm = solve(phy, phyEntry);
                                  String geo_mm = solve(geo, geoEntry);
                                  String his_mm = solve(his, hisEntry);
                                  String cre_mm = solve(cre, creEntry);
                                  String agr_mm = solve(agr, agrEntry);
                                  String bst_mm = solve(bst, bstEntry);
                                   
                                     //update analysis table
                                  try{
                                      //update eng
                                        String sql_update_eng ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(eng_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'English'"; 
                                        pst = conn.prepareStatement(sql_update_eng);
                                        pst.execute();
                                        //update mat
                                        String sql_update_mat ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(mat_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Mathematics'"; 
                                        pst = conn.prepareStatement(sql_update_mat);
                                        pst.execute();
                                        //update kis
                                        String sql_update_kis ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(kis_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Kiswahili'"; 
                                        pst = conn.prepareStatement(sql_update_kis);
                                        pst.execute();
                                        //update bio
                                        String sql_update_bio ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bio_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Biology'"; 
                                        pst = conn.prepareStatement(sql_update_bio);
                                        pst.execute();
                                        //update che
                                        String sql_update_che ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(che_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Chemistry'"; 
                                        pst = conn.prepareStatement(sql_update_che);
                                        pst.execute();
                                        //update phy
                                        String sql_update_phy ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(phy_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Physics'"; 
                                        pst = conn.prepareStatement(sql_update_phy);
                                        pst.execute();
                                        //update geo
                                        String sql_update_geo ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(geo_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Geography'"; 
                                        pst = conn.prepareStatement(sql_update_geo);
                                        pst.execute();
                                        //update his
                                        String sql_update_his ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(his_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'History'"; 
                                        pst = conn.prepareStatement(sql_update_his);
                                        pst.execute();
                                        //update cre
                                        String sql_update_cre ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(cre_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'CRE'"; 
                                        pst = conn.prepareStatement(sql_update_cre);
                                        pst.execute();
                                        //update agr
                                        String sql_update_agr ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(agr_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Agriculture'"; 
                                        pst = conn.prepareStatement(sql_update_agr);
                                        pst.execute();
                                        //update bst
                                        String sql_update_bst ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bst_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Business Studies'"; 
                                        pst = conn.prepareStatement(sql_update_bst);
                                        pst.execute();
                                  }catch(Exception e)
                                  {
                                  e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "final");
                                  }

                                }
                            }catch(Exception e)
                            {
                            e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "fygwebyidshfvweui ns");
                            }

                    }
                }catch(Exception e)
                {
                e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "mwanzi ns"); 

                }
                break;
            case "CAT 2":
                ex = "2";
                try{
                    String getSum = "SELECT SUM(`mat`) , SUM(`eng`), SUM(`kis`), SUM(`che`), SUM(`bio`), SUM(`phy`), SUM(`geo`), SUM(`his`), SUM(`cre`), SUM(`bst`),SUM(`agr`) FROM cat_two_pts WHERE `yearr` = '"+year+"' AND `term` = '"+term+"' AND `form` = '"+form+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(getSum);
 
                    while(rs.next())
                    {
                        String mat = rs.getString("SUM(`mat`)");
                        String eng = rs.getString("SUM(`eng`)");
                        String kis = rs.getString("SUM(`kis`)");
                        String bio = rs.getString("SUM(`bio`)");
                        String che = rs.getString("SUM(`che`)");
                        String phy = rs.getString("SUM(`phy`)");
                        String geo = rs.getString("SUM(`geo`)");
                        String his = rs.getString("SUM(`his`)");
                        String cre = rs.getString("SUM(`cre`)");
                        String agr = rs.getString("SUM(`agr`)");
                        String bst = rs.getString("SUM(`bst`)");
                      
                         try{
                                String getEntry = "SELECT * FROM `subject_entry` WHERE  adm = '"+form+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND name ='"+ex+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(getEntry);
                                while(rs.next())
                                {
                                  String engEntry = rs.getString("eng");
                                  String matEntry = rs.getString("mat");
                                  String kisEntry = rs.getString("kis");
                                  String bioEntry = rs.getString("bio");
                                  String cheEntry = rs.getString("che");
                                  String phyEntry = rs.getString("phy");
                                  String geoEntry = rs.getString("geo");
                                  String hisEntry = rs.getString("his");
                                  String creEntry = rs.getString("cre");
                                  String bstEntry = rs.getString("bst");
                                  String agrEntry = rs.getString("agr");
                                 
                                  
                                  String adm = rs.getString("adm");
                                  
                                  String eng_mm = solve(eng, engEntry);
                                  // JOptionPane.showMessageDialog(null, "eng mean "+ eng_mm);
                                  String mat_mm = solve(mat, matEntry);
                                  String kis_mm = solve(kis, kisEntry);
                                  String che_mm = solve(che, cheEntry);//
                                  String bio_mm = solve(bio, bioEntry);
                                  String phy_mm = solve(phy, phyEntry);
                                  String geo_mm = solve(geo, geoEntry);
                                  String his_mm = solve(his, hisEntry);
                                  String cre_mm = solve(cre, creEntry);
                                  String agr_mm = solve(agr, agrEntry);
                                  String bst_mm = solve(bst, bstEntry);
                                  
                                  //JOptionPane.showMessageDialog(null, eng_mm);

                                     //update analysis table
                                  try{
                                      //update eng
                                        String sql_update_eng ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(eng_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'English'"; 
                                        pst = conn.prepareStatement(sql_update_eng);
                                        pst.execute();
                                        //update mat
                                        String sql_update_mat ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(mat_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Mathematics'"; 
                                        pst = conn.prepareStatement(sql_update_mat);
                                        pst.execute();
                                        //update kis
                                        String sql_update_kis ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(kis_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Kiswahili'"; 
                                        pst = conn.prepareStatement(sql_update_kis);
                                        pst.execute();
                                        //update bio
                                        String sql_update_bio ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bio_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Biology'"; 
                                        pst = conn.prepareStatement(sql_update_bio);
                                        pst.execute();
                                        //update che
                                        String sql_update_che ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(che_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Chemistry'"; 
                                        pst = conn.prepareStatement(sql_update_che);
                                        pst.execute();
                                        //update phy
                                        String sql_update_phy ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(phy_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Physics'"; 
                                        pst = conn.prepareStatement(sql_update_phy);
                                        pst.execute();
                                        //update geo
                                        String sql_update_geo ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(geo_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Geography'"; 
                                        pst = conn.prepareStatement(sql_update_geo);
                                        pst.execute();
                                        //update his
                                        String sql_update_his ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(his_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'History'"; 
                                        pst = conn.prepareStatement(sql_update_his);
                                        pst.execute();
                                        //update cre
                                        String sql_update_cre ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(cre_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'CRE'"; 
                                        pst = conn.prepareStatement(sql_update_cre);
                                        pst.execute();
                                        //update agr
                                        String sql_update_agr ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(agr_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Agriculture'"; 
                                        pst = conn.prepareStatement(sql_update_agr);
                                        pst.execute();
                                        //update bst
                                        String sql_update_bst ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bst_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Business Studies'"; 
                                        pst = conn.prepareStatement(sql_update_bst);
                                        pst.execute();
                                  }catch(Exception e)
                                  {
                                  e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "final");
                                  }

                                }
                            }catch(Exception e)
                            {
                            e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "fygwebyidshfvweui ns");
                            }

                    }
                }catch(Exception e)
                {
                e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "mwanzi ns"); 

                }
                break;
            case "END TERM":
                ex = "3";
                try{
                    String getSum = "SELECT SUM(`mat`) , SUM(`eng`), SUM(`kis`), SUM(`che`), SUM(`bio`), SUM(`phy`), SUM(`geo`), SUM(`his`), SUM(`cre`), SUM(`bst`),SUM(`agr`) FROM cat_three_pts WHERE `yearr` = '"+year+"' AND `term` = '"+term+"' AND `form` = '"+form+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(getSum);
 
                    while(rs.next())
                    {
                        String mat = rs.getString("SUM(`mat`)");
                        String eng = rs.getString("SUM(`eng`)");
                        String kis = rs.getString("SUM(`kis`)");
                        String bio = rs.getString("SUM(`bio`)");
                        String che = rs.getString("SUM(`che`)");
                        String phy = rs.getString("SUM(`phy`)");
                        String geo = rs.getString("SUM(`geo`)");
                        String his = rs.getString("SUM(`his`)");
                        String cre = rs.getString("SUM(`cre`)");
                        String agr = rs.getString("SUM(`agr`)");
                        String bst = rs.getString("SUM(`bst`)");
                      
                         try{
                                String getEntry = "SELECT * FROM `subject_entry` WHERE  adm = '"+form+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND name ='"+ex+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(getEntry);
                                while(rs.next())
                                {
                                  String engEntry = rs.getString("eng");
                                  String matEntry = rs.getString("mat");
                                  String kisEntry = rs.getString("kis");
                                  String bioEntry = rs.getString("bio");
                                  String cheEntry = rs.getString("che");
                                  String phyEntry = rs.getString("phy");
                                  String geoEntry = rs.getString("geo");
                                  String hisEntry = rs.getString("his");
                                  String creEntry = rs.getString("cre");
                                  String bstEntry = rs.getString("bst");
                                  String agrEntry = rs.getString("agr");
                                 
                                  
                                  String adm = rs.getString("adm");
                                  
                                  String eng_mm = solve(eng, engEntry);
                                  // JOptionPane.showMessageDialog(null, "eng mean "+ eng_mm);
                                  String mat_mm = solve(mat, matEntry);
                                  String kis_mm = solve(kis, kisEntry);
                                  String che_mm = solve(che, cheEntry);//
                                  String bio_mm = solve(bio, bioEntry);
                                  String phy_mm = solve(phy, phyEntry);
                                  String geo_mm = solve(geo, geoEntry);
                                  String his_mm = solve(his, hisEntry);
                                  String cre_mm = solve(cre, creEntry);
                                  String agr_mm = solve(agr, agrEntry);
                                  String bst_mm = solve(bst, bstEntry);
                                  
                                  //JOptionPane.showMessageDialog(null, eng_mm);

                                     //update analysis table
                                  try{
                                      //update eng
                                        String sql_update_eng ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(eng_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'English'"; 
                                        pst = conn.prepareStatement(sql_update_eng);
                                        pst.execute();
                                        //update mat
                                        String sql_update_mat ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(mat_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Mathematics'"; 
                                        pst = conn.prepareStatement(sql_update_mat);
                                        pst.execute();
                                        //update kis
                                        String sql_update_kis ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(kis_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Kiswahili'"; 
                                        pst = conn.prepareStatement(sql_update_kis);
                                        pst.execute();
                                        //update bio
                                        String sql_update_bio ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bio_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Biology'"; 
                                        pst = conn.prepareStatement(sql_update_bio);
                                        pst.execute();
                                        //update che
                                        String sql_update_che ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(che_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Chemistry'"; 
                                        pst = conn.prepareStatement(sql_update_che);
                                        pst.execute();
                                        //update phy
                                        String sql_update_phy ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(phy_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Physics'"; 
                                        pst = conn.prepareStatement(sql_update_phy);
                                        pst.execute();
                                        //update geo
                                        String sql_update_geo ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(geo_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Geography'"; 
                                        pst = conn.prepareStatement(sql_update_geo);
                                        pst.execute();
                                        //update his
                                        String sql_update_his ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(his_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'History'"; 
                                        pst = conn.prepareStatement(sql_update_his);
                                        pst.execute();
                                        //update cre
                                        String sql_update_cre ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(cre_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'CRE'"; 
                                        pst = conn.prepareStatement(sql_update_cre);
                                        pst.execute();
                                        //update agr
                                        String sql_update_agr ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(agr_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Agriculture'"; 
                                        pst = conn.prepareStatement(sql_update_agr);
                                        pst.execute();
                                        //update bst
                                        String sql_update_bst ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bst_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Business Studies'"; 
                                        pst = conn.prepareStatement(sql_update_bst);
                                        pst.execute();
                                  }catch(Exception e)
                                  {
                                  e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "final");
                                  }

                                }
                            }catch(Exception e)
                            {
                            e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "fygwebyidshfvweui ns");
                            }

                    }
                }catch(Exception e)
                {
                e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "mwanzi ns"); 

                }
                break;
            case "AVERAGE":
               ex = "4";
               try{
                    String getSum = "SELECT SUM(`mat`) , SUM(`eng`), SUM(`kis`), SUM(`che`), SUM(`bio`), SUM(`phy`), SUM(`geo`), SUM(`his`), SUM(`cre`), SUM(`bst`),SUM(`agr`) FROM cat_avg_pts WHERE `yearr` = '"+year+"' AND `term` = '"+term+"' AND `form` = '"+form+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(getSum);
 
                    while(rs.next())
                    {
                        String mat = rs.getString("SUM(`mat`)");
                        String eng = rs.getString("SUM(`eng`)");
                        String kis = rs.getString("SUM(`kis`)");
                        String bio = rs.getString("SUM(`bio`)");
                        String che = rs.getString("SUM(`che`)");
                        String phy = rs.getString("SUM(`phy`)");
                        String geo = rs.getString("SUM(`geo`)");
                        String his = rs.getString("SUM(`his`)");
                        String cre = rs.getString("SUM(`cre`)");
                        String agr = rs.getString("SUM(`agr`)");
                        String bst = rs.getString("SUM(`bst`)");
                      
                         try{
                                String getEntry = "SELECT * FROM `subject_entry` WHERE  adm = '"+form+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND name ='"+ex+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(getEntry);
                                while(rs.next())
                                {
                                  String engEntry = rs.getString("eng");
                                  String matEntry = rs.getString("mat");
                                  String kisEntry = rs.getString("kis");
                                  String bioEntry = rs.getString("bio");
                                  String cheEntry = rs.getString("che");
                                  String phyEntry = rs.getString("phy");
                                  String geoEntry = rs.getString("geo");
                                  String hisEntry = rs.getString("his");
                                  String creEntry = rs.getString("cre");
                                  String bstEntry = rs.getString("bst");
                                  String agrEntry = rs.getString("agr");
                                 
                                  
                                  String adm = rs.getString("adm");
                                  
                                  String eng_mm = solve(eng, engEntry);
                                  // JOptionPane.showMessageDialog(null, "eng mean "+ eng_mm);
                                  String mat_mm = solve(mat, matEntry);
                                  String kis_mm = solve(kis, kisEntry);
                                  String che_mm = solve(che, cheEntry);//
                                  String bio_mm = solve(bio, bioEntry);
                                  String phy_mm = solve(phy, phyEntry);
                                  String geo_mm = solve(geo, geoEntry);
                                  String his_mm = solve(his, hisEntry);
                                  String cre_mm = solve(cre, creEntry);
                                  String agr_mm = solve(agr, agrEntry);
                                  String bst_mm = solve(bst, bstEntry);
                                  
                                  //JOptionPane.showMessageDialog(null, eng_mm);

                                     //update analysis table
                                  try{
                                      //update eng
                                        String sql_update_eng ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(eng_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'English'"; 
                                        pst = conn.prepareStatement(sql_update_eng);
                                        pst.execute();
                                        //update mat
                                        String sql_update_mat ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(mat_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Mathematics'"; 
                                        pst = conn.prepareStatement(sql_update_mat);
                                        pst.execute();
                                        //update kis
                                        String sql_update_kis ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(kis_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Kiswahili'"; 
                                        pst = conn.prepareStatement(sql_update_kis);
                                        pst.execute();
                                        //update bio
                                        String sql_update_bio ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bio_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Biology'"; 
                                        pst = conn.prepareStatement(sql_update_bio);
                                        pst.execute();
                                        //update che
                                        String sql_update_che ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(che_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Chemistry'"; 
                                        pst = conn.prepareStatement(sql_update_che);
                                        pst.execute();
                                        //update phy
                                        String sql_update_phy ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(phy_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Physics'"; 
                                        pst = conn.prepareStatement(sql_update_phy);
                                        pst.execute();
                                        //update geo
                                        String sql_update_geo ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(geo_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Geography'"; 
                                        pst = conn.prepareStatement(sql_update_geo);
                                        pst.execute();
                                        //update his
                                        String sql_update_his ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(his_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'History'"; 
                                        pst = conn.prepareStatement(sql_update_his);
                                        pst.execute();
                                        //update cre
                                        String sql_update_cre ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(cre_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'CRE'"; 
                                        pst = conn.prepareStatement(sql_update_cre);
                                        pst.execute();
                                        //update agr
                                        String sql_update_agr ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(agr_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Agriculture'"; 
                                        pst = conn.prepareStatement(sql_update_agr);
                                        pst.execute();
                                        //update bst
                                        String sql_update_bst ="UPDATE `analysis` SET `MM`='"+df.format(Double.parseDouble(bst_mm))+"' WHERE `form` = '"+adm+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"' AND `exam` =  '"+ex+"' AND `subject` = 'Business Studies'"; 
                                        pst = conn.prepareStatement(sql_update_bst);
                                        pst.execute();
                                  }catch(Exception e)
                                  {
                                  e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "final");
                                  }

                                }
                            }catch(Exception e)
                            {
                            e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "fygwebyidshfvweui ns");
                            }

                    }
                }catch(Exception e)
                {
                e.printStackTrace(); //JOptionPane.showMessageDialog(null, e.getMessage()+ "mwanzi ns"); 

                }
                break;
        }
      
    }
    public String solve(String sum, String ent)
    { 
        String res = "0"; 
        if(sum.equals("0")&& ent.equals("0"))
        {
       
            return "0";
        }else if(sum.equals("0")&& (!ent.equals("0")))
        {
            res = String.valueOf(Double.parseDouble(sum)/Double.parseDouble(ent));
            return res ;
        }else if(!(sum.equals("0"))&& ent.equals("0"))
        {
            return "0";
        }else{
            res = String.valueOf(Double.parseDouble(sum)/Double.parseDouble(ent));
        }
        return res;
    
    }
    
}
