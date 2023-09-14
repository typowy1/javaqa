public class MainApp {

    public static void main(String[] args) {

        // tworzymy obiekt przez wywołanie konstruktora, jeśli nie utworzymy konstruktora to zostanie utworzony domyślny

        User rafal = new User("Rafal", "Testowy", "bartek@test.pl", 17);
        rafal.getAllInfo();

        User tomek = new User("Tomek", "Testowy1", "tomek@test.pl", 30);
        tomek.getAllInfo();



    }
}
