
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akash
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        studid = new javax.swing.JTextField();
        stuidlab = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        lsid = new javax.swing.JLabel();
        lnid = new javax.swing.JLabel();
        leid = new javax.swing.JLabel();
        lpid = new javax.swing.JLabel();
        lmid = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        nid = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        label.setText("STUDENT INFORMATION");

        studid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studidActionPerformed(evt);
            }
        });

        stuidlab.setText("STUDENT_ID");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        lsid.setText("Student_id");

        lnid.setText("Name");

        leid.setText("Email_id");

        lpid.setText("Password");

        lmid.setText("Mobile No.");

        sid.setEditable(false);
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        nid.setEditable(false);
        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });

        eid.setEditable(false);
        eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidActionPerformed(evt);
            }
        });

        pid.setEditable(false);

        mid.setEditable(false);
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });

        edit.setText("edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lsid)
                                    .addComponent(lnid)
                                    .addComponent(leid)
                                    .addComponent(lpid)
                                    .addComponent(lmid)
                                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(stuidlab)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pid)
                                .addComponent(mid)
                                .addComponent(sid, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(nid)
                                .addComponent(eid))
                            .addComponent(studid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stuidlab)))
                    .addComponent(label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leid)
                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lpid)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lmid)
                    .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(submit))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studidActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        int std=Integer.parseInt(studid.getText());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination","root","root");
            Statement s= c.createStatement();
            ResultSet h= s.executeQuery("select * from registration where student_id='"+std+"'");
                if(h.next()){
                     sid.setText(h.getString(1));
                     nid.setText(h.getString(2));
                     eid.setText(h.getString(3));
                     pid.setText(h.getString(4));
                     mid.setText(h.getString(5));
                }else{
                     javax.swing.JOptionPane.showMessageDialog(this, "There was an error recording your scores, please contact the administrator immediately.");
                }
                
                
           
        } catch(Exception e)
        {
javax.swing.JOptionPane.showMessageDialog(this, "Error;" + e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidActionPerformed

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        //sid.setEditable(true);
        nid.setEditable(true);
        pid.setEditable(true);
        eid.setEditable(true);
        mid.setEditable(true);
        
    }//GEN-LAST:event_editActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        int si = Integer.parseInt(sid.getText());
        String name = nid.getText();
        String email = eid.getText();
        String pass = pid.getText();
        String mob = mid.getText();
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination","root","root");
            Statement s= c.createStatement();
            int h= s.executeUpdate("update registration set name='"+name+"', email_id='"+email+"', password='"+pass+"', mobile='"+mob+"' where student_id='"+si+"'");
                if(h>0){
                     javax.swing.JOptionPane.showMessageDialog(this, "Details updated.");
                }else{
                     javax.swing.JOptionPane.showMessageDialog(this, "Details could not be updated. Please try again");
                }
        } catch(Exception e)
        {
javax.swing.JOptionPane.showMessageDialog(this, "Error;" + e);
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JTextField eid;
    private javax.swing.JLabel label;
    private javax.swing.JLabel leid;
    private javax.swing.JLabel lmid;
    private javax.swing.JLabel lnid;
    private javax.swing.JLabel lpid;
    private javax.swing.JLabel lsid;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField pid;
    private javax.swing.JButton search;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField studid;
    private javax.swing.JLabel stuidlab;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
