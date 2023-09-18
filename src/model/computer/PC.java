package model.computer;

public class PC extends Computer {

    private boolean isPowerSupply;


    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram); //słówko super odnsi się do klasy matki, czyli odnosi sie do konstruktora z klasy matki
        this.isPowerSupply = false;
    }

    public void showComputerName(){
        System.out.println(name);
    }

    @Override //klasa dziecko nadpisuje metode z klasy matki
    public void switchOn() {
        System.out.println("Checking power supply");
        if(isPowerSupply){ //iff sprawsza czy jest true i jesli jest yo wykona, nie trzeba porównywac
            super.switchOn();//słówko super odnsi się do klasy matkim czyli wywołujemy metode z klasy matki
        } else {
            System.out.println("Power supply missing!");
        }
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }


}
