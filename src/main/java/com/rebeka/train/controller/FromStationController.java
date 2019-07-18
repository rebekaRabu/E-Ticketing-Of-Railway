/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.FromStationService;
import com.rebeka.train.model.FromStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author R-38 (1245310)
 */
@Controller
public class FromStationController {
    @Autowired
    FromStationService cat;

     @RequestMapping("/showingfromstationpage")
    public ModelAndView showcatpage() {
        String categorygsonlist = cat.viewFromStation();
        ModelAndView mv = new ModelAndView("fromstation", "addCategoryObject1", new FromStation());
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "true");
        return mv;
    }
    
    
//     public String insertFromStation(FromStation cm);
//
//    public String updateFromStation(FromStation cm);
//
//    public String deleteFromStation(String id);
//
//    public String viewFromStation();
//
//    public FromStation viewOneFromStation(String id);

     
    @RequestMapping(value = "/addingfromstation", params = "Addfromstation")
    public String addcategory(@ModelAttribute("addCategoryObject1") FromStation cm) {

        cat.insertFromStation(cm);
       
        return "redirect:/showingfromstationpage";
    }
    
    
    @RequestMapping(value = "/addingfromstation", params = "Editfromstation")
    public String editcategory(@ModelAttribute("addCategoryObject1") FromStation cm) {

       
        cat.updateFromStation(cm);
        return "redirect:/showingfromstationpage";
    }
    
    @RequestMapping("removefromstation/{Id}")
    public String removecategory(@PathVariable("Id") String categoryId) {
        cat.deleteFromStation(categoryId);
        return "redirect:/showingfromstationpage";
    }
    
     @RequestMapping("/editingfromstation")
    public ModelAndView passingonecategory(@RequestParam("getfromstationid") String categoryId) {

        FromStation onecategory = cat.viewOneFromStation(categoryId);
        String categorygsonlist = cat.viewFromStation();
        ModelAndView mv = new ModelAndView("fromstation", "addCategoryObject1", onecategory);
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}
