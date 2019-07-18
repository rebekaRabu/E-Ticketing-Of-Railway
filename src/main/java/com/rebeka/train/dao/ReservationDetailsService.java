/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.ReservationDetails;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface ReservationDetailsService {

    public String insertReservationDetails(ArrayList<ReservationDetails> reservationdetails);

    public String viewReservationDetails();

    public ReservationDetails viewOneReservationDetails(String id);

}
