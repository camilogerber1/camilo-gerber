package Exercise1;/*  TOPIC 0 - ACTIVITY 1
    Create a singleton example for a database connection.

    author: Camilo Gerber
 */

public class ConnectionSingleton{


    private static Connection conn;


    public static Connection getConnection() {

            if (conn == null){

                conn = new Connection();

            }
        System.out.println("Already connected");
        return conn;
    }



    private ConnectionSingleton() {


    }


}
