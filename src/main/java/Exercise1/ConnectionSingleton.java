package Exercise1;/*  TOPIC 0 - ACTIVITY 1
    Create a singleton example for a database connection.

    author: Camilo Gerber
 */

public class ConnectionSingleton {
  private ConnectionSingleton() {
	System.out.println("Connected successfully");
  }

  private static class Connection {
	static final ConnectionSingleton conn = new ConnectionSingleton(); //Initialization-on-demand
  }

  public static ConnectionSingleton getInstance() {
	return Connection.conn;
  }
}


