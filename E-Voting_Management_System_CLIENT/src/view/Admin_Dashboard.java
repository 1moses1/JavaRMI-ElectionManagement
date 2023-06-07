
package view;

//import dao.admin_DAO;
//import dao.report_Generator;
import model.admin;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.*;
import java.io.FileInputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.imageio.ImageIO;
import model.events_coordinator;
import model.guild_president;
import model.infoSec_officer;
import model.interStudent_officer;
import model.vice_president;
import model.voter;
import service.admin_Service;
import service.report_Generator_Service;


/**
 *
 * @author Observer
 */
public class Admin_Dashboard extends javax.swing.JFrame {
    // global variables
    DefaultTableModel candidateModel = new DefaultTableModel();
    DefaultTableModel usersModel = new DefaultTableModel();
    
    String guild_president_selectedItem;
    String vice_president_selectedItem;
    String events_coordinator_selectedItem;
    String international_student_officer_selectedItem;
    String information_security_officer_selectedItem;


    

    
    /**
     * Creates new form StudentDisplay
     */
    public Admin_Dashboard() {
        initComponents();
	setLocationRelativeTo(null);
        assignItemsToGuildPresidentComboBox();
        assignItemsToVicePresidentComboBox();
        assignItemsToInformationSecurityOfficertComboBox();
        assignItemsToInternationStudentsOfficertoComboBox();
        assignItemsToEventsCoordinatortoComboBox();
        displayTotalUsers();
    }


    
    
    
        public void displayTotalUsers(){
            
            try {
                
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                admin_Service service= (admin_Service) reg.lookup("admin");
                
                int result= service.getTotalUsersCount();
                if (result !=0) {
                    String users= String.valueOf(result);
                    total_usersLabel.setText(users);
                } 
                  } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
public void assignItemsToGuildPresidentComboBox() {
    try {
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
        admin_Service service= (admin_Service) reg.lookup("admin");        

        List<String> guildPresidents = service.assignItemsToGuildPresidentComboBox();

        for (String president : guildPresidents) {
            full_name_guild_presidentComboBox.addItem(president);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
        
public void assignItemsToVicePresidentComboBox() {
    try {
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
        admin_Service service= (admin_Service) reg.lookup("admin");  
        List<String> result = service.assignItemsToVicePresidentComboBox();
        
        for (String vp : result) {
            full_name_vice_presidentComboBox.addItem(vp);
        }
    } catch (Exception e) {
        
        e.printStackTrace();
    }
}



       
        public void assignItemsToInformationSecurityOfficertComboBox(){

        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            admin_Service service= (admin_Service) reg.lookup("admin");  
            List<String> result= service.assignItemsToInformationSecurityOfficertComboBox();

            for (String res: result) {
                full_name_information_security_officerComboBox.addItem(res);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        public void assignItemsToInternationStudentsOfficertoComboBox(){

        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            admin_Service service= (admin_Service) reg.lookup("admin");  
            List<String> result= service.assignItemsToInternationStudentsOfficertoComboBox();
            
                    
            for (String fullName:result) {
                full_name_international_student_officerComboBox.addItem(fullName);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        public void assignItemsToEventsCoordinatortoComboBox(){
        //user combobox
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            admin_Service service= (admin_Service) reg.lookup("admin");  
            List<String> result= service.assignItemsToEventsCoordinatortoComboBox();

            for (String fullName: result) {
                full_name_events_coordinatorComboBox.addItem(fullName);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        full_name_guild_presidentComboBox = new javax.swing.JComboBox<>();
        guild_president_fullname_Label = new javax.swing.JLabel();
        guild_president_Image_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        guild_president_allCandidatesBTN = new javax.swing.JButton();
        guild_president_votesLabel = new javax.swing.JLabel();
        guild_president_logoLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        UsersBTN = new javax.swing.JButton();
        total_usersLabel = new javax.swing.JLabel();
        refreshBTN = new javax.swing.JButton();
        candidate_positionComboBox = new javax.swing.JComboBox<>();
        heading_candidate_votesLabel = new javax.swing.JLabel();
        guild_president_logoLabel1 = new javax.swing.JLabel();
        heading_candidatesComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        printBTN = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        vice_president_fullname_Label = new javax.swing.JLabel();
        vice_president_votesLabel = new javax.swing.JLabel();
        vice_president_logoLabel = new javax.swing.JLabel();
        full_name_vice_presidentComboBox = new javax.swing.JComboBox<>();
        vice_president_Image_label = new javax.swing.JLabel();
        vice_president_allCandidatesBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        full_name_events_coordinatorComboBox = new javax.swing.JComboBox<>();
        events_coordinator_Image_label = new javax.swing.JLabel();
        events_coordinator_fullname_Label = new javax.swing.JLabel();
        events_coordinator_logoLabel = new javax.swing.JLabel();
        events_coordinator_votesLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        events_coordinator_allCandidatesBTN = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        full_name_international_student_officerComboBox = new javax.swing.JComboBox<>();
        international_students_officer_allCandidatesBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        international_students_officer_logoLabel = new javax.swing.JLabel();
        international_students_officer_Image_label = new javax.swing.JLabel();
        international_students_officer_votesLabel = new javax.swing.JLabel();
        international_students_officer_fullname_Label = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        full_name_information_security_officerComboBox = new javax.swing.JComboBox<>();
        information_security_officer_logoLabel = new javax.swing.JLabel();
        information_security_officer_votesLabel = new javax.swing.JLabel();
        information_security_officer_allCandidatesBTN = new javax.swing.JButton();
        information_security_officer_Image_label = new javax.swing.JLabel();
        information_security_officer_fullname_Label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logOutBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));

        jButton1.setBackground(new java.awt.Color(7, 71, 147));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("ADMINISTRATOR DASHBOARD");
        jButton1.setAlignmentY(0.0F);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\AUCA-logo.png")); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guild President", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(7, 71, 147))); // NOI18N

        full_name_guild_presidentComboBox.setBackground(new java.awt.Color(61, 186, 92));
        full_name_guild_presidentComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        full_name_guild_presidentComboBox.setForeground(new java.awt.Color(255, 255, 153));
        full_name_guild_presidentComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_name_guild_presidentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_guild_presidentComboBoxActionPerformed(evt);
            }
        });

        guild_president_fullname_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        guild_president_fullname_Label.setForeground(new java.awt.Color(50, 111, 180));
        guild_president_fullname_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guild_president_fullname_Label.setText("Full Name");
        guild_president_fullname_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        guild_president_Image_label.setBackground(new java.awt.Color(230, 255, 255));
        guild_president_Image_label.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        guild_president_Image_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setForeground(new java.awt.Color(50, 111, 180));
        jLabel1.setText("View all");

        guild_president_allCandidatesBTN.setBackground(new java.awt.Color(0, 51, 51));
        guild_president_allCandidatesBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        guild_president_allCandidatesBTN.setForeground(new java.awt.Color(255, 255, 204));
        guild_president_allCandidatesBTN.setText("Candidates");
        guild_president_allCandidatesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guild_president_allCandidatesBTNActionPerformed(evt);
            }
        });

