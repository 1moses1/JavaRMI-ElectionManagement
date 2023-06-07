
package view;

import java.sql.*;
import java.awt.*;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import model.vice_president;
import model.voter;
import service.vice_president_Service;


public class vice_President extends javax.swing.JFrame {


    byte[] imageBytes;
    String login_input= LOGIN_PAGE.getLogin_input();

    
    public vice_President() {
        initComponents();
        textFields();
        assignItemsComboBox();
        setLocationRelativeTo(null);
    }
    
        public void textFields(){
        //idTXT.setText("U rwanda rwejo");
        
        idTXT.setEditable(false);
        nameTXT.setEditable(false);
        positionTXT.setEditable(false);
        descriptionTXT.setEditable(false);
        voterIDTXT.setEditable(false);
        voterIDTXT.setText(login_input);
    }
        
        public void assignItemsComboBox() {
                try {
                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                    vice_president_Service service=  (vice_president_Service) reg.lookup("vice_president");
                    List<String> rs = service.VP_assignFullNameTOComboBox();

                    for (String vp : rs) {
                        full_nameComboBox.addItem(vp);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

          
          
          


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        full_nameComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        candidate_image = new javax.swing.JLabel();
        idTXT = new javax.swing.JTextField();
        nameTXT = new javax.swing.JTextField();
        positionTXT = new javax.swing.JTextField();
        descriptionTXT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        voteBTN = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        voterIDTXT = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        goBackBTN = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        logOutBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(247, 251, 252));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(7, 71, 147));
        jLabel10.setText("CANDIDATE'S CRITERION:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(50, 111, 180));
        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\Black_CirclING.png")); // NOI18N
        jLabel14.setText("Campaign platform");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 111, 180));
        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\Black_CirclING.png")); // NOI18N
        jLabel12.setText("Good academic standing");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 111, 180));
        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\Black_CirclING.png")); // NOI18N
        jLabel11.setText("Registered student");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 111, 180));
        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\Black_CirclING.png")); // NOI18N
        jLabel13.setText("Personal qualities");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 71, 147));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\fingerprint-logo-copy.png")); // NOI18N
        jLabel3.setText(" VOTE \"VICE PRESIDENT\"");

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\SELECTION ZOOM-COPY.png")); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(jLabel15))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        full_nameComboBox.setBackground(new java.awt.Color(50, 111, 180));
        full_nameComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        full_nameComboBox.setForeground(new java.awt.Color(255, 255, 153));
        full_nameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_nameComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 71, 147));
        jLabel7.setText("CHOOSE YOUR CANDIDATE");

        jPanel1.setBackground(new java.awt.Color(248, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 71, 147));
        jLabel1.setText("CANDIDATE INFORMATION");

        candidate_image.setBackground(new java.awt.Color(230, 255, 255));
        candidate_image.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        candidate_image.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(7, 71, 147));
        jLabel8.setText("Description:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 71, 147));
        jLabel5.setText("Candidate Position:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 71, 147));
        jLabel4.setText("Candidate name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 71, 147));
        jLabel2.setText("Candidate ID:");

        voteBTN.setBackground(new java.awt.Color(7, 71, 147));
        voteBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        voteBTN.setForeground(new java.awt.Color(255, 255, 204));
        voteBTN.setText("VOTE");
        voteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteBTNActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(7, 71, 147));
        jLabel16.setText("Voter profile:");

        voterIDTXT.setBackground(new java.awt.Color(250, 239, 245));
        voterIDTXT.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        voterIDTXT.setForeground(new java.awt.Color(7, 71, 147));
        voterIDTXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voterIDTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(candidate_image)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(voterIDTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(positionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(candidate_image))
                .addGap(36, 36, 36)
                .addComponent(voteBTN)
                .addGap(119, 119, 119))
        );

        goBackBTN.setBackground(new java.awt.Color(7, 71, 147));
        goBackBTN.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        goBackBTN.setForeground(new java.awt.Color(255, 255, 204));
        goBackBTN.setText("Go back");
        goBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBTNActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(7, 71, 147));
        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\auca-logo circle-copy.png")); // NOI18N
        jLabel17.setText("2022-2023");

        logOutBTN.setBackground(new java.awt.Color(7, 71, 147));
        logOutBTN.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        logOutBTN.setForeground(new java.awt.Color(255, 255, 204));
        logOutBTN.setText("Log out");
        logOutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(full_nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(goBackBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logOutBTN)))
                        .addGap(46, 46, 46))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(full_nameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackBTN)
                    .addComponent(logOutBTN))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String selectedItem;
    private void full_nameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_nameComboBoxActionPerformed
        full_nameComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                selectedItem = (String) full_nameComboBox.getSelectedItem();
                
                vice_president cndt= new vice_president();
                cndt.setFull_name(selectedItem);
            for (int i = 0; i < full_nameComboBox.getItemCount(); i++) {
                if (selectedItem.equals(full_nameComboBox.getItemAt(i))) {
                // do something based on the selected item
                
                try {
                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                    vice_president_Service service=  (vice_president_Service) reg.lookup("vice_president");
                    List<vice_president> result0 = service.VP_full_nameComboBoxActionPerformed(cndt);

                    for (vice_president vp : result0) {
                        idTXT.setText(vp.getCandidate_id());
                        nameTXT.setText(vp.getFull_name());
                        positionTXT.setText(vp.getPosition());
                        descriptionTXT.setText(vp.getDescription());

                        // Convert the image data to a BufferedImage
                            byte[] imageBytes = vp.getImage();
                            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                            BufferedImage image = ImageIO.read(bais);

                        // Set the image on the label
                        ImageIcon icon = new ImageIcon(image);
                        candidate_image.setIcon(icon);

                        //bis.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


                break; // exit the loop once a match is found
                }
            }
            }
            });
    }//GEN-LAST:event_full_nameComboBoxActionPerformed

    private void goBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBTNActionPerformed
        dispose();
        user_homepage user_homepage= new user_homepage();
        user_homepage.setVisible(true);
    }//GEN-LAST:event_goBackBTNActionPerformed

    private void voteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteBTNActionPerformed
        selectedItem = (String) full_nameComboBox.getSelectedItem();
        String id =idTXT.getText();
        int intId = Integer.parseInt(id);
        String voter_Profile= voterIDTXT.getText();
        voter voter= new voter();
        voter.setUsername(voter_Profile);
        voter.setVoter_id(voter_Profile);
        vice_president cndt= new vice_president();
        cndt.setCandidate_id(id);
        cndt.setFull_name(selectedItem);
        
        if(voterIDTXT.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "To continue voting, provide your ID", "Missing fields", JOptionPane.INFORMATION_MESSAGE);
        }else{
        try {
                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                    vice_president_Service service=  (vice_president_Service) reg.lookup("vice_president");

    if (service.CHECK_IF_VP_NULL(voter)== true) {
        try {
            int rowsAffected = service.VP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(cndt);

            if (rowsAffected >= 1) {
                try {
                    int rowAffected = service.VP_voteBTN_ADD_VOTER_VOTING_STATUS(cndt, voter);

                    if (rowAffected >= 1) {
                        JOptionPane.showMessageDialog(this, "Your vote reserved successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        user_homepage homepage = new user_homepage();
                        homepage.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Casting vote failed", "Failure", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Casting vote failed", "Failure", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "You are only allowed to vote once", "Failure", JOptionPane.ERROR_MESSAGE);
    }
} catch (Exception e) {
    e.printStackTrace();
}
       
              
        }
        

        
    }//GEN-LAST:event_voteBTNActionPerformed

    private void logOutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBTNActionPerformed
        login_input= null;
        dispose();
        LOGIN_PAGE login = new LOGIN_PAGE();
        login.setVisible(true);
    }//GEN-LAST:event_logOutBTNActionPerformed


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
            java.util.logging.Logger.getLogger(vice_president.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vice_president.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vice_president.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vice_president.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vice_President().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel candidate_image;
    private javax.swing.JTextField descriptionTXT;
    private javax.swing.JComboBox<String> full_nameComboBox;
    private javax.swing.JButton goBackBTN;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logOutBTN;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JTextField positionTXT;
    private javax.swing.JButton voteBTN;
    private javax.swing.JTextField voterIDTXT;
    // End of variables declaration//GEN-END:variables
}
