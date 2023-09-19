package model.computer;

public class PC extends Computer {

    private boolean isPowerSupply;


    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram); //słówko super odnsi się do klasy matki, czyli odnosi sie do konstruktora z klasy matki
        this.isPowerSupply = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;

    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;

    }

    @Override //klasa dziecko nadpisuje metode z klasy matki
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) { //iff sprawsza czy jest true i jesli jest yo wykona, nie trzeba porównywac
            super.switchOn();//słówko super odnsi się do klasy matkim czyli wywołujemy metode z klasy matki
        } else {
            System.out.println("Power supply missing!");
        }
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }
}
