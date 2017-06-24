package org.basketball.services;

import org.basketball.domain.Location;

public class LocationUtil {

    public static boolean locationsClose(Location centre, Location point, float radius) {
        double distance = Math.pow((point.getLatitude() - centre.getLatitude()), 2) + Math.pow(point.getLongitude() - centre.getLongitude(), 2);
        double rad = Math.pow(radius, 2);
        return distance < rad;
    }

}
