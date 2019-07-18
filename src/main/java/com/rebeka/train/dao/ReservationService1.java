/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Reservation1;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface ReservationService1 {
    public String insertReservation( Reservation1 rv);

    public String updateReservation(String res_id, Reservation1 rv);

    public String deleteReservation(String res_id);

    public String viewReservation();

    public Reservation1 viewOneReservation(String res_id);
    
}