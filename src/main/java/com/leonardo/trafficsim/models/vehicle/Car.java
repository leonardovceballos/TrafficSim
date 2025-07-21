package com.leonardo.trafficsim.models.vehicle;

import com.leonardo.trafficsim.utils.Constants;
import com.leonardo.trafficsim.models.environment.*;

public class Car extends Vehicle {

    public Car() {
        super(
                Constants.DEFAULT_ACCELERATION,
                Constants.DEFAULT_REACTION_POWER,
                Constants.DEFAULT_REACTION_TIME,
                Constants.DEFAULT_MAX_SPEED,
                Constants.DEFAULT_FUEL_LEVEL
                DrivingStyle.NORMAL,
                new FuelProfile(0.5, 1.0)
        );
        this.width = 1.8;
        this.height = 4.0;
    }
}
