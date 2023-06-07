package dao;

import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import org.hibernate.*;
import model.events_coordinator;
import model.voter;

public class events_coordinator_DAO {

    public events_coordinator_DAO() {
    }

public List<events_coordinator> readEventsCoordinatorTable() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<events_coordinator> result = session.createQuery("FROM events_coordinator").list();
        session.close(); // Close the session after retrieving the data
        return result;
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList(); // Return an empty list instead of null
    }
}

    public Integer register_EC_candidate(events_coordinator ec_cndt) {
        Integer rowsAffected = 0;
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            session.save(ec_cndt);
            rowsAffected = 1;

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public boolean CHECK_IF_EVENTS_COORDINATOR_NULL(voter voter) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT events_coordinator FROM voter WHERE voter_id = :voterId OR username = :username");
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

    

    public List<String> EC_assignFullNameTOComboBox() {
        try {
           //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("SELECT ec.full_name FROM events_coordinator ec");
            List<String> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<events_coordinator> EC_full_nameComboBoxActionPerformed(events_coordinator ec_cndt) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM events_coordinator WHERE full_name = :fullName");
            query.setParameter("fullName", ec_cndt.getFull_name());
            List<events_coordinator> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer EC_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(events_coordinator ec_cndt) {
        Integer rowsAffected=0;
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE events_coordinator SET candidate_votes = COALESCE(candidate_votes, 0) + 1 WHERE candidate_id = :candidateId");
            query.setParameter("candidateId", ec_cndt.getCandidate_id());
            rowsAffected = query.executeUpdate();
            //rowsAffected = 1;
            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer EC_voteBTN_ADD_VOTER_VOTING_STATUS(events_coordinator ec_cndt, voter vote) {
        Integer rowsAffected=0;
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            //Session
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE voter SET events_coordinator = :coordinatorName WHERE voter_id = :voterId OR username = :username");
            query.setParameter("coordinatorName", ec_cndt.getFull_name());
            query.setParameter("voterId", vote.getVoter_id());
            query.setParameter("username", vote.getUsername());
            query.executeUpdate();
            rowsAffected = 1;
            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
public Integer EX_register_EC_candidate(events_coordinator ec_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "INSERT INTO events_coordinator (candidate_id, full_name, position, description, image) " +
                     "SELECT :candidateId, :fullName, :position, :description, :image FROM events_coordinator";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", ec_cndt.getCandidate_id());
        query.setParameter("fullName", ec_cndt.getFull_name());
        query.setParameter("position", "EVENTS COORDINATOR");
        query.setParameter("description", ec_cndt.getDescription());
        query.setParameter("image", ec_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}


    
public Integer EX_update_EC_candidate(events_coordinator ec_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "UPDATE events_coordinator SET full_name = :fullName, position = :position, " +
                     "description = :description, image = :image WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", ec_cndt.getCandidate_id());
        query.setParameter("fullName", ec_cndt.getFull_name());
        query.setParameter("position", "EVENTS COORDINATOR");
        query.setParameter("description", ec_cndt.getDescription());
        query.setParameter("image", ec_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
 
public Integer EX_delete_EC_candidate(events_coordinator ec_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "DELETE FROM events_coordinator WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", ec_cndt.getCandidate_id());

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
