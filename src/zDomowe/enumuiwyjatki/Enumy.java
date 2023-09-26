package zDomowe.enumuiwyjatki;

import model.User;
import wiedza.enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static wiedza.enums.Gender.FEMALE;
import static wiedza.enums.Gender.MALE;

public class Enumy {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Tomek", "Testowy1", "tomek@test.pl", 30, MALE));
        users.add(new User("Kasia", "Testowa", "kasia@test.pl", 20, FEMALE));
        users.add(new User("Piotr", "Testowy2", "piotr@test.pl", 44, MALE));
        users.add(new User("Asia", "Testowa2", "asia@test.pl", 30, FEMALE));
        users.add(new User("Zosia", "Testowa3", "zosia@test.pl", 19, FEMALE));

        users.stream()
                .filter(u -> u.getGender().equals(FEMALE))
                .forEach(System.out::println);

//        lub
//        List<User> collect = users.stream()
//                .filter(u -> u.getGender().equals(FEMALE))
//                .collect(Collectors.toList());
//
//        for (User user : collect) {
//            System.out.println(user);
//        }

    }
}
