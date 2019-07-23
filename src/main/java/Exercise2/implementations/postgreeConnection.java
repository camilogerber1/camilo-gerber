package Exercise2.implementations;

import Exercise2.interfaces.dbInterface;

//Generates a new POSTGREE connection
public class postgreeConnection implements dbInterface {
  private String server;
  private String usr;
  private String pass;

  public postgreeConnection() {
	this.server = "postgree.server.com";
	this.usr = "POSTGREE-ROOT";
	this.pass = "1234";
  }

  public void connect() {
	System.out.println("Connected to POSTGREE DB as user: " + usr + " to the server: " + server);
  }

  public void disconnect() {
	System.out.println("Disconnected successfuly from POSTGREE DB");
  }
}
