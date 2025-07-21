package com.leonardo.trafficsim.models.sign;

public abstract class TrafficSign {
    protected double positionX;
    protected double positionY;
    protected double width;
    protected double height;


    public TrafficSign(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // To be implemented in subclasses
    public abstract void updateState(double simulationTime);

    // Getters
    public double getPositionX() { return positionX; }
    public double getPositionY() { return positionY; }

    // Setters
    public void setPositionX(double positionX) { this.positionX = positionX; }
    public void setPositionY(double positionY) { this.positionY = positionY; }

}
