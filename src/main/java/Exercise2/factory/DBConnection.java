package Exercise2.factory;

import Exercise2.implementations.OracleConnection;
import Exercise2.implementations.PostgreeConnection;
import Exercise2.implementations.SQLConnection;

import Exercise2.implementations.voidConnection;
import Exercise2.interfaces.AbstractFactory;
import Exercise2.interfaces.DBinterface;

import java.util.HashMap;
import java.util.Map;

public class DBConnection implements AbstractFactory {

  final static Map<String, DBinterface> DBmap = new HashMap<>();

  static {
	DBmap.put("MYSQL", new SQLConnection());
	DBmap.put("ORACLE", new OracleConnection());
	DBmap.put("POSTGREE", new PostgreeConnection());

  }

  //choose a type of DB to be created --> Return void if no argument or invalid parameters
  public DBinterface getDB(String engine) {

	if (DBmap.containsKey(engine)) {

	  return DBmap.get(engine);
	}

	return new voidConnection();
  }

}
