/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.TestService;
import com.rebeka.train.model.Test;
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
public class TestServiceImpl implements TestService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertTest(Test ts) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(ts);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateTest(String id, Test ts) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Test oneproductobject = (Test) s.get(Test.class, id);
        oneproductobject.setTestname(ts.getTestname());
        oneproductobject.setTestarea(ts.getTestarea());
        oneproductobject.setComptypeid(ts.getComptypeid());
        oneproductobject.setCompsubtypeid(ts.getCompsubtypeid());
        oneproductobject.setFromstationid(ts.getFromstationid());
        oneproductobject.setTostationid(ts.getTostationid());
        
        s.update(oneproductobject);
        t.commit();
        s.close();
        return null;

    }

    @Override
    public String deleteTest(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Test ts = (Test) s.get(Test.class, id);
        s.delete(ts);
        t.commit();
        s.close();
        return null;

    }

    @Override
    public String viewTest() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<Test> testlist = s.createQuery("from Test").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(testlist);
        t.commit();
        s.close();
        return productslistgson;
    }

    @Override
    public String viewOneTest(String id) {
        return null;
//        Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//        Test ts = (Test) s.get(Test.class, id);
////        Criteria criteria = s.createCriteria(Product.class).add(Restrictions.eq("productname", "A"));
////        Product p = null;
////        Object result = criteria.uniqueResult();
////            if (result != null) {
////                p = (Product) criteria.uniqueResult();
////                System.out.println("Genre = " + p.getProductname());
////            }
//        t.commit();
//        s.close();
//        return ts;
    
    }

   

}
