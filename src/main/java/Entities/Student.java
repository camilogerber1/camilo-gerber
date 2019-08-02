package Entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import java.util.List;

@Entity (value = "students",noClassnameStored = true)
public class Student {
  @Id private ObjectId id;
  private String name;
  private String lastName;
  @Embedded
  private List<Course> courses;

  public Student (){}

  public Student(ObjectId id, String name, String lastName, List<Course> course) {
	this.id = id;
	this.name = name;
	this.lastName = lastName;
	this.courses = course;
  }

  public ObjectId getId() {
	return id;
  }

  public void setId(ObjectId id) {
	this.id = id;
  }

  public void setName(String name) {
	this.name = name;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }

  public List<Course> getCourses() {
	return courses;
  }

  public void setCourses(List<Course> courses) {
	this.courses = courses;
  }

  public String getName() {
	return name;
  }



  public String getLastName() {
	return lastName;
  }




}
