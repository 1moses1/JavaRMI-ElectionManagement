package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author observer
 */
@Entity
public class report implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String candidate_id;
    
    private String full_name;    

    private String position;
    
    private String description; 
    
    private String candidate_votes;

    private byte[] image;   

    public report() {
    }

    public report(Long id, String candidate_id, String full_name, String position, String description, String candidate_votes, byte[] image) {
        this.id = id;
        this.candidate_id = candidate_id;
        this.full_name = full_name;
        this.position = position;
        this.description = description;
        this.candidate_votes = candidate_votes;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCandidate_votes() {
        return candidate_votes;
    }

    public void setCandidate_votes(String candidate_votes) {
        this.candidate_votes = candidate_votes;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    

}

    
