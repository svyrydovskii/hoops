package org.basketball.controller;

import org.basketball.domain.Court;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("court/search")
public class CourtSearchController {


    @GetMapping("near")
    public List<Court> searchNearby(@RequestParam long lon, @RequestParam long lat) {
        return null;
    }

    @GetMapping("polygon")
    public List<Court> searchInPolygon(@RequestParam List<Long> points) {
        return null;
    }
}
