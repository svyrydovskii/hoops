package org.basketball.services;

import org.basketball.domain.Court;
import org.basketball.domain.Location;
import org.basketball.repos.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class CourtServiceImpl implements CourtService {
    @Autowired
    CourtRepository courtRepository;

    public List<Court> findAll() {
        return courtRepository.findAll();
    }

    public Court findOne(UUID uuid) {
        return courtRepository.findOne(uuid);
    }

    public Court findOne(String id) {
        UUID uuid = UUID.fromString(id);
        return findOne(uuid);
    }

    public List<Court> findByProximity(Location location, float radius) {
        return findAll().stream()
                .filter(court ->
                        LocationUtil.locationsClose(location, court.getLocation(), radius))
                .collect(Collectors.toList());
    }


}
