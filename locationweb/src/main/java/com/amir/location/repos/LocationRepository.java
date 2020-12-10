package com.amir.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
