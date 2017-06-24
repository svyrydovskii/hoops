package org.basketball.search;

import org.basketball.domain.Court;
import org.basketball.domain.Location;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class PolygonSearcher {

    public static void main(String[] args) {
        int[] xs = {0, 1, 3, 4, 2};
        int[] ys = {3, 4, 3, 2, 1};
        Polygon polygon = new Polygon(xs, ys, 5);
        boolean one = polygon.contains(1, 1);
        System.out.println(one);
    }

    public List<Court> findInPolygon(List<Location> locations) {
        List<Integer> xs = locations.stream()
                .map(location -> location.getLatitude())
                .map(f -> mapToInt(f))
                .collect(Collectors.toList());
        List<Float> ys = locations.stream().map(location -> location.getLongitude()).collect(Collectors.toList());

        //Polygon polygon = new Polygon(xs.toArray(), ys.toArray(), xs.size());

//        todo: implement searcher
        return null;

    }

    private int mapToInt(float point) {
        return 0; //todo
    }

    private float mapToFloat(int i) {
        return 0;//todo
    }


}
