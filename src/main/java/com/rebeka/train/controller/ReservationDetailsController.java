///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.rebeka.train.controller;
//
//import com.rebeka.train.dao.CompSubTypeService;
//import com.rebeka.train.dao.FareChartService;
//import com.rebeka.train.dao.ReservationDetailsService;
//import com.rebeka.train.dao.ReservationService;
//import com.rebeka.train.dao.TrainInfoService;
//import com.rebeka.train.model.ReservationDetails;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// *
// * @author acer
// */
//@Controller
//public class ReservationDetailsController {
//    
//  @Autowired
//    ReservationDetailsService rsddao;
//    @Autowired
//    ReservationService  rsdao ;
//    @Autowired
//    CompSubTypeService cstsdao;
//    @Autowired
//    FareChartService fcsdao;
//     @Autowired
//    TrainInfoService tisdao;
//     
    
//    resdetid, reservid, compsubtypeid, seatno, journeydate, trainid, farechartid
    
    
    
//    @InitBinder
//    public void myInitBinder(WebDataBinder binder) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//        binder.registerCustomEditor(Date.class, "journeydate", new CustomDateEditor(format, false));
//    }
//    
//     @RequestMapping("/showreservationdetailspage")
//    public ModelAndView showreservationpage() {
//        String reservationdetaillist=rsddao.viewReservationDetails();
//        String reservationslist = rsdao.viewReservation();
//       String compartservicelist = cstsdao.viewCompSubType();
//       String farechartslist = fcsdao.viewFareChart();
////       
//        ModelAndView mv = new ModelAndView("addreservationdetails", "newreservationdetailsObject", new ReservationDetails());
//        mv.addObject("reservationdetaillist", reservationdetaillist);
//        mv.addObject("reservationslist", reservationslist);
//        mv.addObject("compartservicelist", compartservicelist);
//        mv.addObject("farechartslist", farechartslist);
//        mv.addObject("check", "true");
//        return mv;
//    }
    
    
//    @InitBinder
//    public void myInitBinder(WebDataBinder binder) {
// 
//        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//        binder.registerCustomEditor(Date.class, "journeydate", new CustomDateEditor(format, false));
//    }
//    
////    resdetid, reservid, compsubtypeid, seatno, journeydate, trainid, farechartid
//     @RequestMapping("/showreservationdetailspage")
//    public ModelAndView showreservationpage() {
//        String reservationdetaillist=rsddao.viewReservationDetails();
//        String reservationslist = rsdao.viewReservation();
//       String compartservicelist = cstsdao.viewCompSubType();
//       String farechartslist = fcsdao.viewFareChart();
//       String traininfolist = tisdao.viewTrainInfo();
////        User uu=new User();
////        uu.getEmailid();
//        ModelAndView mv = new ModelAndView("reservationdetails", "newreservationdetailsObject", new ReservationDetails());
//        mv.addObject("reservationdetaillist", reservationdetaillist);
//        mv.addObject("reservationslist", reservationslist);
//        mv.addObject("compartservicelist", compartservicelist);
//        mv.addObject("farechartslist", farechartslist);
//        mv.addObject("traininfolist", traininfolist);
//        mv.addObject("check", "true");
//        return mv;
//    }
//}
