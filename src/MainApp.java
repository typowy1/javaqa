public class MainApp {

    public static void main(String[] args) {

        User rafal = new User();
        rafal.fistName = "Bartek";
        rafal.lastName = "Testowy";
        rafal.email = "bartek@test.pl";
        rafal.age = 17;
        rafal.isAdult = false;
        System.out.println(rafal.fistName);

        User tomek = new User();
        tomek.fistName = "Tomek";
        tomek.lastName = "Testowy";
        tomek.email = "tomek@test.pl";
        tomek.age = 30;
        tomek.isAdult = true;
        System.out.println(tomek.fistName);
    }
}
