package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.guild_president;
import model.voter;

/**
 *
 * @author observer
 */
public interface guild_president_Service extends Remote{
    
    List<guild_president> readGuildPresidentTable() throws RemoteException;
    int register_GP_candidate(guild_president gp_cndt) throws RemoteException;
    boolean CHECK_IF_GP_NULL(voter voter) throws RemoteException;
    List<String> GP_assignFullNameTOComboBox() throws RemoteException;
    List<guild_president> GP_full_nameComboBoxActionPerformed(guild_president gp_cndt) throws RemoteException;
    Integer GP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(guild_president gp_cndt) throws RemoteException;
    Integer GP_voteBTN_ADD_VOTER_VOTING_STATUS(guild_president gp_cndt, voter vote) throws RemoteException;
    Integer EX_register_GP_candidate(guild_president gp_cndt) throws RemoteException;
    Integer EX_update_GP_candidate(guild_president gp_cndt) throws RemoteException;
    Integer EX_delete_GP_candidate(guild_president gp_cndt) throws RemoteException;
    
    
}
