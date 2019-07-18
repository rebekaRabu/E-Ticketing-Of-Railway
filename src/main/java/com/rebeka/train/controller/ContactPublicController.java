/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author acer
 */
@Controller
public class ContactPublicController {
    
    @RequestMapping(value = "/showcontactformpage")
    public String helloMessage(ModelMap map) {
        map.addAttribute("hello", "Hello Spring MVC");
        return "contact";
    }
    
    
    
}
