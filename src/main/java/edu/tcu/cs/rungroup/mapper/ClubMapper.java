package edu.tcu.cs.rungroup.mapper;

import edu.tcu.cs.rungroup.dto.ClubDto;
import edu.tcu.cs.rungroup.models.Club;

import java.util.stream.Collectors;

import static edu.tcu.cs.rungroup.mapper.EventMapper.mapToEventDto;

public class ClubMapper {
    public static Club maptoClub(ClubDto club){
        Club clubDto = Club.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .updateOn(club.getUpdateOn())
                .createOn(club.getCreateOn())
                .build();
        return clubDto;
    }

    public static ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createOn(club.getCreateOn())
                .updateOn(club.getUpdateOn())
                .events(club.getEvents().stream().map(event -> mapToEventDto(event)).collect(Collectors.toList()))
                .build();
        return clubDto;
    }
}
