package Exercise2.implementations;

import Exercise2.interfaces.dbInterface;
//Generates a new MYSQL connection

public class sqlConnection implements dbInterface {
  private String server;
  private String usr;
  private String pass;

  public sqlConnection() {
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

