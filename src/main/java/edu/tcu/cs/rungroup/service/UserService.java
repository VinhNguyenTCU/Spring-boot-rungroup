package edu.tcu.cs.rungroup.service;

import edu.tcu.cs.rungroup.dto.RegistrationDto;
import edu.tcu.cs.rungroup.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUserName(String userName);
}
