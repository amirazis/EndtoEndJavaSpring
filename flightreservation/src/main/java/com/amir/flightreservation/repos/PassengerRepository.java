package com.amir.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
