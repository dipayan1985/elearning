package com.elearning.model;

import java.util.ArrayList;
import java.util.List;

public class LessonSet {
	
	List<Lesson> lessons = new ArrayList<Lesson>();
	 public String type;
	 
	 public String getType() {
		 return type;
	 }
	 
	 public void setType(String type) {
		 this.type = type;
	 }

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

}
