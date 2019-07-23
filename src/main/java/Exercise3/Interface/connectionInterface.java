package Exercise3.Interface;

import Exercise3.implement.databaseConnection;

public interface connectionInterface {
  void ConnectToServer(databaseConnection conn);
  void DisconnectFromServer(databaseConnection conn);

}
