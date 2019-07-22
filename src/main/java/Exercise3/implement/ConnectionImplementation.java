package Exercise3.implement;

import Exercise3.Interface.ConnectionInterface;

public class ConnectionImplementation implements ConnectionInterface {

  public void ConnectToServer(DatabaseConnection conn) { //CONNECTION IMPLEMENTATION

	conn.setState(true);

  }

  public void DisconnectFromServer(DatabaseConnection conn) { //DISCONNECTION IMPLEMENTATION

	conn.setState(false);

  }
}
