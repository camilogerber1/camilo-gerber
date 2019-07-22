package Exercise2.implementations;

import Exercise2.interfaces.DBinterface;

//Generates a new MYSQL connection

public class SQLConnection implements DBinterface {

  private String server;
  private String usr;
  private String pass;

  public SQLConnection() {

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

