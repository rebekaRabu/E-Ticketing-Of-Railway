///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.rebeka.train.daoimpl;
//
//import com.rebeka.train.dao.User1Service;
//import com.rebeka.train.model.User1;
//import com.rebeka.train.model.UserRole;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
///**
// *
// * @author acer
// */
//@Repository
//public class User1ServiceImpl  implements User1Service{
//    
//    @Autowired
//    SessionFactory sessionFactory;
//
//    
//     @Override
//    public String acceptUser1(User1 u1) {
//        return null;
//       
//    }
//    
//    
//    @Override
//    public String insertUser1(User1 u1) {
//        String status;
//        
//        try{
//            Session s =sessionFactory.openSession();
//            Transaction t=s.getTransaction();
//            t.begin();
//            
//            UserRole role = new UserRole();
//            role.setEmailid(u1.getEmailid());
//            role.setPassword(u1.getPassword());
//            s.save(role);
//            
//            s.save(u1);
//            t.commit();
//            s.close();
//            status ="success";
//            
//            
//        }catch(Exception e){
//            e.printStackTrace();
//            status="fail";
//        }
//        return null;
//        
//    }
//
//    @Override
//    public String updateUser1(User1 u1) {
//        return null;
//       
//    }
//
//    @Override
//    public String deleteUser1(User1 u1) {
//        return null;
//       
//    }
//
//    @Override
//    public String viewUser1(User1 u1) {
//        
//       
//    }
//
//    @Override
//    public User1 viewOneUser1(User1 u1) {
//        return null;
//       
//        
//        
//        
//    }
//
//   
//    
//    
//    
//}
