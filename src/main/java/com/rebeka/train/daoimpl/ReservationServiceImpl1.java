/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.ReservationService1;
import com.rebeka.train.model.Reservation1;
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
public class ReservationServiceImpl1 implements  ReservationService1{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertReservation(Reservation1 rv) {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(rv);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateReservation(String res_id, Reservation1 rv) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Reservation1 oneproductobject = (Reservation1) s.get(Reservation1.class, res_id);
        oneproductobject.setPassid(rv.getPassid());
        oneproductobject.setResdate(rv.getResdate());
        oneproductobject.setPtn(rv.getPtn());
        oneproductobject.setTrainid(rv.getTrainid());
        oneproductobject.setResstatus(rv.getResstatus());
        oneproductobject.setAdult(rv.getAdult());
        oneproductobject.setChild(rv.getChild());
        oneproductobject.setEmailid(rv.getEmailid());

        s.update(oneproductobject);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteReservation(String res_id) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Reservation1 pm = (Reservation1) s.get(Reservation1.class, res_id);
        s.delete(pm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewReservation() {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<Reservation1> productslist = s.createQuery("from Reservation1").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(productslist);
        t.commit();
        s.close();
        return productslistgson;
    }

    @Override
    public Reservation1 viewOneReservation(String res_id) {
          Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Reservation1 pm = (Reservation1) s.get(Reservation1.class, res_id);
        t.commit();
        s.close();
        return pm;
    }
}
