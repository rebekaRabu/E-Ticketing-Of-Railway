/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.FromStationService;
import com.rebeka.train.dao.PurchaseTicketService;
import com.rebeka.train.dao.ToStationService;

import com.rebeka.train.model.PurchaseTicket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author acer
 */
@Controller
public class PurchaseTicketController {
    
    @Autowired
    PurchaseTicketService ptsdao;
    @Autowired
    FromStationService fssdao ;
    @Autowired
    ToStationService  tssdao;
    
    @RequestMapping("/showpurchaseticket")
    public ModelAndView showproductpage() {

        String farechartlist = ptsdao.viewPurchaseTicket();
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();
       
        
        ModelAndView mv = new ModelAndView("purchaseticket1", "newProductObject", new PurchaseTicket());
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        
        mv.addObject("check", "true");
        return mv;


    }
    
      @RequestMapping(value = "/purchaseticketadd", params = "Add")
    public String addproductpage(@ModelAttribute("newProductObject") PurchaseTicket cm ) {
        ptsdao.insertPurchaseTicket(cm);
        return "redirect:/showpurchaseticket";
    }
    
    
    
    
    
    
    
    
    
    
}
