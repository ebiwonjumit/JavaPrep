package com.iheart.training;

import java.util.ArrayList;
import java.util.List;

public class DatabaseN {

    private List<String> customerNames;

    public DatabaseN(){
        this.customerNames = new ArrayList<>();
        this.customerNames.add("Daniel");
        this.customerNames.add("Adam");
        this.customerNames.add("Joe");
        this.customerNames.add("Michael");
    }

    public boolean existCustomer(String name){

        for(String s : customerNames) {
            if (s.equals(name)) return true;
        }
        return false;


    }
}
