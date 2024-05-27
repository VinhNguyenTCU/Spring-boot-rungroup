package edu.tcu.cs.rungroup.service;

import edu.tcu.cs.rungroup.dto.ClubDto;
import edu.tcu.cs.rungroup.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);
    ClubDto findClubById(long clubId);
    void updateClub(ClubDto clubDto);
    void delete(Long clubID);
    List<ClubDto> searchClubs(String query);
}
