package Exercise3.implement;

import Exercise3.Interface.connectionInterface;


/*

TOPIC 0 - EXERCISE 3

Create a proxy example for database accessor classes.

AUTHOR: CAMILO GERBER
 */

public class Main {
  public static void main(String[] args) {
	databaseConnection c = new databaseConnection();
	connectionInterface proxy = new proxyConnection(); //PROXY OBJECT
	// TESTS
	//TEST CONNECT
	System.out.println("Testing connection...");
	proxy.ConnectToServer(c);
	System.out.println("Server status: " + c.isState());
	//TEST DISCONNECT
	System.out.println("Testing disconnection...");
	proxy.DisconnectFromServer(c);
	System.out.println("Server status: " + c.isState());
  }
}
