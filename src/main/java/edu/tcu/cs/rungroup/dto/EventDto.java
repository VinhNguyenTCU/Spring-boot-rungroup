package edu.tcu.cs.rungroup.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long id;

    private String name;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String type;

    private String photoUrl;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

}
