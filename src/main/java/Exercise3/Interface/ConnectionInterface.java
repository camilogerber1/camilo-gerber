package Exercise3.Interface;

import Exercise3.implement.DatabaseConnection;

public interface ConnectionInterface {

  void ConnectToServer(DatabaseConnection conn);

  void DisconnectFromServer(DatabaseConnection conn);

}
