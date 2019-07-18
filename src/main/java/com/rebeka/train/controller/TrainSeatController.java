/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.controller;

import com.google.gson.Gson;
import com.rebeka.train.dao.CompSubTypeService;
import com.rebeka.train.dao.CompTypeService;
import com.rebeka.train.dao.TrainInfoService;

import com.rebeka.train.dao.TrainSeatService;

import com.rebeka.train.model.TrainSeat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author R-38 (1245310)
 */
@Controller
public class TrainSeatController {


    @Autowired
    TrainSeatService tsdao;
    @Autowired
    TrainInfoService tidao;
    @Autowired
    CompTypeService ctdao;
    @Autowired
    CompSubTypeService cstdao;
  

    
    
    @RequestMapping("/showingtrainseatpage")
    public ModelAndView showproductpage() {
        String farechartlist = tsdao.viewTrainSeat();
        String fromstationlist = tidao.viewTrainInfo();
        String tostationlist = ctdao.viewCompType();
        String comptypelist = cstdao.viewCompSubType();
       
       
       

        ModelAndView mv = new ModelAndView("trainseat1", "newProductObject", new TrainSeat());
        
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("comptypelist", comptypelist);
       
        mv.addObject("check", "true");
        return mv;
    }
    
   
    
    
   @RequestMapping(value = "/trainseatadd", params = "Add")
    public String addproductpage(@ModelAttribute("newProductObject") TrainSeat cm ) {
        tsdao.insertTrainSeat(cm);
        return "redirect:/showingtrainseatpage";
    }
    
    @RequestMapping(value = "/trainseatadd", params = "Edit")
    public String editProduct(@ModelAttribute("newProductObject") TrainSeat cm) {
        tsdao.updateTrainSeat(cm.getSeatid(), cm);
        return "redirect:/showingtrainseatpage";
    }
    
    
    
      @RequestMapping("removingtrainseat/{productId}")
    public String removeproduct(@PathVariable("productId") String id ) {
        tsdao.deleteTrainSeat(id);
        return "redirect:/showingtrainseatpage";
    }
    
//    seatid, trainid, comptypeid, compsubtypeid, totalseat
    
    @RequestMapping("/editingtrainseat")
    public ModelAndView editproductpage(@RequestParam("getseatid") String fid) {
       String farechartlist = tsdao.viewTrainSeat();
        String fromstationlist = tidao.viewTrainInfo();
        String tostationlist = ctdao.viewCompType();
        String comptypelist = cstdao.viewCompSubType();
        
        
        ModelAndView mv = new ModelAndView("trainseat1", "newProductObject", tsdao.viewOneTrainSeat(fid));
        mv.addObject("farechartlist", farechartlist);
        mv.addObject("fromstationlist", fromstationlist);
        mv.addObject("tostationlist", tostationlist);
        mv.addObject("comptypelist", comptypelist);
       
        mv.addObject("check", "false");
        return mv;
    }
    
    
    
    
    
   
}
