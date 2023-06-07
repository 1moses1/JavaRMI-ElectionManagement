
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.interStudent_officer;
import model.voter;

/**
 *
 * @author observer
 */
public interface interStudent_officer_Service extends Remote{
    
    List<interStudent_officer> readinterStudent_officerTable() throws RemoteException;
    Integer register_InternationalSO_candidate(interStudent_officer interSO_cndt) throws RemoteException;
    boolean CHECK_IF_InterSO_NULL(voter voter) throws RemoteException;
    List<String> INTERSTOfficer_assignFullNameTOComboBox() throws RemoteException;
    List<interStudent_officer> INTERSTOfficer_full_nameComboBoxActionPerformed(interStudent_officer interSO_cndt) throws RemoteException;
    Integer INTERSTOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(interStudent_officer interSO_cndt) throws RemoteException;
    Integer INTERSTOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(interStudent_officer interSO_cndt, voter vote) throws RemoteException;
    Integer EX_register_InterSO_candidate(interStudent_officer inter_cndt) throws RemoteException;
    Integer EX_update_InterSO_candidate(interStudent_officer inter_cndt) throws RemoteException;
    Integer EX_delete_InterSO_candidate(interStudent_officer inter_cndt) throws RemoteException;
    
    
}
