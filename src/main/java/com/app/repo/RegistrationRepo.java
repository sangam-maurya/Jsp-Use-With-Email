package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.RegistrationEntity;

public interface RegistrationRepo extends JpaRepository<RegistrationEntity, Integer> {

}
