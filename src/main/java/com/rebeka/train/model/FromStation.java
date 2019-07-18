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
public class FromStation {
     @Id
    private String fromstationid;
    private String fromstationname;

    public String getFromstationid() {
        return fromstationid;
    }

    public void setFromstationid(String fromstationid) {
        this.fromstationid = fromstationid;
    }

    public String getFromstationname() {
        return fromstationname;
    }

    public void setFromstationname(String fromstationname) {
        this.fromstationname = fromstationname;
    }
    
    
    
    
}
