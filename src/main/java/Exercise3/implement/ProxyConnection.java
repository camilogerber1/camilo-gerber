package Exercise3.implement;

import Exercise3.Interface.ConnectionInterface;

public class ProxyConnection implements ConnectionInterface {

  private ConnectionImplementation RealConnection;

  public void ConnectToServer(DatabaseConnection conn) {

	if (RealConnection == null)
	  RealConnection = new ConnectionImplementation();

	RealConnection.ConnectToServer(conn);

  }

  public void DisconnectFromServer(DatabaseConnection conn) {

	if (RealConnection == null)
	  RealConnection = new ConnectionImplementation();

	RealConnection.DisconnectFromServer(conn);
  }
}
