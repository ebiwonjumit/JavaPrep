package com.iheart.training;

import java.util.ArrayList;
import java.util.List;

public class DatabaseD implements PersonDAO{

    private List<PersonD> people;

    public DatabaseD(){
        this.people = new ArrayList<>();
    }

    @Override
    public void insert(PersonD person) {
        this.people.add(person);

    }

    @Override
    public void remove(PersonD person) {
        this.people.remove(person);

    }

    @Override
    public List<PersonD> getPeople() {
        return this.people;
    }
}
