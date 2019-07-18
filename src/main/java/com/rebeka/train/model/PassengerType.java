/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author acer
 */
@Entity
public class PassengerType {

    @Id
    private String passtypeid;
    private String passtypename;
    private String passadult;
    private String passchild;
    
//    @Transient
//    private Date d;
    
     @Transient
    private Integer adult;
      @Transient
    private Integer child;

    
//    passtypeid, passtypename, passadult, passchild
    public String getPasstypeid() {
        return passtypeid;
    }

    public void setPasstypeid(String passtypeid) {
        this.passtypeid = passtypeid;
    }

    public String getPasstypename() {
        return passtypename;
    }

    public void setPasstypename(String passtypename) {
        this.passtypename = passtypename;
    }

    public String getPassadult() {
        return passadult;
    }

    public void setPassadult(String passadult) {
        this.passadult = passadult;
    }

    public String getPasschild() {
        return passchild;
    }

    public void setPasschild(String passchild) {
        this.passchild = passchild;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

   
    
    

}
