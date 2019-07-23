package Exercise2.factory;

import Exercise2.interfaces.abstractFactory;
//FACTORY MAKER --> Creates a new factory

public class factoryMaker {
  public static abstractFactory getFactory(String factory) {
	if (factory.equalsIgnoreCase("DB"))
	  return new dbConnection();
	return null;
  }
}
