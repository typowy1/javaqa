package model;

import java.util.Objects;

public class User implements Comparable<User> { // implements Comparable<User> do sortowania setów{
    //    1, pola obiektu opisuja z czego bedzie skladal sie obiekt
    // domyślne wartości
    private String fistName;// null
    private String lastName;// null
    private String email;// null
    private int age; //0
    private boolean isAdult;//false
    //   statyczne pole lub metoda które należą do klasy, nie do obiektu
    private static int userCounter = 0;


//    konstruktor,
//    zawsze z dużej,
//    ta sama nazwa co klasa,
//    nie ma zwracanego typu,
//    jak nie zdefiniujemy konstruktora to bedzie działał domyślny

    public User(String fistName, String lastName, String email, int age) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }


    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (email.endsWith(".ru")) {
            System.out.println("RU emails are not allowed");
        } else {
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

//   2. Metody - opisuja to co z danym obiektem będziemy mogli robić

    //metoda składa się z zwracanego typu i nazey metody
    public void getFullName() { //void typ który nic nie zwracam w tym wypadku wyświetla
        System.out.println(fistName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(fistName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() { // przy boolen dobrze zaczynac nazwe metody od is
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    //    przeciążanie metod, metoda ta sama nazwa, różne typy parametry, różna liczba parametrów
    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you");
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    public int yourAgePlusTen(int userAge) {
        return userAge + 10;
    }

    //    metody statyczne, naleza do klasy, nie do obiektu
    //metody statyczne, metody pomocnicze
    public static int getUserCounter() {
        return userCounter;
    }

    @Override
    public String toString() {
        return "User{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(fistName, user.fistName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, email, age, isAdult);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFistName().compareTo(user.getFistName()); // porównujemy 1 imie obecnego użytkownika z kolejnym użytkownikiem
        if (compareResult == 0) { // jeżeli wartość jest równa 0 czyli pierwsze imiona są takie same, 1 to wieksze, -1 mniejsze
            compareResult = this.getLastName().compareTo(user.getLastName()); //to porówmujemy nazwiska użytkowników
        }
        return compareResult;
    }
}
