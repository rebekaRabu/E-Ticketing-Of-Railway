/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.CompSubTypeService;
import com.rebeka.train.model.CompSubType;
import com.rebeka.train.model.CompType;
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
public class CompSubTypeServiceImpl implements CompSubTypeService{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertCompSubType(CompSubType cm) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateCompSubType(CompSubType cm) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.update(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteCompSubType(String id) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        CompSubType cm = (CompSubType) s.get(CompSubType.class, id);
        s.delete(cm);
        t.commit();
        s.close();
        return null; 
    }

    @Override
    public String viewCompSubType() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<CompSubType> categorieslist = s.createQuery("from CompSubType").list();
        Gson g = new Gson();
        String categorylistgson = g.toJson(categorieslist);
        t.commit();
        s.close();
        System.out.println(categorylistgson);
        return categorylistgson; 
    }

    @Override
    public CompSubType viewOneCompType(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        CompSubType cm = (CompSubType) s.get(CompSubType.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String categorygson = g.toJson(cm);
        return cm;
    }

}
