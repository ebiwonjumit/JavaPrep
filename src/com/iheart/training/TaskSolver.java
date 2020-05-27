package com.iheart.training;

public class TaskSolver implements Command2{
    private Task task;

    public TaskSolver(Task task){
        this.task = task;
    }

    @Override
    public void execute() {
        this.task.solveProblem();
    }
}
