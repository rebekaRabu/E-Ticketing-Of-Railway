/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.FromStation;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface FromStationService {
    
     public String insertFromStation(FromStation cm);

    public String updateFromStation(FromStation cm);

    public String deleteFromStation(String id);

    public String viewFromStation();

    public FromStation viewOneFromStation(String id);
    
}
