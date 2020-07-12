package com.elearning.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

	public long course_id;

	public String coursename;

	List<LessonSet> lessonset = new ArrayList<LessonSet>();

	public long getId() {
		return course_id;
	}

	public List<LessonSet> getLessonset() {
		return lessonset;
	}

	public void setLessonset(List<LessonSet> lessonset) {
		this.lessonset = lessonset;
	}

	public void setId(long course_id) {
		this.course_id = course_id;
	}

	public String getCourseName() {
		return coursename;
	}

	public void setId(String coursename) {
		this.coursename = coursename;

	}

}
