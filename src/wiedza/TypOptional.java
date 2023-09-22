package wiedza;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class TypOptional {
    public static void main(String[] args) {
        // Optional  - opakowanie dla obiektu
        //Optional [obiekt] / Optional []
        //Zabezpieczenie przed null'amii wyjątkamu null pionter

        List<User> users = new ArrayList<>();
        users.add(new User("Bartek", "Biały", "bartek@test.pl", 17));
        users.add(new User("Tomek", "Czarny", "tomek@test.pl", 17));
        users.add(new User("Marcin", "Niebieski", "marcin@test.pl", 30));
        users.add(new User("Jacek", "Fioletowy", "jacek@test.pl", 30));
        users.add(new User("Asia", "Biała", "asia@test.pl", 30));
        users.add(new User("Marta", "Czarna", "marta@test.pl", 30));
        users.add(new User("Kasia", "Pomarańczowa", "kasia@test.pl", 50));

//        max
//        Optional<User> max = users.stream()
//                .max(Comparator.comparingInt(User::getAge));

//        wyciągnięcie elementu z optionala

//        if(max.isPresent()){
//            System.out.println(max.get());
//        } else {
//            System.out.println("nie znalazlem takiego elementu");
//        }

//        String kasia = users.stream()
//                .map(User::getFistName) //, zaminiamy na stream który sklada sie z imion, operujemy tylko na imionach a nie na całych użytkownikach
//                .filter(s -> s.equals("Kasia"))//czy mamy jaką kolwiek Kasie
//                .findFirst()// czy mamy jaką kolwiek pierwszą kasie
//                .orElse("Kasia nie istnieje na liscie");// jak nie znajdziemy to swrócimy jakąś wartosć
//        System.out.println(kasia);

//        drugi sposób na wyszukabue max
//        Integer age = users.stream()
//                .map(User::getAge)
//                .max(Integer::compareTo)
//                .orElse(-1);
//        System.out.println(age);

//        interfejs funkcyjny
//        predicate - pobiera jedna wartosc i zwraca boolean
//        consumer - pobiera jedna wartosc i nic nie zwraca
//        supplier - dostarcza wartosc

//
//      orElseGet
//        User bartek = users.stream()
//                .filter(user -> user.getFistName().startsWith("B")) //szukamy użytkownika którego imie zaczyna sie na b
//                .findFirst() //jak znajdziemy to zwracamy pierwszego uzytkownika,
//                .orElseGet(() -> new User("Bartek", "Biały", "bartek@test.pl", 17));// jak nie to tworzymy nowego użytkownika
//        System.out.println(bartek);

//   orElseThrow //tworzymy wyjątek jak nie spełni warunku
//        User bartek = users.stream()
//                .filter(user -> user.getFistName().startsWith("g")) //szukamy użytkownika którego imie zaczyna sie na b
//                .findFirst() //jak znajdziemy to zwracamy pierwszego uzytkownika,
//                .orElseThrow(() -> new IllegalArgumentException("Na liscie nie ma usera który zaczyna się na litere g"));// jak nie znajdziemy to rzucamy wyjątek
//        System.out.println(bartek);

// ifPresent nic nie zwracam mozna np wyswietlic
//        users.stream()
//                .filter(user -> user.getFistName().startsWith("B")) //szukamy użytkownika którego imie zaczyna sie na b
//                .findFirst()
//                .ifPresent(System.out::println);

//        ifPresentOrElsem jesli nie ma to mozemy np wyświetkić na konsole użytkownika
        users.stream()
                .filter(user -> user.getFistName().startsWith("b")) //szukamy użytkownika którego imie zaczyna sie na b
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma takiego użytkownika"));




    }
}
