package com.leonardo.trafficsim.logic;

import com.leonardo.trafficsim.models.environment.DrivingBehaviorModel;
import com.leonardo.trafficsim.models.road.Lane;
import com.leonardo.trafficsim.models.road.RoadSegment;
import com.leonardo.trafficsim.models.vehicle.Vehicle;

import javafx.geometry.Rectangle2D;

public class MovementHandler {
    public void updateVehiclePosition(Vehicle vehicle, double deltaTime) {

        // Acceleration boost based on style
        double styleAcceleration = vehicle.getAcceleration() * DrivingBehaviorModel.getAccelerationFactor(vehicle.getDrivingStyle());
        double speed = vehicle.getSpeed();

        // Increase speed with scaled acceleration
        speed += styleAcceleration * deltaTime;
        speed = Math.min(speed, vehicle.getMaxSpeed());
        vehicle.setSpeed(speed);

        // Update position
        double newX = vehicle.getPositionX() + speed * deltaTime;
        vehicle.setPositionX(newX);
        RoadSegment segment = vehicle.getCurrentSegment(); // assume this is set earlier
        double progress = segment.calculateDistanceAlongSegment(vehicle.getPositionX(), vehicle.getPositionY());
        vehicle.setProgressAlongSegment(progress);


        // Update fuel consumption
        vehicle.updateFuelConsumption();
    }

    public void handleProximityAndBraking(Vehicle vehicle, Lane lane) {
        Rectangle2D selfHitbox = vehicle.getHitbox();
        double safeDistance = DrivingBehaviorModel.getFollowingDistance(vehicle.getDrivingStyle());

        for (Vehicle other : lane.getVehicles()) {
            if (other == vehicle) continue;

            Rectangle2D otherHitbox = other.getHitbox();
            if (CollisionDetector.isNear(selfHitbox, otherHitbox, safeDistance)
                && other.getPositionX() > vehicle.getPositionX()) {

            }
        }
    }

}
