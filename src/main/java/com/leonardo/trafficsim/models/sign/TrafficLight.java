package com.leonardo.trafficsim.models.sign;

public class TrafficLight extends TrafficSign {

    public enum LightState {
        RED,
        YELLOW,
        GREEN
    }

    private LightState currentState;
    private double timer;
    // Seconds
    private double redDuration = 5.0;
    private double yellowDuration = 2.0;
    private double greenDuration = 5.0;

    public TrafficLight(double positionX, double positionY) {
        super(positionX, positionY);
        this.currentState = LightState.RED;
        this.timer = 0.0;
    }

    @Override
    public void updateState(double deltaTime) {
        timer += deltaTime;
        switch (currentState) {
            case RED:
                if (timer >= redDuration) {
                    currentState = LightState.GREEN;
                    timer = 0;
                }
                break;
            case GREEN:
                if (timer >= greenDuration) {
                    currentState = LightState.YELLOW;
                    timer = 0;
                }
                break;
            case YELLOW:
                if (timer >= yellowDuration) {
                    currentState = LightState.RED;
                    timer = 0;
                }
                break;
        }
    }

    public LightState getCurrentState() {
        return currentState;
    }

    public void setDurations(double red, double yellow, double green) {
        this.redDuration = red;
        this.yellowDuration = yellow;
        this.greenDuration = green;
    }
}
