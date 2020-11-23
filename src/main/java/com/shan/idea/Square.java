package com.shan.idea;

public class Square implements Shape {
    private int numberOfEdges;

    @Override
    public int getCornerCount() {
        return 4;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }
}
