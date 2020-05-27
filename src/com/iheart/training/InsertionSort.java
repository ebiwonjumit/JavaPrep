package com.iheart.training;

public class InsertionSort implements Sorter{

    //Fails to follow Open Principle
//    public InsertionSort(){
//        super.type = SortType.INSERTIONSORT;
//    }

    //Strategy Pattern
    @Override
    public void sort() {
        System.out.println("Sorting with Insertion sort.....");
    }
}
