
package model;

import java.io.Serializable;

/**
 *
 * @author observer
 */
public class admin implements Serializable{

    private String guild_president_selectedItem;
    private String vice_president_selectedItem;
    private String events_coordinator_selectedItem;
    private String international_student_officer_selectedItem;
    private String information_security_officer_selectedItem;
    public admin() {
    }

    public admin(String guild_president_selectedItem, String vice_president_selectedItem, String events_coordinator_selectedItem, String international_student_officer_selectedItem, String information_security_officer_selectedItem) {

        this.guild_president_selectedItem = guild_president_selectedItem;
        this.vice_president_selectedItem = vice_president_selectedItem;
        this.events_coordinator_selectedItem = events_coordinator_selectedItem;
        this.international_student_officer_selectedItem = international_student_officer_selectedItem;
        this.information_security_officer_selectedItem = information_security_officer_selectedItem;
    }

    public String getGuild_president_selectedItem() {
        return guild_president_selectedItem;
    }

    public void setGuild_president_selectedItem(String guild_president_selectedItem) {
        this.guild_president_selectedItem = guild_president_selectedItem;
    }

    public String getVice_president_selectedItem() {
        return vice_president_selectedItem;
    }

    public void setVice_president_selectedItem(String vice_president_selectedItem) {
        this.vice_president_selectedItem = vice_president_selectedItem;
    }

    public String getEvents_coordinator_selectedItem() {
        return events_coordinator_selectedItem;
    }

    public void setEvents_coordinator_selectedItem(String events_coordinator_selectedItem) {
        this.events_coordinator_selectedItem = events_coordinator_selectedItem;
    }

    public String getInternational_student_officer_selectedItem() {
        return international_student_officer_selectedItem;
    }

    public void setInternational_student_officer_selectedItem(String international_student_officer_selectedItem) {
        this.international_student_officer_selectedItem = international_student_officer_selectedItem;
    }

    public String getInformation_security_officer_selectedItem() {
        return information_security_officer_selectedItem;
    }

    public void setInformation_security_officer_selectedItem(String information_security_officer_selectedItem) {
        this.information_security_officer_selectedItem = information_security_officer_selectedItem;
    }

    
    
    
}
