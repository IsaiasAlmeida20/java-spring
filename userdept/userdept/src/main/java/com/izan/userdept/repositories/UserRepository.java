package com.izan.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izan.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
