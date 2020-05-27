package com.iheart.training;

public class SortingManagerF {

    private AlgorithmF bubbleSortF;
    private AlgorithmF mergeSortF;
    private AlgorithmF quickSortF;

    public SortingManagerF(){
        this.bubbleSortF = new BubbleSortF();
        this.mergeSortF = new MergeSortF();
        this.quickSortF = new QuickSortF();
    }

    public void doBubbleSort(){
        this.bubbleSortF.solve();
    }
    public void doMergeSort(){
        this.mergeSortF.solve();
    }
    public void doQuickSort(){
        this.quickSortF.solve();
    }

}
