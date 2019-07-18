/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.FareChartService;
import com.rebeka.train.model.CompType;
import com.rebeka.train.model.FareChart;
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
public class FareChartServiceImpl implements FareChartService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertFareChart(FareChart cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(cm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateFareChart(String id, FareChart cm) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        FareChart oneproductobject = (FareChart) s.get(FareChart.class, id);
        oneproductobject.setFromstationid(cm.getFromstationid());
        oneproductobject.setTostationid(cm.getTostationid());
        oneproductobject.setComptypeid(cm.getComptypeid());
        oneproductobject.setPasstypeid(cm.getPasstypeid());
        
        oneproductobject.setFareamount(cm.getFareamount());
        
        s.update(oneproductobject);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteFareChart(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        FareChart pm = (FareChart) s.get(FareChart.class, id);
        s.delete(pm);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewFareChart() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<FareChart> farechartlist = s.createQuery("from FareChart").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(farechartlist);
        t.commit();
        s.close();
        return productslistgson;
    }

    @Override
    public FareChart viewOneFareChart(String id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        FareChart pm = (FareChart) s.get(FareChart.class, id);
        t.commit();
        s.close();
        return pm;
    }

}
