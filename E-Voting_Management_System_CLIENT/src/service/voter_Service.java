package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.voter;

/**
 *
 * @author observer
 */
public interface voter_Service extends Remote{
    
    List<voter> checkUsernameExistance(voter vote) throws RemoteException;
    Integer registerVoter(voter vote) throws RemoteException;
    List<voter> loginCall(voter vote) throws RemoteException;
    List<voter> readUsersTable() throws RemoteException;
    Integer deleteUser(voter vote) throws RemoteException;
    
    
}
