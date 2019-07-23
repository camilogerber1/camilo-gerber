package Exercise1;/*  TOPIC 0 - ACTIVITY 1
    Create a singleton example for a database connection.

    author: Camilo Gerber
 */

public class connectionSingleton {
  private connectionSingleton() {
	System.out.println("Connected successfully");
  }

  private static class Connection {
	static final connectionSingleton conn = new connectionSingleton(); //Initialization-on-demand
  }

  public static connectionSingleton getInstance() {
	return Connection.conn;
  }
}


