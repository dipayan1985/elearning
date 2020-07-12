package com.elearning.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.elearning.model.Course;
import com.elearning.model.Lesson;
import com.elearning.model.LessonSet;
import com.elearning.model.Student;

@RequestMapping("/student")
public class StudentAdaptiveController {
	@GetMapping
	public List<Lesson> getLessons(@RequestBody Student student) {
		Lesson l = new Lesson();              //create object of class lesson
		l.setLessonName("Test1");			 // set value
		l.setLessonHour(1);

		Lesson l2 = new Lesson();
		l.setLessonName("Test2");
		l.setLessonHour(1);

		LessonSet ls1 = new LessonSet();       //create object of class lessonSet
		ls1.setLessons(Arrays.asList(l, l2));  // 

		Course c = new Course();

		c.setLessonset(Arrays.asList(ls1));

		//check the level with class lessonSet (field:type) to get respective lessons for level
		if (student.getLevel().equals("A")) {
			for (LessonSet ls : c.getLessonset()) {
				if (ls.getType().equals("A")) {
					return ls.getLessons();
				}
			}
		}

		return null;
	}
}