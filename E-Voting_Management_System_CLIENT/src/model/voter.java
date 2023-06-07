
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

/**
 *
 * @author observer
 */
@Entity
public class voter implements Serializable{
    @Id
    private String full_name;
    private String voter_id;
    private String email;
    private String contact;
    private String username;
    private String gender;
    private int semester;
    private String faculty;
    private String department;
    private String password;
    private String events_coordinator;
    private String guild_president;
    private String vice_president;
    private String information_security_officer;
    private String international_student_officer;
    
    public voter() {
    }    

    public voter(String full_name, String voter_id, String email, String contact, String username, String gender, int semester, String faculty, String department, String password, String events_coordinator, String guild_president, String vice_president, String information_security_officer, String international_student_officer) {
        this.full_name = full_name;
        this.voter_id = voter_id;
        this.email = email;
        this.contact = contact;
        this.username = username;
        this.gender = gender;
        this.semester = semester;
        this.faculty = faculty;
        this.department = department;
        this.password = password;
        this.events_coordinator = events_coordinator;
        this.guild_president = guild_president;
        this.vice_president = vice_president;
        this.information_security_officer = information_security_officer;
        this.international_student_officer = international_student_officer;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getVoter_id() {
        return voter_id;
    }

    public void setVoter_id(String voter_id) {
        this.voter_id = voter_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEvents_coordinator() {
        return events_coordinator;
    }

    public void setEvents_coordinator(String events_coordinator) {
        this.events_coordinator = events_coordinator;
    }

    public String getGuild_president() {
        return guild_president;
    }

    public void setGuild_president(String guild_president) {
        this.guild_president = guild_president;
    }

    public String getVice_president() {
        return vice_president;
    }

    public void setVice_president(String vice_president) {
        this.vice_president = vice_president;
    }

    public String getInformation_security_officer() {
        return information_security_officer;
    }

    public void setInformation_security_officer(String information_security_officer) {
        this.information_security_officer = information_security_officer;
    }

    public String getInternational_student_officer() {
        return international_student_officer;
    }

    public void setInternational_student_officer(String international_student_officer) {
        this.international_student_officer = international_student_officer;
    }


}
