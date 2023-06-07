package service.Implementation;

import dao.guild_president_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.List;
import model.guild_president;
import model.voter;
import service.guild_president_Service;

/**
 *
 * @author observer
 */
public class guild_president_service_Impl extends UnicastRemoteObject implements guild_president_Service{

    public guild_president_service_Impl() throws RemoteException {
        super();
    }

    guild_president_DAO dao= new guild_president_DAO();
    
    @Override
    public List<guild_president> readGuildPresidentTable() throws RemoteException {
        try {
            List<guild_president> result = dao.readGuildPresidentTable();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public int register_GP_candidate(guild_president gp_cndt) throws RemoteException {
        try {
            int result = dao.register_GP_candidate(gp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean CHECK_IF_GP_NULL(voter voter) throws RemoteException {
        try {
            boolean result = dao.CHECK_IF_GP_NULL(voter);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    
    }

    @Override
    public List<String> GP_assignFullNameTOComboBox() throws RemoteException {
        try {
            List<String> result = dao.GP_assignFullNameTOComboBox();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<guild_president> GP_full_nameComboBoxActionPerformed(guild_president gp_cndt) throws RemoteException {
        try {
            List<guild_president> result = dao.GP_full_nameComboBoxActionPerformed(gp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer GP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(guild_president gp_cndt) throws RemoteException {
        try {
            int result = dao.GP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(gp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer GP_voteBTN_ADD_VOTER_VOTING_STATUS(guild_president gp_cndt, voter vote) throws RemoteException {
        try {
            int result = dao.GP_voteBTN_ADD_VOTER_VOTING_STATUS(gp_cndt, vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer EX_register_GP_candidate(guild_president gp_cndt) throws RemoteException {
        try {
            int result = dao.EX_register_GP_candidate(gp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer EX_update_GP_candidate(guild_president gp_cndt) throws RemoteException {
        try {
            int result = dao.EX_update_GP_candidate(gp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Integer EX_delete_GP_candidate(guild_president gp_cndt) throws RemoteException {
        try {
            int result = dao.EX_delete_GP_candidate(gp_cndt);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
