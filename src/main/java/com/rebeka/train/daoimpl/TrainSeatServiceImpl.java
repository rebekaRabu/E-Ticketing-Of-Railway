/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.TrainSeatService;
import com.rebeka.train.model.Station;
import com.rebeka.train.model.TrainSeat;
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
public class TrainSeatServiceImpl implements TrainSeatService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertTrainSeat(TrainSeat cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateTrainSeat(String id, TrainSeat cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainSeat oneproductobject = (TrainSeat) s.get(TrainSeat.class, id);
        
        oneproductobject.setTrainid(cm.getTrainid());
        oneproductobject.setComptypeid(cm.getComptypeid());
        oneproductobject.setCompsubtypeid(cm.getCompsubtypeid());
        oneproductobject.setTotalseat(cm.getTotalseat());
        
        s.update(oneproductobject);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteTrainSeat(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainSeat pm = (TrainSeat) s.get(TrainSeat.class, id);
        s.delete(pm);
        t.commit();
        s.close();

        return null;
    }

    @Override
    public String viewTrainSeat() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<TrainSeat> farechartlist = s.createQuery("from TrainSeat").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(farechartlist);
        t.commit();
        s.close();
        //System.out.println(categorylistgson);
        return productslistgson;
    }

    @Override
    public TrainSeat viewOneTrainSeat(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainSeat pm = (TrainSeat) s.get(TrainSeat.class, id);
        t.commit();
        s.close();
        return pm;
        
        
    }

}
