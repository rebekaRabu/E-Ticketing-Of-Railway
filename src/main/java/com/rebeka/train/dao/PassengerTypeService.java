/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.PassengerType;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface PassengerTypeService {
    
    public String insertPassengerType(PassengerType cm);

    public String updatePassengerType(PassengerType cm);

    public String deletePassengerType(String id);

    public String viewPassengerType();

    public PassengerType viewOnePassengerType(String id);
    
}
