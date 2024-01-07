package com.omega.dao;

import com.omega.models.Pilot;
import com.omega.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PilotDaoImpl implements PilotDao {
    @Override
    public void save(Pilot pilot) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(pilot);
        tx1.commit();
        session.close();
    }

    public List<Pilot> findAll() {
        return (List<Pilot>) HibernateSessionFactoryUtil.getSessionFactory().
                openSession().createQuery("From Pilot").list();
    }
}
