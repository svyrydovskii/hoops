package org.basketball.services;

import org.basketball.domain.Court;

import java.util.List;
import java.util.UUID;


//@Service
public interface CourtService {
    List<Court> findAll();

    Court findOne(UUID uuid);

    Court findOne(String id);
}
