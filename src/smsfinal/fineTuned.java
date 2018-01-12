/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DERRICK
 */
public class fineTuned extends javax.swing.JDialog {
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection conn = null;
    /**
     * Creates new form fineTuned
     */
    public fineTuned(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        iconMethod();
        getCounts();
        houses();
        form1();
        form2();
        form3();
        form4();
    }
    public void iconMethod()
    {
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("students.png")));
    }
    public void getCounts()
    {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        
        try{
            String chst ="SELECT COUNT(`Relig`) FROM `new_student` WHERE `Relig`= 'Christian';";
            stm = conn.createStatement();
            rs = stm.executeQuery(chst);
            
            while(rs.next())
            {
                txt_christians.setText(rs.getString("COUNT(`Relig`)"));
                try{
                    String musl ="SELECT COUNT(`Relig`) FROM `new_student` WHERE `Relig`= 'Muslim';";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(musl);

                    while(rs.next())
                    {
                        txt_muslim.setText(rs.getString("COUNT(`Relig`)"));//
                        try{
                            String males ="SELECT COUNT(`gen`) FROM `new_student` WHERE  `gen` = 'Male';";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(males);

                            while(rs.next())
                            {
                                txt_males.setText(rs.getString("COUNT(`gen`)"));//SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO';
                                try{
                                    String females ="SELECT COUNT(`gen`) FROM `new_student` WHERE  `gen` = 'Female';";
                                    stm = conn.createStatement();
                                    rs = stm.executeQuery(females);

                                    while(rs.next())
                                    {
                                        txt_females.setText(rs.getString("COUNT(`gen`)"));//
                                        try{
                                            String dis_male ="SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO' AND gen = 'Male';";
                                            stm = conn.createStatement();
                                            rs = stm.executeQuery(dis_male);

                                            while(rs.next())
                                            {
                                                txtdis_male.setText(rs.getString("COUNT(`disability`)"));//SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO';
                                                try{
                                                    String dis_fem ="SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO' AND gen = 'Female';";
                                                    stm = conn.createStatement();
                                                    rs = stm.executeQuery(dis_fem);

                                                    while(rs.next())
                                                    {
                                                        txtdis_female.setText(rs.getString("COUNT(`disability`)"));//SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO';
                                                           try{
                                                                String kcpe_male ="SELECT COUNT(`kcpe`) FROM `new_student` WHERE `gen` = 'Male' AND `kcpe` > 350 ";
                                                                stm = conn.createStatement();
                                                                rs = stm.executeQuery(kcpe_male);

                                                                while(rs.next())
                                                                {
                                                                    txtkcpe_male.setText(rs.getString("COUNT(`kcpe`)"));//SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO';
                                                                    try{
                                                                        String kcpe_female ="SELECT COUNT(`kcpe`) FROM `new_student` WHERE `gen` = 'Female' AND `kcpe` > 350 ";
                                                                        stm = conn.createStatement();
                                                                        rs = stm.executeQuery(kcpe_female);

                                                                        while(rs.next())
                                                                        {
                                                                            txtkcpe_female.setText(rs.getString("COUNT(`kcpe`)"));//SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO';
                                                                            try{
                                                                                String total ="SELECT COUNT(`adm`) FROM `new_student` ";
                                                                                stm = conn.createStatement();
                                                                                rs = stm.executeQuery(total);

                                                                                while(rs.next())
                                                                                {
                                                                                    txt_total.setText(rs.getString("COUNT(`adm`)"));//SELECT COUNT(`disability`) FROM `new_student` WHERE `disability`= 'NO';

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
    public void houses()
    {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        try{
            String alk ="SELECT COUNT(`house`) FROM `new_student` WHERE `house` = 'House 1'";
            stm = conn.createStatement();
            rs = stm.executeQuery(alk);

            while(rs.next())
            {
                hse1.setText(rs.getString("COUNT(`house`)"));
                try{
                    String bst ="SELECT COUNT(`house`) FROM `new_student` WHERE `house` = 'House 2'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(bst);

                    while(rs.next())
                    {
                        hse2.setText(rs.getString("COUNT(`house`)"));
                        try{
                            String sud ="SELECT COUNT(`house`) FROM `new_student` WHERE `house` = 'House 3'";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(sud);

                            while(rs.next())
                            {
                                hse3.setText(rs.getString("COUNT(`house`)"));
                                try{
                                    String mug ="SELECT COUNT(`house`) FROM `new_student` WHERE `house` = 'House 4'";
                                    stm = conn.createStatement();
                                    rs = stm.executeQuery(mug);

                                    while(rs.next())
                                    {
                                        hse4.setText(rs.getString("COUNT(`house`)"));
                                        
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
    
    
    ////////////////////
    public void form1()
    {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        try{
            String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '1'";
            stm = conn.createStatement();
            rs = stm.executeQuery(TOT);

            while(rs.next())
            {
                f1_total.setText(rs.getString("COUNT(`adm`)"));
                  try{
                        String f_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '1' AND gen = 'Female'";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(f_tot);

                        while(rs.next())
                        {
                            f1fem_tot.setText(rs.getString("COUNT(`adm`)"));
                             try{
                                String m_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '1' AND gen = 'Male'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(m_tot);

                                while(rs.next())
                                {
                                    f1male_tot.setText(rs.getString("COUNT(`adm`)"));

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
    /////////
     public void form2()
    {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        try{
            String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '2'";
            stm = conn.createStatement();
            rs = stm.executeQuery(TOT);

            while(rs.next())
            {
                f2_total.setText(rs.getString("COUNT(`adm`)"));
                try{
                        String f_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '2' AND gen = 'Female'";
                        stm = conn.createStatement();
                        rs = stm.executeQuery(f_tot);

                        while(rs.next())
                        {
                            f2fem_tot.setText(rs.getString("COUNT(`adm`)"));
                             try{
                                String m_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '2' AND gen = 'Male'";
                                stm = conn.createStatement();
                                rs = stm.executeQuery(m_tot);

                                while(rs.next())
                                {
                                    f2male_tot.setText(rs.getString("COUNT(`adm`)"));

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
         public void form3()
    {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        try{
            String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '3'";
            stm = conn.createStatement();
            rs = stm.executeQuery(TOT);

            while(rs.next())
            {
                f3_total.setText(rs.getString("COUNT(`adm`)"));
                try{
                    String f_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '3' AND gen = 'Female'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(f_tot);

                    while(rs.next())
                    {
                        f3fem_tot.setText(rs.getString("COUNT(`adm`)"));
                         try{
                            String m_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '3' AND gen = 'Male'";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(m_tot);

                            while(rs.next())
                            {
                                f3male_tot.setText(rs.getString("COUNT(`adm`)"));

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
    /////////
     public void form4()
    {
        DbConnection Connect = new DbConnection();
        conn = Connect.Connectdb();
        try{
            String TOT ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '4'";
            stm = conn.createStatement();
            rs = stm.executeQuery(TOT);

            while(rs.next())
            {
                f4_total.setText(rs.getString("COUNT(`adm`)"));
                try{
                    String f_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '4' AND gen = 'Female'";
                    stm = conn.createStatement();
                    rs = stm.executeQuery(f_tot);

                    while(rs.next())
                    {
                        f4fem_tot.setText(rs.getString("COUNT(`adm`)"));
                         try{
                            String m_tot ="SELECT COUNT(`adm`) FROM `new_student` WHERE `form` = '4' AND gen = 'Male'";
                            stm = conn.createStatement();
                            rs = stm.executeQuery(m_tot);

                            while(rs.next())
                            {
                                f4male_tot.setText(rs.getString("COUNT(`adm`)"));

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
    /////////
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_muslim = new javax.swing.JTextField();
        txt_christians = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtkcpe_female = new javax.swing.JTextField();
        txtkcpe_male = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtdis_male = new javax.swing.JTextField();
        txtdis_female = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_males = new javax.swing.JTextField();
        txt_females = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        hse3 = new javax.swing.JTextField();
        hse1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        hse2 = new javax.swing.JTextField();
        hse4 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        f1_total = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        f1fem_tot = new javax.swing.JTextField();
        f1male_tot = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        f2_total = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        f2fem_tot = new javax.swing.JTextField();
        f2male_tot = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        f3_total = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        f3fem_tot = new javax.swing.JTextField();
        f3male_tot = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        f4_total = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        f4male_tot = new javax.swing.JTextField();
        f4fem_tot = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of students by religion"));

        jLabel1.setText("Christians:");

        jLabel2.setText("Muslims:");

        txt_muslim.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt_muslim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_muslimKeyTyped(evt);
            }
        });

        txt_christians.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt_christians.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_christiansKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_muslim)
                    .addComponent(txt_christians, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_christians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_muslim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of students with over 350 KCPE marks"));

        jLabel10.setText("Male:");

        txtkcpe_female.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtkcpe_female.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkcpe_femaleKeyTyped(evt);
            }
        });

        txtkcpe_male.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtkcpe_male.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkcpe_maleKeyTyped(evt);
            }
        });

        jLabel11.setText("Female:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtkcpe_female)
                    .addComponent(txtkcpe_male, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtkcpe_male, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtkcpe_female, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of students with disabilities"));

        jLabel9.setText("Female:");

        txtdis_male.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtdis_male.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdis_maleKeyTyped(evt);
            }
        });

        txtdis_female.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtdis_female.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdis_femaleKeyTyped(evt);
            }
        });

        jLabel8.setText("Male:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdis_female)
                    .addComponent(txtdis_male, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdis_male, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtdis_female, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of students by gender"));

        txt_males.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt_males.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_malesKeyTyped(evt);
            }
        });

        txt_females.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txt_females.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_femalesKeyTyped(evt);
            }
        });

        jLabel5.setText("Male:");

        jLabel6.setText("Female:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_females)
                    .addComponent(txt_males, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_males, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_females, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/management_pyramid.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/management_close.png"))); // NOI18N
        jLabel12.setToolTipText("Close");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        txt_total.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel3.setText("Total Student population:");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of students per house"));

        hse3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        hse1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel39.setText("House 4:");

        jLabel38.setText("House 3:");

        jLabel36.setText("House 1:");

        hse2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        hse4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel37.setText("House 2:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hse1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(hse2)
                    .addComponent(hse3)
                    .addComponent(hse4))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(hse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(hse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(hse3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(hse4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/loader.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46)
                        .addGap(65, 65, 65))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Student data", jPanel5);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Form 1"));

        f1_total.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel17.setText("Total:");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel47.setText("Male:");

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel48.setText("Female:");

        f1fem_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        f1male_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        f1male_tot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1male_totActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1fem_tot, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(f1_total)
                    .addComponent(f1male_tot))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1male_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(f1fem_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(f1_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Form 2"));

        f2_total.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel23.setText("Total:");

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel49.setText("Male:");

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel51.setText("Female:");

        f2fem_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        f2male_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f2_total, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(f2male_tot)
                            .addComponent(f2fem_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f2male_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f2fem_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f2_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Form 3"));

        f3_total.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel29.setText("Total:");

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel53.setText("Male:");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel54.setText("Female:");

        f3fem_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        f3male_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f3male_tot)
                    .addComponent(f3fem_tot)
                    .addComponent(f3_total, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f3male_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(f3fem_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(f3_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Form 4"));

        f4_total.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel35.setText("Total:");

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel56.setText("Male:");

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel57.setText("Female:");

        f4male_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        f4fem_tot.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f4_total)
                    .addComponent(f4fem_tot)
                    .addComponent(f4male_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f4male_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(f4fem_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(f4_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/preferences_system_power_management_002.png"))); // NOI18N
        jLabel59.setToolTipText("Above is a list of classroom details");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel59))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(106, 106, 106)
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Class", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_christiansKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_christiansKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_christiansKeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void txt_muslimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_muslimKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_muslimKeyTyped

    private void txt_malesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_malesKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_malesKeyTyped

    private void txt_femalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_femalesKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_femalesKeyTyped

    private void txtdis_maleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdis_maleKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtdis_maleKeyTyped

    private void txtdis_femaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdis_femaleKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtdis_femaleKeyTyped

    private void txtkcpe_maleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkcpe_maleKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtkcpe_maleKeyTyped

    private void txtkcpe_femaleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkcpe_femaleKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }else if((Character.isDigit(c)|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_BACK_SPACE)
        {
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtkcpe_femaleKeyTyped

    private void f1male_totActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1male_totActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f1male_totActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fineTuned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fineTuned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fineTuned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fineTuned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fineTuned dialog = new fineTuned(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField f1_total;
    private javax.swing.JTextField f1fem_tot;
    private javax.swing.JTextField f1male_tot;
    private javax.swing.JTextField f2_total;
    private javax.swing.JTextField f2fem_tot;
    private javax.swing.JTextField f2male_tot;
    private javax.swing.JTextField f3_total;
    private javax.swing.JTextField f3fem_tot;
    private javax.swing.JTextField f3male_tot;
    private javax.swing.JTextField f4_total;
    private javax.swing.JTextField f4fem_tot;
    private javax.swing.JTextField f4male_tot;
    private javax.swing.JTextField hse1;
    private javax.swing.JTextField hse2;
    private javax.swing.JTextField hse3;
    private javax.swing.JTextField hse4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_christians;
    private javax.swing.JTextField txt_females;
    private javax.swing.JTextField txt_males;
    private javax.swing.JTextField txt_muslim;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txtdis_female;
    private javax.swing.JTextField txtdis_male;
    private javax.swing.JTextField txtkcpe_female;
    private javax.swing.JTextField txtkcpe_male;
    // End of variables declaration//GEN-END:variables
}
