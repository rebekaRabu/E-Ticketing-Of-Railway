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
public class ToStation {
    
    @Id
    private String tostationid;
    private String tostationname;

    public String getTostationid() {
        return tostationid;
    }

    public void setTostationid(String tostationid) {
        this.tostationid = tostationid;
    }

    public String getTostationname() {
        return tostationname;
    }

    public void setTostationname(String tostationname) {
        this.tostationname = tostationname;
    }
    
    
    
    
}
