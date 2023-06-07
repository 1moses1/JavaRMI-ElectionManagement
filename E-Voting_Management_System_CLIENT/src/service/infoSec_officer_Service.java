package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.infoSec_officer;
import model.voter;

/**
 *
 * @author observer
 */
public interface infoSec_officer_Service extends Remote{
    
    List<infoSec_officer> readinfoSec_officerTable() throws RemoteException;
    Integer register_InfoSecOfficer_candidate(infoSec_officer infoSO_cndt) throws RemoteException;
    boolean CHECK_IF_InfoSO_NULL(voter voter) throws RemoteException;
    List<String> infoSECOfficer_assignFullNameTOComboBox() throws RemoteException;
    List<infoSec_officer> infoSECOfficer_full_nameComboBoxActionPerformed(infoSec_officer infoSO_cndt) throws RemoteException;
    Integer infoSECOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(infoSec_officer infoSO_cndt) throws RemoteException;
    Integer infoSECOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(infoSec_officer infoSO_cndt, voter vote) throws RemoteException;
    Integer EX_register_InfoSO_candidate(infoSec_officer info_cndt) throws RemoteException;
    Integer EX_update_InfoSO_candidate(infoSec_officer info_cndt) throws RemoteException;
    Integer EX_delete_InfoSO_candidate(infoSec_officer info_cndt) throws RemoteException;
    
    
}
