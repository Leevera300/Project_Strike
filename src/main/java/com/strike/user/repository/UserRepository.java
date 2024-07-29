package com.strike.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.strike.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
