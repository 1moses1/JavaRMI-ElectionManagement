
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import model.interStudent_officer;
import model.voter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author observer
 */
public class interStudent_officer_DAO {

    public interStudent_officer_DAO() {
    }


public List<interStudent_officer> readinterStudent_officerTable() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<interStudent_officer> result = session.createQuery("FROM interStudent_officer").list();
        session.close(); // Close the session after retrieving the data
        return result;
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList(); // Return an empty list instead of null
    }
}


    public Integer register_InternationalSO_candidate(interStudent_officer interSO_cndt){
        Integer rowsAffected = 0;
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            session.save(interSO_cndt);
            rowsAffected = 1;

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public boolean CHECK_IF_InterSO_NULL(voter voter) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT international_student_officer FROM voter WHERE voter_id = :voterId OR username = :username");
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
            
    public List<String> INTERSTOfficer_assignFullNameTOComboBox(){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("SELECT interSO.full_name FROM interStudent_officer interSO");
            List<String> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<interStudent_officer> INTERSTOfficer_full_nameComboBoxActionPerformed(interStudent_officer interSO_cndt){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM interStudent_officer WHERE full_name = :fullName");
            query.setParameter("fullName", interSO_cndt.getFull_name());
            List<interStudent_officer> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public Integer INTERSTOfficer_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(interStudent_officer interSO_cndt){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE interStudent_officer SET candidate_votes = COALESCE(candidate_votes, 0) + 1 WHERE candidate_id = :candidateId");
            query.setParameter("candidateId", interSO_cndt.getCandidate_id());
            Integer rowsAffected = query.executeUpdate();

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        }
        
    public Integer INTERSTOfficer_voteBTN_ADD_VOTER_VOTING_STATUS(interStudent_officer interSO_cndt, voter vote){
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            //Session
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE voter SET international_student_officer = :interSOName WHERE voter_id = :voterId OR username = :username");
            query.setParameter("interSOName", interSO_cndt.getFull_name());
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
    
public Integer EX_register_InterSO_candidate(interStudent_officer inter_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "INSERT INTO interStudent_officer (candidate_id, full_name, position, description, image) " +
                     "SELECT :candidateId, :fullName, :position, :description, :image FROM interStudent_officer";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", inter_cndt.getCandidate_id());
        query.setParameter("fullName", inter_cndt.getFull_name());
        query.setParameter("position", "INTERNATIONAL STUDENTS OFFICER");
        query.setParameter("description", inter_cndt.getDescription());
        query.setParameter("image", inter_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}


    
public Integer EX_update_InterSO_candidate(interStudent_officer inter_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "UPDATE interStudent_officer SET full_name = :fullName, position = :position, " +
                     "description = :description, image = :image WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", inter_cndt.getCandidate_id());
        query.setParameter("fullName", inter_cndt.getFull_name());
        query.setParameter("position", "INTERNATIONAL STUDENTS OFFICER");
        query.setParameter("description", inter_cndt.getDescription());
        query.setParameter("image", inter_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
 
public Integer EX_delete_InterSO_candidate(interStudent_officer inter_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "DELETE FROM interStudent_officer WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", inter_cndt.getCandidate_id());

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
