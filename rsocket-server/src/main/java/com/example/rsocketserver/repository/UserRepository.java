package com.example.rsocketserver.repository;

import com.example.rsocketserver.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
