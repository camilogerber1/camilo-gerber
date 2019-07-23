package Exercise4;

/*


Create a builder example for a database connection.

AUTHOR: CAMILO GERBER

 */

public class ConnectionBuilder {
  private String user;
  private String pass;
  private String server;

  public ConnectionBuilder setUser(String user) {
	this.user = user;
	return this;
  }

  public ConnectionBuilder setPass(String pass) {
	this.pass = pass;
	return this;
  }

  public ConnectionBuilder setServer(String server) {
	this.server = server;
	return this;
  }

  public ConnectionDB getConnection() {
	return new ConnectionDB(user, pass, server);
  }
}
