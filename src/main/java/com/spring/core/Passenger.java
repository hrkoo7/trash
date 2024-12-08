package com.spring.core;

public class Passenger {
    private Vehicle vehicle;

    public Passenger(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void startJourney(){
        this.vehicle.moving();
    }

}
