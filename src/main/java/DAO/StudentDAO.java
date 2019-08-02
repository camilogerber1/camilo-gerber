package DAO;

import Entities.Student;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class StudentDAO extends BasicDAO<Student,String> {

  public StudentDAO(Morphia morphia, MongoClient mongo, String dbName) {
	super(mongo, morphia, dbName);

  }
}
