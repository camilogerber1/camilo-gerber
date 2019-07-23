package Exercise3.Interface;

import Exercise3.implement.DatabaseConnection;

public interface ConnectionInterface {
  void connectToServer(DatabaseConnection conn);
  void disconnectFromServer(DatabaseConnection conn);

}
