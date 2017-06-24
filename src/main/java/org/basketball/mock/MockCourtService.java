package org.basketball.mock;

import org.basketball.domain.Court;
import org.basketball.services.CourtService;

import java.util.List;
import java.util.UUID;


public class MockCourtService implements CourtService {
    @Override
    public List<Court> findAll() {
        return null;
    }

    @Override
    public Court findOne(UUID uuid) {
        return null;
    }

    @Override
    public Court findOne(String id) {
        return null;
    }
}
