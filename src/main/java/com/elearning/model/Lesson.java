package com.elearning.model;


public class Lesson {
		
	public long lesson_id;
	public String lessonname;	
	public long lessonhour;
	
	public long getId() {
		return lesson_id;
	}

	public void setId(long lesson_id) {
		this.lesson_id = lesson_id;
			
	}
	
	public String getLessonName() {
		return lessonname;
	}

	public void setLessonName(String lessonname) {
		this.lessonname = lessonname;
	}
	
	public long getLessonHour() {
		return lessonhour;
	}

	public void setLessonHour(long lessonhour) {
		this.lessonhour = lessonhour;
	}
	

}
