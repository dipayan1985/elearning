package com.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.model.Student;

public interface StudentAdaptiveRepository extends JpaRepository<Student, Integer>, AdaptiveRepositoryCustom {

	

}
