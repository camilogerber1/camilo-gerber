package Exercise2.interfaces;

public interface AbstractFactory {
  DbInterface getDB(String engine);
}
