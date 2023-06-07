/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author observer
 */
public class ADMIN_dashboard_BACKUP extends javax.swing.JFrame {

    /**
     * Creates new form test_vote_dashboard
     */
    public ADMIN_dashboard_BACKUP() {

        initComponents();
        setLocationRelativeTo(null);
        
    }
    private String db_url="jdbc:mysql://localhost:3306/election_management_system";
    private String db_username="root";
    private String db_passwd ="1234";
    byte[] imageBytes;

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidateTABLE = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTABLE = new javax.swing.JTable();
        idTXT = new javax.swing.JTextField();
        descriptionTXT = new javax.swing.JTextField();
        nameTXT = new javax.swing.JTextField();
        positionTXT = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoutBTN = new javax.swing.JButton();
        imageBTN = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(7, 71, 147));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("ADMINISTRATOR DASHBOARD");
        jButton1.setAlignmentY(0.0F);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candidate Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(7, 71, 147))); // NOI18N

        candidateTABLE.setBackground(new java.awt.Color(255, 255, 204));
        candidateTABLE.setForeground(new java.awt.Color(0, 51, 51));
        candidateTABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        candidateTABLE.setCellSelectionEnabled(true);
        candidateTABLE.setGridColor(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(candidateTABLE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Voters Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(7, 71, 147))); // NOI18N

        usersTABLE.setBackground(new java.awt.Color(255, 255, 204));
        usersTABLE.setForeground(new java.awt.Color(0, 51, 51));
        usersTABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        usersTABLE.setGridColor(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(usersTABLE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        idTXT.setBackground(new java.awt.Color(247, 247, 240));
        idTXT.setForeground(new java.awt.Color(0, 51, 51));
        idTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTXTActionPerformed(evt);
            }
        });

        descriptionTXT.setBackground(new java.awt.Color(247, 247, 240));
        descriptionTXT.setForeground(new java.awt.Color(0, 51, 51));
        descriptionTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTXTActionPerformed(evt);
            }
        });

        nameTXT.setBackground(new java.awt.Color(247, 247, 240));
        nameTXT.setForeground(new java.awt.Color(0, 51, 51));
        nameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXTActionPerformed(evt);
            }
        });

        positionTXT.setBackground(new java.awt.Color(247, 247, 240));
        positionTXT.setForeground(new java.awt.Color(0, 51, 51));
        positionTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionTXTActionPerformed(evt);
            }
        });

        saveBTN.setBackground(new java.awt.Color(7, 71, 147));
        saveBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBTN.setForeground(new java.awt.Color(255, 255, 204));
        saveBTN.setText("SAVE");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(7, 71, 147));
        updateBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 204));
        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(7, 71, 147));
        deleteBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 204));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 71, 147));
        jLabel1.setText("CANDIDATE INFORMATION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 71, 147));
        jLabel2.setText("Candidate ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 71, 147));
        jLabel3.setText("Candidate name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 71, 147));
        jLabel4.setText("Candidate Position:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 71, 147));
        jLabel5.setText("Description:");

        logoutBTN.setBackground(new java.awt.Color(7, 71, 147));
        logoutBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutBTN.setForeground(new java.awt.Color(255, 255, 204));
        logoutBTN.setText("LOGOUT");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        imageBTN.setBackground(new java.awt.Color(247, 247, 240));
        imageBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        imageBTN.setForeground(new java.awt.Color(0, 51, 51));
        imageBTN.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\3129644-2222.png")); // NOI18N
        imageBTN.setText("Image file");
        imageBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 71, 147));
        jLabel6.setText("Import Image:");

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\AUCA-logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutBTN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imageBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(positionTXT)
                                    .addComponent(nameTXT)
                                    .addComponent(idTXT)
                                    .addComponent(descriptionTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 103, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(positionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imageBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBTN)
                            .addComponent(updateBTN)
                            .addComponent(deleteBTN)
                            .addComponent(logoutBTN)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTXTActionPerformed

    private void descriptionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTXTActionPerformed

    private void nameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXTActionPerformed

    private void positionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTXTActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed

        String candidate_id= idTXT.getText();
        String candidate_name= nameTXT.getText();
        String position= positionTXT.getText();
        String description= descriptionTXT.getText();

        if(candidate_id.trim().isEmpty() ||
            candidate_name.trim().isEmpty() ||
            position.trim().isEmpty() ||
            description.trim().isEmpty()){

            JOptionPane.showMessageDialog(this, "Some fields are still empty!", "Data required", JOptionPane.WARNING_MESSAGE);
        }else if(imageBytes==null){
            JOptionPane.showMessageDialog(this, "Provide candidate profile picture", "Data required", JOptionPane.WARNING_MESSAGE);

        }else if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{

            try{

                Connection con=DriverManager.getConnection(db_url, db_username, db_passwd);
                String query="insert into candidate_ems(candidate_id,full_name,position,description,image) values(?,?,?,?,?)";
                PreparedStatement pst= con.prepareStatement(query);
                pst.setString(1, candidate_id);
                pst.setString(2, candidate_name);
                pst.setString(3, position);
                pst.setString(4, description);
                pst.setBytes(5, imageBytes);

                int rowsAffected= pst.executeUpdate();

                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                    dispose();
                    Admin_Dashboard dashboard= new Admin_Dashboard();
                    dashboard.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }

                con.close();

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed

        String candidate_id= idTXT.getText();
        String candidate_name= nameTXT.getText();
        String position= positionTXT.getText();
        String description= descriptionTXT.getText();

        if(candidate_id.trim().isEmpty() ||
            candidate_name.trim().isEmpty() ||
            position.trim().isEmpty() ||
            description.trim().isEmpty()){

            JOptionPane.showMessageDialog(this, "Some fields are still empty!", "Data required", JOptionPane.WARNING_MESSAGE);
        }else if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{

            try{
                Connection con= DriverManager.getConnection(db_url, db_username, db_passwd);
                String query="update candidate_ems set full_name=?, position=?, description=? where candidate_id=?";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setString(1,candidate_name);
                pst.setString(2, position);
                pst.setString(3, description);
                pst.setString(4, candidate_id);

                int rowsAffected= pst.executeUpdate();
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate updated successfully");
                    dispose();
                    Admin_Dashboard dashboard= new Admin_Dashboard();
                    dashboard.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Update failed", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed

        String candidate_id= idTXT.getText();
        String candidate_name= nameTXT.getText();
        String position= positionTXT.getText();
        String description= descriptionTXT.getText();

        if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{

            try{
                Connection con= DriverManager.getConnection(db_url, db_username, db_passwd);
                String query="delete from candidate_ems where candidate_id=?";
                PreparedStatement pst= con.prepareStatement(query);
                pst.setString(1, candidate_id);
                int rowsAffected= pst.executeUpdate();
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate deleted successfully");
                    dispose();
                    Admin_Dashboard dashboard= new Admin_Dashboard();
                    dashboard.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Delele failed", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_deleteBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        dispose();
        LOGIN_PAGE login= new LOGIN_PAGE();
        login.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void imageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageBTNActionPerformed

        File selectedFile=null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        selectedFile = fileChooser.getSelectedFile();

        /*if(selectedFile==null){
            JOptionPane.showMessageDialog(this, "Image not imported");
        }else{
            JOptionPane.showMessageDialog(this, "Image imported successfully");
        }*/

        try {
            // Convert the selected file to an icon
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = icon.getImage();
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            bufferedImage.getGraphics().drawImage(image, 0, 0, null);

            // Convert the icon to a byte array
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
            imageBytes = byteArrayOutputStream.toByteArray();

            // Set the image bytes to >>byte[] imageBytes; variable
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            /*if(imageBytes==null){
                JOptionPane.showMessageDialog(this, "Image not imported");
            }else{
                JOptionPane.showMessageDialog(this, "Image imported successfully");
            } */

            // Close the resources
            byteArrayOutputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_imageBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ADMIN_dashboard_BACKUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMIN_dashboard_BACKUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMIN_dashboard_BACKUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN_dashboard_BACKUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN_dashboard_BACKUP().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable candidateTABLE;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField descriptionTXT;
    private javax.swing.JTextField idTXT;
    private javax.swing.JToggleButton imageBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JTextField positionTXT;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    private javax.swing.JTable usersTABLE;
    // End of variables declaration//GEN-END:variables
}
