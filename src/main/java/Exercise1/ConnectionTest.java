package Exercise1;

public class ConnectionTest {

  public static void main(String[] args) {
	ConnectionSingleton sampleConn;

	//For loop for trying to connect more than once
	for (int c = 0; c < 5; c++) {
	  ConnectionSingleton.getInstance();
	}

  }

}




