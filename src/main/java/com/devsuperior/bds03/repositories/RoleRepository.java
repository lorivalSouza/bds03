package com.devsuperior.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds03.entities.Role;
import com.devsuperior.bds03.entities.User;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
