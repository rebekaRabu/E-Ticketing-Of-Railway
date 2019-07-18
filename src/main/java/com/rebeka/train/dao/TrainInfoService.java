/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Reservation;
import com.rebeka.train.model.TrainInfo;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface TrainInfoService {
    
     public String insertTrainInfo(TrainInfo cm);

    public String updateTrainInfo(String id, TrainInfo cm);

    public String deleteTrainInfo(String id);

    public String viewTrainInfo();

    public TrainInfo viewOneTrainInfo(String id);
    
    
    
     public TrainInfo strain(TrainInfo ti);
    
     public TrainInfo buyticket(String tid);

    
    public  String searchTrain(TrainInfo cm);
    
    /**
     *
     * @param resid
     * @return
     */
    public String addReservation(Reservation resid);
   
    
}
