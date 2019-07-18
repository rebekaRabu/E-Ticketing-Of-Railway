/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.google.gson.Gson;
import com.rebeka.train.dao.CompSubTypeService;
import com.rebeka.train.dao.CompTypeService;
import com.rebeka.train.dao.FareChartService;
import com.rebeka.train.dao.FromStationService;
import com.rebeka.train.dao.PassengerTypeService;
import com.rebeka.train.dao.ReservationService;

import com.rebeka.train.dao.ToStationService;
import com.rebeka.train.dao.TrainInfoService;
import com.rebeka.train.dao.UserService;
import com.rebeka.train.model.CompType;
import com.rebeka.train.model.FareChart;
import com.rebeka.train.model.Reservation;
import com.rebeka.train.model.ReservationDetails;
import com.rebeka.train.model.TrainInfo;
import com.rebeka.train.model.User;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author acer
 */
@Controller
public class SerachTrainController {

    @Autowired
    TrainInfoService tisdao;
    @Autowired
    FromStationService fssdao;
    @Autowired
    ToStationService tssdao;

    @Autowired
    CompTypeService ctsdao;
    @Autowired
    CompSubTypeService cstsdao;
    @Autowired
    ReservationService rsvdao;
    @Autowired
    PassengerTypeService pgtsdao;
     @Autowired
    UserService usdao;
     @Autowired
     FareChartService fcsdao;
    @Autowired
    ReservationService  rsdao ;

    @InitBinder
    public void myInitBinder1(WebDataBinder binder) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "reservdate", new CustomDateEditor(format, false));

    }

    //search train page
    @RequestMapping("/showsearchtrainpage")
    public ModelAndView SearchForsearchtrainPage() {
        String traininfolist = tisdao.viewTrainInfo();
        System.out.println("Traininfo" + traininfolist);
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();
//        ModelAndView mv = new ModelAndView("searchtrain" ,"addsearchoneObject", new TrainInfo());
        ModelAndView mv = new ModelAndView("searchtrain", "addsearchoneObject", new TrainInfo());
        mv.addObject("traininfolist", traininfolist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("check", "true");
        return mv;

    }

    //gettrain page
    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "d", new CustomDateEditor(format, false));

    }
//    gettrain page

    @RequestMapping("/viewsearchtrainpage")
    public ModelAndView SearchForgettrainViewPage(@ModelAttribute("addsearchoneObject") TrainInfo ti, HttpSession session) {
        String dd = new SimpleDateFormat("yyyy/MM/dd").format(ti.getD());
        session.setAttribute("d", dd);
        session.setAttribute("trainnumber", ti.getTrainnub());
        session.setAttribute("trainname", ti.getTrainname());
        session.setAttribute("traindept", ti.getDepttime());
        session.setAttribute("dayoff", ti.getDayoff());
        session.setAttribute("fromstationid", ti.getFromstationid());
        session.setAttribute("tostationid", ti.getTostationid());

        String a = tisdao.searchTrain(ti);

        ModelAndView mv = new ModelAndView("gettrain", "addsearchoneObject", new TrainInfo());
        mv.addObject("traininfolist", a);

        mv.addObject("check", "true");
        return mv;
    }

    //buy ticket page//
    @RequestMapping("/buyticet")
    public ModelAndView showreservepagebyserchtrain(@RequestParam("gettid") String traininfoId, HttpSession session) {

        //String traininfolist = tisdao.viewTrainInfo();
        String reservartionlist = rsvdao.viewReservation();
        String compartmentlist = ctsdao.viewCompType();
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();
        
        TrainInfo traininfolistbuy = tisdao.buyticket(traininfoId);
        Gson g = new Gson();
        String traingson = g.toJson(traininfolistbuy);

//reservid, emailid, comptypeid, trainid, fromstationid, tostationid, ptn, adult, child, status, reservdate, passengerid, journydate
        ModelAndView mv = new ModelAndView("userreservation", "viewtrainlistc", new Reservation());
        //mv.addObject("traininfolist", traininfolist);
        //mv.addObject("traininfolistbuy", traininfolistbuy);
        mv.addObject("traininfolist", traingson);
        mv.addObject("reservartionlist", reservartionlist);
        mv.addObject("compartmentlist", compartmentlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("check", "true");
        return mv;

    }
    
   
    

//show reservation page
    @RequestMapping("/reservationpage")
    public ModelAndView showreservationpage(@ModelAttribute("viewtrainlistc") Reservation re, HttpSession session) {
         String reservationlist = rsvdao.viewReservation();
        String traininforlist = tisdao.viewTrainInfo();
        String compartmentlist = ctsdao.viewCompType();
        String comsublist=cstsdao.viewCompSubType();
        
         int adltage = re.getAdult();
        // int passengrId=(Integer)session.getAttribute("PassId");
        session.setAttribute("adltseat", adltage);
        System.out.println("adult seat no  " + adltage);
        int childs = re.getChild();
        session.setAttribute("childs", childs);
//        session.setAttribute("trainid", re.getTrainid());
        session.setAttribute("trainnum", re.getTrainid());
        session.setAttribute("trainname", re.getTrainname());
        session.setAttribute("departuretime", re.getDepttime());
        session.setAttribute("compartment", re.getComptypeid());
        session.setAttribute("fromstationids", re.getFromstationid());
        session.setAttribute("tostationid", re.getTostationid());
        

        ModelAndView mv = new ModelAndView("addreservation1", "viewtrainlistc", new Reservation());
        mv.addObject("traininforlist", traininforlist);
        mv.addObject("reservationlist", reservationlist);
        mv.addObject("compartmentlist", compartmentlist);
        mv.addObject("comsublist", comsublist);
        mv.addObject("check", "true");
        return mv;
    }



    
     @RequestMapping(value = "/reservationadd", params = "Add")
    public String addReservationpage(@ModelAttribute("viewtrainlistc") Reservation rv ) {
        tisdao.addReservation(rv);
//        return "redirect:/showsearchtrainpage";
        return "redirect:/showreservationdetailspage";
    }
    
    

 @InitBinder
    public void myInitBinder2(WebDataBinder binder) {
 
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "journeydate", new CustomDateEditor(format, false));
    }
    
//    resdetid, reservid, compsubtypeid, seatno, journeydate, trainid, farechartid
     @RequestMapping("/showreservationdetailspage")
    public ModelAndView showreservationpage() {
        
        String reservationslist = rsdao.viewReservation();
       String compartservicelist = cstsdao.viewCompSubType();
       String farechartslist = fcsdao.viewFareChart();
       String traininfolist = tisdao.viewTrainInfo();
//        User uu=new User();
//        uu.getEmailid();
//        ModelAndView mv = new ModelAndView("reservationdetails", "newreservationdetailsObject", new ReservationDetails());
        ModelAndView mv = new ModelAndView("reservationdetails", "newreservationdetailsObject", new ReservationDetails());
        
        mv.addObject("reservationslist", reservationslist);
        mv.addObject("compartservicelist", compartservicelist);
        mv.addObject("farechartslist", farechartslist);
        mv.addObject("traininfolist", traininfolist);
        mv.addObject("check", "true");
        return mv;
    }   
    

}
