
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.admin;
import model.events_coordinator;
import model.guild_president;
import model.infoSec_officer;
import model.interStudent_officer;
import model.vice_president;

/**
 *
 * @author observer
 */
public interface admin_Service extends Remote{
    //method signature
    Integer getTotalUsersCount() throws RemoteException;
    List<String> assignItemsToGuildPresidentComboBox() throws RemoteException;
    List<Object[]> leading_GP_positionComboBox() throws RemoteException;
    List<Object[]> leading_VP_positionComboBox() throws RemoteException;
    List<Object[]> leading_EC_positionComboBox() throws RemoteException;
    List<Object[]> leading_ISO_positionComboBox() throws RemoteException;
    List<Object[]> leading_IntStud_positionComboBox() throws RemoteException;
    List<String> assignItemsToVicePresidentComboBox() throws RemoteException;
    List<String> assignItemsToInformationSecurityOfficertComboBox() throws RemoteException;
    List<String> assignItemsToInternationStudentsOfficertoComboBox() throws RemoteException;
    List<String> assignItemsToEventsCoordinatortoComboBox() throws RemoteException;
    List<guild_president> full_name_guild_presidentComboBoxActionPerformed(admin input) throws RemoteException;
    List<vice_president> full_name_vice_presidentComboBoxActionPerformed(admin UInput) throws RemoteException;
    List<infoSec_officer> full_name_information_security_officerComboBoxActionPerformed(admin UInput) throws RemoteException;
    List<interStudent_officer> full_name_international_student_officerComboBoxActionPerformed(admin UInput) throws RemoteException;
    List<events_coordinator> full_name_events_coordinatorComboBoxActionPerformed(admin UInput) throws RemoteException;
    
    
}
