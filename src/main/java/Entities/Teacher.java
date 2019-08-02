package Entities;

import org.mongodb.morphia.annotations.Embedded;

@Embedded public class Teacher {
  private String name;
  private String lastName;

  public Teacher() {
  }

  public Teacher(String name, String lastName) {
	this.name = name;
	this.lastName = lastName;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getLastName() {
	return lastName;
  }

  public void setLastName(String lastName) {
	this.lastName = lastName;
  }
}
