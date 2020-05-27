package com.iheart.training;

public class MergeSort implements Sorter{

     //Fails to follow Open Principle
//    public MergeSort(){
//        super.type = SortType.MERGESORT;
//
//    }

    //Strategy Pattern
    @Override
    public void sort(){
        System.out.println("Sorting with mergesort....");
    }
}
