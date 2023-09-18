import model.computer.Laptop;
import model.computer.PC;

public class ComputerMainApp {

    //    1. IS a - jest czymś - dziedziczenie
//    2. Has a - posiada cos - kompozycja
    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

//        officeComputer.showComputerName();
//
//        gamingLaptop.setBatteryLevel(0);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getState());


    }
}
