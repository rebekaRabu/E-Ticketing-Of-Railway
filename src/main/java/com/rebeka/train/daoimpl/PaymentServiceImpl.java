/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.PaymentService;
import com.rebeka.train.model.Payment;
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
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertPayment(Payment pi) {
       Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(pi);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewPayment() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<Payment>  paymentist = s.createQuery("from Payment").list();
        Gson g = new Gson();
        String productslistgson = g.toJson(paymentist);
        t.commit();
        s.close();
        return productslistgson;
    }

    @Override
    public Payment viewonePayment(String id) {
         Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Payment pm = (Payment) s.get(Payment.class, id);
        t.commit();
        s.close();
        return pm;
    }
}
