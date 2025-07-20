package com.leonardo.trafficsim.models.sign;

public abstract class TrafficSign {
    protected double positionX;
    protected double positionY;
    protected boolean isActive;

    public TrafficSign(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.isActive = true;
    }
    // To be implemented in subclasses
    public abstract void updateState(double simulationTime);

    // Getters
    public double getPositionX() { return positionX; }
    public double getPositionY() { return positionY; }
    public boolean isActive() { return isActive; }

    // Setters
    public void setPositionX(double positionX) { this.positionX = positionX; }
    public void setPositionY(double positionY) { this.positionY = positionY; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

}
