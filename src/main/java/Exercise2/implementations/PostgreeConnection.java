package Exercise2.implementations;

import Exercise2.interfaces.DBinterface;
//Generates a new POSTGREE connection
public class PostgreeConnection implements DBinterface {

    private String server;
    private String usr;
    private String pass;

    public PostgreeConnection() {
        this.server = "postgree.server.com";
        this.usr = "POSTGREE-ROOT";
        this.pass = "1234";
    }

    public void connect(){

        System.out.println("Connected to POSTGREE DB as user: " + usr + " to the server: " + server);
    }

    public void disconnect(){

        System.out.println("Disconnected successfuly from POSTGREE DB");
    }
}
