package com.leonardo.trafficsim.models.road;

public class StraightSegment extends RoadSegment {

    private double startX, startY, endX, endY;

    public StraightSegment(
            double startX,
            double startY,
            double endX,
            double endY,
            int lanes
    ) {
        super(lanes);
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public double getLength() {
        return Math.hypot(endX - startX, endY - startY);
    }

    @Override
    public double calculateDistanceAlongSegment(double posX, double posY) {
        double dx = posX - startX;
        double dy = posY - startY;
        return Math.hypot(dx, dy);
    }

}
