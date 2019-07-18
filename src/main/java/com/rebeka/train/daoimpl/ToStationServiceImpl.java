/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.ToStationService;
import com.rebeka.train.model.FromStation;
import com.rebeka.train.model.ToStation;
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
public class ToStationServiceImpl implements ToStationService{
     @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertToStation(ToStation cm) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    
    }

    @Override
    public String updateToStation(ToStation cm) {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        //CategoriesModel cm = (CategoriesModel)s.get(CategoriesModel.class, categoryid);
        s.update(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteToStation(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        ToStation cm = (ToStation) s.get(ToStation.class, id);
        s.delete(cm);
        t.commit();
        s.close();

        return null;
    }

    @Override
    public String viewToStation() {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<ToStation> categorieslist = s.createQuery("from ToStation").list();
        Gson g = new Gson();
        String categorylistgson = g.toJson(categorieslist);
        t.commit();
        s.close();
        //System.out.println(categorylistgson);
        return categorylistgson;
    }

    @Override
    public ToStation viewOneCompType(String id) {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        ToStation cm = (ToStation) s.get(ToStation.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String categorygson = g.toJson(cm);
        return cm;
    }
     
}
