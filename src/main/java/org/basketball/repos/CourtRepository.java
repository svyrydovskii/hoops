package org.basketball.repos;

import org.basketball.domain.Court;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by Andrii Svyrydovskyi on 17/10/2016.
 */
public interface CourtRepository extends JpaRepository<Court, UUID> {
}
