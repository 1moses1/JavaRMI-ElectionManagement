package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.Implementation.admin_service_Impl;
import service.Implementation.events_coordinator_service_Impl;
import service.Implementation.guild_president_service_Impl;
import service.Implementation.infoSec_officer_service_Impl;
import service.Implementation.interStudent_officer_service_Impl;
import service.Implementation.report_Generator_Service_Impl;
import service.Implementation.vice_president_service_Impl;
import service.Implementation.voter_service_Impl;

/**
 *
 * @author observer
 */
public class server implements Remote{
    
    public admin_service_Impl adminIMPL;
    public report_Generator_Service_Impl reportIMPL;
    public voter_service_Impl voterIMPL;
    public guild_president_service_Impl guild_presidentIMPL;
    public vice_president_service_Impl vice_presidentIMPL;
    public events_coordinator_service_Impl events_coordinatorIMPL;
    public interStudent_officer_service_Impl interStudent_officerIMPL;
    public infoSec_officer_service_Impl infoSec_officerIMPL;

    public server() throws RemoteException {
        this.adminIMPL = new admin_service_Impl();
        this.reportIMPL = new report_Generator_Service_Impl();
        this.voterIMPL = new voter_service_Impl();
        this.guild_presidentIMPL = new guild_president_service_Impl();
        this.vice_presidentIMPL = new vice_president_service_Impl();
        this.events_coordinatorIMPL = new events_coordinator_service_Impl();
        this.interStudent_officerIMPL = new interStudent_officer_service_Impl();
        this.infoSec_officerIMPL = new infoSec_officer_service_Impl();
    }
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(6000);
            registry.rebind("admin", new server().adminIMPL);
            registry.rebind("report", new server().reportIMPL);
            registry.rebind("voter", new server().voterIMPL);
            registry.rebind("guild_president", new server().guild_presidentIMPL);
            registry.rebind("vice_president", new server().vice_presidentIMPL);
            registry.rebind("events_coordinator", new server().events_coordinatorIMPL);
            registry.rebind("interStudent_officer", new server().interStudent_officerIMPL);
            registry.rebind("infoSec_officer", new server().infoSec_officerIMPL);
            
            System.out.println("Server is running on port 6000");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }       
    
}
