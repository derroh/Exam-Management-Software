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
public class classMG 
{
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public void getMG(String term, String year, String form, String exam)
    {
        DbConnection connect = new DbConnection();
        conn = connect.Connectdb();
        switch (exam) {
            case "CAT 1":
                     try{
                        String fm1 = "SELECT COALESCE(SUM(meangrd LIKE '%A%'),0) AS fm1A,COALESCE(SUM(meangrd LIKE '%A-%'),0) AS fm1Am, COALESCE(SUM(meangrd LIKE '%B+%'),0) AS fm1Bp,COALESCE(SUM(meangrd LIKE '%B%'),0) AS fm1B,COALESCE(SUM(meangrd LIKE '%B-%'),0) AS fm1Bm,COALESCE(SUM(meangrd LIKE '%C+%'),0) AS fm1Cp,COALESCE(SUM(meangrd LIKE '%C%'),0) AS fm1C,COALESCE(SUM(meangrd LIKE '%C-%'),0) AS fm1Cm,COALESCE(SUM(meangrd LIKE '%D+%'),0) AS fm1Dp,COALESCE(SUM(meangrd LIKE '%D%'),0) AS fm1D,COALESCE(SUM(meangrd LIKE '%D-%'),0) AS fm1Dm, COALESCE(SUM(meangrd LIKE '%E%'),0) AS fm1E, COALESCE(SUM(meangrd LIKE '%X%'),0) AS fm1X FROM `cat_one` WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(fm1);
                        while(rs.next())
                        {
                            String fm1A = rs.getString("fm1A");
                            String fm1Am = rs.getString("fm1Am");
                            String fm1Bp = rs.getString("fm1Bp");
                            String fm1B = rs.getString("fm1B");
                            String fm1Bm = rs.getString("fm1Bm");
                            String fm1Cp = rs.getString("fm1Cp");
                            String fm1C = rs.getString("fm1C");
                            String fm1Cm = rs.getString("fm1Cm");
                            String fm1Dp = rs.getString("fm1Dp");
                            String fm1D = rs.getString("fm1D");
                            String fm1Dm = rs.getString("fm1Dm");
                            String fm1E = rs.getString("fm1E");
                            String fm1X = rs.getString("fm1X");
                            try{
                                String get_m ="SELECT SUM(mean) FROM `cat_one_pts` WHERE yearr = '"+year+"' AND term = '"+term+"' AND form = '"+form+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(get_m);
                                while(rs.next())
                                {
                                    String mm = rs.getString("SUM(mean)"); //total pts found.. now lets get entry from subject selection son!
                                    try{
                                        String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '"+form+"'";
                                        stm = conn.createStatement();
                                        rs = stm.executeQuery(TOT);

                                        while(rs.next())
                                        {
                                           String count =rs.getString("COUNT(`adm`)");
                                          
                                           int meanmark = Integer.parseInt(mm)/Integer.parseInt(count);// is the number of subjects, so divide to get avg in the 11 subjects sat.. ingekua form 3/4 itakua more tricky but you can son.
                                           //JOptionPane.showMessageDialog(null, count);
                                           try{
                                               String fin = "INSERT INTO `exammg`(`form`, `yearr`, `term`, `exam`, `A`, `AM`, `BP`, `B`, `BM`, `CP`, `C`, `CM`, `DP`, `D`, `DM`, `E`, `X`, `mean`, `entry`) VALUES ('"+form+"','"+year+"','"+term+"','"+exam+"','"+fm1A+"','"+fm1Am+"','"+fm1Bp+"','"+fm1B+"','"+fm1Bm+"','"+fm1Cp+"','"+fm1C+"','"+fm1Cm+"','"+fm1Dp+"','"+fm1D+"','"+fm1Dm+"','"+fm1E+"','"+fm1X+"','"+meanmark+"', '"+count+"')";
                                                    pst = conn.prepareStatement(fin);
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
                break;
            case "CAT 2":
                 try{
                        String fm1 = "SELECT COALESCE(SUM(meangrd LIKE '%A%'),0) AS fm1A,COALESCE(SUM(meangrd LIKE '%A-%'),0) AS fm1Am, COALESCE(SUM(meangrd LIKE '%B+%'),0) AS fm1Bp,COALESCE(SUM(meangrd LIKE '%B%'),0) AS fm1B,COALESCE(SUM(meangrd LIKE '%B-%'),0) AS fm1Bm,COALESCE(SUM(meangrd LIKE '%C+%'),0) AS fm1Cp,COALESCE(SUM(meangrd LIKE '%C%'),0) AS fm1C,COALESCE(SUM(meangrd LIKE '%C-%'),0) AS fm1Cm,COALESCE(SUM(meangrd LIKE '%D+%'),0) AS fm1Dp,COALESCE(SUM(meangrd LIKE '%D%'),0) AS fm1D,COALESCE(SUM(meangrd LIKE '%D-%'),0) AS fm1Dm, COALESCE(SUM(meangrd LIKE '%E%'),0) AS fm1E, COALESCE(SUM(meangrd LIKE '%X%'),0) AS fm1X FROM `cat_two` WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(fm1);
                        while(rs.next())
                        {
                            String fm1A = rs.getString("fm1A");
                            String fm1Am = rs.getString("fm1Am");
                            String fm1Bp = rs.getString("fm1Bp");
                            String fm1B = rs.getString("fm1B");
                            String fm1Bm = rs.getString("fm1Bm");
                            String fm1Cp = rs.getString("fm1Cp");
                            String fm1C = rs.getString("fm1C");
                            String fm1Cm = rs.getString("fm1Cm");
                            String fm1Dp = rs.getString("fm1Dp");
                            String fm1D = rs.getString("fm1D");
                            String fm1Dm = rs.getString("fm1Dm");
                            String fm1E = rs.getString("fm1E");
                            String fm1X = rs.getString("fm1X");
                            try{
                                String get_m ="SELECT SUM(mean) FROM `cat_two_pts` WHERE yearr = '"+year+"' AND term = '"+term+"' AND form = '"+form+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(get_m);
                                while(rs.next())
                                {
                                    String mm = rs.getString("SUM(mean)"); //total pts found.. now lets get entry from subject selection son!
                                    try{
                                        String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '"+form+"'";
                                        stm = conn.createStatement();
                                        rs = stm.executeQuery(TOT);

                                        while(rs.next())
                                        {
                                           String count =rs.getString("COUNT(`adm`)");
                                           int meanmark = Integer.parseInt(mm)/Integer.parseInt(count);// is the number of subjects, so divide to get avg in the 11 subjects sat.. ingekua form 3/4 itakua more tricky but you can son.
                                         //  JOptionPane.showMessageDialog(null, count);
                                           try{
                                               String fin = "INSERT INTO `exammg`(`form`, `yearr`, `term`, `exam`, `A`, `AM`, `BP`, `B`, `BM`, `CP`, `C`, `CM`, `DP`, `D`, `DM`, `E`, `X`, `mean`, `entry`) VALUES ('"+form+"','"+year+"','"+term+"','"+exam+"','"+fm1A+"','"+fm1Am+"','"+fm1Bp+"','"+fm1B+"','"+fm1Bm+"','"+fm1Cp+"','"+fm1C+"','"+fm1Cm+"','"+fm1Dp+"','"+fm1D+"','"+fm1Dm+"','"+fm1E+"','"+fm1X+"','"+meanmark+"', '"+count+"')";
                                                    pst = conn.prepareStatement(fin);
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
                break;
            case "END TERM":
                 try{
                        String fm1 = "SELECT COALESCE(SUM(meangrd LIKE '%A%'),0) AS fm1A,COALESCE(SUM(meangrd LIKE '%A-%'),0) AS fm1Am, COALESCE(SUM(meangrd LIKE '%B+%'),0) AS fm1Bp,COALESCE(SUM(meangrd LIKE '%B%'),0) AS fm1B,COALESCE(SUM(meangrd LIKE '%B-%'),0) AS fm1Bm,COALESCE(SUM(meangrd LIKE '%C+%'),0) AS fm1Cp,COALESCE(SUM(meangrd LIKE '%C%'),0) AS fm1C,COALESCE(SUM(meangrd LIKE '%C-%'),0) AS fm1Cm,COALESCE(SUM(meangrd LIKE '%D+%'),0) AS fm1Dp,COALESCE(SUM(meangrd LIKE '%D%'),0) AS fm1D,COALESCE(SUM(meangrd LIKE '%D-%'),0) AS fm1Dm, COALESCE(SUM(meangrd LIKE '%E%'),0) AS fm1E, COALESCE(SUM(meangrd LIKE '%X%'),0) AS fm1X FROM `cat_three` WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(fm1);
                        while(rs.next())
                        {
                            String fm1A = rs.getString("fm1A");
                            String fm1Am = rs.getString("fm1Am");
                            String fm1Bp = rs.getString("fm1Bp");
                            String fm1B = rs.getString("fm1B");
                            String fm1Bm = rs.getString("fm1Bm");
                            String fm1Cp = rs.getString("fm1Cp");
                            String fm1C = rs.getString("fm1C");
                            String fm1Cm = rs.getString("fm1Cm");
                            String fm1Dp = rs.getString("fm1Dp");
                            String fm1D = rs.getString("fm1D");
                            String fm1Dm = rs.getString("fm1Dm");
                            String fm1E = rs.getString("fm1E");
                            String fm1X = rs.getString("fm1X");
                            try{
                                String get_m ="SELECT SUM(mean) FROM `cat_three_pts` WHERE yearr = '"+year+"' AND term = '"+term+"' AND form = '"+form+"'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(get_m);
                                while(rs.next())
                                {
                                    String mm = rs.getString("SUM(mean)"); //total pts found.. now lets get entry from subject selection son!
                                    try{
                                        String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '"+form+"'";
                                        stm = conn.createStatement();
                                        rs = stm.executeQuery(TOT);

                                        while(rs.next())
                                        {
                                           String count =rs.getString("COUNT(`adm`)");
                                           int meanmark = Integer.parseInt(mm)/Integer.parseInt(count);// is the number of subjects, so divide to get avg in the 11 subjects sat.. ingekua form 3/4 itakua more tricky but you can son.
                                          // JOptionPane.showMessageDialog(null, count);
                                           try{
                                               String fin = "INSERT INTO `exammg`(`form`, `yearr`, `term`, `exam`, `A`, `AM`, `BP`, `B`, `BM`, `CP`, `C`, `CM`, `DP`, `D`, `DM`, `E`, `X`, `mean`, `entry`) VALUES ('"+form+"','"+year+"','"+term+"','"+exam+"','"+fm1A+"','"+fm1Am+"','"+fm1Bp+"','"+fm1B+"','"+fm1Bm+"','"+fm1Cp+"','"+fm1C+"','"+fm1Cm+"','"+fm1Dp+"','"+fm1D+"','"+fm1Dm+"','"+fm1E+"','"+fm1X+"','"+meanmark+"', '"+count+"')";
                                                    pst = conn.prepareStatement(fin);
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
                break;
            case "AVERAGE":
                 try{
                    String fm1 = "SELECT COALESCE(SUM(meangrd LIKE '%A%'),0) AS fm1A,COALESCE(SUM(meangrd LIKE '%A-%'),0) AS fm1Am, COALESCE(SUM(meangrd LIKE '%B+%'),0) AS fm1Bp,COALESCE(SUM(meangrd LIKE '%B%'),0) AS fm1B,COALESCE(SUM(meangrd LIKE '%B-%'),0) AS fm1Bm,COALESCE(SUM(meangrd LIKE '%C+%'),0) AS fm1Cp,COALESCE(SUM(meangrd LIKE '%C%'),0) AS fm1C,COALESCE(SUM(meangrd LIKE '%C-%'),0) AS fm1Cm,COALESCE(SUM(meangrd LIKE '%D+%'),0) AS fm1Dp,COALESCE(SUM(meangrd LIKE '%D%'),0) AS fm1D,COALESCE(SUM(meangrd LIKE '%D-%'),0) AS fm1Dm, COALESCE(SUM(meangrd LIKE '%E%'),0) AS fm1E, COALESCE(SUM(meangrd LIKE '%X%'),0) AS fm1X FROM `cat_avg` WHERE form = '"+form+"' AND yearr = '"+year+"' AND term = '"+term+"'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(fm1);
                    while(rs.next())
                    {
                        String fm1A = rs.getString("fm1A");
                        String fm1Am = rs.getString("fm1Am");
                        String fm1Bp = rs.getString("fm1Bp");
                        String fm1B = rs.getString("fm1B");
                        String fm1Bm = rs.getString("fm1Bm");
                        String fm1Cp = rs.getString("fm1Cp");
                        String fm1C = rs.getString("fm1C");
                        String fm1Cm = rs.getString("fm1Cm");
                        String fm1Dp = rs.getString("fm1Dp");
                        String fm1D = rs.getString("fm1D");
                        String fm1Dm = rs.getString("fm1Dm");
                        String fm1E = rs.getString("fm1E");
                        String fm1X = rs.getString("fm1X");
                        try{
                            String get_m ="SELECT SUM(mean) FROM `cat_one_pts` WHERE yearr = '"+year+"' AND term = '"+term+"' AND form = '"+form+"'";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(get_m);
                            while(rs.next())
                            {
                                String mm = rs.getString("SUM(mean)"); //total pts found.. now lets get entry from subject selection son!
                                try{
                                    String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '"+form+"'";
                                    stm = conn.createStatement();
                                    rs = stm.executeQuery(TOT);

                                    while(rs.next())
                                    {
                                       String count =rs.getString("COUNT(`adm`)");
                                       int meanmark = Integer.parseInt(mm)/Integer.parseInt(count);;// is the number of subjects, so divide to get avg in the 11 subjects sat.. ingekua form 3/4 itakua more tricky but you can son.
                                       //JOptionPane.showMessageDialog(null, count);
                                       try{
                                           String fin = "INSERT INTO `exammg`(`form`, `yearr`, `term`, `exam`, `A`, `AM`, `BP`, `B`, `BM`, `CP`, `C`, `CM`, `DP`, `D`, `DM`, `E`, `X`, `mean`, `entry`) VALUES ('"+form+"','"+year+"','"+term+"','"+exam+"','"+fm1A+"','"+fm1Am+"','"+fm1Bp+"','"+fm1B+"','"+fm1Bm+"','"+fm1Cp+"','"+fm1C+"','"+fm1Cm+"','"+fm1Dp+"','"+fm1D+"','"+fm1Dm+"','"+fm1E+"','"+fm1X+"','"+meanmark+"', '"+count+"')";
                                                pst = conn.prepareStatement(fin);
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
                break;
        }
    }
    
}
