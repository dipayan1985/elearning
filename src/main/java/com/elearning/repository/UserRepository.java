package com.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
