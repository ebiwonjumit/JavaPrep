package com.iheart.training;

public class AlgorithmFactory {

    public static final int SHORTEST_PATH = 0;
    public static final int SPANNING_TREE = 1;

    public static AlgorithmF createAlgorithm(int type){

        switch (type){
            case SHORTEST_PATH:
                return new ShortestPath();

            case SPANNING_TREE:
                return new SpanningTree();

            default:
                return null;
        }
    }

}
