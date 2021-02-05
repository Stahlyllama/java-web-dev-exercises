package exercises.ch7_technology.main;

public class SmartPhone extends Computer {

    private boolean isConnectedTo5G;

    public SmartPhone (int screenWidth, int screenHeight, String manufacturerDate, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufacturerDate);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //methods
    public boolean getIsConnectedTo5G(){ return this.isConnectedTo5G;}

    public void makePhoneCall(String number){
        System.out.println("Calling: " + number);
    }
}


