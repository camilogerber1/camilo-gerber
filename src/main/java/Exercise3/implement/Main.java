package Exercise3.implement;

import Exercise3.Interface.ConnectionInterface;


/*

TOPIC 0 - EXERCISE 3

Create a proxy example for database accessor classes.

AUTHOR: CAMILO GERBER
 */

public class Main {
  public static void main(String[] args) {
	DatabaseConnection c = new DatabaseConnection();
	ConnectionInterface proxy = new ProxyConnection(); //PROXY OBJECT
	// TESTS
	//TEST CONNECT
	System.out.println("Testing connection...");
	proxy.connectToServer(c);
	System.out.println("Server status: " + c.isState());
	//TEST DISCONNECT
	System.out.println("Testing disconnection...");
	proxy.disconnectFromServer(c);
	System.out.println("Server status: " + c.isState());
  }
}
