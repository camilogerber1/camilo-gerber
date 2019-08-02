package Entities;

import org.mongodb.morphia.annotations.Embedded;

@Embedded public class Course {
  private String name;
  @Embedded private Notes notes;
  @Embedded private Teacher teacher;

  public Course() {
  }

  public Course(String name, Notes notes, Teacher teacher) {
	this.name = name;
	this.notes = notes;
	this.teacher = teacher;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public Notes getNotes() {
	return notes;
  }

  public void setNotes(Notes notes) {
	this.notes = notes;
  }

  public Teacher getTeacher() {
	return teacher;
  }

  public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
  }
}
