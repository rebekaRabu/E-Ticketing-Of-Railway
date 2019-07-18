/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.reportmodel;

import java.util.Date;

/**
 *
 * @author acer
 */

public class ReservationReport {
    String reservid;
    Date journeydate;

    public String getReservid() {
        return reservid;
    }

    public void setReservid(String reservid) {
        this.reservid = reservid;
    }

    public Date getJourneydate() {
        return journeydate;
    }

    public void setJourneydate(Date journeydate) {
        this.journeydate = journeydate;
    }
    
    
}
