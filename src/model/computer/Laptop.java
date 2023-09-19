package model.computer;

public class Laptop extends Computer implements Music, Video {
    //    klasa może implementować wiele interfrjsów

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram); //słówko super odnsi się do klasy matkim on jest pierwszy po nim można dodac następne pola
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
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

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();//słówko super odnsi się do klasy matkim czyli wywołujemy metode z klasy matki
        } else {
            System.out.println("Battery level to low!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("pause music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");

    }

    @Override
    public void sayHelloFrom() {
        Music.super.sayHelloFrom();
    }

    @Override
    public void playVideo() {
        System.out.println("Play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause music");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stop music");
    }
}
