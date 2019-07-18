/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.PassengerInfoService;
import com.rebeka.train.model.PassengerInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author acer
 */
@Controller
public class PassengerInfoController {
    
    @Autowired
    PassengerInfoService fisdao;
    
    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(format, false));
        
    }
    
    @RequestMapping("/signuppassengerinfo")
    public ModelAndView updatePage(){
        ModelAndView mv= new ModelAndView("passinfosignup1");
//        mv.addObject("userrolemodel", new PassengerInfo());
        mv.addObject("passengerinfo", new PassengerInfo());
        return mv;
        
    }
    
    
    
//     @RequestMapping(value= "/reupdater", method = RequestMethod.POST)
//    public ModelAndView reguser(@ModelAttribute("userrolemodel") PassengerInfo urm1) {
//        String result = fisdao.insertPassengerInfo(urm1);
//
//        if (result.equalsIgnoreCase("success")) {
//            ModelAndView mv = new ModelAndView("login");
//            mv.addObject(result, "success");
//            return mv;
//        } else {
//            ModelAndView mv = new ModelAndView("updatepassinfo");
//            mv.addObject(result, "fail");
//            return mv;
//        }
//    }
    
    
}
