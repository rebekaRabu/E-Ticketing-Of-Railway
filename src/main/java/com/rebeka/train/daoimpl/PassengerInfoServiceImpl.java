/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.daoimpl;

import com.google.gson.Gson;
import com.rebeka.train.dao.PassengerInfoService;
import com.rebeka.train.model.PassengerInfo;
import com.rebeka.train.model.User;
import com.rebeka.train.model.UserRole;
import java.util.List;
import org.hibernate.Query;
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
public class PassengerInfoServiceImpl implements PassengerInfoService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String acceptPassenger(PassengerInfo cm) {
        return null;
       
    }

    @Override
    public String insertPassengerInfo(PassengerInfo cm) {
        String status;
        try {
            Session s = sessionFactory.openSession();
            Transaction t = s.getTransaction();
            t.begin();
            
            User u =new User();
            UserRole ur= new UserRole();
            
            u.setEmailid(cm.getEmailid());
            u.setPhone(cm.getPhone());
            u.setUsername(cm.getPassengername());
            
            ur.setEmailid(cm.getEmailid());
            ur.setPassword(cm.getPassword());
            ur.setRole(cm.getRole());
            ur.setStatus(cm.getStatus());
            
            
            s.save(cm);
            s.save(u);
            s.save(ur);
            
            t.commit();
            s.close();
            status = "Success";
            

            //logger.info("End of insert user method in userservice impl");
        } catch (Exception e) {
            //logger.info("inside catch accept user method in userservice impl");
            e.printStackTrace();
            status = "Fail";
        }
        return status;
    }

    @Override
    public String updatePassengerInfo(PassengerInfo cm) {
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
    public String deletePassengerInfo(String id) {
        return null;
        
    }

    @Override
    public String viewPassengerInfo() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<PassengerInfo> categorieslist = s.createQuery("from PassengerInfo").list();
        Gson g = new Gson();
        String categorylistgson = g.toJson(categorieslist);
        t.commit();
        s.close();
        //System.out.println(categorylistgson);
        return categorylistgson;
        
    }

    @Override
    public PassengerInfo viewOnePassengerInfo(String id) {
       return null;
    }

    @Override
    public PassengerInfo viewOnePassengermail(String email) {
       Session s=sessionFactory.openSession();
        Transaction t=s.getTransaction();
        t.begin();
        Query q = s.createQuery("from PassengerInfo where emailid=?");
        q.setString(0, email);
        
        List<PassengerInfo> pi=q.list();
        t.commit();
        s.close();
       return pi.get(0);
       
    }

   

}
