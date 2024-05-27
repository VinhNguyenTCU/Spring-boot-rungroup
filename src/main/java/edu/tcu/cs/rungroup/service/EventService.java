package edu.tcu.cs.rungroup.service;

import edu.tcu.cs.rungroup.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

}
