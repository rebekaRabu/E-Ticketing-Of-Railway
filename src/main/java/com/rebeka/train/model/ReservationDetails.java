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
//resdetid, reservid, compsubtypeid, seatno, fareamount, journeydate, trainid
@Entity
public class ReservationDetails implements Serializable{
    @Id
    private String resdetid;
    private String reservid;
    private String comptypeid;
    private String trainid;
    private int seatqty;
    private String farechartid;
    
    @Transient
    private int fareamount;
    
    @Temporal(TemporalType.DATE)
    private Date journeydate;

    public String getFarechartid() {
        return farechartid;
    }

    public void setFarechartid(String farechartid) {
        this.farechartid = farechartid;
    }

    
    
    

    public String getResdetid() {
        return resdetid;
    }

    public void setResdetid(String resdetid) {
        this.resdetid = resdetid;
    }

    public String getReservid() {
        return reservid;
    }

    public void setReservid(String reservid) {
        this.reservid = reservid;
    }

    public String getComptypeid() {
        return comptypeid;
    }

    public void setComptypeid(String comptypeid) {
        this.comptypeid = comptypeid;
    }

   
    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
    }

    public int getSeatqty() {
        return seatqty;
    }

    public void setSeatqty(int seatqty) {
        this.seatqty = seatqty;
    }

   

    public int getFareamount() {
        return fareamount;
    }

    public void setFareamount(int fareamount) {
        this.fareamount = fareamount;
    }

    public Date getJourneydate() {
        return journeydate;
    }

    public void setJourneydate(Date journeydate) {
        this.journeydate = journeydate;
    }
    
    
}
