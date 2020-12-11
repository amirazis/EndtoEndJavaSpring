package com.amir.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
