package service.Implementation;

import dao.interStudent_officer_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.List;
import model.interStudent_officer;
import model.voter;
import service.interStudent_officer_Service;

/**
 *
 * @author observer
 */
public class interStudent_officer_service_Impl extends UnicastRemoteObject implements interStudent_officer_Service{

    public interStudent_officer_service_Impl() throws RemoteException {
        super();
    }

    interStudent_officer_DAO dao= new interStudent_officer_DAO();
    
    @Override
    public List<interStudent_officer> readinterStudent_officerTable() throws RemoteException {
        try {
            List<interStudent_officer> result = dao.readinterStudent_officerTable();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList(); 
    }

    @Override
    public Integer register_InternationalSO_candidate(interStudent_officer interSO_cndt) throws RemoteException {
        try {
            Integer result = dao.register_InternationalSO_candidate(interSO_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public boolean CHECK_IF_InterSO_NULL(voter voter) throws RemoteException {
        try {
            boolean result = dao.CHECK_IF_InterSO_NULL(voter);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }

    @Override
    public List<String> INTERSTOfficer_assignFullNameTOComboBox() throws RemoteException {
        try {
            List<String> result = dao.INTERSTOfficer_assignFullNameTOComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public List<interStudent_officer> INTERSTOfficer_full_nameComboBoxActionPerformed(interStudent_officer interSO_cndt) throws RemoteException {
        try {
            List<interStudent_officer> result = dao.INTERSTOfficer_full_nameComboBoxActionPerformed(interSO_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public Integer INTERSTOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(interStudent_officer interSO_cndt) throws RemoteException {
        try {
            Integer result = dao.INTERSTOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(interSO_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public Integer INTERSTOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(interStudent_officer interSO_cndt, voter vote) throws RemoteException {
        try {
            Integer result = dao.INTERSTOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(interSO_cndt, vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;     
    }

    @Override
    public Integer EX_register_InterSO_candidate(interStudent_officer inter_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_register_InterSO_candidate(inter_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;     }

    @Override
    public Integer EX_update_InterSO_candidate(interStudent_officer inter_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_update_InterSO_candidate(inter_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; 
    }

    @Override
    public Integer EX_delete_InterSO_candidate(interStudent_officer inter_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_delete_InterSO_candidate(inter_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; 
    }
    
}
