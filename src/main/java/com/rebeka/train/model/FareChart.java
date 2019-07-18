/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author acer
 */
@Entity
public class FareChart implements Serializable {

    

    @Id
    private String farechartid;
    private String fromstationid;
    private String tostationid;
    private String comptypeid;
    private String passtypeid;
    private double fareamount;

    public String getFarechartid() {
        return farechartid;
    }

    public void setFarechartid(String farechartid) {
        this.farechartid = farechartid;
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

    public String getComptypeid() {
        return comptypeid;
    }

    public void setComptypeid(String comptypeid) {
        this.comptypeid = comptypeid;
    }

    public String getPasstypeid() {
        return passtypeid;
    }

    public void setPasstypeid(String passtypeid) {
        this.passtypeid = passtypeid;
    }
public double getFareamount() {
        return fareamount;
    }

    public void setFareamount(double fareamount) {
        this.fareamount = fareamount;
    }
   

}
