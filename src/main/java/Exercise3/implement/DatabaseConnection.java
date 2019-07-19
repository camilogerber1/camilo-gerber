package Exercise3.implement;

public class DatabaseConnection {


    private boolean state;

    public String isState() { //TRANSFORM BOOLEAN VALUE INTO A STRING

        String temp = "";

        if (state) {
            return temp = "Connected";
        } else {

            temp = "Disconnected";
        }

        return temp;
    }

    public void setState(boolean state) { // SET STATE TRUE OR FALSE
        this.state = state;
    }
}
