package edu.tcu.cs.rungroup.service.impl;

import edu.tcu.cs.rungroup.dto.RegistrationDto;
import edu.tcu.cs.rungroup.models.Role;
import edu.tcu.cs.rungroup.models.UserEntity;
import edu.tcu.cs.rungroup.repository.RoleRepository;
import edu.tcu.cs.rungroup.repository.UserRepository;
import edu.tcu.cs.rungroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(registrationDto.getUserName());
        userEntity.setEmail(registrationDto.getEmail());
        userEntity.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");
        userEntity.setRoles(Arrays.asList(role));
        userRepository.save(userEntity);
    }
}
