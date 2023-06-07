
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
import model.events_coordinator;
import service.events_coordinator_Service;

/**
 *
 * @author observer
 */
public class events_coordinator_table_display extends javax.swing.JFrame {

    /**
     * Creates new form test_table_display
     */
    public events_coordinator_table_display() {
        initComponents();
        addColumnTable();
        retriveDataFromDbToTable();
        setLocationRelativeTo(null);
    }
    
    DefaultTableModel tableModel = new DefaultTableModel();
    byte[] imageBytes;
    
        private void addColumnTable(){
        tableModel.addColumn("Candidate ID");
        tableModel.addColumn("Full name");
        tableModel.addColumn("Position");
	tableModel.addColumn("Description");
	tableModel.addColumn("Image");
	tableModel.addColumn("Votes");
        // set table model on our table data
        guild_president_JTable.setModel(tableModel);
    }
        
            private void retriveDataFromDbToTable(){
        try{
                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                    events_coordinator_Service service= (events_coordinator_Service) reg.lookup("events_coordinator");
                    List<events_coordinator> result= service.readEventsCoordinatorTable();
            for(events_coordinator res: result){
                tableModel.addRow(new Object[]{
                    res.getCandidate_id(),
                    res.getFull_name(),
                    res.getPosition(),
		    res.getDescription(),
		    res.getImage(),
		    res.getCandidate_votes()
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
        guild_president_JTable = new javax.swing.JTable();
        idTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descriptionTXT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idTXT1 = new javax.swing.JTextField();
        deleteBTN = new javax.swing.JButton();
        imageBTN = new javax.swing.JToggleButton();
        goBackBTN = new javax.swing.JButton();

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
        jLabel3.setText("CANDIDATES FOR EVENTS COORDINATOR");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        guild_president_JTable.setBackground(new java.awt.Color(255, 255, 204));
        guild_president_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(guild_president_JTable);

        idTXT.setBackground(new java.awt.Color(247, 247, 240));
        idTXT.setForeground(new java.awt.Color(0, 51, 51));
        idTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTXTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 71, 147));
        jLabel2.setText("ID:");

        nameTXT.setBackground(new java.awt.Color(247, 247, 240));
        nameTXT.setForeground(new java.awt.Color(0, 51, 51));
        nameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXTActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 71, 147));
        jLabel4.setText("Full name:");

        descriptionTXT.setBackground(new java.awt.Color(247, 247, 240));
        descriptionTXT.setForeground(new java.awt.Color(0, 51, 51));
        descriptionTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionTXTActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 71, 147));
        jLabel5.setText("Description:");

        saveBTN.setBackground(new java.awt.Color(0, 51, 51));
        saveBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        saveBTN.setForeground(new java.awt.Color(255, 255, 204));
        saveBTN.setText("SAVE");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(0, 51, 51));
        updateBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 204));
        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 71, 147));
        jLabel6.setText("Delete candidate(ID)");

        idTXT1.setBackground(new java.awt.Color(247, 247, 240));
        idTXT1.setForeground(new java.awt.Color(0, 51, 51));
        idTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTXT1ActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(0, 51, 51));
        deleteBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 204));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
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

        goBackBTN.setBackground(new java.awt.Color(255, 255, 204));
        goBackBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        goBackBTN.setForeground(new java.awt.Color(7, 71, 147));
        goBackBTN.setText("Go back");
        goBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(imageBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBTN))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(goBackBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBTN)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(descriptionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(saveBTN)
                    .addComponent(jLabel2)
                    .addComponent(updateBTN)
                    .addComponent(imageBTN))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(deleteBTN)
                    .addComponent(goBackBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void nameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXTActionPerformed

    private void descriptionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionTXTActionPerformed

    private void idTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTXT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTXT1ActionPerformed

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

            // Set the image bytes to >>byte[] imageBytes; variable
            ImageIcon imageIcon = new ImageIcon(imageBytes);

            // Close the resources
            byteArrayOutputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_imageBTNActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed

        String candidate_id= idTXT.getText();
        String candidate_name= nameTXT.getText();
        //String position= positionTXT.getText();
        String description= descriptionTXT.getText();

        if(candidate_id.trim().isEmpty() ||
            candidate_name.trim().isEmpty() ||
            description.trim().isEmpty()){

            JOptionPane.showMessageDialog(this, "Some fields are still empty!", "Data required", JOptionPane.WARNING_MESSAGE);
        }else if(imageBytes==null){
            JOptionPane.showMessageDialog(this, "Provide candidate profile picture", "Data required", JOptionPane.WARNING_MESSAGE);

        }else if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{

            try{
                    events_coordinator ec= new events_coordinator();
                    ec.setCandidate_id(candidate_id);
                    ec.setFull_name(candidate_name);
                    ec.setImage(imageBytes);
                    ec.setDescription(description);
                    
                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                    events_coordinator_Service service= (events_coordinator_Service) reg.lookup("events_coordinator");
                    int rowsAffected= service.EX_register_EC_candidate(ec);
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate registered successfully");
                            tableModel.setRowCount(0);
                            retriveDataFromDbToTable();
                            idTXT.setText("");
                            nameTXT.setText("");      
                            descriptionTXT.setText("");
                }else{
                    JOptionPane.showMessageDialog(this,"Candidate Registration Failed","ERROR",JOptionPane.WARNING_MESSAGE);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_saveBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        String candidate_id= idTXT.getText();
        String candidate_name= nameTXT.getText();
        //String position= positionTXT.getText();
        String description= descriptionTXT.getText();

        if(candidate_id.trim().isEmpty() ||
            candidate_name.trim().isEmpty() ||
            description.trim().isEmpty()){

            JOptionPane.showMessageDialog(this, "Some fields are still empty!", "Data required", JOptionPane.WARNING_MESSAGE);
        }else if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else if(imageBytes==null){
            JOptionPane.showMessageDialog(this, "Provide candidate profile picture", "Data required", JOptionPane.WARNING_MESSAGE);

        }else{

            try{
                events_coordinator model= new events_coordinator();
                model.setFull_name(candidate_name);
                model.setPosition("EVENTS COORDINATOR");
                model.setDescription(description);
                model.setImage(imageBytes);
                model.setCandidate_id(candidate_id);
                
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                events_coordinator_Service service= (events_coordinator_Service) reg.lookup("events_coordinator");

                int rowsAffected= service.EX_update_EC_candidate(model);
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate updated successfully");
                            tableModel.setRowCount(0);
                            retriveDataFromDbToTable();
                            idTXT.setText("");
                            nameTXT.setText("");      
                            descriptionTXT.setText("");
                }else{
                    JOptionPane.showMessageDialog(this, "Update failed", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed

        String candidate_id= idTXT1.getText();
        if(candidate_id.length()!=5){
            JOptionPane.showMessageDialog(this, "ID number must 5 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{

            try{
                events_coordinator model= new events_coordinator();
                model.setCandidate_id(candidate_id);
                
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                events_coordinator_Service service= (events_coordinator_Service) reg.lookup("events_coordinator");
                int rowsAffected= service.EX_delete_EC_candidate(model);
                if(rowsAffected>=1){
                    JOptionPane.showMessageDialog(this, "Candidate deleted successfully");
                            tableModel.setRowCount(0);
                            retriveDataFromDbToTable();
                            idTXT1.setText("");

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
            java.util.logging.Logger.getLogger(events_coordinator_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(events_coordinator_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(events_coordinator_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(events_coordinator_table_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new events_coordinator_table_display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBTN;
    private javax.swing.JTextField descriptionTXT;
    private javax.swing.JButton goBackBTN;
    private javax.swing.JTable guild_president_JTable;
    private javax.swing.JTextField idTXT;
    private javax.swing.JTextField idTXT1;
    private javax.swing.JToggleButton imageBTN;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
