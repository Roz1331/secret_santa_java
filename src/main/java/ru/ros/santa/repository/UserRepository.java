package ru.ros.santa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ros.santa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String username);
}