        guild_president_votesLabel.setBackground(new java.awt.Color(230, 255, 255));
        guild_president_votesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        guild_president_votesLabel.setForeground(new java.awt.Color(50, 111, 180));
        guild_president_votesLabel.setText("0");
        guild_president_votesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Votes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        guild_president_votesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guild_president_votesLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        guild_president_logoLabel.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\png-wing.com.png")); // NOI18N
        guild_president_logoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guild_president_allCandidatesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(guild_president_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(full_name_guild_presidentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(guild_president_logoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(guild_president_Image_label))
                        .addComponent(guild_president_fullname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(full_name_guild_presidentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guild_president_Image_label)
                    .addComponent(guild_president_logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guild_president_fullname_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guild_president_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(guild_president_allCandidatesBTN))
                .addContainerGap())
        );

        guild_president_fullname_Label.getAccessibleContext().setAccessibleDescription("");

        jPanel7.setBackground(new java.awt.Color(233, 247, 237));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System logs overview", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(7, 71, 147))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(357, 337));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 111, 180));
        jLabel10.setText("CURRENT REGISTERED USERS");

        UsersBTN.setBackground(new java.awt.Color(0, 51, 51));
        UsersBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        UsersBTN.setForeground(new java.awt.Color(255, 255, 204));
        UsersBTN.setText("All Users");
        UsersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersBTNActionPerformed(evt);
            }
        });

        total_usersLabel.setBackground(new java.awt.Color(230, 255, 255));
        total_usersLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        total_usersLabel.setForeground(new java.awt.Color(50, 111, 180));
        total_usersLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Users", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        total_usersLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        total_usersLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        refreshBTN.setBackground(new java.awt.Color(0, 51, 51));
        refreshBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        refreshBTN.setForeground(new java.awt.Color(255, 255, 204));
        refreshBTN.setText("Refresh");
        refreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTNActionPerformed(evt);
            }
        });

        candidate_positionComboBox.setBackground(new java.awt.Color(190, 232, 201));
        candidate_positionComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        candidate_positionComboBox.setForeground(new java.awt.Color(255, 255, 153));
        candidate_positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GUILD PRESIDENT", "VICE PRESIDENT", "INFORMATION SECURITY OFFICER", "EVENTS COORDINATOR", "INTERNATIONAL STUDENT OFFICER" }));
        candidate_positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidate_positionComboBoxActionPerformed(evt);
            }
        });

        heading_candidate_votesLabel.setBackground(new java.awt.Color(230, 255, 255));
        heading_candidate_votesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        heading_candidate_votesLabel.setForeground(new java.awt.Color(50, 111, 180));
        heading_candidate_votesLabel.setText("0");
        heading_candidate_votesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Votes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        heading_candidate_votesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        heading_candidate_votesLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        guild_president_logoLabel1.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\gold-crown-sized.png")); // NOI18N
        guild_president_logoLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        heading_candidatesComboBox.setBackground(new java.awt.Color(190, 232, 201));
        heading_candidatesComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        heading_candidatesComboBox.setForeground(new java.awt.Color(255, 255, 153));
        heading_candidatesComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        heading_candidatesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heading_candidatesComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 111, 180));
        jLabel11.setText("Choose position to see top candidates:");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(50, 111, 180));
        jLabel15.setText("Pending winners:");

        printBTN.setBackground(new java.awt.Color(0, 51, 51));
        printBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        printBTN.setForeground(new java.awt.Color(255, 255, 204));
        printBTN.setText("Print Results");
        printBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBTNActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(50, 111, 180));
        jLabel16.setText("View winners:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading_candidatesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(guild_president_logoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heading_candidate_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(candidate_positionComboBox, 0, 321, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(refreshBTN)
                        .addGap(27, 27, 27)
                        .addComponent(total_usersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel15)))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(printBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UsersBTN)
                        .addGap(25, 25, 25))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_usersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(refreshBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(candidate_positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heading_candidatesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guild_president_logoLabel1)
                    .addComponent(heading_candidate_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(5, 5, 5)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsersBTN)
                    .addComponent(printBTN))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vice_President", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(7, 71, 147))); // NOI18N
        jPanel11.setPreferredSize(new java.awt.Dimension(357, 337));

        vice_president_fullname_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        vice_president_fullname_Label.setForeground(new java.awt.Color(50, 111, 180));
        vice_president_fullname_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vice_president_fullname_Label.setText("Full Name");
        vice_president_fullname_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        vice_president_votesLabel.setBackground(new java.awt.Color(230, 255, 255));
        vice_president_votesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        vice_president_votesLabel.setForeground(new java.awt.Color(50, 111, 180));
        vice_president_votesLabel.setText("0");
        vice_president_votesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Votes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        vice_president_votesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vice_president_votesLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        vice_president_logoLabel.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\png-wing.com.png")); // NOI18N
        vice_president_logoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        full_name_vice_presidentComboBox.setBackground(new java.awt.Color(61, 186, 92));
        full_name_vice_presidentComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        full_name_vice_presidentComboBox.setForeground(new java.awt.Color(255, 255, 153));
        full_name_vice_presidentComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        full_name_vice_presidentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_vice_presidentComboBoxActionPerformed(evt);
            }
        });

        vice_president_Image_label.setBackground(new java.awt.Color(230, 255, 255));
        vice_president_Image_label.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        vice_president_Image_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        vice_president_allCandidatesBTN.setBackground(new java.awt.Color(0, 51, 51));
        vice_president_allCandidatesBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        vice_president_allCandidatesBTN.setForeground(new java.awt.Color(255, 255, 204));
        vice_president_allCandidatesBTN.setText("Candidates");
        vice_president_allCandidatesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vice_president_allCandidatesBTNActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(50, 111, 180));
        jLabel3.setText("View all");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vice_president_fullname_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(full_name_vice_presidentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(vice_president_logoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vice_president_Image_label)
                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(vice_president_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(14, 14, 14)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vice_president_allCandidatesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(full_name_vice_presidentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vice_president_Image_label)
                    .addComponent(vice_president_logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vice_president_fullname_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vice_president_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(vice_president_allCandidatesBTN))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Events Coordinator", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(7, 71, 147))); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(357, 337));

        full_name_events_coordinatorComboBox.setBackground(new java.awt.Color(61, 186, 92));
        full_name_events_coordinatorComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        full_name_events_coordinatorComboBox.setForeground(new java.awt.Color(255, 255, 153));
        full_name_events_coordinatorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_events_coordinatorComboBoxActionPerformed(evt);
            }
        });

        events_coordinator_Image_label.setBackground(new java.awt.Color(230, 255, 255));
        events_coordinator_Image_label.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        events_coordinator_Image_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        events_coordinator_fullname_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        events_coordinator_fullname_Label.setForeground(new java.awt.Color(50, 111, 180));
        events_coordinator_fullname_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        events_coordinator_fullname_Label.setText("Full Name");
        events_coordinator_fullname_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        events_coordinator_logoLabel.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\png-wing.com.png")); // NOI18N
        events_coordinator_logoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        events_coordinator_votesLabel.setBackground(new java.awt.Color(230, 255, 255));
        events_coordinator_votesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        events_coordinator_votesLabel.setForeground(new java.awt.Color(50, 111, 180));
        events_coordinator_votesLabel.setText("0");
        events_coordinator_votesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Votes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        events_coordinator_votesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        events_coordinator_votesLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        jLabel4.setForeground(new java.awt.Color(50, 111, 180));
        jLabel4.setText("View all");

        events_coordinator_allCandidatesBTN.setBackground(new java.awt.Color(0, 51, 51));
        events_coordinator_allCandidatesBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        events_coordinator_allCandidatesBTN.setForeground(new java.awt.Color(255, 255, 204));
        events_coordinator_allCandidatesBTN.setText("Candidates");
        events_coordinator_allCandidatesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                events_coordinator_allCandidatesBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(events_coordinator_allCandidatesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(events_coordinator_logoLabel)
                                .addGap(6, 6, 6)
                                .addComponent(events_coordinator_Image_label))
                            .addComponent(full_name_events_coordinatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(events_coordinator_fullname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(events_coordinator_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(full_name_events_coordinatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(events_coordinator_Image_label)
                    .addComponent(events_coordinator_logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(events_coordinator_fullname_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(events_coordinator_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(events_coordinator_allCandidatesBTN))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "International Students Officer", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(7, 71, 147))); // NOI18N

        full_name_international_student_officerComboBox.setBackground(new java.awt.Color(61, 186, 92));
        full_name_international_student_officerComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        full_name_international_student_officerComboBox.setForeground(new java.awt.Color(255, 255, 153));
        full_name_international_student_officerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_international_student_officerComboBoxActionPerformed(evt);
            }
        });

        international_students_officer_allCandidatesBTN.setBackground(new java.awt.Color(0, 51, 51));
        international_students_officer_allCandidatesBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        international_students_officer_allCandidatesBTN.setForeground(new java.awt.Color(255, 255, 204));
        international_students_officer_allCandidatesBTN.setText("Candidates");
        international_students_officer_allCandidatesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                international_students_officer_allCandidatesBTNActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(50, 111, 180));
        jLabel12.setText("View all");

        international_students_officer_logoLabel.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\png-wing.com.png")); // NOI18N
        international_students_officer_logoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        international_students_officer_Image_label.setBackground(new java.awt.Color(230, 255, 255));
        international_students_officer_Image_label.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        international_students_officer_Image_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        international_students_officer_votesLabel.setBackground(new java.awt.Color(230, 255, 255));
        international_students_officer_votesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        international_students_officer_votesLabel.setForeground(new java.awt.Color(50, 111, 180));
        international_students_officer_votesLabel.setText("0");
        international_students_officer_votesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Votes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        international_students_officer_votesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        international_students_officer_votesLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        international_students_officer_fullname_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        international_students_officer_fullname_Label.setForeground(new java.awt.Color(50, 111, 180));
        international_students_officer_fullname_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        international_students_officer_fullname_Label.setText("Full Name");
        international_students_officer_fullname_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(international_students_officer_allCandidatesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(full_name_international_student_officerComboBox, 0, 246, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(international_students_officer_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(international_students_officer_fullname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(international_students_officer_logoLabel)
                                    .addGap(6, 6, 6)
                                    .addComponent(international_students_officer_Image_label))))
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(full_name_international_student_officerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(international_students_officer_Image_label)
                    .addComponent(international_students_officer_logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(international_students_officer_fullname_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(international_students_officer_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(international_students_officer_allCandidatesBTN))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information Security Officer", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(7, 71, 147))); // NOI18N
        jPanel14.setPreferredSize(new java.awt.Dimension(357, 337));

        full_name_information_security_officerComboBox.setBackground(new java.awt.Color(61, 186, 92));
        full_name_information_security_officerComboBox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        full_name_information_security_officerComboBox.setForeground(new java.awt.Color(255, 255, 153));
        full_name_information_security_officerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_name_information_security_officerComboBoxActionPerformed(evt);
            }
        });

        information_security_officer_logoLabel.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\png-wing.com.png")); // NOI18N
        information_security_officer_logoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        information_security_officer_votesLabel.setBackground(new java.awt.Color(230, 255, 255));
        information_security_officer_votesLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        information_security_officer_votesLabel.setForeground(new java.awt.Color(50, 111, 180));
        information_security_officer_votesLabel.setText("0");
        information_security_officer_votesLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Votes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 10), new java.awt.Color(50, 111, 180))); // NOI18N
        information_security_officer_votesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        information_security_officer_votesLabel.setPreferredSize(new java.awt.Dimension(20, 45));

        information_security_officer_allCandidatesBTN.setBackground(new java.awt.Color(0, 51, 51));
        information_security_officer_allCandidatesBTN.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        information_security_officer_allCandidatesBTN.setForeground(new java.awt.Color(255, 255, 204));
        information_security_officer_allCandidatesBTN.setText("Candidates");
        information_security_officer_allCandidatesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                information_security_officer_allCandidatesBTNActionPerformed(evt);
            }
        });

        information_security_officer_Image_label.setBackground(new java.awt.Color(230, 255, 255));
        information_security_officer_Image_label.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\label-default-bg.png")); // NOI18N
        information_security_officer_Image_label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        information_security_officer_fullname_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        information_security_officer_fullname_Label.setForeground(new java.awt.Color(50, 111, 180));
        information_security_officer_fullname_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        information_security_officer_fullname_Label.setText("Full Name");
        information_security_officer_fullname_Label.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel13.setForeground(new java.awt.Color(50, 111, 180));
        jLabel13.setText("View all");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(information_security_officer_allCandidatesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(information_security_officer_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(information_security_officer_fullname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(information_security_officer_Image_label))))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(information_security_officer_logoLabel)
                                    .addComponent(full_name_information_security_officerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(full_name_information_security_officerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(information_security_officer_Image_label)
                    .addComponent(information_security_officer_logoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_security_officer_fullname_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information_security_officer_votesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(information_security_officer_allCandidatesBTN))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\leadership-icon-small.png")); // NOI18N

        logOutBTN.setBackground(new java.awt.Color(7, 71, 147));
        logOutBTN.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        logOutBTN.setForeground(new java.awt.Color(255, 255, 204));
        logOutBTN.setText("Log out");
        logOutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOutBTN)
                            .addGap(9, 9, 9)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addGap(509, 509, 509)
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logOutBTN)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void full_name_guild_presidentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_guild_presidentComboBoxActionPerformed
        full_name_guild_presidentComboBox.addActionListener((ActionEvent ae) -> {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            guild_president_selectedItem = (String) full_name_guild_presidentComboBox.getSelectedItem();
            admin input= new admin();
            input.setGuild_president_selectedItem(guild_president_selectedItem);
            
            for (int i = 0; i < full_name_guild_presidentComboBox.getItemCount(); i++) {
                if (guild_president_selectedItem.equals(full_name_guild_presidentComboBox.getItemAt(i))) {
                    // do something based on the selected item
                    
                    try{
                        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                        admin_Service service= (admin_Service) reg.lookup("admin");  
                        List<guild_president> result0= service.full_name_guild_presidentComboBoxActionPerformed(input);
                        for(guild_president result:result0){
                            
                            guild_president_fullname_Label.setText(result.getFull_name());                          
                            guild_president_votesLabel.setText(result.getCandidate_votes());
                            guild_president_fullname_Label.setHorizontalAlignment(SwingConstants.CENTER);
                            guild_president_votesLabel.setHorizontalAlignment(SwingConstants.CENTER);
                            // Convert the image data to a BufferedImage
                            InputStream is = new ByteArrayInputStream(result.getImage());
                            BufferedImage image = ImageIO.read(is);

                            // Set the image on the label
                            ImageIcon icon = new ImageIcon(image);
                            guild_president_Image_label.setIcon(icon);
                        }
                        //result0.close();

                        
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                    break; // exit the loop once a match is found
                }
            }
        });
    }//GEN-LAST:event_full_name_guild_presidentComboBoxActionPerformed

    private void full_name_events_coordinatorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_events_coordinatorComboBoxActionPerformed
        full_name_events_coordinatorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                events_coordinator_selectedItem = (String) full_name_events_coordinatorComboBox.getSelectedItem();
                admin input= new admin();
                input.setEvents_coordinator_selectedItem(events_coordinator_selectedItem);                

                for (int i = 0; i < full_name_events_coordinatorComboBox.getItemCount(); i++) {
                    if (events_coordinator_selectedItem.equals(full_name_events_coordinatorComboBox.getItemAt(i))) {
                        // do something based on the selected item

                        try{
                            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                            admin_Service service= (admin_Service) reg.lookup("admin");  
                            List<events_coordinator> result= service.full_name_events_coordinatorComboBoxActionPerformed(input);
                            for(events_coordinator res: result){

                                events_coordinator_fullname_Label.setText(res.getFull_name());
                                events_coordinator_votesLabel.setText(res.getCandidate_votes());
                                events_coordinator_fullname_Label.setHorizontalAlignment(SwingConstants.CENTER);
                                events_coordinator_votesLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                // Convert the image data to a BufferedImage
                                InputStream is = new ByteArrayInputStream(res.getImage());
                                BufferedImage image = ImageIO.read(is);

                                // Set the image on the label
                                ImageIcon icon = new ImageIcon(image);
                                events_coordinator_Image_label.setIcon(icon);
                            }
                            //con.close();

                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        break; // exit the loop once a match is found
                    }
                }
            }
        });
    }//GEN-LAST:event_full_name_events_coordinatorComboBoxActionPerformed

    private void full_name_international_student_officerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_international_student_officerComboBoxActionPerformed
        full_name_international_student_officerComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                international_student_officer_selectedItem = (String) full_name_international_student_officerComboBox.getSelectedItem();
                admin input= new admin();
                input.setInternational_student_officer_selectedItem(international_student_officer_selectedItem); 
                for (int i = 0; i < full_name_international_student_officerComboBox.getItemCount(); i++) {
                    if (international_student_officer_selectedItem.equals(full_name_international_student_officerComboBox.getItemAt(i))) {
                        // do something based on the selected item

                        try{
                            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                            admin_Service service= (admin_Service) reg.lookup("admin");  
                            List<interStudent_officer> result = service.full_name_international_student_officerComboBoxActionPerformed(input);
                            for(interStudent_officer res:result){

                                international_students_officer_fullname_Label.setText(res.getFull_name());
                                international_students_officer_votesLabel.setText(res.getCandidate_votes());
                                international_students_officer_fullname_Label.setHorizontalAlignment(SwingConstants.CENTER);
                                international_students_officer_votesLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                // Convert the image data to a BufferedImage
                                InputStream is = new ByteArrayInputStream(res.getImage());
                                BufferedImage image = ImageIO.read(is);

                                // Set the image on the label
                                ImageIcon icon = new ImageIcon(image);
                                international_students_officer_Image_label.setIcon(icon);
                            }
                            //con.close();

                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        break; // exit the loop once a match is found
                    }
                }
            }
        });
    }//GEN-LAST:event_full_name_international_student_officerComboBoxActionPerformed

    private void full_name_information_security_officerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_information_security_officerComboBoxActionPerformed
        full_name_information_security_officerComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                information_security_officer_selectedItem = (String) full_name_information_security_officerComboBox.getSelectedItem();
                admin input= new admin();
                input.setInformation_security_officer_selectedItem(information_security_officer_selectedItem); 
                for (int i = 0; i < full_name_information_security_officerComboBox.getItemCount(); i++) {
                    if (information_security_officer_selectedItem.equals(full_name_information_security_officerComboBox.getItemAt(i))) {
                        // do something based on the selected item

                        try{
                            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                            admin_Service service= (admin_Service) reg.lookup("admin");  
                            List<infoSec_officer> result= service.full_name_information_security_officerComboBoxActionPerformed(input);
                            for(infoSec_officer res: result){

                                information_security_officer_fullname_Label.setText(res.getFull_name());
                                information_security_officer_votesLabel.setText(res.getCandidate_votes());
                                information_security_officer_fullname_Label.setHorizontalAlignment(SwingConstants.CENTER);
                                information_security_officer_votesLabel.setHorizontalAlignment(SwingConstants.CENTER);

                                // Convert the image data to a BufferedImage
                                InputStream is = new ByteArrayInputStream(res.getImage());
                                BufferedImage image = ImageIO.read(is);

                                // Set the image on the label
                                ImageIcon icon = new ImageIcon(image);
                                information_security_officer_Image_label.setIcon(icon);
                            }
                            //con.close();

                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        break; // exit the loop once a match is found
                    }
                }
            }
        });
    }//GEN-LAST:event_full_name_information_security_officerComboBoxActionPerformed

    private void guild_president_allCandidatesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guild_president_allCandidatesBTNActionPerformed
        guild_president_table_display display= new guild_president_table_display();
        display.setVisible(true);
    }//GEN-LAST:event_guild_president_allCandidatesBTNActionPerformed

    private void full_name_vice_presidentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_name_vice_presidentComboBoxActionPerformed
               full_name_vice_presidentComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                vice_president_selectedItem = (String) full_name_vice_presidentComboBox.getSelectedItem();
                admin input= new admin();
                input.setVice_president_selectedItem(vice_president_selectedItem);
                for (int i = 0; i < full_name_vice_presidentComboBox.getItemCount(); i++) {
                    if (vice_president_selectedItem.equals(full_name_vice_presidentComboBox.getItemAt(i))) {
                        // do something based on the selected item

                        try{
                                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                                admin_Service service= (admin_Service) reg.lookup("admin");  
                                List<vice_president> result= service.full_name_vice_presidentComboBoxActionPerformed(input);
                            for(vice_president res: result){

                                vice_president_fullname_Label.setText(res.getFull_name());
                                vice_president_votesLabel.setText(res.getCandidate_votes());
                                vice_president_fullname_Label.setHorizontalAlignment(SwingConstants.CENTER);
                                vice_president_votesLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                // Convert the image data to a BufferedImage
                                InputStream is = new ByteArrayInputStream(res.getImage());
                                BufferedImage image = ImageIO.read(is);

                                // Set the image on the label
                                ImageIcon icon = new ImageIcon(image);
                                vice_president_Image_label.setIcon(icon);
                            }
                            //con.close();

                        }catch(Exception e){
                            e.printStackTrace();
                        }

                        break; // exit the loop once a match is found
                    }
                }
            }
        });
    }//GEN-LAST:event_full_name_vice_presidentComboBoxActionPerformed

    private void vice_president_allCandidatesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vice_president_allCandidatesBTNActionPerformed
        vice_president_table_display display= new vice_president_table_display();
        display.setVisible(true);
    }//GEN-LAST:event_vice_president_allCandidatesBTNActionPerformed

    private void events_coordinator_allCandidatesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_events_coordinator_allCandidatesBTNActionPerformed
        events_coordinator_table_display DISPLAY= new events_coordinator_table_display();
        DISPLAY.setVisible(true);
    }//GEN-LAST:event_events_coordinator_allCandidatesBTNActionPerformed

    private void international_students_officer_allCandidatesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_international_students_officer_allCandidatesBTNActionPerformed
        international_students_table_display DISPLAY= new international_students_table_display();
        DISPLAY.setVisible(true);
    }//GEN-LAST:event_international_students_officer_allCandidatesBTNActionPerformed

    private void information_security_officer_allCandidatesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_information_security_officer_allCandidatesBTNActionPerformed
        information_security_table_display DISPLAY =new information_security_table_display();
        DISPLAY.setVisible(true);
    }//GEN-LAST:event_information_security_officer_allCandidatesBTNActionPerformed

    private void logOutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBTNActionPerformed
        //login_input= null;
        dispose();
        LOGIN_PAGE login= new LOGIN_PAGE();
        login.setVisible(true);
    }//GEN-LAST:event_logOutBTNActionPerformed

    private void UsersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersBTNActionPerformed
        users_table_display display= new users_table_display();
        display.setVisible(true);
    }//GEN-LAST:event_UsersBTNActionPerformed

    private void refreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTNActionPerformed
        displayTotalUsers();
    }//GEN-LAST:event_refreshBTNActionPerformed

    private void candidate_positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidate_positionComboBoxActionPerformed
               candidate_positionComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
  
                if(candidate_positionComboBox.getSelectedItem().equals(candidate_positionComboBox.getItemAt(0))){
                        
                        heading_candidatesComboBox.removeAllItems();
                        try {
                                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                                admin_Service service= (admin_Service) reg.lookup("admin");  
                                List<Object[]> result = service.leading_GP_positionComboBox();
                            for (Object[] res : result) {
                                String name = (String) res[0];
                                String votes = (String) res[1];
                                heading_candidatesComboBox.addItem(name);
                                heading_candidate_votesLabel.setText(votes);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        //break; // exit the loop once a match is found
                    }else if(candidate_positionComboBox.getSelectedItem().equals(candidate_positionComboBox.getItemAt(1))){
                        heading_candidatesComboBox.removeAllItems();
                        try {
                                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                                admin_Service service= (admin_Service) reg.lookup("admin");  
                            List<Object[]> result = service.leading_VP_positionComboBox();
                            for (Object[] res : result) {
                                String name = (String) res[0];
                                String votes = (String) res[1];
                                heading_candidatesComboBox.addItem(name);
                                heading_candidate_votesLabel.setText(votes);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        //break; // exit the loop once a match is found
                    }else if(candidate_positionComboBox.getSelectedItem().equals(candidate_positionComboBox.getItemAt(2))){
                        heading_candidatesComboBox.removeAllItems();
                        try {
                                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                                admin_Service service= (admin_Service) reg.lookup("admin");  
                                List<Object[]> result = service.leading_ISO_positionComboBox();
                            for (Object[] res : result) {
                                String name = (String) res[0];
                                String votes = (String) res[1];
                                heading_candidatesComboBox.addItem(name);
                                heading_candidate_votesLabel.setText(votes);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


                        //break; // exit the loop once a match is found
                    }else if(candidate_positionComboBox.getSelectedItem().equals(candidate_positionComboBox.getItemAt(3))){
                        heading_candidatesComboBox.removeAllItems();
                            try {
                                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                                    admin_Service service= (admin_Service) reg.lookup("admin");  
                                List<Object[]> result = service.leading_EC_positionComboBox();
                                for (Object[] res : result) {
                                    String name = (String) res[0];
                                    String votes = (String) res[1];
                                    heading_candidatesComboBox.addItem(name);
                                    heading_candidate_votesLabel.setText(votes);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }


                        //break; // exit the loop once a match is found
                    }else if(candidate_positionComboBox.getSelectedItem().equals(candidate_positionComboBox.getItemAt(4))){
                        heading_candidatesComboBox.removeAllItems();
                            try {
                                    Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                                    admin_Service service= (admin_Service) reg.lookup("admin");  
                                List<Object[]> result = service.leading_IntStud_positionComboBox();
                                for (Object[] res : result) {
                                    String name = (String) res[0];
                                    String votes = (String) res[1];
                                    heading_candidatesComboBox.addItem(name);
                                    heading_candidate_votesLabel.setText(votes);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }


                        //break; // exit the loop once a match is found
                    }
                    }         
//                }
//            }
        });
    }//GEN-LAST:event_candidate_positionComboBoxActionPerformed

    private void heading_candidatesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heading_candidatesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heading_candidatesComboBoxActionPerformed

    private void printBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBTNActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to download current report?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            try{
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
            report_Generator_Service service= (report_Generator_Service) reg.lookup("report"); 
            service.generateReports();
            //report_Generator report_Generator = new report_Generator();
            dispose();
            Admin_Dashboard view= new Admin_Dashboard();
            view.setVisible(true);
            JOptionPane.showMessageDialog(this, "Current election state report has been generated and downloaded successfully. Check the downloaded file in working directory.", "REPORT GENERATION",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                e.printStackTrace();
            }
            } else {
            dispose();
            Admin_Dashboard view= new Admin_Dashboard();
            view.setVisible(true);
        }
        
        //report_Generator report_Generator = new report_Generator();
    }//GEN-LAST:event_printBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UsersBTN;
    private javax.swing.JComboBox<String> candidate_positionComboBox;
    private javax.swing.JLabel events_coordinator_Image_label;
    private javax.swing.JButton events_coordinator_allCandidatesBTN;
    private javax.swing.JLabel events_coordinator_fullname_Label;
    private javax.swing.JLabel events_coordinator_logoLabel;
    private javax.swing.JLabel events_coordinator_votesLabel;
    private javax.swing.JComboBox<String> full_name_events_coordinatorComboBox;
    private javax.swing.JComboBox<String> full_name_guild_presidentComboBox;
    private javax.swing.JComboBox<String> full_name_information_security_officerComboBox;
    private javax.swing.JComboBox<String> full_name_international_student_officerComboBox;
    private javax.swing.JComboBox<String> full_name_vice_presidentComboBox;
    private javax.swing.JLabel guild_president_Image_label;
    private javax.swing.JButton guild_president_allCandidatesBTN;
    private javax.swing.JLabel guild_president_fullname_Label;
    private javax.swing.JLabel guild_president_logoLabel;
    private javax.swing.JLabel guild_president_logoLabel1;
    private javax.swing.JLabel guild_president_votesLabel;
    private javax.swing.JLabel heading_candidate_votesLabel;
    private javax.swing.JComboBox<String> heading_candidatesComboBox;
    private javax.swing.JLabel information_security_officer_Image_label;
    private javax.swing.JButton information_security_officer_allCandidatesBTN;
    private javax.swing.JLabel information_security_officer_fullname_Label;
    private javax.swing.JLabel information_security_officer_logoLabel;
    private javax.swing.JLabel information_security_officer_votesLabel;
    private javax.swing.JLabel international_students_officer_Image_label;
    private javax.swing.JButton international_students_officer_allCandidatesBTN;
    private javax.swing.JLabel international_students_officer_fullname_Label;
    private javax.swing.JLabel international_students_officer_logoLabel;
    private javax.swing.JLabel international_students_officer_votesLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logOutBTN;
    private javax.swing.JButton printBTN;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JLabel total_usersLabel;
    private javax.swing.JLabel vice_president_Image_label;
    private javax.swing.JButton vice_president_allCandidatesBTN;
    private javax.swing.JLabel vice_president_fullname_Label;
    private javax.swing.JLabel vice_president_logoLabel;
    private javax.swing.JLabel vice_president_votesLabel;
    // End of variables declaration//GEN-END:variables
}
