package Exercise3.implement;

import Exercise3.Interface.connectionInterface;

public class proxyConnection implements connectionInterface {
  private connectionImplementation RealConnection;

  public void ConnectToServer(databaseConnection conn) {
	if (RealConnection == null)
	  RealConnection = new connectionImplementation();
	RealConnection.ConnectToServer(conn);

  }

  public void DisconnectFromServer(databaseConnection conn) {
	if (RealConnection == null)
	  RealConnection = new connectionImplementation();
	RealConnection.DisconnectFromServer(conn);
  }
}
