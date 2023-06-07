
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.util.List;
import javax.swing.*;
import javax.swing.ButtonGroup;
import model.voter;
import service.voter_Service;


/**
 *
 * @author observer
 */
public class SIGN_UP extends javax.swing.JFrame {
	
	
	String name;
	String id_number;
	String email;
	String contact;
        String user_name;
	String selectedGender;
	int semester;
	String faculty;
	String department;
	char[] passwordString;
	String password;
	char[] confirmPasswordString;
	String confirmPassword;
	
	
	
	

	public SIGN_UP() {
		initComponents();
		setLocationRelativeTo(null);
	}

	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FEMALE_CheckBox = new javax.swing.JCheckBox();
        usernameTXT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PrivacyPolicy_CheckBox = new javax.swing.JCheckBox();
        emailTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JPasswordField();
        confirmPasswordTXT = new javax.swing.JPasswordField();
        contactTXT = new javax.swing.JTextField();
        faculty_ComboBox = new javax.swing.JComboBox<>();
        sign_UpBTN = new javax.swing.JButton();
        loginBTN = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        idTXT = new javax.swing.JTextField();
        Semester_Spinner = new javax.swing.JSpinner();
        department_ComboBox = new javax.swing.JComboBox<>();
        MALE_CheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(50, 111, 180));

        jLabel5.setForeground(new java.awt.Color(50, 111, 180));
        jLabel5.setText("Contact");

        jLabel6.setForeground(new java.awt.Color(50, 111, 180));
        jLabel6.setText("Password");

        jLabel7.setForeground(new java.awt.Color(50, 111, 180));
        jLabel7.setText("Confirm Pasword");

        jLabel8.setForeground(new java.awt.Color(50, 111, 180));
        jLabel8.setText("Department");

        jLabel9.setForeground(new java.awt.Color(50, 111, 180));
        jLabel9.setText("Faculty");

        jLabel11.setForeground(new java.awt.Color(50, 111, 180));
        jLabel11.setText("Semester");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 111, 180));
        jLabel13.setText("Create an 'e-VOTING' free account now");

        FEMALE_CheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FEMALE_CheckBox.setForeground(new java.awt.Color(50, 111, 180));
        FEMALE_CheckBox.setText("Female");

        usernameTXT.setBackground(new java.awt.Color(247, 247, 240));
        usernameTXT.setForeground(new java.awt.Color(0, 51, 51));

        jLabel14.setForeground(new java.awt.Color(50, 111, 180));
        jLabel14.setText("Username");

        PrivacyPolicy_CheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PrivacyPolicy_CheckBox.setForeground(new java.awt.Color(7, 71, 147));
        PrivacyPolicy_CheckBox.setText("I accept AUCA-CPP(Campus Privacy Policy)");

        emailTXT.setBackground(new java.awt.Color(247, 247, 240));
        emailTXT.setForeground(new java.awt.Color(0, 51, 51));

        passwordTXT.setBackground(new java.awt.Color(247, 247, 240));
        passwordTXT.setForeground(new java.awt.Color(0, 51, 51));

        confirmPasswordTXT.setBackground(new java.awt.Color(247, 247, 240));
        confirmPasswordTXT.setForeground(new java.awt.Color(0, 51, 51));

        contactTXT.setBackground(new java.awt.Color(247, 247, 240));
        contactTXT.setForeground(new java.awt.Color(0, 51, 51));

        faculty_ComboBox.setBackground(new java.awt.Color(50, 111, 180));
        faculty_ComboBox.setForeground(new java.awt.Color(255, 255, 153));
        faculty_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology", "Business Administration", "Education", "Theology", "School Of Medicine" }));

        sign_UpBTN.setBackground(new java.awt.Color(7, 71, 147));
        sign_UpBTN.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        sign_UpBTN.setForeground(new java.awt.Color(255, 255, 204));
        sign_UpBTN.setText("SIGN-IN");
        sign_UpBTN.setBorder(null);
        sign_UpBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_UpBTNActionPerformed(evt);
            }
        });

        loginBTN.setBackground(new java.awt.Color(0, 51, 51));
        loginBTN.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        loginBTN.setForeground(new java.awt.Color(255, 255, 204));
        loginBTN.setText("Login");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(50, 111, 180));
        jLabel10.setText("Already have an account?");

        jLabel2.setForeground(new java.awt.Color(50, 111, 180));
        jLabel2.setText("Full Name");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 71, 147));
        jLabel1.setText("SIGN UP");

        nameTXT.setBackground(new java.awt.Color(247, 247, 240));
        nameTXT.setForeground(new java.awt.Color(0, 51, 51));

        idTXT.setBackground(new java.awt.Color(247, 247, 240));
        idTXT.setForeground(new java.awt.Color(0, 51, 51));

        department_ComboBox.setBackground(new java.awt.Color(50, 111, 180));
        department_ComboBox.setForeground(new java.awt.Color(255, 255, 153));
        department_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Networks & Communication Sysrems", "Software Engineering", "Information Management", "Other" }));

        MALE_CheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MALE_CheckBox.setForeground(new java.awt.Color(50, 111, 180));
        MALE_CheckBox.setText("Male");

        jLabel3.setForeground(new java.awt.Color(50, 111, 180));
        jLabel3.setText("ID Number");

        jLabel4.setForeground(new java.awt.Color(50, 111, 180));
        jLabel4.setText("Email Address");

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\online-registration-sign-up111111.png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\AUCA-logo.png")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 51));
        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\AUCA\\SEM-6\\Java Programming\\VOTING SYSYTEM PROJECT\\E-voting-removebg-preview.png")); // NOI18N
        jLabel17.setText("A transparent channel to express your love and gratitude to your leader");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(MALE_CheckBox)
                            .addGap(18, 18, 18)
                            .addComponent(FEMALE_CheckBox)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Semester_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(faculty_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(department_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(confirmPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PrivacyPolicy_CheckBox)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(sign_UpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FEMALE_CheckBox)
                            .addComponent(MALE_CheckBox)
                            .addComponent(usernameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(faculty_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(department_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Semester_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PrivacyPolicy_CheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(sign_UpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginBTN)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addComponent(jLabel17)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void sign_UpBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_UpBTNActionPerformed


		
		name= nameTXT.getText();
		id_number= idTXT.getText();
		email= emailTXT.getText();
		contact=contactTXT.getText();
                user_name= usernameTXT.getText();
		semester= (int) Semester_Spinner.getValue();
		faculty= (String) faculty_ComboBox.getSelectedItem();
		department= (String) department_ComboBox.getSelectedItem();
		passwordString= passwordTXT.getPassword();
		password= new String(passwordString);
		confirmPasswordString= confirmPasswordTXT.getPassword();
		confirmPassword= new String(confirmPasswordString);
		
		ButtonGroup genderButtonGroup= new ButtonGroup();
		genderButtonGroup.add(MALE_CheckBox);
		genderButtonGroup.add(FEMALE_CheckBox);
		
		if(MALE_CheckBox.isSelected()){
			selectedGender="Male";
		}else if(FEMALE_CheckBox.isSelected()){
			selectedGender="Female";
			
		}else if(FEMALE_CheckBox.isSelected() && MALE_CheckBox.isSelected()){
			JOptionPane.showMessageDialog(this, "Provide one Gender");
		}else{
			JOptionPane.showMessageDialog(this, "No Gender Selected!");
		}
		
		
		if(name.trim().isEmpty() ||
			id_number.trim().isEmpty() ||
			email.trim().isEmpty() ||
			contact.trim().isEmpty() ||
                        user_name.trim().isEmpty() ||
			selectedGender.trim().isEmpty() ||
			semester==0 ||
			faculty== null ||
			department== null ||
			password.trim().isEmpty() ||
			confirmPassword.trim().isEmpty() ||
			PrivacyPolicy_CheckBox.isSelected()== false){
			
					JOptionPane.showMessageDialog(this, "Some fields are still empty!","ERROR", JOptionPane.WARNING_MESSAGE);
		
		}else if(password.length() < 6 || confirmPassword.length() < 6){

                                        JOptionPane.showMessageDialog(this, "Create a strong password", "ERROR", JOptionPane.WARNING_MESSAGE);
                                
		}else if(password.length() > 12 || confirmPassword.length() > 12){

                                        JOptionPane.showMessageDialog(this, "Password must 12 characters max", "ERROR", JOptionPane.ERROR_MESSAGE);
                                
		}else if(id_number.length()!=5){
			JOptionPane.showMessageDialog(this, "ID number must be 5 numbers", "ERROR", JOptionPane.WARNING_MESSAGE);
		}else if(user_name.length()>10 || user_name.length()<4){
			JOptionPane.showMessageDialog(this, "Username must be between 4-10 characters", "ERROR", JOptionPane.WARNING_MESSAGE);
		}else if(password.equals(confirmPassword)== false){
		
			JOptionPane.showMessageDialog(this, "2 passwords mismatching!", "ERROR", JOptionPane.WARNING_MESSAGE);
		}else if(!PrivacyPolicy_CheckBox.isSelected()){
		
			JOptionPane.showMessageDialog(this, "Please agree to the privacy policy", "DATA REQUIRED", JOptionPane.WARNING_MESSAGE);
		}else{
                    try {
                            voter vote = new voter();
                            vote.setFull_name(name);
                            vote.setVoter_id(id_number);
                            vote.setEmail(email);
                            vote.setContact(contact);
                            vote.setUsername(user_name);
                            vote.setGender(selectedGender);
                            vote.setSemester(semester);
                            vote.setFaculty(faculty);
                            vote.setDepartment(department);
                            vote.setPassword(password);

                            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 6000);
                            voter_Service service=  (voter_Service) reg.lookup("voter"); 
                            List<voter> result = service.checkUsernameExistance(vote);
                            int rowCount = result.size();
    
    if (rowCount > 0) {
        JOptionPane.showMessageDialog(this, "Username already taken", "Data required", JOptionPane.WARNING_MESSAGE);
    } else {
        //voter_DAO daoo = new voter_DAO();
        int rowsAffected = service.registerVoter(vote);

        if (rowsAffected >= 1) {
            JOptionPane.showMessageDialog(this, "Your 'e-VOTING' account has been created successfully");
            dispose();
            LOGIN_PAGE login = new LOGIN_PAGE();
            login.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to create an account! Double check provided credentials", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}

		
		
		}
			
			

        }//GEN-LAST:event_sign_UpBTNActionPerformed

        private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
                dispose();
                LOGIN_PAGE login= new LOGIN_PAGE();
                login.setVisible(true);
        }//GEN-LAST:event_loginBTNActionPerformed

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
			java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SIGN_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SIGN_UP().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FEMALE_CheckBox;
    private javax.swing.JCheckBox MALE_CheckBox;
    private javax.swing.JCheckBox PrivacyPolicy_CheckBox;
    private javax.swing.JSpinner Semester_Spinner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPasswordField confirmPasswordTXT;
    private javax.swing.JTextField contactTXT;
    private javax.swing.JComboBox<String> department_ComboBox;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JComboBox<String> faculty_ComboBox;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBTN;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JPasswordField passwordTXT;
    private javax.swing.JButton sign_UpBTN;
    private javax.swing.JTextField usernameTXT;
    // End of variables declaration//GEN-END:variables
}
