import model.User;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        // tworzymy obiekt przez wywołanie konstruktora, jeśli nie utworzymy konstruktora to zostanie utworzony domyślny

        User rafal = new User("Rafal", "Testowy", "bartek@test.pl", 17);
        User rafal1 = new User("Rafal", "Testowy", "bartek@test.pl", 17);
        rafal.getAllInfo();

        User tomek = new User("Tomek", "Testowy1", "tomek@test.pl", 30);
        tomek.getAllInfo();

        System.out.println(rafal);
        System.out.println(rafal.equals(rafal1));
//        System.out.println(User.getUserCounter());
//
//
//        String text = StringUtils.getFormattedText("ddjkdjdbvjhvvjv");
//        System.out.println(text);
//
//        System.out.println(WeekUtils.MONDAY);

        List<User> userList = new ArrayList<>();


    }
}
