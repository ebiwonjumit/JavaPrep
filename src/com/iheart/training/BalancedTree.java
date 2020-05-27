package com.iheart.training;

//Applies Interface Segregation Principle
public class BalancedTree implements BTree, Tree{
    @Override
    public int findMax() {
        return 0;
    }

    @Override
    public int findMin() {
        return 0;
    }

    @Override
    public int traverse() {
        return 0;
    }

    @Override
    public void rightRotation() {

    }

    @Override
    public void leftRotation() {

    }
}
