package com.leonardo.trafficsim.models.environment;

public class FuelProfile {

    private double baseConsumptionRate;
    private double aggressionMultiplier;

    public FuelProfile(double baseConsumptionRate, double aggressionMultiplier) {
        this.baseConsumptionRate = baseConsumptionRate;
        this.aggressionMultiplier = aggressionMultiplier;
    }

    public double calculateConsumption(double acceleration) {
        return baseConsumptionRate * aggressionMultiplier * acceleration;
    }

    // Getters
    public double getBaseConsumptionRate() { return baseConsumptionRate; }
    public double getAggressionMultiplier() { return aggressionMultiplier; }
    // Setters
    public void setBaseConsumptionRate(double baseConsumptionRate) { this.baseConsumptionRate = baseConsumptionRate; }
    public void setAggressionMultiplier(double aggressionMultiplier) { this.aggressionMultiplier = aggressionMultiplier; }

}
