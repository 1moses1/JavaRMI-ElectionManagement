
package dao;


import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import model.guild_president;
import model.voter;
import org.hibernate.*;

/**
 *
 * @author observer
 */
public class guild_president_DAO {

    public guild_president_DAO() {
    }

public List<guild_president> readGuildPresidentTable() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<guild_president> result = session.createQuery("FROM guild_president").list();
        session.close(); // Close the session after retrieving the data
        return result;
    } catch (Exception e) {
        e.printStackTrace();
        return Collections.emptyList(); // Return an empty list instead of null
    }
}


        public int register_GP_candidate(guild_president gp_cndt) {
            int rowsAffected = 0;
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();

                session.save(gp_cndt);
                rowsAffected = 1;

                transaction.commit();
                return rowsAffected;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }



public boolean CHECK_IF_GP_NULL(voter voter) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT guild_president FROM voter WHERE voter_id = :voterId OR username = :username");
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
            

        public List<String> GP_assignFullNameTOComboBox() {
            try {
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();

                Query query = session.createQuery("SELECT gp.full_name FROM guild_president gp");
                List<String> result = query.list();

                transaction.commit();
                session.close();
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

    
    public List<guild_president> GP_full_nameComboBoxActionPerformed(guild_president gp_cndt) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM guild_president WHERE full_name = :fullName");
            query.setParameter("fullName", gp_cndt.getFull_name());
            List<guild_president> result = query.list();

            transaction.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer GP_voteBTN_CHECK_ADD_VOTE_TO_CANDIDATE(guild_president gp_cndt) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE guild_president SET candidate_votes = COALESCE(candidate_votes, 0) + 1 WHERE candidate_id = :candidateId");
            query.setParameter("candidateId", gp_cndt.getCandidate_id());
            Integer rowsAffected = query.executeUpdate();

            transaction.commit();
            return rowsAffected;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
    public Integer GP_voteBTN_ADD_VOTER_VOTING_STATUS(guild_president gp_cndt, voter vote) {
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("UPDATE voter SET guild_president = :guildName WHERE voter_id = :voterId OR username = :username");
            query.setParameter("guildName", gp_cndt.getFull_name());
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
    
public Integer EX_register_GP_candidate(guild_president gp_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "INSERT INTO guild_president (candidate_id, full_name, position, description, image) " +
                     "SELECT :candidateId, :fullName, :position, :description, :image FROM guild_president";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", gp_cndt.getCandidate_id());
        query.setParameter("fullName", gp_cndt.getFull_name());
        query.setParameter("position", "GUILD PRESIDENT");
        query.setParameter("description", gp_cndt.getDescription());
        query.setParameter("image", gp_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}


    
public Integer EX_update_GP_candidate(guild_president gp_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "UPDATE guild_president SET full_name = :fullName, position = :position, " +
                     "description = :description, image = :image WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", gp_cndt.getCandidate_id());
        query.setParameter("fullName", gp_cndt.getFull_name());
        query.setParameter("position", "GUILD PRESIDENT");
        query.setParameter("description", gp_cndt.getDescription());
        query.setParameter("image", gp_cndt.getImage());

        int rowsAffected = query.executeUpdate();

        transaction.commit();
        session.close();
        return rowsAffected;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
 
public Integer EX_delete_GP_candidate(guild_president gp_cndt) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "DELETE FROM guild_president WHERE candidate_id = :candidateId";
        Query query = session.createQuery(hql);
        query.setParameter("candidateId", gp_cndt.getCandidate_id());

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
