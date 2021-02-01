package exercises.ch7_technology.main;

public class Computer extends exercises.ch7_technology.main.AbstractEntity {
    //variables
    private int screenWidth;
    private int screenHeight;
    private String manufacturerDate;


    //constructors
    public Computer(int screenWidth, int screenHeight, String manufacturerDate){
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufacturerDate = manufacturerDate;
    }

    //methods
    public int getScreenWidth(){return this.screenWidth;}
    public int getScreenHeight(){return this.screenHeight;}
    public String getManufacturerDate(){return this.manufacturerDate;}

    public int processTwoPlusTwo() {
        return 2+2;
    }
    public void tellMeAJoke(){
        System.out.println("why did the computer show up at work late?  It was a hard drive.");
    }
}
