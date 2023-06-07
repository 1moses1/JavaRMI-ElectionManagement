
package view;
import java.sql.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.vice_president;
import model.guild_president;
import model.events_coordinator;
import model.infoSec_officer;
import model.interStudent_officer;
import service.events_coordinator_Service;
import service.guild_president_Service;
import service.infoSec_officer_Service;
import service.interStudent_officer_Service;
import service.vice_president_Service;

/**
 *
 * @author observer
 */
public class register_candidate extends javax.swing.JFrame {

	/**
	 * Creates new form voter_dashboard
	 */
	public register_candidate() {
		initComponents();
		setLocationRelativeTo(null);
	}
        
        byte[] imageBytes;
        String candidate_id;
        String candidate_name;
        String position;
        String description;
        
        guild_president gp_cndt= new guild_president();
        vice_president vp_cndt= new vice_president();
        events_coordinator ec_cndt= new events_coordinator();
        interStudent_officer interSO_cndt= new interStudent_officer();
        infoSec_officer infoSO_cndt= new infoSec_officer();

        
        




	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        goBackBTN = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        candidate_image = new javax.swing.JLabel();
        idTXT = new javax.swing.JTextField();
        descriptionTXT = new javax.swing.JTextField();
        nameTXT = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imageBTN = new javax.swing.JToggleButton();
        candidate_positionComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        goBackBTN.setBackground(new java.awt.Color(7, 71, 147));
        goBackBTN.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        goBackBTN.setForeground(new java.awt.Color(255, 255, 204));
        goBackBTN.setText("Go back");
        goBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBTNActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 247));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        candidate_image.setBackground(new java.awt.Color(230, 255, 255));
        candidate_image.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        candidate_image.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        saveBTN.setBackground(new java.awt.Color(7, 71, 147));
        saveBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBTN.setForeground(new java.awt.Color(255, 255, 204));
        saveBTN.setText("SAVE");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
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

        candidate_positionComboBox.setBackground(new java.awt.Color(50, 111, 180));
        candidate_positionComboBox.setForeground(new java.awt.Color(255, 255, 153));
        candidate_positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GUILD PRESIDENT", "VICE PRESIDENT", "INFORMATION SECURITY OFFICER", "EVENTS COORDINATOR", "INTERNATIONAL STUDENT OFFICER" }));
        candidate_positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidate_positionComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(candidate_positionComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                .addComponent(nameTXT, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idTXT)
                                .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(imageBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(candidate_image))
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(148, 148, 148)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(165, 165, 165))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(candidate_positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(77, 77, 77)
                        .addComponent(saveBTN))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(candidate_image)
                        .addGap(14, 14, 14)
                        .addComponent(imageBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\AUCA-logo.png")); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\SELECTION ZOOM-COPY.png")); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(7, 71, 147));
        jLabel10.setText("CANDIDATE'S CRITERION:");

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 71, 147));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\person-icon.png")); // NOI18N
        jLabel6.setText("SUBMIT YOUR CANDIDATE");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(50, 111, 180));
        jLabel14.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\Black_CirclING.png")); // NOI18N
        jLabel14.setText("Campaign platform");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(66, 66, 66))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goBackBTN)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goBackBTN)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBTNActionPerformed
        dispose();
        user_homepage user_homepage= new user_homepage();
        user_homepage.setVisible(true);
    }//GEN-LAST:event_goBackBTNActionPerformed

    private void idTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTXTActionPerformed

    private void descriptionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTXTActionPerformed

    private void nameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXTActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed

        
         candidate_id= idTXT.getText();
         candidate_name= nameTXT.getText();
         position=(String) candidate_positionComboBox.getSelectedItem();
         description= descriptionTXT.getText();
        
