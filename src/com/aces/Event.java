

package com.aces;
import java.sql.Connection;
import javax.swing.JOptionPane;
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
public class Event extends javax.swing.JFrame {
PreparedStatement pst = null;
    ResultSet rs = null;
    String sql = null;
    Connection con;
    private void show_data() {
        try {
            String sqlString = "select * from events";
            pst = con.prepareStatement(sqlString);
            rs = pst.executeQuery();
            tbstudent.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public Boolean check()
    {
        if (txtname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill The Name");
           return false;
        }
        if (txtstartingdate.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this,"Fill Starting Date");
           return false;
        }
        if (txtenddate.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(this,"Fill Ending Date");
            return false;
        }
        if (txtactivites.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill Activites ");
            return false;
           }
       
        try {
            String sql="select name from events where name='"+txtactivites.getText()+"' ";
            pst=con.prepareStatement(sql);
            pst.execute();
            rs=pst.executeQuery();
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(this, "This name Already Exit In Database");
                return false;     }
            
        } 
        catch (Exception e) {
        }
        return true;
    }

    /**
     * Creates new form students_records
     */
    public Event() {
        initComponents();
         connect_db d = new connect_db();

        try {
            con = DriverManager.getConnection(d.Strurl, d.strUid, d.strPwd);

        } catch (Exception e) {
            e.printStackTrace();
        }
        show_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel()  {
            public void paintComponent(Graphics g) {
                Image img=Toolkit.getDefaultToolkit().getImage(students_records.class.getResource("/Images/10.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtf = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtstartingdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtenddate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtactivites = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndalete = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbstudent = new javax.swing.JTable();
        txtmanageby = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Event Management");

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Event Id");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtid.setEnabled(false);

        txtf.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        txtf.setForeground(new java.awt.Color(255, 255, 153));
        txtf.setText("Event Name");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Starting Date");

        txtstartingdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstartingdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Ending Date");

        txtenddate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtenddate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("Managed By");

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setText("Activites");

        txtactivites.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtactivites.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnsave.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sync_disk.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/software_update.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setEnabled(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndalete.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btndalete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gnome_edit_delete.png"))); // NOI18N
        btndalete.setText("Delete");
        btndalete.setEnabled(false);
        btndalete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaleteActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gnome_application_exit.png"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_doc.png"))); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbstudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tbstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbstudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbstudent);

        txtmanageby.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmanageby.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtf)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstartingdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtenddate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtactivites, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanageby, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsave)
                .addGap(18, 18, 18)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndalete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnexit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstartingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtenddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtmanageby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtactivites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndalete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if (check()) {
            try {

                String strsave = "insert into events(name,startingdate,endingdate,managedby,activites)values('" + txtname.getText() + "','" + txtstartingdate.getText() + "','" + txtenddate.getText() + "','"+txtmanageby.getText()+"','" + txtactivites.getText() + "')";

                pst = con.prepareStatement(strsave);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Saved");
                txtid.setText("");
        txtname.setText("");
        txtstartingdate.setText("");
        txtenddate.setText("");
        txtactivites.setText("");
        txtmanageby.setText("");
        
                show_data();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        //d your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int response=JOptionPane.showConfirmDialog(null,"Do You Want To Update The Record","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION)
        {
            try
            {
                String strupdate="update events set name='"+txtname.getText()+"', startingdate='"+txtstartingdate.getText()+"',endingdate='"+txtenddate.getText()+"',activites='"+txtactivites.getText()+"' where eventid='"+txtid.getText()+"'";
                pst=con.prepareStatement(strupdate);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Record is successfully update");
                txtid.setText("");
        txtname.setText("");
        txtstartingdate.setText("");
        txtenddate.setText("");
        txtactivites.setText("");
       
                show_data();

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndaleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaleteActionPerformed
        int response=JOptionPane.showConfirmDialog(null,"Do You To Delete The Data","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION) {
            try {
                String strdelete = "delete from events where eventid='" + txtid.getText() + "'";
                pst = con.prepareStatement(strdelete);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Record delete successfully");
                txtid.setText("");
                txtname.setText("");
                txtstartingdate.setText("");
                txtenddate.setText("");
                txtactivites.setText("");
               
                show_data();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(this,e);
            }

        }
        // TODO add your handling code here        // TODO add your handling code here:
    }//GEN-LAST:event_btndaleteActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
int response=JOptionPane.showConfirmDialog(null, "Do You Want To Exit","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION) 
        {
        this.setVisible(false);
        
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
txtid.setText("");
        txtname.setText("");
        txtstartingdate.setText("");
        txtenddate.setText("");
        txtactivites.setText("");
        
       btnupdate.setEnabled(false);
        btndalete.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbstudentMouseClicked
btnupdate.setEnabled(true);
        btndalete.setEnabled(true);
        try {
            int row = tbstudent.getSelectedRow();
            String table_click = tbstudent.getModel().getValueAt(row, 0).toString();
            String str = "select * from events where eventid='" + table_click + "'";
            pst = con.prepareStatement(str);
            rs = pst.executeQuery();
            if (rs.next()) {
                String id = rs.getString("eventid");
                txtid.setText(id);
                String name = rs.getString("name");
                txtname.setText(name);
                String manageby=rs.getString("managedby");
                txtmanageby.setText(manageby);
                String startdate = rs.getString("startingdate");
                txtstartingdate.setText(startdate);
                String enddate = rs.getString("endingdate");
                txtenddate.setText(enddate);
                
                String activity = rs.getString("activites");
                txtactivites.setText(activity);
              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tbstudentMouseClicked

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
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndalete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbstudent;
    private javax.swing.JTextField txtactivites;
    private javax.swing.JTextField txtenddate;
    private javax.swing.JLabel txtf;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmanageby;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstartingdate;
    // End of variables declaration//GEN-END:variables
}
