package com.leonardo.trafficsim.models.vehicle;

import com.leonardo.trafficsim.models.road.RoadSegment;
import com.leonardo.trafficsim.utils.Constants;
import com.leonardo.trafficsim.models.environment.DrivingStyle;
import com.leonardo.trafficsim.models.environment.FuelProfile;
import com.leonardo.trafficsim.models.environment.DrivingBehaviorModel;
import javafx.geometry.Rectangle2D;

public class Vehicle {
    protected double positionX;
    protected double positionY;
    protected double speed;
    protected double acceleration;
    protected double reactionPower;
    protected double reactionTime;
    protected double maxSpeed;
    protected double fuelLevel;
    protected double fuelConsumption;
    protected double width = Constants.DEFAULT_VEHICLE_WIDTH;
    protected double height = Constants.DEFAULT_VEHICLE_HEIGHT;
    protected DrivingStyle drivingStyle;
    protected FuelProfile fuelProfile;
    private double progressAlongSegment = 0.0;
    private RoadSegment currentSegment;


    public Vehicle(
            double acceleration,
            double reactionPower,
            double reactionTime,
            double maxSpeed,
            double fuelLevel,
            DrivingStyle drivingStyle,
            FuelProfile fuelProfile
    ) {
        this.positionX = 0;
        this.positionY = 0;
        this.speed = 0;
        this.acceleration = acceleration;
        this.reactionPower = reactionPower;
        this.reactionTime = reactionTime;
        this.maxSpeed = maxSpeed;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = 1.0;
        this.drivingStyle = drivingStyle;
        this.fuelProfile = fuelProfile;
    }

    public void updatePosition(double deltaTime) {
        speed += acceleration * deltaTime;
        if (speed > maxSpeed) speed = maxSpeed;
        positionX += speed * deltaTime;
    }

    public void applyBrakes() {
        double styleFactor = DrivingBehaviorModel.getStyleFactor(this.drivingStyle);
        double deceleration = styleFactor * reactionPower;
        speed -= deceleration;
        speed = Math.max(speed, 0);
    }

    public void updateFuelConsumption() {
        double consumptionRate = fuelProfile.calculateConsumption(acceleration)
        fuelLevel -= consumptionRate;
        fuelLevel = Math.max(fuelLevel, 0);
    }

    // Getters
    public Rectangle2D getHitbox() {
        return new Rectangle2D(positionX, positionY, width, height);
    }
    public double getPositionX() { return positionX; }
    public double getPositionY() { return positionY; }
    public double getSpeed() { return speed; }
    public double getAcceleration() { return acceleration; }
    public double getReactionPower() { return reactionPower; }
    public double getReactionTime() { return reactionTime; }
    public double getMaxSpeed() { return maxSpeed; }
    public double getFuelLevel() { return fuelLevel; }
    public double getFuelConsumption() { return fuelConsumption; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public DrivingStyle getDrivingStyle() { return drivingStyle; }
    public FuelProfile getFuelProfile() { return fuelProfile; }
    public double getProgressAlongSegment() { return progressAlongSegment; }
    public RoadSegment getCurrentSegment() { return currentSegment; }

    // Setters
    public void setPositionX(double positionX) { this.positionX = positionX; }
    public void setPositionY(double positionY) { this.positionY = positionY; }
    public void setSpeed(double speed) { this.speed = speed; }
    public void setAcceleration(double acceleration) { this.acceleration = acceleration; }
    public void setReactionPower(double reactionPower) { this.reactionPower = reactionPower; }
    public void setReactionTime(double reactionTime) { this.reactionTime = reactionTime; }
    public void setMaxSpeed(double maxSpeed) { this.maxSpeed = maxSpeed; }
    public void setFuelLevel(double fuelLevel) { this.fuelLevel = fuelLevel; }
    public void setFuelConsumption(double fuelConsumption) { this.fuelConsumption = fuelConsumption; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public void setDrivingStyle(DrivingStyle drivingStyle) {  this.drivingStyle = drivingStyle; }
    public void setFuelProfile(FuelProfile fuelProfile) { this.fuelProfile = fuelProfile; }
    public void setProgressAlongSegment(double value) {
        this.progressAlongSegment = Math.max(0.0, Math.min(1.0, value));
    }
    public void setCurrentSegment(RoadSegment currentSegment) { this.currentSegment = currentSegment; }

}
