/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.ReservationService;
import com.rebeka.train.model.Reservation;
import com.rebeka.train.model.TrainInfo;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class ReservationServiceImpl implements ReservationService{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertReservation(Reservation rs) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(rs);
        t.commit();
        s.close();
        return null;
        
        
    }
//reservid, passengerid, comptypeid, compsubtypeid, trainid, fromstationid, tostationid, adult, child, reservdate, journeydate, status
    @Override
    public String updateReservation(String id, Reservation rs) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Reservation oneproductobject = (Reservation) s.get(Reservation.class, id);
        oneproductobject.setPassengerid(rs.getPassengerid());
        oneproductobject.setComptypeid(rs.getComptypeid());
        oneproductobject.setCompsubtypeid(rs.getCompsubtypeid());
        oneproductobject.setTrainid(rs.getTrainid());
        oneproductobject.setFromstationid(rs.getFromstationid());
        oneproductobject.setTostationid(rs.getTostationid());
        
        oneproductobject.setAdult(rs.getAdult());
        oneproductobject.setChild(rs.getChild());
        oneproductobject.setReservdate(rs.getReservdate());
        oneproductobject.setJourneydate(rs.getJourneydate());
        oneproductobject.setStatus(rs.getStatus());
        
        s.update(oneproductobject);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteReservation(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Reservation pm = (Reservation) s.get(Reservation.class, id);
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
        List<Reservation> farechartlist = s.createQuery("from Reservation").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(farechartlist);
        t.commit();
        s.close();
        return productslistgson;
    }

    @Override
    public Reservation viewOneReservation(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Reservation pm = (Reservation) s.get(Reservation.class, id);
        t.commit();
        s.close();
        return pm;
    }
    
    
    
    
    //===========================================
    //===========================================

    
   

    
    
    
}
