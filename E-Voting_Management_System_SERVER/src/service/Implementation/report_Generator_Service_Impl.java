package service.Implementation;

import dao.report_Generator;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.report;
import service.report_Generator_Service;

/**
 *
 * @author observer
 */
public class report_Generator_Service_Impl extends UnicastRemoteObject implements report_Generator_Service{

    public report_Generator_Service_Impl() throws RemoteException {
        super();
    }

    report_Generator dao= new report_Generator();
    
    
    @Override
    public List<report> generateReports() throws RemoteException {
        try {
            List<report> list= dao.generateReports();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
