package com.leonardo.trafficsim.models.sign;

public class StopSign extends TrafficSign {

    public StopSign(double positionX, double positionY) {
        super(positionX, positionY);
        this.width = 0.75;
        this.height = 0.75;
    }

    @Override
    public void updateState(double simulationTime) {
        // No utility
    }
}
