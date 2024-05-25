package edu.tcu.cs.rungroup.service;

import edu.tcu.cs.rungroup.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
