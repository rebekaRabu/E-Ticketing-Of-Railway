/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.CompTypeService;
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
public class CompTypeServiceImpl implements CompTypeService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertCompType(CompType cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateCompType(CompType cm) {
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
    public String deleteCompType(String id) {
          Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        CompType cm = (CompType) s.get(CompType.class, id);
        s.delete(cm);
        t.commit();
        s.close();

        return null; 
    }

    @Override
    public String viewCompType() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<CompType> categorieslist = s.createQuery("from CompType").list();
        Gson g = new Gson();
        String categorylistgson = g.toJson(categorieslist);
        t.commit();
        s.close();
        System.out.println(categorylistgson);
        return categorylistgson; 
    }

    @Override
    public CompType viewOneCompType(String id) {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        CompType cm = (CompType) s.get(CompType.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String categorygson = g.toJson(cm);
        return cm;
    }

    @Override
    public String searchTrainSecond(CompType cm) {
        return null;
        
//        String comptype = cm.getComptypeid();
//        
//
////       Session s = sessionFactory.openSession();
////        Transaction t = s.getTransaction();
////        t.begin();
////        List<TrainInfo> weekend = s.createQuery("select t from TrainInfo t where dayoff=? and fromstationid=? and tostationid=?").setParameter(datString, 0).list();
////        
////        return null;
//        Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//
//            ListCompType> pm = s.createQuery("select t from CompType t where comptypeid=?").setParameter(0, comptype)).list();
//
//            
//            t.commit();
//            s.close();
//            return pm;
        
        }
}
