/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 *
 * @author $ehmi
 */
public class hostelers extends javax.swing.JFrame {
PreparedStatement pst = null;
    ResultSet rs = null;
    String sql = null;
            Connection con;
            
            private void table1_show_data() {
        try {
            String sqlString = "select regid,name,gender,category from registrations";
            pst = con.prepareStatement(sqlString);
            rs = pst.executeQuery();
            tblstudents.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            }
        private void table2_show_data() {
        try {
            String sqlString = "select * from hostels";
            pst = con.prepareStatement(sqlString);
            rs = pst.executeQuery();
            tblhostels.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        private void table3_show_data() {
        try {
            String sqlString = "select * from hostelers";
            pst = con.prepareStatement(sqlString);
            rs = pst.executeQuery();
            tblhostelers.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
        
    public Boolean check()
    {
        if (txtjoiningdate.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill The joiningdate");
           return false;
        }
        
        if (txthostelname.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this,"Fill The hostel name");
           return false;
        }
        if (txtstudentname.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this,"Fill The student name");
           return false;
        }
 
        return true;
    }

    /**
     * Creates new form students_placements
     */
    public hostelers() {
        initComponents();
        connect_db d=new connect_db();
    
        try {
            con=DriverManager.getConnection(d.Strurl,d.strUid,d.strPwd); 
        } catch (Exception e) {
        }
         table1_show_data();
        table2_show_data();
        table3_show_data();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new JPanel()
        {
            public void paintComponent(Graphics g) {
                Image img=Toolkit.getDefaultToolkit().getImage(login.class.getResource("/Images/es.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtjoiningdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudents = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblhostels = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblhostelers = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txthostelname = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btncancel = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        txtstudentname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Hostelers");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Student Name");

        txtjoiningdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtjoiningdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblstudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblstudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstudents);

        tblhostels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblhostels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhostelsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblhostels);

        tblhostelers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblhostelers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhostelersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblhostelers);

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 102));
        jLabel8.setText("hostel name");

        txthostelname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txthostelname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txthostelname.setEnabled(false);

        btnok.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transfer_left_right.png"))); // NOI18N
        btnok.setText("Save");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Hosteler Id");

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtid.setEnabled(false);

        btncancel.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/no.png"))); // NOI18N
        btncancel.setText("Cancel");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnnew.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_doc.png"))); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        txtstudentname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstudentname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtstudentname.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 102));
        jLabel10.setText("joining date");

        btnupdate.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/software_update.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setEnabled(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gnome_edit_delete.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnew)
                .addGap(18, 18, 18)
                .addComponent(btnok)
                .addGap(18, 18, 18)
                .addComponent(btnupdate)
                .addGap(18, 18, 18)
                .addComponent(btndelete)
                .addGap(18, 18, 18)
                .addComponent(btncancel)
                .addGap(303, 303, 303))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtjoiningdate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthostelname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthostelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtjoiningdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel)
                    .addComponent(btnnew)
                    .addComponent(btnok)
                    .addComponent(btnupdate)
                    .addComponent(btndelete))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblstudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentsMouseClicked
try {
            
            int row=tblstudents.getSelectedRow();
            String table_click=tblstudents.getModel().getValueAt(row, 0).toString();
            String str="select regid,name,gender from registrations where regid='"+table_click+"'";
            pst=con.prepareStatement(str);
            rs=pst.executeQuery();
            if(rs.next()){
                
                String name=rs.getString("name");
                txtstudentname.setText(name);
                table1_show_data();
            }
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e);
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_tblstudentsMouseClicked

    private void tblhostelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhostelsMouseClicked
try {
            int row = tblhostels.getSelectedRow();
            String table_click = tblhostels.getModel().getValueAt(row, 0).toString();
            String str = "select * from hostels where hostelid='" + table_click + "'";
            pst = con.prepareStatement(str);
            rs = pst.executeQuery();
            if (rs.next()) {
                
                String name = rs.getString("hostelname");
                txthostelname.setText(name);
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tblhostelsMouseClicked

    private void tblhostelersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhostelersMouseClicked
 try {
            int row = tblhostelers.getSelectedRow();
            String table_click = tblhostelers.getModel().getValueAt(row, 0).toString();
            String str = "select * from hostelers where hostelerid='" + table_click + "'";
            pst = con.prepareStatement(str);
            rs = pst.executeQuery();
            if (rs.next()) {
                String id = rs.getString("hostelerid");
                txtid.setText(id);
                String studentname = rs.getString("studentname");
                txtjoiningdate.setText(studentname);
                String hostlename = rs.getString("hostelname");
                txthostelname.setText(hostlename);
                String joiningdate= rs.getString("joiningdate");
                txtstudentname.setText(joiningdate);
                     
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }    
btnupdate.setEnabled(true); 
btndelete.setEnabled(true);
btnok.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_tblhostelersMouseClicked

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
 if (check()) {
            try {
               String strok = "insert into hostelers(studentname,hostelname,joiningdate)values('"+txtjoiningdate.getText()+"','" + txthostelname.getText() + "','" + txtstudentname.getText() + "')";

                pst = con.prepareStatement(strok);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Saved");
                txtid.setText("");
        txtjoiningdate.setText(""); 

txthostelname.setText("");

txtstudentname.setText("");

               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            } 
            table3_show_data() ;
 }
 // TODO add your handling code here:
    }//GEN-LAST:event_btnokActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
txtid.setText("");
        txtjoiningdate.setText(""); 

txthostelname.setText("");

txtstudentname.setText("");
 
 btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
btnok.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnnewActionPerformed

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
int response=JOptionPane.showConfirmDialog(null, "Do You Want To Cancel","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION) 
        {
         System.exit(1);
        }                // TODO add your handling code here:
    }//GEN-LAST:event_btncancelMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
int response=JOptionPane.showConfirmDialog(null,"Do You Want To Update The Record","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION)
        {
            try
            {
                String strupdate="update hostelers set studentname='"+txtstudentname.getText()+"',hostelname='"+txthostelname.getText()+"',joiningdate='"+txtjoiningdate.getText()+"' where hostelerid='"+txtid.getText()+"'";
                pst=con.prepareStatement(strupdate);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Record is successfully update");

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }

        } 
        txtid.setText("");
        txtjoiningdate.setText(""); 

txthostelname.setText("");

txtstudentname.setText("");
table3_show_data();
 // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

        int response=JOptionPane.showConfirmDialog(null, "Do You Want To Cancel","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION) 
        {
         this.setVisible(false);
         
        } 
        //our handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hostelers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hostelers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hostelers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hostelers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hostelers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    public javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    public javax.swing.JButton btnok;
    public javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblhostelers;
    private javax.swing.JTable tblhostels;
    private javax.swing.JTable tblstudents;
    public javax.swing.JTextField txthostelname;
    public javax.swing.JTextField txtid;
    public javax.swing.JTextField txtjoiningdate;
    public javax.swing.JTextField txtstudentname;
    // End of variables declaration//GEN-END:variables
}
