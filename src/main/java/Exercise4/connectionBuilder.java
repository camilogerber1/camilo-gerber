package Exercise4;

/*


Create a builder example for a database connection.

AUTHOR: CAMILO GERBER

 */

public class connectionBuilder {
  private String user;
  private String pass;
  private String server;

  public connectionBuilder setUser(String user) {
	this.user = user;
	return this;
  }

  public connectionBuilder setPass(String pass) {
	this.pass = pass;
	return this;
  }

  public connectionBuilder setServer(String server) {
	this.server = server;
	return this;
  }

  public connectionDB getConnection() {
	return new connectionDB(user, pass, server);
  }
}
