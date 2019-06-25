package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.model.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
