/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Test;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface TestService {
    
    public String insertTest(Test ts);
    public String updateTest(String id, Test ts);
    public String deleteTest(String id);
    public String viewTest();
    public String viewOneTest(String id);
}
