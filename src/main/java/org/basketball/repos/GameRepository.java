package org.basketball.repos;

import org.basketball.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


/**
 * Created by Andrii Svyrydovskyi on 16/10/2016.
 */
public interface GameRepository extends JpaRepository<Game, UUID> {
}
