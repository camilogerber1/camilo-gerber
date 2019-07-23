package Exercise4;

public class Test {
  public static void main(String[] args) {
	connectionDB c = new connectionBuilder().setPass("1234").setServer("www.example.com").setUser("root").getConnection();
	System.out.println(c);

  }

}
