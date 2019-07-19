package Exercise2.factory;

import Exercise2.implementations.OracleConnection;
import Exercise2.implementations.PostgreeConnection;
import Exercise2.implementations.SQLConnection;
import Exercise2.implementations.voidConnection;
import Exercise2.interfaces.AbstractFactory;
import Exercise2.interfaces.DBinterface;

public class DBConnection implements AbstractFactory {

//choose a type of DB to be created --> Return void if no argument or invalid parameters
    public DBinterface getDB(String engine){

        if (engine.equalsIgnoreCase("MYSQL")) return new SQLConnection();
        if (engine.equalsIgnoreCase("ORACLE")) return new OracleConnection();
        if (engine.equalsIgnoreCase("POSTGREE")) return new PostgreeConnection();

        return  new voidConnection();
    }


}
