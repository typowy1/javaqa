public class User {
    //    1, pola obiektu opisuja z czego bedzie skladal sie obiekt
    // domyślne wartości
    String fistName;// null
    String lastName;// null
    String email;// null
    int age; //0
    boolean isAdult;//false

//    konstruktor,
//    zawsze z dużej,
//    ta sama nazwa co klasa,
//    nie ma zwracanego typu,
//    jak nie zdefiniujemy konstruktora to bedzie działał domyślny

    User(String fistName, String lastName,  String email, int age){
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

//   2. Metody - opisuja to co z danym obiektem będziemy mogli robić

    //metoda składa się z zwracanego typu i nazey metody
    void getFullName() { //void typ który nic nie zwracam w tym wypadku wyświetla
        System.out.println(fistName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(fistName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() { // przy boolen dobrze zaczynac nazwe metody od is
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    //    przeciążanie metod, metoda ta sama nazwa, różne typy parametry, różna liczba parametrów
    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you");
    }

    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see you");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    int yourAgePlusTen(int userAge) {
        return userAge + 10;
    }

}
