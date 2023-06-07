package service.Implementation;

import dao.admin_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.admin;
import model.events_coordinator;
import model.guild_president;
import model.infoSec_officer;
import model.interStudent_officer;
import model.vice_president;
import service.admin_Service;

/**
 *
 * @author observer
 */
public class admin_service_Impl extends UnicastRemoteObject implements admin_Service{

    public admin_service_Impl() throws RemoteException {
        super();
    }
    
    public admin_DAO dao= new admin_DAO();

    @Override
    public Integer getTotalUsersCount() throws RemoteException {
        try {
            int count= dao.getTotalUsersCount();
            return count;
        } catch (Exception e) {
            e.printStackTrace();    
        }
        return 0;
    }

    @Override
    public List<String> assignItemsToGuildPresidentComboBox() throws RemoteException {
        try {
            List<String> rs = dao.assignItemsToGuildPresidentComboBox();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object[]> leading_GP_positionComboBox() throws RemoteException {
        try {
            List<Object[]> result = dao.leading_GP_positionComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object[]> leading_VP_positionComboBox() throws RemoteException {
        try {
            List<Object[]> result = dao.leading_VP_positionComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object[]> leading_EC_positionComboBox() throws RemoteException {
        try {
            List<Object[]> result = dao.leading_EC_positionComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object[]> leading_ISO_positionComboBox() throws RemoteException {
        try {
            List<Object[]> result = dao.leading_ISO_positionComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Object[]> leading_IntStud_positionComboBox() throws RemoteException {
        try {
            List<Object[]> result = dao.leading_IntStud_positionComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> assignItemsToVicePresidentComboBox() throws RemoteException {
        try {
            List<String> result = dao.assignItemsToVicePresidentComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> assignItemsToInformationSecurityOfficertComboBox() throws RemoteException {
        try {
            List<String> result = dao.assignItemsToInformationSecurityOfficertComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> assignItemsToInternationStudentsOfficertoComboBox() throws RemoteException {
        try {
            List<String> result = dao.assignItemsToInternationStudentsOfficertoComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> assignItemsToEventsCoordinatortoComboBox() throws RemoteException {
        try {
            List<String> result = dao.assignItemsToEventsCoordinatortoComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<guild_president> full_name_guild_presidentComboBoxActionPerformed(admin input) throws RemoteException {
        try {
            List<guild_president> result = dao.full_name_guild_presidentComboBoxActionPerformed(input);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<vice_president> full_name_vice_presidentComboBoxActionPerformed(admin UInput) throws RemoteException {
        try {
            List<vice_president> result = dao.full_name_vice_presidentComboBoxActionPerformed(UInput);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<infoSec_officer> full_name_information_security_officerComboBoxActionPerformed(admin UInput) throws RemoteException {
        try {
            List<infoSec_officer> result = dao.full_name_information_security_officerComboBoxActionPerformed(UInput);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<interStudent_officer> full_name_international_student_officerComboBoxActionPerformed(admin UInput) throws RemoteException {
        try {
            List<interStudent_officer> result = dao.full_name_international_student_officerComboBoxActionPerformed(UInput);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<events_coordinator> full_name_events_coordinatorComboBoxActionPerformed(admin UInput) throws RemoteException {
        try {
            List<events_coordinator> result = dao.full_name_events_coordinatorComboBoxActionPerformed(UInput);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
