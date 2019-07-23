package Exercise3.implement;

import Exercise3.Interface.connectionInterface;

public class connectionImplementation implements connectionInterface {
  public void ConnectToServer(databaseConnection conn) { //CONNECTION IMPLEMENTATION
	conn.setState(true);
  }

  public void DisconnectFromServer(databaseConnection conn) { //DISCONNECTION IMPLEMENTATION
	conn.setState(false);
  }
}
