/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.PassengerTypeService;

import com.rebeka.train.model.PassengerType;
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
public class PassengerTypeServiceImpl implements PassengerTypeService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertPassengerType(PassengerType cm) {
          Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updatePassengerType(PassengerType cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.update(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deletePassengerType(String id) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        PassengerType cm = (PassengerType) s.get(PassengerType.class, id);
        s.delete(cm);
        t.commit();
        s.close();
        return null; 
    }

    @Override
    public String viewPassengerType() {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<PassengerType> categorieslist = s.createQuery("from PassengerType").list();
        Gson g = new Gson();
        String categorylistgson = g.toJson(categorieslist);
        t.commit();
        s.close();
        System.out.println(categorylistgson);
        return categorylistgson; 
    }

    @Override
    public PassengerType viewOnePassengerType(String id) {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        PassengerType cm = (PassengerType) s.get(PassengerType.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String categorygson = g.toJson(cm);
        return cm;
    }
}
