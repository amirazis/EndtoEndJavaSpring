package com.amir.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
