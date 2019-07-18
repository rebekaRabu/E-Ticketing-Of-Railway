/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author acer
 */

@Entity
public class TrainInfo implements Serializable{
    
     
    @Id
    private String trainid;
    private String trainnub;
    private String trainname;
    private String fromstationid;
    private String tostationid;
    private String depttime;
    private String arrivtime;
    private String dayoff;
    
    @Transient
    private Date d;

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
    }

    public String getTrainnub() {
        return trainnub;
    }

    public void setTrainnub(String trainnub) {
        this.trainnub = trainnub;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
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

    

    public String getDepttime() {
        return depttime;
    }

    public void setDepttime(String depttime) {
        this.depttime = depttime;
    }

    public String getArrivtime() {
        return arrivtime;
    }

    public void setArrivtime(String arrivtime) {
        this.arrivtime = arrivtime;
    }

    public String getDayoff() {
        return dayoff;
    }

    public void setDayoff(String dayoff) {
        this.dayoff = dayoff;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

   
    
    
    
    
}
