/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Station;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface StationService {
    
     public String insertStation(Station cm);

    public String updateStation(Station cm);

    public String deleteStation(String id);

    public String viewStation();

    public Station viewOneStation(String id);
}
