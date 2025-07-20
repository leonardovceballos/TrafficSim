package com.leonardo.trafficsim.models.vehicle;

import com.leonardo.trafficsim.utils.Constants;

public class Truck extends Vehicle {

    public Truck() {
        super(
                1.5,
                2.5,
                2.0,
                90.0,
                150.0
        );
        this.width = 2.5;
        this.height = 7.0;
    }
}
