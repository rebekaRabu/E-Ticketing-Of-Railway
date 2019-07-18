/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.rebeka.train.dao.CompSubTypeService;
import com.rebeka.train.dao.CompTypeService;
import com.rebeka.train.dao.FromStationService;
import com.rebeka.train.dao.TestService;
import com.rebeka.train.dao.ToStationService;
import com.rebeka.train.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author acer
 */
@Controller
public class TestController {

    @Autowired
    TestService tdao;
    @Autowired
    CompTypeService cdao;
    @Autowired
    CompSubTypeService csdao;
    @Autowired
    FromStationService fsdao;
    @Autowired
    ToStationService tsdao;

    @RequestMapping("/showpage")
    public ModelAndView showproductpage() {
        String testlist = tdao.viewTest();
        String complist = cdao.viewCompType();
        String compsublist = csdao.viewCompSubType();
        String fromstationlist = fsdao.viewFromStation();
        String tostationlist = tsdao.viewToStation();

        ModelAndView mv = new ModelAndView("test", "newProductObject", new Test());
        mv.addObject("testlist", testlist);
        mv.addObject("complist", complist);
        mv.addObject("compsublist", compsublist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("check", "true");
        return mv;
    }

}
