/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author acer
 */
@Entity
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String paymentid;
    @Column
    String reservid;
    
    @Column
    int qty;

    @Column
    String farechartid;
    @Column
    double fareamt;
    @Column
    double total;

    public String getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getReservid() {
        return reservid;
    }

    public void setReservid(String reservid) {
        this.reservid = reservid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getFarechartid() {
        return farechartid;
    }

    public void setFarechartid(String farechartid) {
        this.farechartid = farechartid;
    }

    public double getFareamt() {
        return fareamt;
    }

    public void setFareamt(double fareamt) {
        this.fareamt = fareamt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
}
