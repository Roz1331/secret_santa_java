package ru.ros.santa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ros.santa.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
