/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.TrainService;
import com.rebeka.train.model.FareChart;
import com.rebeka.train.model.Train;
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
public class TrainServiceImpl implements TrainService{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String create(Train train) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(train);
        t.commit();
        s.close();
        return null;
    }

//    @Override
//    public String update(Train train) {
//        
//    }

   @Override
    public String findAll() {//view
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<Train> farechartlist = s.createQuery("from Train").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(farechartlist);
        t.commit();
        s.close();
        return productslistgson; 
    
    }

    @Override
    public Train find(String sourcestion, String desstion, int da) {//search
        return null;
//         Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//        Train pm = (Train) s.get(Train.class, sourcestion , desstion, da );
//        t.commit();
//        s.close();
//        return pm;
    }

   
    
}
