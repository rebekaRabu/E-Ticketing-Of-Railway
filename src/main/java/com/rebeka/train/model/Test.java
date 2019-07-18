/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author acer
 */
@Entity
public class Test {
   
    @Id
    private String testid;
    private String testname;
    private String testarea;
    private String comptypeid;
    private String compsubtypeid;
    private String fromstationid;
    private String tostationid;

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public String getTestarea() {
        return testarea;
    }

    public void setTestarea(String testarea) {
        this.testarea = testarea;
    }

    public String getComptypeid() {
        return comptypeid;
    }

    public void setComptypeid(String comptypeid) {
        this.comptypeid = comptypeid;
    }

    public String getCompsubtypeid() {
        return compsubtypeid;
    }

    public void setCompsubtypeid(String compsubtypeid) {
        this.compsubtypeid = compsubtypeid;
    }

    public String getFromstationid() {
        return fromstationid;
    }

    public void setFromstationid(String fromstationid) {
        this.fromstationid = fromstationid;
    }

    public String getTostationid() {
        return tostationid;
    }

    public void setTostationid(String tostationid) {
        this.tostationid = tostationid;
    }

   
    
    
    
}
