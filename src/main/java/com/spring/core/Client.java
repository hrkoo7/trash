package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args){
        Vehicle vehicle=new Car();
        Passenger pass =new Passenger(vehicle);

        pass.startJourney();
//creating spring ioc container
        //read the configuration class
        //create and manage spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //retrieve spring beans from spring ioc containers
        Car car =applicationContext.getBean(Car.class);
        car.moving();

        Passenger passenger=applicationContext.getBean(Passenger.class);
        passenger.startJourney();

    }
//creating spring ioc container
    //read the configuration class
    //create and manage spring beans



}
