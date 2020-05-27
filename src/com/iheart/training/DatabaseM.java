package com.iheart.training;

import java.util.ArrayList;
import java.util.List;
public class DatabaseM {

    private List<PersonM> peopleDatabase;

    public DatabaseM() {
        this.peopleDatabase = new ArrayList<>();
    }

    public void addPerson(PersonM person){
        this.peopleDatabase.add(person);
    }

    public void removePerson(PersonM person){
        this.peopleDatabase.remove(person);
    }

    public List<PersonM> getPeopleDatabase(){
        return this.peopleDatabase;
    }
}
