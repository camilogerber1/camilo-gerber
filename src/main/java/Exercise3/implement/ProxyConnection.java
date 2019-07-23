package Exercise3.implement;

import Exercise3.Interface.ConnectionInterface;

public class ProxyConnection implements ConnectionInterface {
  private ConnectionImplementation realConnection;

  public void connectToServer(DatabaseConnection conn) {
	if (realConnection == null)
	  realConnection = new ConnectionImplementation();
	realConnection.connectToServer(conn);

  }

  public void disconnectFromServer(DatabaseConnection conn) {
	if (realConnection == null)
	  realConnection = new ConnectionImplementation();
	realConnection.disconnectFromServer(conn);
  }
}
