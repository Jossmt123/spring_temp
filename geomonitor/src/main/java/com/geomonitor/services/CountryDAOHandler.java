package com.geomonitor.services;

import com.geomonitor.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDAOHandler implements CountryDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void save(Country c){

        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.persist(c);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<Country> list(){

        Session session = this.sessionFactory.openSession();
        List<Country> countryList = session.createQuery("from Country").list();
        session.close();

        return countryList;
    }
}
