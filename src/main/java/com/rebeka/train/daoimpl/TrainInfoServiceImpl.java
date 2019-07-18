/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.TrainInfoService;

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
public class TrainInfoServiceImpl implements TrainInfoService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertTrainInfo(TrainInfo cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;

    }

    @Override
    public String updateTrainInfo(String id, TrainInfo cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainInfo oneproductobject = (TrainInfo) s.get(TrainInfo.class, id);
        oneproductobject.setTrainnub(cm.getTrainnub());
        oneproductobject.setTrainname(cm.getTrainname());
        oneproductobject.setFromstationid(cm.getFromstationid());
        oneproductobject.setTostationid(cm.getTostationid());
        oneproductobject.setDepttime(cm.getDepttime());
        oneproductobject.setArrivtime(cm.getArrivtime());
        oneproductobject.setDayoff(cm.getDayoff());

        s.update(oneproductobject);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteTrainInfo(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainInfo pm = (TrainInfo) s.get(TrainInfo.class, id);
        s.delete(pm);
        t.commit();
        s.close();

        return null;

    }

    @Override
    public String viewTrainInfo() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<TrainInfo> farechartlist = s.createQuery("from TrainInfo").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(farechartlist);
        t.commit();
        s.close();
        //System.out.println(categorylistgson);
        return productslistgson;

    }

    @Override
    public TrainInfo viewOneTrainInfo(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainInfo pm = (TrainInfo) s.get(TrainInfo.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String categorygson = g.toJson(pm);
        return pm;

    }



    @Override
    public String searchTrain(TrainInfo cm) {

        Date d = cm.getD();
        String  dd = new SimpleDateFormat("EEEEE").format(d);
        String fstation = cm.getFromstationid();
        String tstation = cm.getTostationid();

//       Session s = sessionFactory.openSession();
//        Transaction t = s.getTransaction();
//        t.begin();
//        List<TrainInfo> weekend = s.createQuery("select t from TrainInfo t where dayoff=? and fromstationid=? and tostationid=?").setParameter(datString, 0).list();
//        
//        return null;
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();

        List<TrainInfo> weekend = s.createQuery("select u from TrainInfo u where dayoff=?").setParameter(0, dd).list();
//        Query q=s.createQuery("select * from Traininfo where fromstationid=?,tostationid=?,dayoff=?").setParameter(0,fromstid).setParameter(1, tostid).setParameter(2, dates);
        if (weekend.size() > 0) {
            Gson g = new Gson();
            String traininfogson = g.toJson("");
            return traininfogson;
        } else {


            List<TrainInfo> pm = s.createQuery("select t from TrainInfo t where  fromstationid=? and tostationid=?").setParameter(0, fstation).setParameter(1, tstation).list();

            Gson g = new Gson();
            String traininfogson = g.toJson(pm);
            t.commit();
            s.close();
            return traininfogson;
        }
    }

    @Override
    public TrainInfo buyticket(String tid) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        TrainInfo pm = (TrainInfo) s.get(TrainInfo.class, tid);
        t.commit();
        s.close();
        return pm;
    }

    @Override
    public String addReservation(Reservation resid) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(resid);
        t.commit();
        s.close();
       return null;
    }

    @Override
    public TrainInfo strain(TrainInfo ti) {
        return null;
       
    }
    
    
    
    
    
    
    

}
