package com.tiagocordeiro.course.repositories;

import com.tiagocordeiro.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
