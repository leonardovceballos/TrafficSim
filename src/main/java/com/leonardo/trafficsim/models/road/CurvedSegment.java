package com.leonardo.trafficsim.models.road;

public class CurvedSegment extends RoadSegment {

    private double centerX, CenterY;
    private double radius;
    // Radians
    private double startAngle;
    private double endAngle;

    public CurvedSegment(
            double centerX,
            double centerY,
            double radius,
            double startAngle,
            double endAngle,
            int lanes
    ) {
        super(lanes);
        this.centerX = centerX;
        this.CenterY = centerY;
        this.radius = radius;
        this.startAngle = startAngle;
        this.endAngle = endAngle;
    }

    // Getters
    public double getLength() {
        return this.radius * Math.abs(endAngle - startAngle);
    }
    public int getLanes() { return this.numberOfLanes; }
    public double getCenterX() { return this.centerX; }
    public double getCenterY() { return this.CenterY; }
    public double getRadius() { return this.radius; }
    public double getStartAngle() { return this.startAngle; }
    public double getEndAngle() { return this.endAngle; }
}
