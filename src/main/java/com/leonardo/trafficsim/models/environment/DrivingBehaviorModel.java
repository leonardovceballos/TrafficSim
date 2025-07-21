package com.leonardo.trafficsim.models.environment;

public class DrivingBehaviorModel {
    public static double getStyleFactor(DrivingStyle style) {
        return switch (style) {
            case AGGRESSIVE -> 0.7;
            case CAUTIOUS -> 1.2;
            case NORMAL -> 1.0;
        };
    }

    public static double getFollowingDistance(DrivingStyle style) {
        return switch (style) {
            case AGGRESSIVE -> 5.0;
            case CAUTIOUS -> 12.0;
            case NORMAL -> 8.0;
        };
    }

    public static double getAccelerationFactor(DrivingStyle style) {
        return switch (style) {
            case AGGRESSIVE -> 1.3;
            case CAUTIOUS -> 0.8;
            case NORMAL -> 1.0;
        };
    }

}
