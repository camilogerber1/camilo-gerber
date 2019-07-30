package DBConnection;

import java.sql.*;

/**
 * Author: Camilo Gerber
 *
 * Globant Bootcamp - TOPIC 4
 *
 * Exercise: Connect to MySQL using Java JDBC and perform the query you have developed in exercise 5
 */

public class ConnectDB {

  public static void main(String[] args) {
	try {
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/high-school", "root", "");
	  Statement myStatement = conn.createStatement();
	  int teacherID = 3;
	  String query =
			  "SELECT concat(teacher.name,' ',teacher.lastName) as Teacher, concat(days.name,' ',weekSchedule.startTime,' - ', weekSchedule.finishTime,': ',course.name) as Schedule from teacher, days, weekSchedule, course WHERE teacher.id = "
					  + teacherID
					  + " and weekSchedule.day = days.id AND weekSchedule.course = course.id AND course.teacher = teacher.id ORDER BY day";
	  ResultSet myResultSet = myStatement.executeQuery(query);
	  while (myResultSet.next()) {
		System.out.println("Teacher: " + myResultSet.getString("Teacher"));
		System.out.println("Schedule: ");
		System.out.println(myResultSet.getString("Schedule"));
	  }

	} catch (Exception e) {
	  System.out.println("CONNECTION ERROR");
	  e.printStackTrace();
	}
  }

}
