package com.elearning.repository;

import java.util.List;

import com.elearning.model.Student;

public interface AdaptiveRepositoryCustom {
	
	List<Student> getLessons(String lessons);

}
