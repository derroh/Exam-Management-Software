/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HiGHROLLER
 */
public class getEntry 
{
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
     public void totals (String term, String year, String exam) 
     {
         
     DbConnection Connect = new DbConnection();
     conn = Connect.Connectdb();
     try{
         String one_s = "SELECT COALESCE(SUM(mat LIKE '%0%'),0) AS mat,COALESCE(SUM(eng LIKE '%0%'),0) AS eng, COALESCE(SUM(kis LIKE '%0%'),0) AS kis,COALESCE(SUM(bio LIKE '%0%'),0) AS bio,COALESCE(SUM(chem LIKE '%0%'),0) AS chem,COALESCE(SUM(phy LIKE '%0%'),0) AS phy,COALESCE(SUM(geo LIKE '%0%'),0) AS geo,COALESCE(SUM(his LIKE '%0%'),0) AS his,COALESCE(SUM(cre LIKE '%0%'),0) AS cre,COALESCE(SUM(agr LIKE '%0%'),0) AS agr,COALESCE(SUM(bus LIKE '%0%'),0) AS bus FROM `student_exam` WHERE form = '1'";
         stm = conn.createStatement();
         rs = stm.executeQuery(one_s);
         while(rs.next())
         {
           String mat1 = rs.getString("mat");
           String eng1 = rs.getString("eng");
           String kis1 = rs.getString("kis");
           String bio1 = rs.getString("mat");
           String phy1 = rs.getString("phy");
           String che1 = rs.getString("chem");
           String geo1 = rs.getString("geo");
           String cre1 = rs.getString("cre");
           String his1 = rs.getString("his");
           String agr1 = rs.getString("agr");
           String bst1 = rs.getString("bus");
           
           try{
                String two_s = "SELECT COALESCE(SUM(mat LIKE '%0%'),0) AS mat,COALESCE(SUM(eng LIKE '%0%'),0) AS eng, COALESCE(SUM(kis LIKE '%0%'),0) AS kis,COALESCE(SUM(bio LIKE '%0%'),0) AS bio,COALESCE(SUM(chem LIKE '%0%'),0) AS chem,COALESCE(SUM(phy LIKE '%0%'),0) AS phy,COALESCE(SUM(geo LIKE '%0%'),0) AS geo,COALESCE(SUM(his LIKE '%0%'),0) AS his,COALESCE(SUM(cre LIKE '%0%'),0) AS cre,COALESCE(SUM(agr LIKE '%0%'),0) AS agr,COALESCE(SUM(bus LIKE '%0%'),0) AS bus FROM `student_exam` WHERE form = '2'";
                stm = conn.createStatement();
                rs = stm.executeQuery(two_s);
                while(rs.next())
                {
                    String mat2 = rs.getString("mat");
                    String eng2 = rs.getString("eng");
                    String kis2 = rs.getString("kis");
                    String bio2 = rs.getString("mat");
                    String phy2 = rs.getString("phy");
                    String che2 = rs.getString("chem");
                    String geo2 = rs.getString("geo");
                    String cre2 = rs.getString("cre");
                    String his2 = rs.getString("his");
                    String agr2 = rs.getString("agr");
                    String bst2 = rs.getString("bus");
                   
                  try{
                        String three_s = "SELECT COALESCE(SUM(mat LIKE '%0%'),0) AS mat,COALESCE(SUM(eng LIKE '%0%'),0) AS eng, COALESCE(SUM(kis LIKE '%0%'),0) AS kis,COALESCE(SUM(bio LIKE '%0%'),0) AS bio,COALESCE(SUM(chem LIKE '%0%'),0) AS chem,COALESCE(SUM(phy LIKE '%0%'),0) AS phy,COALESCE(SUM(geo LIKE '%0%'),0) AS geo,COALESCE(SUM(his LIKE '%0%'),0) AS his,COALESCE(SUM(cre LIKE '%0%'),0) AS cre,COALESCE(SUM(agr LIKE '%0%'),0) AS agr,COALESCE(SUM(bus LIKE '%0%'),0) AS bus FROM `student_exam` WHERE form = '3'";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(three_s);
                        while(rs.next())
                        {
                            String mat3 = rs.getString("mat");
                            String eng3 = rs.getString("eng");
                            String kis3 = rs.getString("kis");
                            String bio3 = rs.getString("mat");
                            String phy3 = rs.getString("phy");
                            String che3 = rs.getString("chem");
                            String geo3 = rs.getString("geo");
                            String cre3 = rs.getString("cre");
                            String his3 = rs.getString("his");
                            String agr3 = rs.getString("agr");
                            String bst3 = rs.getString("bus");
                           
                          try{
                                String four_s = "SELECT COALESCE(SUM(mat LIKE '%0%'),0) AS mat,COALESCE(SUM(eng LIKE '%0%'),0) AS eng, COALESCE(SUM(kis LIKE '%0%'),0) AS kis,COALESCE(SUM(bio LIKE '%0%'),0) AS bio,COALESCE(SUM(chem LIKE '%0%'),0) AS chem,COALESCE(SUM(phy LIKE '%0%'),0) AS phy,COALESCE(SUM(geo LIKE '%0%'),0) AS geo,COALESCE(SUM(his LIKE '%0%'),0) AS his,COALESCE(SUM(cre LIKE '%0%'),0) AS cre,COALESCE(SUM(agr LIKE '%0%'),0) AS agr,COALESCE(SUM(bus LIKE '%0%'),0) AS bus FROM `student_exam` WHERE form = '4'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(four_s);
                                while(rs.next())
                                {
                                    String mat4 = rs.getString("mat");
                                    String eng4 = rs.getString("eng");
                                    String kis4 = rs.getString("kis");
                                    String bio4 = rs.getString("mat");
                                    String phy4 = rs.getString("phy");
                                    String che4 = rs.getString("chem");
                                    String geo4 = rs.getString("geo");
                                    String cre4 = rs.getString("cre");
                                    String his4 = rs.getString("his");
                                    String agr4 = rs.getString("agr");
                                    String bst4 = rs.getString("bus");
                                    
                                    try{
                                         String sqlfm1 ="INSERT INTO `subject_entry`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('1','"+year+"','"+term+"','"+exam+"','1','','','"+mat1+"','"+eng1+"','"+kis1+"','"+che1+"','"+bio1+"','"+phy1+"','"+geo1+"','"+his1+"','"+cre1+"','"+bst1+"','"+agr1+"','','')"; 
                                         pst = conn.prepareStatement(sqlfm1);
                                         pst.execute();
                                   
                                         try{
                                            String sqlfm2 ="INSERT INTO `subject_entry`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('2','"+year+"','"+term+"','"+exam+"','1','','','"+mat2+"','"+eng2+"','"+kis2+"','"+che2+"','"+bio2+"','"+phy2+"','"+geo2+"','"+his2+"','"+cre2+"','"+bst2+"','"+agr2+"','','')"; 
                                            pst = conn.prepareStatement(sqlfm2);
                                            pst.execute();
                                            try{
                                                String sqlfm3 ="INSERT INTO `subject_entry`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('3','"+year+"','"+term+"','"+exam+"','1','','','"+mat3+"','"+eng3+"','"+kis3+"','"+che3+"','"+bio3+"','"+phy3+"','"+geo3+"','"+his3+"','"+cre3+"','"+bst3+"','"+agr3+"','','')"; 
                                                pst = conn.prepareStatement(sqlfm3);
                                                pst.execute();
                                                try{
                                                    String sqlfm4 ="INSERT INTO `subject_entry`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('4','"+year+"','"+term+"','"+exam+"','1','','','"+mat4+"','"+eng4+"','"+kis4+"','"+che4+"','"+bio4+"','"+phy4+"','"+geo4+"','"+his4+"','"+cre4+"','"+bst4+"','"+agr4+"','','')"; 
                                                    pst = conn.prepareStatement(sqlfm4);
                                                    pst.execute();

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
