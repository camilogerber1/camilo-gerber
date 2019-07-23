package Exercise4;

public class connectionDB {
  private String user;
  private String pass;
  private String server;

  public connectionDB(String user, String pass, String server) {
	this.user = user;
	this.pass = pass;
	this.server = server;
  }

  @Override public String toString() {
	return "connectionDB{" + "user='" + user + '\'' + ", pass='" + pass + '\'' + ", server='" + server + '\'' + '}';
  }
}
