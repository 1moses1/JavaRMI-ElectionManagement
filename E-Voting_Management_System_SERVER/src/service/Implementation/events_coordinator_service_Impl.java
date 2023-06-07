
package service.Implementation;

import dao.events_coordinator_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.events_coordinator;
import model.voter;
import service.events_coordinator_Service;

/**
 *
 * @author observer
 */
public class events_coordinator_service_Impl extends UnicastRemoteObject implements events_coordinator_Service{

    public events_coordinator_service_Impl() throws RemoteException {
        super();
    }
    
    events_coordinator_DAO dao= new events_coordinator_DAO();

    @Override
    public List<events_coordinator> readEventsCoordinatorTable() throws RemoteException {
        try {
            List<events_coordinator> result = dao.readEventsCoordinatorTable();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer register_EC_candidate(events_coordinator ec_cndt) throws RemoteException {
        try {
            Integer result = dao.register_EC_candidate(ec_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
}
    @Override
    public boolean CHECK_IF_EVENTS_COORDINATOR_NULL(voter voter) throws RemoteException {
        try {
            boolean answer = dao.CHECK_IF_EVENTS_COORDINATOR_NULL(voter);
            return answer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    

    @Override
    public List<String> EC_assignFullNameTOComboBox() throws RemoteException {
        try {
            List<String> result = dao.EC_assignFullNameTOComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<events_coordinator> EC_full_nameComboBoxActionPerformed(events_coordinator ec_cndt) throws RemoteException {
        try {
            List<events_coordinator> result = dao.EC_full_nameComboBoxActionPerformed(ec_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer EC_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(events_coordinator ec_cndt) throws RemoteException {
        try {
            Integer count = dao.EC_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(ec_cndt);
            return count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer EC_voteBTN_ADD_VOTER_VOTING_STATUS(events_coordinator ec_cndt, voter vote) throws RemoteException {
        try {
            Integer result = dao.EC_voteBTN_ADD_VOTER_VOTING_STATUS(ec_cndt, vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer EX_register_EC_candidate(events_coordinator ec_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_register_EC_candidate(ec_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer EX_update_EC_candidate(events_coordinator ec_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_update_EC_candidate(ec_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer EX_delete_EC_candidate(events_coordinator ec_cndt) throws RemoteException {
        try {
            Integer result = dao.EX_delete_EC_candidate(ec_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
