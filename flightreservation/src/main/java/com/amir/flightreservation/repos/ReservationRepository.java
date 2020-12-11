package com.amir.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
