package com.iheart.training;

public class NameRepository {
    private String[] names ={"Adam", "Joe", "John", "Sarah"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
