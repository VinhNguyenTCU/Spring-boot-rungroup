package edu.tcu.cs.rungroup.dto;

import edu.tcu.cs.rungroup.models.Club;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long id;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd --- HH:mm")
    private LocalDateTime startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd --- HH:mm")
    private LocalDateTime endTime;

    private String type;

    private String photoUrl;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    private Club club;
}
