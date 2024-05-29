package edu.tcu.cs.rungroup.repository;

import edu.tcu.cs.rungroup.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
