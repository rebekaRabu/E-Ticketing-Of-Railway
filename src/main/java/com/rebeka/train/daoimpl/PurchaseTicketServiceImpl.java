/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.PurchaseTicketService;
import com.rebeka.train.model.PurchaseTicket;
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
public class PurchaseTicketServiceImpl implements PurchaseTicketService{
    
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertPurchaseTicket(PurchaseTicket cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updatePurchaseTicket(int id, PurchaseTicket cm) {
//        Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//        PurchaseTicket oneproductobject = (PurchaseTicket) s.get(PurchaseTicket.class, id);
//        
//        oneproductobject.setFromstationid(cm.getFromstationid());
//        oneproductobject.setTostationid(cm.getTostationid());
//        
//        
//        
//        s.update(oneproductobject);
//        t.commit();
//        s.close();
        return null;
    }

    @Override
    public String removePurchaseTicket(int id) {
//          Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//        PurchaseTicket pm = (PurchaseTicket) s.get(PurchaseTicket.class, id);
//        s.delete(pm);
//        t.commit();
//        s.close();
        return null;
    }

    @Override
    public String viewPurchaseTicket() {
          Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<PurchaseTicket> farechartlist = s.createQuery("from PurchaseTicket").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(farechartlist);
        t.commit();
        s.close();
        return productslistgson;
    }

    @Override
    public PurchaseTicket viewOnePurchaseTicket(int id) {
        return null;
//        Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//        PurchaseTicket pm = (PurchaseTicket) s.get(PurchaseTicket.class, id);
//        t.commit();
//        s.close();
//        return pm;


    }
    
    
    
}
