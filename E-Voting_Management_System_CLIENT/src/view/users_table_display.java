
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.voter;
import service.voter_Service;

/**
 *
 * @author observer
 */
public class users_table_display extends javax.swing.JFrame {

    /**
     * Creates new form test_table_display
     */
    public users_table_display() {
        initComponents();
        addColumnTable();
        retriveDataFromDbToTable();
        setLocationRelativeTo(null);
    }
    
    DefaultTableModel tableModel = new DefaultTableModel();
    byte[] imageBytes;

        private void addColumnTable(){
        tableModel.addColumn("Full name");
        tableModel.addColumn("Voter ID");
        tableModel.addColumn("Email");
	tableModel.addColumn("Contact");
	tableModel.addColumn("Username");
	tableModel.addColumn("Gender");
        tableModel.addColumn("Semester");
        tableModel.addColumn("Faculty");
        tableModel.addColumn("Department");
        tableModel.addColumn("Password");
        tableModel.addColumn("Events Coordinator");
        tableModel.addColumn("Guild President");
        tableModel.addColumn("Vice President");
        tableModel.addColumn("Info Security");
        tableModel.addColumn("Intern Students");
        
        // set table model on our table data
        allUsers_JTable.setModel(tableModel);
    }
        
    private void retriveDataFromDbToTable(){
        try{
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            voter_Service service=  (voter_Service) reg.lookup("voter"); 
            List<voter> result= service.readUsersTable();

            for(voter res:result){
                tableModel.addRow(new Object[]{
                    res.getFull_name(),
                    res.getVoter_id(),
                    res.getEmail(),
		    res.getContact(),
		    res.getUsername(),
		    res.getGender(),
                    res.getSemester(),
                    res.getFaculty(),
                    res.getDepartment(),
                    res.getPassword(),
                    res.getEvents_coordinator(),
                    res.getGuild_president(),
                    res.getVice_president(),
                    res.getInformation_security_officer(),
                    res.getInternational_student_officer(),
                    
                });
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allUsers_JTable = new javax.swing.JTable();
        idTXT = new javax.swing.JTextField();
        deleteBTN = new javax.swing.JButton();
        goBackBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(247, 251, 252));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 71, 147));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\fingerprint-logo-copy.png")); // NOI18N
        jLabel3.setText("SYSTEM CURRENT USERS");

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\SELECTION ZOOM-COPY.png")); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        allUsers_JTable.setBackground(new java.awt.Color(255, 255, 204));
        allUsers_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(allUsers_JTable);

        idTXT.setBackground(new java.awt.Color(247, 247, 240));
        idTXT.setForeground(new java.awt.Color(0, 51, 51));
        idTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTXTActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(7, 71, 147));
        deleteBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 204));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        goBackBTN.setBackground(new java.awt.Color(255, 255, 204));
        goBackBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        goBackBTN.setForeground(new java.awt.Color(7, 71, 147));
        goBackBTN.setText("Go back");
        goBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBTNActionPerformed(evt);
            }
        });

        searchBTN.setBackground(new java.awt.Color(7, 71, 147));
        searchBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        searchBTN.setForeground(new java.awt.Color(255, 255, 204));
        searchBTN.setText("SEARCH");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(goBackBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBTN)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN)
                    .addComponent(goBackBTN)
                    .addComponent(searchBTN))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTXTActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed

        String candidate_id= idTXT.getText();

        if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{

            try{

                 voter vote= new voter();
                 vote.setVoter_id(candidate_id);
                 Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                 voter_Service service=  (voter_Service) reg.lookup("voter"); 
                 int rowsAffected= service.deleteUser(vote);
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "User deleted successfully");
                            tableModel.setRowCount(0);
                            retriveDataFromDbToTable();
                            idTXT.setText("");

                }else{
                    JOptionPane.showMessageDialog(this, "Delele failed", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        }        
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void goBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBTNActionPerformed
        dispose();
    }//GEN-LAST:event_goBackBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
  String searchId = idTXT.getText();

    if (searchId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a valid Voter ID to search.", "ERROR", JOptionPane.WARNING_MESSAGE);
        return;
    }

    DefaultTableModel model = (DefaultTableModel) allUsers_JTable.getModel();
    boolean found = false;

    for (int row = 0; row < model.getRowCount(); row++) {
        String voterId = model.getValueAt(row, 1).toString();
        if (voterId.equals(searchId)) {
            // Select the row
            allUsers_JTable.setRowSelectionInterval(row, row);
            found = true;
            break;
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(this, "Voter ID not found in the table.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_searchBTNActionPerformed

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
            java.util.logging.Logger.getLogger(users_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(users_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(users_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(users_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new users_table_display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allUsers_JTable;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton goBackBTN;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBTN;
    // End of variables declaration//GEN-END:variables
}
