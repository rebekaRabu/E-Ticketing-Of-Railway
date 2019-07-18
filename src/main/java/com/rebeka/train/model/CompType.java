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
public class CompType {
    @Id
    private String comptypeid;
    private String compname;
    private String description;

    public String getComptypeid() {
        return comptypeid;
    }

    public void setComptypeid(String comptypeid) {
        this.comptypeid = comptypeid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
