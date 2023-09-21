package wiedza.kolekcje;

import model.User;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class KolekcjaSet {

    public static void main(String[] args) {
//        set - zbiór unikalnych elementów, duplikaty się nie dodadzą
// nie ma gwarancji kolejności elementów

//        TreeSet - posortowane i unikalne dane

//        Set<String> names = new HashSet<>();
//
//        names.add("Bartek");
//        names.add("Marcin");
//        names.add("Tomek");
//        names.add("Jacek");
//        names.add("Bartek"); // to zostanie zignorowane

//        System.out.println(names);
//        System.out.println(names.size());

// taki zapis posortuje nam set names, czyli set names dodalismy do set sortedNames,
// możemy tak wrzucić dowolną kolekcje i set zagwarantuje że będą elementy unikalne i posortowane
//        Set<String> sortedNames = new TreeSet<>(names);
//
//        for (String sortedName : sortedNames) {
//            System.out.println(sortedName);
//        }
//
//        Set<String> sortedNames1 = new TreeSet<>(names);
//        sortedNames1.add("Bartek");
//        sortedNames1.add("Marcin");
//        sortedNames1.add("Tomek");
//        sortedNames1.add("Jacek");
//        sortedNames1.add("Bartek");
//
//        for (String s : sortedNames1) {
//            System.out.println(s);
//        }

        Set<User> users = new HashSet<>();
        users.add(new User("Rafal", "Testowy", "bartek@test.pl", 17));
        users.add(new User("Rafal", "Testowy", "bartek@test.pl", 17));
        users.add(new User("Tomek", "Testowy1", "tomek@test.pl", 30));
        users.add(new User("Piotr", "Testowy2", "piotr@test.pl", 50));
        System.out.println(users.size());

//        for (User user : users) {
//            System.out.println(user.getFistName() + " " + user.getLastName());
//        }

        Set<User> sortedUsers = new TreeSet<>(users); // w user trzeba imlementowac implements Comparable<User>
        // { // implements Comparable<User> do sortowania setów{ i nadpisac metode compareTo
        for (User sortedUser : sortedUsers) {
            System.out.println(sortedUser.getFistName() + " " + sortedUser.getLastName());
        }

    }

}
