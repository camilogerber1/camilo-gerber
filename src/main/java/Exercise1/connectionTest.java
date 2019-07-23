package Exercise1;

public class connectionTest {
  public static void main(String[] args) {
	connectionSingleton sampleConn;
	//For loop for trying to connect more than once
	for (int c = 0; c < 5; c++) {
	  connectionSingleton.getInstance();
	}

  }

}




