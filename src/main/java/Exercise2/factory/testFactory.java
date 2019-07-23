/*  TOPIC 0 - ACTIVITY 1
    Create an abstract factory example for the different type of SQL connections.

    author: Camilo Gerber
 */


package Exercise2.factory;

import Exercise2.interfaces.abstractFactory;
import Exercise2.interfaces.dbInterface;

public class testFactory {
  public static void main(String[] args) {
	abstractFactory DBFactory = factoryMaker.getFactory("DB");
	dbInterface DB1 = DBFactory.getDB("MYSQL");
	abstractFactory DBFactory2 = factoryMaker.getFactory("DB");
	dbInterface DB2 = DBFactory2.getDB("ORACLE");
	abstractFactory DBFactory3 = factoryMaker.getFactory("DB");
	dbInterface DB3 = DBFactory3.getDB("POSTGREE");
	abstractFactory DBFactory4 = factoryMaker.getFactory("DB");
	dbInterface DB4 = DBFactory4.getDB("Invalid Argument");
	abstractFactory DBFactory5 = factoryMaker.getFactory("DB");
	dbInterface DB5 = DBFactory5.getDB(""); //VOID
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
