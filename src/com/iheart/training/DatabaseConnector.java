package com.iheart.training;

import java.util.List;

public interface DatabaseConnector {
    public List<String> load();
    public void persist(String a);
}
