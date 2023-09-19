package model.computer;

abstract public class Computer {
//    klasa abstrakcyjna, jakoś opisuje komputer ale nie jest to żaden konkretny komputer,
//    podklasy będą mogły dziedziczyć po tej klasiemm sama ta klasa nie służy do tworzenia obiektu.
//    Nie możemy utworzyć obiektu, służy do generalnego opisu z czgo będzie się składał obiekt i jakie metody będzie posiadał

    protected String name;
    protected String type;
    protected int hdd;
    protected int ram;
    protected boolean state;
    protected int volumeLevel;


    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        state = true;
    }

    public void switchOff() {
        System.out.println("Wyłącz komputer: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }

    public abstract int volumeUp(); // metody abstrakcyjne nie maja ciała czyli {}, jest to tylko szkic,
    // metoda zawsze musi być publiczna

    public abstract int volumeDown();

    public abstract int volumeUp(int newVolumeLevel);

    public abstract int volumeDown(int newVolumeLevel);

}
