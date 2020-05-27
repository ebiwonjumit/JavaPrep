package com.iheart.training;

public abstract class AlgorithmT {

    public abstract void initialize();
    public abstract void sorting();
    public abstract void printResult();

    public void sort(){
        initialize();
        sorting();
        printResult();
    }
}
