package com.iheart.training;

//applies Liskov principle
public class ElectricCar implements ElectricVehicle{

    @Override
    public void speed() {
        System.out.println("Speed of Electric Car");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charing battery");
    }
}
