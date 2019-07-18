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
public class CompSubType {
    
    @Id
    private String compsubtypeid;
    private String compsubtypename;

    public String getCompsubtypeid() {
        return compsubtypeid;
    }

    public void setCompsubtypeid(String compsubtypeid) {
        this.compsubtypeid = compsubtypeid;
    }

    public String getCompsubtypename() {
        return compsubtypename;
    }

    public void setCompsubtypename(String compsubtypename) {
        this.compsubtypename = compsubtypename;
    }
   
    
    
}
