package com.iheart.training;

import java.util.List;
//Violates the Liskov principle
public class UserSetting implements DatabaseConnector{
    @Override
    public List<String> load() {
        return null;
    }

    @Override
    public void persist(String a) {
     throw new RuntimeException("]]]]");
    }
}
