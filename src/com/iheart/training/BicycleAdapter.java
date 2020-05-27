package com.iheart.training;

public class BicycleAdapter implements VehicleA{

    private BicycleA bicycle;

    public BicycleAdapter(BicycleA bicycle){
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();

    }
}
