/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.PurchaseTicket;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public interface PurchaseTicketService {
    
    
    public String insertPurchaseTicket(PurchaseTicket cm);
    public String updatePurchaseTicket(int id,PurchaseTicket cm);
    public String removePurchaseTicket(int id);
    public String viewPurchaseTicket();
    public PurchaseTicket viewOnePurchaseTicket(int id);
   
}
