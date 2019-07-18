/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Reservation;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface ReservationService {

    public String insertReservation(Reservation rs);

    public String updateReservation(String id, Reservation rs);

    public String deleteReservation(String id);

    public String viewReservation();

    public Reservation viewOneReservation(String id);
    
   
    
    
}
