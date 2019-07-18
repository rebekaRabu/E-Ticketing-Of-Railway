/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.ReservationDetailsService;
import com.rebeka.train.model.ReservationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public class ReservationDetailsServiceImpl implements ReservationDetailsService{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertReservationDetails(ArrayList<ReservationDetails> reservationdetails) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        for (ReservationDetails details : reservationdetails) {
            s.save(details);
        }
        t.commit();
        s.close();
        return null;
    }

   

    @Override
    public String viewReservationDetails() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<ReservationDetails> productslist = s.createQuery("from ReservationDetails").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(productslist);
        t.commit();
        s.close();
        return productslistgson; }

    @Override
    public ReservationDetails viewOneReservationDetails(String id) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        ReservationDetails pm = (ReservationDetails) s.get(ReservationDetails.class, id);
        t.commit();
        s.close();
        return pm;
    }
    
    
    
}
