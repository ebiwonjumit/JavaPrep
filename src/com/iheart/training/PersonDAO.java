package com.iheart.training;

import java.util.List;

public interface PersonDAO {
    public void insert(PersonD person);
    public void remove(PersonD person);
    public List<PersonD> getPeople();
}
