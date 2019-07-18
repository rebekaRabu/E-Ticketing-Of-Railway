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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author acer
 */
@Entity
public class Reservation implements Serializable {
//    reservid, passengerid, comptypeid, compsubtypeid, trainid, fromstationid, tostationid, adult, child, reservdate, journeydate, status

    @Id
    private String reservid;
    private String passengerid;
    private String comptypeid;
    private String compsubtypeid;
    private String trainid;
    private String fromstationid;
    private String tostationid;
    private int adult;
    private int child;
    private Double totalfare;
    
    @Temporal(TemporalType.DATE)
    private Date reservdate;
    @Temporal(TemporalType.DATE)
    private Date journeydate;
    @Transient
    private Date d;
    
    
    private String status="order";
    
//    trainid, trainnub, trainname, fromstationid, tostationid, depttime, arrivtime, dayoff
     @Transient
   private String trainnub;
    @Transient
    private String trainname;
   @Transient
    private String depttime;
//    //@Transient
//    private String arivaltime;

    public Double getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(Double totalfare) {
        this.totalfare = totalfare;
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

    public String getDepttime() {
        return depttime;
    }

    public void setDepttime(String depttime) {
        this.depttime = depttime;
    }
    
    

    public String getReservid() {
        return reservid;
    }

    public void setReservid(String reservid) {
        this.reservid = reservid;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
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

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
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

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public Date getReservdate() {
        return reservdate;
    }

    public void setReservdate(Date reservdate) {
        this.reservdate = reservdate;
    }

    public Date getJourneydate() {
        return journeydate;
    }

    public void setJourneydate(Date journeydate) {
        this.journeydate = journeydate;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    
    
    
    
}
