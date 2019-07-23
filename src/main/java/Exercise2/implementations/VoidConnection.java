package Exercise2.implementations;

import Exercise2.interfaces.DbInterface;
//RETURN an error because invalid/void argument

public class VoidConnection implements DbInterface {
  public void connect() {
	System.out.println("ERROR: Provider void/invalid argument");
  }

  public void disconnect() {
	System.out.println("ERROR: Provider void/invalid argument");
  }

}
