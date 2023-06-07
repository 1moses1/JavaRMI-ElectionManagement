
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.vice_president;
import model.voter;

/**
 *
 * @author observer
 */
public interface vice_president_Service extends Remote{
    
    List<vice_president> readVicePresidentTable() throws RemoteException;
    Integer register_VP_candidate(vice_president vp_cndt) throws RemoteException;
    boolean CHECK_IF_VP_NULL(voter voter) throws RemoteException;
    List<String> VP_assignFullNameTOComboBox() throws RemoteException;
    List<vice_president> VP_full_nameComboBoxActionPerformed(vice_president vp_cndt) throws RemoteException;
    Integer VP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(vice_president vp_cndt) throws RemoteException;
    Integer VP_voteBTN_ADD_VOTER_VOTING_STATUS(vice_president vp_cndt, voter vote) throws RemoteException;
    Integer EX_register_VP_candidate(vice_president vp_cndt) throws RemoteException;
    Integer EX_update_VP_candidate(vice_president vp_cndt) throws RemoteException;
    Integer EX_delete_VP_candidate(vice_president vp_cndt) throws RemoteException;
    
    
}
