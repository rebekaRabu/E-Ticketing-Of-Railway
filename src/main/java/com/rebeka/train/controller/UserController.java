/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.UserService;
import com.rebeka.train.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author acer
 */
@Controller
public class UserController {

    @Autowired
    UserService us;

//    @RequestMapping(value="/signup" , method = RequestMethod.POST)
    @RequestMapping("/signup")
    public ModelAndView signUpPage() {
        ModelAndView mv = new ModelAndView("signup");
        mv.addObject("urm", new User());
        return mv;
    }

    
    @RequestMapping(value = "/reguser", method = RequestMethod.POST)
    public ModelAndView reguser(@ModelAttribute("urm") User urm1) {
        String result= us.insertUser(urm1);
        
        if(result.equalsIgnoreCase("success")){
            ModelAndView mv= new ModelAndView("login");
            mv.addObject(result, "success");
            return mv;
        }else{
            ModelAndView mv = new ModelAndView("signup");
            mv.addObject(result, "fail");
            return mv;
        }
    }

}
