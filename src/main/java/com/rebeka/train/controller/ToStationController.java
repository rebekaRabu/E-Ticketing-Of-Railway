/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.ToStationService;
import com.rebeka.train.model.ToStation;
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
public class ToStationController {
    
    @Autowired
    ToStationService cat;

     @RequestMapping("/showingtostationtpage")
    public ModelAndView showcatpage() {
        String categorygsonlist = cat.viewToStation();
        ModelAndView mv = new ModelAndView("tostation", "addCategoryObject1", new ToStation());
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "true");
        return mv;
    }
    
    
     
    @RequestMapping(value = "/addingtostation", params = "Addtotation")
    public String addcategory(@ModelAttribute("addCategoryObject1") ToStation cm) {

        cat.insertToStation(cm);
       
        return "redirect:/showingtostationtpage";
    }
    
    
    @RequestMapping(value = "/addingtostation", params = "Edittostation")
    public String editcategory(@ModelAttribute("addCategoryObject1") ToStation cm) {

       
        cat.updateToStation(cm);
        return "redirect:/showingtostationtpage";
    }
    
    @RequestMapping("removetostation/{Id}")
    public String removecategory(@PathVariable("Id") String categoryId) {
        cat.deleteToStation(categoryId);
        return "redirect:/showingtostationtpage";
    }
    
     @RequestMapping("/editingtostation")
    public ModelAndView passingonecategory(@RequestParam("gettostationid") String categoryId) {

        ToStation onecategory = cat.viewOneCompType(categoryId);
        String categorygsonlist = cat.viewToStation();
        ModelAndView mv = new ModelAndView("tostation", "addCategoryObject1", onecategory);
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}