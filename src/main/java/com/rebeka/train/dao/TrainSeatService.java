/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.TrainSeat;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface TrainSeatService {

    public String insertTrainSeat(TrainSeat cm);

    public String updateTrainSeat(String id, TrainSeat cm);

    public String deleteTrainSeat(String id);

    public String viewTrainSeat();

    public TrainSeat viewOneTrainSeat(String id);

}
