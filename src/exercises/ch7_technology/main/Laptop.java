package exercises.ch7_technology.main;

public class Laptop extends Computer{

    //Class Variables(properties)
    private boolean isIntelliJOpen;

    //Constructors
public Laptop (int screenWidth, int screenHeight, String manufacturerDate) {
    super(screenWidth, screenHeight, manufacturerDate);
    this.isIntelliJOpen = false;
}   //Overloading Constructors
public Laptop (int screenWidth, int screenHeight, String manufacturerDate, boolean isIntelliJOpen) {
    super(screenWidth, screenHeight, manufacturerDate);
    this.isIntelliJOpen = isIntelliJOpen;
    }

    // Methods (Getters and Setters)
public boolean getIsIntelliJOpen(){return this.isIntelliJOpen;}

public boolean setIsIntelliJOpen(boolean isIntelliJOpen){return this.isIntelliJOpen = isIntelliJOpen;}

public void openIntelliJ(){
    this.isIntelliJOpen = true;
    System.out.println("IntelliJ is now open!");
    }
}