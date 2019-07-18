/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.FareChart;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface FareChartService {
    
    public String insertFareChart(FareChart cm);
    public String updateFareChart(String id, FareChart cm);
    public String deleteFareChart(String id);
    public String viewFareChart();
    public FareChart viewOneFareChart(String id);
    
}
