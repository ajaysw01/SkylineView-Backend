package com.ajay.repository;

import com.ajay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
/**
 * @author Ajay Wankhade
 */
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

    Optional<User> findByEmail(String email);
}