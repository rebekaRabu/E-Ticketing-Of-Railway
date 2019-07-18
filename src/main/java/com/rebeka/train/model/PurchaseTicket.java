/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author acer
 */
@Entity
public class PurchaseTicket implements Serializable{
//    purchaseid, fromstationid, tostationid
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int purchaseid;
    private String fromstationid;
    private String tostationid;

    public int getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(int purchaseid) {
        this.purchaseid = purchaseid;
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
