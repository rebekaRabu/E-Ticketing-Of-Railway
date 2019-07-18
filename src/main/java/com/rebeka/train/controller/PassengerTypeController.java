/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.PassengerTypeService;
import com.rebeka.train.model.PassengerType;

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
public class PassengerTypeController {
    
    @Autowired
    PassengerTypeService cat;
    
    @RequestMapping("/showingpassengertype")
    public ModelAndView showcatpage() {
        String categorygsonlist = cat.viewPassengerType();
        ModelAndView mv = new ModelAndView("passengertype", "addCategoryObject1", new PassengerType());
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "true");
        return mv;
    }
    
    
@RequestMapping(value = "/addingpassenger", params = "Addpassenger")
    public String addcategory(@ModelAttribute("addCategoryObject1") PassengerType cm) {
       
        cat.insertPassengerType(cm);
       
        return "redirect:/showingpassengertype";
    }
    
    
    @RequestMapping(value = "/addingpassenger", params = "Editpassenger")
    public String editcategory(@ModelAttribute("addCategoryObject1") PassengerType cm) {

       
        cat.updatePassengerType(cm);
        return "redirect:/showingpassengertype";
    }
    
    @RequestMapping("removepassenger/{Id}")
    public String removecategory(@PathVariable("Id") String categoryId) {
        cat.deletePassengerType(categoryId);
        return "redirect:/showingpassengertype";
    }
    
     @RequestMapping("/editingpassenger")
    public ModelAndView passingonecategory(@RequestParam("getpasstypeid") String categoryId) {

        PassengerType onecategory = cat.viewOnePassengerType(categoryId);
        String categorygsonlist = cat.viewPassengerType();
        ModelAndView mv = new ModelAndView("passengertype", "addCategoryObject1", onecategory);
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "false");
        return mv;
    }
}
