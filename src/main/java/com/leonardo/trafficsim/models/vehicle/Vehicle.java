package com.leonardo.trafficsim.models.vehicle;
import com.leonardo.trafficsim.utils.Constants;
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


    public Vehicle(
            double acceleration,
            double reactionPower,
            double reactionTime,
            double maxSpeed,
            double fuelLevel
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
    }

    public void updatePosition(double deltaTime) {
        speed += acceleration * deltaTime;
        if (speed > maxSpeed) speed = maxSpeed;
        positionX += speed * deltaTime;
    }

    public void applyBrakes(double intensity) {
        speed -= reactionPower * intensity;
        if (speed < 0) speed = 0;
    }

    public void updateFuelConsumption() {
        if (acceleration > Constants.ACCELERATION_THRESHOLD) {
            fuelConsumption += 0.1;
        } else {
            fuelConsumption -= 0.05;
        }
        fuelConsumption = Math.max(0.5, Math.min(fuelConsumption, 3.0));
        fuelLevel -= acceleration * Constants.FUEL_USAGE_RATE;
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

}
