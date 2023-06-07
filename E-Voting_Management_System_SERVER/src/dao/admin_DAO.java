package dao;

import java.sql.*;
import java.util.List;
import model.admin;
import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class admin_DAO {

    //private SessionFactory sessionFactory;

    public admin_DAO() {
    }

public Integer getTotalUsersCount() {
    String query = "SELECT COUNT(*) FROM voter";

    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int count = Math.toIntExact((long) session.createQuery(query).uniqueResult());
        session.close();
        return count;
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}


    public List<String> assignItemsToGuildPresidentComboBox() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT gp.full_name FROM guild_president gp";
            List<String> rs = session.createQuery(hql).list();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

public List<Object[]> leading_GP_positionComboBox() {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT gp.full_name, gp.candidate_votes FROM guild_president gp WHERE gp.candidate_votes = (SELECT MAX(gp2.candidate_votes) FROM guild_president gp2)";
        List<Object[]> result = session.createQuery(hql).list();
        return result;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}


    public List<Object[]> leading_VP_positionComboBox() {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT vp.full_name, vp.candidate_votes FROM vice_president vp WHERE vp.candidate_votes = (SELECT MAX(vp2.candidate_votes) FROM vice_president vp2)";
            List<Object[]> result = session.createQuery(hql).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Object[]> leading_EC_positionComboBox() {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT ec.full_name, ec.candidate_votes FROM events_coordinator ec WHERE ec.candidate_votes = (SELECT MAX(ec2.candidate_votes) FROM events_coordinator ec2)";
            List<Object[]> result = session.createQuery(hql).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Object[]> leading_ISO_positionComboBox() {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT infoSO.full_name, infoSO.candidate_votes FROM infoSec_officer infoSO WHERE infoSO.candidate_votes = (SELECT MAX(infoSO2.candidate_votes) FROM infoSec_officer infoSO2)";
            List<Object[]> result = session.createQuery(hql).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Object[]> leading_IntStud_positionComboBox() {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT interSO.full_name, interSO.candidate_votes FROM interStudent_officer interSO WHERE interSO.candidate_votes = (SELECT MAX(interSO2.candidate_votes) FROM interStudent_officer interSO2)";
            List<Object[]> result = session.createQuery(hql).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<String> assignItemsToVicePresidentComboBox() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT vp.full_name FROM vice_president vp";
            List<String> rs = session.createQuery(hql).list();
            return rs;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

  public List<String> assignItemsToInformationSecurityOfficertComboBox() {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT infoSO.full_name FROM infoSec_officer infoSO";
            List<String> result = session.createQuery(hql).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<String> assignItemsToInternationStudentsOfficertoComboBox() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT interSO.full_name FROM interStudent_officer interSO";
            List<String> rs = session.createQuery(hql).list();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<String> assignItemsToEventsCoordinatortoComboBox() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT ec.full_name FROM events_coordinator ec";
            List<String>  rs = session.createQuery(hql).list();
            return rs;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<guild_president> full_name_guild_presidentComboBoxActionPerformed(admin input) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM guild_president WHERE full_name = :name";
            List<guild_president> result = session.createQuery(hql)
                    .setParameter("name", input.getGuild_president_selectedItem()).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<vice_president> full_name_vice_presidentComboBoxActionPerformed(admin UInput) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM vice_president WHERE full_name = :name";
            List<vice_president> result = session.createQuery(hql)
                    .setParameter("name", UInput.getVice_president_selectedItem()).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<infoSec_officer> full_name_information_security_officerComboBoxActionPerformed(admin UInput) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM infoSec_officer WHERE full_name = :name";
            List<infoSec_officer> result = session.createQuery(hql)
                    .setParameter("name", UInput.getInformation_security_officer_selectedItem()).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<interStudent_officer> full_name_international_student_officerComboBoxActionPerformed(admin UInput) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM interStudent_officer WHERE full_name = :name";
            List<interStudent_officer> result = session.createQuery(hql)
                    .setParameter("name", UInput.getInternational_student_officer_selectedItem()).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<events_coordinator> full_name_events_coordinatorComboBoxActionPerformed(admin UInput) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM events_coordinator WHERE full_name = :name";
            List<events_coordinator> result = session.createQuery(hql)
                    .setParameter("name", UInput.getEvents_coordinator_selectedItem()).list();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

