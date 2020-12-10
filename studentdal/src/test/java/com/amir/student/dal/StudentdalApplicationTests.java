package com.amir.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.amir.student.dal.entities.Student;
import com.amir.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	ApplicationContext context;

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {

		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Service");
		student.setFee(120d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(5L);
		System.out.println(student);
	}

	@Test
	//Only field need to update
	public void updateStudent() {
		Student entity = new Student();
		Optional<Student> student = studentRepository.findById(5l);

		Student newStudent = student.get();
		//newStudent.setName("Jason");
		newStudent.setCourse("Java Core");
		//newStudent.setFee(40d);

		newStudent = studentRepository.save(newStudent);

		/*
		 * Optional<EmployeeEntity> employee = repository.findById(entity.getId());
		 * if(employee.isPresent()) { 
		 * EmployeeEntity newEntity = employee.get();
		 * newEntity.setEmail(entity.getEmail());
		 * newEntity.setFirstName(entity.getFirstName());
		 * newEntity.setLastName(entity.getLastName());
		 * 
		 * newEntity = repository.save(newEntity);
		 * 
		 * return newEntity; } else { entity = repository.save(entity);
		 * 
		 * return entity; }
		 */
	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		studentRepository.deleteAll();
	}
}
