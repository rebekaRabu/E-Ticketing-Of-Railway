/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.dao;

import com.rebeka.train.model.Contact;

/**
 *
 * @author acer
 */
public interface ContactService {
    
    public String insertContact(Contact cm);
    public String updateContact(Contact cm);
    
    
}
