package edu.tcu.cs.rungroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.tcu.cs.rungroup.models.Club;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
}
