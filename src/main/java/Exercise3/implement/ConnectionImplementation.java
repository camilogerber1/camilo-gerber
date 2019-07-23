package Exercise3.implement;

import Exercise3.Interface.ConnectionInterface;

public class ConnectionImplementation implements ConnectionInterface {
  public void connectToServer(DatabaseConnection conn) { //CONNECTION IMPLEMENTATION
	conn.setState(true);
  }

  public void disconnectFromServer(DatabaseConnection conn) { //DISCONNECTION IMPLEMENTATION
	conn.setState(false);
  }
}
