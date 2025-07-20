package com.leonardo.trafficsim.models.road;

import com.leonardo.trafficsim.models.vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class Lane {

    private int index;
    private RoadSegment parentSegment;
    private List<Vehicle> vehicles;

    public Lane(int index, RoadSegment parentSegment) {
        this.index = index;
        this.parentSegment = parentSegment;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) { this.vehicles.add(vehicle); }
    public void removeVehicle(Vehicle vehicle) { this.vehicles.remove(vehicle); }

    public List<Vehicle> getVehicles() { return this.vehicles; }
    public int getIndex() { return this.index; }
    public RoadSegment getParentSegment() { return this.parentSegment; }
}
