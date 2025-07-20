package com.leonardo.trafficsim.models.sign;

public class StopSign extends TrafficSign {

    public StopSign(double positionX, double positionY) {
        super(positionX, positionY);
    }

    @Override
    public void updateState(double simulationTime) {
        // No utility
    }
}