//
//        cndt.setCandidate_id(candidate_id);
//        cndt.setFull_name(candidate_name);
//        cndt.setPosition(position);
//        cndt.setDescription(description);
//        cndt.setImage(imageBytes);

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
            if(position.equalsIgnoreCase("GUILD PRESIDENT")){
                    
            try{

                gp_cndt.setCandidate_id(candidate_id);
                gp_cndt.setFull_name(candidate_name);
                gp_cndt.setPosition(position);
                gp_cndt.setDescription(description);
                gp_cndt.setImage(imageBytes);                
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                guild_president_Service service= (guild_president_Service) reg.lookup("guild_president"); 
                int rowsAffected= service.register_GP_candidate(gp_cndt);
               
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                    dispose();
                    register_candidate register_candidate= new register_candidate();
                    register_candidate.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }


            }catch(Exception e){
                e.printStackTrace();
            }
            }else if(position.equalsIgnoreCase("VICE PRESIDENT")){
                    
            try{
                vp_cndt.setCandidate_id(candidate_id);
                vp_cndt.setFull_name(candidate_name);
                vp_cndt.setPosition(position);
                vp_cndt.setDescription(description);
                vp_cndt.setImage(imageBytes);
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                vice_president_Service service= (vice_president_Service) reg.lookup("vice_president"); 
                 int rowsAffected= service.register_VP_candidate(vp_cndt);
               
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                    dispose();
                    register_candidate register_candidate= new register_candidate();
                    register_candidate.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }

            }catch(Exception e){
                e.printStackTrace();
            }
            }else if(position.equalsIgnoreCase("information security officer")){
                    
            try{
                infoSO_cndt.setCandidate_id(candidate_id);
                infoSO_cndt.setFull_name(candidate_name);
                infoSO_cndt.setPosition(position);
                infoSO_cndt.setDescription(description);
                infoSO_cndt.setImage(imageBytes);
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                infoSec_officer_Service service=  (infoSec_officer_Service) reg.lookup("infoSec_officer");
                 int rowsAffected= service.register_InfoSecOfficer_candidate(infoSO_cndt);               
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                    dispose();
                    register_candidate register_candidate= new register_candidate();
                    register_candidate.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }

                //con.close();

            }catch(Exception e){
                e.printStackTrace();
            }
            }else if(position.equalsIgnoreCase("EVENTS COORDINATOR")){
                    
            try{
                ec_cndt.setCandidate_id(candidate_id);
                ec_cndt.setFull_name(candidate_name);
                ec_cndt.setPosition(position);
                ec_cndt.setDescription(description);
                ec_cndt.setImage(imageBytes);
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                events_coordinator_Service service= (events_coordinator_Service) reg.lookup("events_coordinator");
                int rowsAffected= service.register_EC_candidate(ec_cndt);                
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                    dispose();
                    register_candidate register_candidate= new register_candidate();
                    register_candidate.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }

                //con.close();

            }catch(Exception e){
                e.printStackTrace();
            }
            }else if(position.equalsIgnoreCase("INTERNATIONAL STUDENT OFFICER")){
                    
            try{
                interSO_cndt.setCandidate_id(candidate_id);
                interSO_cndt.setFull_name(candidate_name);
                interSO_cndt.setPosition(position);
                interSO_cndt.setDescription(description);
                interSO_cndt.setImage(imageBytes);
                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                    interStudent_officer_Service service=  (interStudent_officer_Service) reg.lookup("interStudent_officer");
                 int rowsAffected= service.register_InternationalSO_candidate(interSO_cndt); 
               
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                    dispose();
                    register_candidate register_candidate= new register_candidate();
                    register_candidate.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }

            }catch(Exception e){
                e.printStackTrace();
            }
            }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_saveBTNActionPerformed

    private void imageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageBTNActionPerformed

        File selectedFile=null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        selectedFile = fileChooser.getSelectedFile();



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
            gp_cndt.setImage(imageBytes);
            vp_cndt.setImage(imageBytes);
            ec_cndt.setImage(imageBytes);
            infoSO_cndt.setImage(imageBytes);
            interSO_cndt.setImage(imageBytes);
            // Set the image bytes to >>byte[] imageBytes; variable
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            candidate_image.setIcon(imageIcon);

            // Close the resources
            byteArrayOutputStream.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_imageBTNActionPerformed

    private void candidate_positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidate_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_candidate_positionComboBoxActionPerformed

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
			java.util.logging.Logger.getLogger(register_candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(register_candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(register_candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(register_candidate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new register_candidate().setVisible(true);
			}
		});
	}
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel candidate_image;
    private javax.swing.JComboBox<String> candidate_positionComboBox;
    private javax.swing.JTextField descriptionTXT;
    private javax.swing.JButton goBackBTN;
    private javax.swing.JTextField idTXT;
    private javax.swing.JToggleButton imageBTN;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton saveBTN;
    // End of variables declaration//GEN-END:variables
}

