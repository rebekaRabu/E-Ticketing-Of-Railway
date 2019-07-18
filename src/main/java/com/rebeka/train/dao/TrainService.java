/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Train;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface TrainService {

    public String create(Train train);

//    public String update(Train train);

//    public List<Train> findAll();


    public String findAll();
    
    public Train find(String sourcestion, String desstion, int da );
    
    
    
//    public List<Train> findAll();
    
//    public List<Train> find(String source, String dest, int day, String type);

   

}
