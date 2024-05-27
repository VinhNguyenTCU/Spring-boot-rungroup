package edu.tcu.cs.rungroup.repository;

import edu.tcu.cs.rungroup.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
