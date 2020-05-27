package com.iheart.training;

public class CustomerFactory {
    private DatabaseN database;

    public CustomerFactory(){
        this.database = new DatabaseN();
    }

    public AbstractCustomer getCustomer(String name){
        if(checkName(name)){
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }

    private boolean checkName(String name) {
        if(database.existCustomer(name)) return true;
        return false;
    }
}
