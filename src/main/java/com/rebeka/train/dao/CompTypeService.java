/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.CompType;
import com.rebeka.train.model.Station;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface CompTypeService {
    
    public String insertCompType(CompType cm);

    public String updateCompType(CompType cm);

    public String deleteCompType(String id);

    public String viewCompType();

    public CompType viewOneCompType(String id);
    
    
    public  String searchTrainSecond(CompType cm);
    
}
