package Exercise2.factory;

import Exercise2.implementations.OracleConnection;
import Exercise2.implementations.PostgreeConnection;
import Exercise2.implementations.SqlConnection;
import Exercise2.implementations.VoidConnection;
import Exercise2.interfaces.AbstractFactory;
import Exercise2.interfaces.DbInterface;

import java.util.HashMap;
import java.util.Map;

public class DbConnection implements AbstractFactory {
  final static Map<String, DbInterface> DBmap = new HashMap<>();

  static {
	DBmap.put("MYSQL", new SqlConnection());
	DBmap.put("ORACLE", new OracleConnection());
	DBmap.put("POSTGREE", new PostgreeConnection());

  }

  //choose a type of DB to be created --> Return void if no argument or invalid parameters
  public DbInterface getDB(String engine) {
	if (DBmap.containsKey(engine)) {
	  return DBmap.get(engine);
	}
	return new VoidConnection();
  }

}
