
package dao;

import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import model.guild_president;
import model.vice_president;
import model.voter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author observer
 */
public class vice_president_DAO {

    public vice_president_DAO() {
    }
public List<vice_president> readVicePresidentTable() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<vice_president> result = session.createQuery("FROM vice_president").list();
        session.close(); // Close the session after retrieving the data
        return result;
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList(); // Return an empty list instead of null
    }
}

    public Integer register_VP_candidate(vice_president vp_cndt) {
        Integer rowsAffected = 0;
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            session.save(vp_cndt);
            rowsAffected = 1;

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public boolean CHECK_IF_VP_NULL(voter voter) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT vice_president FROM voter WHERE voter_id = :voterId OR username = :username");
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

    public List<String> VP_assignFullNameTOComboBox() {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("SELECT vp.full_name FROM vice_president vp");
            List<String> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<vice_president> VP_full_nameComboBoxActionPerformed(vice_president vp_cndt) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM vice_president WHERE full_name = :fullName");
            query.setParameter("fullName", vp_cndt.getFull_name());
            List<vice_president> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer VP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(vice_president vp_cndt) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE vice_president SET candidate_votes = COALESCE(candidate_votes, 0) + 1 WHERE candidate_id = :candidateId");
            query.setParameter("candidateId", vp_cndt.getCandidate_id());
            Integer rowsAffected = query.executeUpdate();

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
    public Integer VP_voteBTN_ADD_VOTER_VOTING_STATUS(vice_president vp_cndt, voter vote) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            //Session
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE voter SET vice_president = :viceName WHERE voter_id = :voterId OR username = :username");
            query.setParameter("viceName", vp_cndt.getFull_name());
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
    
public Integer EX_register_VP_candidate(vice_president vp_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "INSERT INTO vice_president (candidate_id, full_name, position, description, image) " +
                     "SELECT :candidateId, :fullName, :position, :description, :image FROM vice_president";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", vp_cndt.getCandidate_id());
        query.setParameter("fullName", vp_cndt.getFull_name());
        query.setParameter("position", "VICE PRESIDENT");
        query.setParameter("description", vp_cndt.getDescription());
        query.setParameter("image", vp_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}


    
public Integer EX_update_VP_candidate(vice_president vp_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "UPDATE vice_president SET full_name = :fullName, position = :position, " +
                     "description = :description, image = :image WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", vp_cndt.getCandidate_id());
        query.setParameter("fullName", vp_cndt.getFull_name());
        query.setParameter("position", "VICE PRESIDENT");
        query.setParameter("description", vp_cndt.getDescription());
        query.setParameter("image", vp_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
 
public Integer EX_delete_VP_candidate(vice_president vp_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "DELETE FROM vice_president WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", vp_cndt.getCandidate_id());

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
