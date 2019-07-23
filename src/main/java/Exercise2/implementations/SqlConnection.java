package Exercise2.implementations;

import Exercise2.interfaces.DbInterface;
//Generates a new MYSQL connection

public class SqlConnection implements DbInterface {
  private String server;
  private String usr;
  private String pass;

  public SqlConnection() {
	this.server = "mysql.server.com";
	this.usr = "ROOT-MYSQL";
	this.pass = "1234";
  }

  public void connect() {
	System.out.println("Connected to MYSQL DB as user: " + usr + " to the server: " + server);
  }

  public void disconnect() {
	System.out.println("Disconnected successfuly from MYSQL DB");
  }
}

