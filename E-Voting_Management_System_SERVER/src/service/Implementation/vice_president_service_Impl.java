package service.Implementation;

import dao.vice_president_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.List;
import model.vice_president;
import model.voter;
import service.vice_president_Service;

/**
 *
 * @author observer
 */
public class vice_president_service_Impl extends UnicastRemoteObject implements vice_president_Service{

    public vice_president_service_Impl() throws RemoteException {
        super();
    }

    
    
    vice_president_DAO dao= new vice_president_DAO();
    @Override
    public List<vice_president> readVicePresidentTable() throws RemoteException {
        try {
            List<vice_president> result = dao.readVicePresidentTable();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public Integer register_VP_candidate(vice_president vp_cndt) throws RemoteException {
        try {
            int result = dao.register_VP_candidate(vp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean CHECK_IF_VP_NULL(voter voter) throws RemoteException {
        try {
            boolean result = dao.CHECK_IF_VP_NULL(voter);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<String> VP_assignFullNameTOComboBox() throws RemoteException {
        try {
            List<String> result = dao.VP_assignFullNameTOComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<vice_president> VP_full_nameComboBoxActionPerformed(vice_president vp_cndt) throws RemoteException {
        try {
            List<vice_president> result = dao.VP_full_nameComboBoxActionPerformed(vp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer VP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(vice_president vp_cndt) throws RemoteException {
        try {
            int result = dao.VP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(vp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer VP_voteBTN_ADD_VOTER_VOTING_STATUS(vice_president vp_cndt, voter vote) throws RemoteException {
        try {
            int result = dao.VP_voteBTN_ADD_VOTER_VOTING_STATUS(vp_cndt, vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer EX_register_VP_candidate(vice_president vp_cndt) throws RemoteException {
        try {
            int result = dao.EX_register_VP_candidate(vp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer EX_update_VP_candidate(vice_president vp_cndt) throws RemoteException {
        try {
            int result = dao.EX_update_VP_candidate(vp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer EX_delete_VP_candidate(vice_president vp_cndt) throws RemoteException {
        try {
            int result = dao.EX_delete_VP_candidate(vp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
