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
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author HiGHROLLER
 */
public class updateExam
{
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    juniorGrading jg = new juniorGrading();
    seniorGrading sg = new seniorGrading();
    seniorGradingSciencesMath sgSM = new seniorGradingSciencesMath();
  
    public void updateMarks(String admNum, String year, String term, String forrm)
    {
        String  mat, eng, kis, bio, chem, phy,phy_2, his,his_2, geo,geo_2, cre,cre_2, agr,agr_2, bst,bst_2, fNem, sNem, form, stream;
        int mat1 = 0,eng1= 0, kis1= 0, bio1= 0, che1= 0, phy1= 0, his1= 0, geo1= 0, cre1= 0, agr1= 0, bst1= 0;
        int mat2 = 0,eng2= 0, kis2= 0, bio2= 0, che2= 0, phy2= 0, his2= 0, geo2= 0, cre2= 0, agr2= 0, bst2= 0;
        int mat3= 0,eng3= 0, kis3= 0, bio3= 0, che3= 0, phy3= 0, his3= 0, geo3= 0, cre3= 0, agr3= 0, bst3= 0;
        String bioAv_2 = "", bio_2, phyAv_2 = "",hisAv_2 = "",geoAv_2 = "",creAv_2 = "",agrAv_2 = "",bstAv_2 = "",freAv_2 = "",mscAv_2 = "",cmpAv_2 = "";
        int matAv = 0, engAv =0, kisAv = 0, cheAv =0, phyAv =0, bioAv =0, geoAv = 0, hisAv =0, creAv = 0, bstAv =0, agrAv =0;

       DbConnection connect = new DbConnection();
        conn = connect.Connectdb();
        try{

            String sqlGetCAT1 ="SELECT * FROM `cat_one_calc` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
            stm = conn.createStatement();
            rs = stm.executeQuery(sqlGetCAT1);

            while(rs.next())
            {
                mat1 = rs.getInt("mat");
                eng1 = rs.getInt("eng");
                kis1 = rs.getInt("kis");
                bio1 = rs.getInt("bio");
                che1 = rs.getInt("che");
                phy1 = rs.getInt("phy");
                his1 = rs.getInt("his");
                geo1 = rs.getInt("geo");
                cre1 = rs.getInt("cre");
                agr1 = rs.getInt("agr");
                bst1 = rs.getInt("bst");
                
            }
            try{

                String sqlGetCAT2 ="SELECT * FROM `cat_two_calc` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                stm = conn.createStatement();
                rs = stm.executeQuery(sqlGetCAT2);

                while(rs.next())
                {
                     mat2 = rs.getInt("mat");
                     eng2 = rs.getInt("eng");
                     kis2 = rs.getInt("kis");
                     bio2 = rs.getInt("bio");
                     che2 = rs.getInt("che");
                     phy2 = rs.getInt("phy");
                     his2 = rs.getInt("his");
                     geo2 = rs.getInt("geo");
                     cre2 = rs.getInt("cre");
                     agr2 = rs.getInt("agr");
                     bst2 = rs.getInt("bst");

                }
                //
                try{

                    String sqlGetCAT3 ="SELECT * FROM `cat_three_calc` WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(sqlGetCAT3);

                    while(rs.next())
                    {
                         mat3 = rs.getInt("mat");
                         eng3 = rs.getInt("eng");
                         kis3 = rs.getInt("kis");
                         bio3 = rs.getInt("bio");
                         che3 = rs.getInt("che");
                         phy3 = rs.getInt("phy");
                         his3 = rs.getInt("his");
                         geo3 = rs.getInt("geo");
                         cre3 = rs.getInt("cre");
                         agr3 = rs.getInt("agr");
                         bst3 = rs.getInt("bst");

                    }
                    //get new avg
                     matAv = (mat1+mat2+mat3)/3;
                     engAv = (eng1+eng2+eng3)/3;
                     kisAv = (kis1+kis2+kis3)/3;
                     bioAv = (bio1+bio2+bio3)/3;
                     cheAv = (che1+che2+che3)/3;
                     phyAv = (phy1+phy2+phy3)/3;
                     hisAv = (his1+his2+his3)/3;
                     geoAv = (geo1+geo2+geo3)/3;
                     creAv = (cre1+cre2+cre3)/3;
                     agrAv = (agr1+agr2+agr3)/3;
                     bstAv = (bst1+bst2+bst3)/3;
                    try{
                            String sql = "SELECT * FROM `student_exam` WHERE `adm` = '"+admNum+"'";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(sql);

                            while(rs.next())
                            {

                                String physics = rs.getString("phy");
                                String history = rs.getString("his");
                                String geography = rs.getString("geo");
                                String CRE = rs.getString("cre");
                                String biology = rs.getString("bio");
                                String agrics = rs.getString("agr");
                                String bs = rs.getString("bus");
                                
                                    if(biology.equals("-"))
                                    {
                                     bioAv_2 = "";
                                     bio = "0";
                                     bio_2 = "";
                                    }else{

                                        bioAv_2 = String.valueOf(bioAv);

                                    }
                                    if(physics.equals("-"))
                                    {
                                     phyAv_2 = "";
                                     phy = "0";
                                     phy_2 = "";
                                    }else{

                                        phyAv_2 = String.valueOf(phyAv);

                                    }if(history.equals("-"))
                                    {
                                        hisAv_2 = "";
                                        his = "0";
                                        his_2 ="";
                                    }else{

                                        hisAv_2 = String.valueOf(hisAv);

                                    }if(geography.equals("-"))
                                    {
                                        geoAv_2 = "";
                                        geo = "0";
                                        geo_2 = "";
                                    }else{

                                        geoAv_2 = String.valueOf(geoAv);

                                    }if(CRE.equals("-"))
                                    {
                                        creAv_2 = "";
                                        cre = "0";
                                        cre_2 = "";
                                    }else{

                                        creAv_2 = String.valueOf(creAv);

                                    }
                                    if(agrics.equals("-"))
                                    {
                                        agrAv_2 = "";
                                        agr = "0";
                                        agr_2="";
                                    }else{

                                        agrAv_2 = String.valueOf(agrAv);

                                    }if(bs.equals("-"))
                                    {
                                        bstAv_2 = "";
                                        bst = "0";
                                        bst_2 = "";
                                    }else{

                                        bstAv_2 = String.valueOf(bstAv);

                                    }


                            }
                        }catch(Exception e)
                        {
                          e.printStackTrace();
                        }//
                        if(forrm.equals("1")|| forrm.equals("2"))
                        {
                            int total = matAv+engAv+kisAv+bioAv+cheAv+phyAv+hisAv+geoAv+creAv+agrAv+bstAv;
                            int aver = total/11;
                            try{
                                String sqlAv = "UPDATE `cat_avg_calc` SET `mat`='"+matAv+"',`eng`='"+engAv+"',`kis`='"+kisAv+"',`che`='"+cheAv+"',`bio`='"+bioAv+"',`phy`='"+phyAv+"',`geo`='"+geoAv+"',`his`='"+hisAv+"',`cre`='"+creAv+"',`bst`='"+bstAv+"',`agr`='"+agrAv+"',`total`='"+total+"',`meanmark`='"+aver+"' WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                                pst = conn.prepareStatement(sqlAv);
                                pst.execute();

                                try{
                                    String sqlAv2 = "UPDATE `cat_avg` SET `mat`='"+matAv+"',`matgrd`='"+jg.juniorGetGrade(String.valueOf(matAv))+"',`matcomment`='"+jg.juniorGetComment(String.valueOf(matAv))+"',`eng`='"+engAv+"',`enggrd`='"+jg.juniorGetGrade(String.valueOf(engAv))+"',`engcomment`='"+jg.juniorGetComment(String.valueOf(engAv))+"',`kis`='"+kisAv+"',`kisgrd`='"+jg.juniorGetGrade(String.valueOf(kisAv))+"',`kiscomment`='"+jg.juniorSwaComment(String.valueOf(kisAv))+"',`che`='"+cheAv+"',`chegrd`='"+jg.juniorGetGrade(String.valueOf(cheAv))+"',`checomment`='"+jg.juniorGetComment(String.valueOf(cheAv))+"',`bio`='"+bioAv+"',`biogrd`='"+jg.juniorGetGrade(String.valueOf(bioAv))+"',`biocomment`='"+jg.juniorGetComment(String.valueOf(bioAv))+"',`phy`='"+phyAv+"',`phygrd`='"+jg.juniorGetGrade(String.valueOf(phyAv))+"',`phycomment`='"+jg.juniorGetComment(String.valueOf(phyAv))+"',`geo`='"+geoAv+"',`geogrd`='"+jg.juniorGetGrade(String.valueOf(geoAv))+"',`geocomment`='"+jg.juniorGetComment(String.valueOf(geoAv))+"',`his`='"+hisAv+"',`hisgrd`='"+jg.juniorGetGrade(String.valueOf(hisAv))+"',`hiscomment`='"+jg.juniorGetComment(String.valueOf(hisAv))+"',`cre`='"+creAv+"',`cregrd`='"+jg.juniorGetGrade(String.valueOf(creAv))+"',`crecomment`='"+jg.juniorGetComment(String.valueOf(creAv))+"',`bst`='"+bstAv+"',`bstgrd`='"+jg.juniorGetGrade(String.valueOf(bstAv))+"',`bstcomment`='"+jg.juniorGetComment(String.valueOf(bstAv))+"',`agr`='"+agrAv+"',`agrgrd`='"+jg.juniorGetGrade(String.valueOf(agrAv))+"',`agrcomment`='"+jg.juniorGetComment(String.valueOf(agrAv))+"',`total`='"+total+"',`meanmark`='"+aver+"',`meangrd`='"+jg.juniorGetGrade(String.valueOf(aver))+"' WHERE `adm` = '"+admNum+"' AND `yearr`= '"+year+"' AND `term` = '"+term+"'";
                                    pst = conn.prepareStatement(sqlAv2);
                                    pst.execute();
                                    /// JOptionPane.showMessageDialog( this, "Student CAT 2 marks for term "+term.getSelectedItem()+" have been saved succesfully","Success", JOptionPane.PLAIN_MESSAGE);
                                    // reset();
                                }catch(Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }catch(Exception e)
                            {
                                e.printStackTrace();
                                //JOptionPane.showMessageDialog( this, "Ooops. The student appears to have already done the term "+term.getSelectedItem()+" "+combo_exam.getSelectedItem()+" exam.\n","Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }else if(forrm.equals("3")|| forrm.equals("4"))
                        {
                              //avg isht
                                int CompTotal_ = matAv+engAv+ kisAv;
                                //bestScience
                                int bestScience_ [] = {bioAv,phyAv,cheAv};
                                Arrays.sort(bestScience_);
                                int bScience_ = bestScience_[2]+bestScience_[1];
                                //get best othres
                                int bestHumApp_ [] = { geoAv,hisAv, creAv,agrAv,bstAv};
                                Arrays.sort(bestHumApp_);
                                int bhum_ = bestHumApp_[4]+bestHumApp_[3];
                                //get best othres
                                int tot34_ = CompTotal_ + bScience_ + bhum_;
                                //get av
                                int av34_ = tot34_/7;

                           try{
                                String sqlAv = "UPDATE `cat_avg_calc` SET `mat`='"+matAv+"',`eng`='"+engAv+"',`kis`='"+kisAv+"',`che`='"+cheAv+"',`bio`='"+bioAv+"',`phy`='"+phyAv+"',`geo`='"+geoAv+"',`his`='"+hisAv+"',`cre`='"+creAv+"',`bst`='"+bstAv+"',`agr`='"+agrAv+"',`total`='"+tot34_+"',`meanmark`='"+av34_+"' WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                                pst = conn.prepareStatement(sqlAv);
                                pst.execute();
                                try{
                                    String sqlAv_ = "UPDATE `cat_avg` SET `mat`='"+matAv+"',`matgrd`='"+sgSM.seniorGetGradeScienceXMath(String.valueOf(matAv))+"',`matcomment`='"+sgSM.seniorGetCommentScienceXMath(String.valueOf(matAv))+"',`eng`='"+engAv+"',`enggrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(engAv))+"',`engcomment`='"+sg.seniorGetComment(String.valueOf(engAv))+"',`kis`='"+kisAv+"',`kisgrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(kisAv))+"',`kiscomment`='"+sg.seniorSwaCommentLanguageXhumanities(String.valueOf(kisAv))+"',`che`='"+cheAv+"',`chegrd`='"+sgSM.seniorGetGradeScienceXMath(String.valueOf(cheAv))+"',`checomment`='"+sgSM.seniorGetCommentScienceXMath(String.valueOf(cheAv))+"',`bio`='"+bioAv+"',`biogrd`='"+sgSM.seniorGetGradeScienceXMath(String.valueOf(bioAv))+"',`biocomment`='"+sgSM.seniorGetCommentScienceXMath(String.valueOf(bioAv))+"',`phy`='"+String.valueOf(sg.seniorGetAv(phyAv_2))+"',`phygrd`='"+sgSM.seniorGetGradeScienceXMath(String.valueOf(sg.seniorGetAv(phyAv_2)))+"',`phycomment`='"+sgSM.seniorGetCommentScienceXMath(String.valueOf(sg.seniorGetAv(phyAv_2)))+"',`geo`='"+String.valueOf(sg.seniorGetAv(geoAv_2))+"',`geogrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(sg.seniorGetAv(geoAv_2)))+"',`geocomment`='"+sg.seniorGetComment(String.valueOf(sg.seniorGetAv(geoAv_2)))+"',`his`='"+String.valueOf(sg.seniorGetAv(hisAv_2))+"',`hisgrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(sg.seniorGetAv(hisAv_2)))+"',`hiscomment`='"+sg.seniorGetComment(String.valueOf(sg.seniorGetAv(hisAv_2)))+"',`cre`='"+String.valueOf(sg.seniorGetAv(creAv_2))+"',`cregrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(sg.seniorGetAv(creAv_2)))+"',`crecomment`='"+sg.seniorGetComment(String.valueOf(sg.seniorGetAv(creAv_2)))+"',`bst`='"+String.valueOf(sg.seniorGetAv(bstAv_2))+"',`bstgrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(sg.seniorGetAv(bstAv_2)))+"',`bstcomment`='"+sg.seniorGetComment(String.valueOf(sg.seniorGetAv(bstAv_2)))+"',`agr`='"+String.valueOf(sg.seniorGetAv(agrAv_2))+"',`agrgrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(sg.seniorGetAv(agrAv_2)))+"',`agrcomment`='"+sg.seniorGetComment(String.valueOf(sg.seniorGetAv(agrAv_2)))+"',`total`='"+tot34_+"',`meanmark`='"+av34_+"',`meangrd`='"+sg.seniorGetGradeLanguageXhumanities(String.valueOf(av34_))+"' WHERE `adm` = '"+admNum+"' AND `yearr` = '"+year+"' AND `term` = '"+term+"'";
                                    pst = conn.prepareStatement(sqlAv_);
                                    pst.execute();

                                    //JOptionPane.showMessageDialog( this, "Student CAT 2 marks for term "+term.getSelectedItem()+" have been saved succesfully","Success", JOptionPane.PLAIN_MESSAGE);
                                  // reset();
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
