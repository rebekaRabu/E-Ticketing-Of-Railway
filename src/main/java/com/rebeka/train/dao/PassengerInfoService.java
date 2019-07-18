/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.PassengerInfo;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface PassengerInfoService {
    
    public String acceptPassenger(PassengerInfo cm);

    public String insertPassengerInfo(PassengerInfo cm);

    public String updatePassengerInfo(PassengerInfo cm);

    public String deletePassengerInfo(String  id);

    public String viewPassengerInfo();

    public PassengerInfo viewOnePassengerInfo(String  id);
    
    public PassengerInfo viewOnePassengermail(String email);

}
