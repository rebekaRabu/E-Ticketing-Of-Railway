/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 *
 * @author acer
 */
@Entity
public class PassengerInfo  implements  java.io.Serializable{
    
    
//    passengerid, passengername, emailid, reenteremailid, password, reenterpassword, dob, address, postcode, nid, birthid, email
    
    @Id
    private String passengerid;
    private String passengername;
    private String emailid;
   
    
    @Temporal(TemporalType.DATE)
    private Date dob;
    
    private String address;
    private String postcode;
    private String nid;
    private String birthid;
    private String phone;
    
    
    
    @Transient
    String password;
    
     
    
    @Transient
    String role="ROLE_PATIENT";
    @Transient
    String status="True";
    
    
    
    
    
    

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getBirthid() {
        return birthid;
    }

    public void setBirthid(String birthid) {
        this.birthid = birthid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
    
    
    
}
