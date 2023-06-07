
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.events_coordinator;
import model.voter;

/**
 *
 * @author observer
 */
public interface events_coordinator_Service extends Remote{
    List<events_coordinator> readEventsCoordinatorTable() throws RemoteException;
    Integer register_EC_candidate(events_coordinator ec_cndt) throws RemoteException;
    boolean CHECK_IF_EVENTS_COORDINATOR_NULL(voter voter) throws RemoteException;
    List<String> EC_assignFullNameTOComboBox() throws RemoteException;
    List<events_coordinator> EC_full_nameComboBoxActionPerformed(events_coordinator ec_cndt) throws RemoteException;
    Integer EC_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(events_coordinator ec_cndt) throws RemoteException;
    Integer EC_voteBTN_ADD_VOTER_VOTING_STATUS(events_coordinator ec_cndt, voter vote) throws RemoteException;
    Integer EX_register_EC_candidate(events_coordinator ec_cndt) throws RemoteException;
    Integer EX_update_EC_candidate(events_coordinator ec_cndt) throws RemoteException;
    Integer EX_delete_EC_candidate(events_coordinator ec_cndt) throws RemoteException;
    
    
}
