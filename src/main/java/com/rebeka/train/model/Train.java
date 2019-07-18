/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rebeka.train.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author acer
 */
@Entity
public class Train implements Serializable{
    
    @Id
    private String id;
    private String name;
    private String sourceStation;
    private String destinationStation;
    private String type;
    private double fare;
    private double distance;
    private int seats;
    private int arrives;
    private int departs;
    private int day [];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getArrives() {
        return arrives;
    }

    public void setArrives(int arrives) {
        this.arrives = arrives;
    }

    public int getDeparts() {
        return departs;
    }

    public void setDeparts(int departs) {
        this.departs = departs;
    }

    public int[] getDay() {
        return day;
    }

    public void setDay(int[] day) {
        this.day = day;
    }
   
    
    
    
}
