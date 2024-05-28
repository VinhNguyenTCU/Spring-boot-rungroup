package edu.tcu.cs.rungroup.service.impl;

import edu.tcu.cs.rungroup.dto.ClubDto;
import edu.tcu.cs.rungroup.models.Club;
import edu.tcu.cs.rungroup.repository.ClubRepository;
import edu.tcu.cs.rungroup.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static edu.tcu.cs.rungroup.mapper.ClubMapper.mapToClubDto;
import static edu.tcu.cs.rungroup.mapper.ClubMapper.maptoClub;

@Service
public class ClubServiceImpl implements ClubService {

    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club -> mapToClubDto(club))).collect(Collectors.toList());
    }

    @Override
    public Club saveClub(ClubDto clubDto) {
        Club club = maptoClub(clubDto);
        return clubRepository.save(club);
    }

    @Override
    public ClubDto findClubById(long clubId) {
        Club club = clubRepository.findById(clubId).get();
        return mapToClubDto(club);
    }

    @Override
    public void updateClub(ClubDto clubDto) {
        Club club = maptoClub(clubDto);
        clubRepository.save(club);
    }

    @Override
    public void delete(Long clubID) {
        clubRepository.deleteById(clubID);
    }

    @Override
    public List<ClubDto> searchClubs(String query) {
        List<Club> clubs = clubRepository.searchClubs(query);
        return clubs.stream().map((club -> mapToClubDto(club))).collect(Collectors.toList());
    }

}
