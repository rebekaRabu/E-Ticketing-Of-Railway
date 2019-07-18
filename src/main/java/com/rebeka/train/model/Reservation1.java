/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author acer
 */
@Entity
public class Reservation1 implements Serializable {
//resid, passid, ptn, restatus, trainid, fromstationid, tostationid, departuretime, arivaltime, adult, child, emailid, d, compname, compsubtypename, resdate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String resid;
    @Column
    private String passid;
    @Column
    @Temporal(TemporalType.DATE)
    private Date resdate =new Date();
    @Column
    private int ptn;
     @Column
    private String resstatus="ordered";
    @Column
    private String trainid;
    //@Transient
    @Column
    private String compname;
    @Column
    private String compsubtypename;
    
    
   
    @Column
    private int adult;
    @Column
    private int child;
    @Column
    private String emailid;
    
   // private int trainid;
   @Transient
   private String trainnumber;
    @Transient
    private String trainname;
    //@Transient
    private String fromstationid;
    //@Transient
    private String tostationid;
   //@Transient
    private String depaturetime;
    //@Transient
    private String arivaltime;
   @Transient
    private String dayoff;       
    //@Transient
   private Date d;

    public String getResid() {
        return resid;
    }

    public void setResid(String resid) {
        this.resid = resid;
    }

    public String getPassid() {
        return passid;
    }

    public void setPassid(String passid) {
        this.passid = passid;
    }

    public Date getResdate() {
        return resdate;
    }

    public void setResdate(Date resdate) {
        this.resdate = resdate;
    }

    public int getPtn() {
        return ptn;
    }

    public void setPtn(int ptn) {
        this.ptn = ptn;
    }

    public String getResstatus() {
        return resstatus;
    }

    public void setResstatus(String resstatus) {
        this.resstatus = resstatus;
    }

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getCompsubtypename() {
        return compsubtypename;
    }

    public void setCompsubtypename(String compsubtypename) {
        this.compsubtypename = compsubtypename;
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

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getTrainnumber() {
        return trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        this.trainnumber = trainnumber;
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

    public String getDepaturetime() {
        return depaturetime;
    }

    public void setDepaturetime(String depaturetime) {
        this.depaturetime = depaturetime;
    }

    public String getArivaltime() {
        return arivaltime;
    }

    public void setArivaltime(String arivaltime) {
        this.arivaltime = arivaltime;
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
