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
public class getSavePoints 
{
   getPtsFromGrade ptsj = new getPtsFromGrade();
    //get all marks (loop) and get points too
    //save subject points to table
    //calculate subject mean and save to table
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
     public void getSave_exam_pts(String terrm, String yearr,  String exam) 
     {
        DbConnection Connect = new  DbConnection();
        conn = Connect.Connectdb();
        switch (exam) 
        {
            case "CAT 1":
                        try{
                            //
                            String getCat_one = "SELECT * FROM `cat_one` WHERE `term` = '"+terrm+"' AND `yearr` = '"+yearr+"' ";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(getCat_one);

                            while(rs.next())
                            {
                                String adm = rs.getString("adm");
                                String year = rs.getString("yearr");
                                String term = rs.getString("term");
                                String sname = rs.getString("name");
                                String form = rs.getString("form");
                                String stream = rs.getString("stream");
                                String kcpe = rs.getString("kcpe");
                              //  String tot = rs.getString("total");
                                String av = ptsj.juniorGetGrade(rs.getString("meangrd"));
                                String mat = ptsj.juniorGetGrade(rs.getString("matgrd"));
                                String eng = ptsj.juniorGetGrade(rs.getString("enggrd"));
                                String kis = ptsj.juniorGetGrade(rs.getString("kisgrd"));
                                String bio = ptsj.juniorGetGrade(rs.getString("biogrd"));
                                String che = ptsj.juniorGetGrade(rs.getString("chegrd"));
                                String phy = ptsj.juniorGetGrade(rs.getString("phygrd"));
                                String his = ptsj.juniorGetGrade(rs.getString("hisgrd"));
                                String geo = ptsj.juniorGetGrade(rs.getString("geogrd"));
                                String cre = ptsj.juniorGetGrade(rs.getString("cregrd"));
                                String agr = ptsj.juniorGetGrade(rs.getString("agrgrd"));
                                String bst = ptsj.juniorGetGrade(rs.getString("bstgrd"));
                                //
                                String tot = String.valueOf(Integer.parseInt(GetTot(mat))+ Integer.parseInt(GetTot(eng)) + Integer.parseInt(GetTot(kis))+ Integer.parseInt(GetTot(bio))+ Integer.parseInt(GetTot(che))+ Integer.parseInt(GetTot(phy))+ Integer.parseInt(GetTot(geo))+ Integer.parseInt(GetTot(cre))+ Integer.parseInt(GetTot(his))+ Integer.parseInt(GetTot(bst))+ Integer.parseInt(GetTot(agr)));
                                try{
                                    String sqlAv ="INSERT INTO `cat_one_pts`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('"+adm+"','"+year+"','"+term+"','"+sname+"','"+form+"','"+stream+"','"+kcpe+"','"+mat+"','"+eng+"','"+kis+"','"+che+"','"+bio+"','"+phy+"','"+geo+"','"+his+"','"+cre+"','"+bst+"','"+agr+"','"+tot+"','"+av+"')"; 
                                    pst = conn.prepareStatement(sqlAv);
                                    pst.execute();
                                    
                                }catch(Exception e)
                                {
                                e.printStackTrace();
                                }


                        }
                    }catch(Exception e)
                    {
                        e.printStackTrace();

                    }finally {
                    try { rs.close(); } catch (Exception e) { /* ignored */ }
                    try { pst.close(); } catch (Exception e) { /* ignored */ }
                    try { conn.close(); } catch (Exception e) { /* ignored */ }
                }
                break;
            case "CAT 2":
                        try{
                            //
                            String getCat_two = "SELECT * FROM `cat_two` WHERE `term` = '"+terrm+"' AND `yearr` = '"+yearr+"' ";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(getCat_two);

                            while(rs.next())
                            {
                                String adm = rs.getString("adm");
                                String year = rs.getString("yearr");
                                String term = rs.getString("term");
                                String sname = rs.getString("name");
                                String form = rs.getString("form");
                                String stream = rs.getString("stream");
                                String kcpe = rs.getString("kcpe");
                               // String tot = rs.getString("total");
                                String av = ptsj.juniorGetGrade(rs.getString("meangrd"));
                                String mat = ptsj.juniorGetGrade(rs.getString("matgrd"));
                                String eng = ptsj.juniorGetGrade(rs.getString("enggrd"));
                                String kis = ptsj.juniorGetGrade(rs.getString("kisgrd"));
                                String bio = ptsj.juniorGetGrade(rs.getString("biogrd"));
                                String che = ptsj.juniorGetGrade(rs.getString("chegrd"));
                                String phy = ptsj.juniorGetGrade(rs.getString("phygrd"));
                                String his = ptsj.juniorGetGrade(rs.getString("hisgrd"));
                                String geo = ptsj.juniorGetGrade(rs.getString("geogrd"));
                                String cre = ptsj.juniorGetGrade(rs.getString("cregrd"));
                                String agr = ptsj.juniorGetGrade(rs.getString("agrgrd"));
                                String bst = ptsj.juniorGetGrade(rs.getString("bstgrd"));
                                String tot = String.valueOf(Integer.parseInt(GetTot(mat))+ Integer.parseInt(GetTot(eng)) + Integer.parseInt(GetTot(kis))+ Integer.parseInt(GetTot(bio))+ Integer.parseInt(GetTot(che))+ Integer.parseInt(GetTot(phy))+ Integer.parseInt(GetTot(geo))+ Integer.parseInt(GetTot(cre))+ Integer.parseInt(GetTot(his))+ Integer.parseInt(GetTot(bst))+ Integer.parseInt(GetTot(agr)));
                               
                                try{
                                    String sqlAv ="INSERT INTO `cat_two_pts`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('"+adm+"','"+year+"','"+term+"','"+sname+"','"+form+"','"+stream+"','"+kcpe+"','"+mat+"','"+eng+"','"+kis+"','"+che+"','"+bio+"','"+phy+"','"+geo+"','"+his+"','"+cre+"','"+bst+"','"+agr+"','"+tot+"','"+av+"')"; 

                                    pst = conn.prepareStatement(sqlAv);
                                    pst.execute();
                                   // JOptionPane.showMessageDialog(null, "yes");
                                }catch(Exception e)
                                {
                                e.printStackTrace();
                                }


                        }
                    }catch(Exception e)
                    {
                        e.printStackTrace();

                    }finally {
                    try { rs.close(); } catch (Exception e) { /* ignored */ }
                    try { pst.close(); } catch (Exception e) { /* ignored */ }
                    try { conn.close(); } catch (Exception e) { /* ignored */ }
                }
                break;
            case "END TERM":
                         try{
                            //
                            String getCat_three = "SELECT * FROM `cat_three` WHERE `term` = '"+terrm+"' AND `yearr` = '"+yearr+"' ";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(getCat_three);

                            while(rs.next())
                            {
                                String adm = rs.getString("adm");
                                String year = rs.getString("yearr");
                                String term = rs.getString("term");
                                String sname = rs.getString("name");
                                String form = rs.getString("form");
                                String stream = rs.getString("stream");
                                String kcpe = rs.getString("kcpe");
                               // String tot = rs.getString("total");
                                String av = ptsj.juniorGetGrade(rs.getString("meangrd"));
                                String mat = ptsj.juniorGetGrade(rs.getString("matgrd"));
                                String eng = ptsj.juniorGetGrade(rs.getString("enggrd"));
                                String kis = ptsj.juniorGetGrade(rs.getString("kisgrd"));
                                String bio = ptsj.juniorGetGrade(rs.getString("biogrd"));
                                String che = ptsj.juniorGetGrade(rs.getString("chegrd"));
                                String phy = ptsj.juniorGetGrade(rs.getString("phygrd"));
                                String his = ptsj.juniorGetGrade(rs.getString("hisgrd"));
                                String geo = ptsj.juniorGetGrade(rs.getString("geogrd"));
                                String cre = ptsj.juniorGetGrade(rs.getString("cregrd"));
                                String agr = ptsj.juniorGetGrade(rs.getString("agrgrd"));
                                String bst = ptsj.juniorGetGrade(rs.getString("bstgrd"));
                                String tot = String.valueOf(Integer.parseInt(GetTot(mat))+ Integer.parseInt(GetTot(eng)) + Integer.parseInt(GetTot(kis))+ Integer.parseInt(GetTot(bio))+ Integer.parseInt(GetTot(che))+ Integer.parseInt(GetTot(phy))+ Integer.parseInt(GetTot(geo))+ Integer.parseInt(GetTot(cre))+ Integer.parseInt(GetTot(his))+ Integer.parseInt(GetTot(bst))+ Integer.parseInt(GetTot(agr)));
                               
                                try{
                                    String sqlAv ="INSERT INTO `cat_three_pts`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('"+adm+"','"+year+"','"+term+"','"+sname+"','"+form+"','"+stream+"','"+kcpe+"','"+mat+"','"+eng+"','"+kis+"','"+che+"','"+bio+"','"+phy+"','"+geo+"','"+his+"','"+cre+"','"+bst+"','"+agr+"','"+tot+"','"+av+"')"; 

                                    pst = conn.prepareStatement(sqlAv);
                                    pst.execute();
                                    //JOptionPane.showMessageDialog(null, "yes");
                                }catch(Exception e)
                                {
                                e.printStackTrace();
                                }


                        }
                    }catch(Exception e)
                    {
                        e.printStackTrace();

                    }finally {
                    try { rs.close(); } catch (Exception e) { /* ignored */ }
                    try { pst.close(); } catch (Exception e) { /* ignored */ }
                    try { conn.close(); } catch (Exception e) { /* ignored */ }
                }
                break;
            case "AVERAGE":
                try{
                            //
                            String getCat_avg = "SELECT * FROM `cat_avg` WHERE `term` = '"+terrm+"' AND `yearr` = '"+yearr+"' ";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(getCat_avg);

                            while(rs.next())
                            {
                                String adm = rs.getString("adm");
                                String year = rs.getString("yearr");
                                String term = rs.getString("term");
                                String sname = rs.getString("name");
                                String form = rs.getString("form");
                                String stream = rs.getString("stream");
                                String kcpe = rs.getString("kcpe");
                               // String tot = rs.getString("total");
                                String av = ptsj.juniorGetGrade(rs.getString("meangrd"));
                                String mat = ptsj.juniorGetGrade(rs.getString("matgrd"));
                                String eng = ptsj.juniorGetGrade(rs.getString("enggrd"));
                                String kis = ptsj.juniorGetGrade(rs.getString("kisgrd"));
                                String bio = ptsj.juniorGetGrade(rs.getString("biogrd"));
                                String che = ptsj.juniorGetGrade(rs.getString("chegrd"));
                                String phy = ptsj.juniorGetGrade(rs.getString("phygrd"));
                                String his = ptsj.juniorGetGrade(rs.getString("hisgrd"));
                                String geo = ptsj.juniorGetGrade(rs.getString("geogrd"));
                                String cre = ptsj.juniorGetGrade(rs.getString("cregrd"));
                                String agr = ptsj.juniorGetGrade(rs.getString("agrgrd"));
                                String bst = ptsj.juniorGetGrade(rs.getString("bstgrd"));
                                String tot = String.valueOf(Integer.parseInt(GetTot(mat))+ Integer.parseInt(GetTot(eng)) + Integer.parseInt(GetTot(kis))+ Integer.parseInt(GetTot(bio))+ Integer.parseInt(GetTot(che))+ Integer.parseInt(GetTot(phy))+ Integer.parseInt(GetTot(geo))+ Integer.parseInt(GetTot(cre))+ Integer.parseInt(GetTot(his))+ Integer.parseInt(GetTot(bst))+ Integer.parseInt(GetTot(agr)));
                               
                                try{
                                    String sqlAv ="INSERT INTO `cat_avg_pts`(`adm`, `yearr`, `term`, `name`, `form`, `stream`, `kcpe`, `mat`, `eng`, `kis`, `che`, `bio`, `phy`, `geo`, `his`, `cre`, `bst`, `agr`, `total`, `mean`) VALUES ('"+adm+"','"+year+"','"+term+"','"+sname+"','"+form+"','"+stream+"','"+kcpe+"','"+mat+"','"+eng+"','"+kis+"','"+che+"','"+bio+"','"+phy+"','"+geo+"','"+his+"','"+cre+"','"+bst+"','"+agr+"','"+tot+"','"+av+"')"; 

                                    pst = conn.prepareStatement(sqlAv);
                                    pst.execute();
                                 //   JOptionPane.showMessageDialog(null, "yes");
                                }catch(Exception e)
                                {
                                e.printStackTrace();
                                }


                        }
                    }catch(Exception e)
                    {
                        e.printStackTrace();

                    }finally {
                    try { rs.close(); } catch (Exception e) { /* ignored */ }
                    try { pst.close(); } catch (Exception e) { /* ignored */ }
                    try { conn.close(); } catch (Exception e) { /* ignored */ }
                }
                break;
        }
        
     }
    public String GetTot (String marks)
    {
      if(marks.equals(""))
      {
        return "0";
      }
        return marks;
    }
  
}
