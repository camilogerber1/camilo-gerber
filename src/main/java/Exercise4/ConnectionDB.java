package Exercise4;



public class ConnectionDB {

    private String user;
    private String pass;
    private String server;

    public ConnectionDB(String user, String pass, String server) {
        this.user = user;
        this.pass = pass;
        this.server = server;
    }

    @Override
    public String toString() {
        return "ConnectionDB{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", server='" + server + '\'' +
                '}';
    }
}
