package org.basketball.controller;

import org.basketball.domain.Court;
import org.basketball.services.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("court")
public class CourtController {

    @Autowired
    CourtService courtService;

    @GetMapping
    public List<Court> getAllCourts() {
        return courtService.findAll();
    }

    @GetMapping("{id}")
    public Court getCourtById(@PathVariable String id) {
        return courtService.findOne(id);
    }

    @PostMapping
    public Court createCourt(@RequestBody Court court) {
        return null;
    }

    @PutMapping
    public Court updateCourt(@RequestBody Court court) {
        return null;
    }

    @DeleteMapping
    public void deleteCourt(@RequestParam Long id) {

    }


}
