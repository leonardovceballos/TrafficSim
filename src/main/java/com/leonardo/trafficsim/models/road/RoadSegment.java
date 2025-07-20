package com.leonardo.trafficsim.models.road;

public abstract class RoadSegment {
    protected int numberOfLanes;

    public RoadSegment(int numberOfLanes) { this.numberOfLanes = numberOfLanes; }

    public abstract double getLength();
    public int getNumberOfLanes() { return numberOfLanes; }
}
