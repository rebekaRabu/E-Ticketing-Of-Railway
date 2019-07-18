/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;



import com.rebeka.train.dao.CompSubTypeService;
import com.rebeka.train.model.CompSubType;

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
public class CompSubTypeController {

    @Autowired
    CompSubTypeService cat;

    @RequestMapping("/showingcompsubtypepage")
    public ModelAndView showcatpage() {
        String categorygsonlist = cat.viewCompSubType();
        ModelAndView mv = new ModelAndView("compsubtype", "addCategoryObject1", new CompSubType());
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "true");
        return mv;
    }
    
    
    
    @RequestMapping(value = "/addingsubcompartment", params = "Addsubcompartment")
    public String addcategory(@ModelAttribute("addCategoryObject1") CompSubType cm) {

        cat.insertCompSubType(cm);
       
        return "redirect:/showingcompsubtypepage";
    }
    
    
    @RequestMapping(value = "/addingsubcompartment", params = "EditSubCompartment")
    public String editcategory(@ModelAttribute("addCategoryObject1") CompSubType cm) {

       
        cat.updateCompSubType(cm);
        return "redirect:/showingcompsubtypepage";
    }
    
    @RequestMapping("removesubcompartment/{Id}")
    public String removecategory(@PathVariable("Id") String categoryId) {
        cat.deleteCompSubType(categoryId);
        return "redirect:/showingcompsubtypepage";
    }
    
     @RequestMapping("/editsubcompartmentbutton")
    public ModelAndView passingonecategory(@RequestParam("getcompsubtypeid") String categoryId) {

        CompSubType onecategory = cat.viewOneCompType(categoryId);
        String categorygsonlist = cat.viewCompSubType();
        ModelAndView mv = new ModelAndView("compsubtype", "addCategoryObject1", onecategory);
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}
