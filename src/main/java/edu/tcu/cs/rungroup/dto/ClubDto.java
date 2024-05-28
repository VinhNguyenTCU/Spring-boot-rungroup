package edu.tcu.cs.rungroup.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ClubDto {
    private Long id;

    @NotEmpty(message = "The club title should not be empty")
    private String title;

    @NotEmpty(message = "The photo's address should not be empty")
    private String photoUrl;

    @NotEmpty(message = "The club's content should not be empty")
    private String content;
    private LocalDateTime createOn;
    private LocalDateTime updateOn;
    private List<EventDto> events;
}
