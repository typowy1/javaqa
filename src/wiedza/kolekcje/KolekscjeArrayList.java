package wiedza.kolekcje;

import model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KolekscjeArrayList {
    public static void main(String[] args) {
        //   kolekcje zbiór elementów tego samego typu, w przeciwieństwie do tablic, sa zwiększane dynamicznie
        List<String> names = new ArrayList<>(); // tablica na sterydach
        List<String> names1 = new ArrayList<>(); // tablica na sterydach

//        names.add("Bartek"); // index 0
//        names.add("Rafał");
//        names.add("Krzysiek");
//        names.add("Piotr");
//
//        names1.add("Bartek");
//        names1.add("Piotr");
//
//        System.out.println(names);
//        for (String name : names) {
//            System.out.println(name);
//        }

//        names.remove(0);
//        System.out.println(names);

//        names.remove("Bartek");
//        System.out.println(names);

//        String s = names.get(1);
//        System.out.println(s);
//        System.out.println(names.size());
//        names.isEmpty();
//        names.contains("Bartek");
//
//        names.addAll(names1); //dodanie wszystkich elementów z jednej listy do drugiej
//        System.out.println(names);
//
//        names.removeAll(names1);
//        System.out.println(names);

//        Collections.sort(names); //sortuje alfabetycznie liste
//        System.out.println(names);
//
//        Collections.reverse(names);// odwróci sortowanie
//        System.out.println(names);

        List<User> users = new ArrayList<>();
        users.add(new User("Rafal", "Testowy", "bartek@test.pl", 17));
        users.add(new User("Tomek", "Testowy1", "tomek@test.pl", 30));
        users.add(new User("Piotr", "Testowy2", "piotr@test.pl", 17));

        for (User user : users) {
            System.out.println(user.getFistName());
        }

//        Collections.sort(users, Comparator.comparing(User::getFistName)); //sortowanie obiektów po imionach, :: referencja na metode
//        System.out.println(users);

//        Collections.sort(users, Comparator.comparingInt(User::getAge)); //sortowanie obiektów po wieku, :: referencja na metode
        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed()); //sortowanie obiektów po wieku w odwrotnej kolejności

        for (User user : users) {
            System.out.println(user.getFistName() + " " + user.getAge());
        }


    }

}
