package com.instagram.repository;

import com.instagram.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	
}
