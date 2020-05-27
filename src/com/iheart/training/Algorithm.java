package com.iheart.training;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Algorithm {

    private BlockingQueue<Command2> commandList;

    public Algorithm(){
        this.commandList = new ArrayBlockingQueue<>(10);
    }

    public void produce(){
        try{
            for(int i = 0; i <10; i++){
                commandList.add(new TaskSolver(new Task(i+1)));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public void consume(){
        try{
            for(int i =0; i<10; i++){
                Thread.sleep(10000);
                commandList.take().execute();
            }

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
