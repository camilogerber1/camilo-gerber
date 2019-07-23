/*  TOPIC 0 - ACTIVITY 1
    Create an abstract factory example for the different type of SQL connections.

    author: Camilo Gerber
 */


package Exercise2.factory;

import Exercise2.interfaces.AbstractFactory;
import Exercise2.interfaces.DbInterface;

public class TestFactory {
  public static void main(String[] args) {
	AbstractFactory DBFactory = FactoryMaker.getFactory("DB");
	DbInterface DB1 = DBFactory.getDB("MYSQL");
	AbstractFactory DBFactory2 = FactoryMaker.getFactory("DB");
	DbInterface DB2 = DBFactory2.getDB("ORACLE");
	AbstractFactory DBFactory3 = FactoryMaker.getFactory("DB");
	DbInterface DB3 = DBFactory3.getDB("POSTGREE");
	AbstractFactory DBFactory4 = FactoryMaker.getFactory("DB");
	DbInterface DB4 = DBFactory4.getDB("Invalid Argument");
	AbstractFactory DBFactory5 = FactoryMaker.getFactory("DB");
	DbInterface DB5 = DBFactory5.getDB(""); //VOID
	DB1.connect();
	DB1.disconnect();
	DB2.connect();
	DB2.disconnect();
	DB3.connect();
	DB3.disconnect();
	DB4.connect();
	DB4.disconnect();
	DB5.connect();
	DB5.disconnect();
  }

}
