
package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author observer
 */
public class user_homepage extends javax.swing.JFrame {
//JLabel timerLabel= new JLabel();
    /**
     * Creates new form user_homepage
     */
    user_homepage user_homepage;
    public user_homepage() {
        initComponents();

        setLocationRelativeTo(null);
    }


    
     private JPopupMenu popupMenu= new JPopupMenu("CHOOSE POSITION");
     public JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5;
     String time_count= TIME_DISPLAY.getDeadline_timer();
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        logoutBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cast_voteBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        share_candidateBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\AUCA-logo.png")); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 71, 147));
        jLabel3.setText("THE FUTURE OF STUDENTS' ELECTIONS RELIES IN AN E-VOTING SYSTEM");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logoutBTN.setBackground(new java.awt.Color(7, 71, 147));
        logoutBTN.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        logoutBTN.setForeground(new java.awt.Color(255, 255, 204));
        logoutBTN.setText("Logout");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 71, 147));
        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\auca-logo circle-copy.png")); // NOI18N
        jLabel6.setText("2022-2023");

        jPanel2.setBackground(new java.awt.Color(255, 255, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 71, 147));
        jLabel1.setText("Cast your vote directly");

        cast_voteBTN.setBackground(new java.awt.Color(0, 153, 183));
        cast_voteBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cast_voteBTN.setForeground(new java.awt.Color(255, 255, 204));
        cast_voteBTN.setText("CAST");
        cast_voteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cast_voteBTNActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 71, 147));
        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\voice-heard-copy.png")); // NOI18N
        jLabel7.setText("MAKE YOUR VOICE HEARD!");

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 111, 180));
        jLabel10.setText("Be a part of the decision-making process.");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 111, 180));
        jLabel11.setText("The power is in your hands. ");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 111, 180));
        jLabel12.setText("Vote for the candidate you believe in.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(cast_voteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cast_voteBTN)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 247));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        share_candidateBTN.setBackground(new java.awt.Color(255, 255, 153));
        share_candidateBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        share_candidateBTN.setForeground(new java.awt.Color(7, 71, 147));
        share_candidateBTN.setText("CANDIDATE");
        share_candidateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                share_candidateBTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 71, 147));
        jLabel5.setText("Share your candidate first");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(7, 71, 147));
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\people-with-love-shape-copy.png")); // NOI18N
        jLabel8.setText("SHARING IS CARING");

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 111, 180));
        jLabel13.setText("and make a difference in the election");

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(50, 111, 180));
        jLabel14.setText("Get your friends involved in the election");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(50, 111, 180));
        jLabel15.setText("Be an influencer and share your candidate's ");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(50, 111, 180));
        jLabel16.setText("message with your friends!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel5)
                    .addComponent(share_candidateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(share_candidateBTN)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 71, 147));
        jLabel2.setText("Good management of the elections by a credible election management body is a critical element of election integrity. ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBTN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutBTN)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        dispose();
        LOGIN_PAGE login= new LOGIN_PAGE();
        login.setVisible(true);

    }//GEN-LAST:event_logoutBTNActionPerformed

    private void cast_voteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cast_voteBTNActionPerformed
        
       timerLabel.setText(time_count);
       timerLabel.setBackground(Color.yellow);
        menuItem1 = new JMenuItem("GUILD PRESIDENT");
        menuItem2 = new JMenuItem("VICE PRESIDENT");
        menuItem3 = new JMenuItem("INFORMATION SECURITY OFFICER");
        menuItem4 = new JMenuItem("EVENTS COORDINATOR");
        menuItem5 = new JMenuItem("INTERNATIONAL STUDENT OFFICER");
            menuItem1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to vote Guild President?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            guild_President guild_president= new guild_President();
            guild_president.setVisible(true);
        } else {
            dispose();
            user_homepage user_homepage= new user_homepage();
            user_homepage.setVisible(true);
        }
        }
    });

    menuItem2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to vote vice President?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            vice_President vice_president= new vice_President();
            vice_president.setVisible(true);
        } else {
            dispose();
            user_homepage user_homepage= new user_homepage();
            user_homepage.setVisible(true);
        }
        }
    });

    menuItem3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to vote Information Security Officer?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            information_security_officer treasurer_officer= new information_security_officer();
            treasurer_officer.setVisible(true);
        } else {
            dispose();
            user_homepage user_homepage= new user_homepage();
            user_homepage.setVisible(true);
        }
        }
    });

    menuItem4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to vote Events Coordinator?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            event_coordinator events_coordinator= new event_coordinator();
            events_coordinator.setVisible(true);
        } else {
            dispose();
            user_homepage user_homepage= new user_homepage();
            user_homepage.setVisible(true);
        }
        }
    });

    menuItem5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to vote International Student Officer?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
            international_student_officer international_student_officer= new international_student_officer();
            international_student_officer.setVisible(true);
        } else {
            dispose();
            user_homepage user_homepage= new user_homepage();
            user_homepage.setVisible(true);
        }
        }
    });

        popupMenu.add(menuItem1);
        popupMenu.add(menuItem2);
        popupMenu.add(menuItem3);
        popupMenu.add(menuItem4);
        popupMenu.add(menuItem5);
        
        int x = cast_voteBTN.getWidth() / 2;
        int y = cast_voteBTN.getHeight() / 2;
        popupMenu.show(cast_voteBTN, x, y);
        popupMenu.show(cast_voteBTN, cast_voteBTN.getWidth(), cast_voteBTN.getHeight());
        
        popupMenu.setVisible(true);
        
        
    }//GEN-LAST:event_cast_voteBTNActionPerformed

    private void share_candidateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_share_candidateBTNActionPerformed
        dispose();
        register_candidate register_candidate=new register_candidate();
        register_candidate.setVisible(true);
    }//GEN-LAST:event_share_candidateBTNActionPerformed



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
            java.util.logging.Logger.getLogger(user_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cast_voteBTN;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton share_candidateBTN;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}
