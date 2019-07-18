/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.CompTypeService;
import com.rebeka.train.model.CompType;
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
public class CompartmentTypeController {
    @Autowired
    CompTypeService cat;
    
    
    @RequestMapping("/showingcomptypepage")
    public ModelAndView showcatpage() {
        String categorygsonlist = cat.viewCompType();
        ModelAndView mv = new ModelAndView("comptype", "addCategoryObject1", new CompType());
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "true");
        return mv;
    }
    
    
    
    @RequestMapping(value = "/addingcompartment", params = "Addcompartment")
    public String addcategory(@ModelAttribute("addCategoryObject1") CompType cm) {
       
        cat.insertCompType(cm);
       
        return "redirect:/showingcomptypepage";
    }
    
    
    @RequestMapping(value = "/addingcompartment", params = "EditCompartment")
    public String editcategory(@ModelAttribute("addCategoryObject1") CompType cm) {

       
        cat.updateCompType(cm);
        return "redirect:/showingcomptypepage";
    }
    
    @RequestMapping("removecompartment/{Id}")
    public String removecategory(@PathVariable("Id") String categoryId) {
        cat.deleteCompType(categoryId);
        return "redirect:/showingcomptypepage";
    }
    
     @RequestMapping("/editcompartmentbutton")
    public ModelAndView passingonecategory(@RequestParam("getcomptypeid") String categoryId) {

        CompType onecategory = cat.viewOneCompType(categoryId);
        String categorygsonlist = cat.viewCompType();
        ModelAndView mv = new ModelAndView("comptype", "addCategoryObject1", onecategory);
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}
