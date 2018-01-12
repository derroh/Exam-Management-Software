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
public class gradeCount
{
    Statement stm = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection conn = null;
      public void form_grade(String form, String year, String term, String exam)
      {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        switch (exam)
        {
            case "1":
                          //count of As in all subjects
                try{
                    String get_central_As ="SELECT COALESCE(SUM(matgrd = 'A'),0) AS matACount, COALESCE(SUM(enggrd = 'A'),0) AS engACount, COALESCE(SUM(kisgrd = 'A'),0) AS kisACount, COALESCE(SUM(biogrd = 'A'),0) AS bioACount, COALESCE(SUM(chegrd = 'A'),0) AS chemACount, COALESCE(SUM(phygrd = 'A'),0) AS phyACount, COALESCE(SUM(geogrd = 'A'),0) AS geoACount, COALESCE(SUM(hisgrd = 'A'),0) AS hisACount, COALESCE(SUM(cregrd = 'A'),0) AS creACount,  COALESCE(SUM(agrgrd = 'A'),0) AS agrACount, COALESCE(SUM(bstgrd = 'A'),0) AS busACount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(get_central_As);
                    while(rs.next())
                    {
                        String matACount = rs.getString("matACount");
                        String engACount = rs.getString("engACount");
                        String kisACount = rs.getString("kisACount");
                        String bioACount = rs.getString("bioACount");
                        String chemACount = rs.getString("chemACount");
                        String phyACount = rs.getString("phyACount");
                        String geoACount = rs.getString("geoACount");
                        String hisACount = rs.getString("hisACount");
                        String creACount = rs.getString("creACount");
                        String agrACount = rs.getString("agrACount");
                        String busACount = rs.getString("busACount");
                        
                        try{
                             String get_central_Aminus ="SELECT COALESCE(SUM(matgrd = 'A-'),0) AS matAmCount, COALESCE(SUM(enggrd = 'A-'),0) AS engAmCount, COALESCE(SUM(kisgrd = 'A-'),0) AS kisAmCount, COALESCE(SUM(biogrd = 'A-'),0) AS bioAmCount, COALESCE(SUM(chegrd = 'A-'),0) AS chemAmCount, COALESCE(SUM(phygrd = 'A-'),0) AS phyAmCount, COALESCE(SUM(geogrd = 'A-'),0) AS geoAmCount, COALESCE(SUM(hisgrd = 'A-'),0) AS hisAmCount, COALESCE(SUM(cregrd = 'A-'),0) AS creAmCount, COALESCE(SUM(agrgrd = 'A-'),0) AS agrAmCount, COALESCE(SUM(bstgrd = 'A-'),0) AS busAmCount FROM cat_one WHERE   form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                             stm = conn.createStatement();
                             rs = stm.executeQuery(get_central_Aminus);
                             while(rs.next())
                             {
                                String matAmCount = rs.getString("matAmCount");
                                String engAmCount = rs.getString("engAmCount");
                                String kisAmCount = rs.getString("kisAmCount");
                                String bioAmCount = rs.getString("bioAmCount");
                                String chemAmCount = rs.getString("chemAmCount");
                                String phyAmCount = rs.getString("phyAmCount");
                                String geoAmCount = rs.getString("geoAmCount");
                                String hisAmCount = rs.getString("hisAmCount");
                                String creAmCount = rs.getString("creAmCount");
                                String agrAmCount = rs.getString("agrAmCount");
                                String busAmCount = rs.getString("busAmCount");
                                
                                try{
                                     String get_central_bp ="SELECT COALESCE(SUM(matgrd = 'B+'),0) AS matBpCount, COALESCE(SUM(enggrd = 'B+'),0) AS engBpCount, COALESCE(SUM(kisgrd = 'B+'),0) AS kisBpCount, COALESCE(SUM(biogrd = 'B+'),0) AS bioBpCount, COALESCE(SUM(chegrd = 'B+'),0) AS chemBpCount, COALESCE(SUM(phygrd = 'B+'),0) AS phyBpCount, COALESCE(SUM(geogrd = 'B+'),0) AS geoBpCount, COALESCE(SUM(hisgrd = 'B+'),0) AS hisBpCount, COALESCE(SUM(cregrd = 'B+'),0) AS creBpCount,  COALESCE(SUM(agrgrd = 'B+'),0) AS agrBpCount, COALESCE(SUM(bstgrd = 'B+'),0) AS busBpCount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                     stm = conn.createStatement();
                                     rs = stm.executeQuery(get_central_bp);
                                    while(rs.next())
                                    {
                                        String matBpCount = rs.getString("matBpCount");
                                        String engBpCount = rs.getString("engBpCount");
                                        String kisBpCount = rs.getString("kisBpCount");
                                        String bioBpCount = rs.getString("bioBpCount");
                                        String chemBpCount = rs.getString("chemBpCount");
                                        String phyBpCount = rs.getString("phyBpCount");
                                        String geoBpCount = rs.getString("geoBpCount");
                                        String hisBpCount = rs.getString("hisBpCount");
                                        String creBpCount = rs.getString("creBpCount");
                                        String agrBpCount = rs.getString("agrBpCount");
                                        String busBpCount = rs.getString("busBpCount");
                                       
                                        try{
                                            String get_central_b ="SELECT COALESCE(SUM(matgrd = 'B'),0) AS matBCount, COALESCE(SUM(enggrd = 'B'),0) AS engBCount, COALESCE(SUM(kisgrd = 'B'),0) AS kisBCount, COALESCE(SUM(biogrd = 'B'),0) AS bioBCount, COALESCE(SUM(chegrd = 'B'),0) AS chemBCount, COALESCE(SUM(phygrd = 'B'),0) AS phyBCount, COALESCE(SUM(geogrd = 'B'),0) AS geoBCount, COALESCE(SUM(hisgrd = 'B'),0) AS hisBCount, COALESCE(SUM(cregrd = 'B'),0) AS creBCount, COALESCE(SUM(agrgrd = 'B'),0) AS agrBCount, COALESCE(SUM(bstgrd = 'B'),0) AS busBCount FROM  cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                            stm = conn.createStatement();
                                            stm = conn.createStatement();
                                            rs = stm.executeQuery(get_central_b);
                                           while(rs.next())
                                           {
                                                String matBCount = rs.getString("matBCount");
                                                String engBCount = rs.getString("engBCount");
                                                String kisBCount = rs.getString("kisBCount");
                                                String bioBCount = rs.getString("bioBCount");
                                                String chemBCount = rs.getString("chemBCount");
                                                String phyBCount = rs.getString("phyBCount");
                                                String geoBCount = rs.getString("geoBCount");
                                                String hisBCount = rs.getString("hisBCount");
                                                String creBCount = rs.getString("creBCount");
                                                String agrBCount = rs.getString("agrBCount");
                                                String busBCount = rs.getString("busBCount");
                                               
                                                try{
                                                    String get_central_bm ="SELECT COALESCE(SUM(matgrd = 'B-'),0) AS matBmCount, COALESCE(SUM(enggrd = 'B-'),0) AS engBmCount, COALESCE(SUM(kisgrd = 'B-'),0) AS kisBmCount, COALESCE(SUM(biogrd = 'B-'),0) AS bioBmCount, COALESCE(SUM(chegrd = 'B-'),0) AS chemBmCount, COALESCE(SUM(phygrd = 'B-'),0) AS phyBmCount, COALESCE(SUM(geogrd = 'B-'),0) AS geoBmCount, COALESCE(SUM(hisgrd = 'B-'),0) AS hisBmCount, COALESCE(SUM(cregrd = 'B-'),0) AS creBmCount,  COALESCE(SUM(agrgrd = 'B-'),0) AS agrBmCount, COALESCE(SUM(bstgrd = 'B-'),0) AS busBmCount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                    stm = conn.createStatement();                     
                                                    stm = conn.createStatement();
                                                    rs = stm.executeQuery(get_central_bm);
                                                   while(rs.next())
                                                   {
                                                        String matBmCount = rs.getString("matBmCount");
                                                        String engBmCount = rs.getString("engBmCount");
                                                        String kisBmCount = rs.getString("kisBmCount");
                                                        String bioBmCount = rs.getString("bioBmCount");
                                                        String chemBmCount = rs.getString("chemBmCount");
                                                        String phyBmCount = rs.getString("phyBmCount");
                                                        String geoBmCount = rs.getString("geoBmCount");
                                                        String hisBmCount = rs.getString("hisBmCount");
                                                        String creBmCount = rs.getString("creBmCount");
                                                       
                                                        String agrBmCount = rs.getString("agrBmCount");
                                                        String busBmCount = rs.getString("busBmCount");
                                                        
                                                        try{
                                                            String get_central_cp ="SELECT COALESCE(SUM(matgrd = 'C+'),0) AS matCpCount, COALESCE(SUM(enggrd = 'C+'),0) AS engCpCount, COALESCE(SUM(kisgrd = 'C+'),0) AS kisCpCount, COALESCE(SUM(biogrd = 'C+'),0) AS bioCpCount, COALESCE(SUM(chegrd = 'C+'),0) AS chemCpCount, COALESCE(SUM(phygrd = 'C+'),0) AS phyCpCount, COALESCE(SUM(geogrd = 'C+'),0) AS geoCpCount, COALESCE(SUM(hisgrd = 'C+'),0) AS hisCpCount, COALESCE(SUM(cregrd = 'C+'),0) AS creCpCount,  COALESCE(SUM(agrgrd = 'C+'),0) AS agrCpCount, COALESCE(SUM(bstgrd = 'C+'),0) AS busCpCount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                            stm = conn.createStatement();
                                                            stm = conn.createStatement();
                                                            rs = stm.executeQuery(get_central_cp);
                                                           while(rs.next())
                                                           {
                                                                String matCpCount = rs.getString("matCpCount");
                                                                String engCpCount = rs.getString("engCpCount");
                                                                String kisCpCount = rs.getString("kisCpCount");
                                                                String bioCpCount = rs.getString("bioCpCount");
                                                                String chemCpCount = rs.getString("chemCpCount");
                                                                String phyCpCount = rs.getString("phyCpCount");
                                                                String geoCpCount = rs.getString("geoCpCount");
                                                                String hisCpCount = rs.getString("hisCpCount");
                                                                String creCpCount = rs.getString("creCpCount");
                                                                
                                                                String agrCpCount = rs.getString("agrCpCount");
                                                                String busCpCount = rs.getString("busCpCount");
                                                                
                                                                try{
                                                                    String get_central_c = "SELECT COALESCE(SUM(matgrd = 'C'),0) AS matCCount, COALESCE(SUM(enggrd = 'C'),0) AS engCCount, COALESCE(SUM(kisgrd = 'C'),0) AS kisCCount, COALESCE(SUM(biogrd = 'C'),0) AS bioCCount, COALESCE(SUM(chegrd = 'C'),0) AS chemCCount, COALESCE(SUM(phygrd = 'C'),0) AS phyCCount, COALESCE(SUM(geogrd = 'C'),0) AS geoCCount, COALESCE(SUM(hisgrd = 'C'),0) AS hisCCount, COALESCE(SUM(cregrd = 'C'),0) AS creCCount,  COALESCE(SUM(agrgrd = 'C'),0) AS agrCCount, COALESCE(SUM(bstgrd = 'C'),0) AS busCCount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                    stm = conn.createStatement();
                                                                    rs = stm.executeQuery(get_central_c);
                                                                   while(rs.next())
                                                                   {
                                                                        String matCCount = rs.getString("matCCount");
                                                                        String engCCount = rs.getString("engCCount");
                                                                        String kisCCount = rs.getString("kisCCount");
                                                                        String bioCCount = rs.getString("bioCCount");
                                                                        String chemCCount = rs.getString("chemCCount");
                                                                        String phyCCount = rs.getString("phyCCount");
                                                                        String geoCCount = rs.getString("geoCCount");
                                                                        String hisCCount = rs.getString("hisCCount");
                                                                        String creCCount = rs.getString("creCCount");
                                                                        String agrCCount = rs.getString("agrCCount");
                                                                        String busCCount = rs.getString("busCCount");
                                                                       
                                                                        try{
                                                                            String get_central_cm = "SELECT COALESCE(SUM(matgrd = 'C-'),0) AS matCmCount, COALESCE(SUM(enggrd = 'C-'),0) AS engCmCount, COALESCE(SUM(kisgrd = 'C-'),0) AS kisCmCount, COALESCE(SUM(biogrd = 'C-'),0) AS bioCmCount, COALESCE(SUM(chegrd = 'C-'),0) AS chemCmCount, COALESCE(SUM(phygrd = 'C-'),0) AS phyCmCount,COALESCE(SUM(geogrd = 'C-'),0) AS geoCmCount, COALESCE(SUM(hisgrd = 'C-'),0) AS hisCmCount, COALESCE(SUM(cregrd = 'C-'),0) AS creCmCount,  COALESCE(SUM(agrgrd = 'C-'),0) AS agrCmCount, COALESCE(SUM(bstgrd = 'C-'),0) AS busCmCount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                            stm = conn.createStatement();
                                                                            rs = stm.executeQuery(get_central_cm);
                                                                           while(rs.next())
                                                                           {
                                                                                String matCmCount = rs.getString("matCmCount");
                                                                                String engCmCount = rs.getString("engCmCount");
                                                                                String kisCmCount = rs.getString("kisCmCount");
                                                                                String bioCmCount = rs.getString("bioCmCount");
                                                                                String chemCmCount = rs.getString("chemCmCount");
                                                                                String phyCmCount = rs.getString("phyCmCount");
                                                                                String geoCmCount = rs.getString("geoCmCount");
                                                                                String hisCmCount = rs.getString("hisCmCount");
                                                                                String creCmCount = rs.getString("creCmCount");
                                                                                String agrCmCount = rs.getString("agrCmCount");
                                                                                String busCmCount = rs.getString("busCmCount");
                                                                               
                                                                                try{
                                                                                    String get_central_dp ="SELECT COALESCE(SUM(matgrd = 'D+'),0) AS matDpCount, COALESCE(SUM(enggrd = 'D+'),0) AS engDpCount, COALESCE(SUM(kisgrd = 'D+'),0) AS kisDpCount, COALESCE(SUM(biogrd = 'D+'),0) AS bioDpCount, COALESCE(SUM(chegrd = 'D+'),0) AS chemDpCount, COALESCE(SUM(phygrd = 'D+'),0) AS phyDpCount,COALESCE(SUM(geogrd = 'D+'),0) AS geoDpCount, COALESCE(SUM(hisgrd = 'D+'),0) AS hisDpCount, COALESCE(SUM(cregrd = 'D+'),0) AS creDpCount,COALESCE(SUM(agrgrd = 'D+'),0) AS agrDpCount, COALESCE(SUM(bstgrd = 'D+'),0) AS busDpCount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                    stm = conn.createStatement();
                                                                                    rs = stm.executeQuery(get_central_dp);
                                                                                   while(rs.next())
                                                                                   {
                                                                                        String matDpCount = rs.getString("matDpCount");
                                                                                        String engDpCount = rs.getString("engDpCount");
                                                                                        String kisDpCount = rs.getString("kisDpCount");
                                                                                        String bioDpCount = rs.getString("bioDpCount");
                                                                                        String chemDpCount = rs.getString("chemDpCount");
                                                                                        String phyDpCount = rs.getString("phyDpCount");
                                                                                        String geoDpCount = rs.getString("geoDpCount");
                                                                                        String hisDpCount = rs.getString("hisDpCount");
                                                                                        String creDpCount = rs.getString("creDpCount");
                                                                                        String agrDpCount = rs.getString("agrDpCount");
                                                                                        String busDpCount = rs.getString("busDpCount");
                                                                                        
                                                                                        try{
                                                                                            String get_central_d = "SELECT COALESCE(SUM(matgrd = 'D'),0) AS matDCount, COALESCE(SUM(enggrd = 'D'),0) AS engDCount, COALESCE(SUM(kisgrd = 'D'),0) AS kisDCount, COALESCE(SUM(biogrd = 'D'),0) AS bioDCount, COALESCE(SUM(chegrd = 'D'),0) AS chemDCount, COALESCE(SUM(phygrd = 'D'),0) AS phyDCount, COALESCE(SUM(geogrd = 'D'),0) AS geoDCount, COALESCE(SUM(hisgrd = 'D'),0) AS hisDCount, COALESCE(SUM(cregrd = 'D'),0) AS creDCount, COALESCE(SUM(agrgrd = 'D'),0) AS agrDCount, COALESCE(SUM(bstgrd = 'D'),0) AS busDCount  FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                            stm = conn.createStatement();
                                                                                            rs = stm.executeQuery(get_central_d);
                                                                                           while(rs.next())
                                                                                           {
                                                                                                String matDCount = rs.getString("matDCount");
                                                                                                String engDCount = rs.getString("engDCount");
                                                                                                String kisDCount = rs.getString("kisDCount");
                                                                                                String bioDCount = rs.getString("bioDCount");
                                                                                                String chemDCount = rs.getString("chemDCount");
                                                                                                String phyDCount = rs.getString("phyDCount");
                                                                                                String geoDCount = rs.getString("geoDCount");
                                                                                                String hisDCount = rs.getString("hisDCount");
                                                                                                String creDCount = rs.getString("creDCount");
                                                                                                
                                                                                                String agrDCount = rs.getString("agrDCount");
                                                                                                String busDCount = rs.getString("busDCount");
                                                                                         
                                                                                                try{
                                                                                                    String get_central_dm = "SELECT COALESCE(SUM(matgrd = 'D-'),0) AS matDmCount, COALESCE(SUM(enggrd = 'D-'),0) AS engDmCount, COALESCE(SUM(kisgrd = 'D-'),0) AS kisDmCount, COALESCE(SUM(biogrd = 'D-'),0) AS bioDmCount, COALESCE(SUM(chegrd = 'D-'),0) AS chemDmCount,COALESCE(SUM(phygrd = 'D-'),0) AS phyDmCount, COALESCE(SUM(geogrd = 'D-'),0) AS geoDmCount, COALESCE(SUM(hisgrd = 'D-'),0) AS hisDmCount, COALESCE(SUM(cregrd = 'D-'),0) AS creDmCount, COALESCE(SUM(agrgrd = 'D-'),0) AS agrDmCount, COALESCE(SUM(bstgrd = 'D-'),0) AS busDmCount FROM  cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                    stm = conn.createStatement();
                                                                                                    rs = stm.executeQuery(get_central_dm);
                                                                                                   while(rs.next())
                                                                                                   {
                                                                                                        String matDmCount = rs.getString("matDmCount");
                                                                                                        String engDmCount = rs.getString("engDmCount");
                                                                                                        String kisDmCount = rs.getString("kisDmCount");
                                                                                                        String bioDmCount = rs.getString("bioDmCount");
                                                                                                        String chemDmCount = rs.getString("chemDmCount");
                                                                                                        String phyDmCount = rs.getString("phyDmCount");
                                                                                                        String geoDmCount = rs.getString("geoDmCount");
                                                                                                        String hisDmCount = rs.getString("hisDmCount");
                                                                                                        String creDmCount = rs.getString("creDmCount");
                                                                                                        String agrDmCount = rs.getString("agrDmCount");
                                                                                                        String busDmCount = rs.getString("busDmCount");
                                                                                                        
                                                                                                        try{
                                                                                                              String get_central_E ="SELECT COALESCE(SUM(matgrd = 'E'),0) AS matECount, COALESCE(SUM(enggrd = 'E'),0) AS engECount, COALESCE(SUM(kisgrd = 'E'),0) AS kisECount, COALESCE(SUM(biogrd = 'E'),0) AS bioECount, COALESCE(SUM(chegrd = 'E'),0) AS chemECount, COALESCE(SUM(phygrd = 'E'),0) AS phyECount, COALESCE(SUM(geogrd = 'E'),0) AS geoECount, COALESCE(SUM(hisgrd = 'E'),0) AS hisECount, COALESCE(SUM(cregrd = 'E'),0) AS creECount, COALESCE(SUM(agrgrd = 'E'),0) AS agrECount, COALESCE(SUM(bstgrd = 'E'),0) AS busECount FROM cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                              stm = conn.createStatement();
                                                                                                              rs = stm.executeQuery(get_central_E);

                                                                                                               while(rs.next())
                                                                                                               {   

                                                                                                                    String matECount = rs.getString("matECount");
                                                                                                                    String engECount = rs.getString("engECount");
                                                                                                                    String kisECount = rs.getString("kisECount");
                                                                                                                    String bioECount = rs.getString("bioECount");
                                                                                                                    String chemECount = rs.getString("chemECount");
                                                                                                                    String phyECount = rs.getString("phyECount");
                                                                                                                    String geoECount = rs.getString("geoECount");
                                                                                                                    String hisECount = rs.getString("hisECount");
                                                                                                                    String creECount = rs.getString("creECount");
                                                                                                                    String agrECount = rs.getString("agrECount");
                                                                                                                    String busECount = rs.getString("busECount");
                                                                                                                    
                                                                                                                    try{
                                                                                                                        String get_central_x ="SELECT COALESCE(SUM(matgrd = '0'),0) AS matxCount, COALESCE(SUM(enggrd = '0'),0) AS engxCount, COALESCE(SUM(kisgrd = '0'),0) AS kisxCount, COALESCE(SUM(biogrd = '0'),0) AS bioxCount, COALESCE(SUM(chegrd = '0'),0) AS chemxCount, COALESCE(SUM(phygrd = '0'),0) AS phyxCount, COALESCE(SUM(geogrd = '0'),0) AS geoxCount, COALESCE(SUM(hisgrd = '0'),0) AS hisxCount, COALESCE(SUM(cregrd = '0'),0) AS crexCount, COALESCE(SUM(agrgrd = '0'),0) AS agrxCount, COALESCE(SUM(bstgrd = '0'),0) AS busxCount FROM  cat_one WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                        stm = conn.createStatement();
                                                                                                                        rs = stm.executeQuery(get_central_x);
                                                                                                                       while(rs.next())
                                                                                                                       {

                                                                                                                            String matxCount = rs.getString("matxCount");
                                                                                                                            String engxCount = rs.getString("engxCount");
                                                                                                                            String kisxCount = rs.getString("kisxCount");
                                                                                                                            String bioxCount = rs.getString("bioxCount");
                                                                                                                            String chemxCount = rs.getString("chemxCount");
                                                                                                                            String phyxCount = rs.getString("phyxCount");
                                                                                                                            String geoxCount = rs.getString("geoxCount");
                                                                                                                            String hisxCount = rs.getString("hisxCount");
                                                                                                                            String crexCount = rs.getString("crexCount");
                                                                                                                            String agrxCount = rs.getString("agrxCount");
                                                                                                                            String busxCount = rs.getString("busxCount");
                                                                                                                            
                                                                                                                            //get entry then store in new table **********adm = form
                                                                                                                            try{
                                                                                                                                String get_entry ="SELECT * FROM `subject_entry` WHERE adm = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                                stm = conn.createStatement();
                                                                                                                                rs = stm.executeQuery(get_entry);
                                                                                                                                while(rs.next())
                                                                                                                                {
                                                                                                                                    String mat = rs.getString("mat");
                                                                                                                                    String eng = rs.getString("eng");
                                                                                                                                    String kis = rs.getString("kis");
                                                                                                                                    String bio = rs.getString("mat");
                                                                                                                                    String phy = rs.getString("phy");
                                                                                                                                    String che = rs.getString("che");
                                                                                                                                    String geo = rs.getString("geo");
                                                                                                                                    String cre = rs.getString("cre");
                                                                                                                                    String his = rs.getString("his");
                                                                                                                                    String agr = rs.getString("agr");
                                                                                                                                    String bst = rs.getString("bst");
                                                                                                                                    
                                                                                                                                    //save to new table
                                                                                                                                    try{
                                                                                                                                        //save englishINSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('','','','','','','','','','','','','','','','','','','','','')
                                                                                                                                        String sql_eng ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','101','"+exam+"','English','"+eng+"','"+engACount+"','"+engAmCount+"','"+engBpCount+"','"+engBCount+"','"+engBCount+"','"+engCpCount+"','"+engCCount+"','"+engCmCount+"','"+engDpCount+"','"+engDCount+"','"+engDmCount+"','"+engECount+"','"+engxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_eng);
                                                                                                                                        pst.execute();
                                                                                                                                        //save kiswahili
                                                                                                                                        String sql_kis ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','102','"+exam+"','Kiswahili','"+kis+"','"+kisACount+"','"+kisAmCount+"','"+kisBpCount+"','"+kisBCount+"','"+kisBCount+"','"+kisCpCount+"','"+kisCCount+"','"+kisCmCount+"','"+kisDpCount+"','"+kisDCount+"','"+kisDmCount+"','"+kisECount+"','"+kisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_kis);
                                                                                                                                        pst.execute();
                                                                                                                                         //save mat
                                                                                                                                        String sql_mat ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','121','"+exam+"','Mathematics','"+mat+"','"+matACount+"','"+matAmCount+"','"+matBpCount+"','"+matBCount+"','"+matBCount+"','"+matCpCount+"','"+matCCount+"','"+matCmCount+"','"+matDpCount+"','"+matDCount+"','"+matDmCount+"','"+matECount+"','"+matxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_mat);
                                                                                                                                        pst.execute();
                                                                                                                                        //save bio
                                                                                                                                        String sql_bio ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','231','"+exam+"','Biology','"+bio+"','"+bioACount+"','"+bioAmCount+"','"+bioBpCount+"','"+bioBCount+"','"+bioBCount+"','"+bioCpCount+"','"+bioCCount+"','"+bioCmCount+"','"+bioDpCount+"','"+bioDCount+"','"+bioDmCount+"','"+bioECount+"','"+bioxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bio);
                                                                                                                                        pst.execute();
                                                                                                                                         //save chem
                                                                                                                                        String sql_che ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','233','"+exam+"','Chemistry','"+che+"','"+chemACount+"','"+chemAmCount+"','"+chemBpCount+"','"+chemBCount+"','"+chemBCount+"','"+chemCpCount+"','"+chemCCount+"','"+chemCmCount+"','"+chemDpCount+"','"+chemDCount+"','"+chemDmCount+"','"+chemECount+"','"+chemxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_che);
                                                                                                                                        pst.execute();
                                                                                                                                        //save phy
                                                                                                                                        String sql_phy ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','232','"+exam+"','Physics','"+phy+"','"+phyACount+"','"+phyAmCount+"','"+phyBpCount+"','"+phyBCount+"','"+phyBCount+"','"+phyCpCount+"','"+phyCCount+"','"+phyCmCount+"','"+phyDpCount+"','"+phyDCount+"','"+phyDmCount+"','"+phyECount+"','"+phyxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_phy);
                                                                                                                                        pst.execute();
                                                                                                                                         //save geo
                                                                                                                                        String sql_geo ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','312','"+exam+"','Geography','"+geo+"','"+geoACount+"','"+geoAmCount+"','"+geoBpCount+"','"+geoBCount+"','"+geoBCount+"','"+geoCpCount+"','"+geoCCount+"','"+geoCmCount+"','"+geoDpCount+"','"+geoDCount+"','"+geoDmCount+"','"+geoECount+"','"+geoxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_geo);
                                                                                                                                        pst.execute();
                                                                                                                                        //save his
                                                                                                                                        String sql_his ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','311','"+exam+"','History','"+his+"','"+hisACount+"','"+hisAmCount+"','"+hisBpCount+"','"+hisBCount+"','"+hisBCount+"','"+hisCpCount+"','"+hisCCount+"','"+hisCmCount+"','"+hisDpCount+"','"+hisDCount+"','"+hisDmCount+"','"+hisECount+"','"+hisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_his);
                                                                                                                                        pst.execute();
                                                                                                                                         //save cre
                                                                                                                                        String sql_cre ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','313','"+exam+"','CRE','"+cre+"','"+creACount+"','"+creAmCount+"','"+creBpCount+"','"+creBCount+"','"+creBCount+"','"+creCpCount+"','"+creCCount+"','"+creCmCount+"','"+creDpCount+"','"+creDCount+"','"+creDmCount+"','"+creECount+"','"+crexCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_cre);
                                                                                                                                        pst.execute();
                                                                                                                                        //save agr
                                                                                                                                        String sql_agr ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','443','"+exam+"','Agriculture','"+agr+"','"+agrACount+"','"+agrAmCount+"','"+agrBpCount+"','"+agrBCount+"','"+agrBCount+"','"+agrCpCount+"','"+agrCCount+"','"+agrCmCount+"','"+agrDpCount+"','"+agrDCount+"','"+agrDmCount+"','"+agrECount+"','"+agrxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_agr);
                                                                                                                                        pst.execute();
                                                                                                                                         //save bst
                                                                                                                                        String sql_bst ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','565','"+exam+"','Business Studies','"+bst+"','"+busACount+"','"+busAmCount+"','"+busBpCount+"','"+busBCount+"','"+busBCount+"','"+busCpCount+"','"+busCCount+"','"+busCmCount+"','"+busDpCount+"','"+busDCount+"','"+busDmCount+"','"+busECount+"','"+busxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bst);
                                                                                                                                        pst.execute();
                                                                                                                                        
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

                                        e.printStackTrace();}
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
                break;
            case "2":
                          //count of As in all subjects
                try{
                    String get_central_As ="SELECT COALESCE(SUM(matgrd = 'A'),0) AS matACount, COALESCE(SUM(enggrd = 'A'),0) AS engACount, COALESCE(SUM(kisgrd = 'A'),0) AS kisACount, COALESCE(SUM(biogrd = 'A'),0) AS bioACount, COALESCE(SUM(chegrd = 'A'),0) AS chemACount, COALESCE(SUM(phygrd = 'A'),0) AS phyACount, COALESCE(SUM(geogrd = 'A'),0) AS geoACount, COALESCE(SUM(hisgrd = 'A'),0) AS hisACount, COALESCE(SUM(cregrd = 'A'),0) AS creACount,  COALESCE(SUM(agrgrd = 'A'),0) AS agrACount, COALESCE(SUM(bstgrd = 'A'),0) AS busACount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(get_central_As);
                    while(rs.next())
                    {
                        String matACount = rs.getString("matACount");
                        String engACount = rs.getString("engACount");
                        String kisACount = rs.getString("kisACount");
                        String bioACount = rs.getString("bioACount");
                        String chemACount = rs.getString("chemACount");
                        String phyACount = rs.getString("phyACount");
                        String geoACount = rs.getString("geoACount");
                        String hisACount = rs.getString("hisACount");
                        String creACount = rs.getString("creACount");
                        String agrACount = rs.getString("agrACount");
                        String busACount = rs.getString("busACount");
                        
                        try{
                             String get_central_Aminus ="SELECT COALESCE(SUM(matgrd = 'A-'),0) AS matAmCount, COALESCE(SUM(enggrd = 'A-'),0) AS engAmCount, COALESCE(SUM(kisgrd = 'A-'),0) AS kisAmCount, COALESCE(SUM(biogrd = 'A-'),0) AS bioAmCount, COALESCE(SUM(chegrd = 'A-'),0) AS chemAmCount, COALESCE(SUM(phygrd = 'A-'),0) AS phyAmCount, COALESCE(SUM(geogrd = 'A-'),0) AS geoAmCount, COALESCE(SUM(hisgrd = 'A-'),0) AS hisAmCount, COALESCE(SUM(cregrd = 'A-'),0) AS creAmCount, COALESCE(SUM(agrgrd = 'A-'),0) AS agrAmCount, COALESCE(SUM(bstgrd = 'A-'),0) AS busAmCount FROM cat_two WHERE   form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                             stm = conn.createStatement();
                             rs = stm.executeQuery(get_central_Aminus);
                             while(rs.next())
                             {
                                String matAmCount = rs.getString("matAmCount");
                                String engAmCount = rs.getString("engAmCount");
                                String kisAmCount = rs.getString("kisAmCount");
                                String bioAmCount = rs.getString("bioAmCount");
                                String chemAmCount = rs.getString("chemAmCount");
                                String phyAmCount = rs.getString("phyAmCount");
                                String geoAmCount = rs.getString("geoAmCount");
                                String hisAmCount = rs.getString("hisAmCount");
                                String creAmCount = rs.getString("creAmCount");
                                String agrAmCount = rs.getString("agrAmCount");
                                String busAmCount = rs.getString("busAmCount");
                                
                                try{
                                     String get_central_bp ="SELECT COALESCE(SUM(matgrd = 'B+'),0) AS matBpCount, COALESCE(SUM(enggrd = 'B+'),0) AS engBpCount, COALESCE(SUM(kisgrd = 'B+'),0) AS kisBpCount, COALESCE(SUM(biogrd = 'B+'),0) AS bioBpCount, COALESCE(SUM(chegrd = 'B+'),0) AS chemBpCount, COALESCE(SUM(phygrd = 'B+'),0) AS phyBpCount, COALESCE(SUM(geogrd = 'B+'),0) AS geoBpCount, COALESCE(SUM(hisgrd = 'B+'),0) AS hisBpCount, COALESCE(SUM(cregrd = 'B+'),0) AS creBpCount,  COALESCE(SUM(agrgrd = 'B+'),0) AS agrBpCount, COALESCE(SUM(bstgrd = 'B+'),0) AS busBpCount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                     stm = conn.createStatement();
                                     rs = stm.executeQuery(get_central_bp);
                                    while(rs.next())
                                    {
                                        String matBpCount = rs.getString("matBpCount");
                                        String engBpCount = rs.getString("engBpCount");
                                        String kisBpCount = rs.getString("kisBpCount");
                                        String bioBpCount = rs.getString("bioBpCount");
                                        String chemBpCount = rs.getString("chemBpCount");
                                        String phyBpCount = rs.getString("phyBpCount");
                                        String geoBpCount = rs.getString("geoBpCount");
                                        String hisBpCount = rs.getString("hisBpCount");
                                        String creBpCount = rs.getString("creBpCount");
                                        String agrBpCount = rs.getString("agrBpCount");
                                        String busBpCount = rs.getString("busBpCount");
                                       
                                        try{
                                            String get_central_b ="SELECT COALESCE(SUM(matgrd = 'B'),0) AS matBCount, COALESCE(SUM(enggrd = 'B'),0) AS engBCount, COALESCE(SUM(kisgrd = 'B'),0) AS kisBCount, COALESCE(SUM(biogrd = 'B'),0) AS bioBCount, COALESCE(SUM(chegrd = 'B'),0) AS chemBCount, COALESCE(SUM(phygrd = 'B'),0) AS phyBCount, COALESCE(SUM(geogrd = 'B'),0) AS geoBCount, COALESCE(SUM(hisgrd = 'B'),0) AS hisBCount, COALESCE(SUM(cregrd = 'B'),0) AS creBCount, COALESCE(SUM(agrgrd = 'B'),0) AS agrBCount, COALESCE(SUM(bstgrd = 'B'),0) AS busBCount FROM  cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                            stm = conn.createStatement();
                                            stm = conn.createStatement();
                                            rs = stm.executeQuery(get_central_b);
                                           while(rs.next())
                                           {
                                                String matBCount = rs.getString("matBCount");
                                                String engBCount = rs.getString("engBCount");
                                                String kisBCount = rs.getString("kisBCount");
                                                String bioBCount = rs.getString("bioBCount");
                                                String chemBCount = rs.getString("chemBCount");
                                                String phyBCount = rs.getString("phyBCount");
                                                String geoBCount = rs.getString("geoBCount");
                                                String hisBCount = rs.getString("hisBCount");
                                                String creBCount = rs.getString("creBCount");
                                                String agrBCount = rs.getString("agrBCount");
                                                String busBCount = rs.getString("busBCount");
                                               
                                                try{
                                                    String get_central_bm ="SELECT COALESCE(SUM(matgrd = 'B-'),0) AS matBmCount, COALESCE(SUM(enggrd = 'B-'),0) AS engBmCount, COALESCE(SUM(kisgrd = 'B-'),0) AS kisBmCount, COALESCE(SUM(biogrd = 'B-'),0) AS bioBmCount, COALESCE(SUM(chegrd = 'B-'),0) AS chemBmCount, COALESCE(SUM(phygrd = 'B-'),0) AS phyBmCount, COALESCE(SUM(geogrd = 'B-'),0) AS geoBmCount, COALESCE(SUM(hisgrd = 'B-'),0) AS hisBmCount, COALESCE(SUM(cregrd = 'B-'),0) AS creBmCount,  COALESCE(SUM(agrgrd = 'B-'),0) AS agrBmCount, COALESCE(SUM(bstgrd = 'B-'),0) AS busBmCount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                    stm = conn.createStatement();                     
                                                    stm = conn.createStatement();
                                                    rs = stm.executeQuery(get_central_bm);
                                                   while(rs.next())
                                                   {
                                                        String matBmCount = rs.getString("matBmCount");
                                                        String engBmCount = rs.getString("engBmCount");
                                                        String kisBmCount = rs.getString("kisBmCount");
                                                        String bioBmCount = rs.getString("bioBmCount");
                                                        String chemBmCount = rs.getString("chemBmCount");
                                                        String phyBmCount = rs.getString("phyBmCount");
                                                        String geoBmCount = rs.getString("geoBmCount");
                                                        String hisBmCount = rs.getString("hisBmCount");
                                                        String creBmCount = rs.getString("creBmCount");
                                                       
                                                        String agrBmCount = rs.getString("agrBmCount");
                                                        String busBmCount = rs.getString("busBmCount");
                                                        
                                                        try{
                                                            String get_central_cp ="SELECT COALESCE(SUM(matgrd = 'C+'),0) AS matCpCount, COALESCE(SUM(enggrd = 'C+'),0) AS engCpCount, COALESCE(SUM(kisgrd = 'C+'),0) AS kisCpCount, COALESCE(SUM(biogrd = 'C+'),0) AS bioCpCount, COALESCE(SUM(chegrd = 'C+'),0) AS chemCpCount, COALESCE(SUM(phygrd = 'C+'),0) AS phyCpCount, COALESCE(SUM(geogrd = 'C+'),0) AS geoCpCount, COALESCE(SUM(hisgrd = 'C+'),0) AS hisCpCount, COALESCE(SUM(cregrd = 'C+'),0) AS creCpCount,  COALESCE(SUM(agrgrd = 'C+'),0) AS agrCpCount, COALESCE(SUM(bstgrd = 'C+'),0) AS busCpCount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                            stm = conn.createStatement();
                                                            stm = conn.createStatement();
                                                            rs = stm.executeQuery(get_central_cp);
                                                           while(rs.next())
                                                           {
                                                                String matCpCount = rs.getString("matCpCount");
                                                                String engCpCount = rs.getString("engCpCount");
                                                                String kisCpCount = rs.getString("kisCpCount");
                                                                String bioCpCount = rs.getString("bioCpCount");
                                                                String chemCpCount = rs.getString("chemCpCount");
                                                                String phyCpCount = rs.getString("phyCpCount");
                                                                String geoCpCount = rs.getString("geoCpCount");
                                                                String hisCpCount = rs.getString("hisCpCount");
                                                                String creCpCount = rs.getString("creCpCount");
                                                                
                                                                String agrCpCount = rs.getString("agrCpCount");
                                                                String busCpCount = rs.getString("busCpCount");
                                                                
                                                                try{
                                                                    String get_central_c = "SELECT COALESCE(SUM(matgrd = 'C'),0) AS matCCount, COALESCE(SUM(enggrd = 'C'),0) AS engCCount, COALESCE(SUM(kisgrd = 'C'),0) AS kisCCount, COALESCE(SUM(biogrd = 'C'),0) AS bioCCount, COALESCE(SUM(chegrd = 'C'),0) AS chemCCount, COALESCE(SUM(phygrd = 'C'),0) AS phyCCount, COALESCE(SUM(geogrd = 'C'),0) AS geoCCount, COALESCE(SUM(hisgrd = 'C'),0) AS hisCCount, COALESCE(SUM(cregrd = 'C'),0) AS creCCount,  COALESCE(SUM(agrgrd = 'C'),0) AS agrCCount, COALESCE(SUM(bstgrd = 'C'),0) AS busCCount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                    stm = conn.createStatement();
                                                                    rs = stm.executeQuery(get_central_c);
                                                                   while(rs.next())
                                                                   {
                                                                        String matCCount = rs.getString("matCCount");
                                                                        String engCCount = rs.getString("engCCount");
                                                                        String kisCCount = rs.getString("kisCCount");
                                                                        String bioCCount = rs.getString("bioCCount");
                                                                        String chemCCount = rs.getString("chemCCount");
                                                                        String phyCCount = rs.getString("phyCCount");
                                                                        String geoCCount = rs.getString("geoCCount");
                                                                        String hisCCount = rs.getString("hisCCount");
                                                                        String creCCount = rs.getString("creCCount");
                                                                        String agrCCount = rs.getString("agrCCount");
                                                                        String busCCount = rs.getString("busCCount");
                                                                       
                                                                        try{
                                                                            String get_central_cm = "SELECT COALESCE(SUM(matgrd = 'C-'),0) AS matCmCount, COALESCE(SUM(enggrd = 'C-'),0) AS engCmCount, COALESCE(SUM(kisgrd = 'C-'),0) AS kisCmCount, COALESCE(SUM(biogrd = 'C-'),0) AS bioCmCount, COALESCE(SUM(chegrd = 'C-'),0) AS chemCmCount, COALESCE(SUM(phygrd = 'C-'),0) AS phyCmCount,COALESCE(SUM(geogrd = 'C-'),0) AS geoCmCount, COALESCE(SUM(hisgrd = 'C-'),0) AS hisCmCount, COALESCE(SUM(cregrd = 'C-'),0) AS creCmCount,  COALESCE(SUM(agrgrd = 'C-'),0) AS agrCmCount, COALESCE(SUM(bstgrd = 'C-'),0) AS busCmCount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                            stm = conn.createStatement();
                                                                            rs = stm.executeQuery(get_central_cm);
                                                                           while(rs.next())
                                                                           {
                                                                                String matCmCount = rs.getString("matCmCount");
                                                                                String engCmCount = rs.getString("engCmCount");
                                                                                String kisCmCount = rs.getString("kisCmCount");
                                                                                String bioCmCount = rs.getString("bioCmCount");
                                                                                String chemCmCount = rs.getString("chemCmCount");
                                                                                String phyCmCount = rs.getString("phyCmCount");
                                                                                String geoCmCount = rs.getString("geoCmCount");
                                                                                String hisCmCount = rs.getString("hisCmCount");
                                                                                String creCmCount = rs.getString("creCmCount");
                                                                                String agrCmCount = rs.getString("agrCmCount");
                                                                                String busCmCount = rs.getString("busCmCount");
                                                                               
                                                                                try{
                                                                                    String get_central_dp ="SELECT COALESCE(SUM(matgrd = 'D+'),0) AS matDpCount, COALESCE(SUM(enggrd = 'D+'),0) AS engDpCount, COALESCE(SUM(kisgrd = 'D+'),0) AS kisDpCount, COALESCE(SUM(biogrd = 'D+'),0) AS bioDpCount, COALESCE(SUM(chegrd = 'D+'),0) AS chemDpCount, COALESCE(SUM(phygrd = 'D+'),0) AS phyDpCount,COALESCE(SUM(geogrd = 'D+'),0) AS geoDpCount, COALESCE(SUM(hisgrd = 'D+'),0) AS hisDpCount, COALESCE(SUM(cregrd = 'D+'),0) AS creDpCount,COALESCE(SUM(agrgrd = 'D+'),0) AS agrDpCount, COALESCE(SUM(bstgrd = 'D+'),0) AS busDpCount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                    stm = conn.createStatement();
                                                                                    rs = stm.executeQuery(get_central_dp);
                                                                                   while(rs.next())
                                                                                   {
                                                                                        String matDpCount = rs.getString("matDpCount");
                                                                                        String engDpCount = rs.getString("engDpCount");
                                                                                        String kisDpCount = rs.getString("kisDpCount");
                                                                                        String bioDpCount = rs.getString("bioDpCount");
                                                                                        String chemDpCount = rs.getString("chemDpCount");
                                                                                        String phyDpCount = rs.getString("phyDpCount");
                                                                                        String geoDpCount = rs.getString("geoDpCount");
                                                                                        String hisDpCount = rs.getString("hisDpCount");
                                                                                        String creDpCount = rs.getString("creDpCount");
                                                                                        String agrDpCount = rs.getString("agrDpCount");
                                                                                        String busDpCount = rs.getString("busDpCount");
                                                                                        
                                                                                        try{
                                                                                            String get_central_d = "SELECT COALESCE(SUM(matgrd = 'D'),0) AS matDCount, COALESCE(SUM(enggrd = 'D'),0) AS engDCount, COALESCE(SUM(kisgrd = 'D'),0) AS kisDCount, COALESCE(SUM(biogrd = 'D'),0) AS bioDCount, COALESCE(SUM(chegrd = 'D'),0) AS chemDCount, COALESCE(SUM(phygrd = 'D'),0) AS phyDCount, COALESCE(SUM(geogrd = 'D'),0) AS geoDCount, COALESCE(SUM(hisgrd = 'D'),0) AS hisDCount, COALESCE(SUM(cregrd = 'D'),0) AS creDCount, COALESCE(SUM(agrgrd = 'D'),0) AS agrDCount, COALESCE(SUM(bstgrd = 'D'),0) AS busDCount  FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                            stm = conn.createStatement();
                                                                                            rs = stm.executeQuery(get_central_d);
                                                                                           while(rs.next())
                                                                                           {
                                                                                                String matDCount = rs.getString("matDCount");
                                                                                                String engDCount = rs.getString("engDCount");
                                                                                                String kisDCount = rs.getString("kisDCount");
                                                                                                String bioDCount = rs.getString("bioDCount");
                                                                                                String chemDCount = rs.getString("chemDCount");
                                                                                                String phyDCount = rs.getString("phyDCount");
                                                                                                String geoDCount = rs.getString("geoDCount");
                                                                                                String hisDCount = rs.getString("hisDCount");
                                                                                                String creDCount = rs.getString("creDCount");
                                                                                                
                                                                                                String agrDCount = rs.getString("agrDCount");
                                                                                                String busDCount = rs.getString("busDCount");
                                                                                         
                                                                                                try{
                                                                                                    String get_central_dm = "SELECT COALESCE(SUM(matgrd = 'D-'),0) AS matDmCount, COALESCE(SUM(enggrd = 'D-'),0) AS engDmCount, COALESCE(SUM(kisgrd = 'D-'),0) AS kisDmCount, COALESCE(SUM(biogrd = 'D-'),0) AS bioDmCount, COALESCE(SUM(chegrd = 'D-'),0) AS chemDmCount,COALESCE(SUM(phygrd = 'D-'),0) AS phyDmCount, COALESCE(SUM(geogrd = 'D-'),0) AS geoDmCount, COALESCE(SUM(hisgrd = 'D-'),0) AS hisDmCount, COALESCE(SUM(cregrd = 'D-'),0) AS creDmCount, COALESCE(SUM(agrgrd = 'D-'),0) AS agrDmCount, COALESCE(SUM(bstgrd = 'D-'),0) AS busDmCount FROM  cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                    stm = conn.createStatement();
                                                                                                    rs = stm.executeQuery(get_central_dm);
                                                                                                   while(rs.next())
                                                                                                   {
                                                                                                        String matDmCount = rs.getString("matDmCount");
                                                                                                        String engDmCount = rs.getString("engDmCount");
                                                                                                        String kisDmCount = rs.getString("kisDmCount");
                                                                                                        String bioDmCount = rs.getString("bioDmCount");
                                                                                                        String chemDmCount = rs.getString("chemDmCount");
                                                                                                        String phyDmCount = rs.getString("phyDmCount");
                                                                                                        String geoDmCount = rs.getString("geoDmCount");
                                                                                                        String hisDmCount = rs.getString("hisDmCount");
                                                                                                        String creDmCount = rs.getString("creDmCount");
                                                                                                        String agrDmCount = rs.getString("agrDmCount");
                                                                                                        String busDmCount = rs.getString("busDmCount");
                                                                                                        
                                                                                                        try{
                                                                                                              String get_central_E ="SELECT COALESCE(SUM(matgrd = 'E'),0) AS matECount, COALESCE(SUM(enggrd = 'E'),0) AS engECount, COALESCE(SUM(kisgrd = 'E'),0) AS kisECount, COALESCE(SUM(biogrd = 'E'),0) AS bioECount, COALESCE(SUM(chegrd = 'E'),0) AS chemECount, COALESCE(SUM(phygrd = 'E'),0) AS phyECount, COALESCE(SUM(geogrd = 'E'),0) AS geoECount, COALESCE(SUM(hisgrd = 'E'),0) AS hisECount, COALESCE(SUM(cregrd = 'E'),0) AS creECount, COALESCE(SUM(agrgrd = 'E'),0) AS agrECount, COALESCE(SUM(bstgrd = 'E'),0) AS busECount FROM cat_two WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                              stm = conn.createStatement();
                                                                                                              rs = stm.executeQuery(get_central_E);

                                                                                                               while(rs.next())
                                                                                                               {   

                                                                                                                    String matECount = rs.getString("matECount");
                                                                                                                    String engECount = rs.getString("engECount");
                                                                                                                    String kisECount = rs.getString("kisECount");
                                                                                                                    String bioECount = rs.getString("bioECount");
                                                                                                                    String chemECount = rs.getString("chemECount");
                                                                                                                    String phyECount = rs.getString("phyECount");
                                                                                                                    String geoECount = rs.getString("geoECount");
                                                                                                                    String hisECount = rs.getString("hisECount");
                                                                                                                    String creECount = rs.getString("creECount");
                                                                                                                    String agrECount = rs.getString("agrECount");
                                                                                                                    String busECount = rs.getString("busECount");
                                                                                                                    
                                                                                                                    try{
                                                                                                                        String get_central_x ="SELECT COALESCE(SUM(matgrd = '0'),0) AS matxCount, COALESCE(SUM(enggrd = '0'),0) AS engxCount, COALESCE(SUM(kisgrd = '0'),0) AS kisxCount, COALESCE(SUM(biogrd = '0'),0) AS bioxCount, COALESCE(SUM(chegrd = '0'),0) AS chemxCount, COALESCE(SUM(phygrd = '0'),0) AS phyxCount, COALESCE(SUM(geogrd = '0'),0) AS geoxCount, COALESCE(SUM(hisgrd = '0'),0) AS hisxCount, COALESCE(SUM(cregrd = '0'),0) AS crexCount, COALESCE(SUM(agrgrd = '0'),0) AS agrxCount, COALESCE(SUM(bstgrd = '0'),0) AS busxCount FROM  cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                        stm = conn.createStatement();
                                                                                                                        rs = stm.executeQuery(get_central_x);
                                                                                                                       while(rs.next())
                                                                                                                       {

                                                                                                                            String matxCount = rs.getString("matxCount");
                                                                                                                            String engxCount = rs.getString("engxCount");
                                                                                                                            String kisxCount = rs.getString("kisxCount");
                                                                                                                            String bioxCount = rs.getString("bioxCount");
                                                                                                                            String chemxCount = rs.getString("chemxCount");
                                                                                                                            String phyxCount = rs.getString("phyxCount");
                                                                                                                            String geoxCount = rs.getString("geoxCount");
                                                                                                                            String hisxCount = rs.getString("hisxCount");
                                                                                                                            String crexCount = rs.getString("crexCount");
                                                                                                                            String agrxCount = rs.getString("agrxCount");
                                                                                                                            String busxCount = rs.getString("busxCount");
                                                                                                                            
                                                                                                                            //get entry then store in new table **********adm = form
                                                                                                                            try{
                                                                                                                                String get_entry ="SELECT * FROM `subject_entry` WHERE adm = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                                stm = conn.createStatement();
                                                                                                                                rs = stm.executeQuery(get_entry);
                                                                                                                                while(rs.next())
                                                                                                                                {
                                                                                                                                    String mat = rs.getString("mat");
                                                                                                                                    String eng = rs.getString("eng");
                                                                                                                                    String kis = rs.getString("kis");
                                                                                                                                    String bio = rs.getString("mat");
                                                                                                                                    String phy = rs.getString("phy");
                                                                                                                                    String che = rs.getString("che");
                                                                                                                                    String geo = rs.getString("geo");
                                                                                                                                    String cre = rs.getString("cre");
                                                                                                                                    String his = rs.getString("his");
                                                                                                                                    String agr = rs.getString("agr");
                                                                                                                                    String bst = rs.getString("bst");
                                                                                                                                    
                                                                                                                                    //save to new table
                                                                                                                                    try{
                                                                                                                                        //save englishINSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('','','','','','','','','','','','','','','','','','','','','')
                                                                                                                                        String sql_eng ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','101','"+exam+"','English','"+eng+"','"+engACount+"','"+engAmCount+"','"+engBpCount+"','"+engBCount+"','"+engBCount+"','"+engCpCount+"','"+engCCount+"','"+engCmCount+"','"+engDpCount+"','"+engDCount+"','"+engDmCount+"','"+engECount+"','"+engxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_eng);
                                                                                                                                        pst.execute();
                                                                                                                                        //save kiswahili
                                                                                                                                        String sql_kis ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','102','"+exam+"','Kiswahili','"+kis+"','"+kisACount+"','"+kisAmCount+"','"+kisBpCount+"','"+kisBCount+"','"+kisBCount+"','"+kisCpCount+"','"+kisCCount+"','"+kisCmCount+"','"+kisDpCount+"','"+kisDCount+"','"+kisDmCount+"','"+kisECount+"','"+kisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_kis);
                                                                                                                                        pst.execute();
                                                                                                                                         //save mat
                                                                                                                                        String sql_mat ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','121','"+exam+"','Mathematics','"+mat+"','"+matACount+"','"+matAmCount+"','"+matBpCount+"','"+matBCount+"','"+matBCount+"','"+matCpCount+"','"+matCCount+"','"+matCmCount+"','"+matDpCount+"','"+matDCount+"','"+matDmCount+"','"+matECount+"','"+matxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_mat);
                                                                                                                                        pst.execute();
                                                                                                                                        //save bio
                                                                                                                                        String sql_bio ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','231','"+exam+"','Biology','"+bio+"','"+bioACount+"','"+bioAmCount+"','"+bioBpCount+"','"+bioBCount+"','"+bioBCount+"','"+bioCpCount+"','"+bioCCount+"','"+bioCmCount+"','"+bioDpCount+"','"+bioDCount+"','"+bioDmCount+"','"+bioECount+"','"+bioxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bio);
                                                                                                                                        pst.execute();
                                                                                                                                         //save chem
                                                                                                                                        String sql_che ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','233','"+exam+"','Chemistry','"+che+"','"+chemACount+"','"+chemAmCount+"','"+chemBpCount+"','"+chemBCount+"','"+chemBCount+"','"+chemCpCount+"','"+chemCCount+"','"+chemCmCount+"','"+chemDpCount+"','"+chemDCount+"','"+chemDmCount+"','"+chemECount+"','"+chemxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_che);
                                                                                                                                        pst.execute();
                                                                                                                                        //save phy
                                                                                                                                        String sql_phy ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','232','"+exam+"','Physics','"+phy+"','"+phyACount+"','"+phyAmCount+"','"+phyBpCount+"','"+phyBCount+"','"+phyBCount+"','"+phyCpCount+"','"+phyCCount+"','"+phyCmCount+"','"+phyDpCount+"','"+phyDCount+"','"+phyDmCount+"','"+phyECount+"','"+phyxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_phy);
                                                                                                                                        pst.execute();
                                                                                                                                         //save geo
                                                                                                                                        String sql_geo ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','312','"+exam+"','Geography','"+geo+"','"+geoACount+"','"+geoAmCount+"','"+geoBpCount+"','"+geoBCount+"','"+geoBCount+"','"+geoCpCount+"','"+geoCCount+"','"+geoCmCount+"','"+geoDpCount+"','"+geoDCount+"','"+geoDmCount+"','"+geoECount+"','"+geoxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_geo);
                                                                                                                                        pst.execute();
                                                                                                                                        //save his
                                                                                                                                        String sql_his ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','311','"+exam+"','History','"+his+"','"+hisACount+"','"+hisAmCount+"','"+hisBpCount+"','"+hisBCount+"','"+hisBCount+"','"+hisCpCount+"','"+hisCCount+"','"+hisCmCount+"','"+hisDpCount+"','"+hisDCount+"','"+hisDmCount+"','"+hisECount+"','"+hisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_his);
                                                                                                                                        pst.execute();
                                                                                                                                         //save cre
                                                                                                                                        String sql_cre ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','313','"+exam+"','CRE','"+cre+"','"+creACount+"','"+creAmCount+"','"+creBpCount+"','"+creBCount+"','"+creBCount+"','"+creCpCount+"','"+creCCount+"','"+creCmCount+"','"+creDpCount+"','"+creDCount+"','"+creDmCount+"','"+creECount+"','"+crexCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_cre);
                                                                                                                                        pst.execute();
                                                                                                                                        //save agr
                                                                                                                                        String sql_agr ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','443','"+exam+"','Agriculture','"+agr+"','"+agrACount+"','"+agrAmCount+"','"+agrBpCount+"','"+agrBCount+"','"+agrBCount+"','"+agrCpCount+"','"+agrCCount+"','"+agrCmCount+"','"+agrDpCount+"','"+agrDCount+"','"+agrDmCount+"','"+agrECount+"','"+agrxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_agr);
                                                                                                                                        pst.execute();
                                                                                                                                         //save bst
                                                                                                                                        String sql_bst ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','565','"+exam+"','Business Studies','"+bst+"','"+busACount+"','"+busAmCount+"','"+busBpCount+"','"+busBCount+"','"+busBCount+"','"+busCpCount+"','"+busCCount+"','"+busCmCount+"','"+busDpCount+"','"+busDCount+"','"+busDmCount+"','"+busECount+"','"+busxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bst);
                                                                                                                                        pst.execute();
                                                                                                                                        
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

                                        e.printStackTrace();}
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
                break;
            case "3":
                          //count of As in all subjects
                try{
                    String get_central_As ="SELECT COALESCE(SUM(matgrd = 'A'),0) AS matACount, COALESCE(SUM(enggrd = 'A'),0) AS engACount, COALESCE(SUM(kisgrd = 'A'),0) AS kisACount, COALESCE(SUM(biogrd = 'A'),0) AS bioACount, COALESCE(SUM(chegrd = 'A'),0) AS chemACount, COALESCE(SUM(phygrd = 'A'),0) AS phyACount, COALESCE(SUM(geogrd = 'A'),0) AS geoACount, COALESCE(SUM(hisgrd = 'A'),0) AS hisACount, COALESCE(SUM(cregrd = 'A'),0) AS creACount,  COALESCE(SUM(agrgrd = 'A'),0) AS agrACount, COALESCE(SUM(bstgrd = 'A'),0) AS busACount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(get_central_As);
                    while(rs.next())
                    {
                        String matACount = rs.getString("matACount");
                        String engACount = rs.getString("engACount");
                        String kisACount = rs.getString("kisACount");
                        String bioACount = rs.getString("bioACount");
                        String chemACount = rs.getString("chemACount");
                        String phyACount = rs.getString("phyACount");
                        String geoACount = rs.getString("geoACount");
                        String hisACount = rs.getString("hisACount");
                        String creACount = rs.getString("creACount");
                        String agrACount = rs.getString("agrACount");
                        String busACount = rs.getString("busACount");
                        
                        try{
                             String get_central_Aminus ="SELECT COALESCE(SUM(matgrd = 'A-'),0) AS matAmCount, COALESCE(SUM(enggrd = 'A-'),0) AS engAmCount, COALESCE(SUM(kisgrd = 'A-'),0) AS kisAmCount, COALESCE(SUM(biogrd = 'A-'),0) AS bioAmCount, COALESCE(SUM(chegrd = 'A-'),0) AS chemAmCount, COALESCE(SUM(phygrd = 'A-'),0) AS phyAmCount, COALESCE(SUM(geogrd = 'A-'),0) AS geoAmCount, COALESCE(SUM(hisgrd = 'A-'),0) AS hisAmCount, COALESCE(SUM(cregrd = 'A-'),0) AS creAmCount, COALESCE(SUM(agrgrd = 'A-'),0) AS agrAmCount, COALESCE(SUM(bstgrd = 'A-'),0) AS busAmCount FROM cat_three WHERE   form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                             stm = conn.createStatement();
                             rs = stm.executeQuery(get_central_Aminus);
                             while(rs.next())
                             {
                                String matAmCount = rs.getString("matAmCount");
                                String engAmCount = rs.getString("engAmCount");
                                String kisAmCount = rs.getString("kisAmCount");
                                String bioAmCount = rs.getString("bioAmCount");
                                String chemAmCount = rs.getString("chemAmCount");
                                String phyAmCount = rs.getString("phyAmCount");
                                String geoAmCount = rs.getString("geoAmCount");
                                String hisAmCount = rs.getString("hisAmCount");
                                String creAmCount = rs.getString("creAmCount");
                                String agrAmCount = rs.getString("agrAmCount");
                                String busAmCount = rs.getString("busAmCount");
                                
                                try{
                                     String get_central_bp ="SELECT COALESCE(SUM(matgrd = 'B+'),0) AS matBpCount, COALESCE(SUM(enggrd = 'B+'),0) AS engBpCount, COALESCE(SUM(kisgrd = 'B+'),0) AS kisBpCount, COALESCE(SUM(biogrd = 'B+'),0) AS bioBpCount, COALESCE(SUM(chegrd = 'B+'),0) AS chemBpCount, COALESCE(SUM(phygrd = 'B+'),0) AS phyBpCount, COALESCE(SUM(geogrd = 'B+'),0) AS geoBpCount, COALESCE(SUM(hisgrd = 'B+'),0) AS hisBpCount, COALESCE(SUM(cregrd = 'B+'),0) AS creBpCount,  COALESCE(SUM(agrgrd = 'B+'),0) AS agrBpCount, COALESCE(SUM(bstgrd = 'B+'),0) AS busBpCount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                     stm = conn.createStatement();
                                     rs = stm.executeQuery(get_central_bp);
                                    while(rs.next())
                                    {
                                        String matBpCount = rs.getString("matBpCount");
                                        String engBpCount = rs.getString("engBpCount");
                                        String kisBpCount = rs.getString("kisBpCount");
                                        String bioBpCount = rs.getString("bioBpCount");
                                        String chemBpCount = rs.getString("chemBpCount");
                                        String phyBpCount = rs.getString("phyBpCount");
                                        String geoBpCount = rs.getString("geoBpCount");
                                        String hisBpCount = rs.getString("hisBpCount");
                                        String creBpCount = rs.getString("creBpCount");
                                        String agrBpCount = rs.getString("agrBpCount");
                                        String busBpCount = rs.getString("busBpCount");
                                       
                                        try{
                                            String get_central_b ="SELECT COALESCE(SUM(matgrd = 'B'),0) AS matBCount, COALESCE(SUM(enggrd = 'B'),0) AS engBCount, COALESCE(SUM(kisgrd = 'B'),0) AS kisBCount, COALESCE(SUM(biogrd = 'B'),0) AS bioBCount, COALESCE(SUM(chegrd = 'B'),0) AS chemBCount, COALESCE(SUM(phygrd = 'B'),0) AS phyBCount, COALESCE(SUM(geogrd = 'B'),0) AS geoBCount, COALESCE(SUM(hisgrd = 'B'),0) AS hisBCount, COALESCE(SUM(cregrd = 'B'),0) AS creBCount, COALESCE(SUM(agrgrd = 'B'),0) AS agrBCount, COALESCE(SUM(bstgrd = 'B'),0) AS busBCount FROM  cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                            stm = conn.createStatement();
                                            stm = conn.createStatement();
                                            rs = stm.executeQuery(get_central_b);
                                           while(rs.next())
                                           {
                                                String matBCount = rs.getString("matBCount");
                                                String engBCount = rs.getString("engBCount");
                                                String kisBCount = rs.getString("kisBCount");
                                                String bioBCount = rs.getString("bioBCount");
                                                String chemBCount = rs.getString("chemBCount");
                                                String phyBCount = rs.getString("phyBCount");
                                                String geoBCount = rs.getString("geoBCount");
                                                String hisBCount = rs.getString("hisBCount");
                                                String creBCount = rs.getString("creBCount");
                                                String agrBCount = rs.getString("agrBCount");
                                                String busBCount = rs.getString("busBCount");
                                               
                                                try{
                                                    String get_central_bm ="SELECT COALESCE(SUM(matgrd = 'B-'),0) AS matBmCount, COALESCE(SUM(enggrd = 'B-'),0) AS engBmCount, COALESCE(SUM(kisgrd = 'B-'),0) AS kisBmCount, COALESCE(SUM(biogrd = 'B-'),0) AS bioBmCount, COALESCE(SUM(chegrd = 'B-'),0) AS chemBmCount, COALESCE(SUM(phygrd = 'B-'),0) AS phyBmCount, COALESCE(SUM(geogrd = 'B-'),0) AS geoBmCount, COALESCE(SUM(hisgrd = 'B-'),0) AS hisBmCount, COALESCE(SUM(cregrd = 'B-'),0) AS creBmCount,  COALESCE(SUM(agrgrd = 'B-'),0) AS agrBmCount, COALESCE(SUM(bstgrd = 'B-'),0) AS busBmCount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                    stm = conn.createStatement();                     
                                                    stm = conn.createStatement();
                                                    rs = stm.executeQuery(get_central_bm);
                                                   while(rs.next())
                                                   {
                                                        String matBmCount = rs.getString("matBmCount");
                                                        String engBmCount = rs.getString("engBmCount");
                                                        String kisBmCount = rs.getString("kisBmCount");
                                                        String bioBmCount = rs.getString("bioBmCount");
                                                        String chemBmCount = rs.getString("chemBmCount");
                                                        String phyBmCount = rs.getString("phyBmCount");
                                                        String geoBmCount = rs.getString("geoBmCount");
                                                        String hisBmCount = rs.getString("hisBmCount");
                                                        String creBmCount = rs.getString("creBmCount");
                                                       
                                                        String agrBmCount = rs.getString("agrBmCount");
                                                        String busBmCount = rs.getString("busBmCount");
                                                        
                                                        try{
                                                            String get_central_cp ="SELECT COALESCE(SUM(matgrd = 'C+'),0) AS matCpCount, COALESCE(SUM(enggrd = 'C+'),0) AS engCpCount, COALESCE(SUM(kisgrd = 'C+'),0) AS kisCpCount, COALESCE(SUM(biogrd = 'C+'),0) AS bioCpCount, COALESCE(SUM(chegrd = 'C+'),0) AS chemCpCount, COALESCE(SUM(phygrd = 'C+'),0) AS phyCpCount, COALESCE(SUM(geogrd = 'C+'),0) AS geoCpCount, COALESCE(SUM(hisgrd = 'C+'),0) AS hisCpCount, COALESCE(SUM(cregrd = 'C+'),0) AS creCpCount,  COALESCE(SUM(agrgrd = 'C+'),0) AS agrCpCount, COALESCE(SUM(bstgrd = 'C+'),0) AS busCpCount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                            stm = conn.createStatement();
                                                            stm = conn.createStatement();
                                                            rs = stm.executeQuery(get_central_cp);
                                                           while(rs.next())
                                                           {
                                                                String matCpCount = rs.getString("matCpCount");
                                                                String engCpCount = rs.getString("engCpCount");
                                                                String kisCpCount = rs.getString("kisCpCount");
                                                                String bioCpCount = rs.getString("bioCpCount");
                                                                String chemCpCount = rs.getString("chemCpCount");
                                                                String phyCpCount = rs.getString("phyCpCount");
                                                                String geoCpCount = rs.getString("geoCpCount");
                                                                String hisCpCount = rs.getString("hisCpCount");
                                                                String creCpCount = rs.getString("creCpCount");
                                                                
                                                                String agrCpCount = rs.getString("agrCpCount");
                                                                String busCpCount = rs.getString("busCpCount");
                                                                
                                                                try{
                                                                    String get_central_c = "SELECT COALESCE(SUM(matgrd = 'C'),0) AS matCCount, COALESCE(SUM(enggrd = 'C'),0) AS engCCount, COALESCE(SUM(kisgrd = 'C'),0) AS kisCCount, COALESCE(SUM(biogrd = 'C'),0) AS bioCCount, COALESCE(SUM(chegrd = 'C'),0) AS chemCCount, COALESCE(SUM(phygrd = 'C'),0) AS phyCCount, COALESCE(SUM(geogrd = 'C'),0) AS geoCCount, COALESCE(SUM(hisgrd = 'C'),0) AS hisCCount, COALESCE(SUM(cregrd = 'C'),0) AS creCCount,  COALESCE(SUM(agrgrd = 'C'),0) AS agrCCount, COALESCE(SUM(bstgrd = 'C'),0) AS busCCount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                    stm = conn.createStatement();
                                                                    rs = stm.executeQuery(get_central_c);
                                                                   while(rs.next())
                                                                   {
                                                                        String matCCount = rs.getString("matCCount");
                                                                        String engCCount = rs.getString("engCCount");
                                                                        String kisCCount = rs.getString("kisCCount");
                                                                        String bioCCount = rs.getString("bioCCount");
                                                                        String chemCCount = rs.getString("chemCCount");
                                                                        String phyCCount = rs.getString("phyCCount");
                                                                        String geoCCount = rs.getString("geoCCount");
                                                                        String hisCCount = rs.getString("hisCCount");
                                                                        String creCCount = rs.getString("creCCount");
                                                                        String agrCCount = rs.getString("agrCCount");
                                                                        String busCCount = rs.getString("busCCount");
                                                                       
                                                                        try{
                                                                            String get_central_cm = "SELECT COALESCE(SUM(matgrd = 'C-'),0) AS matCmCount, COALESCE(SUM(enggrd = 'C-'),0) AS engCmCount, COALESCE(SUM(kisgrd = 'C-'),0) AS kisCmCount, COALESCE(SUM(biogrd = 'C-'),0) AS bioCmCount, COALESCE(SUM(chegrd = 'C-'),0) AS chemCmCount, COALESCE(SUM(phygrd = 'C-'),0) AS phyCmCount,COALESCE(SUM(geogrd = 'C-'),0) AS geoCmCount, COALESCE(SUM(hisgrd = 'C-'),0) AS hisCmCount, COALESCE(SUM(cregrd = 'C-'),0) AS creCmCount,  COALESCE(SUM(agrgrd = 'C-'),0) AS agrCmCount, COALESCE(SUM(bstgrd = 'C-'),0) AS busCmCount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                            stm = conn.createStatement();
                                                                            rs = stm.executeQuery(get_central_cm);
                                                                           while(rs.next())
                                                                           {
                                                                                String matCmCount = rs.getString("matCmCount");
                                                                                String engCmCount = rs.getString("engCmCount");
                                                                                String kisCmCount = rs.getString("kisCmCount");
                                                                                String bioCmCount = rs.getString("bioCmCount");
                                                                                String chemCmCount = rs.getString("chemCmCount");
                                                                                String phyCmCount = rs.getString("phyCmCount");
                                                                                String geoCmCount = rs.getString("geoCmCount");
                                                                                String hisCmCount = rs.getString("hisCmCount");
                                                                                String creCmCount = rs.getString("creCmCount");
                                                                                String agrCmCount = rs.getString("agrCmCount");
                                                                                String busCmCount = rs.getString("busCmCount");
                                                                               
                                                                                try{
                                                                                    String get_central_dp ="SELECT COALESCE(SUM(matgrd = 'D+'),0) AS matDpCount, COALESCE(SUM(enggrd = 'D+'),0) AS engDpCount, COALESCE(SUM(kisgrd = 'D+'),0) AS kisDpCount, COALESCE(SUM(biogrd = 'D+'),0) AS bioDpCount, COALESCE(SUM(chegrd = 'D+'),0) AS chemDpCount, COALESCE(SUM(phygrd = 'D+'),0) AS phyDpCount,COALESCE(SUM(geogrd = 'D+'),0) AS geoDpCount, COALESCE(SUM(hisgrd = 'D+'),0) AS hisDpCount, COALESCE(SUM(cregrd = 'D+'),0) AS creDpCount,COALESCE(SUM(agrgrd = 'D+'),0) AS agrDpCount, COALESCE(SUM(bstgrd = 'D+'),0) AS busDpCount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                    stm = conn.createStatement();
                                                                                    rs = stm.executeQuery(get_central_dp);
                                                                                   while(rs.next())
                                                                                   {
                                                                                        String matDpCount = rs.getString("matDpCount");
                                                                                        String engDpCount = rs.getString("engDpCount");
                                                                                        String kisDpCount = rs.getString("kisDpCount");
                                                                                        String bioDpCount = rs.getString("bioDpCount");
                                                                                        String chemDpCount = rs.getString("chemDpCount");
                                                                                        String phyDpCount = rs.getString("phyDpCount");
                                                                                        String geoDpCount = rs.getString("geoDpCount");
                                                                                        String hisDpCount = rs.getString("hisDpCount");
                                                                                        String creDpCount = rs.getString("creDpCount");
                                                                                        String agrDpCount = rs.getString("agrDpCount");
                                                                                        String busDpCount = rs.getString("busDpCount");
                                                                                        
                                                                                        try{
                                                                                            String get_central_d = "SELECT COALESCE(SUM(matgrd = 'D'),0) AS matDCount, COALESCE(SUM(enggrd = 'D'),0) AS engDCount, COALESCE(SUM(kisgrd = 'D'),0) AS kisDCount, COALESCE(SUM(biogrd = 'D'),0) AS bioDCount, COALESCE(SUM(chegrd = 'D'),0) AS chemDCount, COALESCE(SUM(phygrd = 'D'),0) AS phyDCount, COALESCE(SUM(geogrd = 'D'),0) AS geoDCount, COALESCE(SUM(hisgrd = 'D'),0) AS hisDCount, COALESCE(SUM(cregrd = 'D'),0) AS creDCount, COALESCE(SUM(agrgrd = 'D'),0) AS agrDCount, COALESCE(SUM(bstgrd = 'D'),0) AS busDCount  FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                            stm = conn.createStatement();
                                                                                            rs = stm.executeQuery(get_central_d);
                                                                                           while(rs.next())
                                                                                           {
                                                                                                String matDCount = rs.getString("matDCount");
                                                                                                String engDCount = rs.getString("engDCount");
                                                                                                String kisDCount = rs.getString("kisDCount");
                                                                                                String bioDCount = rs.getString("bioDCount");
                                                                                                String chemDCount = rs.getString("chemDCount");
                                                                                                String phyDCount = rs.getString("phyDCount");
                                                                                                String geoDCount = rs.getString("geoDCount");
                                                                                                String hisDCount = rs.getString("hisDCount");
                                                                                                String creDCount = rs.getString("creDCount");
                                                                                                
                                                                                                String agrDCount = rs.getString("agrDCount");
                                                                                                String busDCount = rs.getString("busDCount");
                                                                                         
                                                                                                try{
                                                                                                    String get_central_dm = "SELECT COALESCE(SUM(matgrd = 'D-'),0) AS matDmCount, COALESCE(SUM(enggrd = 'D-'),0) AS engDmCount, COALESCE(SUM(kisgrd = 'D-'),0) AS kisDmCount, COALESCE(SUM(biogrd = 'D-'),0) AS bioDmCount, COALESCE(SUM(chegrd = 'D-'),0) AS chemDmCount,COALESCE(SUM(phygrd = 'D-'),0) AS phyDmCount, COALESCE(SUM(geogrd = 'D-'),0) AS geoDmCount, COALESCE(SUM(hisgrd = 'D-'),0) AS hisDmCount, COALESCE(SUM(cregrd = 'D-'),0) AS creDmCount, COALESCE(SUM(agrgrd = 'D-'),0) AS agrDmCount, COALESCE(SUM(bstgrd = 'D-'),0) AS busDmCount FROM  cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                    stm = conn.createStatement();
                                                                                                    rs = stm.executeQuery(get_central_dm);
                                                                                                   while(rs.next())
                                                                                                   {
                                                                                                        String matDmCount = rs.getString("matDmCount");
                                                                                                        String engDmCount = rs.getString("engDmCount");
                                                                                                        String kisDmCount = rs.getString("kisDmCount");
                                                                                                        String bioDmCount = rs.getString("bioDmCount");
                                                                                                        String chemDmCount = rs.getString("chemDmCount");
                                                                                                        String phyDmCount = rs.getString("phyDmCount");
                                                                                                        String geoDmCount = rs.getString("geoDmCount");
                                                                                                        String hisDmCount = rs.getString("hisDmCount");
                                                                                                        String creDmCount = rs.getString("creDmCount");
                                                                                                        String agrDmCount = rs.getString("agrDmCount");
                                                                                                        String busDmCount = rs.getString("busDmCount");
                                                                                                        
                                                                                                        try{
                                                                                                              String get_central_E ="SELECT COALESCE(SUM(matgrd = 'E'),0) AS matECount, COALESCE(SUM(enggrd = 'E'),0) AS engECount, COALESCE(SUM(kisgrd = 'E'),0) AS kisECount, COALESCE(SUM(biogrd = 'E'),0) AS bioECount, COALESCE(SUM(chegrd = 'E'),0) AS chemECount, COALESCE(SUM(phygrd = 'E'),0) AS phyECount, COALESCE(SUM(geogrd = 'E'),0) AS geoECount, COALESCE(SUM(hisgrd = 'E'),0) AS hisECount, COALESCE(SUM(cregrd = 'E'),0) AS creECount, COALESCE(SUM(agrgrd = 'E'),0) AS agrECount, COALESCE(SUM(bstgrd = 'E'),0) AS busECount FROM cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                              stm = conn.createStatement();
                                                                                                              rs = stm.executeQuery(get_central_E);

                                                                                                               while(rs.next())
                                                                                                               {   

                                                                                                                    String matECount = rs.getString("matECount");
                                                                                                                    String engECount = rs.getString("engECount");
                                                                                                                    String kisECount = rs.getString("kisECount");
                                                                                                                    String bioECount = rs.getString("bioECount");
                                                                                                                    String chemECount = rs.getString("chemECount");
                                                                                                                    String phyECount = rs.getString("phyECount");
                                                                                                                    String geoECount = rs.getString("geoECount");
                                                                                                                    String hisECount = rs.getString("hisECount");
                                                                                                                    String creECount = rs.getString("creECount");
                                                                                                                    String agrECount = rs.getString("agrECount");
                                                                                                                    String busECount = rs.getString("busECount");
                                                                                                                    
                                                                                                                    try{
                                                                                                                        String get_central_x ="SELECT COALESCE(SUM(matgrd = '0'),0) AS matxCount, COALESCE(SUM(enggrd = '0'),0) AS engxCount, COALESCE(SUM(kisgrd = '0'),0) AS kisxCount, COALESCE(SUM(biogrd = '0'),0) AS bioxCount, COALESCE(SUM(chegrd = '0'),0) AS chemxCount, COALESCE(SUM(phygrd = '0'),0) AS phyxCount, COALESCE(SUM(geogrd = '0'),0) AS geoxCount, COALESCE(SUM(hisgrd = '0'),0) AS hisxCount, COALESCE(SUM(cregrd = '0'),0) AS crexCount, COALESCE(SUM(agrgrd = '0'),0) AS agrxCount, COALESCE(SUM(bstgrd = '0'),0) AS busxCount FROM  cat_three WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                        stm = conn.createStatement();
                                                                                                                        rs = stm.executeQuery(get_central_x);
                                                                                                                       while(rs.next())
                                                                                                                       {

                                                                                                                            String matxCount = rs.getString("matxCount");
                                                                                                                            String engxCount = rs.getString("engxCount");
                                                                                                                            String kisxCount = rs.getString("kisxCount");
                                                                                                                            String bioxCount = rs.getString("bioxCount");
                                                                                                                            String chemxCount = rs.getString("chemxCount");
                                                                                                                            String phyxCount = rs.getString("phyxCount");
                                                                                                                            String geoxCount = rs.getString("geoxCount");
                                                                                                                            String hisxCount = rs.getString("hisxCount");
                                                                                                                            String crexCount = rs.getString("crexCount");
                                                                                                                            String agrxCount = rs.getString("agrxCount");
                                                                                                                            String busxCount = rs.getString("busxCount");
                                                                                                                            
                                                                                                                            //get entry then store in new table **********adm = form
                                                                                                                            try{
                                                                                                                                String get_entry ="SELECT * FROM `subject_entry` WHERE adm = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                                stm = conn.createStatement();
                                                                                                                                rs = stm.executeQuery(get_entry);
                                                                                                                                while(rs.next())
                                                                                                                                {
                                                                                                                                    String mat = rs.getString("mat");
                                                                                                                                    String eng = rs.getString("eng");
                                                                                                                                    String kis = rs.getString("kis");
                                                                                                                                    String bio = rs.getString("mat");
                                                                                                                                    String phy = rs.getString("phy");
                                                                                                                                    String che = rs.getString("che");
                                                                                                                                    String geo = rs.getString("geo");
                                                                                                                                    String cre = rs.getString("cre");
                                                                                                                                    String his = rs.getString("his");
                                                                                                                                    String agr = rs.getString("agr");
                                                                                                                                    String bst = rs.getString("bst");
                                                                                                                                    
                                                                                                                                    //save to new table
                                                                                                                                    try{
                                                                                                                                        //save englishINSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('','','','','','','','','','','','','','','','','','','','','')
                                                                                                                                        String sql_eng ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','101','"+exam+"','English','"+eng+"','"+engACount+"','"+engAmCount+"','"+engBpCount+"','"+engBCount+"','"+engBCount+"','"+engCpCount+"','"+engCCount+"','"+engCmCount+"','"+engDpCount+"','"+engDCount+"','"+engDmCount+"','"+engECount+"','"+engxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_eng);
                                                                                                                                        pst.execute();
                                                                                                                                        //save kiswahili
                                                                                                                                        String sql_kis ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','102','"+exam+"','Kiswahili','"+kis+"','"+kisACount+"','"+kisAmCount+"','"+kisBpCount+"','"+kisBCount+"','"+kisBCount+"','"+kisCpCount+"','"+kisCCount+"','"+kisCmCount+"','"+kisDpCount+"','"+kisDCount+"','"+kisDmCount+"','"+kisECount+"','"+kisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_kis);
                                                                                                                                        pst.execute();
                                                                                                                                         //save mat
                                                                                                                                        String sql_mat ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','121','"+exam+"','Mathematics','"+mat+"','"+matACount+"','"+matAmCount+"','"+matBpCount+"','"+matBCount+"','"+matBCount+"','"+matCpCount+"','"+matCCount+"','"+matCmCount+"','"+matDpCount+"','"+matDCount+"','"+matDmCount+"','"+matECount+"','"+matxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_mat);
                                                                                                                                        pst.execute();
                                                                                                                                        //save bio
                                                                                                                                        String sql_bio ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','231','"+exam+"','Biology','"+bio+"','"+bioACount+"','"+bioAmCount+"','"+bioBpCount+"','"+bioBCount+"','"+bioBCount+"','"+bioCpCount+"','"+bioCCount+"','"+bioCmCount+"','"+bioDpCount+"','"+bioDCount+"','"+bioDmCount+"','"+bioECount+"','"+bioxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bio);
                                                                                                                                        pst.execute();
                                                                                                                                         //save chem
                                                                                                                                        String sql_che ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','233','"+exam+"','Chemistry','"+che+"','"+chemACount+"','"+chemAmCount+"','"+chemBpCount+"','"+chemBCount+"','"+chemBCount+"','"+chemCpCount+"','"+chemCCount+"','"+chemCmCount+"','"+chemDpCount+"','"+chemDCount+"','"+chemDmCount+"','"+chemECount+"','"+chemxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_che);
                                                                                                                                        pst.execute();
                                                                                                                                        //save phy
                                                                                                                                        String sql_phy ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','232','"+exam+"','Physics','"+phy+"','"+phyACount+"','"+phyAmCount+"','"+phyBpCount+"','"+phyBCount+"','"+phyBCount+"','"+phyCpCount+"','"+phyCCount+"','"+phyCmCount+"','"+phyDpCount+"','"+phyDCount+"','"+phyDmCount+"','"+phyECount+"','"+phyxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_phy);
                                                                                                                                        pst.execute();
                                                                                                                                         //save geo
                                                                                                                                        String sql_geo ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','312','"+exam+"','Geography','"+geo+"','"+geoACount+"','"+geoAmCount+"','"+geoBpCount+"','"+geoBCount+"','"+geoBCount+"','"+geoCpCount+"','"+geoCCount+"','"+geoCmCount+"','"+geoDpCount+"','"+geoDCount+"','"+geoDmCount+"','"+geoECount+"','"+geoxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_geo);
                                                                                                                                        pst.execute();
                                                                                                                                        //save his
                                                                                                                                        String sql_his ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','311','"+exam+"','History','"+his+"','"+hisACount+"','"+hisAmCount+"','"+hisBpCount+"','"+hisBCount+"','"+hisBCount+"','"+hisCpCount+"','"+hisCCount+"','"+hisCmCount+"','"+hisDpCount+"','"+hisDCount+"','"+hisDmCount+"','"+hisECount+"','"+hisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_his);
                                                                                                                                        pst.execute();
                                                                                                                                         //save cre
                                                                                                                                        String sql_cre ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','313','"+exam+"','CRE','"+cre+"','"+creACount+"','"+creAmCount+"','"+creBpCount+"','"+creBCount+"','"+creBCount+"','"+creCpCount+"','"+creCCount+"','"+creCmCount+"','"+creDpCount+"','"+creDCount+"','"+creDmCount+"','"+creECount+"','"+crexCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_cre);
                                                                                                                                        pst.execute();
                                                                                                                                        //save agr
                                                                                                                                        String sql_agr ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','443','"+exam+"','Agriculture','"+agr+"','"+agrACount+"','"+agrAmCount+"','"+agrBpCount+"','"+agrBCount+"','"+agrBCount+"','"+agrCpCount+"','"+agrCCount+"','"+agrCmCount+"','"+agrDpCount+"','"+agrDCount+"','"+agrDmCount+"','"+agrECount+"','"+agrxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_agr);
                                                                                                                                        pst.execute();
                                                                                                                                         //save bst
                                                                                                                                        String sql_bst ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','565','"+exam+"','Business Studies','"+bst+"','"+busACount+"','"+busAmCount+"','"+busBpCount+"','"+busBCount+"','"+busBCount+"','"+busCpCount+"','"+busCCount+"','"+busCmCount+"','"+busDpCount+"','"+busDCount+"','"+busDmCount+"','"+busECount+"','"+busxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bst);
                                                                                                                                        pst.execute();
                                                                                                                                        
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

                                        e.printStackTrace();}
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
                break;
            case "4":
                          //count of As in all subjects
                try{
                    String get_central_As ="SELECT COALESCE(SUM(matgrd = 'A'),0) AS matACount, COALESCE(SUM(enggrd = 'A'),0) AS engACount, COALESCE(SUM(kisgrd = 'A'),0) AS kisACount, COALESCE(SUM(biogrd = 'A'),0) AS bioACount, COALESCE(SUM(chegrd = 'A'),0) AS chemACount, COALESCE(SUM(phygrd = 'A'),0) AS phyACount, COALESCE(SUM(geogrd = 'A'),0) AS geoACount, COALESCE(SUM(hisgrd = 'A'),0) AS hisACount, COALESCE(SUM(cregrd = 'A'),0) AS creACount,  COALESCE(SUM(agrgrd = 'A'),0) AS agrACount, COALESCE(SUM(bstgrd = 'A'),0) AS busACount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(get_central_As);
                    while(rs.next())
                    {
                        String matACount = rs.getString("matACount");
                        String engACount = rs.getString("engACount");
                        String kisACount = rs.getString("kisACount");
                        String bioACount = rs.getString("bioACount");
                        String chemACount = rs.getString("chemACount");
                        String phyACount = rs.getString("phyACount");
                        String geoACount = rs.getString("geoACount");
                        String hisACount = rs.getString("hisACount");
                        String creACount = rs.getString("creACount");
                        String agrACount = rs.getString("agrACount");
                        String busACount = rs.getString("busACount");
                        
                        try{
                             String get_central_Aminus ="SELECT COALESCE(SUM(matgrd = 'A-'),0) AS matAmCount, COALESCE(SUM(enggrd = 'A-'),0) AS engAmCount, COALESCE(SUM(kisgrd = 'A-'),0) AS kisAmCount, COALESCE(SUM(biogrd = 'A-'),0) AS bioAmCount, COALESCE(SUM(chegrd = 'A-'),0) AS chemAmCount, COALESCE(SUM(phygrd = 'A-'),0) AS phyAmCount, COALESCE(SUM(geogrd = 'A-'),0) AS geoAmCount, COALESCE(SUM(hisgrd = 'A-'),0) AS hisAmCount, COALESCE(SUM(cregrd = 'A-'),0) AS creAmCount, COALESCE(SUM(agrgrd = 'A-'),0) AS agrAmCount, COALESCE(SUM(bstgrd = 'A-'),0) AS busAmCount FROM cat_avg WHERE   form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                             stm = conn.createStatement();
                             rs = stm.executeQuery(get_central_Aminus);
                             while(rs.next())
                             {
                                String matAmCount = rs.getString("matAmCount");
                                String engAmCount = rs.getString("engAmCount");
                                String kisAmCount = rs.getString("kisAmCount");
                                String bioAmCount = rs.getString("bioAmCount");
                                String chemAmCount = rs.getString("chemAmCount");
                                String phyAmCount = rs.getString("phyAmCount");
                                String geoAmCount = rs.getString("geoAmCount");
                                String hisAmCount = rs.getString("hisAmCount");
                                String creAmCount = rs.getString("creAmCount");
                                String agrAmCount = rs.getString("agrAmCount");
                                String busAmCount = rs.getString("busAmCount");
                                
                                try{
                                     String get_central_bp ="SELECT COALESCE(SUM(matgrd = 'B+'),0) AS matBpCount, COALESCE(SUM(enggrd = 'B+'),0) AS engBpCount, COALESCE(SUM(kisgrd = 'B+'),0) AS kisBpCount, COALESCE(SUM(biogrd = 'B+'),0) AS bioBpCount, COALESCE(SUM(chegrd = 'B+'),0) AS chemBpCount, COALESCE(SUM(phygrd = 'B+'),0) AS phyBpCount, COALESCE(SUM(geogrd = 'B+'),0) AS geoBpCount, COALESCE(SUM(hisgrd = 'B+'),0) AS hisBpCount, COALESCE(SUM(cregrd = 'B+'),0) AS creBpCount,  COALESCE(SUM(agrgrd = 'B+'),0) AS agrBpCount, COALESCE(SUM(bstgrd = 'B+'),0) AS busBpCount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                     stm = conn.createStatement();
                                     rs = stm.executeQuery(get_central_bp);
                                    while(rs.next())
                                    {
                                        String matBpCount = rs.getString("matBpCount");
                                        String engBpCount = rs.getString("engBpCount");
                                        String kisBpCount = rs.getString("kisBpCount");
                                        String bioBpCount = rs.getString("bioBpCount");
                                        String chemBpCount = rs.getString("chemBpCount");
                                        String phyBpCount = rs.getString("phyBpCount");
                                        String geoBpCount = rs.getString("geoBpCount");
                                        String hisBpCount = rs.getString("hisBpCount");
                                        String creBpCount = rs.getString("creBpCount");
                                        String agrBpCount = rs.getString("agrBpCount");
                                        String busBpCount = rs.getString("busBpCount");
                                       
                                        try{
                                            String get_central_b ="SELECT COALESCE(SUM(matgrd = 'B'),0) AS matBCount, COALESCE(SUM(enggrd = 'B'),0) AS engBCount, COALESCE(SUM(kisgrd = 'B'),0) AS kisBCount, COALESCE(SUM(biogrd = 'B'),0) AS bioBCount, COALESCE(SUM(chegrd = 'B'),0) AS chemBCount, COALESCE(SUM(phygrd = 'B'),0) AS phyBCount, COALESCE(SUM(geogrd = 'B'),0) AS geoBCount, COALESCE(SUM(hisgrd = 'B'),0) AS hisBCount, COALESCE(SUM(cregrd = 'B'),0) AS creBCount, COALESCE(SUM(agrgrd = 'B'),0) AS agrBCount, COALESCE(SUM(bstgrd = 'B'),0) AS busBCount FROM  cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                            stm = conn.createStatement();
                                            stm = conn.createStatement();
                                            rs = stm.executeQuery(get_central_b);
                                           while(rs.next())
                                           {
                                                String matBCount = rs.getString("matBCount");
                                                String engBCount = rs.getString("engBCount");
                                                String kisBCount = rs.getString("kisBCount");
                                                String bioBCount = rs.getString("bioBCount");
                                                String chemBCount = rs.getString("chemBCount");
                                                String phyBCount = rs.getString("phyBCount");
                                                String geoBCount = rs.getString("geoBCount");
                                                String hisBCount = rs.getString("hisBCount");
                                                String creBCount = rs.getString("creBCount");
                                                String agrBCount = rs.getString("agrBCount");
                                                String busBCount = rs.getString("busBCount");
                                               
                                                try{
                                                    String get_central_bm ="SELECT COALESCE(SUM(matgrd = 'B-'),0) AS matBmCount, COALESCE(SUM(enggrd = 'B-'),0) AS engBmCount, COALESCE(SUM(kisgrd = 'B-'),0) AS kisBmCount, COALESCE(SUM(biogrd = 'B-'),0) AS bioBmCount, COALESCE(SUM(chegrd = 'B-'),0) AS chemBmCount, COALESCE(SUM(phygrd = 'B-'),0) AS phyBmCount, COALESCE(SUM(geogrd = 'B-'),0) AS geoBmCount, COALESCE(SUM(hisgrd = 'B-'),0) AS hisBmCount, COALESCE(SUM(cregrd = 'B-'),0) AS creBmCount,  COALESCE(SUM(agrgrd = 'B-'),0) AS agrBmCount, COALESCE(SUM(bstgrd = 'B-'),0) AS busBmCount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                    stm = conn.createStatement();                     
                                                    stm = conn.createStatement();
                                                    rs = stm.executeQuery(get_central_bm);
                                                   while(rs.next())
                                                   {
                                                        String matBmCount = rs.getString("matBmCount");
                                                        String engBmCount = rs.getString("engBmCount");
                                                        String kisBmCount = rs.getString("kisBmCount");
                                                        String bioBmCount = rs.getString("bioBmCount");
                                                        String chemBmCount = rs.getString("chemBmCount");
                                                        String phyBmCount = rs.getString("phyBmCount");
                                                        String geoBmCount = rs.getString("geoBmCount");
                                                        String hisBmCount = rs.getString("hisBmCount");
                                                        String creBmCount = rs.getString("creBmCount");
                                                       
                                                        String agrBmCount = rs.getString("agrBmCount");
                                                        String busBmCount = rs.getString("busBmCount");
                                                        
                                                        try{
                                                            String get_central_cp ="SELECT COALESCE(SUM(matgrd = 'C+'),0) AS matCpCount, COALESCE(SUM(enggrd = 'C+'),0) AS engCpCount, COALESCE(SUM(kisgrd = 'C+'),0) AS kisCpCount, COALESCE(SUM(biogrd = 'C+'),0) AS bioCpCount, COALESCE(SUM(chegrd = 'C+'),0) AS chemCpCount, COALESCE(SUM(phygrd = 'C+'),0) AS phyCpCount, COALESCE(SUM(geogrd = 'C+'),0) AS geoCpCount, COALESCE(SUM(hisgrd = 'C+'),0) AS hisCpCount, COALESCE(SUM(cregrd = 'C+'),0) AS creCpCount,  COALESCE(SUM(agrgrd = 'C+'),0) AS agrCpCount, COALESCE(SUM(bstgrd = 'C+'),0) AS busCpCount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                            stm = conn.createStatement();
                                                            stm = conn.createStatement();
                                                            rs = stm.executeQuery(get_central_cp);
                                                           while(rs.next())
                                                           {
                                                                String matCpCount = rs.getString("matCpCount");
                                                                String engCpCount = rs.getString("engCpCount");
                                                                String kisCpCount = rs.getString("kisCpCount");
                                                                String bioCpCount = rs.getString("bioCpCount");
                                                                String chemCpCount = rs.getString("chemCpCount");
                                                                String phyCpCount = rs.getString("phyCpCount");
                                                                String geoCpCount = rs.getString("geoCpCount");
                                                                String hisCpCount = rs.getString("hisCpCount");
                                                                String creCpCount = rs.getString("creCpCount");
                                                                
                                                                String agrCpCount = rs.getString("agrCpCount");
                                                                String busCpCount = rs.getString("busCpCount");
                                                                
                                                                try{
                                                                    String get_central_c = "SELECT COALESCE(SUM(matgrd = 'C'),0) AS matCCount, COALESCE(SUM(enggrd = 'C'),0) AS engCCount, COALESCE(SUM(kisgrd = 'C'),0) AS kisCCount, COALESCE(SUM(biogrd = 'C'),0) AS bioCCount, COALESCE(SUM(chegrd = 'C'),0) AS chemCCount, COALESCE(SUM(phygrd = 'C'),0) AS phyCCount, COALESCE(SUM(geogrd = 'C'),0) AS geoCCount, COALESCE(SUM(hisgrd = 'C'),0) AS hisCCount, COALESCE(SUM(cregrd = 'C'),0) AS creCCount,  COALESCE(SUM(agrgrd = 'C'),0) AS agrCCount, COALESCE(SUM(bstgrd = 'C'),0) AS busCCount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                    stm = conn.createStatement();
                                                                    rs = stm.executeQuery(get_central_c);
                                                                   while(rs.next())
                                                                   {
                                                                        String matCCount = rs.getString("matCCount");
                                                                        String engCCount = rs.getString("engCCount");
                                                                        String kisCCount = rs.getString("kisCCount");
                                                                        String bioCCount = rs.getString("bioCCount");
                                                                        String chemCCount = rs.getString("chemCCount");
                                                                        String phyCCount = rs.getString("phyCCount");
                                                                        String geoCCount = rs.getString("geoCCount");
                                                                        String hisCCount = rs.getString("hisCCount");
                                                                        String creCCount = rs.getString("creCCount");
                                                                        String agrCCount = rs.getString("agrCCount");
                                                                        String busCCount = rs.getString("busCCount");
                                                                       
                                                                        try{
                                                                            String get_central_cm = "SELECT COALESCE(SUM(matgrd = 'C-'),0) AS matCmCount, COALESCE(SUM(enggrd = 'C-'),0) AS engCmCount, COALESCE(SUM(kisgrd = 'C-'),0) AS kisCmCount, COALESCE(SUM(biogrd = 'C-'),0) AS bioCmCount, COALESCE(SUM(chegrd = 'C-'),0) AS chemCmCount, COALESCE(SUM(phygrd = 'C-'),0) AS phyCmCount,COALESCE(SUM(geogrd = 'C-'),0) AS geoCmCount, COALESCE(SUM(hisgrd = 'C-'),0) AS hisCmCount, COALESCE(SUM(cregrd = 'C-'),0) AS creCmCount,  COALESCE(SUM(agrgrd = 'C-'),0) AS agrCmCount, COALESCE(SUM(bstgrd = 'C-'),0) AS busCmCount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                            stm = conn.createStatement();
                                                                            rs = stm.executeQuery(get_central_cm);
                                                                           while(rs.next())
                                                                           {
                                                                                String matCmCount = rs.getString("matCmCount");
                                                                                String engCmCount = rs.getString("engCmCount");
                                                                                String kisCmCount = rs.getString("kisCmCount");
                                                                                String bioCmCount = rs.getString("bioCmCount");
                                                                                String chemCmCount = rs.getString("chemCmCount");
                                                                                String phyCmCount = rs.getString("phyCmCount");
                                                                                String geoCmCount = rs.getString("geoCmCount");
                                                                                String hisCmCount = rs.getString("hisCmCount");
                                                                                String creCmCount = rs.getString("creCmCount");
                                                                                String agrCmCount = rs.getString("agrCmCount");
                                                                                String busCmCount = rs.getString("busCmCount");
                                                                               
                                                                                try{
                                                                                    String get_central_dp ="SELECT COALESCE(SUM(matgrd = 'D+'),0) AS matDpCount, COALESCE(SUM(enggrd = 'D+'),0) AS engDpCount, COALESCE(SUM(kisgrd = 'D+'),0) AS kisDpCount, COALESCE(SUM(biogrd = 'D+'),0) AS bioDpCount, COALESCE(SUM(chegrd = 'D+'),0) AS chemDpCount, COALESCE(SUM(phygrd = 'D+'),0) AS phyDpCount,COALESCE(SUM(geogrd = 'D+'),0) AS geoDpCount, COALESCE(SUM(hisgrd = 'D+'),0) AS hisDpCount, COALESCE(SUM(cregrd = 'D+'),0) AS creDpCount,COALESCE(SUM(agrgrd = 'D+'),0) AS agrDpCount, COALESCE(SUM(bstgrd = 'D+'),0) AS busDpCount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                    stm = conn.createStatement();
                                                                                    rs = stm.executeQuery(get_central_dp);
                                                                                   while(rs.next())
                                                                                   {
                                                                                        String matDpCount = rs.getString("matDpCount");
                                                                                        String engDpCount = rs.getString("engDpCount");
                                                                                        String kisDpCount = rs.getString("kisDpCount");
                                                                                        String bioDpCount = rs.getString("bioDpCount");
                                                                                        String chemDpCount = rs.getString("chemDpCount");
                                                                                        String phyDpCount = rs.getString("phyDpCount");
                                                                                        String geoDpCount = rs.getString("geoDpCount");
                                                                                        String hisDpCount = rs.getString("hisDpCount");
                                                                                        String creDpCount = rs.getString("creDpCount");
                                                                                        String agrDpCount = rs.getString("agrDpCount");
                                                                                        String busDpCount = rs.getString("busDpCount");
                                                                                        
                                                                                        try{
                                                                                            String get_central_d = "SELECT COALESCE(SUM(matgrd = 'D'),0) AS matDCount, COALESCE(SUM(enggrd = 'D'),0) AS engDCount, COALESCE(SUM(kisgrd = 'D'),0) AS kisDCount, COALESCE(SUM(biogrd = 'D'),0) AS bioDCount, COALESCE(SUM(chegrd = 'D'),0) AS chemDCount, COALESCE(SUM(phygrd = 'D'),0) AS phyDCount, COALESCE(SUM(geogrd = 'D'),0) AS geoDCount, COALESCE(SUM(hisgrd = 'D'),0) AS hisDCount, COALESCE(SUM(cregrd = 'D'),0) AS creDCount, COALESCE(SUM(agrgrd = 'D'),0) AS agrDCount, COALESCE(SUM(bstgrd = 'D'),0) AS busDCount  FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                            stm = conn.createStatement();
                                                                                            rs = stm.executeQuery(get_central_d);
                                                                                           while(rs.next())
                                                                                           {
                                                                                                String matDCount = rs.getString("matDCount");
                                                                                                String engDCount = rs.getString("engDCount");
                                                                                                String kisDCount = rs.getString("kisDCount");
                                                                                                String bioDCount = rs.getString("bioDCount");
                                                                                                String chemDCount = rs.getString("chemDCount");
                                                                                                String phyDCount = rs.getString("phyDCount");
                                                                                                String geoDCount = rs.getString("geoDCount");
                                                                                                String hisDCount = rs.getString("hisDCount");
                                                                                                String creDCount = rs.getString("creDCount");
                                                                                                
                                                                                                String agrDCount = rs.getString("agrDCount");
                                                                                                String busDCount = rs.getString("busDCount");
                                                                                         
                                                                                                try{
                                                                                                    String get_central_dm = "SELECT COALESCE(SUM(matgrd = 'D-'),0) AS matDmCount, COALESCE(SUM(enggrd = 'D-'),0) AS engDmCount, COALESCE(SUM(kisgrd = 'D-'),0) AS kisDmCount, COALESCE(SUM(biogrd = 'D-'),0) AS bioDmCount, COALESCE(SUM(chegrd = 'D-'),0) AS chemDmCount,COALESCE(SUM(phygrd = 'D-'),0) AS phyDmCount, COALESCE(SUM(geogrd = 'D-'),0) AS geoDmCount, COALESCE(SUM(hisgrd = 'D-'),0) AS hisDmCount, COALESCE(SUM(cregrd = 'D-'),0) AS creDmCount, COALESCE(SUM(agrgrd = 'D-'),0) AS agrDmCount, COALESCE(SUM(bstgrd = 'D-'),0) AS busDmCount FROM  cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                    stm = conn.createStatement();
                                                                                                    rs = stm.executeQuery(get_central_dm);
                                                                                                   while(rs.next())
                                                                                                   {
                                                                                                        String matDmCount = rs.getString("matDmCount");
                                                                                                        String engDmCount = rs.getString("engDmCount");
                                                                                                        String kisDmCount = rs.getString("kisDmCount");
                                                                                                        String bioDmCount = rs.getString("bioDmCount");
                                                                                                        String chemDmCount = rs.getString("chemDmCount");
                                                                                                        String phyDmCount = rs.getString("phyDmCount");
                                                                                                        String geoDmCount = rs.getString("geoDmCount");
                                                                                                        String hisDmCount = rs.getString("hisDmCount");
                                                                                                        String creDmCount = rs.getString("creDmCount");
                                                                                                        String agrDmCount = rs.getString("agrDmCount");
                                                                                                        String busDmCount = rs.getString("busDmCount");
                                                                                                        
                                                                                                        try{
                                                                                                              String get_central_E ="SELECT COALESCE(SUM(matgrd = 'E'),0) AS matECount, COALESCE(SUM(enggrd = 'E'),0) AS engECount, COALESCE(SUM(kisgrd = 'E'),0) AS kisECount, COALESCE(SUM(biogrd = 'E'),0) AS bioECount, COALESCE(SUM(chegrd = 'E'),0) AS chemECount, COALESCE(SUM(phygrd = 'E'),0) AS phyECount, COALESCE(SUM(geogrd = 'E'),0) AS geoECount, COALESCE(SUM(hisgrd = 'E'),0) AS hisECount, COALESCE(SUM(cregrd = 'E'),0) AS creECount, COALESCE(SUM(agrgrd = 'E'),0) AS agrECount, COALESCE(SUM(bstgrd = 'E'),0) AS busECount FROM cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                              stm = conn.createStatement();
                                                                                                              rs = stm.executeQuery(get_central_E);

                                                                                                               while(rs.next())
                                                                                                               {   

                                                                                                                    String matECount = rs.getString("matECount");
                                                                                                                    String engECount = rs.getString("engECount");
                                                                                                                    String kisECount = rs.getString("kisECount");
                                                                                                                    String bioECount = rs.getString("bioECount");
                                                                                                                    String chemECount = rs.getString("chemECount");
                                                                                                                    String phyECount = rs.getString("phyECount");
                                                                                                                    String geoECount = rs.getString("geoECount");
                                                                                                                    String hisECount = rs.getString("hisECount");
                                                                                                                    String creECount = rs.getString("creECount");
                                                                                                                    String agrECount = rs.getString("agrECount");
                                                                                                                    String busECount = rs.getString("busECount");
                                                                                                                    
                                                                                                                    try{
                                                                                                                        String get_central_x ="SELECT COALESCE(SUM(matgrd = '0'),0) AS matxCount, COALESCE(SUM(enggrd = '0'),0) AS engxCount, COALESCE(SUM(kisgrd = '0'),0) AS kisxCount, COALESCE(SUM(biogrd = '0'),0) AS bioxCount, COALESCE(SUM(chegrd = '0'),0) AS chemxCount, COALESCE(SUM(phygrd = '0'),0) AS phyxCount, COALESCE(SUM(geogrd = '0'),0) AS geoxCount, COALESCE(SUM(hisgrd = '0'),0) AS hisxCount, COALESCE(SUM(cregrd = '0'),0) AS crexCount, COALESCE(SUM(agrgrd = '0'),0) AS agrxCount, COALESCE(SUM(bstgrd = '0'),0) AS busxCount FROM  cat_avg WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                        stm = conn.createStatement();
                                                                                                                        rs = stm.executeQuery(get_central_x);
                                                                                                                       while(rs.next())
                                                                                                                       {

                                                                                                                            String matxCount = rs.getString("matxCount");
                                                                                                                            String engxCount = rs.getString("engxCount");
                                                                                                                            String kisxCount = rs.getString("kisxCount");
                                                                                                                            String bioxCount = rs.getString("bioxCount");
                                                                                                                            String chemxCount = rs.getString("chemxCount");
                                                                                                                            String phyxCount = rs.getString("phyxCount");
                                                                                                                            String geoxCount = rs.getString("geoxCount");
                                                                                                                            String hisxCount = rs.getString("hisxCount");
                                                                                                                            String crexCount = rs.getString("crexCount");
                                                                                                                            String agrxCount = rs.getString("agrxCount");
                                                                                                                            String busxCount = rs.getString("busxCount");
                                                                                                                            
                                                                                                                            //get entry then store in new table **********adm = form
                                                                                                                            try{
                                                                                                                                String get_entry ="SELECT * FROM `subject_entry` WHERE adm = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                                                                                                                                stm = conn.createStatement();
                                                                                                                                rs = stm.executeQuery(get_entry);
                                                                                                                                while(rs.next())
                                                                                                                                {
                                                                                                                                    String mat = rs.getString("mat");
                                                                                                                                    String eng = rs.getString("eng");
                                                                                                                                    String kis = rs.getString("kis");
                                                                                                                                    String bio = rs.getString("mat");
                                                                                                                                    String phy = rs.getString("phy");
                                                                                                                                    String che = rs.getString("che");
                                                                                                                                    String geo = rs.getString("geo");
                                                                                                                                    String cre = rs.getString("cre");
                                                                                                                                    String his = rs.getString("his");
                                                                                                                                    String agr = rs.getString("agr");
                                                                                                                                    String bst = rs.getString("bst");
                                                                                                                                    
                                                                                                                                    //save to new table
                                                                                                                                    try{
                                                                                                                                        //save englishINSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('','','','','','','','','','','','','','','','','','','','','')
                                                                                                                                        String sql_eng ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','101','"+exam+"','English','"+eng+"','"+engACount+"','"+engAmCount+"','"+engBpCount+"','"+engBCount+"','"+engBCount+"','"+engCpCount+"','"+engCCount+"','"+engCmCount+"','"+engDpCount+"','"+engDCount+"','"+engDmCount+"','"+engECount+"','"+engxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_eng);
                                                                                                                                        pst.execute();
                                                                                                                                        //save kiswahili
                                                                                                                                        String sql_kis ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','102','"+exam+"','Kiswahili','"+kis+"','"+kisACount+"','"+kisAmCount+"','"+kisBpCount+"','"+kisBCount+"','"+kisBCount+"','"+kisCpCount+"','"+kisCCount+"','"+kisCmCount+"','"+kisDpCount+"','"+kisDCount+"','"+kisDmCount+"','"+kisECount+"','"+kisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_kis);
                                                                                                                                        pst.execute();
                                                                                                                                         //save mat
                                                                                                                                        String sql_mat ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','121','"+exam+"','Mathematics','"+mat+"','"+matACount+"','"+matAmCount+"','"+matBpCount+"','"+matBCount+"','"+matBCount+"','"+matCpCount+"','"+matCCount+"','"+matCmCount+"','"+matDpCount+"','"+matDCount+"','"+matDmCount+"','"+matECount+"','"+matxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_mat);
                                                                                                                                        pst.execute();
                                                                                                                                        //save bio
                                                                                                                                        String sql_bio ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','231','"+exam+"','Biology','"+bio+"','"+bioACount+"','"+bioAmCount+"','"+bioBpCount+"','"+bioBCount+"','"+bioBCount+"','"+bioCpCount+"','"+bioCCount+"','"+bioCmCount+"','"+bioDpCount+"','"+bioDCount+"','"+bioDmCount+"','"+bioECount+"','"+bioxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bio);
                                                                                                                                        pst.execute();
                                                                                                                                         //save chem
                                                                                                                                        String sql_che ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','233','"+exam+"','Chemistry','"+che+"','"+chemACount+"','"+chemAmCount+"','"+chemBpCount+"','"+chemBCount+"','"+chemBCount+"','"+chemCpCount+"','"+chemCCount+"','"+chemCmCount+"','"+chemDpCount+"','"+chemDCount+"','"+chemDmCount+"','"+chemECount+"','"+chemxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_che);
                                                                                                                                        pst.execute();
                                                                                                                                        //save phy
                                                                                                                                        String sql_phy ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','232','"+exam+"','Physics','"+phy+"','"+phyACount+"','"+phyAmCount+"','"+phyBpCount+"','"+phyBCount+"','"+phyBCount+"','"+phyCpCount+"','"+phyCCount+"','"+phyCmCount+"','"+phyDpCount+"','"+phyDCount+"','"+phyDmCount+"','"+phyECount+"','"+phyxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_phy);
                                                                                                                                        pst.execute();
                                                                                                                                         //save geo
                                                                                                                                        String sql_geo ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','312','"+exam+"','Geography','"+geo+"','"+geoACount+"','"+geoAmCount+"','"+geoBpCount+"','"+geoBCount+"','"+geoBCount+"','"+geoCpCount+"','"+geoCCount+"','"+geoCmCount+"','"+geoDpCount+"','"+geoDCount+"','"+geoDmCount+"','"+geoECount+"','"+geoxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_geo);
                                                                                                                                        pst.execute();
                                                                                                                                        //save his
                                                                                                                                        String sql_his ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','311','"+exam+"','History','"+his+"','"+hisACount+"','"+hisAmCount+"','"+hisBpCount+"','"+hisBCount+"','"+hisBCount+"','"+hisCpCount+"','"+hisCCount+"','"+hisCmCount+"','"+hisDpCount+"','"+hisDCount+"','"+hisDmCount+"','"+hisECount+"','"+hisxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_his);
                                                                                                                                        pst.execute();
                                                                                                                                         //save cre
                                                                                                                                        String sql_cre ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','313','"+exam+"','CRE','"+cre+"','"+creACount+"','"+creAmCount+"','"+creBpCount+"','"+creBCount+"','"+creBCount+"','"+creCpCount+"','"+creCCount+"','"+creCmCount+"','"+creDpCount+"','"+creDCount+"','"+creDmCount+"','"+creECount+"','"+crexCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_cre);
                                                                                                                                        pst.execute();
                                                                                                                                        //save agr
                                                                                                                                        String sql_agr ="INSERT INTO `analysis`(`form`, `yearr`, `term`, `scode`,`exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','443','"+exam+"','Agriculture','"+agr+"','"+agrACount+"','"+agrAmCount+"','"+agrBpCount+"','"+agrBCount+"','"+agrBCount+"','"+agrCpCount+"','"+agrCCount+"','"+agrCmCount+"','"+agrDpCount+"','"+agrDCount+"','"+agrDmCount+"','"+agrECount+"','"+agrxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_agr);
                                                                                                                                        pst.execute();
                                                                                                                                         //save bst
                                                                                                                                        String sql_bst ="INSERT INTO `analysis`(`form`, `yearr`, `term`,`scode`, `exam`, `subject`, `entry`, `A`, `Am`, `Bp`, `B`, `Bm`, `Cp`, `C`, `Cm`, `Dp`, `D`, `Dm`, `E`, `X`, `MM`) VALUES ('"+form+"','"+year+"','"+term+"','565','"+exam+"','Business Studies','"+bst+"','"+busACount+"','"+busAmCount+"','"+busBpCount+"','"+busBCount+"','"+busBCount+"','"+busCpCount+"','"+busCCount+"','"+busCmCount+"','"+busDpCount+"','"+busDCount+"','"+busDmCount+"','"+busECount+"','"+busxCount+"','')"; 
                                                                                                                                        pst = conn.prepareStatement(sql_bst);
                                                                                                                                        pst.execute();
                                                                                                                                        
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

                                        e.printStackTrace();}
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
                break;
        }
       }
    
}
