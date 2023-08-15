package com.example.springsecureex1.repository;

import com.example.springsecureex1.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomUserRepository extends JpaRepository<CustomUser,Long> {
    Optional<CustomUser> findByUsername(String username);
}