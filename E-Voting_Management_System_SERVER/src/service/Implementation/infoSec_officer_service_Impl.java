package service.Implementation;

import dao.infoSec_officer_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.List;
import model.infoSec_officer;
import model.voter;
import service.infoSec_officer_Service;

/**
 *
 * @author observer
 */
public class infoSec_officer_service_Impl extends UnicastRemoteObject implements infoSec_officer_Service{

    public infoSec_officer_service_Impl() throws RemoteException {
        super();
    }

    infoSec_officer_DAO dao= new infoSec_officer_DAO();
    
    @Override
    public List<infoSec_officer> readinfoSec_officerTable() throws RemoteException {
        try {
            List<infoSec_officer> result = dao.readinfoSec_officerTable();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();   
    }

    @Override
    public Integer register_InfoSecOfficer_candidate(infoSec_officer infoSO_cndt) throws RemoteException {
        try {
            Integer result = dao.register_InfoSecOfficer_candidate(infoSO_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; 
    }

    @Override
    public boolean CHECK_IF_InfoSO_NULL(voter voter) throws RemoteException {
        try {
            boolean result = dao.CHECK_IF_InfoSO_NULL(voter);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }

    @Override
    public List<String> infoSECOfficer_assignFullNameTOComboBox() throws RemoteException {
        try {
            List<String> result = dao.infoSECOfficer_assignFullNameTOComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public List<infoSec_officer> infoSECOfficer_full_nameComboBoxActionPerformed(infoSec_officer infoSO_cndt) throws RemoteException {
        try {
            List<infoSec_officer> result = dao.infoSECOfficer_full_nameComboBoxActionPerformed(infoSO_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public Integer infoSECOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(infoSec_officer infoSO_cndt) throws RemoteException {
        try {
            Integer result = dao.infoSECOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(infoSO_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public Integer infoSECOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(infoSec_officer infoSO_cndt, voter vote) throws RemoteException {
        try {
            Integer result = dao.infoSECOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(infoSO_cndt, vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }

    @Override
    public Integer EX_register_InfoSO_candidate(infoSec_officer info_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_register_InfoSO_candidate(info_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; 
    }

    @Override
    public Integer EX_update_InfoSO_candidate(infoSec_officer info_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_update_InfoSO_candidate(info_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; 
    }

    @Override
    public Integer EX_delete_InfoSO_candidate(infoSec_officer info_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_delete_InfoSO_candidate(info_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; 
    }
    
}
