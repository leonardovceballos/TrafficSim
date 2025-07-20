package com.leonardo.trafficsim.utils;

public class Constants {

    // Default Vehicle Parameters
    public static final double DEFAULT_ACCELERATION = 2.5;
    public static final double DEFAULT_REACTION_POWER = 3.0;
    public static final double DEFAULT_REACTION_TIME = 1.5;
    public static final double DEFAULT_MAX_SPEED = 120.0; // km/h
    public static final double DEFAULT_FUEL_LEVEL = 100.0; // percent or liters
    public static final double DEFAULT_FUEL_CONSUMPTION_MULTIPLIER = 1.0;

    // Fuel Simulation Constants
    public static final double FUEL_USAGE_RATE = 0.05; // fuel units per tick per acceleration
    public static final double ACCELERATION_THRESHOLD = 2.0; // determines "aggressive driving"

    // Braking Behavior
    public static final double MAX_BRAKING_POWER = 5.0;
    public static final double MIN_BRAKING_POWER = 1.0;

    // Simulation Timing
    public static final double SIMULATION_TICK_RATE = 0.016; // ~60 FPS
}
