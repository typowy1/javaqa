package wiedza;

import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streamy {

    public static void main(String[] args) {
//        STREAMY - strumienie wartościm, strumieniowe przetważanie wartosci


//        ["Bartek", "Antek", "Tomek"] ->steram
//        wyszukaj imiona zaczynające się na B -> stream [Bartek]
//        wyszukaj imiona które zawierają litere k -> stream ["Bartek", "Antek", "Tomek"]
//         wyświetl wszystkie elementy

//        Metody pośrednie zwarcaja nowe streamy
//        filter - filtrowanie elementów
//        map - przekształcanie elemenetów

//        Metody terminalne - są wykonywane jako ostatnie - zwracają wartość, pozwalają zebrać wartość do kolekcji
//        forEach - wyświetlanie elementów
//        nin | max | sum
//        abyMatch | allMatch | nonMatch
//        count
//        collect - zbierenie elementów

        List<String> names = new ArrayList<>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Tom");
        names.add("Franek");
        names.add("Feliks");
        names.add("Romek");
        names.add("Max");

//        names.stream()  //zamieniamy liste na stream
//                .filter(str -> str.startsWith("F"))
//                .filter(str -> str.contains("k"))
//                .filter(str -> str.endsWith("s"))
//                .forEach(str -> System.out.println(str));

//        wyrażenie lambda - funkcja króra coś zwraca, dokonuje przekształceń itd
//         str -> str.startsWith("F")

//        names.stream() //przekształcamy, zamieniamy na wielkie litery
//                .map(str -> str.toUpperCase())
//                .forEach(str -> System.out.println(str));

//        names.stream()
//                .filter(str -> str.length() <= 3)
//                .map(str -> "Short name: " + str)
//                .forEach(str -> System.out.println(str));
//
//        long count = names.stream()
//                .filter(str -> str.length() <= 3)
//                .count();
//        System.out.println(count);

// czy jaki kolwiek z elementów zawiera a, anyMatch zwraca boolena, więc tworzymy zmienna
//        boolean anyMatch = names.stream()
//                .anyMatch(s -> s.contains("a"));//czy jaki kolwiek z elementów
//        System.out.println(anyMatch);
//
////        czy długość każdego elementu jest większ niż 2
//        boolean b = names.stream()
//                .allMatch(s -> s.length() > 2); //czy wszystkie elementy
//        System.out.println(b);
//
////         zaden z elementów nie może spełniac tego warunku
//        boolean ski = names.stream()
//                .noneMatch(s -> s.endsWith("ski")); //czy zaden z elementów nie kończy się na ski
//        System.out.println(ski);

//        zbieranie elementów do nowej kolekcji, pierw filtrujemy i wynik wrzucamy do nowej kolekcji
//        List<String> fNames = names.stream()
//                .filter(s -> s.startsWith("F"))
//                .collect(Collectors.toList());
//        System.out.println(fNames);


//        sortowanie w streamach
        List<User> users =  new ArrayList<>();
        users.add(new User("Bartek", "Biały", "bartek@test.pl", 17));
        users.add(new User("Tomek", "Czarny", "tomek@test.pl", 17));
        users.add(new User("Marcin", "Niebieski", "marcin@test.pl", 30));
        users.add(new User("Jacek", "Fioletowy", "jacek@test.pl", 30));
        users.add(new User("Asia", "Zielona", "asia@test.pl", 30));
        users.add(new User("Asia", "Zielona", "asia@test.pl", 11));
        users.add(new User("Asia", "Biała", "asia@test.pl", 30));
        users.add(new User("Marta", "Czarna", "marta@test.pl", 30));
        users.add(new User("Kasia", "Pomarańczowa", "kasia@test.pl", 30));

        // User::getAge referencja na metody, pierw sortujemy po imieniu, potem po nazwisku potem po wieku
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFistName).thenComparing(User::getLastName).thenComparing(User::getAge))
                .collect(Collectors.toList());

        for (User user : sortedUsers) {
            System.out.println(user.getFistName() + " " + user.getLastName() + " " + user.getAge());
        }

    }
}
