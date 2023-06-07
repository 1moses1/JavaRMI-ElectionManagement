package service;

import dao.report_Generator;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.report;

/**
 *
 * @author observer
 */
public interface report_Generator_Service extends Remote{
    
List<report> generateReports() throws RemoteException;

}
