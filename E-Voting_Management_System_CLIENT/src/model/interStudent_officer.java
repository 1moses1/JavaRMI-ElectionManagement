
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author observer
 */
@Entity
//@Table(name="international_student_officer_table")
public class interStudent_officer implements Serializable{

    @Id
    private String candidate_id;
    private String full_name;
    private String position;
    private String description;
    @Lob
    @Column(columnDefinition = "BLOB")    
    private byte[] image;
    private String candidate_votes;
    
    
    public interStudent_officer() {
    }

    public interStudent_officer(String candidate_id, String full_name, String position, String description, byte[] image, String candidate_votes) {
        this.candidate_id = candidate_id;
        this.full_name = full_name;
        this.position = position;
        this.description = description;
        this.image = image;
        this.candidate_votes = candidate_votes;
    }

    public String getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(String candidate_id) {
        this.candidate_id = candidate_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getCandidate_votes() {
        return candidate_votes;
    }

    public void setCandidate_votes(String candidate_votes) {
        this.candidate_votes = candidate_votes;
    }
    
        
}
