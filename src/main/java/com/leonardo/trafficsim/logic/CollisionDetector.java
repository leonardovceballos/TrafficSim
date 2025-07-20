package com.leonardo.trafficsim.logic;

import javafx.geometry.Rectangle2D;

public class CollisionDetector {

    public static boolean intersects(Rectangle2D a, Rectangle2D b) {
        return a.intersects(b);
    }

    public static boolean isNear(Rectangle2D a, Rectangle2D b, double margin) {
        return a.intersects(
                b.getMinX() - margin,
                b.getMinY() - margin,
                b.getWidth() + 2 * margin,
                b.getHeight() + 2 * margin
        );
    }
}
