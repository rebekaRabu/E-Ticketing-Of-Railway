/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.CompSubType;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface CompSubTypeService {
    
    public String insertCompSubType(CompSubType cm);

    public String updateCompSubType(CompSubType cm);

    public String deleteCompSubType(String id);

    public String viewCompSubType();

    public CompSubType viewOneCompType(String id);
    
}
