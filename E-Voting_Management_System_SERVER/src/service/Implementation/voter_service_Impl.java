package service.Implementation;

import dao.voter_DAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.voter;
import service.voter_Service;

/**
 *
 * @author observer
 */

public class voter_service_Impl extends UnicastRemoteObject implements voter_Service{

    public voter_service_Impl() throws RemoteException {
        super();
    }

    voter_DAO dao= new voter_DAO();
    
    @Override
    public List<voter> checkUsernameExistance(voter vote) throws RemoteException {
        try {
            List<voter> result = dao.checkUsernameExistance(vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer registerVoter(voter vote) throws RemoteException {
        try {
            int result = dao.registerVoter(vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<voter> loginCall(voter vote) throws RemoteException {
        try {
            List<voter> result = dao.loginCall(vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<voter> readUsersTable() throws RemoteException {
        try {
            List<voter> result = dao.readUsersTable();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer deleteUser(voter vote) throws RemoteException {
        try {
            int result = dao.deleteUser(vote);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
