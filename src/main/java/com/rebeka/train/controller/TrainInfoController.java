/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.FromStationService;
import com.rebeka.train.dao.ToStationService;
import com.rebeka.train.dao.TrainInfoService;


import com.rebeka.train.model.TrainInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 


@Controller
public class TrainInfoController {

    @Autowired
    TrainInfoService tisdao;
    @Autowired
    FromStationService fssdao;
    @Autowired       
    ToStationService tssdao;
            
            
// public String insertTrainInfo(TrainInfo cm);
//
//    public String updateTrainInfo(String id, TrainInfo cm);
//
//    public String deleteTrainInfo(String id);
//
//    public String viewTrainInfo();
//
//    public TrainInfo viewOneTrainInfo(String id);
    
    
    
   @RequestMapping("/showtraininfopage")

    public ModelAndView showproductpage() {

        String farechartlist = tisdao.viewTrainInfo();
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();        
        ModelAndView mv = new ModelAndView("traininfo", "newProductObject", new TrainInfo());
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        
        mv.addObject("check", "true");
        return mv;


    }

     @RequestMapping(value = "/traininfoadd", params = "Add")
    public String addproductpage(@ModelAttribute("newProductObject") TrainInfo cm ) {
        tisdao.insertTrainInfo(cm);
        return "redirect:/showtraininfopage";
    }
    
     @RequestMapping(value = "/traininfoadd", params = "Edit")
    public String editProduct(@ModelAttribute("newProductObject") TrainInfo cm) {
        tisdao.updateTrainInfo(cm.getTrainid(), cm);
        return "redirect:/showtraininfopage";
    }
    
     
     @RequestMapping("removingtraininfo/{productId}")
    public String removeproduct(@PathVariable("productId") String id ) {
        tisdao.deleteTrainInfo(id);
        return "redirect:/showtraininfopage";
    }
    
    @RequestMapping("/editingtraininfo")
    public ModelAndView editproductpage(@RequestParam("gettrainid") String fid) {
        String farechartlist = tisdao.viewTrainInfo();
        String fromstationlist = fssdao.viewFromStation();
        String tostationlist = tssdao.viewToStation();
       
        
        
        ModelAndView mv = new ModelAndView("traininfo", "newProductObject", tisdao.viewOneTrainInfo(fid));
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
       
        mv.addObject("check", "false");
        return mv;
    }
    
    
}
