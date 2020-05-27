package com.iheart.training;

public class SorterManager {
     //Fails to follow Open Principle
//    public void sort(Sorter sorter){
//
//
//        if(sorter.type == SortType.INSERTIONSORT){
//            doInsertionSort(sorter);
//        }
//        else if(sorter.type == SortType.MERGESORT){
//            doMergeSort(sorter);
//        }
//    }
//
//    private void doInsertionSort(Sorter sorter){
//        sorter.sort();
//
//    }
//
//    private void doMergeSort(Sorter sorter){
//        sorter.sort();
//
//    }


    //Strategy Pattern
    public void sort(Sorter sorter){
        sorter.sort();
    }
}
