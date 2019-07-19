package Exercise2.factory;

import Exercise2.interfaces.AbstractFactory;

//FACTORY MAKER --> Creates a new factory

public class FactoryMaker {

    public static AbstractFactory getFactory(String factory){

        if (factory.equalsIgnoreCase("DB")) return new DBConnection();

        return null;
    }
}
