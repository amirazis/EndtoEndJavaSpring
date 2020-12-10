package com.amir.student.dal.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.amir.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	Optional<Student> findById(Long id);
}
