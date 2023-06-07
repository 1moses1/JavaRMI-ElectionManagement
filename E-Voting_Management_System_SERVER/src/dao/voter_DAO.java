package dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;
import model.voter;

import java.util.List;

public class voter_DAO {

    public voter_DAO() {
    }

    public List<voter> checkUsernameExistance(voter vote) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM voter WHERE username = :username");
            query.setParameter("username", vote.getUsername());
            List<voter> result = query.list();

            transaction.commit();
            return result;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Integer registerVoter(voter vote) {
        Integer rowAffected= 0;
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            session.save(vote);
            rowAffected = 1;

            transaction.commit();
            return rowAffected;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<voter> loginCall(voter vote) {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM voter WHERE (voter_id = :voterId OR username = :username) AND password = :password");
            query.setParameter("voterId", vote.getVoter_id());
            query.setParameter("username", vote.getUsername());
            query.setParameter("password", vote.getPassword());
            List<voter> result = query.list();

            transaction.commit();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<voter> readUsersTable() {
        try {
            //SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM voter");
            List<voter> result = query.list();

            transaction.commit();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public Integer deleteUser(voter vote) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("DELETE FROM voter WHERE voter_id = :voterId");
        query.setParameter("voterId", vote.getVoter_id());
        Integer rowsAffected = query.executeUpdate();

        transaction.commit();
        return rowsAffected;

    } catch (Exception e) {
        e.printStackTrace();
        return 0; 
    }
}

}
