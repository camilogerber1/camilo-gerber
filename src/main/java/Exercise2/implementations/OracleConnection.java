package Exercise2.implementations;

import Exercise2.interfaces.DBinterface;

//Generates a new ORACLE DB connection

public class OracleConnection implements DBinterface {
  private String server;
  private String usr;
  private String pass;

  public OracleConnection() {
	this.server = "oracle.server.com";
	this.usr = "ROOT-ORACLE";
	this.pass = "1234";
  }

  public void connect() {

	System.out.println("Connected to ORACLE DB as user: " + usr + " to the server: " + server);

  }

  public void disconnect() {

	System.out.println("Disconnected successfuly from ORACLE DB");
  }
}
