/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.CompTypeService;
import com.rebeka.train.dao.FareChartService;
import com.rebeka.train.dao.FromStationService;
import com.rebeka.train.dao.PassengerTypeService;
import com.rebeka.train.dao.ToStationService;
import com.rebeka.train.model.FareChart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author acer
 */
@Controller
public class FareChartController {
    
    @Autowired
    FareChartService fcsdao;
    @Autowired
    FromStationService fssdao ;
    @Autowired
    ToStationService  tssdao;
    @Autowired
    CompTypeService stsdao;
    @Autowired
    PassengerTypeService  ptsdao;
    
    
//     public String insertFareChart(FareChart cm);
//    public String updateFareChart(String id, FareChart cm);
//    public String deleteFareChart(String id);
//    public String viewFareChart();
//    public FareChart viewOneFareChart(String id);
//    
    
    
    @RequestMapping("/showfarechartpage")

    public ModelAndView showproductpage() {

        String farechartlist = fcsdao.viewFareChart();
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();
        String comptypelist = stsdao.viewCompType();
        String passengertypelist = ptsdao.viewPassengerType();
        
        ModelAndView mv = new ModelAndView("farechart", "newProductObject", new FareChart());
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("comptypelist", comptypelist);
        mv.addObject("passengertypelist", passengertypelist);
        mv.addObject("check", "true");
        return mv;


    }
    
     @RequestMapping(value = "/farechartadd", params = "Add")
    public String addproductpage(@ModelAttribute("newProductObject") FareChart cm ) {
        fcsdao.insertFareChart(cm);
        return "redirect:/showfarechartpage";
    }
    
    
    @RequestMapping(value = "/farechartadd", params = "Edit")
    public String editProduct(@ModelAttribute("newProductObject") FareChart cm) {
        fcsdao.updateFareChart(cm.getFarechartid(), cm);
        return "redirect:/showfarechartpage";
    }
    
    
    
//     public String insertFareChart(FareChart cm);
//    public String updateFareChart(String id, FareChart cm);
//    public String deleteFareChart(String id);
//    public String viewFareChart();
//    public FareChart viewOneFareChart(String id);
    
    
    
    
    
     @RequestMapping("removingfarechart/{productId}")
    public String removeproduct(@PathVariable("productId") String farechartid ) {
        fcsdao.deleteFareChart(farechartid);
        return "redirect:/showfarechartpage";
    }
    
    @RequestMapping("/editingfarechart")
    public ModelAndView editproductpage(@RequestParam("getfarechartid") String fid) {
       String farechartlist = fcsdao.viewFareChart();
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();
        String comptypelist = stsdao.viewCompType();
        String passengertypelist = ptsdao.viewPassengerType();
        
        
        ModelAndView mv = new ModelAndView("farechart", "newProductObject", fcsdao.viewOneFareChart(fid));
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("comptypelist", comptypelist);
        mv.addObject("passengertypelist", passengertypelist);
        mv.addObject("check", "false");
        return mv;
    }
    
}
