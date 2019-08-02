import DAO.StudentDAO;
import Entities.Student;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;

/**
 *
 * Java Bootcamp - Globant
 *
 * Author: Camilo Gerber
 *
 * Create a new project using Maven and Morphia to map the objects created in 1. Create the necessary DAOs to get the same result than 2.
 */
public class Test {

  public static void main(String[] args) {
	MongoClient mongo = new MongoClient("localhost", 27017);
	Morphia morphia = new Morphia();
	Datastore ds = morphia.createDatastore(mongo, "high-school");
	morphia.map(Student.class);
	String dbName = "high-school";
	StudentDAO studentDAO = new StudentDAO(morphia, mongo, dbName);
	//QUERY
	Query<Student> query = ds.createQuery(Student.class);
	query.and(query.criteria("courses.name").equal("Physics"), query.criteria("courses.notes.finalNote").greaterThan(4));
	QueryResults<Student> retrievedStudents = studentDAO.find(query);
	System.out.println("students whose notes in a specific course were greater than 4.\n");
	for (Student retrievedStudent : retrievedStudents) {
	  System.out.println(
			  retrievedStudent.getName() + " " + retrievedStudent.getLastName() + " -  Final note: " + retrievedStudent.getCourses().get(0)
					  .getNotes().getFinalNote());
	}

  }
}
