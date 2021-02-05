package exercises.ch7_technology.main;

public class Program {
    public static void main(String[] args) {
        exercises.ch7_technology.main.SmartPhone mySmartPhone = new SmartPhone(1504,500, "1980", true);
        mySmartPhone.makePhoneCall("812-477-7174");
        int result = mySmartPhone.processTwoPlusTwo();
        System.out.println("The result is: " + result);
        System.out.println(mySmartPhone.getId());

        exercises.ch7_technology.main.Laptop myLaptop = new Laptop(1684,456,"2021", true);
        myLaptop.openIntelliJ();
        int result2 = myLaptop.processTwoPlusTwo();
        System.out.println("The result is: " + result2);
        System.out.println(myLaptop.getId());


        exercises.ch7_technology.main.Computer myComputer = new Computer(2121, 811, "2021");
        int result3 = myComputer.processTwoPlusTwo();
        System.out.println("The result is: " + result3);
        System.out.println(myComputer.getId());
    }
}