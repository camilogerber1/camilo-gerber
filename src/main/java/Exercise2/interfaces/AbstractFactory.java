package Exercise2.interfaces;

public interface AbstractFactory {

  DBinterface getDB(String engine);

}
