package com.leonardo.trafficsim.models.road;

import java.util.ArrayList;
import java.util.List;
import com.leonardo.trafficsim.models.road.RoadSegment;

public class Road {

    private List<RoadSegment> segments;

    public Road(List<RoadSegment> segments) { segments = new ArrayList<>(); }

    public void addSegment(RoadSegment segment) { segments.add(segment); }

    public List<RoadSegment> getSegments() { return segments; }
}
