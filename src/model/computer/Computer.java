package model.computer;

import java.util.Objects;

abstract public class Computer {
//    klasa abstrakcyjna, jakoś opisuje komputer ale nie jest to żaden konkretny komputer,
//    podklasy będą mogły dziedziczyć po tej klasiemm sama ta klasa nie służy do tworzenia obiektu.
//    Nie możemy utworzyć obiektu, służy do generalnego opisu z czgo będzie się składał obiekt i jakie metody będzie posiadał

    protected String name; //IS a dziedziczenie
    protected String type;
    protected Hdd hdd; // tu zachodzi relacja has A, komputer składa się z czegoś, kompozycja, więc trzeba dla tego pola założyć klasę
    protected Ram ram; // tu zachodzi relacja has A, komputer składa się z czegoś, kompozycja, więc trzeba dla tego pola założyć klasę
    protected boolean state;
    protected int volumeLevel;
//pola obiektu opisuja stan obiektu
// metody opisuja zachowanie
    public Computer(String name, String type, Hdd hdd, Ram ram) {
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

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
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

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", state=" + state +
                ", volumeLevel=" + volumeLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return state == computer.state && volumeLevel == computer.volumeLevel && Objects.equals(name, computer.name) && Objects.equals(type, computer.type) && Objects.equals(hdd, computer.hdd) && Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, hdd, ram, state, volumeLevel);
    }
}
