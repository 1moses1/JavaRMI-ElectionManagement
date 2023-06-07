
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import model.infoSec_officer;
import model.voter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author observer
 */
public class infoSec_officer_DAO {

    public infoSec_officer_DAO() {
    }

public List<infoSec_officer> readinfoSec_officerTable() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<infoSec_officer> result = session.createQuery("FROM infoSec_officer").list();
        session.close(); // Close the session after retrieving the data
        return result;
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList(); // Return an empty list instead of null
    }
}


    public Integer register_InfoSecOfficer_candidate(infoSec_officer infoSO_cndt){
        Integer rowsAffected = 0;
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            session.save(infoSO_cndt);
            rowsAffected = 1;

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

public boolean CHECK_IF_InfoSO_NULL(voter voter) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT information_security_officer FROM voter WHERE voter_id = :voterId OR username = :username");
        query.setParameter("voterId", voter.getVoter_id());
        query.setParameter("username", voter.getUsername());
        String eventsCoordinator = (String) query.uniqueResult();

        transaction.commit();
        return eventsCoordinator == null;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
} 
            
    public List<String> infoSECOfficer_assignFullNameTOComboBox(){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("SELECT infoSec.full_name FROM infoSec_officer infoSec");
            List<String> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public List<infoSec_officer> infoSECOfficer_full_nameComboBoxActionPerformed(infoSec_officer infoSO_cndt){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM infoSec_officer WHERE full_name = :fullName");
            query.setParameter("fullName", infoSO_cndt.getFull_name());
            List<infoSec_officer> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

        public Integer infoSECOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(infoSec_officer infoSO_cndt){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE infoSec_officer SET candidate_votes = COALESCE(candidate_votes, 0) + 1 WHERE candidate_id = :candidateId");
            query.setParameter("candidateId", infoSO_cndt.getCandidate_id());
            Integer rowsAffected = query.executeUpdate();

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        }
        
            public Integer infoSECOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(infoSec_officer infoSO_cndt, voter vote){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            //Session
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE voter SET information_security_officer = :infoSOName WHERE voter_id = :voterId OR username = :username");
            query.setParameter("infoSOName", infoSO_cndt.getFull_name());
            query.setParameter("voterId", vote.getVoter_id());
            query.setParameter("username", vote.getUsername());
            Integer rowsAffected = query.executeUpdate();

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        }

public Integer EX_register_InfoSO_candidate(infoSec_officer info_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "INSERT INTO infoSec_officer (candidate_id, full_name, position, description, image) " +
                     "SELECT :candidateId, :fullName, :position, :description, :image FROM infoSec_officer";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", info_cndt.getCandidate_id());
        query.setParameter("fullName", info_cndt.getFull_name());
        query.setParameter("position", "INFORMATION SECURITY OFFICER");
        query.setParameter("description", info_cndt.getDescription());
        query.setParameter("image", info_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}


    
public Integer EX_update_InfoSO_candidate(infoSec_officer info_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "UPDATE infoSec_officer SET full_name = :fullName, position = :position, " +
                     "description = :description, image = :image WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", info_cndt.getCandidate_id());
        query.setParameter("fullName", info_cndt.getFull_name());
        query.setParameter("position", "INFORMATION SECURITY OFFICER");
        query.setParameter("description", info_cndt.getDescription());
        query.setParameter("image", info_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
 
public Integer EX_delete_InfoSO_candidate(infoSec_officer info_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "DELETE FROM infoSec_officer WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", info_cndt.getCandidate_id());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}            
}
