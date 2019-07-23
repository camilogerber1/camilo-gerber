package Exercise2.factory;

import Exercise2.implementations.oracleConnection;
import Exercise2.implementations.postgreeConnection;
import Exercise2.implementations.sqlConnection;
import Exercise2.implementations.voidConnection;
import Exercise2.interfaces.abstractFactory;
import Exercise2.interfaces.dbInterface;

import java.util.HashMap;
import java.util.Map;

public class dbConnection implements abstractFactory {
  final static Map<String, dbInterface> DBmap = new HashMap<>();

  static {
	DBmap.put("MYSQL", new sqlConnection());
	DBmap.put("ORACLE", new oracleConnection());
	DBmap.put("POSTGREE", new postgreeConnection());

  }

  //choose a type of DB to be created --> Return void if no argument or invalid parameters
  public dbInterface getDB(String engine) {
	if (DBmap.containsKey(engine)) {
	  return DBmap.get(engine);
	}
	return new voidConnection();
  }

}
