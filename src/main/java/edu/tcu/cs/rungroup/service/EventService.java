package edu.tcu.cs.rungroup.service;

import edu.tcu.cs.rungroup.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);
}
