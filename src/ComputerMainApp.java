import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class ComputerMainApp {

    //    1. IS a - jest czymś - dziedziczenie
//    2. Has a - posiada cos - kompozycja
//    dziedziczenie - matka jest tylko jedne, dzidziczymy tylko po jednej klasie
//    polimorfizm - wiele form, do jednego typu zmiennej czyli jednego typu referencji możemy ptzypisać wiele form, obiekty z różnych klas,
//    np computer, lub laptop, lub pcm  Computer officeComputer2 = new PC
//    klasa może implementować wiele interfrjsów
    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office computer1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer2", "HP", 500, 128);
        PC officeComputer3 = new PC("Office computer3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
        Laptop macbook = new Laptop("MB PRO", "PRO", 500, 256, 100);
//polimorfizm
        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        ((PC)officeComputer2).showComputerName(); // rzutowanie na inny typ, zamiana typu referencji

        macbook.playMusic();
        macbook.pauseMusic();
        macbook.stopMusic();
        macbook.sayHelloFrom();
        macbook.playVideo();
        macbook.pauseVideo();
        macbook.stopVideo();
        macbook.sayHelloFrom();




//        System.out.println(officeComputer1.volumeUp());
//        System.out.println(officeComputer1.volumeUp());
//
//        System.out.println(officeComputer1.volumeDown());
//        System.out.println(officeComputer1.volumeDown());
//        System.out.println(officeComputer1.volumeDown());

//        System.out.println("laptop");
//        System.out.println(gamingLaptop.getVolumeLevel());
//        System.out.println(gamingLaptop.volumeUp(50));
//        System.out.println(gamingLaptop.volumeUp(100));
//        System.out.println(gamingLaptop.getVolumeLevel());
//
//        System.out.println(gamingLaptop.volumeDown(50));
//        System.out.println(gamingLaptop.volumeDown(100));
//
//        System.out.println("PC");
//        System.out.println(gamingLaptop.getVolumeLevel());
//        System.out.println(officeComputer1.volumeUp(50));
//        System.out.println(officeComputer1.volumeUp(100));
//        System.out.println(gamingLaptop.getVolumeLevel());
//
//        System.out.println(officeComputer1.volumeDown(50));
//        System.out.println(officeComputer1.volumeDown(100));



//        officeComputer1.switchOn();
//        System.out.println(officeComputer1.getState());
//        officeComputer1.setPowerSupply(true);
//        officeComputer1.switchOn();
//        System.out.println(officeComputer1.getState());

//        officeComputer.showComputerName();
//
//        gamingLaptop.setBatteryLevel(0);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getState());


    }
}
