/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.StationService;
import com.rebeka.train.model.Station;
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
public class StationController {
    
    @Autowired
    StationService cat;
    
    @RequestMapping("/showingcategorypage")
    public ModelAndView showcatpage() {
        String categorygsonlist = cat.viewStation();
        ModelAndView mv = new ModelAndView("index", "addCategoryObject1", new Station());
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "true");
        return mv;
    }

    @RequestMapping(value = "/addingcategory", params = "Addcategory")
    public String addcategory(@ModelAttribute("addCategoryObject1") Station cm) {
        //String categorygsonlist = cdao.viewCategory();
        //ModelAndView mv =new ModelAndView("AddCategory");
        cat.insertStation(cm);
        //mv.addObject("categorymodelobject", categorygsonlist);
        return "redirect:/showingcategorypage";
    }

    @RequestMapping(value = "/addingcategory", params = "EditCategory")
    public String editcategory(@ModelAttribute("addCategoryObject1") Station cm) {

        //ModelAndView mv =new ModelAndView("AddCategory");
        cat.updateStation(cm);
        return "redirect:/showingcategorypage";
    }
    
    @RequestMapping("removecategory/{Id}")
    public String removecategory(@PathVariable("Id") String categoryId) {
        cat.deleteStation(categoryId);
        return "redirect:/showingcategorypage";
    }

    @RequestMapping("/editcategorybutton")
    public ModelAndView passingonecategory(@RequestParam("getstationid") String categoryId) {

        Station onecategory = cat.viewOneStation(categoryId);
        String categorygsonlist = cat.viewStation();
        ModelAndView mv = new ModelAndView("index", "addCategoryObject1", onecategory);
        mv.addObject("categorymodelobject", categorygsonlist);
        mv.addObject("check", "false");
        return mv;
    }
    
}
