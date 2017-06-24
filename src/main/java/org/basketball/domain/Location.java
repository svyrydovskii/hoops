package org.basketball.domain;

import javax.persistence.Embeddable;

/**
 * Created by Andrii Svyrydovskyi on 25/09/2016.
 */
@Embeddable
public class Location {
    private float latitude;
    private float longitude;

    public Location() {
    }

    public Location(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
