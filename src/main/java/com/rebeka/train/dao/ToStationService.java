/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.ToStation;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface ToStationService {
    
     public String insertToStation(ToStation cm);

    public String updateToStation(ToStation cm);

    public String deleteToStation(String id);

    public String viewToStation();

    public ToStation viewOneCompType(String id);
    
    
}
